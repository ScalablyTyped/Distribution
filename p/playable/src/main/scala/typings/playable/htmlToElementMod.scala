package typings.playable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlToElementMod {
  
  @JSImport("playable/dist/src/modules/ui/core/htmlToElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(html: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
