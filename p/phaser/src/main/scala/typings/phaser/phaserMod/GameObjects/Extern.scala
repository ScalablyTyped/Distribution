package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Extern Game Object is a special type of Game Object that allows you to pass
  * rendering off to a 3rd party.
  * 
  * When you create an Extern and place it in the display list of a Scene, the renderer will
  * process the list as usual. When it finds an Extern it will flush the current batch,
  * clear down the pipeline and prepare a transform matrix which your render function can
  * take advantage of, if required.
  * 
  * The WebGL context is then left is a 'clean' state, ready for you to bind your own shaders,
  * or draw to it, whatever you wish to do. Once you've finished, you should free-up any
  * of your resources. The Extern will then rebind the Phaser pipeline and carry on 
  * rendering the display list.
  * 
  * Although this object has lots of properties such as Alpha, Blend Mode and Tint, none of
  * them are used during rendering unless you take advantage of them in your own render code.
  */
@JSImport("phaser", "GameObjects.Extern")
@js.native
class Extern protected ()
  extends typings.phaser.Phaser.GameObjects.Extern {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    */
  def this(scene: Scene) = this()
}

