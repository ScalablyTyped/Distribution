package typings.oracledb.oracledbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of statements that are cached in the statement cache of each connection.
  *
  * This property may be overridden for specific Pool or Connection objects.
  *
  * In general, set the statement cache to the size of the working set of statements being
  * executed by the application. Statement caching can be disabled by setting the size to 0.
  *
  * @default 30
  */
@JSImport("oracledb", "stmtCacheSize")
@js.native
object stmtCacheSize extends TopLevel[Double]

