package typings.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResizeMode extends js.Object

@JSGlobal("spine.webgl.ResizeMode")
@js.native
object ResizeMode extends js.Object {
  @js.native
  sealed trait Expand extends ResizeMode
  
  @js.native
  sealed trait Fit extends ResizeMode
  
  @js.native
  sealed trait Stretch extends ResizeMode
  
  /* 1 */ val Expand: typings.phaser.spine.webgl.ResizeMode.Expand with Double = js.native
  /* 2 */ val Fit: typings.phaser.spine.webgl.ResizeMode.Fit with Double = js.native
  /* 0 */ val Stretch: typings.phaser.spine.webgl.ResizeMode.Stretch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResizeMode with Double] = js.native
}

