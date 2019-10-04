package typings.nodeDashOpenload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contenttype extends js.Object {
  var content_type: String
  var id: String
  var name: String
  var sha1: String
  var size: Double
  var status: Double
}

object Anon_Contenttype {
  @scala.inline
  def apply(content_type: String, id: String, name: String, sha1: String, size: Double, status: Double): Anon_Contenttype = {
    val __obj = js.Dynamic.literal(content_type = content_type, id = id, name = name, sha1 = sha1, size = size, status = status)
  
    __obj.asInstanceOf[Anon_Contenttype]
  }
}

