package typings
package mendixmodelsdkLib.distSdkExtrasAsDashModelDashSdkDashCodeDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/extras/as-model-sdk-code-serializer", "JavaScriptSerializer")
@js.native
class JavaScriptSerializer protected () extends js.Object {
  def this(_unit: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit) = this()
  var schedule: js.Any = js.native
  var source: js.Any = js.native
}

@JSImport("mendixmodelsdk/dist/sdk/extras/as-model-sdk-code-serializer", "JavaScriptSerializer")
@js.native
object JavaScriptSerializer extends js.Object {
  /**
    * Given a unit, generates JavaScript(/TypeScript) code that would re-create the same unit.
    * Useful as scaffolding for model generators.
    */
  def serializeToJs(unit: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit): java.lang.String = js.native
}

