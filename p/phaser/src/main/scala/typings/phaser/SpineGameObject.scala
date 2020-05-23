package typings.phaser

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Data.DataManager
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.Container
import typings.phaser.Phaser.Physics.Arcade.Body
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.JSONGameObject
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.Phaser.Types.Input.InputConfiguration
import typings.phaser.Phaser.Types.Input.InteractiveObject
import typings.phaser.spine.Animation
import typings.phaser.spine.AnimationState
import typings.phaser.spine.AnimationStateData
import typings.phaser.spine.Attachment
import typings.phaser.spine.Bone
import typings.phaser.spine.EventData
import typings.phaser.spine.IkConstraintData
import typings.phaser.spine.PathConstraintData
import typings.phaser.spine.Skeleton
import typings.phaser.spine.SkeletonData
import typings.phaser.spine.Skin
import typings.phaser.spine.Slot
import typings.phaser.spine.TrackEntry
import typings.phaser.spine.TransformConstraintData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent phaser.Phaser.GameObjects.GameObject */
/* Inlined parent std.Omit<phaser.Phaser.GameObjects.Components.ComputedSize, 'setSize'> */
/* Inlined parent phaser.Phaser.GameObjects.Components.Depth */
/* Inlined parent phaser.Phaser.GameObjects.Components.Flip */
/* Inlined parent phaser.Phaser.GameObjects.Components.ScrollFactor */
/* Inlined parent phaser.Phaser.GameObjects.Components.Transform */
/* Inlined parent phaser.Phaser.GameObjects.Components.Visible */
@js.native
trait SpineGameObject extends js.Object {
  /**
    * The active state of this Game Object.
    * A Game Object with an active state of `true` is processed by the Scenes UpdateList, if added to it.
    * An active object is one which is having its logic and internal systems updated.
    */
  var active: Boolean = js.native
  var alpha: Double = js.native
  var angle: integer = js.native
  val blendMode: Double = js.native
  var blue: Double = js.native
  /**
    * If this Game Object is enabled for Arcade or Matter Physics then this property will contain a reference to a Physics Body.
    */
  var body: js.Object | Body | BodyType = js.native
  var bounds: js.Any = js.native
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
  var depth: Double = js.native
  var displayHeight: Double = js.native
  var displayOriginX: Double = js.native
  var displayOriginY: Double = js.native
  var displayWidth: Double = js.native
  var drawDebug: Boolean = js.native
  var flipX: Boolean = js.native
  var flipY: Boolean = js.native
  var green: Double = js.native
  var height: Double = js.native
  /**
    * This Game Object will ignore all calls made to its destroy method if this flag is set to `true`.
    * This includes calls that may come from a Group, Container or the Scene itself.
    * While it allows you to persist a Game Object across Scenes, please understand you are entirely
    * responsible for managing references to and from this Game Object.
    */
  var ignoreDestroy: Boolean = js.native
  /**
    * If this Game Object is enabled for input then this property will contain an InteractiveObject instance.
    * Not usually set directly. Instead call `GameObject.setInteractive()`.
    */
  var input: InteractiveObject = js.native
  /**
    * The name of this Game Object.
    * Empty by default and never populated by Phaser, this is left for developers to use.
    */
  var name: String = js.native
  /**
    * The parent Container of this Game Object, if it has one.
    */
  var parentContainer: Container = js.native
  var plugin: SpinePlugin = js.native
  var preMultipliedAlpha: Boolean = js.native
  var red: Double = js.native
  /**
    * The flags that are compared against `RENDER_MASK` to determine if this Game Object will render or not.
    * The bits are 0001 | 0010 | 0100 | 1000 set by the components Visible, Alpha, Transform and Texture respectively.
    * If those components are not used by your custom class then you can use this bitmask as you wish.
    */
  var renderFlags: integer = js.native
  var root: Bone = js.native
  var rotation: Double = js.native
  var scale: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  /**
    * The Scene to which this Game Object belongs.
    * Game Objects can only belong to one Scene.
    */
  var scene: Scene = js.native
  var scrollFactorX: Double = js.native
  var scrollFactorY: Double = js.native
  @JSName("setDisplaySize")
  var setDisplaySize_Original: js.Function2[/* width */ Double, /* height */ Double, this.type] = js.native
  var skeleton: Skeleton = js.native
  var skeletonData: SkeletonData = js.native
  // @ts-ignore - spine.AnimationState significantly different than GameObject.state
  var state: AnimationState = js.native
  var stateData: AnimationStateData = js.native
  /**
    * The Tab Index of the Game Object.
    * Reserved for future use by plugins and the Input Manager.
    */
  var tabIndex: integer = js.native
  var timeScale: Double = js.native
  /**
    * A textual representation of this Game Object, i.e. `sprite`.
    * Used internally by Phaser but is available for your own custom classes to populate.
    */
  var `type`: String = js.native
  var visible: Boolean = js.native
  var w: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def addAnimation(trackIndex: integer, animationName: String): TrackEntry = js.native
  def addAnimation(trackIndex: integer, animationName: String, loop: Boolean): TrackEntry = js.native
  def addAnimation(trackIndex: integer, animationName: String, loop: Boolean, delay: integer): TrackEntry = js.native
  /**
    * Add a listener for a given event.
    * @param event The event name.
    * @param fn The listener function.
    * @param context The context to invoke the listener with. Default this.
    */
  def addListener(event: String, fn: js.Function): this.type = js.native
  def addListener(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def addListener(event: js.Symbol, fn: js.Function): this.type = js.native
  def addListener(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
  def angleBoneToXY(bone: Bone, worldX: Double, worldY: Double): SpineGameObject = js.native
  def angleBoneToXY(bone: Bone, worldX: Double, worldY: Double, offset: Double): SpineGameObject = js.native
  def angleBoneToXY(bone: Bone, worldX: Double, worldY: Double, offset: Double, minAngle: Double): SpineGameObject = js.native
  def angleBoneToXY(bone: Bone, worldX: Double, worldY: Double, offset: Double, minAngle: Double, maxAngle: Double): SpineGameObject = js.native
  def clearTrack(trackIndex: integer): SpineGameObject = js.native
  def clearTracks(): SpineGameObject = js.native
  /**
    * Destroys this Game Object removing it from the Display List and Update List and
    * severing all ties to parent resources.
    * 
    * Also removes itself from the Input Manager and Physics Manager if previously enabled.
    * 
    * Use this to remove a Game Object from your game if you don't ever plan to use it again.
    * As long as no reference to it exists within your own code it should become free for
    * garbage collection by the browser.
    * 
    * If you just want to temporarily disable an object then look at using the
    * Game Object Pool instead of destroying it, as destroyed objects cannot be resurrected.
    * @param fromScene Is this Game Object being destroyed as the result of a Scene shutdown? Default false.
    */
  def destroy(): Unit = js.native
  def destroy(fromScene: Boolean): Unit = js.native
  /**
    * If this Game Object has previously been enabled for input, this will disable it.
    * 
    * An object that is disabled for input stops processing or being considered for
    * input events, but can be turned back on again at any time by simply calling
    * `setInteractive()` with no arguments provided.
    * 
    * If want to completely remove interaction from this Game Object then use `removeInteractive` instead.
    */
  def disableInteractive(): this.type = js.native
  /**
    * Calls each of the listeners registered for a given event.
    * @param event The event name.
    * @param args Additional arguments that will be passed to the event handler.
    */
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /**
    * Return an array listing the events for which the emitter has registered listeners.
    */
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def findAnimation(animationName: String): Animation = js.native
  def findBone(boneName: String): Bone = js.native
  def findBoneIndex(boneName: String): Double = js.native
  def findEvent(eventDataName: String): EventData = js.native
  def findIkConstraint(constraintName: String): IkConstraintData = js.native
  def findPathConstraint(constraintName: String): PathConstraintData = js.native
  def findPathConstraintIndex(constraintName: String): Double = js.native
  def findSkin(skinName: String): Skin = js.native
  def findSlot(slotName: String): Slot = js.native
  def findSlotIndex(slotName: String): Double = js.native
  def findTransformConstraint(constraintName: String): TransformConstraintData = js.native
  def getAnimationList(): js.Array[String] = js.native
  def getAttachment(slotIndex: integer, attachmentName: String): Attachment = js.native
  def getAttachmentByName(slotName: String, attachmentName: String): Attachment = js.native
  def getBoneList(): js.Array[String] = js.native
  def getBounds(): js.Any = js.native
  def getCurrentAnimation(): Animation = js.native
  def getCurrentAnimation(trackIndex: integer): Animation = js.native
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
  def getData(key: String): js.Any = js.native
  def getData(key: js.Array[String]): js.Any = js.native
  /**
    * Returns an array containing the display list index of either this Game Object, or if it has one,
    * its parent Container. It then iterates up through all of the parent containers until it hits the
    * root of the display list (which is index 0 in the returned array).
    * 
    * Used internally by the InputPlugin but also useful if you wish to find out the display depth of
    * this Game Object and all of its ancestors.
    */
  def getIndexList(): js.Array[integer] = js.native
  def getLocalTransformMatrix(): TransformMatrix = js.native
  def getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix = js.native
  def getParentRotation(): Double = js.native
  def getRootBone(): Bone = js.native
  def getSkinList(): js.Array[String] = js.native
  def getSlotList(): js.Array[String] = js.native
  def getWorldTransformMatrix(): TransformMatrix = js.native
  def getWorldTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix = js.native
  def getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix = js.native
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
  def incData(key: String, data: js.Any): this.type = js.native
  def incData(key: js.Object): this.type = js.native
  def incData(key: js.Object, data: js.Any): this.type = js.native
  /**
    * Return the number of listeners listening to a given event.
    * @param event The event name.
    */
  def listenerCount(event: String): Double = js.native
  def listenerCount(event: js.Symbol): Double = js.native
  /**
    * Return the listeners registered for a given event.
    * @param event The event name.
    */
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /**
    * Remove the listeners of a given event.
    * @param event The event name.
    * @param fn Only remove the listeners that match this function.
    * @param context Only remove the listeners that have this context.
    * @param once Only remove one-time listeners.
    */
  def off(event: String): this.type = js.native
  def off(event: String, fn: js.Function): this.type = js.native
  def off(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def off(event: String, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
  def off(event: js.Symbol): this.type = js.native
  def off(event: js.Symbol, fn: js.Function): this.type = js.native
  def off(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
  def off(event: js.Symbol, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
  /**
    * Add a listener for a given event.
    * @param event The event name.
    * @param fn The listener function.
    * @param context The context to invoke the listener with. Default this.
    */
  def on(event: String, fn: js.Function): this.type = js.native
  def on(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def on(event: js.Symbol, fn: js.Function): this.type = js.native
  def on(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
  /**
    * Add a one-time listener for a given event.
    * @param event The event name.
    * @param fn The listener function.
    * @param context The context to invoke the listener with. Default this.
    */
  def once(event: String, fn: js.Function): this.type = js.native
  def once(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def once(event: js.Symbol, fn: js.Function): this.type = js.native
  def once(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
  def play(animationName: String): SpineGameObject = js.native
  def play(animationName: String, loop: Boolean): SpineGameObject = js.native
  def play(animationName: String, loop: Boolean, ignoreIfPlaying: Boolean): SpineGameObject = js.native
  /* protected */ def preDestroy(): Unit = js.native
  /* protected */ def preUpdate(time: Double, delta: Double): Unit = js.native
  def refresh(): SpineGameObject = js.native
  /**
    * Remove all listeners, or those of the specified event.
    * @param event The event name.
    */
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  /**
    * If this Game Object has previously been enabled for input, this will queue it
    * for removal, causing it to no longer be interactive. The removal happens on
    * the next game step, it is not immediate.
    * 
    * The Interactive Object that was assigned to this Game Object will be destroyed,
    * removed from the Input Manager and cleared from this Game Object.
    * 
    * If you wish to re-enable this Game Object at a later date you will need to
    * re-create its InteractiveObject by calling `setInteractive` again.
    * 
    * If you wish to only temporarily stop an object from receiving input then use
    * `disableInteractive` instead, as that toggles the interactive state, where-as
    * this erases it completely.
    * 
    * If you wish to resize a hit area, don't remove and then set it as being
    * interactive. Instead, access the hitarea object directly and resize the shape
    * being used. I.e.: `sprite.input.hitArea.setSize(width, height)` (assuming the
    * shape is a Rectangle, which it is by default.)
    */
  def removeInteractive(): this.type = js.native
  /**
    * Remove the listeners of a given event.
    * @param event The event name.
    * @param fn Only remove the listeners that match this function.
    * @param context Only remove the listeners that have this context.
    * @param once Only remove one-time listeners.
    */
  def removeListener(event: String): this.type = js.native
  def removeListener(event: String, fn: js.Function): this.type = js.native
  def removeListener(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def removeListener(event: String, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
  def removeListener(event: js.Symbol): this.type = js.native
  def removeListener(event: js.Symbol, fn: js.Function): this.type = js.native
  def removeListener(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
  def removeListener(event: js.Symbol, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
  def resetFlip(): this.type = js.native
  /**
    * Sets the `active` property of this Game Object and returns this Game Object for further chaining.
    * A Game Object with its `active` property set to `true` will be updated by the Scenes UpdateList.
    * @param value True if this Game Object should be set as active, false if not.
    */
  def setActive(value: Boolean): this.type = js.native
  def setAlpha(): SpineGameObject = js.native
  def setAlpha(value: Double): SpineGameObject = js.native
  def setAngle(): this.type = js.native
  def setAngle(degrees: Double): this.type = js.native
  def setAnimation(trackIndex: integer, animationName: String): TrackEntry = js.native
  def setAnimation(trackIndex: integer, animationName: String, loop: Boolean): TrackEntry = js.native
  def setAnimation(trackIndex: integer, animationName: String, loop: Boolean, ignoreIfPlaying: Boolean): TrackEntry = js.native
  def setAttachment(slotName: String, attachmentName: String): SpineGameObject = js.native
  def setBonesToSetupPose(): SpineGameObject = js.native
  def setColor(): SpineGameObject = js.native
  def setColor(color: integer): SpineGameObject = js.native
  def setColor(color: integer, slotName: String): SpineGameObject = js.native
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
  def setData(key: String, data: js.Any): this.type = js.native
  def setData(key: js.Object): this.type = js.native
  def setData(key: js.Object, data: js.Any): this.type = js.native
  /**
    * Adds a Data Manager component to this Game Object.
    */
  def setDataEnabled(): this.type = js.native
  def setDepth(value: integer): this.type = js.native
  def setDisplaySize(width: Double, height: Double): this.type = js.native
  def setEmptyAnimation(trackIndex: integer): TrackEntry = js.native
  def setEmptyAnimation(trackIndex: integer, mixDuration: integer): TrackEntry = js.native
  def setFlip(x: Boolean, y: Boolean): this.type = js.native
  def setFlipX(value: Boolean): this.type = js.native
  def setFlipY(value: Boolean): this.type = js.native
  /**
    * Pass this Game Object to the Input Manager to enable it for Input.
    * 
    * Input works by using hit areas, these are nearly always geometric shapes, such as rectangles or circles, that act as the hit area
    * for the Game Object. However, you can provide your own hit area shape and callback, should you wish to handle some more advanced
    * input detection.
    * 
    * If no arguments are provided it will try and create a rectangle hit area based on the texture frame the Game Object is using. If
    * this isn't a texture-bound object, such as a Graphics or BitmapText object, this will fail, and you'll need to provide a specific
    * shape for it to use.
    * 
    * You can also provide an Input Configuration Object as the only argument to this method.
    * @param shape Either an input configuration object, or a geometric shape that defines the hit area for the Game Object. If not specified a Rectangle will be used.
    * @param callback A callback to be invoked when the Game Object is interacted with. If you provide a shape you must also provide a callback.
    * @param dropZone Should this Game Object be treated as a drop zone target? Default false.
    */
  def setInteractive(): this.type = js.native
  def setInteractive(shape: js.Any): this.type = js.native
  def setInteractive(shape: js.Any, callback: HitAreaCallback): this.type = js.native
  def setInteractive(shape: js.Any, callback: HitAreaCallback, dropZone: Boolean): this.type = js.native
  def setInteractive(shape: InputConfiguration): this.type = js.native
  def setInteractive(shape: InputConfiguration, callback: HitAreaCallback): this.type = js.native
  def setInteractive(shape: InputConfiguration, callback: HitAreaCallback, dropZone: Boolean): this.type = js.native
  def setMix(fromName: String, toName: String): SpineGameObject = js.native
  def setMix(fromName: String, toName: String, duration: Double): SpineGameObject = js.native
  /**
    * Sets the `name` property of this Game Object and returns this Game Object for further chaining.
    * The `name` property is not populated by Phaser and is presented for your own use.
    * @param value The name to be given to this Game Object.
    */
  def setName(value: String): this.type = js.native
  def setOffset(): SpineGameObject = js.native
  def setOffset(offsetX: Double): SpineGameObject = js.native
  def setOffset(offsetX: Double, offsetY: Double): SpineGameObject = js.native
  def setPosition(): this.type = js.native
  def setPosition(x: Double): this.type = js.native
  def setPosition(x: Double, y: Double): this.type = js.native
  def setPosition(x: Double, y: Double, z: Double): this.type = js.native
  def setPosition(x: Double, y: Double, z: Double, w: Double): this.type = js.native
  def setRandomPosition(): this.type = js.native
  def setRandomPosition(x: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Double, width: Double): this.type = js.native
  def setRandomPosition(x: Double, y: Double, width: Double, height: Double): this.type = js.native
  def setRotation(): this.type = js.native
  def setRotation(radians: Double): this.type = js.native
  def setScale(x: Double): this.type = js.native
  def setScale(x: Double, y: Double): this.type = js.native
  def setScrollFactor(x: Double): this.type = js.native
  def setScrollFactor(x: Double, y: Double): this.type = js.native
  def setSize(): SpineGameObject = js.native
  def setSize(width: Double): SpineGameObject = js.native
  def setSize(width: Double, height: Double): SpineGameObject = js.native
  def setSize(width: Double, height: Double, offsetX: Double): SpineGameObject = js.native
  def setSize(width: Double, height: Double, offsetX: Double, offsetY: Double): SpineGameObject = js.native
  def setSkeleton(atlasDataKey: String, skeletonJSON: js.Object): SpineGameObject = js.native
  def setSkeleton(atlasDataKey: String, skeletonJSON: js.Object, animationName: String): SpineGameObject = js.native
  def setSkeleton(atlasDataKey: String, skeletonJSON: js.Object, animationName: String, loop: Boolean): SpineGameObject = js.native
  def setSkeletonFromJSON(atlasDataKey: String, skeletonJSON: js.Object): SpineGameObject = js.native
  def setSkeletonFromJSON(atlasDataKey: String, skeletonJSON: js.Object, animationName: String): SpineGameObject = js.native
  def setSkeletonFromJSON(atlasDataKey: String, skeletonJSON: js.Object, animationName: String, loop: Boolean): SpineGameObject = js.native
  def setSkin(newSkin: Skin): SpineGameObject = js.native
  def setSkinByName(skinName: String): SpineGameObject = js.native
  def setSlotsToSetupPose(): SpineGameObject = js.native
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
  def setState(value: integer): this.type = js.native
  def setToSetupPose(): SpineGameObject = js.native
  def setVisible(value: Boolean): this.type = js.native
  def setW(): this.type = js.native
  def setW(value: Double): this.type = js.native
  def setX(): this.type = js.native
  def setX(value: Double): this.type = js.native
  def setY(): this.type = js.native
  def setY(value: Double): this.type = js.native
  def setZ(): this.type = js.native
  def setZ(value: Double): this.type = js.native
  /**
    * Removes all listeners.
    */
  def shutdown(): Unit = js.native
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
  def toggleFlipX(): this.type = js.native
  def toggleFlipY(): this.type = js.native
  /**
    * To be overridden by custom GameObjects. Allows base objects to be used in a Pool.
    * @param args args
    */
  def update(args: js.Any*): Unit = js.native
  def updateSize(): SpineGameObject = js.native
  def willRender(): Boolean = js.native
  /**
    * Compares the renderMask with the renderFlags to see if this Game Object will render or not.
    * Also checks the Game Object against the given Cameras exclusion list.
    * @param camera The Camera to check against this Game Object.
    */
  def willRender(camera: Camera): Boolean = js.native
}

