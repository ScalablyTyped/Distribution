package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * Note that you should only have DOM Elements in a Scene with a _single_ Camera. If you require multiple cameras,
  * use parallel scenes to achieve this.
  * 
  * DOM Elements are a powerful way to align native HTML with your Phaser Game Objects. For example, you can insert
  * a login form for a multiplayer game directly into your title screen. Or a text input box for a highscore table.
  * Or a banner ad from a 3rd party service. Or perhaps you'd like to use them for high resolution text display and
  * UI. The choice is up to you, just remember that you're dealing with standard HTML and CSS floating over the top
  * of your game, and should treat it accordingly.
  */
@JSImport("phaser", "GameObjects.DOMElement")
@js.native
class DOMElement protected ()
  extends typings.phaser.Phaser.GameObjects.DOMElement {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this DOM Element in the world. Default 0.
    * @param y The vertical position of this DOM Element in the world. Default 0.
    * @param element An existing DOM element, or a string. If a string starting with a # it will do a `getElementById` look-up on the string (minus the hash). Without a hash, it represents the type of element to create, i.e. 'div'.
    * @param style If a string, will be set directly as the elements `style` property value. If a plain object, will be iterated and the values transferred. In both cases the values replacing whatever CSS styles may have been previously set.
    * @param innerText If given, will be set directly as the elements `innerText` property value, replacing whatever was there before.
    */
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    element: js.UndefOr[Element | String],
    style: js.UndefOr[String | js.Any],
    innerText: js.UndefOr[String]
  ) = this()
}
