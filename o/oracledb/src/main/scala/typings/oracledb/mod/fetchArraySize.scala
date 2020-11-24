package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This property sets the size of an internal buffer used for fetching query rows from Oracle Database.
  * Changing it may affect query performance but does not affect how many rows are returned to the application.
  *
  * The property is used during the default direct fetches, during ResultSet getRow() calls, and for queryStream(). It is not used for getRows().
  *
  * Increasing this value reduces the number of round-trips to the database but increases memory usage for each data fetch.
  * For queries that return a large number of rows, higher values of fetchArraySize may give better performance.
  * For queries that only return a few rows, reduce the value of fetchArraySize to minimize the amount of memory management during data fetches.
  * JavaScript memory fragmentation may occur in some cases.
  *
  * For direct fetches (those using execute() option resultSet: false), the internal buffer size will be based on the lesser of maxRows and fetchArraySize.
  *
  * @default 100
  * @since 2.0
  */
@JSImport("oracledb", "fetchArraySize")
@js.native
object fetchArraySize extends TopLevel[Double]
