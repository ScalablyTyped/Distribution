package typings
package oracledbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssignmentMethod extends js.Object {
  /**
    * Method used to assign keys to objects that are inserted into the collection.
    *
    * @default UUID
    */
  var assignmentMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum length of the key column in bytes. This component applies only to keys of type VARCHAR2.
    *
    * @default 255
    */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Name of the column that stores the document key.
    *
    * @default ID
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the database sequence that generates keys for documents that are inserted into a collection if
    * the key assignment method is SEQUENCE.
    *
    * If you specify the key assignment method as SEQUENCE then you must also specify the name of that sequence.
    * If the specified sequence does not exist then SODA creates it.
    */
  var sequenceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * SQL data type of the column that stores the document key.
    *
    * @default VARCHAR2
    */
  var sqlType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AssignmentMethod {
  @scala.inline
  def apply(
    assignmentMethod: java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    sequenceName: java.lang.String = null,
    sqlType: java.lang.String = null
  ): Anon_AssignmentMethod = {
    val __obj = js.Dynamic.literal()
    if (assignmentMethod != null) __obj.updateDynamic("assignmentMethod")(assignmentMethod)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (sequenceName != null) __obj.updateDynamic("sequenceName")(sequenceName)
    if (sqlType != null) __obj.updateDynamic("sqlType")(sqlType)
    __obj.asInstanceOf[Anon_AssignmentMethod]
  }
}

