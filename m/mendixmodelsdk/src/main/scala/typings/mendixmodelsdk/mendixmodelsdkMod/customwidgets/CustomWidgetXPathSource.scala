package typings.mendixmodelsdk.mendixmodelsdkMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.pages.EntityWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.5.0: introduced
  */
@JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource")
@js.native
class CustomWidgetXPathSource protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets.CustomWidgetXPathSource {
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
@JSImport("mendixmodelsdk", "customwidgets.CustomWidgetXPathSource")
@js.native
object CustomWidgetXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent pages.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInEntityWidgetUnderDataSource(container: EntityWidget): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
}

