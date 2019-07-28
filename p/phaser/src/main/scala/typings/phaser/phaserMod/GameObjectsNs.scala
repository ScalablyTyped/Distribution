package typings.phaser.phaserMod

import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import typings.phaser.PhaserNs.CurvesNs.Path
import typings.phaser.PhaserNs.DisplayNs.BaseShader
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.RetroFontConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GameObjectConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs.Options
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.DeathZoneSource
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EdgeZoneSource
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.GravityWellConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.RandomZoneSource
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.TextNs.TextMetrics
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.TextNs.TextSyle
import typings.phaser.integer
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "GameObjects")
@js.native
object GameObjectsNs extends js.Object {
  /**
    * The Arc Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * When it renders it displays an arc shape. You can control the start and end angles of the arc,
    * as well as if the angles are winding clockwise or anti-clockwise. With the default settings
    * it renders as a complete circle. By changing the angles you can create other arc shapes,
    * such as half-circles.
    * 
    * Arcs also have an `iterations` property and corresponding `setIterations` method. This allows
    * you to control how smooth the shape renders in WebGL, by controlling the number of iterations
    * that take place during construction.
    */
  @js.native
  class Arc protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Arc {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param radius The radius of the arc. Default 128.
      * @param startAngle The start angle of the arc, in degrees. Default 0.
      * @param endAngle The end angle of the arc, in degrees. Default 360.
      * @param anticlockwise The winding order of the start and end angles. Default false.
      * @param fillColor The color the arc will be filled with, i.e. 0xff0000 for red.
      * @param fillAlpha The alpha the arc will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      radius: js.UndefOr[Double],
      startAngle: js.UndefOr[integer],
      endAngle: js.UndefOr[integer],
      anticlockwise: js.UndefOr[Boolean],
      fillColor: js.UndefOr[Double],
      fillAlpha: js.UndefOr[Double]
    ) = this()
  }
  
  /**
    * BitmapText objects work by taking a texture file and an XML or JSON file that describes the font structure.
    * 
    * During rendering for each letter of the text is rendered to the display, proportionally spaced out and aligned to
    * match the font structure.
    * 
    * BitmapText objects are less flexible than Text objects, in that they have less features such as shadows, fills and the ability
    * to use Web Fonts, however you trade this flexibility for rendering speed. You can also create visually compelling BitmapTexts by
    * processing the font texture in an image editor, applying fills and any other effects required.
    * 
    * To create multi-line text insert \r, \n or \r\n escape codes into the text string.
    * 
    * To create a BitmapText data files you need a 3rd party app such as:
    * 
    * BMFont (Windows, free): {@link http://www.angelcode.com/products/bmfont/|http://www.angelcode.com/products/bmfont/}
    * Glyph Designer (OS X, commercial): {@link http://www.71squared.com/en/glyphdesigner|http://www.71squared.com/en/glyphdesigner}
    * Littera (Web-based, free): {@link http://kvazars.com/littera/|http://kvazars.com/littera/}
    * 
    * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
    * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: {@link http://codebeautify.org/xmltojson|http://codebeautify.org/xmltojson}
    */
  @js.native
  class BitmapText protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.BitmapText {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. It can only belong to one Scene at any given time.
      * @param x The x coordinate of this Game Object in world space.
      * @param y The y coordinate of this Game Object in world space.
      * @param font The key of the font to use from the Bitmap Font cache.
      * @param text The string, or array of strings, to be set as the content of this Bitmap Text.
      * @param size The font size of this Bitmap Text.
      * @param align The alignment of the text in a multi-line BitmapText object. Default 0.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, font: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, font: String, text: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, font: String, text: js.Array[String]) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      font: String,
      text: String,
      size: Double
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      font: String,
      text: js.Array[String],
      size: Double
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      font: String,
      text: String,
      size: Double,
      align: integer
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      font: String,
      text: js.Array[String],
      size: Double,
      align: integer
    ) = this()
  }
  
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
  class Blitter protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Blitter {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. It can only belong to one Scene at any given time.
      * @param x The x coordinate of this Game Object in world space. Default 0.
      * @param y The y coordinate of this Game Object in world space. Default 0.
      * @param texture The key of the texture this Game Object will use for rendering. The Texture must already exist in the Texture Manager. Default '__DEFAULT'.
      * @param frame The Frame of the Texture that this Game Object will use. Only set if the Texture has multiple frames, such as a Texture Atlas or Sprite Sheet. Default 0.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  }
  
  /**
    * A Bob Game Object.
    * 
    * A Bob belongs to a Blitter Game Object. The Blitter is responsible for managing and rendering this object.
    * 
    * A Bob has a position, alpha value and a frame from a texture that it uses to render with. You can also toggle
    * the flipped and visible state of the Bob. The Frame the Bob uses to render can be changed dynamically, but it
    * must be a Frame within the Texture used by the parent Blitter.
    * 
    * Bob positions are relative to the Blitter parent. So if you move the Blitter parent, all Bob children will
    * have their positions impacted by this change as well.
    * 
    * You can manipulate Bob objects directly from your game code, but the creation and destruction of them should be
    * handled via the Blitter parent.
    */
  @js.native
  class Bob protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Bob {
    /**
      * 
      * @param blitter The parent Blitter object is responsible for updating this Bob.
      * @param x The horizontal position of this Game Object in the world, relative to the parent Blitter position.
      * @param y The vertical position of this Game Object in the world, relative to the parent Blitter position.
      * @param frame The Frame this Bob will render with, as defined in the Texture the parent Blitter is using.
      * @param visible Should the Bob render visible or not to start with?
      */
    def this(
      blitter: typings.phaser.PhaserNs.GameObjectsNs.Blitter,
      x: Double,
      y: Double,
      frame: String,
      visible: Boolean
    ) = this()
    def this(
      blitter: typings.phaser.PhaserNs.GameObjectsNs.Blitter,
      x: Double,
      y: Double,
      frame: integer,
      visible: Boolean
    ) = this()
  }
  
  /**
    * A Container Game Object.
    * 
    * A Container, as the name implies, can 'contain' other types of Game Object.
    * When a Game Object is added to a Container, the Container becomes responsible for the rendering of it.
    * By default it will be removed from the Display List and instead added to the Containers own internal list.
    * 
    * The position of the Game Object automatically becomes relative to the position of the Container.
    * 
    * When the Container is rendered, all of its children are rendered as well, in the order in which they exist
    * within the Container. Container children can be repositioned using methods such as `MoveUp`, `MoveDown` and `SendToBack`.
    * 
    * If you modify a transform property of the Container, such as `Container.x` or `Container.rotation` then it will
    * automatically influence all children as well.
    * 
    * Containers can include other Containers for deeply nested transforms.
    * 
    * Containers can have masks set on them and can be used as a mask too. However, Container children cannot be masked.
    * The masks do not 'stack up'. Only a Container on the root of the display list will use its mask.
    * 
    * Containers can be enabled for input. Because they do not have a texture you need to provide a shape for them
    * to use as their hit area. Container children can also be enabled for input, independent of the Container.
    * 
    * Containers can be given a physics body for either Arcade Physics, Impact Physics or Matter Physics. However,
    * if Container _children_ are enabled for physics you may get unexpected results, such as offset bodies,
    * if the Container itself, or any of its ancestors, is positioned anywhere other than at 0 x 0. Container children
    * with physics do not factor in the Container due to the excessive extra calculations needed. Please structure
    * your game to work around this.
    * 
    * It's important to understand the impact of using Containers. They add additional processing overhead into
    * every one of their children. The deeper you nest them, the more the cost escalates. This is especially true
    * for input events. You also loose the ability to set the display depth of Container children in the same
    * flexible manner as those not within them. In short, don't use them for the sake of it. You pay a small cost
    * every time you create one, try to structure your game around avoiding that where possible.
    */
  @js.native
  class Container protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Container {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param children An optional array of Game Objects to add to this Container.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      children: js.Array[typings.phaser.PhaserNs.GameObjectsNs.GameObject]
    ) = this()
  }
  
  /**
    * The Curve Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * To render a Curve Shape you must first create a `Phaser.Curves.Curve` object, then pass it to
    * the Curve Shape in the constructor.
    * 
    * The Curve shape also has a `smoothness` property and corresponding `setSmoothness` method.
    * This allows you to control how smooth the shape renders in WebGL, by controlling the number of iterations
    * that take place during construction. Increase and decrease the default value for smoother, or more
    * jagged, shapes.
    */
  @js.native
  class Curve protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Curve {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param curve The Curve object to use to create the Shape.
      * @param fillColor The color the curve will be filled with, i.e. 0xff0000 for red.
      * @param fillAlpha The alpha the curve will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      curve: typings.phaser.PhaserNs.CurvesNs.Curve
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      curve: typings.phaser.PhaserNs.CurvesNs.Curve,
      fillColor: Double
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      curve: typings.phaser.PhaserNs.CurvesNs.Curve,
      fillColor: Double,
      fillAlpha: Double
    ) = this()
  }
  
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
  @js.native
  class DOMElement protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.DOMElement {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this DOM Element in the world. Default 0.
      * @param y The vertical position of this DOM Element in the world. Default 0.
      * @param element An existing DOM element, or a string. If a string starting with a # it will do a `getElementById` look-up on the string (minus the hash). Without a hash, it represents the type of element to create, i.e. 'div'.
      * @param style If a string, will be set directly as the elements `style` property value. If a plain object, will be iterated and the values transferred. In both cases the values replacing whatever CSS styles may have been previously set.
      * @param innerText If given, will be set directly as the elements `innerText` property value, replacing whatever was there before.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, element: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, element: Element) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, element: String, style: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, element: String, style: js.Any) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, element: Element, style: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, element: Element, style: js.Any) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      element: String,
      style: String,
      innerText: String
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      element: String,
      style: js.Any,
      innerText: String
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      element: Element,
      style: String,
      innerText: String
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      element: Element,
      style: js.Any,
      innerText: String
    ) = this()
  }
  
  /**
    * The Display List plugin.
    * 
    * Display Lists belong to a Scene and maintain the list of Game Objects to render every frame.
    * 
    * Some of these Game Objects may also be part of the Scene's [Update List]{@link Phaser.GameObjects.UpdateList}, for updating.
    */
  @js.native
  class DisplayList protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.DisplayList {
    /**
      * 
      * @param scene The Scene that this Display List belongs to.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
  }
  
  /**
    * BitmapText objects work by taking a texture file and an XML or JSON file that describes the font structure.
    * 
    * During rendering for each letter of the text is rendered to the display, proportionally spaced out and aligned to
    * match the font structure.
    * 
    * Dynamic Bitmap Text objects are different from Static Bitmap Text in that they invoke a callback for each
    * letter being rendered during the render pass. This callback allows you to manipulate the properties of
    * each letter being rendered, such as its position, scale or tint, allowing you to create interesting effects
    * like jiggling text, which can't be done with Static text. This means that Dynamic Text takes more processing
    * time, so only use them if you require the callback ability they have.
    * 
    * BitmapText objects are less flexible than Text objects, in that they have less features such as shadows, fills and the ability
    * to use Web Fonts, however you trade this flexibility for rendering speed. You can also create visually compelling BitmapTexts by
    * processing the font texture in an image editor, applying fills and any other effects required.
    * 
    * To create multi-line text insert \r, \n or \r\n escape codes into the text string.
    * 
    * To create a BitmapText data files you need a 3rd party app such as:
    * 
    * BMFont (Windows, free): http://www.angelcode.com/products/bmfont/
    * Glyph Designer (OS X, commercial): http://www.71squared.com/en/glyphdesigner
    * Littera (Web-based, free): http://kvazars.com/littera/
    * 
    * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
    * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: http://codebeautify.org/xmltojson
    */
  @js.native
  class DynamicBitmapText protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.DynamicBitmapText {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. It can only belong to one Scene at any given time.
      * @param x The x coordinate of this Game Object in world space.
      * @param y The y coordinate of this Game Object in world space.
      * @param font The key of the font to use from the Bitmap Font cache.
      * @param text The string, or array of strings, to be set as the content of this Bitmap Text.
      * @param size The font size of this Bitmap Text.
      * @param align The alignment of the text in a multi-line BitmapText object. Default 0.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, font: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, font: String, text: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, font: String, text: js.Array[String]) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      font: String,
      text: String,
      size: Double
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      font: String,
      text: js.Array[String],
      size: Double
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      font: String,
      text: String,
      size: Double,
      align: integer
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      font: String,
      text: js.Array[String],
      size: Double,
      align: integer
    ) = this()
  }
  
  /**
    * The Ellipse Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * When it renders it displays an ellipse shape. You can control the width and height of the ellipse.
    * If the width and height match it will render as a circle. If the width is less than the height,
    * it will look more like an egg shape.
    * 
    * The Ellipse shape also has a `smoothness` property and corresponding `setSmoothness` method.
    * This allows you to control how smooth the shape renders in WebGL, by controlling the number of iterations
    * that take place during construction. Increase and decrease the default value for smoother, or more
    * jagged, shapes.
    */
  @js.native
  class Ellipse protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Ellipse {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param width The width of the ellipse. An ellipse with equal width and height renders as a circle. Default 128.
      * @param height The height of the ellipse. An ellipse with equal width and height renders as a circle. Default 128.
      * @param fillColor The color the ellipse will be filled with, i.e. 0xff0000 for red.
      * @param fillAlpha The alpha the ellipse will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      fillColor: js.UndefOr[Double],
      fillAlpha: js.UndefOr[Double]
    ) = this()
  }
  
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
  @js.native
  class Extern protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Extern {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
  }
  
  /**
    * The base class that all Game Objects extend.
    * You don't create GameObjects directly and they cannot be added to the display list.
    * Instead, use them as the base for your own custom classes.
    */
  @js.native
  class GameObject protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.GameObject {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs.
      * @param type A textual representation of the type of Game Object, i.e. `sprite`.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, `type`: String) = this()
  }
  
  /**
    * The Game Object Creator is a Scene plugin that allows you to quickly create many common
    * types of Game Objects and return them. Unlike the Game Object Factory, they are not automatically
    * added to the Scene.
    * 
    * Game Objects directly register themselves with the Creator and inject their own creation
    * methods into the class.
    */
  @js.native
  class GameObjectCreator protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.GameObjectCreator {
    /**
      * 
      * @param scene The Scene to which this Game Object Factory belongs.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
  }
  
  /**
    * The Game Object Factory is a Scene plugin that allows you to quickly create many common
    * types of Game Objects and have them automatically registered with the Scene.
    * 
    * Game Objects directly register themselves with the Factory and inject their own creation
    * methods into the class.
    */
  @js.native
  class GameObjectFactory protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.GameObjectFactory {
    /**
      * 
      * @param scene The Scene to which this Game Object Factory belongs.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
  }
  
  /**
    * A Graphics object is a way to draw primitive shapes to your game. Primitives include forms of geometry, such as
    * Rectangles, Circles, and Polygons. They also include lines, arcs and curves. When you initially create a Graphics
    * object it will be empty.
    * 
    * To draw to it you must first specify a line style or fill style (or both), draw shapes using paths, and finally
    * fill or stroke them. For example:
    * 
    * ```javascript
    * graphics.lineStyle(5, 0xFF00FF, 1.0);
    * graphics.beginPath();
    * graphics.moveTo(100, 100);
    * graphics.lineTo(200, 200);
    * graphics.closePath();
    * graphics.strokePath();
    * ```
    * 
    * There are also many helpful methods that draw and fill/stroke common shapes for you.
    * 
    * ```javascript
    * graphics.lineStyle(5, 0xFF00FF, 1.0);
    * graphics.fillStyle(0xFFFFFF, 1.0);
    * graphics.fillRect(50, 50, 400, 200);
    * graphics.strokeRect(50, 50, 400, 200);
    * ```
    * 
    * When a Graphics object is rendered it will render differently based on if the game is running under Canvas or WebGL.
    * Under Canvas it will use the HTML Canvas context drawing operations to draw the path.
    * Under WebGL the graphics data is decomposed into polygons. Both of these are expensive processes, especially with
    * complex shapes.
    * 
    * If your Graphics object doesn't change much (or at all) once you've drawn your shape to it, then you will help
    * performance by calling {@link Phaser.GameObjects.Graphics#generateTexture}. This will 'bake' the Graphics object into
    * a Texture, and return it. You can then use this Texture for Sprites or other display objects. If your Graphics object
    * updates frequently then you should avoid doing this, as it will constantly generate new textures, which will consume
    * memory.
    * 
    * As you can tell, Graphics objects are a bit of a trade-off. While they are extremely useful, you need to be careful
    * in their complexity and quantity of them in your game.
    */
  @js.native
  class Graphics protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Graphics {
    /**
      * 
      * @param scene The Scene to which this Graphics object belongs.
      * @param options Options that set the position and default style of this Graphics object.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, options: Options) = this()
  }
  
  /**
    * The Grid Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports only fill colors and cannot be stroked.
    * 
    * A Grid Shape allows you to display a grid in your game, where you can control the size of the
    * grid as well as the width and height of the grid cells. You can set a fill color for each grid
    * cell as well as an alternate fill color. When the alternate fill color is set then the grid
    * cells will alternate the fill colors as they render, creating a chess-board effect. You can
    * also optionally have an outline fill color. If set, this draws lines between the grid cells
    * in the given color. If you specify an outline color with an alpha of zero, then it will draw
    * the cells spaced out, but without the lines between them.
    */
  @js.native
  class Grid protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Grid {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param width The width of the grid. Default 128.
      * @param height The height of the grid. Default 128.
      * @param cellWidth The width of one cell in the grid. Default 32.
      * @param cellHeight The height of one cell in the grid. Default 32.
      * @param fillColor The color the grid cells will be filled with, i.e. 0xff0000 for red.
      * @param fillAlpha The alpha the grid cells will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
      * @param outlineFillColor The color of the lines between the grid cells. See the `setOutline` method.
      * @param outlineFillAlpha The alpha of the lines between the grid cells.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      cellWidth: js.UndefOr[Double],
      cellHeight: js.UndefOr[Double],
      fillColor: js.UndefOr[Double],
      fillAlpha: js.UndefOr[Double],
      outlineFillColor: js.UndefOr[Double],
      outlineFillAlpha: js.UndefOr[Double]
    ) = this()
  }
  
  /**
    * A Group is a way for you to create, manipulate, or recycle similar Game Objects.
    * 
    * Group membership is non-exclusive. A Game Object can belong to several groups, one group, or none.
    * 
    * Groups themselves aren't displayable, and can't be positioned, rotated, scaled, or hidden.
    */
  @js.native
  class Group protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Group {
    /**
      * 
      * @param scene The scene this group belongs to.
      * @param children Game Objects to add to this group; or the `config` argument.
      * @param config Settings for this group. If `key` is set, Phaser.GameObjects.Group#createMultiple is also called with these settings.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      children: js.Array[typings.phaser.PhaserNs.GameObjectsNs.GameObject]
    ) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, children: GroupConfig) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, children: GroupCreateConfig) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      children: js.Array[typings.phaser.PhaserNs.GameObjectsNs.GameObject],
      config: GroupConfig
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      children: js.Array[typings.phaser.PhaserNs.GameObjectsNs.GameObject],
      config: GroupCreateConfig
    ) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, children: GroupConfig, config: GroupConfig) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, children: GroupConfig, config: GroupCreateConfig) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, children: GroupCreateConfig, config: GroupConfig) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, children: GroupCreateConfig, config: GroupCreateConfig) = this()
  }
  
  /**
    * An Image Game Object.
    * 
    * An Image is a light-weight Game Object useful for the display of static images in your game,
    * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
    * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
    * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
    */
  @js.native
  class Image protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Image {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  }
  
  /**
    * The IsoBox Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports only fill colors and cannot be stroked.
    * 
    * An IsoBox is an 'isometric' rectangle. Each face of it has a different fill color. You can set
    * the color of the top, left and right faces of the rectangle respectively. You can also choose
    * which of the faces are rendered via the `showTop`, `showLeft` and `showRight` properties.
    * 
    * You cannot view an IsoBox from under-neath, however you can change the 'angle' by setting
    * the `projection` property.
    */
  @js.native
  class IsoBox protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.IsoBox {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param size The width of the iso box in pixels. The left and right faces will be exactly half this value. Default 48.
      * @param height The height of the iso box. The left and right faces will be this tall. The overall height of the isobox will be this value plus half the `size` value. Default 32.
      * @param fillTop The fill color of the top face of the iso box. Default 0xeeeeee.
      * @param fillLeft The fill color of the left face of the iso box. Default 0x999999.
      * @param fillRight The fill color of the right face of the iso box. Default 0xcccccc.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      size: js.UndefOr[Double],
      height: js.UndefOr[Double],
      fillTop: js.UndefOr[Double],
      fillLeft: js.UndefOr[Double],
      fillRight: js.UndefOr[Double]
    ) = this()
  }
  
  /**
    * The IsoTriangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports only fill colors and cannot be stroked.
    * 
    * An IsoTriangle is an 'isometric' triangle. Think of it like a pyramid. Each face has a different
    * fill color. You can set the color of the top, left and right faces of the triangle respectively
    * You can also choose which of the faces are rendered via the `showTop`, `showLeft` and `showRight` properties.
    * 
    * You cannot view an IsoTriangle from under-neath, however you can change the 'angle' by setting
    * the `projection` property. The `reversed` property controls if the IsoTriangle is rendered upside
    * down or not.
    */
  @js.native
  class IsoTriangle protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.IsoTriangle {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param size The width of the iso triangle in pixels. The left and right faces will be exactly half this value. Default 48.
      * @param height The height of the iso triangle. The left and right faces will be this tall. The overall height of the iso triangle will be this value plus half the `size` value. Default 32.
      * @param reversed Is the iso triangle upside down? Default false.
      * @param fillTop The fill color of the top face of the iso triangle. Default 0xeeeeee.
      * @param fillLeft The fill color of the left face of the iso triangle. Default 0x999999.
      * @param fillRight The fill color of the right face of the iso triangle. Default 0xcccccc.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      size: js.UndefOr[Double],
      height: js.UndefOr[Double],
      reversed: js.UndefOr[Boolean],
      fillTop: js.UndefOr[Double],
      fillLeft: js.UndefOr[Double],
      fillRight: js.UndefOr[Double]
    ) = this()
  }
  
  /**
    * A 2D point light.
    * 
    * These are typically created by a {@link Phaser.GameObjects.LightsManager}, available from within a scene via `this.lights`.
    * 
    * Any Game Objects using the Light2D pipeline will then be affected by these Lights.
    * 
    * They can also simply be used to represent a point light for your own purposes.
    */
  @js.native
  class Light protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Light {
    /**
      * 
      * @param x The horizontal position of the light.
      * @param y The vertical position of the light.
      * @param radius The radius of the light.
      * @param r The red color of the light. A value between 0 and 1.
      * @param g The green color of the light. A value between 0 and 1.
      * @param b The blue color of the light. A value between 0 and 1.
      * @param intensity The intensity of the light.
      */
    def this(x: Double, y: Double, radius: Double, r: Double, g: Double, b: Double, intensity: Double) = this()
  }
  
  /**
    * Manages Lights for a Scene.
    * 
    * Affects the rendering of Game Objects using the `Light2D` pipeline.
    */
  @js.native
  class LightsManager ()
    extends typings.phaser.PhaserNs.GameObjectsNs.LightsManager
  
  /**
    * A Scene plugin that provides a {@link Phaser.GameObjects.LightsManager} for the Light2D pipeline.
    * 
    * Available from within a Scene via `this.lights`.
    * 
    * Add Lights using the {@link Phaser.GameObjects.LightsManager#addLight} method:
    * 
    * ```javascript
    * // Enable the Lights Manager because it is disabled by default
    * this.lights.enable();
    * 
    * // Create a Light at [400, 300] with a radius of 200
    * this.lights.addLight(400, 300, 200);
    * ```
    * 
    * For Game Objects to be affected by the Lights when rendered, you will need to set them to use the `Light2D` pipeline like so:
    * 
    * ```javascript
    * sprite.setPipeline('Light2D');
    * ```
    */
  @js.native
  class LightsPlugin protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.LightsPlugin {
    /**
      * 
      * @param scene The Scene that this Lights Plugin belongs to.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
  }
  
  /**
    * The Line Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports only stroke colors and cannot be filled.
    * 
    * A Line Shape allows you to draw a line between two points in your game. You can control the
    * stroke color and thickness of the line. In WebGL only you can also specify a different
    * thickness for the start and end of the line, allowing you to render lines that taper-off.
    * 
    * If you need to draw multiple lines in a sequence you may wish to use the Polygon Shape instead.
    * 
    * Be aware that as with all Game Objects the default origin is 0.5. If you need to draw a Line
    * between two points and want the x1/y1 values to match the x/y values, then set the origin to 0.
    */
  @js.native
  class Line protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Line {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param x1 The horizontal position of the start of the line. Default 0.
      * @param y1 The vertical position of the start of the line. Default 0.
      * @param x2 The horizontal position of the end of the line. Default 128.
      * @param y2 The vertical position of the end of the line. Default 0.
      * @param strokeColor The color the line will be drawn in, i.e. 0xff0000 for red.
      * @param strokeAlpha The alpha the line will be drawn in. You can also set the alpha of the overall Shape using its `alpha` property.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x2: js.UndefOr[Double],
      y2: js.UndefOr[Double],
      strokeColor: js.UndefOr[Double],
      strokeAlpha: js.UndefOr[Double]
    ) = this()
  }
  
  /**
    * A Mesh Game Object.
    */
  @js.native
  class Mesh protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Mesh {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param vertices An array containing the vertices data for this Mesh.
      * @param uv An array containing the uv data for this Mesh.
      * @param colors An array containing the color data for this Mesh.
      * @param alphas An array containing the alpha data for this Mesh.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      vertices: js.Array[Double],
      uv: js.Array[Double],
      colors: js.Array[Double],
      alphas: js.Array[Double],
      texture: String
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      vertices: js.Array[Double],
      uv: js.Array[Double],
      colors: js.Array[Double],
      alphas: js.Array[Double],
      texture: String,
      frame: String
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      vertices: js.Array[Double],
      uv: js.Array[Double],
      colors: js.Array[Double],
      alphas: js.Array[Double],
      texture: String,
      frame: integer
    ) = this()
  }
  
  /**
    * A PathFollower Game Object.
    * 
    * A PathFollower is a Sprite Game Object with some extra helpers to allow it to follow a Path automatically.
    * 
    * Anything you can do with a standard Sprite can be done with this PathFollower, such as animate it, tint it,
    * scale it and so on.
    * 
    * PathFollowers are bound to a single Path at any one time and can traverse the length of the Path, from start
    * to finish, forwards or backwards, or from any given point on the Path to its end. They can optionally rotate
    * to face the direction of the path, be offset from the path coordinates or rotate independently of the Path.
    */
  @js.native
  class PathFollower protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.PathFollower {
    /**
      * 
      * @param scene The Scene to which this PathFollower belongs.
      * @param path The Path this PathFollower is following. It can only follow one Path at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, path: Path, x: Double, y: Double, texture: String) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      path: Path,
      x: Double,
      y: Double,
      texture: String,
      frame: String
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      path: Path,
      x: Double,
      y: Double,
      texture: String,
      frame: integer
    ) = this()
  }
  
  /**
    * The Polygon Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * The Polygon Shape is created by providing a list of points, which are then used to create an
    * internal Polygon geometry object. The points can be set from a variety of formats:
    * 
    * - A string containing paired values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
    * - An array of Point or Vector2 objects: `[new Phaser.Math.Vec2(x1, y1), ...]`
    * - An array of objects with public x/y properties: `[obj1, obj2, ...]`
    * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
    * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
    * 
    * By default the `x` and `y` coordinates of this Shape refer to the center of it. However, depending
    * on the coordinates of the points provided, the final shape may be rendered offset from its origin.
    */
  @js.native
  class Polygon protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Polygon {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param points The points that make up the polygon.
      * @param fillColor The color the polygon will be filled with, i.e. 0xff0000 for red.
      * @param fillAlpha The alpha the polygon will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, points: js.Any) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, points: js.Any, fillColor: Double) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      points: js.Any,
      fillColor: Double,
      fillAlpha: Double
    ) = this()
  }
  
  /**
    * A Quad Game Object.
    * 
    * A Quad is a Mesh Game Object pre-configured with two triangles arranged into a rectangle, with a single
    * texture spread across them.
    * 
    * You can manipulate the corner points of the quad via the getters and setters such as `topLeftX`, and also
    * change their alpha and color values. The quad itself can be moved by adjusting the `x` and `y` properties.
    */
  @js.native
  class Quad protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Quad {
    /**
      * 
      * @param scene The Scene to which this Quad belongs.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  }
  
  /**
    * The Rectangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * You can change the size of the rectangle by changing the `width` and `height` properties.
    */
  @js.native
  class Rectangle protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Rectangle {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param width The width of the rectangle. Default 128.
      * @param height The height of the rectangle. Default 128.
      * @param fillColor The color the rectangle will be filled with, i.e. 0xff0000 for red.
      * @param fillAlpha The alpha the rectangle will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, width: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, width: Double, height: Double) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      fillColor: Double
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      fillColor: Double,
      fillAlpha: Double
    ) = this()
  }
  
  /**
    * A Render Texture.
    * 
    * A Render Texture is a special texture that allows any number of Game Objects to be drawn to it. You can take many complex objects and
    * draw them all to this one texture, which can they be used as the texture for other Game Object's. It's a way to generate dynamic
    * textures at run-time that are WebGL friendly and don't invoke expensive GPU uploads.
    * 
    * Note that under WebGL a FrameBuffer, which is what the Render Texture uses internally, cannot be anti-aliased. This means
    * that when drawing objects such as Shapes to a Render Texture they will appear to be drawn with no aliasing, however this
    * is a technical limitation of WebGL. To get around it, create your shape as a texture in an art package, then draw that
    * to the Render Texture.
    */
  @js.native
  class RenderTexture protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.RenderTexture {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param width The width of the Render Texture. Default 32.
      * @param height The height of the Render Texture. Default 32.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, width: integer) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, width: integer, height: integer) = this()
  }
  
  /**
    * A Shader Game Object.
    * 
    * This Game Object allows you to easily add a quad with its own shader into the display list, and manipulate it
    * as you would any other Game Object, including scaling, rotating, positioning and adding to Containers. Shaders
    * can be masked with either Bitmap or Geometry masks and can also be used as a Bitmap Mask for a Camera or other
    * Game Object. They can also be made interactive and used for input events.
    * 
    * It works by taking a reference to a `Phaser.Display.BaseShader` instance, as found in the Shader Cache. These can
    * be created dynamically at runtime, or loaded in via the GLSL File Loader:
    * 
    * ```javascript
    * function preload ()
    * {
    *     this.load.glsl('fire', 'shaders/fire.glsl.js');
    * }
    *  
    * function create ()
    * {
    *     this.add.shader('fire', 400, 300, 512, 512);
    * }
    * ```
    * 
    * Please see the Phaser 3 Examples GitHub repo for examples of loading and creating shaders dynamically.
    * 
    * Due to the way in which they work, you cannot directly change the alpha or blend mode of a Shader. This should
    * be handled via exposed uniforms in the shader code itself.
    * 
    * By default a Shader will be created with a standard set of uniforms. These were added to match those
    * found on sites such as ShaderToy or GLSLSandbox, and provide common functionality a shader may need,
    * such as the timestamp, resolution or pointer position. You can replace them by specifying your own uniforms
    * in the Base Shader.
    * 
    * These Shaders work by halting the current pipeline during rendering, creating a viewport matched to the
    * size of this Game Object and then renders a quad using the bound shader. At the end, the pipeline is restored.
    * 
    * Because it blocks the pipeline it means it will interrupt any batching that is currently going on, so you should
    * use these Game Objects sparingly. If you need to have a fully batched custom shader, then please look at using
    * a custom pipeline instead. However, for background or special masking effects, they are extremely effective.
    */
  @js.native
  class Shader protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Shader {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param key The key of the shader to use from the shader cache, or a BaseShader instance.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param width The width of the Game Object. Default 128.
      * @param height The height of the Game Object. Default 128.
      * @param textures Optional array of texture keys to bind to the iChannel0...3 uniforms. The textures must already exist in the Texture Manager.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, key: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, key: BaseShader) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, key: String, x: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, key: BaseShader, x: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, key: String, x: Double, y: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, key: BaseShader, x: Double, y: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, key: String, x: Double, y: Double, width: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, key: BaseShader, x: Double, y: Double, width: Double) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      key: String,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      key: BaseShader,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      key: String,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      textures: js.Array[String]
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      key: BaseShader,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      textures: js.Array[String]
    ) = this()
  }
  
  /**
    * The Shape Game Object is a base class for the various different shapes, such as the Arc, Star or Polygon.
    * You cannot add a Shape directly to your Scene, it is meant as a base for your own custom Shape classes.
    */
  @js.native
  class Shape protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Shape {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param type The internal type of the Shape.
      * @param data The data of the source shape geometry, if any.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, `type`: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, `type`: String, data: js.Any) = this()
  }
  
  /**
    * A Sprite Game Object.
    * 
    * A Sprite Game Object is used for the display of both static and animated images in your game.
    * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
    * and animated.
    * 
    * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
    * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
    * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
    */
  @js.native
  class Sprite protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Sprite {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: String) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  }
  
  /**
    * The Star Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * As the name implies, the Star shape will display a star in your game. You can control several
    * aspects of it including the number of points that constitute the star. The default is 5. If
    * you change it to 4 it will render as a diamond. If you increase them, you'll get a more spiky
    * star shape.
    * 
    * You can also control the inner and outer radius, which is how 'long' each point of the star is.
    * Modify these values to create more interesting shapes.
    */
  @js.native
  class Star protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Star {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param points The number of points on the star. Default 5.
      * @param innerRadius The inner radius of the star. Default 32.
      * @param outerRadius The outer radius of the star. Default 64.
      * @param fillColor The color the star will be filled with, i.e. 0xff0000 for red.
      * @param fillAlpha The alpha the star will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      points: js.UndefOr[Double],
      innerRadius: js.UndefOr[Double],
      outerRadius: js.UndefOr[Double],
      fillColor: js.UndefOr[Double],
      fillAlpha: js.UndefOr[Double]
    ) = this()
  }
  
  /**
    * A Text Game Object.
    * 
    * Text objects work by creating their own internal hidden Canvas and then renders text to it using
    * the standard Canvas `fillText` API. It then creates a texture from this canvas which is rendered
    * to your game during the render pass.
    * 
    * Because it uses the Canvas API you can take advantage of all the features this offers, such as
    * applying gradient fills to the text, or strokes, shadows and more. You can also use custom fonts
    * loaded externally, such as Google or TypeKit Web fonts.
    * 
    * **Important:** If the font you wish to use has a space or digit in its name, such as
    * 'Press Start 2P' or 'Roboto Condensed', then you _must_ put the font name in quotes, either
    * when creating the Text object, or when setting the font via `setFont` or `setFontFamily`. I.e.:
    * 
    * ```javascript
    * this.add.text(0, 0, 'Hello World', { fontFamily: '"Roboto Condensed"' });
    * ```
    * 
    * Equally, if you wish to provide a list of fallback fonts, then you should ensure they are all
    * quoted properly, too:
    * 
    * ```javascript
    * this.add.text(0, 0, 'Hello World', { fontFamily: 'Verdana, "Times New Roman", Tahoma, serif' });
    * ```
    * 
    * You can only display fonts that are currently loaded and available to the browser: therefore fonts must
    * be pre-loaded. Phaser does not do ths for you, so you will require the use of a 3rd party font loader,
    * or have the fonts ready available in the CSS on the page in which your Phaser game resides.
    * 
    * See {@link http://www.jordanm.co.uk/tinytype this compatibility table} for the available default fonts
    * across mobile browsers.
    * 
    * A note on performance: Every time the contents of a Text object changes, i.e. changing the text being
    * displayed, or the style of the text, it needs to remake the Text canvas, and if on WebGL, re-upload the
    * new texture to the GPU. This can be an expensive operation if used often, or with large quantities of
    * Text objects in your game. If you run into performance issues you would be better off using Bitmap Text
    * instead, as it benefits from batching and avoids expensive Canvas API calls.
    */
  @js.native
  class Text protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Text {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param text The text this Text object will display.
      * @param style The text style configuration object.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, text: String, style: TextSyle) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      text: js.Array[String],
      style: TextSyle
    ) = this()
  }
  
  /**
    * A TextStyle class manages all of the style settings for a Text object.
    * 
    * Text Game Objects create a TextStyle instance automatically, which is
    * accessed via the `Text.style` property. You do not normally need to
    * instantiate one yourself.
    */
  @js.native
  class TextStyle protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.TextStyle {
    /**
      * 
      * @param text The Text object that this TextStyle is styling.
      * @param style The style settings to set.
      */
    def this(text: typings.phaser.PhaserNs.GameObjectsNs.Text, style: TextSyle) = this()
  }
  
  /**
    * A TileSprite is a Sprite that has a repeating texture.
    * 
    * The texture can be scrolled and scaled independently of the TileSprite itself. Textures will automatically wrap and
    * are designed so that you can create game backdrops using seamless textures as a source.
    * 
    * You shouldn't ever create a TileSprite any larger than your actual canvas size. If you want to create a large repeating background
    * that scrolls across the whole map of your game, then you create a TileSprite that fits the canvas size and then use the `tilePosition`
    * property to scroll the texture as the player moves. If you create a TileSprite that is thousands of pixels in size then it will 
    * consume huge amounts of memory and cause performance issues. Remember: use `tilePosition` to scroll your texture and `tileScale` to
    * adjust the scale of the texture - don't resize the sprite itself or make it larger than it needs.
    * 
    * An important note about Tile Sprites and NPOT textures: Internally, TileSprite textures use GL_REPEAT to provide
    * seamless repeating of the textures. This, combined with the way in which the textures are handled in WebGL, means
    * they need to be POT (power-of-two) sizes in order to wrap. If you provide a NPOT (non power-of-two) texture to a
    * TileSprite it will generate a POT sized canvas and draw your texture to it, scaled up to the POT size. It's then
    * scaled back down again during rendering to the original dimensions. While this works, in that it allows you to use
    * any size texture for a Tile Sprite, it does mean that NPOT textures are going to appear anti-aliased when rendered,
    * due to the interpolation that took place when it was resized into a POT texture. This is especially visible in
    * pixel art graphics. If you notice it and it becomes an issue, the only way to avoid it is to ensure that you
    * provide POT textures for Tile Sprites.
    */
  @js.native
  class TileSprite protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.TileSprite {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param width The width of the Game Object. If zero it will use the size of the texture frame.
      * @param height The height of the Game Object. If zero it will use the size of the texture frame.
      * @param textureKey The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frameKey An optional frame from the Texture this Game Object is rendering with.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      width: integer,
      height: integer,
      textureKey: String
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      width: integer,
      height: integer,
      textureKey: String,
      frameKey: String
    ) = this()
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: Double,
      y: Double,
      width: integer,
      height: integer,
      textureKey: String,
      frameKey: integer
    ) = this()
  }
  
  /**
    * The Triangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * The Triangle consists of 3 lines, joining up to form a triangular shape. You can control the
    * position of each point of these lines. The triangle is always closed and cannot have an open
    * face. If you require that, consider using a Polygon instead.
    */
  @js.native
  class Triangle protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Triangle {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
      * @param x The horizontal position of this Game Object in the world. Default 0.
      * @param y The vertical position of this Game Object in the world. Default 0.
      * @param x1 The horizontal position of the first point in the triangle. Default 0.
      * @param y1 The vertical position of the first point in the triangle. Default 128.
      * @param x2 The horizontal position of the second point in the triangle. Default 64.
      * @param y2 The vertical position of the second point in the triangle. Default 0.
      * @param x3 The horizontal position of the third point in the triangle. Default 128.
      * @param y3 The vertical position of the third point in the triangle. Default 128.
      * @param fillColor The color the triangle will be filled with, i.e. 0xff0000 for red.
      * @param fillAlpha The alpha the triangle will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
      */
    def this(
      scene: typings.phaser.PhaserNs.Scene,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x2: js.UndefOr[Double],
      y2: js.UndefOr[Double],
      x3: js.UndefOr[Double],
      y3: js.UndefOr[Double],
      fillColor: js.UndefOr[Double],
      fillAlpha: js.UndefOr[Double]
    ) = this()
  }
  
  /**
    * The Update List plugin.
    * 
    * Update Lists belong to a Scene and maintain the list Game Objects to be updated every frame.
    * 
    * Some or all of these Game Objects may also be part of the Scene's [Display List]{@link Phaser.GameObjects.DisplayList}, for Rendering.
    */
  @js.native
  class UpdateList protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.UpdateList {
    /**
      * 
      * @param scene The Scene that the Update List belongs to.
      */
    def this(scene: typings.phaser.PhaserNs.Scene) = this()
  }
  
  /**
    * A Zone Game Object.
    * 
    * A Zone is a non-rendering rectangular Game Object that has a position and size.
    * It has no texture and never displays, but does live on the display list and
    * can be moved, scaled and rotated like any other Game Object.
    * 
    * Its primary use is for creating Drop Zones and Input Hit Areas and it has a couple of helper methods
    * specifically for this. It is also useful for object overlap checks, or as a base for your own
    * non-displaying Game Objects.
    * The default origin is 0.5, the center of the Zone, the same as with Game Objects.
    */
  @js.native
  class Zone protected ()
    extends typings.phaser.PhaserNs.GameObjectsNs.Zone {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param width The width of the Game Object. Default 1.
      * @param height The height of the Game Object. Default 1.
      */
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, width: Double) = this()
    def this(scene: typings.phaser.PhaserNs.Scene, x: Double, y: Double, width: Double, height: Double) = this()
  }
  
  /**
    * Builds a Game Object using the provided configuration object.
    * @param scene A reference to the Scene.
    * @param gameObject The initial GameObject.
    * @param config The config to build the GameObject with.
    */
  def BuildGameObject(
    scene: typings.phaser.PhaserNs.Scene,
    gameObject: typings.phaser.PhaserNs.GameObjectsNs.GameObject,
    config: GameObjectConfig
  ): typings.phaser.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Adds an Animation component to a Sprite and populates it based on the given config.
    * @param sprite The sprite to add an Animation component to.
    * @param config The animation config.
    */
  def BuildGameObjectAnimation(sprite: typings.phaser.PhaserNs.GameObjectsNs.Sprite, config: js.Object): typings.phaser.PhaserNs.GameObjectsNs.Sprite = js.native
  /* static members */
  @js.native
  object BitmapText extends js.Object {
    /**
      * Center align the text characters in a multi-line BitmapText object.
      */
    var ALIGN_CENTER: integer = js.native
    /**
      * Left align the text characters in a multi-line BitmapText object.
      */
    var ALIGN_LEFT: integer = js.native
    /**
      * Right align the text characters in a multi-line BitmapText object.
      */
    var ALIGN_RIGHT: integer = js.native
    /**
      * Parse an XML Bitmap Font from an Atlas.
      * 
      * Adds the parsed Bitmap Font data to the cache with the `fontName` key.
      */
    var ParseFromAtlas: js.Function = js.native
    /**
      * Parse an XML font to Bitmap Font data for the Bitmap Font cache.
      */
    var ParseXMLBitmapFont: js.Function = js.native
  }
  
  @JSName("Components")
  @js.native
  object ComponentsNs extends js.Object {
    /**
      * A Matrix used for display transformations for rendering.
      * 
      * It is represented like so:
      * 
      * ```
      * | a | c | tx |
      * | b | d | ty |
      * | 0 | 0 | 1  |
      * ```
      */
    @js.native
    class TransformMatrix protected ()
      extends typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.TransformMatrix {
      /**
        * 
        * @param a The Scale X value. Default 1.
        * @param b The Shear Y value. Default 0.
        * @param c The Shear X value. Default 0.
        * @param d The Scale Y value. Default 1.
        * @param tx The Translate X value. Default 0.
        * @param ty The Translate Y value. Default 0.
        */
      def this(
        a: js.UndefOr[Double],
        b: js.UndefOr[Double],
        c: js.UndefOr[Double],
        d: js.UndefOr[Double],
        tx: js.UndefOr[Double],
        ty: js.UndefOr[Double]
      ) = this()
    }
    
  }
  
  @JSName("Events")
  @js.native
  object EventsNs extends js.Object {
    /**
      * The Game Object Destroy Event.
      * 
      * This event is dispatched when a Game Object instance is being destroyed.
      * 
      * Listen for it on a Game Object instance using `GameObject.on('destroy', listener)`.
      */
    val DESTROY: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object GameObject extends js.Object {
    /**
      * The bitmask that `GameObject.renderFlags` is compared against to determine if the Game Object will render or not.
      */
    val RENDER_MASK: integer = js.native
  }
  
  /* static members */
  @js.native
  object Graphics extends js.Object {
    /**
      * A Camera used specifically by the Graphics system for rendering to textures.
      */
    var TargetCamera: Camera = js.native
  }
  
  @JSName("Particles")
  @js.native
  object ParticlesNs extends js.Object {
    /**
      * A Particle Emitter property.
      * 
      * Facilitates changing Particle properties as they are emitted and throughout their lifetime.
      */
    @js.native
    class EmitterOp protected ()
      extends typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.EmitterOp {
      /**
        * 
        * @param config Settings for the Particle Emitter that owns this property.
        * @param key The name of the property.
        * @param defaultValue The default value of the property.
        * @param emitOnly Whether the property can only be modified when a Particle is emitted. Default false.
        */
      def this(config: ParticleEmitterConfig, key: String, defaultValue: Double) = this()
      def this(config: ParticleEmitterConfig, key: String, defaultValue: Double, emitOnly: Boolean) = this()
    }
    
    /**
      * The GravityWell action applies a force on the particle to draw it towards, or repel it from, a single point.
      * 
      * The force applied is inversely proportional to the square of the distance from the particle to the point, in accordance with Newton's law of gravity.
      * 
      * This simulates the effect of gravity over large distances (as between planets, for example).
      */
    @js.native
    /**
      * 
      * @param x The x coordinate of the Gravity Well, in world space. Default 0.
      * @param y The y coordinate of the Gravity Well, in world space. Default 0.
      * @param power The strength of the gravity force - larger numbers produce a stronger force. Default 0.
      * @param epsilon The minimum distance for which the gravity force is calculated. Default 100.
      * @param gravity The gravitational force of this Gravity Well. Default 50.
      */
    class GravityWell ()
      extends typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.GravityWell {
      def this(x: Double) = this()
      def this(x: GravityWellConfig) = this()
      def this(x: Double, y: Double) = this()
      def this(x: GravityWellConfig, y: Double) = this()
      def this(x: Double, y: Double, power: Double) = this()
      def this(x: GravityWellConfig, y: Double, power: Double) = this()
      def this(x: Double, y: Double, power: Double, epsilon: Double) = this()
      def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double) = this()
      def this(x: Double, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
      def this(x: GravityWellConfig, y: Double, power: Double, epsilon: Double, gravity: Double) = this()
    }
    
    /**
      * A Particle is a simple Game Object controlled by a Particle Emitter and Manager, and rendered by the Manager.
      * It uses its own lightweight physics system, and can interact only with its Emitter's bounds and zones.
      */
    @js.native
    class Particle protected ()
      extends typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.Particle {
      /**
        * 
        * @param emitter The Emitter to which this Particle belongs.
        */
      def this(emitter: typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitter) = this()
    }
    
    /**
      * A particle emitter represents a single particle stream.
      * It controls a pool of {@link Phaser.GameObjects.Particles.Particle Particles} and is controlled by a {@link Phaser.GameObjects.Particles.ParticleEmitterManager Particle Emitter Manager}.
      */
    @js.native
    class ParticleEmitter protected ()
      extends typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitter {
      /**
        * 
        * @param manager The Emitter Manager this Emitter belongs to.
        * @param config Settings for this emitter.
        */
      def this(
        manager: typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager,
        config: ParticleEmitterConfig
      ) = this()
    }
    
    /**
      * A Particle Emitter Manager creates and controls {@link Phaser.GameObjects.Particles.ParticleEmitter Particle Emitters} and {@link Phaser.GameObjects.Particles.GravityWell Gravity Wells}.
      */
    @js.native
    class ParticleEmitterManager protected ()
      extends typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager {
      /**
        * 
        * @param scene The Scene to which this Emitter Manager belongs.
        * @param texture The key of the Texture this Emitter Manager will use to render particles, as stored in the Texture Manager.
        * @param frame An optional frame from the Texture this Emitter Manager will use to render particles.
        * @param emitters Configuration settings for one or more emitters to create.
        */
      def this(scene: typings.phaser.PhaserNs.Scene, texture: String) = this()
      def this(scene: typings.phaser.PhaserNs.Scene, texture: String, frame: String) = this()
      def this(scene: typings.phaser.PhaserNs.Scene, texture: String, frame: integer) = this()
      def this(
        scene: typings.phaser.PhaserNs.Scene,
        texture: String,
        frame: String,
        emitters: js.Array[ParticleEmitterConfig]
      ) = this()
      def this(
        scene: typings.phaser.PhaserNs.Scene,
        texture: String,
        frame: String,
        emitters: ParticleEmitterConfig
      ) = this()
      def this(
        scene: typings.phaser.PhaserNs.Scene,
        texture: String,
        frame: integer,
        emitters: js.Array[ParticleEmitterConfig]
      ) = this()
      def this(
        scene: typings.phaser.PhaserNs.Scene,
        texture: String,
        frame: integer,
        emitters: ParticleEmitterConfig
      ) = this()
    }
    
    @JSName("Zones")
    @js.native
    object ZonesNs extends js.Object {
      /**
        * A Death Zone.
        * 
        * A Death Zone is a special type of zone that will kill a Particle as soon as it either enters, or leaves, the zone.
        * 
        * The zone consists of a `source` which could be a Geometric shape, such as a Rectangle or Ellipse, or your own
        * object as long as it includes a `contains` method for which the Particles can be tested against.
        */
      @js.native
      class DeathZone protected ()
        extends typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.DeathZone {
        /**
          * 
          * @param source An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
          * @param killOnEnter Should the Particle be killed when it enters the zone? `true` or leaves it? `false`
          */
        def this(source: DeathZoneSource, killOnEnter: Boolean) = this()
      }
      
      /**
        * A zone that places particles on a shape's edges.
        */
      @js.native
      class EdgeZone protected ()
        extends typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.EdgeZone {
        /**
          * 
          * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
          * @param quantity The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
          * @param stepRate The distance between each particle. When set, `quantity` is implied and should be set to 0.
          * @param yoyo Whether particles are placed from start to end and then end to start. Default false.
          * @param seamless Whether one endpoint will be removed if it's identical to the other. Default true.
          */
        def this(source: EdgeZoneSource, quantity: integer, stepRate: Double) = this()
        def this(source: EdgeZoneSource, quantity: integer, stepRate: Double, yoyo: Boolean) = this()
        def this(source: EdgeZoneSource, quantity: integer, stepRate: Double, yoyo: Boolean, seamless: Boolean) = this()
      }
      
      /**
        * A zone that places particles randomly within a shape's area.
        */
      @js.native
      class RandomZone protected ()
        extends typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs.RandomZone {
        /**
          * 
          * @param source An object instance with a `getRandomPoint(point)` method.
          */
        def this(source: RandomZoneSource) = this()
      }
      
    }
    
  }
  
  @JSName("RetroFont")
  @js.native
  object RetroFontNs extends js.Object {
    /**
      * Text Set 1 =  !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~
      */
    var TEXT_SET1: String = js.native
    /**
      * Text Set 10 = ABCDEFGHIJKLMNOPQRSTUVWXYZ
      */
    var TEXT_SET10: String = js.native
    /**
      * Text Set 11 = ABCDEFGHIJKLMNOPQRSTUVWXYZ.,"-+!?()':;0123456789
      */
    var TEXT_SET11: String = js.native
    /**
      * Text Set 2 =  !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ
      */
    var TEXT_SET2: String = js.native
    /**
      * Text Set 3 = ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
      */
    var TEXT_SET3: String = js.native
    /**
      * Text Set 4 = ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789
      */
    var TEXT_SET4: String = js.native
    /**
      * Text Set 5 = ABCDEFGHIJKLMNOPQRSTUVWXYZ.,/() '!?-*:0123456789
      */
    var TEXT_SET5: String = js.native
    /**
      * Text Set 6 = ABCDEFGHIJKLMNOPQRSTUVWXYZ!?:;0123456789"(),-.'
      */
    var TEXT_SET6: String = js.native
    /**
      * Text Set 7 = AGMSY+:4BHNTZ!;5CIOU.?06DJPV,(17EKQW")28FLRX-'39
      */
    var TEXT_SET7: String = js.native
    /**
      * Text Set 8 = 0123456789 .ABCDEFGHIJKLMNOPQRSTUVWXYZ
      */
    var TEXT_SET8: String = js.native
    /**
      * Text Set 9 = ABCDEFGHIJKLMNOPQRSTUVWXYZ()-0123456789.:,'"?!
      */
    var TEXT_SET9: String = js.native
    /**
      * Parses a Retro Font configuration object so you can pass it to the BitmapText constructor
      * and create a BitmapText object using a fixed-width retro font.
      * @param scene A reference to the Phaser Scene.
      * @param config The font configuration object.
      */
    def Parse(scene: typings.phaser.PhaserNs.Scene, config: RetroFontConfig): js.Object = js.native
  }
  
  /* static members */
  @js.native
  object Text extends js.Object {
    /**
      * Returns an object containing dimensions of the Text object.
      * @param text The Text object to calculate the size from.
      * @param size The Text metrics to use when calculating the size.
      * @param lines The lines of text to calculate the size from.
      */
    def GetTextSize(text: typings.phaser.PhaserNs.GameObjectsNs.Text, size: TextMetrics, lines: js.Array[_]): js.Object = js.native
    /**
      * Calculates the ascent, descent and fontSize of a given font style.
      * @param textStyle The TextStyle object to measure.
      */
    def MeasureText(textStyle: typings.phaser.PhaserNs.GameObjectsNs.TextStyle): TextMetrics = js.native
  }
  
}

