package typings.pdfmake.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pagesize extends js.Object {
  var height: Double
  var orientation: PageOrientation
  var width: Double
}

object Pagesize {
  @scala.inline
  def apply(height: Double, orientation: PageOrientation, width: Double): Pagesize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pagesize]
  }
}

