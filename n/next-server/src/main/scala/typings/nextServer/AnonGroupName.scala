package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupName extends js.Object {
  var groups: StringDictionary[Double]
  var re: RegExp
}

object AnonGroupName {
  @scala.inline
  def apply(groups: StringDictionary[Double], re: RegExp): AnonGroupName = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroupName]
  }
}

