package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If true, connections will be established using external authentication.
  *
  * The user and password properties should not be set when externalAuth is true.
  *
  * This property can be overridden in the oracledb.createPool() call and when getting a standalone connection from oracledb.getConnection().
  *
  * @default false
  * @since 0.5
  */
@JSImport("oracledb", "externalAuth")
@js.native
object externalAuth extends TopLevel[Boolean]

