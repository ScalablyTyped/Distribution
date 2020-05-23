package typings.nextServer.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var groups: StringDictionary[Double]
  var re: RegExp
}

object Groups {
  @scala.inline
  def apply(groups: StringDictionary[Double], re: RegExp): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

