package typings.pouchdbDashFind

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ddoc extends js.Object {
  /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
  var ddoc: js.UndefOr[String] = js.undefined
  /** List of fields to index */
  var fields: js.Array[String]
  /** Name of the index, auto-generated if you don't include it */
  var name: js.UndefOr[String] = js.undefined
  /** Only supports 'json', and it's also the default */
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Ddoc {
  @scala.inline
  def apply(fields: js.Array[String], ddoc: String = null, name: String = null, `type`: String = null): Anon_Ddoc = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (ddoc != null) __obj.updateDynamic("ddoc")(ddoc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ddoc]
  }
}

