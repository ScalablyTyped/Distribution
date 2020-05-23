package typings.onsenui.mod

import typings.onsenui.anon.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description PageLoader class constructor
  */
@JSImport("onsenui", "PageLoader")
@js.native
class PageLoader protected () extends js.Object {
  def this(args: js.Any*) = this()
  var internalLoader: js.Function = js.native
  def load(options: Page, done: js.Function): Unit = js.native
}

