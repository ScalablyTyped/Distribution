package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines whether Oracle Client events mode should be enabled.
  *
  * This property can be overridden in the oracledb.createPool() call and when getting a standalone connection from oracledb.getConnection().
  *
  * Events mode is required for Continuous Query Notification, Fast Application Notification (FAN) and Runtime Load Balancing (RLB).
  *
  * @default true
  * @since 2.2
  */
@JSImport("oracledb", "events")
@js.native
object events extends TopLevel[Boolean]

