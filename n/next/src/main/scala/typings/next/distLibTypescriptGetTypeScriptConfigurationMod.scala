package typings.next

import typings.next.anon.TypeofimportedTypescript
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTypescriptGetTypeScriptConfigurationMod {
  
  @JSImport("next/dist/lib/typescript/getTypeScriptConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTypeScriptConfiguration(ts: TypeofimportedTypescript, tsConfigPath: String): js.Promise[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptConfiguration")(ts.asInstanceOf[js.Any], tsConfigPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsedCommandLine]]
  inline def getTypeScriptConfiguration(ts: TypeofimportedTypescript, tsConfigPath: String, metaOnly: Boolean): js.Promise[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptConfiguration")(ts.asInstanceOf[js.Any], tsConfigPath.asInstanceOf[js.Any], metaOnly.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsedCommandLine]]
}
