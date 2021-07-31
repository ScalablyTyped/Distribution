package typings.phaser.Phaser.GameObjects

import typings.phaser.CreateCallback
import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Structs.List
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Blitter Game Object.
  * 
  * The Blitter Game Object is a special kind of container that creates, updates and manages Bob objects.
  * Bobs are designed for rendering speed rather than flexibility. They consist of a texture, or frame from a texture,
  * a position and an alpha value. You cannot scale or rotate them. They use a batched drawing method for speed
  * during rendering.
  * 
  * A Blitter Game Object has one texture bound to it. Bobs created by the Blitter can use any Frame from this
  * Texture to render with, but they cannot use any other Texture. It is this single texture-bind that allows
  * them their speed.
  * 
  * If you have a need to blast a large volume of frames around the screen then Blitter objects are well worth
  * investigating. They are especially useful for using as a base for your own special effects systems.
  */
@js.native
trait Blitter
  extends StObject
     with GameObject
     with Alpha
     with BlendMode
     with Depth
     with Mask
     with Pipeline
     with ScrollFactor
     with Size
     with Texture
     with Transform
     with Visible {
  
  /**
    * Checks if the given child can render or not, by checking its `visible` and `alpha` values.
    * @param child The Bob to check for rendering.
    */
  def childCanRender(child: Bob): Boolean = js.native
  
  /**
    * The children of this Blitter.
    * This List contains all of the Bob objects created by the Blitter.
    */
  var children: List[Bob] = js.native
  
  /**
    * Removes all Bobs from the children List and clears the dirty flag.
    */
  def clear(): Unit = js.native
  
  /**
    * Creates a new Bob in this Blitter.
    * 
    * The Bob is created at the given coordinates, relative to the Blitter and uses the given frame.
    * A Bob can use any frame belonging to the texture bound to the Blitter.
    * @param x The x position of the Bob. Bob coordinate are relative to the position of the Blitter object.
    * @param y The y position of the Bob. Bob coordinate are relative to the position of the Blitter object.
    * @param frame The Frame the Bob will use. It _must_ be part of the Texture the parent Blitter object is using.
    * @param visible Should the created Bob render or not? Default true.
    * @param index The position in the Blitters Display List to add the new Bob at. Defaults to the top of the list.
    */
  def create(x: Double, y: Double): Bob = js.native
  def create(x: Double, y: Double, frame: String): Bob = js.native
  def create(x: Double, y: Double, frame: String, visible: Boolean): Bob = js.native
  def create(x: Double, y: Double, frame: String, visible: Boolean, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: String, visible: Unit, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: Unit, visible: Boolean): Bob = js.native
  def create(x: Double, y: Double, frame: Unit, visible: Boolean, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: Unit, visible: Unit, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: Frame): Bob = js.native
  def create(x: Double, y: Double, frame: Frame, visible: Boolean): Bob = js.native
  def create(x: Double, y: Double, frame: Frame, visible: Boolean, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: Frame, visible: Unit, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: integer): Bob = js.native
  def create(x: Double, y: Double, frame: integer, visible: Boolean): Bob = js.native
  def create(x: Double, y: Double, frame: integer, visible: Boolean, index: integer): Bob = js.native
  def create(x: Double, y: Double, frame: integer, visible: Unit, index: integer): Bob = js.native
  
  /**
    * Creates multiple Bob objects within this Blitter and then passes each of them to the specified callback.
    * @param callback The callback to invoke after creating a bob. It will be sent two arguments: The Bob and the index of the Bob.
    * @param quantity The quantity of Bob objects to create.
    * @param frame The Frame the Bobs will use. It must be part of the Blitter Texture.
    * @param visible Should the created Bob render or not? Default true.
    */
  def createFromCallback(callback: CreateCallback, quantity: integer): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: String): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: String, visible: Boolean): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: js.Array[Frame | String | integer]): js.Array[Bob] = js.native
  def createFromCallback(
    callback: CreateCallback,
    quantity: integer,
    frame: js.Array[Frame | String | integer],
    visible: Boolean
  ): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: Unit, visible: Boolean): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: Frame): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: Frame, visible: Boolean): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: integer): js.Array[Bob] = js.native
  def createFromCallback(callback: CreateCallback, quantity: integer, frame: integer, visible: Boolean): js.Array[Bob] = js.native
  
  /**
    * Creates multiple Bobs in one call.
    * 
    * The amount created is controlled by a combination of the `quantity` argument and the number of frames provided.
    * 
    * If the quantity is set to 10 and you provide 2 frames, then 20 Bobs will be created. 10 with the first
    * frame and 10 with the second.
    * @param quantity The quantity of Bob objects to create.
    * @param frame The Frame the Bobs will use. It must be part of the Blitter Texture.
    * @param visible Should the created Bob render or not? Default true.
    */
  def createMultiple(quantity: integer): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: String): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: String, visible: Boolean): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: js.Array[Frame | String | integer]): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: js.Array[Frame | String | integer], visible: Boolean): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: Unit, visible: Boolean): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: Frame): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: Frame, visible: Boolean): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: integer): js.Array[Bob] = js.native
  def createMultiple(quantity: integer, frame: integer, visible: Boolean): js.Array[Bob] = js.native
  
  /**
    * Is the Blitter considered dirty?
    * A 'dirty' Blitter has had its child count changed since the last frame.
    */
  var dirty: Boolean = js.native
  
  /**
    * Returns an array of Bobs to be rendered.
    * If the Blitter is dirty then a new list is generated and stored in `renderList`.
    */
  def getRenderList(): js.Array[Bob] = js.native
  
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
}
