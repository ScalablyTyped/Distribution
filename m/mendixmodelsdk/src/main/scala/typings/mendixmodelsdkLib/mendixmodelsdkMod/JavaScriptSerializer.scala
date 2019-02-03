package typings
package mendixmodelsdkLib.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "JavaScriptSerializer")
@js.native
class JavaScriptSerializer protected ()
  extends mendixmodelsdkLib.distSdkExtrasAsDashModelDashSdkDashCodeDashSerializerMod.JavaScriptSerializer {
  def this(_unit: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "JavaScriptSerializer")
@js.native
object JavaScriptSerializer extends js.Object {
  /**
    * Given a unit, generates JavaScript(/TypeScript) code that would re-create the same unit.
    * Useful as scaffolding for model generators.
    */
  def serializeToJs(unit: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit): java.lang.String = js.native
}

