package typings.pouchdbFind.PouchDB.Find

import typings.pouchdbFind.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
  var ddoc: String | Null
  var `def`: Fields
  /** Name of the index, auto-generated if you don't include it */
  var name: String
  /** Only supports 'json' */
  var `type`: String
}

object Index {
  @scala.inline
  def apply(`def`: Fields, name: String, `type`: String, ddoc: String = null): Index = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ddoc = ddoc.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

