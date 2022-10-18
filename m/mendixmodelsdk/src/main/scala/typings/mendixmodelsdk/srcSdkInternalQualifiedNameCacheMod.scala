package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalQualifiedNameCacheMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/QualifiedNameCache", "QualifiedNameCache")
  @js.native
  open class QualifiedNameCache protected () extends StObject {
    def this(_model: AbstractModel) = this()
    
    /**
      * Updates the cache as far as it is affected by the addition or rename of this element.
      * Child entries are updated automatically as well.
      */
    def addStructureToCache(structure: IStructure): Unit = js.native
    
    def keys(): js.Array[String] = js.native
    
    def observe(listener: js.Function1[/* names */ js.Array[String], Unit]): js.Function0[Unit] = js.native
    
    /**
      * Removes the structure and its children from the cache.
      */
    def removeStructureFromCache(structure: IStructure): Unit = js.native
    
    /**
      * @param structureTypeName        type name in syntax "MetaModelname$ElementName"
      * @param qualifiedName
      * @returns The element found, or `null` when no element is found.
      */
    def resolve(structureTypeName: String): IAbstractElement | Null = js.native
    def resolve(structureTypeName: String, qualifiedName: String): IAbstractElement | Null = js.native
    
    def size(): Double = js.native
  }
}
