package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverConfigMod {
  
  @JSImport("next-server/dist/server/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(phase: String, dir: String, customConfig: js.Any): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(phase.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], customConfig.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def isTargetLikeServerless(target: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTargetLikeServerless")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
