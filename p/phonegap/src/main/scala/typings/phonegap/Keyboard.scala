package typings.phonegap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  var automaticScrollToTopOnHiding: Boolean
  var isVisible: Boolean
  var onhide: js.Function
  var onhiding: js.Function
  var onshow: js.Function
  var onshowing: js.Function
  def disableScrollingInShrinkView(disable: Boolean): Unit
  def hideFormAccessoryBar(hide: Boolean): Unit
  def shrinkView(shrink: Boolean): Unit
}

@JSGlobal("Keyboard")
@js.native
object Keyboard extends TopLevel[Keyboard]

