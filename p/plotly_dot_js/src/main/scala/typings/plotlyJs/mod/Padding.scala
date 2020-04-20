package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.arraydraw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  /**
  	 * The amount of padding (in px) along the bottom of the component.
  	 */
  var b: Double
  var editType: arraydraw
  /**
  	 * The amount of padding (in px) on the left side of the component.
  	 */
  var l: Double
  /**
  	 * The amount of padding (in px) on the right side of the component.
  	 */
  var r: Double
  /**
  	 * The amount of padding (in px) along the top of the component.
  	 */
  var t: Double
}

object Padding {
  @scala.inline
  def apply(b: Double, editType: arraydraw, l: Double, r: Double, t: Double): Padding = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], editType = editType.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

