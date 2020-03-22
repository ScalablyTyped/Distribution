package typings.pouchdbFind.PouchDB.Find

import typings.pouchdbFind.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
  var ddoc: String | Null
  var `def`: AnonFields
  /** Name of the index, auto-generated if you don't include it */
  var name: String
  /** Only supports 'json' */
  var `type`: String
}

object Index {
  @scala.inline
  def apply(`def`: AnonFields, name: String, `type`: String, ddoc: String = null): Index = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ddoc != null) __obj.updateDynamic("ddoc")(ddoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

