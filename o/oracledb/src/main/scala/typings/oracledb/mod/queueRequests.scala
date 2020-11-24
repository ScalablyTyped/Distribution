package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This property was removed in node-oracledb 3.0 and queuing was always enabled.
  * In node-oracledb 5.0, set queueMax to 0 to disable queuing.
  * 
  * @see https://oracle.github.io/node-oracledb/doc/api.html#connpoolqueue
  */
@JSImport("oracledb", "queueRequests")
@js.native
object queueRequests extends TopLevel[Double]
