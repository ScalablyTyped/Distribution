package typings
package phaserLib.PhaserNs.GameObjectsNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the texture of a Game Object.
  */
@js.native
trait Texture extends js.Object {
  /**
    * The Texture Frame this Game Object is using to render with.
    */
  var frame: phaserLib.PhaserNs.TexturesNs.Frame = js.native
  /**
    * The Texture this Game Object is using to render with.
    */
  var texture: phaserLib.PhaserNs.TexturesNs.Texture | phaserLib.PhaserNs.TexturesNs.CanvasTexture = js.native
  /**
    * Sets the frame this Game Object will use to render with.
    * 
    * The Frame has to belong to the current Texture being used.
    * 
    * It can be either a string or an index.
    * 
    * Calling `setFrame` will modify the `width` and `height` properties of your Game Object.
    * It will also change the `origin` if the Frame has a custom pivot point, as exported from packages like Texture Packer.
    * @param frame The name or index of the frame within the Texture.
    * @param updateSize Should this call adjust the size of the Game Object? Default true.
    * @param updateOrigin Should this call adjust the origin of the Game Object? Default true.
    */
  def setFrame(frame: java.lang.String): this.type = js.native
  def setFrame(frame: java.lang.String, updateSize: scala.Boolean): this.type = js.native
  def setFrame(frame: java.lang.String, updateSize: scala.Boolean, updateOrigin: scala.Boolean): this.type = js.native
  def setFrame(frame: phaserLib.integer): this.type = js.native
  def setFrame(frame: phaserLib.integer, updateSize: scala.Boolean): this.type = js.native
  def setFrame(frame: phaserLib.integer, updateSize: scala.Boolean, updateOrigin: scala.Boolean): this.type = js.native
  /**
    * Sets the texture and frame this Game Object will use to render with.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    */
  def setTexture(key: java.lang.String): this.type = js.native
  def setTexture(key: java.lang.String, frame: java.lang.String): this.type = js.native
  def setTexture(key: java.lang.String, frame: phaserLib.integer): this.type = js.native
}

