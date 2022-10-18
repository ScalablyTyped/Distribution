package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalByIdReferenceMod.ByIdReference
import typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesByIdReferencePropertyMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/ByIdReferenceProperty", "ByIdReferenceProperty")
  @js.native
  open class ByIdReferenceProperty[T /* <: AbstractElement[IAbstractModel, Container] */] protected () extends AbstractProperty[T | Null, ByIdReference[T]] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: Any*
    ) = this()
    
    @JSName("parent")
    var parent_ByIdReferenceProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def resolveReference(): Unit = js.native
    
    def set(): Unit = js.native
    def set(value: T): Unit = js.native
    
    def updateElementContainer(): Unit = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
}
