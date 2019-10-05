package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.codeactions

import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeActionParameter")
@js.native
abstract class CodeActionParameter protected ()
  extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeActionParameter {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeActionParameter")
@js.native
object CodeActionParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo = js.native
}

