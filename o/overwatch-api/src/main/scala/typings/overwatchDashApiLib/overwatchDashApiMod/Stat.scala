package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var title: java.lang.String
  var value: java.lang.String
}

object Stat {
  @scala.inline
  def apply(title: java.lang.String, value: java.lang.String): Stat = {
    val __obj = js.Dynamic.literal(title = title, value = value)
  
    __obj.asInstanceOf[Stat]
  }
}

