package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononBrowserObject extends js.Object {
  var name: java.lang.String
  var version: java.lang.String
}

object PhononBrowserObject {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String): PhononBrowserObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PhononBrowserObject]
  }
}

