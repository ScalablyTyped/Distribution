package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.popperjsCoreStrings.hide
import typings.popperjsCore.typesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hideMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/hide", JSImport.Default)
  @js.native
  val default: HideModifier = js.native
  
  type HideModifier = Modifier[hide, js.Object]
  
  type _To = HideModifier
  
  /* This means you don't have to write `default`, but can instead just say `hideMod.foo` */
  override def _to: HideModifier = default
}
