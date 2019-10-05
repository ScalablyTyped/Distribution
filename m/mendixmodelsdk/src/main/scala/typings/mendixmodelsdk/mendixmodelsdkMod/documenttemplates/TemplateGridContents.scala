package typings.mendixmodelsdk.mendixmodelsdkMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents")
@js.native
class TemplateGridContents protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates.TemplateGridContents {
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
@JSImport("mendixmodelsdk", "documenttemplates.TemplateGridContents")
@js.native
object TemplateGridContents extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'evenRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createInTemplateGridUnderEvenRowsContents(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TemplateGrid): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TemplateGridContents = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'oddRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createInTemplateGridUnderOddRowsContents(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TemplateGrid): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TemplateGridContents = js.native
}

