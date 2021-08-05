package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Game Object Factory is a Scene plugin that allows you to quickly create many common
  * types of Game Objects and have them automatically registered with the Scene.
  * 
  * Game Objects directly register themselves with the Factory and inject their own creation
  * methods into the class.
  */
@JSImport("phaser", "GameObjects.GameObjectFactory")
@js.native
class GameObjectFactory protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.GameObjectFactory {
  /**
    * 
    * @param scene The Scene to which this Game Object Factory belongs.
    */
  def this(scene: Scene) = this()
}
object GameObjectFactory {
  
  @JSImport("phaser", "GameObjects.GameObjectFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static method called directly by the Game Object factory functions.
    * With this method you can register a custom GameObject factory in the GameObjectFactory,
    * providing a name (`factoryType`) and the constructor (`factoryFunction`) in order
    * to be called when you call to Phaser.Scene.add[ factoryType ] method.
    * @param factoryType The key of the factory that you will use to call to Phaser.Scene.add[ factoryType ] method.
    * @param factoryFunction The constructor function to be called when you invoke to the Phaser.Scene.add method.
    */
  /* static member */
  inline def register(factoryType: String, factoryFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(factoryType.asInstanceOf[js.Any], factoryFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Static method called directly by the Game Object factory functions.
    * With this method you can remove a custom GameObject factory registered in the GameObjectFactory,
    * providing a its `factoryType`.
    * @param factoryType The key of the factory that you want to remove from the GameObjectFactory.
    */
  /* static member */
  inline def remove(factoryType: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(factoryType.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
