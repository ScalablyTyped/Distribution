package typings.next

import typings.next.utilsMod.ComponentsEnhancer
import typings.next.utilsMod.RenderPage
import typings.next.utilsMod.RenderPageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderPage extends js.Object {
  var renderPage: RenderPage
}

object AnonRenderPage {
  @scala.inline
  def apply(
    renderPage: /* options */ js.UndefOr[ComponentsEnhancer] => RenderPageResult | js.Promise[RenderPageResult]
  ): AnonRenderPage = {
    val __obj = js.Dynamic.literal(renderPage = js.Any.fromFunction1(renderPage))
  
    __obj.asInstanceOf[AnonRenderPage]
  }
}

