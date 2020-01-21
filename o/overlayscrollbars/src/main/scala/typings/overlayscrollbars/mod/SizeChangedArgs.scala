package typings.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeChangedArgs extends js.Object {
  var height: Double
  var width: Double
}

object SizeChangedArgs {
  @scala.inline
  def apply(height: Double, width: Double): SizeChangedArgs = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SizeChangedArgs]
  }
}

