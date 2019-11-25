package typings.pouchdbDashFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIndexOptions extends js.Object {
  /** Design document name */
  var ddoc: String
  /** Name of the index */
  var name: String
  /** Default 'json' */
  var `type`: js.UndefOr[String] = js.undefined
}

object DeleteIndexOptions {
  @scala.inline
  def apply(ddoc: String, name: String, `type`: String = null): DeleteIndexOptions = {
    val __obj = js.Dynamic.literal(ddoc = ddoc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexOptions]
  }
}

