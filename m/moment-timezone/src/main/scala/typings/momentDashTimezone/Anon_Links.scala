package typings.momentDashTimezone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Links extends js.Object {
  var links: js.Array[String]
  var version: String
  var zones: js.Array[String]
}

object Anon_Links {
  @scala.inline
  def apply(links: js.Array[String], version: String, zones: js.Array[String]): Anon_Links = {
    val __obj = js.Dynamic.literal(links = links, version = version, zones = zones)
  
    __obj.asInstanceOf[Anon_Links]
  }
}

