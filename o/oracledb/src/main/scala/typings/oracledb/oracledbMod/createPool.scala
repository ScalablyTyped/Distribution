package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oracledb", "createPool")
@js.native
object createPool extends js.Object {
  /**
    * This method creates a pool of connections with the specified user name, password and connection string.
    * A pool is typically created once during application initialization.
    *
    * Internally, createPool() creates an Oracle Call Interface Session Pool for each Pool object.
    *
    * The default properties may be overridden by specifying new properties in the poolAttrs parameter.
    *
    * It is possible to add pools to the pool cache when calling createPool().
    * This allows pools to later be accessed by name, removing the need to pass the pool object through code.
    *
    * A pool should be terminated with the pool.close() call.
    *
    * From node-oracledb 3.1.0, the createPool() error callback will return a DPI-1047 error if node-oracledb cannot load Oracle Client libraries.
    * Previous versions threw this error from require('oracledb').
    *
    * @param poolAttributes Provides connection credentials and pool-specific configuration properties, overriding the defualt pooling properties of the Oracledb object.
    */
  def apply(poolAttributes: PoolAttributes): js.Promise[Pool] = js.native
  def apply(poolAttributes: PoolAttributes, callback: js.Function2[/* error */ DBError, /* pool */ Pool, Unit]): Unit = js.native
}

