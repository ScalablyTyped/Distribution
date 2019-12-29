package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataViewContents")
@js.native
class DataViewContents protected ()
  extends typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataViewContents {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataViewContents")
@js.native
object DataViewContents extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataViewContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataViewContents = js.native
  /**
    * Creates and returns a new DataViewContents instance in the SDK and on the server.
    * The new DataViewContents will be automatically stored in the 'contents' property
    * of the parent DataView element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataView): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataViewContents = js.native
}

