package typings.oracledb.oracledbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The maximum number of rows that are fetched by a query with connection.execute() when not using a ResultSet.
  * Rows beyond this limit are not fetched from the database. A value of 0 means there is no limit.
  *
  * This property may be overridden in an execute() call.
  *
  * To improve database efficiency, SQL queries should use a row limiting clause like OFFSET / FETCH or equivalent.
  * The maxRows property can be used to stop badly coded queries from returning unexpectedly large numbers of rows.
  *
  * When the number of query rows is relatively big, or can not be predicted, it is recommended to use
  * a ResultSet or queryStream(). This allows applications to process rows in smaller chunks or individually,
  * preventing the Node.js memory limit being exceeded or query results being unexpectedly truncated by a
  * maxRows limit.
  *
  * @default 0 (unlimited)
  */
@JSImport("oracledb", "maxRows")
@js.native
object maxRows extends TopLevel[Double]

