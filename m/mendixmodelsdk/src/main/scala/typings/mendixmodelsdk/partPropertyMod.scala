package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.unitsMod.ModelUnit
import typings.mobx.observablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartProperty", JSImport.Namespace)
@js.native
object partPropertyMod extends js.Object {
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

