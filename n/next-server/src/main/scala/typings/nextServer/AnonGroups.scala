package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroups extends js.Object {
  var groups: StringDictionary[Double]
  var re: RegExp
}

object AnonGroups {
  @scala.inline
  def apply(groups: StringDictionary[Double], re: RegExp): AnonGroups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroups]
  }
}

