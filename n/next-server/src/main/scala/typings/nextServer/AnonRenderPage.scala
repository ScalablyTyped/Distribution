package typings.nextServer

import typings.nextServer.libUtilsMod.ComponentsEnhancer
import typings.nextServer.libUtilsMod.RenderPage
import typings.nextServer.libUtilsMod.RenderPageResult
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

