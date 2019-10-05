package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDimension extends js.Object {
  var height: Double
  var width: Double
}

object IDimension {
  @scala.inline
  def apply(height: Double, width: Double): IDimension = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[IDimension]
  }
}

