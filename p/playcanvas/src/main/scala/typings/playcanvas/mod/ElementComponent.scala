package typings.playcanvas.mod

import typings.playcanvas.anon.Mask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ElementComponents are used to construct user interfaces. An ElementComponent's [type](#type)
  * property can be configured in 3 main ways: as a text element, as an image element or as a group
  * element. If the ElementComponent has a {@link ScreenComponent} ancestor in the hierarchy, it
  * will be transformed with respect to the coordinate system of the screen. If there is no
  * {@link ScreenComponent} ancestor, the ElementComponent will be transformed like any other
  * entity.
  *
  * You should never need to use the ElementComponent constructor. To add an ElementComponent to a
  * {@link Entity}, use {@link Entity#addComponent}:
  *
  * ```javascript
  * // Add an element component to an entity with the default options
  * let entity = pc.Entity();
  * entity.addComponent("element"); // This defaults to a 'group' element
  * ```
  *
  * To create a simple text-based element:
  *
  * ```javascript
  * entity.addComponent("element", {
  *     anchor: new pc.Vec4(0.5, 0.5, 0.5, 0.5), // centered anchor
  *     fontAsset: fontAsset,
  *     fontSize: 128,
  *     pivot: new pc.Vec2(0.5, 0.5),            // centered pivot
  *     text: "Hello World!",
  *     type: pc.ELEMENTTYPE_TEXT
  * });
  * ```
  *
  * Once the ElementComponent is added to the entity, you can set and get any of its properties:
  *
  * ```javascript
  * entity.element.color = pc.Color.RED; // Set the element's color to red
  *
  * console.log(entity.element.color);   // Get the element's color and print it
  * ```
  *
  * Relevant 'Engine-only' examples:
  * - [Basic text rendering](http://playcanvas.github.io/#user-interface/text-basic)
  * - [Rendering text outlines](http://playcanvas.github.io/#user-interface/text-outline)
  * - [Adding drop shadows to text](http://playcanvas.github.io/#user-interface/text-drop-shadow)
  * - [Coloring text with markup](http://playcanvas.github.io/#user-interface/text-markup)
  * - [Wrapping text](http://playcanvas.github.io/#user-interface/text-wrap)
  * - [Typewriter text](http://playcanvas.github.io/#user-interface/text-typewriter)
  *
  * @property {import('../../../core/math/color.js').Color} color The color of the image for
  * {@link ELEMENTTYPE_IMAGE} types or the color of the text for {@link ELEMENTTYPE_TEXT} types.
  * @property {number} opacity The opacity of the image for {@link ELEMENTTYPE_IMAGE} types or the
  * text for {@link ELEMENTTYPE_TEXT} types.
  * @property {import('../../../core/math/color.js').Color} outlineColor The text outline effect
  * color and opacity. Only works for {@link ELEMENTTYPE_TEXT} types.
  * @property {number} outlineThickness The width of the text outline effect. Only works for
  * {@link ELEMENTTYPE_TEXT} types.
  * @property {import('../../../core/math/color.js').Color} shadowColor The text shadow effect color
  * and opacity. Only works for {@link ELEMENTTYPE_TEXT} types.
  * @property {Vec2} shadowOffset The text shadow effect shift amount from original text. Only works
  * for {@link ELEMENTTYPE_TEXT} types.
  * @property {boolean} autoWidth Automatically set the width of the component to be the same as the
  * textWidth. Only works for {@link ELEMENTTYPE_TEXT} types.
  * @property {boolean} autoHeight Automatically set the height of the component to be the same as
  * the textHeight. Only works for {@link ELEMENTTYPE_TEXT} types.
  * @property {string} fitMode Set how the content should be fitted and preserve the aspect ratio of
  * the source texture or sprite. Only works for {@link ELEMENTTYPE_IMAGE} types.
  * @property {number} fontAsset The id of the font asset used for rendering the text. Only works
  * for {@link ELEMENTTYPE_TEXT} types.
  * @property {import('../../font/font.js').Font} font The font used for rendering the text. Only
  * works for {@link ELEMENTTYPE_TEXT} types.
  * @property {number} fontSize The size of the font. Only works for {@link ELEMENTTYPE_TEXT} types.
  * @property {boolean} autoFitWidth When true the font size and line height will scale so that the
  * text fits inside the width of the Element. The font size will be scaled between minFontSize and
  * maxFontSize. The value of autoFitWidth will be ignored if autoWidth is true.
  * @property {boolean} autoFitHeight When true the font size and line height will scale so that the
  * text fits inside the height of the Element. The font size will be scaled between minFontSize and
  * maxFontSize. The value of autoFitHeight will be ignored if autoHeight is true.
  * @property {number} minFontSize The minimum size that the font can scale to when autoFitWidth or
  * autoFitHeight are true.
  * @property {number} maxFontSize The maximum size that the font can scale to when autoFitWidth or
  * autoFitHeight are true.
  * @property {number} spacing The spacing between the letters of the text. Only works for
  * {@link ELEMENTTYPE_TEXT} types.
  * @property {number} lineHeight The height of each line of text. Only works for
  * {@link ELEMENTTYPE_TEXT} types.
  * @property {boolean} wrapLines Whether to automatically wrap lines based on the element width.
  * Only works for {@link ELEMENTTYPE_TEXT} types, and when autoWidth is set to false.
  * @property {number} maxLines The maximum number of lines that the Element can wrap to. Any
  * leftover text will be appended to the last line. Set this to null to allow unlimited lines.
  * @property {Vec2} alignment The horizontal and vertical alignment of the text. Values range from
  * 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.  Only works for
  * {@link ELEMENTTYPE_TEXT} types.
  * @property {string} text The text to render. Only works for {@link ELEMENTTYPE_TEXT} types. To
  * override certain text styling properties on a per-character basis, the text can optionally
  * include markup tags contained within square brackets. Supported tags are:
  *
  * - `color` - override the element's `color` property. Examples:
  *   - `[color="#ff0000"]red text[/color]`
  *   - `[color="#00ff00"]green text[/color]`
  *   - `[color="#0000ff"]blue text[/color]`
  * - `outline` - override the element's `outlineColor` and `outlineThickness` properties. Example:
  *   - `[outline color="#ffffff" thickness="0.5"]text[/outline]`
  * - `shadow` - override the element's `shadowColor` and `shadowOffset` properties. Examples:
  *   - `[shadow color="#ffffff" offset="0.5"]text[/shadow]`
  *   - `[shadow color="#000000" offsetX="0.1" offsetY="0.2"]text[/shadow]`
  *
  * Note that markup tags are only processed if the text element's `enableMarkup` property is set to
  * true.
  * @property {string} key The localization key to use to get the localized text from
  * {@link Application#i18n}. Only works for {@link ELEMENTTYPE_TEXT} types.
  * @property {number} textureAsset The id of the texture asset to render. Only works for
  * {@link ELEMENTTYPE_IMAGE} types.
  * @property {import('../../../platform/graphics/texture.js').Texture} texture The texture to
  * render. Only works for {@link ELEMENTTYPE_IMAGE} types.
  * @property {number} spriteAsset The id of the sprite asset to render. Only works for
  * {@link ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
  * @property {import('../../../scene/sprite.js').Sprite} sprite The sprite to render. Only works
  * for {@link ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
  * @property {number} spriteFrame The frame of the sprite to render. Only works for
  * {@link ELEMENTTYPE_IMAGE} types who have a sprite assigned.
  * @property {number} pixelsPerUnit The number of pixels that map to one PlayCanvas unit. Only
  * works for {@link ELEMENTTYPE_IMAGE} types who have a sliced sprite assigned.
  * @property {number} materialAsset The id of the material asset to use when rendering an image.
  * Only works for {@link ELEMENTTYPE_IMAGE} types.
  * @property {import('../../../scene/materials/material.js').Material} material The material to use
  * when rendering an image. Only works for {@link ELEMENTTYPE_IMAGE} types.
  * @property {Vec4} rect Specifies which region of the texture to use in order to render an image.
  * Values range from 0 to 1 and indicate u, v, width, height. Only works for
  * {@link ELEMENTTYPE_IMAGE} types.
  * @property {boolean} rtlReorder Reorder the text for RTL languages using a function registered
  * by `app.systems.element.registerUnicodeConverter`.
  * @property {boolean} unicodeConverter Convert unicode characters using a function registered by
  * `app.systems.element.registerUnicodeConverter`.
  * @property {boolean} enableMarkup Flag for enabling markup processing. Only works for
  * {@link ELEMENTTYPE_TEXT} types. Defaults to false.
  * @property {number} rangeStart Index of the first character to render. Only works for
  * {@link ELEMENTTYPE_TEXT} types.
  * @property {number} rangeEnd Index of the last character to render. Only works for
  * {@link ELEMENTTYPE_TEXT} types.
  * @property {boolean} mask Switch Image Element into a mask. Masks do not render into the scene,
  * but instead limit child elements to only be rendered where this element is rendered.
  * @augments Component
  */
@JSImport("playcanvas", "ElementComponent")
@js.native
open class ElementComponent protected () extends Component {
  /**
    * Create a new ElementComponent instance.
    *
    * @param {import('./system.js').ElementComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: ElementComponentSystem, entity: Entity) = this()
  
  def _absBottom: Double = js.native
  
  /**
    * Fired when the mouse is pressed while the cursor is on the component. Only fired when
    * useInput is true.
    *
    * @event ElementComponent#mousedown
    * @param {ElementMouseEvent} event - The event.
    */
  /**
    * Fired when the mouse is released while the cursor is on the component. Only fired when
    * useInput is true.
    *
    * @event ElementComponent#mouseup
    * @param {ElementMouseEvent} event - The event.
    */
  /**
    * Fired when the mouse cursor enters the component. Only fired when useInput is true.
    *
    * @event ElementComponent#mouseenter
    * @param {ElementMouseEvent} event - The event.
    */
  /**
    * Fired when the mouse cursor leaves the component. Only fired when useInput is true.
    *
    * @event ElementComponent#mouseleave
    * @param {ElementMouseEvent} event - The event.
    */
  /**
    * Fired when the mouse cursor is moved on the component. Only fired when useInput is true.
    *
    * @event ElementComponent#mousemove
    * @param {ElementMouseEvent} event - The event.
    */
  /**
    * Fired when the mouse wheel is scrolled on the component. Only fired when useInput is true.
    *
    * @event ElementComponent#mousewheel
    * @param {ElementMouseEvent} event - The event.
    */
  /**
    * Fired when the mouse is pressed and released on the component or when a touch starts and
    * ends on the component. Only fired when useInput is true.
    *
    * @event ElementComponent#click
    * @param {ElementMouseEvent|ElementTouchEvent} event - The event.
    */
  /**
    * Fired when a touch starts on the component. Only fired when useInput is true.
    *
    * @event ElementComponent#touchstart
    * @param {ElementTouchEvent} event - The event.
    */
  /**
    * Fired when a touch ends on the component. Only fired when useInput is true.
    *
    * @event ElementComponent#touchend
    * @param {ElementTouchEvent} event - The event.
    */
  /**
    * Fired when a touch moves after it started touching the component. Only fired when useInput
    * is true.
    *
    * @event ElementComponent#touchmove
    * @param {ElementTouchEvent} event - The event.
    */
  /**
    * Fired when a touch is canceled on the component. Only fired when useInput is true.
    *
    * @event ElementComponent#touchcancel
    * @param {ElementTouchEvent} event - The event.
    */
  def _absLeft: Double = js.native
  
  def _absRight: Double = js.native
  
  def _absTop: Double = js.native
  
  var _addedModels: js.Array[Any] = js.native
  
  var _anchor: Vec4 = js.native
  
  var _anchorDirty: Boolean = js.native
  
  var _anchorTransform: Mat4 = js.native
  
  var _batchGroup: Any = js.native
  
  var _batchGroupId: Double = js.native
  
  var _beingInitialized: Boolean = js.native
  
  def _bindScreen(screen: Any): Unit = js.native
  
  def _calculateLocalAnchors(): Unit = js.native
  
  /**
    * Recalculates these properties:
    *   - `_localAnchor`
    *   - `width`
    *   - `height`
    *   - Local position is updated if anchors are split
    *
    * Assumes these properties are up to date:
    *   - `_margin`
    *
    * @param {boolean} propagateCalculatedWidth - If true, call `_setWidth` instead
    * of `_setCalculatedWidth`
    * @param {boolean} propagateCalculatedHeight - If true, call `_setHeight` instead
    * of `_setCalculatedHeight`
    * @private
    */
  /* private */ var _calculateSize: Any = js.native
  
  var _calculatedHeight: Double = js.native
  
  var _calculatedWidth: Double = js.native
  
  var _canvasCorners: js.Array[Vec2] = js.native
  
  var _canvasCornersDirty: Boolean = js.native
  
  var _cornersDirty: Boolean = js.native
  
  def _dirtifyMask(): Unit = js.native
  
  def _dirtyBatch(): Unit = js.native
  
  var _dirtyLocal: Boolean = js.native
  
  var _dirtyWorld: Boolean = js.native
  
  var _drawOrder: Double = js.native
  
  var _fitMode: String = js.native
  
  def _flagChildrenAsDirty(): Unit = js.native
  
  var _group: Any = js.native
  
  def _hasSplitAnchorsX: Boolean = js.native
  
  def _hasSplitAnchorsY: Boolean = js.native
  
  var _height: Double = js.native
  
  var _image: ImageElement = js.native
  
  def _isScreenCulled(): Boolean = js.native
  
  def _isScreenSpace(): Boolean = js.native
  
  var _layers: js.Array[Double] = js.native
  
  var _localAnchor: Vec4 = js.native
  
  var _margin: Vec4 = js.native
  
  var _maskOffset: Double = js.native
  
  var _maskedBy: Any = js.native
  
  var _modelTransform: Mat4 = js.native
  
  var _offsetReadAt: Double = js.native
  
  def _onInsert(parent: Any): Unit = js.native
  
  def _onPrerender(): Unit = js.native
  
  def _onScreenRemove(): Unit = js.native
  
  def _onScreenResize(res: Any): Unit = js.native
  
  def _onScreenSpaceChange(): Unit = js.native
  
  var _parentWorldTransform: Mat4 = js.native
  
  def _parseUpToScreen(): Mask = js.native
  
  def _patch(): Unit = js.native
  
  var _pivot: Vec2 = js.native
  
  var _screenCorners: js.Array[Vec3] = js.native
  
  var _screenToWorld: Mat4 = js.native
  
  var _screenTransform: Mat4 = js.native
  
  /**
    * This method sets the calculated height value and optionally updates the margins.
    *
    * @param {number} value - The new calculated height.
    * @param {boolean} updateMargins - Update margins or not.
    * @private
    */
  /* private */ var _setCalculatedHeight: Any = js.native
  
  /**
    * This method sets the calculated width value and optionally updates the margins.
    *
    * @param {number} value - The new calculated width.
    * @param {boolean} updateMargins - Update margins or not.
    * @private
    */
  /* private */ var _setCalculatedWidth: Any = js.native
  
  /**
    * Internal set height without updating margin.
    *
    * @param {number} h - The new height.
    * @private
    */
  /* private */ var _setHeight: Any = js.native
  
  /**
    * Patched method for setting the local position.
    *
    * @param {number|Vec3} x - The x coordinate or Vec3
    * @param {number} y - The y coordinate
    * @param {number} z - The z coordinate
    * @private
    */
  /* private */ var _setLocalPosition: Any = js.native
  
  def _setMaskedBy(mask: Any): Unit = js.native
  
  /**
    * Patched method for setting the position.
    *
    * @param {number|Vec3} x - The x coordinate or Vec3
    * @param {number} y - The y coordinate
    * @param {number} z - The z coordinate
    * @private
    */
  /* private */ var _setPosition: Any = js.native
  
  /**
    * Internal set width without updating margin.
    *
    * @param {number} w - The new width.
    * @private
    */
  /* private */ var _setWidth: Any = js.native
  
  var _sizeDirty: Boolean = js.native
  
  def _sync(): Any = js.native
  
  var _text: TextElement = js.native
  
  var _type: String = js.native
  
  def _unbindScreen(screen: Any): Unit = js.native
  
  def _unpatch(): Unit = js.native
  
  def _updateMask(currentMask: Any, depth: Any): Unit = js.native
  
  def _updateScreen(screen: Any): Unit = js.native
  
  var _useInput: Boolean = js.native
  
  var _width: Double = js.native
  
  var _worldCorners: js.Array[Vec3] = js.native
  
  var _worldCornersDirty: Boolean = js.native
  
  def aabb: Any = js.native
  
  def addModelToLayers(model: Any): Unit = js.native
  
  def alignment: Vec2 = js.native
  def alignment_=(arg: Vec2): Unit = js.native
  
  def anchor: Vec4 = js.native
  /**
    * Specifies where the left, bottom, right and top edges of the component are anchored relative
    * to its parent. Each value ranges from 0 to 1. e.g. a value of [0, 0, 0, 0] means that the
    * element will be anchored to the bottom left of its parent. A value of [1, 1, 1, 1] means it
    * will be anchored to the top right. A split anchor is when the left-right or top-bottom pairs
    * of the anchor are not equal. In that case the component will be resized to cover that entire
    * area. e.g. a value of [0, 0, 1, 1] will make the component resize exactly as its parent.
    *
    * @example
    * pc.app.root.findByName("Inventory").element.anchor = new pc.Vec4(Math.random() * 0.1, 0, 1, 0);
    * @example
    * pc.app.root.findByName("Inventory").element.anchor = [Math.random() * 0.1, 0, 1, 0];
    *
    * @type {Vec4 | number[]}
    */
  def anchor_=(arg: Vec4): Unit = js.native
  
  def autoFitHeight: Boolean = js.native
  def autoFitHeight_=(arg: Boolean): Unit = js.native
  
  def autoFitWidth: Boolean = js.native
  def autoFitWidth_=(arg: Boolean): Unit = js.native
  
  def autoHeight: Boolean = js.native
  def autoHeight_=(arg: Boolean): Unit = js.native
  
  def autoWidth: Boolean = js.native
  def autoWidth_=(arg: Boolean): Unit = js.native
  
  def batchGroupId: Double = js.native
  /**
    * Assign element to a specific batch group (see {@link BatchGroup}). Default is -1 (no group).
    *
    * @type {number}
    */
  def batchGroupId_=(arg: Double): Unit = js.native
  
  def bottom: Double = js.native
  /**
    * The distance from the bottom edge of the anchor. Can be used in combination with a split
    * anchor to make the component's top edge always be 'top' units away from the top.
    *
    * @type {number}
    */
  def bottom_=(arg: Double): Unit = js.native
  
  def calculatedHeight: Double = js.native
  /**
    * The height at which the element will be rendered. In most cases this will be the same as
    * `height`. However, in some cases the engine may calculate a different height for the element,
    * such as when the element is under the control of a {@link LayoutGroupComponent}. In these
    * scenarios, `calculatedHeight` may be smaller or larger than the height that was set in the
    * editor.
    *
    * @type {number}
    */
  def calculatedHeight_=(arg: Double): Unit = js.native
  
  def calculatedWidth: Double = js.native
  /**
    * The width at which the element will be rendered. In most cases this will be the same as
    * `width`. However, in some cases the engine may calculate a different width for the element,
    * such as when the element is under the control of a {@link LayoutGroupComponent}. In these
    * scenarios, `calculatedWidth` may be smaller or larger than the width that was set in the
    * editor.
    *
    * @type {number}
    */
  def calculatedWidth_=(arg: Double): Unit = js.native
  
  /**
    * An array of 4 {@link Vec2}s that represent the bottom left, bottom right, top right and top
    * left corners of the component in canvas pixels. Only works for screen space element
    * components.
    *
    * @type {Vec2[]}
    */
  def canvasCorners: js.Array[Vec2] = js.native
  
  def color: Color = js.native
  def color_=(arg: Color): Unit = js.native
  
  def drawOrder: Double = js.native
  /**
    * The draw order of the component. A higher value means that the component will be rendered on
    * top of other components.
    *
    * @type {number}
    */
  def drawOrder_=(arg: Double): Unit = js.native
  
  def enableMarkup: Boolean = js.native
  def enableMarkup_=(arg: Boolean): Unit = js.native
  
  def fitMode: String = js.native
  /**
    * Set how the content should be fitted and preserve the aspect ratio of the source texture or sprite.
    * Only works for {@link ELEMENTTYPE_IMAGE} types. Can be:
    *
    * - {@link FITMODE_STRETCH}: Fit the content exactly to Element's bounding box.
    * - {@link FITMODE_CONTAIN}: Fit the content within the Element's bounding box while preserving its Aspect Ratio.
    * - {@link FITMODE_COVER}: Fit the content to cover the entire Element's bounding box while preserving its Aspect Ratio.
    *
    * @type {string}
    */
  def fitMode_=(arg: String): Unit = js.native
  
  def font: Font | CanvasFont = js.native
  
  def fontAsset: Double = js.native
  def fontAsset_=(arg: Double): Unit = js.native
  
  def fontSize: Double = js.native
  def fontSize_=(arg: Double): Unit = js.native
  
  def font_=(arg: Font | CanvasFont): Unit = js.native
  
  def getMaskOffset(): Double = js.native
  
  def getOffsetPosition(x: Any, y: Any): Vec3 = js.native
  
  def height: Double = js.native
  /**
    * The height of the element as set in the editor. Note that in some cases this may not reflect
    * the true height at which the element is rendered, such as when the element is under the
    * control of a {@link LayoutGroupComponent}. See `calculatedHeight` in order to ensure you are
    * reading the true height at which the element will be rendered.
    *
    * @type {number}
    */
  def height_=(arg: Double): Unit = js.native
  
  def isVisibleForCamera(camera: Any): Boolean = js.native
  
  def key: String = js.native
  def key_=(arg: String): Unit = js.native
  
  def layers: js.Array[Double] = js.native
  /**
    * An array of layer IDs ({@link Layer#id}) to which this element should belong. Don't push,
    * pop, splice or modify this array, if you want to change it - set a new one instead.
    *
    * @type {number[]}
    */
  def layers_=(arg: js.Array[Double]): Unit = js.native
  
  def left: Double = js.native
  /**
    * The distance from the left edge of the anchor. Can be used in combination with a split
    * anchor to make the component's left edge always be 'left' units away from the left.
    *
    * @type {number}
    */
  def left_=(arg: Double): Unit = js.native
  
  def lineHeight: Double = js.native
  def lineHeight_=(arg: Double): Unit = js.native
  
  def margin: Vec4 = js.native
  /**
    * The distance from the left, bottom, right and top edges of the anchor. For example if we are
    * using a split anchor like [0,0,1,1] and the margin is [0,0,0,0] then the component will be
    * the same width and height as its parent.
    *
    * @type {Vec4}
    */
  def margin_=(arg: Vec4): Unit = js.native
  
  def mask: Boolean = js.native
  def mask_=(arg: Boolean): Unit = js.native
  
  /**
    * Get the entity that is currently masking this element.
    *
    * @type {Entity}
    * @private
    */
  /* private */ def maskedBy: Any = js.native
  
  def material: Material = js.native
  
  def materialAsset: Double = js.native
  def materialAsset_=(arg: Double): Unit = js.native
  
  def material_=(arg: Material): Unit = js.native
  
  def maxFontSize: Double = js.native
  def maxFontSize_=(arg: Double): Unit = js.native
  
  def maxLines: Double = js.native
  def maxLines_=(arg: Double): Unit = js.native
  
  def minFontSize: Double = js.native
  def minFontSize_=(arg: Double): Unit = js.native
  
  def onLayerAdded(layer: Any): Unit = js.native
  
  def onLayerRemoved(layer: Any): Unit = js.native
  
  def onLayersChanged(oldComp: Any, newComp: Any): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  def opacity: Double = js.native
  def opacity_=(arg: Double): Unit = js.native
  
  def outlineColor: Color = js.native
  def outlineColor_=(arg: Color): Unit = js.native
  
  def outlineThickness: Double = js.native
  def outlineThickness_=(arg: Double): Unit = js.native
  
  def pivot: Vec2 = js.native
  /**
    * The position of the pivot of the component relative to its anchor. Each value ranges from 0
    * to 1 where [0,0] is the bottom left and [1,1] is the top right.
    *
    * @example
    * pc.app.root.findByName("Inventory").element.pivot = [Math.random() * 0.1, Math.random() * 0.1];
    * @example
    * pc.app.root.findByName("Inventory").element.pivot = new pc.Vec2(Math.random() * 0.1, Math.random() * 0.1);
    *
    * @type {Vec2 | number[]}
    */
  def pivot_=(arg: Vec2): Unit = js.native
  
  def pixelsPerUnit: Double = js.native
  def pixelsPerUnit_=(arg: Double): Unit = js.native
  
  def rangeEnd: Double = js.native
  def rangeEnd_=(arg: Double): Unit = js.native
  
  def rangeStart: Double = js.native
  def rangeStart_=(arg: Double): Unit = js.native
  
  def rect: Vec4 = js.native
  def rect_=(arg: Vec4): Unit = js.native
  
  def removeModelFromLayers(model: Any): Unit = js.native
  
  def right: Double = js.native
  /**
    * The distance from the right edge of the anchor. Can be used in combination with a split
    * anchor to make the component's right edge always be 'right' units away from the right.
    *
    * @type {number}
    */
  def right_=(arg: Double): Unit = js.native
  
  def rtlReorder: Boolean = js.native
  def rtlReorder_=(arg: Boolean): Unit = js.native
  
  /**
    * The Entity with a {@link ScreenComponent} that this component belongs to. This is
    * automatically set when the component is a child of a ScreenComponent.
    *
    * @type {Entity|null}
    */
  var screen: Entity | Null = js.native
  
  /**
    * An array of 4 {@link Vec3}s that represent the bottom left, bottom right, top right and top
    * left corners of the component relative to its parent {@link ScreenComponent}.
    *
    * @type {Vec3[]}
    */
  def screenCorners: js.Array[Vec3] = js.native
  
  def shadowColor: Color = js.native
  def shadowColor_=(arg: Color): Unit = js.native
  
  def shadowOffset: Double = js.native
  def shadowOffset_=(arg: Double): Unit = js.native
  
  def spacing: Double = js.native
  def spacing_=(arg: Double): Unit = js.native
  
  def sprite: Sprite = js.native
  
  def spriteAsset: Double = js.native
  def spriteAsset_=(arg: Double): Unit = js.native
  
  def spriteFrame: Double = js.native
  def spriteFrame_=(arg: Double): Unit = js.native
  
  def sprite_=(arg: Sprite): Unit = js.native
  
  def syncMask(depth: Any): Unit = js.native
  
  def text: String = js.native
  
  /**
    * The height of the text rendered by the component. Only works for {@link ELEMENTTYPE_TEXT} types.
    *
    * @type {number}
    */
  def textHeight: Double = js.native
  
  /**
    * The width of the text rendered by the component. Only works for {@link ELEMENTTYPE_TEXT} types.
    *
    * @type {number}
    */
  def textWidth: Double = js.native
  
  def text_=(arg: String): Unit = js.native
  
  def texture: Texture = js.native
  
  def textureAsset: Double = js.native
  def textureAsset_=(arg: Double): Unit = js.native
  
  def texture_=(arg: Texture): Unit = js.native
  
  def top: Double = js.native
  /**
    * The distance from the top edge of the anchor. Can be used in combination with a split anchor
    * to make the component's bottom edge always be 'bottom' units away from the bottom.
    *
    * @type {number}
    */
  def top_=(arg: Double): Unit = js.native
  
  def `type`: String = js.native
  /**
    * The type of the ElementComponent. Can be:
    *
    * - {@link ELEMENTTYPE_GROUP}: The component can be used as a layout mechanism to create groups of
    * ElementComponents e.g. panels.
    * - {@link ELEMENTTYPE_IMAGE}: The component will render an image
    * - {@link ELEMENTTYPE_TEXT}: The component will render text
    *
    * @type {string}
    */
  def type_=(arg: String): Unit = js.native
  
  def unicodeConverter: Boolean = js.native
  def unicodeConverter_=(arg: Boolean): Unit = js.native
  
  def useInput: Boolean = js.native
  /**
    * If true then the component will receive Mouse or Touch input events.
    *
    * @type {boolean}
    */
  def useInput_=(arg: Boolean): Unit = js.native
  
  def width: Double = js.native
  /**
    * The width of the element as set in the editor. Note that in some cases this may not reflect
    * the true width at which the element is rendered, such as when the element is under the
    * control of a {@link LayoutGroupComponent}. See `calculatedWidth` in order to ensure you are
    * reading the true width at which the element will be rendered.
    *
    * @type {number}
    */
  def width_=(arg: Double): Unit = js.native
  
  /**
    * An array of 4 {@link Vec3}s that represent the bottom left, bottom right, top right and top
    * left corners of the component in world space. Only works for 3D element components.
    *
    * @type {Vec3[]}
    */
  def worldCorners: js.Array[Vec3] = js.native
  
  def wrapLines: Boolean = js.native
  def wrapLines_=(arg: Boolean): Unit = js.native
}
