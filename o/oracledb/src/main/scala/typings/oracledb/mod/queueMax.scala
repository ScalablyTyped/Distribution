package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The maximum number of pending pool.getConnection() calls that can be queued.
  * 
  * When the number of pool.getConnection() calls that have been queued waiting for an available connection reaches queueMax,
  * then any future pool.getConnection() calls will immediately return an error and will not be queued.
  * 
  * If queueMax is -1, then the queue length is not limited.
  * 
  * This property may be overridden when creating a connection pool.
  * 
  * @default 500
  */
@JSImport("oracledb", "queueMax")
@js.native
object queueMax extends TopLevel[Double]
