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
  val containerAsWidgetObject: WidgetObject = js.native
  @JSName("model")
  var model_WidgetProperty: IModel = js.native
  /**
    * In version 7.13.0: added optional
    */
  var `type`: WidgetPropertyType | Null = js.native
  /**
    * In version 7.13.0: added optional
    */
  var value: WidgetValue | Null = js.native
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

