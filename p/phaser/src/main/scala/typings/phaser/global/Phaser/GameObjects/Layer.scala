package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Layer Game Object.
  * 
  * A Layer is a special type of Game Object that acts as a Display List. You can add any type of Game Object
  * to a Layer, just as you would to a Scene. Layers can be used to visually group together 'layers' of Game
  * Objects:
  * 
  * ```javascript
  * const spaceman = this.add.sprite(150, 300, 'spaceman');
  * const bunny = this.add.sprite(400, 300, 'bunny');
  * const elephant = this.add.sprite(650, 300, 'elephant');
  * 
  * const layer = this.add.layer();
  * 
  * layer.add([ spaceman, bunny, elephant ]);
  * ```
  * 
  * The 3 sprites in the example above will now be managed by the Layer they were added to. Therefore,
  * if you then set `layer.setVisible(false)` they would all vanish from the display.
  * 
  * You can also control the depth of the Game Objects within the Layer. For example, calling the
  * `setDepth` method of a child of a Layer will allow you to adjust the depth of that child _within the
  * Layer itself_, rather than the whole Scene. The Layer, too, can have its depth set as well.
  * 
  * The Layer class also offers many different methods for manipulating the list, such as the
  * methods `moveUp`, `moveDown`, `sendToBack`, `bringToTop` and so on. These allow you to change the
  * display list position of the Layers children, causing it to adjust the order in which they are
  * rendered. Using `setDepth` on a child allows you to override this.
  * 
  * Layers can have Post FX Pipelines set, which allows you to easily enable a post pipeline across
  * a whole range of children, which, depending on the effect, can often be far more efficient that doing so
  * on a per-child basis.
  * 
  * Layers have no position or size within the Scene. This means you cannot enable a Layer for
  * physics or input, or change the position, rotation or scale of a Layer. They also have no scroll
  * factor, texture, tint, origin, crop or bounds.
  * 
  * If you need those kind of features then you should use a Container instead. Containers can be added
  * to Layers, but Layers cannot be added to Containers.
  * 
  * However, you can set the Alpha, Blend Mode, Depth, Mask and Visible state of a Layer. These settings
  * will impact all children being rendered by the Layer.
  */
@JSGlobal("Phaser.GameObjects.Layer")
@js.native
open class Layer protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Layer {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param children An optional array of Game Objects to add to this Layer.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, children: js.Array[typings.phaser.Phaser.GameObjects.GameObject]) = this()
  
  /**
    * The depth of this Game Object within the Scene. Ensure this value is only ever set to a number data-type.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  var depth: Double = js.native
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object. Ensure this value is only ever a number data-type.
    */
  /* CompleteClass */
  override def setDepth(value: Double): this.type = js.native
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
