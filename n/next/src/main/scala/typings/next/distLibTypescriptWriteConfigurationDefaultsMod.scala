package typings.next

import typings.next.anon.PartialCompilerOptions
import typings.next.anon.TypeofimportedTypescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTypescriptWriteConfigurationDefaultsMod {
  
  @JSImport("next/dist/lib/typescript/writeConfigurationDefaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRequiredConfiguration(ts: TypeofimportedTypescript): PartialCompilerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredConfiguration")(ts.asInstanceOf[js.Any]).asInstanceOf[PartialCompilerOptions]
  
  inline def writeConfigurationDefaults(ts: TypeofimportedTypescript, tsConfigPath: String, isFirstTimeSetup: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfigurationDefaults")(ts.asInstanceOf[js.Any], tsConfigPath.asInstanceOf[js.Any], isFirstTimeSetup.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
