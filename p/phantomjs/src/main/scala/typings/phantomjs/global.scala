package typings.phantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("phantom")
  @js.native
  def phantom: Phantom = js.native
  @scala.inline
  def phantom_=(x: Phantom): Unit = js.Dynamic.global.updateDynamic("phantom")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def require(module: String): js.Any = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
