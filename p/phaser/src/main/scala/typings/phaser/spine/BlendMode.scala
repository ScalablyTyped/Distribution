package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendMode extends js.Object

@JSGlobal("spine.BlendMode")
@js.native
object BlendMode extends js.Object {
  @js.native
  sealed trait Additive extends BlendMode
  
  @js.native
  sealed trait Multiply extends BlendMode
  
  @js.native
  sealed trait Normal extends BlendMode
  
  @js.native
  sealed trait Screen extends BlendMode
  
}

