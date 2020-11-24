package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The maximum number of connections per shard for connection pools. This ensures that the pool is balanced towards each shard.
  * 
  * This property may be overridden when creating a connection pool.
  * 
  * When this property is set, and a new connection request would cause the number of connections to the target shard to exceed the limit,
  * then that new connection request will block until a suitable connection has been released back to the pool.
  * Importantly, when blocked, the queueTimeout value will be ignored and the pending connection request will consume one worker thread.
  * 
  * @since 4.1
  */
@JSImport("oracledb", "poolMaxPerShard")
@js.native
object poolMaxPerShard extends TopLevel[Double]
