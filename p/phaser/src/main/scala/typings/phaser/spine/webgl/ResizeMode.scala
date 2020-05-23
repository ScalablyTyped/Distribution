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
  
}

