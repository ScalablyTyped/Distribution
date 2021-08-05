package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "JavaScriptSerializer")
@js.native
class JavaScriptSerializer protected ()
  extends typings.mendixmodelsdk.javaScriptSerializerMod.JavaScriptSerializer {
  def this(_unit: IAbstractUnit) = this()
}
/* static members */
object JavaScriptSerializer {
  
  @JSImport("mendixmodelsdk", "JavaScriptSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Given a unit, generates JavaScript(/TypeScript) code that would re-create the same unit.
    * Useful as scaffolding for model generators.
    */
  inline def serializeToJs(unit: IAbstractUnit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToJs")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
}
