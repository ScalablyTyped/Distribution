package typings
package nodeDashPgDashMigrateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var schema: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, schema: java.lang.String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Anon_Name]
  }
}

