package typings.mendixmodelsdk.customwidgetsMod.customwidgets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetProperty")
@js.native
class WidgetProperty protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FWidgetProperty: IModel = js.native
  def containerAsWidgetObject(): WidgetObject = js.native
  def `type`(): js.Any = js.native
  def `type`(newValue: WidgetPropertyType): js.Any = js.native
  /**
    * In version 7.13.0: added optional
    */
  @JSName("type")
  def type_Union(): WidgetPropertyType | Null = js.native
  def value(): js.Any = js.native
  def value(newValue: WidgetValue): js.Any = js.native
  /**
    * In version 7.13.0: added optional
    */
  @JSName("value")
  def value_Union(): WidgetValue | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetProperty")
@js.native
object WidgetProperty extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetProperty instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetProperty = js.native
  /**
    * Creates and returns a new WidgetProperty instance in the SDK and on the server.
    * The new WidgetProperty will be automatically stored in the 'properties' property
    * of the parent WidgetObject element passed as argument.
    */
  def createIn(container: WidgetObject): WidgetProperty = js.native
}

