package typings.popperjsCore

import typings.popperjsCore.anon.ScrollLeft
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getHTMLElementScrollMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getHTMLElementScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(element: HTMLElement): ScrollLeft = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[ScrollLeft]
}
