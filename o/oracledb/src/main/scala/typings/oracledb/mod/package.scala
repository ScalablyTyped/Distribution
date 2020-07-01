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
      typings.oracledb.mod.BindParameter | java.lang.String | scala.Double | typings.std.Date | typings.oracledb.mod.DBObjectIN[js.Any] | typings.node.Buffer | scala.Null
    ]
  ]) | (js.Array[js.Any | typings.oracledb.mod.BindParameter])
  /**
    * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
    * @since 4.0
    */
  type DBObjectIN[T] = typings.oracledb.oracledbStrings.DBObject_IN with org.scalablytyped.runtime.TopLevel[T] with typings.oracledb.mod.BaseDBObject[T]
  /**
    * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
    * @since 4.0
    */
  type DBObjectOUT[T] = typings.oracledb.oracledbStrings.DBObject_OUT with org.scalablytyped.runtime.TopLevel[js.Any] with typings.oracledb.mod.BaseDBObject[T]
  type EnqueueMessage[T] = java.lang.String | typings.node.Buffer | typings.oracledb.mod.DBObjectIN[T] | typings.oracledb.anon.Correlation[T]
}
