package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The minimum number of connections a connection pool maintains, even when there is no activity to the target database.
  *
  * This property may be overridden when creating a connection pool.
  *
  * For pools created with External Authentication or with homogeneous set to false, the number of
  * connections initially created is zero even if a larger value is specified for poolMin.
  * The pool increment is always 1, regardless of the value of poolIncrement.
  * Once the number of open connections exceeds poolMin and connections are idle for more than
  * the poolTimeout seconds, then the number of open connections does not fall below poolMin.
  *
  * @default 0
  */
@JSImport("oracledb", "poolMin")
@js.native
object poolMin extends TopLevel[Double]

