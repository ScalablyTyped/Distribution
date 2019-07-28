package typings.mendixmodelsdk.distSdkInternalPropertiesLocalDashByDashNameDashReferenceMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.distSdkUtilsMod.utilsNs.IMap
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/local-by-name-reference", "LocalByNameReferenceProperty")
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
  val targetType: String = js.native
  def deepCopyInto(clone: Structure): Unit = js.native
  def deepCopyInto(clone: Structure, idMap: IMap[Structure]): Unit = js.native
  def localName(): String | Null = js.native
  def set(): Unit = js.native
  def set(newValue: T): Unit = js.native
  def updateWithRawValue(value: String): Unit = js.native
}

