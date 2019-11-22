package typings.mendixmodelsdk

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalElementsMod.Element
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesPartPropertyMod extends js.Object {
  @js.native
  class PartProperty[T /* <: Element */] () extends AbstractProperty[T | Null, IObservableValue[T | Null]] {
    var hasDefaultValue: Boolean = js.native
    @JSName("parent")
    var parent_PartProperty: AbstractElement = js.native
    def detachValue(): Unit = js.native
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def updateElementContainer(unit: ModelUnit): Unit = js.native
    def updateWithRawValue(): Unit = js.native
    def updateWithRawValue(value: IAbstractElementJson): Unit = js.native
  }
  
}

