package typings.playcanvas.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constant
  * @type string
  * @name pc.XRSPACE_LOCALFLOOR
  * @description Local Floor - represents a tracking space with a native origin at the floor in a safe position for
  * the user to stand. The y axis equals 0 at floor level, with the x and z position and orientation initialized
  * based on the conventions of the underlying platform. Floor level value might be estimated by the underlying
  * platform. When using this reference space, the user is not expected to move beyond their initial position much,
  * if at all, and tracking is optimized for that purpose. For devices with 6DoF tracking, local-floor reference
  * spaces should emphasize keeping the origin stable relative to the user’s environment.
  */
@JSImport("playcanvas", "XRSPACE_LOCALFLOOR")
@js.native
object XRSPACE_LOCALFLOOR extends TopLevel[String]

