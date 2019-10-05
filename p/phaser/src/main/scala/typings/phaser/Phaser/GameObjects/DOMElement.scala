package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Math.Vector4
import typings.phaser.Phaser.Scene
import typings.phaser.integer
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DOM Element Game Objects are a way to control and manipulate HTML Elements over the top of your game.
  * 
  * In order for DOM Elements to display you have to enable them by adding the following to your game
  * configuration object:
  * 
  * ```javascript
  * dom {
  *   createContainer: true
  * }
  * ```
  * 
  * When this is added, Phaser will automatically create a DOM Container div that is positioned over the top
  * of the game canvas. This div is sized to match the canvas, and if the canvas size changes, as a result of
  * settings within the Scale Manager, the dom container is resized accordingly.
  * 
  * You can create a DOM Element by either passing in DOMStrings, or by passing in a reference to an existing
  * Element that you wish to be placed under the control of Phaser. For example:
  * 
  * ```javascript
  * this.add.dom(x, y, 'div', 'background-color: lime; width: 220px; height: 100px; font: 48px Arial', 'Phaser');
  * ```
  * 
  * The above code will insert a div element into the DOM Container at the given x/y coordinate. The DOMString in
  * the 4th argument sets the initial CSS style of the div and the final argument is the inner text. In this case,
  * it will create a lime colored div that is 220px by 100px in size with the text Phaser in it, in an Arial font.
  * 
  * You should nearly always, without exception, use explicitly sized HTML Elements, in order to fully control
  * alignment and positioning of the elements next to regular game content.
  * 
  * Rather than specify the CSS and HTML directly you can use the `load.html` File Loader to load it into the
  * cache and then use the `createFromCache` method instead. You can also use `createFromHTML` and various other
  * methods available in this class to help construct your elements.
  * 
  * Once the element has been created you can then control it like you would any other Game Object. You can set its
  * position, scale, rotation, alpha and other properties. It will move as the main Scene Camera moves and be clipped
  * at the edge of the canvas. It's important to remember some limitations of DOM Elements: The obvious one is that
  * they appear above or below your game canvas. You cannot blend them into the display list, meaning you cannot have
  * a DOM Element, then a Sprite, then another DOM Element behind it.
  * 
  * They also cannot be enabled for input. To do that, you have to use the `addListener` method to add native event
  * listeners directly. The final limitation is to do with cameras. The DOM Container is sized to match the game canvas
  * entirely and clipped accordingly. DOM Elements respect camera scrolling and scrollFactor settings, but if you
  * change the size of the camera so it no longer matches the size of the canvas, they won't be clipped accordingly.
  * 
  * Also, all DOM Elements are inserted into the same DOM Container, regardless of which Scene they are created in.
  * 
  * DOM Elements are a powerful way to align native HTML with your Phaser Game Objects. For example, you can insert
  * a login form for a multiplayer game directly into your title screen. Or a text input box for a highscore table.
  * Or a banner ad from a 3rd party service. Or perhaps you'd like to use them for high resolution text display and
  * UI. The choice is up to you, just remember that you're dealing with standard HTML and CSS floating over the top
  * of your game, and should treat it accordingly.
  */
@JSGlobal("Phaser.GameObjects.DOMElement")
@js.native
class DOMElement protected ()
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Origin
     with ScrollFactor
     with Transform
     with Visible {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this DOM Element in the world. Default 0.
    * @param y The vertical position of this DOM Element in the world. Default 0.
    * @param element An existing DOM element, or a string. If a string starting with a # it will do a `getElementById` look-up on the string (minus the hash). Without a hash, it represents the type of element to create, i.e. 'div'.
    * @param style If a string, will be set directly as the elements `style` property value. If a plain object, will be iterated and the values transferred. In both cases the values replacing whatever CSS styles may have been previously set.
    * @param innerText If given, will be set directly as the elements `innerText` property value, replacing whatever was there before.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, x: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, element: String) = this()
  def this(scene: Scene, x: Double, y: Double, element: Element) = this()
  def this(scene: Scene, x: Double, y: Double, element: String, style: String) = this()
  def this(scene: Scene, x: Double, y: Double, element: String, style: js.Any) = this()
  def this(scene: Scene, x: Double, y: Double, element: Element, style: String) = this()
  def this(scene: Scene, x: Double, y: Double, element: Element, style: js.Any) = this()
  def this(scene: Scene, x: Double, y: Double, element: String, style: String, innerText: String) = this()
  def this(scene: Scene, x: Double, y: Double, element: String, style: js.Any, innerText: String) = this()
  def this(scene: Scene, x: Double, y: Double, element: Element, style: String, innerText: String) = this()
  def this(scene: Scene, x: Double, y: Double, element: Element, style: js.Any, innerText: String) = this()
  /**
    * A reference to the HTML Cache.
    */
  var cache: BaseCache = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: Double = js.native
  /**
    * The computed display height of this Game Object, based on the `getBoundingClientRect` DOM call.
    * 
    * The property `height` holds the un-scaled height of this DOM Element.
    */
  val displayHeight: Double = js.native
  /**
    * The computed display width of this Game Object, based on the `getBoundingClientRect` DOM call.
    * 
    * The property `width` holds the un-scaled width of this DOM Element.
    */
  val displayWidth: Double = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * For a DOM Element this property is read-only.
    * 
    * The property `displayHeight` holds the computed bounds of this DOM Element, factoring in scaling.
    */
  val height: Double = js.native
  /**
    * The actual DOM Element that this Game Object is bound to. For example, if you've created a `<div>`
    * then this property is a direct reference to that element within the dom.
    */
  var node: Element = js.native
  /**
    * A reference to the parent DOM Container that the Game instance created when it started.
    */
  var parent: Element = js.native
  /**
    * The perspective CSS property value of the _parent DOM Container_. This determines the distance between the z=0
    * plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with
    * z > 0 becomes larger; each 3D-element with z < 0 becomes smaller. The strength of the effect is determined
    * by the value of this property.
    * 
    * For more information see: https://developer.mozilla.org/en-US/docs/Web/CSS/perspective
    * 
    * **Changing this value changes it globally for all DOM Elements, as they all share the same parent container.**
    */
  var perspective: Double = js.native
  /**
    * A Vector4 that contains the 3D rotation of this DOM Element around a fixed axis in 3D space.
    * 
    * All values in the Vector4 are treated as degrees, unless the `rotate3dAngle` property is changed.
    * 
    * For more details see the following MDN page:
    * 
    * https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/rotate3d
    */
  var rotate3d: Vector4 = js.native
  /**
    * The unit that represents the 3D rotation values. By default this is `deg` for degrees, but can
    * be changed to any supported unit. See this page for further details:
    * 
    * https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/rotate3d
    */
  var rotate3dAngle: String = js.native
  /**
    * The angle, in radians, by which to skew the DOM Element on the horizontal axis.
    * 
    * https://developer.mozilla.org/en-US/docs/Web/CSS/transform
    */
  var skewX: Double = js.native
  /**
    * The angle, in radians, by which to skew the DOM Element on the vertical axis.
    * 
    * https://developer.mozilla.org/en-US/docs/Web/CSS/transform
    */
  var skewY: Double = js.native
  /**
    * By default a DOM Element will have its transform, display, opacity, zIndex and blend mode properties
    * updated when its rendered. If, for some reason, you don't want any of these changed other than the
    * CSS transform, then set this flag to `true`. When `true` only the CSS Transform is applied and it's
    * up to you to keep track of and set the other properties as required.
    * 
    * This can be handy if, for example, you've a nested DOM Element and you don't want the opacity to be
    * picked-up by any of its children.
    */
  var transformOnly: Boolean = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * For a DOM Element this property is read-only.
    * 
    * The property `displayWidth` holds the computed bounds of this DOM Element, factoring in scaling.
    */
  val width: Double = js.native
  /**
    * Adds one or more native DOM event listeners onto the underlying Element of this Game Object.
    * The event is then dispatched via this Game Objects standard event emitter.
    * 
    * For example:
    * 
    * ```javascript
    * var div = this.add.dom(x, y, element);
    * 
    * div.addListener('click');
    * 
    * div.on('click', handler);
    * ```
    * @param events The DOM event/s to listen for. You can specify multiple events by separating them with spaces.
    */
  def addListener(events: String): this.type = js.native
  /**
    * Creates a native DOM Element, adds it to the parent DOM Container and then binds it to this Game Object,
    * so you can control it. The `tagName` should be a string and is passed to `document.createElement`:
    * 
    * ```javascript
    * this.add.dom().createElement('div');
    * ```
    * 
    * For more details on acceptable tag names see: https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement
    * 
    * You can also pass in a DOMString or style object to set the CSS on the created element, and an optional `innerText`
    * value as well. Here is an example of a DOMString:
    * 
    * ```javascript
    * this.add.dom().createElement('div', 'background-color: lime; width: 220px; height: 100px; font: 48px Arial', 'Phaser');
    * ```
    * 
    * And using a style object:
    * 
    * ```javascript
    * var style = {
    *   'background-color': 'lime';
    *   'width': '200px';
    *   'height': '100px';
    *   'font': '48px Arial';
    * };
    * 
    * this.add.dom().createElement('div', style, 'Phaser');
    * ```
    * 
    * If this Game Object already has an Element, it is removed from the DOM entirely first.
    * Any event listeners you may have previously created will need to be re-created after this call.
    * @param tagName A string that specifies the type of element to be created. The nodeName of the created element is initialized with the value of tagName. Don't use qualified names (like "html:a") with this method.
    * @param style Either a DOMString that holds the CSS styles to be applied to the created element, or an object the styles will be ready from.
    * @param innerText A DOMString that holds the text that will be set as the innerText of the created element.
    */
  def createElement(tagName: String): this.type = js.native
  def createElement(tagName: String, style: String): this.type = js.native
  def createElement(tagName: String, style: String, innerText: String): this.type = js.native
  def createElement(tagName: String, style: js.Any): this.type = js.native
  def createElement(tagName: String, style: js.Any, innerText: String): this.type = js.native
  /**
    * Takes a block of html from the HTML Cache, that has previously been preloaded into the game, and then
    * creates a DOM Element from it. The loaded HTML is set as the `innerHTML` property of the created
    * element.
    * 
    * Assume the following html is stored in a file called `loginform.html`:
    * 
    * ```html
    * <input type="text" name="nameField" placeholder="Enter your name" style="font-size: 32px">
    * <input type="button" name="playButton" value="Let's Play" style="font-size: 32px">
    * ```
    * 
    * Which is loaded into your game using the cache key 'login':
    * 
    * ```javascript
    * this.load.html('login', 'assets/loginform.html');
    * ```
    * 
    * You can create a DOM Element from it using the cache key:
    * 
    * ```javascript
    * this.add.dom().createFromCache('login');
    * ```
    * 
    * The optional `elementType` argument controls the container that is created, into which the loaded html is inserted.
    * The default is a plain `div` object, but any valid tagName can be given.
    * 
    * If this Game Object already has an Element, it is removed from the DOM entirely first.
    * Any event listeners you may have previously created will need to be re-created after this call.
    * @param The key of the html cache entry to use for this DOM Element.
    * @param tagName The tag name of the element into which all of the loaded html will be inserted. Defaults to a plain div tag. Default 'div'.
    */
  def createFromCache(The: String): this.type = js.native
  def createFromCache(The: String, tagName: String): this.type = js.native
  /**
    * Takes a string of html and then creates a DOM Element from it. The HTML is set as the `innerHTML`
    * property of the created element.
    * 
    * ```javascript
    * let form = `
    * <input type="text" name="nameField" placeholder="Enter your name" style="font-size: 32px">
    * <input type="button" name="playButton" value="Let's Play" style="font-size: 32px">
    * `;
    * ```
    * 
    * You can create a DOM Element from it using the string:
    * 
    * ```javascript
    * this.add.dom().createFromHTML(form);
    * ```
    * 
    * The optional `elementType` argument controls the type of container that is created, into which the html is inserted.
    * The default is a plain `div` object, but any valid tagName can be given.
    * 
    * If this Game Object already has an Element, it is removed from the DOM entirely first.
    * Any event listeners you may have previously created will need to be re-created after this call.
    * @param A string of html to be set as the `innerHTML` property of the created element.
    * @param tagName The tag name of the element into which all of the html will be inserted. Defaults to a plain div tag. Default 'div'.
    */
  def createFromHTML(A: String): this.type = js.native
  def createFromHTML(A: String, tagName: String): this.type = js.native
  /**
    * Gets all children from this DOM Elements node, using `querySelectorAll('*')` and then iterates through
    * them, looking for the first one that has a matching id. It then returns this child if found, or `null` if not.
    * 
    * Be aware that class and id names are case-sensitive.
    * @param id The id to search the children for.
    */
  def getChildByID(id: String): Element = js.native
  /**
    * Gets all children from this DOM Elements node, using `querySelectorAll('*')` and then iterates through
    * them, looking for the first one that has a matching name. It then returns this child if found, or `null` if not.
    * 
    * Be aware that class and id names are case-sensitive.
    * @param name The name to search the children for.
    */
  def getChildByName(name: String): Element = js.native
  /**
    * Gets all children from this DOM Elements node, using `querySelectorAll('*')` and then iterates through
    * them, looking for the first one that has a property matching the given key and value. It then returns this child
    * if found, or `null` if not.
    * @param property The property to search the children for.
    * @param value The value the property must strictly equal.
    */
  def getChildByProperty(property: String, value: String): Element = js.native
  /**
    * Removes the current DOM Element bound to this Game Object from the DOM entirely and resets the
    * `node` property of this Game Object to be `null`.
    */
  def removeElement(): this.type = js.native
  /**
    * Sets the `className` property of the DOM Element node and updates the internal sizes.
    * @param className A string representing the class or space-separated classes of the element.
    */
  def setClassName(className: String): this.type = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: integer): this.type = js.native
  /**
    * Binds a new DOM Element to this Game Object. If this Game Object already has an Element it is removed from the DOM
    * entirely first. Any event listeners you may have previously created will need to be re-created on the new element.
    * 
    * The `element` argument you pass to this method can be either a string tagName:
    * 
    * ```javascript
    * <h1 id="heading">Phaser</h1>
    * 
    * this.add.dom().setElement('heading');
    * ```
    * 
    * Or a reference to an Element instance:
    * 
    * ```javascript
    * <h1 id="heading">Phaser</h1>
    * 
    * var h1 = document.getElementById('heading');
    * 
    * this.add.dom().setElement(h1);
    * ```
    * 
    * You can also pass in a DOMString or style object to set the CSS on the created element, and an optional `innerText`
    * value as well. Here is an example of a DOMString:
    * 
    * ```javascript
    * this.add.dom().setElement(h1, 'background-color: lime; width: 220px; height: 100px; font: 48px Arial', 'Phaser');
    * ```
    * 
    * And using a style object:
    * 
    * ```javascript
    * var style = {
    *   'background-color': 'lime';
    *   'width': '200px';
    *   'height': '100px';
    *   'font': '48px Arial';
    * };
    * 
    * this.add.dom().setElement(h1, style, 'Phaser');
    * ```
    * @param element If a string it is passed to `getElementById()`, or it should be a reference to an existing Element.
    * @param style Either a DOMString that holds the CSS styles to be applied to the created element, or an object the styles will be ready from.
    * @param innerText A DOMString that holds the text that will be set as the innerText of the created element.
    */
  def setElement(element: String): this.type = js.native
  def setElement(element: String, style: String): this.type = js.native
  def setElement(element: String, style: String, innerText: String): this.type = js.native
  def setElement(element: String, style: js.Any): this.type = js.native
  def setElement(element: String, style: js.Any, innerText: String): this.type = js.native
  def setElement(element: Element): this.type = js.native
  def setElement(element: Element, style: String): this.type = js.native
  def setElement(element: Element, style: String, innerText: String): this.type = js.native
  def setElement(element: Element, style: js.Any): this.type = js.native
  def setElement(element: Element, style: js.Any, innerText: String): this.type = js.native
  /**
    * Sets the `innerHTML` property of the DOM Element node and updates the internal sizes.
    * @param html A DOMString of html to be set as the `innerHTML` property of the element.
    */
  def setHTML(html: String): this.type = js.native
  /**
    * Sets the perspective CSS property of the _parent DOM Container_. This determines the distance between the z=0
    * plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with
    * z > 0 becomes larger; each 3D-element with z < 0 becomes smaller. The strength of the effect is determined
    * by the value of this property.
    * 
    * For more information see: https://developer.mozilla.org/en-US/docs/Web/CSS/perspective
    * 
    * **Changing this value changes it globally for all DOM Elements, as they all share the same parent container.**
    * @param value The perspective value, in pixels, that determines the distance between the z plane and the user.
    */
  def setPerspective(value: Double): this.type = js.native
  /**
    * Sets the horizontal and vertical skew values of this DOM Element.
    * 
    * For more information see: https://developer.mozilla.org/en-US/docs/Web/CSS/transform
    * @param x The angle, in radians, by which to skew the DOM Element on the horizontal axis. Default 0.
    * @param y The angle, in radians, by which to skew the DOM Element on the vertical axis. Default x.
    */
  def setSkew(): this.type = js.native
  def setSkew(x: Double): this.type = js.native
  def setSkew(x: Double, y: Double): this.type = js.native
  /**
    * Sets the `innerText` property of the DOM Element node and updates the internal sizes.
    * 
    * Note that only certain types of Elements can have `innerText` set on them.
    * @param text A DOMString representing the rendered text content of the element.
    */
  def setText(text: String): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  /**
    * Internal method that calls `getBoundingClientRect` on the `node` and then sets the bounds width
    * and height into the `displayWidth` and `displayHeight` properties, and the `clientWidth` and `clientHeight`
    * values into the `width` and `height` properties respectively.
    * 
    * This is called automatically whenever a new element is created or set.
    */
  def updateSize(): this.type = js.native
  /**
    * Compares the renderMask with the renderFlags to see if this Game Object will render or not.
    * 
    * DOMElements always return `true` as they need to still set values during the render pass, even if not visible.
    */
  def willRender(): Boolean = js.native
}

