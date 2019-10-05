package typings.oracledb.oracledbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user-chosen Connection class value defines a logical name for connections.
  * Most single purpose applications should set connectionClass when using a connection pool or DRCP.
  *
  * When a pooled session has a connection class, Oracle ensures that the session is not shared outside of that connection class.
  *
  * The connection class value is similarly used by Database Resident Connection Pooling (DRCP) to allow or disallow sharing of sessions.
  *
  * For example, where two different kinds of users share one pool, you might set connectionClass to ‘HRPOOL’ for connections that
  * access a Human Resources system, and it might be set to ‘OEPOOL’ for users of an Order Entry system.
  * Users will only be given sessions of the appropriate class, allowing maximal reuse of resources in each case,
  * and preventing any session information leaking between the two systems.
  *
  * If connectionClass is set for a non-pooled connection, the driver name is not recorded in V$ views.
  */
@JSImport("oracledb", "connectionClass")
@js.native
object connectionClass extends TopLevel[String]

