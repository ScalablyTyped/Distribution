package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  @JSName("$type")
  var $type: mongodbLib.mongodbLibStrings.date | mongodbLib.mongodbLibStrings.timestamp
}

object Anon_Date {
  @scala.inline
  def apply($type: mongodbLib.mongodbLibStrings.date | mongodbLib.mongodbLibStrings.timestamp): Anon_Date = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Date]
  }
}

