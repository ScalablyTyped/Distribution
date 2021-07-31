package typings.nextReactDevOverlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyLockerMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Overlay/body-locker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
  
  @scala.inline
  def unlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")().asInstanceOf[Unit]
}
