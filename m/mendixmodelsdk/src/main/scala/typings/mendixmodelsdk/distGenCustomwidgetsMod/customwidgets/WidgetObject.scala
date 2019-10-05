package typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetObject")
@js.native
class WidgetObject protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsCustomWidget: CustomWidget = js.native
  val containerAsWidgetValue: WidgetValue = js.native
  /**
    * In version 8.1.0: deleted
    * In version 7.23.0: introduced
    */
  var labelTemplate: ClientTemplate | Null = js.native
  @JSName("model")
  var model_WidgetObject: IModel = js.native
  val properties: IList[WidgetProperty] = js.native
  /**
    * In version 7.13.0: added optional
    */
  var `type`: WidgetObjectType | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetObject")
@js.native
object WidgetObject extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetObject = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'object' property
    * of the parent CustomWidget element passed as argument.
    */
  def createInCustomWidgetUnderObject(container: CustomWidget): WidgetObject = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'objects' property
    * of the parent WidgetValue element passed as argument.
    */
  def createInWidgetValueUnderObjects(container: WidgetValue): WidgetObject = js.native
}

