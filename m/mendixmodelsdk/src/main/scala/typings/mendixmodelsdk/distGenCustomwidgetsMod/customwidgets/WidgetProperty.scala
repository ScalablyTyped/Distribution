package typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  /**
    * In version 7.13.0: added optional
    */
  def `type`(): WidgetPropertyType | Null = js.native
  def `type`(newValue: WidgetPropertyType): js.Any = js.native
  @JSName("type")
  def type_Any(): js.Any = js.native
  /**
    * In version 7.13.0: added optional
    */
  def value(): WidgetValue | Null = js.native
  def value(newValue: WidgetValue): js.Any = js.native
  @JSName("value")
  def value_Any(): js.Any = js.native
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

