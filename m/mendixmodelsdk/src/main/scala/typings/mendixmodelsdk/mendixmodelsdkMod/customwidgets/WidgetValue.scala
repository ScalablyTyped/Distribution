package typings.mendixmodelsdk.mendixmodelsdkMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "customwidgets.WidgetValue")
@js.native
class WidgetValue protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets.WidgetValue {
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
@JSImport("mendixmodelsdk", "customwidgets.WidgetValue")
@js.native
object WidgetValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue = js.native
  /**
    * Creates and returns a new WidgetValue instance in the SDK and on the server.
    * The new WidgetValue will be automatically stored in the 'value' property
    * of the parent WidgetProperty element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetProperty): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue = js.native
}

