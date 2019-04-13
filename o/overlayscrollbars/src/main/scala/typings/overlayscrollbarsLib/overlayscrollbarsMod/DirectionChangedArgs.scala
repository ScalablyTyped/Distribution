package typings
package overlayscrollbarsLib.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionChangedArgs extends js.Object {
  var dir: java.lang.String
  var isRTL: scala.Double
}

object DirectionChangedArgs {
  @scala.inline
  def apply(dir: java.lang.String, isRTL: scala.Double): DirectionChangedArgs = {
    val __obj = js.Dynamic.literal(dir = dir, isRTL = isRTL)
  
    __obj.asInstanceOf[DirectionChangedArgs]
  }
}

