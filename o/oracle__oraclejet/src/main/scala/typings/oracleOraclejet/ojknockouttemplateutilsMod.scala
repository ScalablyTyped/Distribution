package typings.oracleOraclejet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojknockouttemplateutilsMod {
  
  @JSImport("@oracle/oraclejet/ojknockouttemplateutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRenderer(template: String): js.Function1[/* param0 */ js.Object, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(template.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ js.Object, Unit]]
  inline def getRenderer(template: String, bReplaceNode: Boolean): js.Function1[/* param0 */ js.Object, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(template.asInstanceOf[js.Any], bReplaceNode.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* param0 */ js.Object, Unit]]
}
