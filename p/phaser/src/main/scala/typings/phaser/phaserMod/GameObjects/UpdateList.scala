package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Update List plugin.
  * 
  * Update Lists belong to a Scene and maintain the list Game Objects to be updated every frame.
  * 
  * Some or all of these Game Objects may also be part of the Scene's [Display List]{@link Phaser.GameObjects.DisplayList}, for Rendering.
  */
@JSImport("phaser", "GameObjects.UpdateList")
@js.native
class UpdateList protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.UpdateList {
  /**
    * 
    * @param scene The Scene that the Update List belongs to.
    */
  def this(scene: Scene) = this()
}
