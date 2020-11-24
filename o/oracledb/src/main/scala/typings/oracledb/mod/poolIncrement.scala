package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of connections that are opened whenever a connection request exceeds the number of currently open connections.
  *
  * This property may be overridden when creating a connection pool.
  *
  * @default 1
  */
@JSImport("oracledb", "poolIncrement")
@js.native
object poolIncrement extends TopLevel[Double]
