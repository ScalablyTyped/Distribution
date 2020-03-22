package typings.openfin.systemWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowDetail extends js.Object {
  var bottom: Double
  var height: Double
  var isShowing: Boolean
  var left: Double
  var name: String
  var right: Double
  var state: String
  var top: Double
  var width: Double
}

object WindowDetail {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    isShowing: Boolean,
    left: Double,
    name: String,
    right: Double,
    state: String,
    top: Double,
    width: Double
  ): WindowDetail = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isShowing = isShowing.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowDetail]
  }
}

