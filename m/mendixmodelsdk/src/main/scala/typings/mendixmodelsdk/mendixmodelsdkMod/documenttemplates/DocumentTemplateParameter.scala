package typings.mendixmodelsdk.mendixmodelsdkMod.documenttemplates

import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "documenttemplates.DocumentTemplateParameter")
@js.native
class DocumentTemplateParameter protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates.DocumentTemplateParameter {
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
@JSImport("mendixmodelsdk", "documenttemplates.DocumentTemplateParameter")
@js.native
object DocumentTemplateParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

