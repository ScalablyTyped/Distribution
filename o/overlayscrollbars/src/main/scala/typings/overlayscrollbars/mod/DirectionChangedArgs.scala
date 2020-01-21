package typings.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionChangedArgs extends js.Object {
  var dir: String
  var isRTL: Double
}

object DirectionChangedArgs {
  @scala.inline
  def apply(dir: String, isRTL: Double): DirectionChangedArgs = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectionChangedArgs]
  }
}

