package typings.nextReactDevOverlay

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactDevOverlayMod extends Shortcut {
  
  @JSImport("@next/react-dev-overlay/lib/internal/ReactDevOverlay", JSImport.Default)
  @js.native
  val default: FunctionComponent[js.Object] = js.native
  
  type _To = FunctionComponent[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `reactDevOverlayMod.foo` */
  override def _to: FunctionComponent[js.Object] = default
}
