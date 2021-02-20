package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverConfigMod {
  
  @JSImport("next-server/dist/server/config", JSImport.Default)
  @js.native
  def default(phase: String, dir: String, customConfig: js.Any): StringDictionary[js.Any] = js.native
  
  @JSImport("next-server/dist/server/config", "isTargetLikeServerless")
  @js.native
  def isTargetLikeServerless(target: String): Boolean = js.native
}
