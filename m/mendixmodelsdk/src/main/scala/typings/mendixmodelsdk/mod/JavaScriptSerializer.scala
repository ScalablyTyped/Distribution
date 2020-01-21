package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "JavaScriptSerializer")
@js.native
class JavaScriptSerializer protected ()
  extends typings.mendixmodelsdk.javaScriptSerializerMod.JavaScriptSerializer {
  def this(_unit: IAbstractUnit) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "JavaScriptSerializer")
@js.native
object JavaScriptSerializer extends js.Object {
  /**
    * Given a unit, generates JavaScript(/TypeScript) code that would re-create the same unit.
    * Useful as scaffolding for model generators.
    */
  def serializeToJs(unit: IAbstractUnit): String = js.native
}

