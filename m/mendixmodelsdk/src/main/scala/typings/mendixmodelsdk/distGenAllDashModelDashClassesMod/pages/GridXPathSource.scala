package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridXPathSource")
@js.native
class GridXPathSource protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.GridXPathSource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridXPathSource")
@js.native
object GridXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.GridXPathSource = js.native
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * The new GridXPathSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.EntityWidget): typings.mendixmodelsdk.distGenPagesMod.pages.GridXPathSource = js.native
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * The new GridXPathSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  def createInEntityWidgetUnderDataSource(container: typings.mendixmodelsdk.distGenPagesMod.pages.EntityWidget): typings.mendixmodelsdk.distGenPagesMod.pages.GridXPathSource = js.native
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * The new GridXPathSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): typings.mendixmodelsdk.distGenPagesMod.pages.GridXPathSource = js.native
}

