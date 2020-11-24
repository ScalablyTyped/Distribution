package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The maximum number of connections to which a connection pool can grow.
  *
  * This property may be overridden when creating a connection pool.
  *
  * Importantly, if you increase poolMax you should also increase the number of threads available to node-oracledb.
  *
  * @default 4
  */
@JSImport("oracledb", "poolMax")
@js.native
object poolMax extends TopLevel[Double]
