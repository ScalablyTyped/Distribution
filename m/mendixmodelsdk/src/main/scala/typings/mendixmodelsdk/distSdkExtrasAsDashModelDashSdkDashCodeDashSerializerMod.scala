package typings.mendixmodelsdk

import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/extras/as-model-sdk-code-serializer", JSImport.Namespace)
@js.native
object distSdkExtrasAsDashModelDashSdkDashCodeDashSerializerMod extends js.Object {
  @js.native
  class JavaScriptSerializer protected () extends js.Object {
    def this(_unit: IAbstractUnit) = this()
    var schedule: js.Any = js.native
    var source: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object JavaScriptSerializer extends js.Object {
    /**
      * Given a unit, generates JavaScript(/TypeScript) code that would re-create the same unit.
      * Useful as scaffolding for model generators.
      */
    def serializeToJs(unit: IAbstractUnit): String = js.native
  }
  
}

