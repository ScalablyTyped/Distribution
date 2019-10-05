package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.codeactions

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeAction")
@js.native
abstract class CodeAction protected ()
  extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeAction")
@js.native
object CodeAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo = js.native
}

