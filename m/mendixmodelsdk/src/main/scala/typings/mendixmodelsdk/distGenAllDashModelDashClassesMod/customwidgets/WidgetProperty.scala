package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetProperty")
@js.native
class WidgetProperty protected ()
  extends typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetProperty {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetProperty")
@js.native
object WidgetProperty extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetProperty instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetProperty = js.native
  /**
    * Creates and returns a new WidgetProperty instance in the SDK and on the server.
    * The new WidgetProperty will be automatically stored in the 'properties' property
    * of the parent WidgetObject element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObject): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetProperty = js.native
}

