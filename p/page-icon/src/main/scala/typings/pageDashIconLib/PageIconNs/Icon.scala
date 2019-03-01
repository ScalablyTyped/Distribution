package typings
package pageDashIconLib.PageIconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var data: nodeLib.Buffer
  var ext: java.lang.String
  var mime: java.lang.String
  var name: java.lang.String
  var size: scala.Double
  var source: java.lang.String
}

object Icon {
  @scala.inline
  def apply(
    data: nodeLib.Buffer,
    ext: java.lang.String,
    mime: java.lang.String,
    name: java.lang.String,
    size: scala.Double,
    source: java.lang.String
  ): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("ext")(ext)
    __obj.updateDynamic("mime")(mime)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Icon]
  }
}

