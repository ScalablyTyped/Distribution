package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Game Object Creator is a Scene plugin that allows you to quickly create many common
  * types of Game Objects and return them. Unlike the Game Object Factory, they are not automatically
  * added to the Scene.
  * 
  * Game Objects directly register themselves with the Creator and inject their own creation
  * methods into the class.
  */
@JSImport("phaser", "GameObjects.GameObjectCreator")
@js.native
class GameObjectCreator protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.GameObjectCreator {
  /**
    * 
    * @param scene The Scene to which this Game Object Factory belongs.
    */
  def this(scene: Scene) = this()
}
