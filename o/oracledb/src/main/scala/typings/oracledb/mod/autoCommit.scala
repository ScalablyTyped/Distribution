package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If true, the transaction in the current connection is automatically committed at the end of statement execution.
  * This property may be overridden in an execute() call.
  *
  * @default false
  * @since 0.5
  */
@JSImport("oracledb", "autoCommit")
@js.native
object autoCommit extends TopLevel[Boolean]

