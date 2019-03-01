package typings
package pouchdbDashFindLib.PouchDBNs.FindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
  var ddoc: java.lang.String | scala.Null
  var `def`: pouchdbDashFindLib.Anon_FieldName
  /** Name of the index, auto-generated if you don't include it */
  var name: java.lang.String
  /** Only supports 'json' */
  var `type`: java.lang.String
}

object Index {
  @scala.inline
  def apply(
    `def`: pouchdbDashFindLib.Anon_FieldName,
    name: java.lang.String,
    `type`: java.lang.String,
    ddoc: java.lang.String = null
  ): Index = {
    val __obj = js.Dynamic.literal(`def` = `def`, `type` = `type`)
    __obj.updateDynamic("name")(name)
    if (ddoc != null) __obj.updateDynamic("ddoc")(ddoc)
    __obj.asInstanceOf[Index]
  }
}

