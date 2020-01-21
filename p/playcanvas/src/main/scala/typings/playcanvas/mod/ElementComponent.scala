package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.ElementComponent
  * @extends pc.Component
  * @classdesc Enables an Entity to be positioned using anchors and screen coordinates under a {@link pc.ScreenComponent} or under other ElementComponents.
  * Depending on its type it can be used to render images, text or just as a layout mechanism to build 2D and 3D user interfaces.
  * If the component is a descendant of a {@link pc.ScreenComponent}, then the Entity's {@link pc.Entity.setLocalPosition} is in the {@link pc.ScreenComponent}'s coordinate system.
  * @param {pc.ElementComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @property {String} type The type of the ElementComponent. Can be one of the following:
  * <ul>
  *     <li>pc.ELEMENTTYPE_GROUP: The component can be used as a layout mechanism to create groups of ElementComponents e.g. panels.</li>
  *     <li>pc.ELEMENTTYPE_IMAGE: The component will render an image</li>
  *     <li>pc.ELEMENTTYPE_TEXT: The component will render text</li>
  * </ul>
  * @property {pc.Entity} screen The Entity with a {@link pc.ScreenComponent} that this component belongs to. This is automatically set when the component is a child of a ScreenComponent.
  * @property {Number} drawOrder The draw order of the component. A higher value means that the component will be rendered on top of other components.
  * @property {pc.Vec4} anchor Specifies where the left, bottom, right and top edges of the component are anchored relative to its parent. Each value
  * ranges from 0 to 1. E.g. a value of [0,0,0,0] means that the element will be anchored to the bottom left of its parent. A value of [1, 1, 1, 1] means
  * it will be anchored to the top right. A split anchor is when the left-right or top-bottom pairs of the anchor are not equal. In that case the component will be resized to cover that entire area. E.g. a value of [0,0,1,1] will make the component resize exactly as its parent.
  * @property {pc.Vec2} pivot The position of the pivot of the component relative to its anchor. Each value ranges from 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.
  * @property {pc.Vec4} margin The distance from the left, bottom, right and top edges of the anchor. For example if we are using a split anchor like [0,0,1,1] and the margin is [0,0,0,0] then the component will be the same width and height as its parent.
  * @property {Number} left The distance from the left edge of the anchor. Can be used in combination with a split anchor to make the component's left edge always be 'left' units away from the left.
  * @property {Number} right The distance from the right edge of the anchor. Can be used in combination with a split anchor to make the component's right edge always be 'right' units away from the right.
  * @property {Number} bottom The distance from the bottom edge of the anchor. Can be used in combination with a split anchor to make the component's top edge always be 'top' units away from the top.
  * @property {Number} top The distance from the top edge of the anchor. Can be used in combination with a split anchor to make the component's bottom edge always be 'bottom' units away from the bottom.
  * @property {Number} width The width of the element as set in the editor. Note that in some cases this may not reflect the true width at which the element is rendered, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. See <code>calculatedWidth</code> in order to ensure you are reading the true width at which the element will be rendered.
  * @property {Number} height The height of the element as set in the editor. Note that in some cases this may not reflect the true height at which the element is rendered, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. See <code>calculatedHeight</code> in order to ensure you are reading the true height at which the element will be rendered.
  * @property {Number} calculatedWidth The width at which the element will be rendered. In most cases this will be the same as <code>width</code>. However, in some cases the engine may calculate a different width for the element, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. In these scenarios, <code>calculatedWidth</code> may be smaller or larger than the width that was set in the editor.
  * @property {Number} calculatedHeight The height at which the element will be rendered. In most cases this will be the same as <code>height</code>. However, in some cases the engine may calculate a different height for the element, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. In these scenarios, <code>calculatedHeight</code> may be smaller or larger than the height that was set in the editor.
  * @property {pc.Vec3[]} screenCorners An array of 4 {@link pc.Vec3}s that represent the bottom left, bottom right, top right and top left corners of the component relative to its parent {@link pc.ScreenComponent}.
  * @property {pc.Vec3[]} worldCorners An array of 4 {@link pc.Vec3}s that represent the bottom left, bottom right, top right and top left corners of the component in world space. Only works for 3D ElementComponents.
  * @property {pc.Vec2[]} canvasCorners An array of 4 {@link pc.Vec2}s that represent the bottom left, bottom right, top right and top left corners of the component in canvas pixels. Only works for screen space ElementComponents.
  * @property {Boolean} useInput If true then the component will receive Mouse or Touch input events.
  * @property {pc.Color} color The color of the image for {@link pc.ELEMENTTYPE_IMAGE} types or the color of the text for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} opacity The opacity of the image for {@link pc.ELEMENTTYPE_IMAGE} types or the text for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {pc.Color} outlineColor The text outline effect color and opacity. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} outlineThickness The width of the text outline effect. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {pc.Color} shadowColor The text shadow effect color and opacity. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {pc.Vec2} shadowOffset The text shadow effect shift amount from original text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} textWidth The width of the text rendered by the component. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} textHeight The height of the text rendered by the component. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} autoWidth Automatically set the width of the component to be the same as the textWidth. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} autoHeight Automatically set the height of the component to be the same as the textHeight. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} fontAsset The id of the font asset used for rendering the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {pc.Font} font The font used for rendering the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} fontSize The size of the font. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Boolean} autoFitWidth When true the font size and line height will scale so that the text fits inside the width of the Element. The font size will be scaled between minFontSize and maxFontSize. The value of autoFitWidth will be ignored if autoWidth is true.
  * @property {Boolean} autoFitHeight When true the font size and line height will scale so that the text fits inside the height of the Element. The font size will be scaled between minFontSize and maxFontSize. The value of autoFitHeight will be ignored if autoHeight is true.
  * @property {Number} minFontSize The minimum size that the font can scale to when autoFitWidth or autoFitHeight are true.
  * @property {Number} maxFontSize The maximum size that the font can scale to when autoFitWidth or autoFitHeight are true.
  * @property {Number} spacing The spacing between the letters of the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} lineHeight The height of each line of text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Boolean} wrapLines Whether to automatically wrap lines based on the element width. Only works for {@link pc.ELEMENTTYPE_TEXT} types, and when autoWidth is set to false.
  * @property {Number} maxLines The maximum number of lines that the Element can wrap to. Any leftover text will be appended to the last line. Set this to null to allow unlimited lines.
  * @property {pc.Vec2} alignment The horizontal and vertical alignment of the text. Values range from 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.  Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {String} text The text to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {String} key The localization key to use to get the localized text from {@link pc.Application#i18n}. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} textureAsset The id of the texture asset to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {pc.Texture} texture The texture to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {Number} spriteAsset The id of the sprite asset to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
  * @property {pc.Sprite} sprite The sprite to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
  * @property {Number} spriteFrame The frame of the sprite to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types who have a sprite assigned.
  * @property {Number} pixelsPerUnit The number of pixels that map to one PlayCanvas unit. Only works for {@link pc.ELEMENTTYPE_IMAGE} types who have a sliced sprite assigned.
  * @property {Number} materialAsset The id of the material asset to use when rendering an image. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {pc.Material} material The material to use when rendering an image. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {pc.Vec4} rect Specifies which region of the texture to use in order to render an image. Values range from 0 to 1 and indicate u, v, width, height. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {Boolean} rtlReorder Reorder the text for RTL languages using a function registered by <code>app.systems.element.registerUnicodeConverter</code>.
  * @property {Boolean} unicodeConverter Convert unicode characters using a function registered by <code>app.systems.element.registerUnicodeConverter</code>.
  * @property {Number} batchGroupId Assign element to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property {Number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this element should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  * @property {Boolean} enableMarkup Flag for enabling markup processing. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} rangeStart Index of the first character to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {Number} rangeEnd Index of the last character to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  */
@JSImport("playcanvas", "ElementComponent")
@js.native
class ElementComponent protected ()
  extends typings.playcanvas.pc.ElementComponent {
  def this(system: typings.playcanvas.pc.ElementComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

