package typings
package pouchdbDashFindLib.PouchDBNs.FindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIndexOptions extends js.Object {
  /** Design document name */
  var ddoc: java.lang.String
  /** Name of the index */
  var name: java.lang.String
  /** Default 'json' */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteIndexOptions {
  @scala.inline
  def apply(ddoc: java.lang.String, name: java.lang.String, `type`: java.lang.String = null): DeleteIndexOptions = {
    val __obj = js.Dynamic.literal(ddoc = ddoc, name = name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeleteIndexOptions]
  }
}

