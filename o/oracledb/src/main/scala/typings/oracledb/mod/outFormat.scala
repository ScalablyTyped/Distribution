package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The format of query rows fetched when using connection.execute() or connection.queryStream().
  * It affects both ResultSet and non-ResultSet queries. It can be used for top level queries and REF CURSOR output.
  *
  * This can be either of the Oracledb constants oracledb.ARRAY or oracledb.OBJECT.
  *
  * If specified as oracledb.ARRAY, each row is fetched as an array of column values.
  *
  * If specified as oracledb.OBJECT, each row is fetched as a JavaScript object.
  * The object has a property for each column name, with the property value set to the respective column value.
  * The property name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
  * since most applications create tables using unquoted, case-insensitive names.
  *
  * This property may be overridden in an execute() or queryStream() call.
  *
  * @default ARRAY
  */
@JSImport("oracledb", "outFormat")
@js.native
object outFormat extends TopLevel[Double]

