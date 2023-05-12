package typings.phaser.mod.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Game Object Creator is a Scene plugin that allows you to quickly create many common
  * types of Game Objects and return them using a configuration object, rather than
  * having to specify a limited set of parameters such as with the GameObjectFactory.
  * 
  * Game Objects made via this class are automatically added to the Scene and Update List
  * unless you explicitly set the `add` property in the configuration object to `false`.
  */
@JSImport("phaser", "GameObjects.GameObjectCreator")
@js.native
open class GameObjectCreator protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.GameObjectCreator {
  /**
    * 
    * @param scene The Scene to which this Game Object Factory belongs.
    */
  def this(scene: Scene) = this()
}
object GameObjectCreator {
  
  @JSImport("phaser", "GameObjects.GameObjectCreator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static method called directly by the Game Object creator functions.
    * With this method you can register a custom GameObject factory in the GameObjectCreator,
    * providing a name (`factoryType`) and the constructor (`factoryFunction`) in order
    * to be called when you invoke Phaser.Scene.make[ factoryType ] method.
    * @param factoryType The key of the factory that you will use to call to Phaser.Scene.make[ factoryType ] method.
    * @param factoryFunction The constructor function to be called when you invoke to the Phaser.Scene.make method.
    */
  /* static member */
  inline def register(factoryType: String, factoryFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(factoryType.asInstanceOf[js.Any], factoryFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Static method called directly by the Game Object Creator functions.
    * 
    * With this method you can remove a custom Game Object Creator that has been previously
    * registered in the Game Object Creator. Pass in its `factoryType` in order to remove it.
    * @param factoryType The key of the factory that you want to remove from the GameObjectCreator.
    */
  /* static member */
  inline def remove(factoryType: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(factoryType.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
