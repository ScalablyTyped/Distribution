package typings.phaser.Phaser.GameObjects

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Data.DataManager
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.Components.AlphaSingle
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Physics.Arcade.Body
import typings.phaser.Phaser.Physics.Arcade.StaticBody
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Structs.List
import typings.phaser.Phaser.Types.GameObjects.JSONGameObject
import typings.phaser.Phaser.Types.Input.InteractiveObject
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
@js.native
trait Layer
  extends StObject
     with List[GameObject]
     with AlphaSingle
     with BlendMode
     with Depth
     with Mask
     with Pipeline
     with Visible {
  
  /**
    * The active state of this Game Object.
    * A Game Object with an active state of `true` is processed by the Scenes UpdateList, if added to it.
    * An active object is one which is having its logic and internal systems updated.
    */
  var active: Boolean = js.native
  
  /**
    * This callback is invoked when this Game Object is added to a Scene.
    * 
    * Can be overriden by custom Game Objects, but be aware of some Game Objects that
    * will use this, such as Sprites, to add themselves into the Update List.
    * 
    * You can also listen for the `ADDED_TO_SCENE` event from this Game Object.
    */
  def addedToScene(): Unit = js.native
  
  /**
    * This property is kept purely so a Layer has the same
    * shape as a Game Object. You cannot give a Layer a physics body.
    */
  var body: Body | StaticBody | BodyType = js.native
  
  /**
    * A bitmask that controls if this Game Object is drawn by a Camera or not.
    * Not usually set directly, instead call `Camera.ignore`, however you can
    * set this property directly using the Camera.id property:
    */
  var cameraFilter: Double = js.native
  
  /**
    * A Data Manager.
    * It allows you to store, query and get key/value paired information specific to this Game Object.
    * `null` by default. Automatically created if you use `getData` or `setData` or `setDataEnabled`.
    */
  var data: DataManager = js.native
  
  /**
    * Immediately sorts the display list if the flag is set.
    */
  def depthSort(): Unit = js.native
  
  /**
    * A Layer cannot be enabled for input.
    * 
    * This method does nothing and is kept to ensure
    * the Layer has the same shape as a Game Object.
    */
  def disableInteractive(): this.type = js.native
  
  /**
    * Holds a reference to the Display List that contains this Game Object.
    * 
    * This is set automatically when this Game Object is added to a Scene or Layer.
    * 
    * You should treat this property as being read-only.
    */
  var displayList: DisplayList | Layer = js.native
  
  /**
    * A reference to the Scene Event Emitter.
    */
  var events: EventEmitter = js.native
  
  /**
    * Returns an array which contains all Game Objects within this Layer.
    * 
    * This is a reference to the main list array, not a copy of it, so be careful not to modify it.
    */
  def getChildren(): js.Array[GameObject] = js.native
  
  /**
    * Retrieves the value for the given key in this Game Objects Data Manager, or undefined if it doesn't exist.
    * 
    * You can also access values via the `values` object. For example, if you had a key called `gold` you can do either:
    * 
    * ```javascript
    * sprite.getData('gold');
    * ```
    * 
    * Or access the value directly:
    * 
    * ```javascript
    * sprite.data.values.gold;
    * ```
    * 
    * You can also pass in an array of keys, in which case an array of values will be returned:
    * 
    * ```javascript
    * sprite.getData([ 'gold', 'armor', 'health' ]);
    * ```
    * 
    * This approach is useful for destructuring arrays in ES6.
    * @param key The key of the value to retrieve, or an array of keys.
    */
  def getData(key: String): Any = js.native
  def getData(key: js.Array[String]): Any = js.native
  
  /**
    * Returns an array containing the display list index of either this Game Object, or if it has one,
    * its parent Container. It then iterates up through all of the parent containers until it hits the
    * root of the display list (which is index 0 in the returned array).
    * 
    * Used internally by the InputPlugin but also useful if you wish to find out the display depth of
    * this Game Object and all of its ancestors.
    */
  def getIndexList(): js.Array[Double] = js.native
  
  /**
    * This Game Object will ignore all calls made to its destroy method if this flag is set to `true`.
    * This includes calls that may come from a Group, Container or the Scene itself.
    * While it allows you to persist a Game Object across Scenes, please understand you are entirely
    * responsible for managing references to and from this Game Object.
    */
  var ignoreDestroy: Boolean = js.native
  
  /**
    * Increase a value for the given key within this Game Objects Data Manager. If the key doesn't already exist in the Data Manager then it is increased from 0.
    * 
    * If the Game Object has not been enabled for data (via `setDataEnabled`) then it will be enabled
    * before setting the value.
    * 
    * If the key doesn't already exist in the Data Manager then it is created.
    * 
    * When the value is first set, a `setdata` event is emitted from this Game Object.
    * @param key The key to increase the value for.
    * @param data The value to increase for the given key.
    */
  def incData(key: String): this.type = js.native
  def incData(key: String, data: Any): this.type = js.native
  def incData(key: js.Object): this.type = js.native
  def incData(key: js.Object, data: Any): this.type = js.native
  
  /**
    * This property is kept purely so a Layer has the same
    * shape as a Game Object. You cannot input enable a Layer.
    */
  var input: InteractiveObject = js.native
  
  /**
    * The name of this Game Object.
    * Empty by default and never populated by Phaser, this is left for developers to use.
    */
  var name: String = js.native
  
  /**
    * A Layer cannot be placed inside a Container.
    * 
    * This property is kept purely so a Layer has the same
    * shape as a Game Object.
    */
  var parentContainer: Container = js.native
  
  /**
    * Force a sort of the display list on the next call to depthSort.
    */
  def queueDepthSort(): Unit = js.native
  
  /**
    * A Layer cannot be enabled for input.
    * 
    * This method does nothing and is kept to ensure
    * the Layer has the same shape as a Game Object.
    */
  def removeInteractive(): this.type = js.native
  
  /**
    * This callback is invoked when this Game Object is removed from a Scene.
    * 
    * Can be overriden by custom Game Objects, but be aware of some Game Objects that
    * will use this, such as Sprites, to removed themselves from the Update List.
    * 
    * You can also listen for the `REMOVED_FROM_SCENE` event from this Game Object.
    */
  def removedFromScene(): Unit = js.native
  
  /**
    * The flags that are compared against `RENDER_MASK` to determine if this Game Object will render or not.
    * The bits are 0001 | 0010 | 0100 | 1000 set by the components Visible, Alpha, Transform and Texture respectively.
    * If those components are not used by your custom class then you can use this bitmask as you wish.
    */
  var renderFlags: Double = js.native
  
  /**
    * A reference to the Scene to which this Game Object belongs.
    * 
    * Game Objects can only belong to one Scene.
    * 
    * You should consider this property as being read-only. You cannot move a
    * Game Object to another Scene by simply changing it.
    */
  var scene: Scene = js.native
  
  /**
    * Sets the `active` property of this Game Object and returns this Game Object for further chaining.
    * A Game Object with its `active` property set to `true` will be updated by the Scenes UpdateList.
    * @param value True if this Game Object should be set as active, false if not.
    */
  def setActive(value: Boolean): this.type = js.native
  
  /**
    * Allows you to store a key value pair within this Game Objects Data Manager.
    * 
    * If the Game Object has not been enabled for data (via `setDataEnabled`) then it will be enabled
    * before setting the value.
    * 
    * If the key doesn't already exist in the Data Manager then it is created.
    * 
    * ```javascript
    * sprite.setData('name', 'Red Gem Stone');
    * ```
    * 
    * You can also pass in an object of key value pairs as the first argument:
    * 
    * ```javascript
    * sprite.setData({ name: 'Red Gem Stone', level: 2, owner: 'Link', gold: 50 });
    * ```
    * 
    * To get a value back again you can call `getData`:
    * 
    * ```javascript
    * sprite.getData('gold');
    * ```
    * 
    * Or you can access the value directly via the `values` property, where it works like any other variable:
    * 
    * ```javascript
    * sprite.data.values.gold += 50;
    * ```
    * 
    * When the value is first set, a `setdata` event is emitted from this Game Object.
    * 
    * If the key already exists, a `changedata` event is emitted instead, along an event named after the key.
    * For example, if you updated an existing key called `PlayerLives` then it would emit the event `changedata-PlayerLives`.
    * These events will be emitted regardless if you use this method to set the value, or the direct `values` setter.
    * 
    * Please note that the data keys are case-sensitive and must be valid JavaScript Object property strings.
    * This means the keys `gold` and `Gold` are treated as two unique values within the Data Manager.
    * @param key The key to set the value for. Or an object of key value pairs. If an object the `data` argument is ignored.
    * @param data The value to set for the given key. If an object is provided as the key this argument is ignored.
    */
  def setData(key: String): this.type = js.native
  def setData(key: String, data: Any): this.type = js.native
  def setData(key: js.Object): this.type = js.native
  def setData(key: js.Object, data: Any): this.type = js.native
  
  /**
    * Adds a Data Manager component to this Game Object.
    */
  def setDataEnabled(): this.type = js.native
  
  /**
    * A Layer cannot be enabled for input.
    * 
    * This method does nothing and is kept to ensure
    * the Layer has the same shape as a Game Object.
    */
  def setInteractive(): this.type = js.native
  
  /**
    * Sets the `name` property of this Game Object and returns this Game Object for further chaining.
    * The `name` property is not populated by Phaser and is presented for your own use.
    * @param value The name to be given to this Game Object.
    */
  def setName(value: String): this.type = js.native
  
  def setState(value: String): this.type = js.native
  /**
    * Sets the current state of this Game Object.
    * 
    * Phaser itself will never modify the State of a Game Object, although plugins may do so.
    * 
    * For example, a Game Object could change from a state of 'moving', to 'attacking', to 'dead'.
    * The state value should typically be an integer (ideally mapped to a constant
    * in your game code), but could also be a string. It is recommended to keep it light and simple.
    * If you need to store complex data about your Game Object, look at using the Data Component instead.
    * @param value The state of the Game Object.
    */
  def setState(value: Double): this.type = js.native
  
  /**
    * Compare the depth of two Game Objects.
    * @param childA The first Game Object.
    * @param childB The second Game Object.
    */
  def sortByDepth(childA: GameObject, childB: GameObject): Double = js.native
  
  /**
    * The flag the determines whether Game Objects should be sorted when `depthSort()` is called.
    */
  var sortChildrenFlag: Boolean = js.native
  
  /**
    * The current state of this Game Object.
    * 
    * Phaser itself will never modify this value, although plugins may do so.
    * 
    * Use this property to track the state of a Game Object during its lifetime. For example, it could change from
    * a state of 'moving', to 'attacking', to 'dead'. The state value should be an integer (ideally mapped to a constant
    * in your game code), or a string. These are recommended to keep it light and simple, with fast comparisons.
    * If you need to store complex data about your Game Object, look at using the Data Component instead.
    */
  var state: Double | String = js.native
  
  /**
    * A reference to the Scene Systems.
    */
  var systems: Systems = js.native
  
  /**
    * The Tab Index of the Game Object.
    * Reserved for future use by plugins and the Input Manager.
    */
  var tabIndex: Double = js.native
  
  /**
    * Returns a JSON representation of the Game Object.
    */
  def toJSON(): JSONGameObject = js.native
  
  /**
    * Toggle a boolean value for the given key within this Game Objects Data Manager. If the key doesn't already exist in the Data Manager then it is toggled from false.
    * 
    * If the Game Object has not been enabled for data (via `setDataEnabled`) then it will be enabled
    * before setting the value.
    * 
    * If the key doesn't already exist in the Data Manager then it is created.
    * 
    * When the value is first set, a `setdata` event is emitted from this Game Object.
    * @param key The key to toggle the value for.
    */
  def toggleData(key: String): this.type = js.native
  def toggleData(key: js.Object): this.type = js.native
  
  /**
    * A textual representation of this Game Object, i.e. `sprite`.
    * Used internally by Phaser but is available for your own custom classes to populate.
    */
  var `type`: String = js.native
  
  /**
    * To be overridden by custom GameObjects. Allows base objects to be used in a Pool.
    * @param args args
    */
  def update(args: Any*): Unit = js.native
  
  /**
    * Compares the renderMask with the renderFlags to see if this Game Object will render or not.
    * Also checks the Game Object against the given Cameras exclusion list.
    * @param camera The Camera to check against this Game Object.
    */
  def willRender(camera: Camera): Boolean = js.native
}
