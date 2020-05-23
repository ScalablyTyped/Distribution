package typings.plottable.anon

import typings.plottable.plottableStrings.bottomup
import typings.plottable.plottableStrings.topdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottomup extends js.Object {
  var bottomup: typings.plottable.plottableStrings.bottomup
  var topdown: typings.plottable.plottableStrings.topdown
}

object Bottomup {
  @scala.inline
  def apply(bottomup: bottomup, topdown: topdown): Bottomup = {
    val __obj = js.Dynamic.literal(bottomup = bottomup.asInstanceOf[js.Any], topdown = topdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottomup]
  }
}

