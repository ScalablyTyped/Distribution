package typings.mendixmodelsdk.distSdkInternalPropertiesByDashNameDashReferenceMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/by-name-reference", "ByNameReferenceProperty")
@js.native
class ByNameReferenceProperty[T /* <: IAbstractElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
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
  var parent_ByNameReferenceProperty: AbstractElement = js.native
  val targetType: String = js.native
  def qualifiedName(): String | Null = js.native
  def set(): Unit = js.native
  def set(newValue: T): Unit = js.native
  def updateWithRawValue(value: String): Unit = js.native
}

