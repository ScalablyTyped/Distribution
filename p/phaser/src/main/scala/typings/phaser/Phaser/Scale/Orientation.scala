package typings.phaser.Phaser.Scale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends js.Object
/**
  * Phaser Scale Manager constants for orientation.
  */
@JSGlobal("Phaser.Scale.Orientation")
@js.native
object Orientation extends js.Object {
  
  /**
    * A landscape orientation.
    */
  @js.native
  sealed trait LANDSCAPE extends Orientation
  
  /**
    * A portrait orientation.
    */
  @js.native
  sealed trait PORTRAIT extends Orientation
}
