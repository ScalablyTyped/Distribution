package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/row-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.TableRow")
@js.native
class TableRow protected ()
  extends typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableRow {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.TableRow")
@js.native
object TableRow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new TableRow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableRow = js.native
  /**
    * Creates and returns a new TableRow instance in the SDK and on the server.
    * The new TableRow will be automatically stored in the 'rows' property
    * of the parent Table element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Table): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableRow = js.native
}

