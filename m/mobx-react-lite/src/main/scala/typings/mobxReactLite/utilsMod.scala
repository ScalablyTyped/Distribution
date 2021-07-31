package typings.mobxReactLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobx-react-lite/dist/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useDeprecated(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeprecated")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
}
