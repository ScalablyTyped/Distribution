package typings.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Used with connection.execute() to associate values or JavaScript variables to a statement’s bind variables by name.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#executebindParams
    */
  type BindParameters = (typings.std.Record[
    java.lang.String, 
    js.UndefOr[
      typings.oracledb.mod.BindParameter | java.lang.String | scala.Double | typings.std.Date | typings.oracledb.mod.DBObject | typings.node.Buffer | scala.Null
    ]
  ]) | (js.Array[js.Any | typings.oracledb.mod.BindParameter])
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.oracledb.mod.DBObject
    - typings.oracledb.AnonCorrelation
  */
  type EnqueueMessage = typings.oracledb.mod._EnqueueMessage | java.lang.String | typings.node.Buffer
}
