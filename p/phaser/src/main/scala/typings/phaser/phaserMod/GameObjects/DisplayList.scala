package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Display List plugin.
  * 
  * Display Lists belong to a Scene and maintain the list of Game Objects to render every frame.
  * 
  * Some of these Game Objects may also be part of the Scene's [Update List]{@link Phaser.GameObjects.UpdateList}, for updating.
  */
@JSImport("phaser", "GameObjects.DisplayList")
@js.native
open class DisplayList protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.DisplayList {
  /**
    * 
    * @param scene The Scene that this Display List belongs to.
    */
  def this(scene: Scene) = this()
}
