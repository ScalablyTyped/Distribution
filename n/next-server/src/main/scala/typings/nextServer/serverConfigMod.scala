package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-server/dist/server/config", JSImport.Namespace)
@js.native
object serverConfigMod extends js.Object {
  
  def default(phase: String, dir: String, customConfig: js.Any): StringDictionary[js.Any] = js.native
  
  def isTargetLikeServerless(target: String): Boolean = js.native
}
