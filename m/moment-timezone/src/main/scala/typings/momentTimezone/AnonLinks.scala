package typings.momentTimezone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinks extends js.Object {
  var links: js.Array[String]
  var version: String
  var zones: js.Array[String]
}

object AnonLinks {
  @scala.inline
  def apply(links: js.Array[String], version: String, zones: js.Array[String]): AnonLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLinks]
  }
}

