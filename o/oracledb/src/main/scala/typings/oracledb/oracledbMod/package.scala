package typings.oracledb

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oracledbMod {
  /**
    * Used with connection.execute() to associate values or JavaScript variables to a statement’s bind variables by name.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#executebindParams
    */
  type BindParameters = (Record[String, BindParameter | String | Double | Null]) | (js.Array[js.Any | BindParameter])
}
