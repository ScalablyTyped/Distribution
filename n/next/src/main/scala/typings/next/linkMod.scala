package typings.next

import org.scalablytyped.runtime.Shortcut
import typings.next.anon.OmitAnchorHTMLAttributesH
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod extends Shortcut {
  
  @JSImport("next/link", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OmitAnchorHTMLAttributesH] = js.native
  
  type _To = ForwardRefExoticComponent[OmitAnchorHTMLAttributesH]
  
  /* This means you don't have to write `default`, but can instead just say `linkMod.foo` */
  override def _to: ForwardRefExoticComponent[OmitAnchorHTMLAttributesH] = default
}
