package typings.oracledb.oracledbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of seconds after which idle connections (unused in the pool) are terminated.
  * Idle connections are terminated only when the pool is accessed. If the poolTimeout is set to 0,
  * then idle connections are never terminated.
  *
  * This property may be overridden when creating a connection pool.
  *
  * @default 60
  */
@JSImport("oracledb", "poolTimeout")
@js.native
object poolTimeout extends TopLevel[Double]

