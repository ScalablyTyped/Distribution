package typings.pouchdbDashFind.PouchDBNs.FindNs

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
    val __obj = js.Dynamic.literal(ddoc = ddoc, name = name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeleteIndexOptions]
  }
}

