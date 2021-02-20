package typings.nextServer

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requireMod {
  
  @JSImport("next-server/dist/server/require", "getPagePath")
  @js.native
  def getPagePath(page: String, distDir: String, serverless: Boolean): String = js.native
  @JSImport("next-server/dist/server/require", "getPagePath")
  @js.native
  def getPagePath(page: String, distDir: String, serverless: Boolean, dev: Boolean): String = js.native
  
  @JSImport("next-server/dist/server/require", "pageNotFoundError")
  @js.native
  def pageNotFoundError(page: String): Error = js.native
  
  @JSImport("next-server/dist/server/require", "requirePage")
  @js.native
  def requirePage(page: String, distDir: String, serverless: Boolean): js.Any = js.native
}
