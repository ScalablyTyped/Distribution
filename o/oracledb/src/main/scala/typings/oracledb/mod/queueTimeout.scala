package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of milliseconds after which connection requests waiting in the connection request queue are terminated.
  * If queueTimeout is 0, then queued connection requests are never terminated.
  *
  * This property may be overridden when creating a connection pool.
  *
  * @default 60000
  * @since 1.7
  */
@JSImport("oracledb", "queueTimeout")
@js.native
object queueTimeout extends TopLevel[Double]

