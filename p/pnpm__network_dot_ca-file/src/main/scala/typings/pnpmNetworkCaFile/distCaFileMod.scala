package typings.pnpmNetworkCaFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCaFileMod {
  
  @JSImport("@pnpm/network.ca-file/dist/ca-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readCAFileSync(filePath: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readCAFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
}
