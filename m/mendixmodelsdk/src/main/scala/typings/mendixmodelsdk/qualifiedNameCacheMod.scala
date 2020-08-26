package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.elementsMod.IAbstractElement
import typings.mendixmodelsdk.structuresMod.IStructure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/QualifiedNameCache", JSImport.Namespace)
@js.native
object qualifiedNameCacheMod extends js.Object {
  @js.native
  class QualifiedNameCache protected () extends js.Object {
    def this(_model: AbstractModel) = this()
    /**
      * Updates the cache as far as it is affected by the addition or rename of this element.
      * Child entries are updated automatically as well.
      */
    def addStructureToCache(structure: IStructure): Unit = js.native
    def keys(): js.Array[String] = js.native
    def observe(listener: js.Function0[Unit]): Unit = js.native
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

