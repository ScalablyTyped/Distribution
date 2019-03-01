package typings
package musicmetadataLib.MMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Picture extends js.Object {
  var data: nodeLib.Buffer
  var format: java.lang.String
}

object Picture {
  @scala.inline
  def apply(data: nodeLib.Buffer, format: java.lang.String): Picture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[Picture]
  }
}

