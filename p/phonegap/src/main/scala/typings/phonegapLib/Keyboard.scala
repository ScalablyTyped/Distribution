package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  var automaticScrollToTopOnHiding: scala.Boolean
  var isVisible: scala.Boolean
  var onhide: js.Function
  var onhiding: js.Function
  var onshow: js.Function
  var onshowing: js.Function
  def disableScrollingInShrinkView(disable: scala.Boolean): scala.Unit
  def hideFormAccessoryBar(hide: scala.Boolean): scala.Unit
  def shrinkView(shrink: scala.Boolean): scala.Unit
}

