package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverUtilsMod {
  
  @JSImport("next-server/dist/server/utils", "cleanAmpPath")
  @js.native
  def cleanAmpPath(pathname: String): String = js.native
  
  @JSImport("next-server/dist/server/utils", "isBlockedPage")
  @js.native
  def isBlockedPage(pathname: String): Boolean = js.native
  
  @JSImport("next-server/dist/server/utils", "isInternalUrl")
  @js.native
  def isInternalUrl(url: String): Boolean = js.native
}
