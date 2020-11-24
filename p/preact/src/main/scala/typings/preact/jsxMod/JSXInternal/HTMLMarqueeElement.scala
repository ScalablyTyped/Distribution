package typings.preact.jsxMod.JSXInternal

import typings.preact.preactStrings.alternate
import typings.preact.preactStrings.down
import typings.preact.preactStrings.left
import typings.preact.preactStrings.right
import typings.preact.preactStrings.scroll
import typings.preact.preactStrings.slide
import typings.preact.preactStrings.up
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLMarqueeElement extends HTMLElement {
  
  var behavior: js.UndefOr[scroll | slide | alternate] = js.native
  
  var bgColor: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[left | right | up | down] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var hspace: js.UndefOr[Double | String] = js.native
  
  var loop: js.UndefOr[Double | String] = js.native
  
  var scrollAmount: js.UndefOr[Double | String] = js.native
  
  var scrollDelay: js.UndefOr[Double | String] = js.native
  
  var trueSpeed: js.UndefOr[Boolean] = js.native
  
  var vspace: js.UndefOr[Double | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
