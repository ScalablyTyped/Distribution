package typings.phaser.spine.webgl

import org.scalablytyped.runtime.TopLevel
import typings.phaser.spine.webgl.ResizeMode.Expand
import typings.phaser.spine.webgl.ResizeMode.Fit
import typings.phaser.spine.webgl.ResizeMode.Stretch
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResizeMode with Double] = js.native
  /* 1 */ @js.native
  object Expand extends TopLevel[Expand with Double]
  
  /* 2 */ @js.native
  object Fit extends TopLevel[Fit with Double]
  
  /* 0 */ @js.native
  object Stretch extends TopLevel[Stretch with Double]
  
}

