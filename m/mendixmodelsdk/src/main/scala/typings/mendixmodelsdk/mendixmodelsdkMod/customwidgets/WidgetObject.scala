package typings.mendixmodelsdk.mendixmodelsdkMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "customwidgets.WidgetObject")
@js.native
class WidgetObject protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets.WidgetObject {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "customwidgets.WidgetObject")
@js.native
object WidgetObject extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObject = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'object' property
    * of the parent CustomWidget element passed as argument.
    */
  def createInCustomWidgetUnderObject(container: typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObject = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'objects' property
    * of the parent WidgetValue element passed as argument.
    */
  def createInWidgetValueUnderObjects(container: typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObject = js.native
}

