package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Oid extends js.Object {
  var oid: String
  var path: String
  var ref_name: String
  var size: Double
}

object Oid {
  @scala.inline
  def apply(oid: String, path: String, ref_name: String, size: Double): Oid = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ref_name = ref_name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oid]
  }
}

