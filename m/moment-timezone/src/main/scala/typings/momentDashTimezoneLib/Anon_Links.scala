package typings
package momentDashTimezoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Links extends js.Object {
  var links: js.Array[java.lang.String]
  var version: java.lang.String
  var zones: js.Array[java.lang.String]
}

object Anon_Links {
  @scala.inline
  def apply(links: js.Array[java.lang.String], version: java.lang.String, zones: js.Array[java.lang.String]): Anon_Links = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[Anon_Links]
  }
}

