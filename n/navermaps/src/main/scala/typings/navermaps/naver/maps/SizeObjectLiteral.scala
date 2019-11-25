package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeObjectLiteral extends js.Object {
  var height: Double
  var width: Double
}

object SizeObjectLiteral {
  @scala.inline
  def apply(height: Double, width: Double): SizeObjectLiteral = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SizeObjectLiteral]
  }
}

