package typings.oracledb

import typings.oracledb.oracledbMod.DBObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeTypeClass extends js.Object {
  /** One of the DB_TYPE constants. */
  var `type`: Double
  /** Set if the value of type is a DBObject. */
  var typeClass: js.UndefOr[DBObjectClass] = js.undefined
  /** Type, such as 'VARCHAR2' or 'NUMBER'. */
  var typeName: String
}

object Anon_TypeTypeClass {
  @scala.inline
  def apply(`type`: Double, typeName: String, typeClass: DBObjectClass = null): Anon_TypeTypeClass = {
    val __obj = js.Dynamic.literal(typeName = typeName)
    __obj.updateDynamic("type")(`type`)
    if (typeClass != null) __obj.updateDynamic("typeClass")(typeClass)
    __obj.asInstanceOf[Anon_TypeTypeClass]
  }
}

