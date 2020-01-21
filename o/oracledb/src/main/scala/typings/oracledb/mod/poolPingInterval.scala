package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When a pool getConnection() is called and the connection has been idle in the pool for at least
  * poolPingInterval seconds, node-oracledb internally “pings” the database to check the connection is alive.
  * After a ping, an unusable connection is destroyed and a usable one is returned by getConnection().
  * Connection pinging improves the chance a pooled connection is valid when it is first used because
  * identified unusable connections will not be returned to the application.
  *
  * This property may be overridden when creating a connection pool.
  *
  * @default 60
  * @since 1.12
  */
@JSImport("oracledb", "poolPingInterval")
@js.native
object poolPingInterval extends TopLevel[Double]

