package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  /**
    * Either a boolean or string. If true, tables will be nested objects. If string (e.g. '_'), tables will be
    * nested as tableName_fieldName
    */
  var nestTables: js.UndefOr[js.Any] = js.undefined
  /**
    * The SQL for the query
    */
  var sql: java.lang.String
  /**
    * Every operation takes an optional inactivity timeout option. This allows you to specify appropriate timeouts for
    * operations. It is important to note that these timeouts are not part of the MySQL protocol, and rather timeout
    * operations through the client. This means that when a timeout is reached, the connection it occurred on will be
    * destroyed and no further operations can be performed.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines if column values should be converted to native JavaScript types. It is not recommended (and may go away / change in the future)
    * to disable type casting, but you can currently do so on either the connection or query level. (Default: true)
    *
    * You can also specify a function (field: any, next: () => void) => {} to do the type casting yourself.
    *
    * WARNING: YOU MUST INVOKE the parser using one of these three field functions in your custom typeCast callback. They can only be called once.
    *
    * field.string()
    * field.buffer()
    * field.geometry()
    *
    * are aliases for
    *
    * parser.parseLengthCodedString()
    * parser.parseLengthCodedBuffer()
    * parser.parseGeometryValue()
    *
    * You can find which field function you need to use by looking at: RowDataPacket.prototype._typeCast
    */
  var typeCast: js.UndefOr[TypeCast] = js.undefined
  /**
    * Values for template query
    */
  var values: js.UndefOr[js.Any] = js.undefined
}

