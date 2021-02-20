package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.popperjsCoreStrings.applyStyles
import typings.popperjsCore.typesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyStylesMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/applyStyles", JSImport.Default)
  @js.native
  val default: Modifier[applyStyles, js.Object] = js.native
  
  type ApplyStylesModifier = Modifier[applyStyles, js.Object]
  
  type _To = Modifier[applyStyles, js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `applyStylesMod.foo` */
  override def _to: Modifier[applyStyles, js.Object] = default
}
