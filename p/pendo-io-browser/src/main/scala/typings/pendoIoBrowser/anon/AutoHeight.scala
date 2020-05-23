package typings.pendoIoBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoHeight extends js.Object {
  var autoHeight: Boolean
  var css: String
  var height: Double
  var position: String
  var variables: js.Any
  var width: Double
}

object AutoHeight {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    css: String,
    height: Double,
    position: String,
    variables: js.Any,
    width: Double
  ): AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHeight]
  }
}

