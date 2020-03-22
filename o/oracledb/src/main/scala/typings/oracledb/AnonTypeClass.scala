package typings.oracledb

import typings.oracledb.mod.DBObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeClass extends js.Object {
  /** One of the DB_TYPE constants. */
  var `type`: Double
  /** Set if the value of type is a DBObject. */
  var typeClass: js.UndefOr[DBObjectClass] = js.undefined
  /** Type, such as 'VARCHAR2' or 'NUMBER'. */
  var typeName: String
}

object AnonTypeClass {
  @scala.inline
  def apply(`type`: Double, typeName: String, typeClass: DBObjectClass = null): AnonTypeClass = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeClass != null) __obj.updateDynamic("typeClass")(typeClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeClass]
  }
}

