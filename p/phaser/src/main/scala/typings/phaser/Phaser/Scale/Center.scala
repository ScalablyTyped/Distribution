package typings.phaser.Phaser.Scale

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Center extends js.Object

/**
  * Phaser Scale Manager constants for centering the game canvas.
  */
@JSGlobal("Phaser.Scale.Center")
@js.native
object Center extends js.Object {
  /**
    * The game canvas is centered both horizontally and vertically within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  @js.native
  sealed trait CENTER_BOTH extends Center
  
  /**
    * The game canvas is centered horizontally within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  @js.native
  sealed trait CENTER_HORIZONTALLY extends Center
  
  /**
    * The game canvas is centered both vertically within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  @js.native
  sealed trait CENTER_VERTICALLY extends Center
  
  /**
    * The game canvas is not centered within the parent by Phaser.
    * You can still center it yourself via CSS.
    */
  @js.native
  sealed trait NO_CENTER extends Center
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Center with Double] = js.native
  /* 1 */ @js.native
  object CENTER_BOTH
    extends TopLevel[typings.phaser.Phaser.Scale.Center.CENTER_BOTH with Double]
  
  /* 2 */ @js.native
  object CENTER_HORIZONTALLY
    extends TopLevel[typings.phaser.Phaser.Scale.Center.CENTER_HORIZONTALLY with Double]
  
  /* 3 */ @js.native
  object CENTER_VERTICALLY
    extends TopLevel[typings.phaser.Phaser.Scale.Center.CENTER_VERTICALLY with Double]
  
  /* 0 */ @js.native
  object NO_CENTER
    extends TopLevel[typings.phaser.Phaser.Scale.Center.NO_CENTER with Double]
  
}

