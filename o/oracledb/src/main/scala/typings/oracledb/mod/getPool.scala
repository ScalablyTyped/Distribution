package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oracledb", "getPool")
@js.native
object getPool extends js.Object {
  
  /**
    * Retrieves a previously created pool from the connection pool cache. Note that this is a synchronous method.
    *
    * @param poolAlias
    *
    * The pool alias of the pool to retrieve from the connection pool cache.
    *
    * @default default
    */
  def apply(): Pool = js.native
  def apply(poolAlias: String): Pool = js.native
}
