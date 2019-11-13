package typings.next

import typings.next.distNextDashServerLibUtilsMod.ComponentsEnhancer
import typings.next.distNextDashServerLibUtilsMod.RenderPage
import typings.next.distNextDashServerLibUtilsMod.RenderPageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RenderPage extends js.Object {
  var renderPage: RenderPage
}

object Anon_RenderPage {
  @scala.inline
  def apply(
    renderPage: /* options */ js.UndefOr[ComponentsEnhancer] => RenderPageResult | js.Promise[RenderPageResult]
  ): Anon_RenderPage = {
    val __obj = js.Dynamic.literal(renderPage = js.Any.fromFunction1(renderPage))
  
    __obj.asInstanceOf[Anon_RenderPage]
  }
}

