package typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.EntityWidget
import typings.mendixmodelsdk.distGenPagesMod.pages.XPathSourceBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.5.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidgetXPathSource")
@js.native
class CustomWidgetXPathSource protected () extends XPathSourceBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCustomWidgetXPathSource: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidgetXPathSource")
@js.native
object CustomWidgetXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CustomWidgetXPathSource = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent pages.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInEntityWidgetUnderDataSource(container: EntityWidget): CustomWidgetXPathSource = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): CustomWidgetXPathSource = js.native
}

