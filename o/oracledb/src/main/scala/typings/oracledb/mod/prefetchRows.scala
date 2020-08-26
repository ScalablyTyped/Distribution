package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a query tuning option to set the number of additional rows the underlying Oracle Client library
  * fetches during the internal initial statement execution phase of a query. The prefetch size does not affect when, or how many,
  * rows are returned by node-oracledb to the application.
  * 
  * The prefetchRows attribute can be used in conjunction with oracledb.fetchArraySize to tune query performance, memory use,
  * and to reduce the number of round-trip calls needed to return query results.
  * 
  * The prefetchRows value is ignored in some cases, such as when the query involves a LOB.
  * 
  * This property may be overridden in an connection.execute() call, which is preferred usage if you need to change the value.
  * 
  * This attribute is not used in node-oracledb version 2, 3 or 4. In those versions use only oracledb.fetchArraySize instead.
  * 
  * @default 2
  * @see https://oracle.github.io/node-oracledb/doc/api.html#rowfetching
  */
@JSImport("oracledb", "prefetchRows")
@js.native
object prefetchRows extends TopLevel[Double]

