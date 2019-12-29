package typings.mendixmodelsdk

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.distSdkUtilsMod.utils.IMap
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesLocalByNameReferencePropertyMod extends js.Object {
  @js.native
  trait INamedElement extends IElement {
    var name: String = js.native
  }
  
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement,
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
    @JSName("parent")
    var parent_LocalByNameReferenceProperty: AbstractElement = js.native
    def deepCopyInto(clone: Structure): Unit = js.native
    def deepCopyInto(clone: Structure, idMap: IMap[Structure]): Unit = js.native
    def localName(): String | Null = js.native
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def targetType(): String = js.native
    def updateWithRawValue(value: String): Unit = js.native
  }
  
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
}

