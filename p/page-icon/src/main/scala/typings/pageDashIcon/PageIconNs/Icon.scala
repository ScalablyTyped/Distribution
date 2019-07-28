package typings.pageDashIcon.PageIconNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var data: Buffer
  var ext: String
  var mime: String
  var name: String
  var size: Double
  var source: String
}

object Icon {
  @scala.inline
  def apply(data: Buffer, ext: String, mime: String, name: String, size: Double, source: String): Icon = {
    val __obj = js.Dynamic.literal(data = data, ext = ext, mime = mime, name = name, size = size, source = source)
  
    __obj.asInstanceOf[Icon]
  }
}

