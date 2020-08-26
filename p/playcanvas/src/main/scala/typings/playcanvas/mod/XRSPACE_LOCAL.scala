package typings.playcanvas.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Local - represents a tracking space with a native origin near the viewer at the time of creation.
  * The exact position and orientation will be initialized based on the conventions of the underlying platform.
  * When using this reference space the user is not expected to move beyond their initial position much, if at all,
  * and tracking is optimized for that purpose. For devices with 6DoF tracking, local reference spaces should
  * emphasize keeping the origin stable relative to the user’s environment.
  */
@JSImport("playcanvas", "XRSPACE_LOCAL")
@js.native
object XRSPACE_LOCAL extends TopLevel[String]

