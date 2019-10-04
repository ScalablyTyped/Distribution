package typings.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oracledbMod {
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Record

  /**
    * Used with connection.execute() to associate values or JavaScript variables to a statement’s bind variables by name.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#executebindParams
    */
  type BindParameters = (Record[
    String, 
    js.UndefOr[BindParameter | String | Double | Date | DBObject | Buffer | Null]
  ]) | (js.Array[js.Any | BindParameter])
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.oracledb.oracledbMod.DBObject
    - typings.oracledb.Anon_Correlation
  */
  type EnqueueMessage = _EnqueueMessage | String | Buffer
}
