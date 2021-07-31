package typings.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pss {
  
  @JSImport("node-forge", "pss")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(any: js.Any): PSS = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(any.asInstanceOf[js.Any]).asInstanceOf[PSS]
  
  type PSS = js.Any
}
