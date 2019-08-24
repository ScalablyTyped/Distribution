package typings.nunjucks.nunjucksMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoader extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var extend: js.UndefOr[js.Function1[/* extender */ this.type, this.type]] = js.native
  def getSource(name: String): LoaderSource = js.native
  def getSource(name: String, callback: Callback[Error, LoaderSource]): Unit = js.native
}

