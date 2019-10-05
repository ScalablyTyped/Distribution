package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalEditabilitySettings")
@js.native
class ConditionalEditabilitySettings protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.ConditionalEditabilitySettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConditionalEditabilitySettings")
@js.native
object ConditionalEditabilitySettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.ConditionalEditabilitySettings = js.native
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent ConditionallyEditableWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.0.0
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.ConditionallyEditableWidget): typings.mendixmodelsdk.distGenPagesMod.pages.ConditionalEditabilitySettings = js.native
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent ConditionallyEditableWidget element passed as argument.
    */
  def createInConditionallyEditableWidgetUnderConditionalEditabilitySettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.ConditionallyEditableWidget): typings.mendixmodelsdk.distGenPagesMod.pages.ConditionalEditabilitySettings = js.native
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  def createInCustomWidgetUnderConditionalEditabilitySettings(container: CustomWidget): typings.mendixmodelsdk.distGenPagesMod.pages.ConditionalEditabilitySettings = js.native
}

