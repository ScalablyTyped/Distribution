package typings.nodeDashPgDashMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var schema: js.UndefOr[String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String, schema: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[Anon_Name]
  }
}

