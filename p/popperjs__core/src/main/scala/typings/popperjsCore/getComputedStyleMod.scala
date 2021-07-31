package typings.popperjsCore

import typings.std.CSSStyleDeclaration
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComputedStyleMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getComputedStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(element: Element): CSSStyleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration]
}
