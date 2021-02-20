package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "JavaScriptSerializer")
@js.native
class JavaScriptSerializer protected ()
  extends typings.mendixmodelsdk.javaScriptSerializerMod.JavaScriptSerializer {
  def this(_unit: IAbstractUnit) = this()
}
/* static members */
object JavaScriptSerializer {
  
  /**
    * Given a unit, generates JavaScript(/TypeScript) code that would re-create the same unit.
    * Useful as scaffolding for model generators.
    */
  @JSImport("mendixmodelsdk", "JavaScriptSerializer.serializeToJs")
  @js.native
  def serializeToJs(unit: IAbstractUnit): String = js.native
}
