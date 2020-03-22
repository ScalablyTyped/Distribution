package typings.pendoIoBrowser.pendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof pendo-io-browser.pendo.EventCallbacks ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): pendo-io-browser.pendo.Events} */
@js.native
trait Events extends js.Object {
  @JSName("guidesFailed")
  var guidesFailed_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type] = js.native
  @JSName("guidesLoaded")
  var guidesLoaded_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type] = js.native
  @JSName("ready")
  var ready_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type] = js.native
  def guidesFailed(): this.type = js.native
  def guidesFailed(callback: js.Function0[Unit]): this.type = js.native
  def guidesLoaded(): this.type = js.native
  def guidesLoaded(callback: js.Function0[Unit]): this.type = js.native
  def ready(): this.type = js.native
  def ready(callback: js.Function0[Unit]): this.type = js.native
}

