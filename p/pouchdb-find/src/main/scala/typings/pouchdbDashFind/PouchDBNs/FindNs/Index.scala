package typings.pouchdbDashFind.PouchDBNs.FindNs

import typings.pouchdbDashFind.Anon_FieldName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
  var ddoc: String | Null
  var `def`: Anon_FieldName
  /** Name of the index, auto-generated if you don't include it */
  var name: String
  /** Only supports 'json' */
  var `type`: String
}

object Index {
  @scala.inline
  def apply(`def`: Anon_FieldName, name: String, `type`: String, ddoc: String = null): Index = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("def")(`def`)
    __obj.updateDynamic("type")(`type`)
    if (ddoc != null) __obj.updateDynamic("ddoc")(ddoc)
    __obj.asInstanceOf[Index]
  }
}

