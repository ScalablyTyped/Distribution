package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.libTypesMod.Modifier
import typings.popperjsCore.popperjsCoreStrings.applyStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModifiersApplyStylesMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/applyStyles", JSImport.Default)
  @js.native
  val default: ApplyStylesModifier = js.native
  
  type ApplyStylesModifier = Modifier[applyStyles, js.Object]
  
  type _To = ApplyStylesModifier
  
  /* This means you don't have to write `default`, but can instead just say `libModifiersApplyStylesMod.foo` */
  override def _to: ApplyStylesModifier = default
}
