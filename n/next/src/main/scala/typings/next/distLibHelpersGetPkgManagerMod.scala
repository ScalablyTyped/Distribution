package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibHelpersGetPkgManagerMod {
  
  @JSImport("next/dist/lib/helpers/get-pkg-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPkgManager(baseDir: String): PackageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getPkgManager")(baseDir.asInstanceOf[js.Any]).asInstanceOf[PackageManager]
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.npm
    - typings.next.nextStrings.pnpm
    - typings.next.nextStrings.yarn
  */
  trait PackageManager extends StObject
  object PackageManager {
    
    inline def npm: typings.next.nextStrings.npm = "npm".asInstanceOf[typings.next.nextStrings.npm]
    
    inline def pnpm: typings.next.nextStrings.pnpm = "pnpm".asInstanceOf[typings.next.nextStrings.pnpm]
    
    inline def yarn: typings.next.nextStrings.yarn = "yarn".asInstanceOf[typings.next.nextStrings.yarn]
  }
}
