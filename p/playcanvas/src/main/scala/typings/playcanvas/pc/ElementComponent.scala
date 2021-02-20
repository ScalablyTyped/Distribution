package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables an Entity to be positioned using anchors and screen coordinates under a {@link pc.ScreenComponent} or under other ElementComponents.
  * Depending on its type it can be used to render images, text or just as a layout mechanism to build 2D and 3D user interfaces.
  * If the component is a descendant of a {@link pc.ScreenComponent}, then the Entity's {@link pc.Entity.setLocalPosition} is in the {@link pc.ScreenComponent}'s coordinate system.
  * @property type - The type of the ElementComponent. Can be:
  *
  * * {@link pc.ELEMENTTYPE_GROUP}: The component can be used as a layout mechanism to create groups of ElementComponents e.g. panels.
  * * {@link pc.ELEMENTTYPE_IMAGE}: The component will render an image
  * * {@link pc.ELEMENTTYPE_TEXT}: The component will render text
  * @property screen - The Entity with a {@link pc.ScreenComponent} that this component belongs to. This is automatically set when the component is a child of a ScreenComponent.
  * @property drawOrder - The draw order of the component. A higher value means that the component will be rendered on top of other components.
  * @property anchor - Specifies where the left, bottom, right and top edges of the component are anchored relative to its parent. Each value
  * ranges from 0 to 1. E.g. a value of [0,0,0,0] means that the element will be anchored to the bottom left of its parent. A value of [1, 1, 1, 1] means
  * it will be anchored to the top right. A split anchor is when the left-right or top-bottom pairs of the anchor are not equal. In that case the component will be resized to cover that entire area. E.g. a value of [0,0,1,1] will make the component resize exactly as its parent.
  * @property pivot - The position of the pivot of the component relative to its anchor. Each value ranges from 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.
  * @property margin - The distance from the left, bottom, right and top edges of the anchor. For example if we are using a split anchor like [0,0,1,1] and the margin is [0,0,0,0] then the component will be the same width and height as its parent.
  * @property left - The distance from the left edge of the anchor. Can be used in combination with a split anchor to make the component's left edge always be 'left' units away from the left.
  * @property right - The distance from the right edge of the anchor. Can be used in combination with a split anchor to make the component's right edge always be 'right' units away from the right.
  * @property bottom - The distance from the bottom edge of the anchor. Can be used in combination with a split anchor to make the component's top edge always be 'top' units away from the top.
  * @property top - The distance from the top edge of the anchor. Can be used in combination with a split anchor to make the component's bottom edge always be 'bottom' units away from the bottom.
  * @property width - The width of the element as set in the editor. Note that in some cases this may not reflect the true width at which the element is rendered, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. See `calculatedWidth` in order to ensure you are reading the true width at which the element will be rendered.
  * @property height - The height of the element as set in the editor. Note that in some cases this may not reflect the true height at which the element is rendered, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. See `calculatedHeight` in order to ensure you are reading the true height at which the element will be rendered.
  * @property calculatedWidth - The width at which the element will be rendered. In most cases this will be the same as `width`. However, in some cases the engine may calculate a different width for the element, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. In these scenarios, `calculatedWidth` may be smaller or larger than the width that was set in the editor.
  * @property calculatedHeight - The height at which the element will be rendered. In most cases this will be the same as `height`. However, in some cases the engine may calculate a different height for the element, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. In these scenarios, `calculatedHeight` may be smaller or larger than the height that was set in the editor.
  * @property screenCorners - An array of 4 {@link pc.Vec3}s that represent the bottom left, bottom right, top right and top left corners of the component relative to its parent {@link pc.ScreenComponent}.
  * @property worldCorners - An array of 4 {@link pc.Vec3}s that represent the bottom left, bottom right, top right and top left corners of the component in world space. Only works for 3D ElementComponents.
  * @property canvasCorners - An array of 4 {@link pc.Vec2}s that represent the bottom left, bottom right, top right and top left corners of the component in canvas pixels. Only works for screen space ElementComponents.
  * @property useInput - If true then the component will receive Mouse or Touch input events.
  * @property color - The color of the image for {@link pc.ELEMENTTYPE_IMAGE} types or the color of the text for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property opacity - The opacity of the image for {@link pc.ELEMENTTYPE_IMAGE} types or the text for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property outlineColor - The text outline effect color and opacity. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property outlineThickness - The width of the text outline effect. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property shadowColor - The text shadow effect color and opacity. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property shadowOffset - The text shadow effect shift amount from original text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property textWidth - The width of the text rendered by the component. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property textHeight - The height of the text rendered by the component. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property autoWidth - Automatically set the width of the component to be the same as the textWidth. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property autoHeight - Automatically set the height of the component to be the same as the textHeight. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property fontAsset - The id of the font asset used for rendering the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property font - The font used for rendering the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property fontSize - The size of the font. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property autoFitWidth - When true the font size and line height will scale so that the text fits inside the width of the Element. The font size will be scaled between minFontSize and maxFontSize. The value of autoFitWidth will be ignored if autoWidth is true.
  * @property autoFitHeight - When true the font size and line height will scale so that the text fits inside the height of the Element. The font size will be scaled between minFontSize and maxFontSize. The value of autoFitHeight will be ignored if autoHeight is true.
  * @property minFontSize - The minimum size that the font can scale to when autoFitWidth or autoFitHeight are true.
  * @property maxFontSize - The maximum size that the font can scale to when autoFitWidth or autoFitHeight are true.
  * @property spacing - The spacing between the letters of the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property lineHeight - The height of each line of text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property wrapLines - Whether to automatically wrap lines based on the element width. Only works for {@link pc.ELEMENTTYPE_TEXT} types, and when autoWidth is set to false.
  * @property maxLines - The maximum number of lines that the Element can wrap to. Any leftover text will be appended to the last line. Set this to null to allow unlimited lines.
  * @property alignment - The horizontal and vertical alignment of the text. Values range from 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.  Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property text - The text to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property key - The localization key to use to get the localized text from {@link pc.Application#i18n}. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property textureAsset - The id of the texture asset to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property texture - The texture to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property spriteAsset - The id of the sprite asset to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
  * @property sprite - The sprite to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
  * @property spriteFrame - The frame of the sprite to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types who have a sprite assigned.
  * @property pixelsPerUnit - The number of pixels that map to one PlayCanvas unit. Only works for {@link pc.ELEMENTTYPE_IMAGE} types who have a sliced sprite assigned.
  * @property materialAsset - The id of the material asset to use when rendering an image. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property material - The material to use when rendering an image. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property rect - Specifies which region of the texture to use in order to render an image. Values range from 0 to 1 and indicate u, v, width, height. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property rtlReorder - Reorder the text for RTL languages using a function registered by `app.systems.element.registerUnicodeConverter`.
  * @property unicodeConverter - Convert unicode characters using a function registered by `app.systems.element.registerUnicodeConverter`.
  * @property batchGroupId - Assign element to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this element should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  * @property enableMarkup - Flag for enabling markup processing. Only works for {@link pc.ELEMENTTYPE_TEXT} types. The only supported tag is `[color]` with a hex color value. E.g `[color="#ff0000"]red text[/color]`
  * @property rangeStart - Index of the first character to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property rangeEnd - Index of the last character to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property mask - Switch Image Element into a mask. Masks do not render into the scene, but instead limit child elements to only be rendered where this element is rendered.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait ElementComponent extends Component {
  
  /**
    * The horizontal and vertical alignment of the text. Values range from 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.  Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var alignment: Vec2 = js.native
  
  /**
    * Specifies where the left, bottom, right and top edges of the component are anchored relative to its parent. Each value
    ranges from 0 to 1. E.g. a value of [0,0,0,0] means that the element will be anchored to the bottom left of its parent. A value of [1, 1, 1, 1] means
    it will be anchored to the top right. A split anchor is when the left-right or top-bottom pairs of the anchor are not equal. In that case the component will be resized to cover that entire area. E.g. a value of [0,0,1,1] will make the component resize exactly as its parent.
    */
  var anchor: Vec4 = js.native
  
  /**
    * When true the font size and line height will scale so that the text fits inside the height of the Element. The font size will be scaled between minFontSize and maxFontSize. The value of autoFitHeight will be ignored if autoHeight is true.
    */
  var autoFitHeight: Boolean = js.native
  
  /**
    * When true the font size and line height will scale so that the text fits inside the width of the Element. The font size will be scaled between minFontSize and maxFontSize. The value of autoFitWidth will be ignored if autoWidth is true.
    */
  var autoFitWidth: Boolean = js.native
  
  /**
    * Automatically set the height of the component to be the same as the textHeight. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var autoHeight: Boolean = js.native
  
  /**
    * Automatically set the width of the component to be the same as the textWidth. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var autoWidth: Boolean = js.native
  
  /**
    * Assign element to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
    */
  var batchGroupId: Double = js.native
  
  /**
    * The distance from the bottom edge of the anchor. Can be used in combination with a split anchor to make the component's top edge always be 'top' units away from the top.
    */
  var bottom: Double = js.native
  
  /**
    * The height at which the element will be rendered. In most cases this will be the same as `height`. However, in some cases the engine may calculate a different height for the element, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. In these scenarios, `calculatedHeight` may be smaller or larger than the height that was set in the editor.
    */
  var calculatedHeight: Double = js.native
  
  /**
    * The width at which the element will be rendered. In most cases this will be the same as `width`. However, in some cases the engine may calculate a different width for the element, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. In these scenarios, `calculatedWidth` may be smaller or larger than the width that was set in the editor.
    */
  var calculatedWidth: Double = js.native
  
  /**
    * An array of 4 {@link pc.Vec2}s that represent the bottom left, bottom right, top right and top left corners of the component in canvas pixels. Only works for screen space ElementComponents.
    */
  var canvasCorners: js.Array[Vec2] = js.native
  
  /**
    * The color of the image for {@link pc.ELEMENTTYPE_IMAGE} types or the color of the text for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var color: Color = js.native
  
  /**
    * The draw order of the component. A higher value means that the component will be rendered on top of other components.
    */
  var drawOrder: Double = js.native
  
  /**
    * Flag for enabling markup processing. Only works for {@link pc.ELEMENTTYPE_TEXT} types. The only supported tag is `[color]` with a hex color value. E.g `[color="#ff0000"]red text[/color]`
    */
  var enableMarkup: Boolean = js.native
  
  /**
    * The font used for rendering the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var font: Font = js.native
  
  /**
    * The id of the font asset used for rendering the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var fontAsset: Double = js.native
  
  /**
    * The size of the font. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var fontSize: Double = js.native
  
  /**
    * The height of the element as set in the editor. Note that in some cases this may not reflect the true height at which the element is rendered, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. See `calculatedHeight` in order to ensure you are reading the true height at which the element will be rendered.
    */
  var height: Double = js.native
  
  /**
    * The localization key to use to get the localized text from {@link pc.Application#i18n}. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var key: String = js.native
  
  /**
    * An array of layer IDs ({@link pc.Layer#id}) to which this element should belong.
    Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
    */
  var layers: js.Array[Double] = js.native
  
  /**
    * The distance from the left edge of the anchor. Can be used in combination with a split anchor to make the component's left edge always be 'left' units away from the left.
    */
  var left: Double = js.native
  
  /**
    * The height of each line of text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var lineHeight: Double = js.native
  
  /**
    * The distance from the left, bottom, right and top edges of the anchor. For example if we are using a split anchor like [0,0,1,1] and the margin is [0,0,0,0] then the component will be the same width and height as its parent.
    */
  var margin: Vec4 = js.native
  
  /**
    * Switch Image Element into a mask. Masks do not render into the scene, but instead limit child elements to only be rendered where this element is rendered.
    */
  var mask: Boolean = js.native
  
  /**
    * The material to use when rendering an image. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
    */
  var material: Material = js.native
  
  /**
    * The id of the material asset to use when rendering an image. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
    */
  var materialAsset: Double = js.native
  
  /**
    * The maximum size that the font can scale to when autoFitWidth or autoFitHeight are true.
    */
  var maxFontSize: Double = js.native
  
  /**
    * The maximum number of lines that the Element can wrap to. Any leftover text will be appended to the last line. Set this to null to allow unlimited lines.
    */
  var maxLines: Double = js.native
  
  /**
    * The minimum size that the font can scale to when autoFitWidth or autoFitHeight are true.
    */
  var minFontSize: Double = js.native
  
  /**
    * The opacity of the image for {@link pc.ELEMENTTYPE_IMAGE} types or the text for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var opacity: Double = js.native
  
  /**
    * The text outline effect color and opacity. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var outlineColor: Color = js.native
  
  /**
    * The width of the text outline effect. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var outlineThickness: Double = js.native
  
  /**
    * The position of the pivot of the component relative to its anchor. Each value ranges from 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.
    */
  var pivot: Vec2 = js.native
  
  /**
    * The number of pixels that map to one PlayCanvas unit. Only works for {@link pc.ELEMENTTYPE_IMAGE} types who have a sliced sprite assigned.
    */
  var pixelsPerUnit: Double = js.native
  
  /**
    * Index of the last character to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var rangeEnd: Double = js.native
  
  /**
    * Index of the first character to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var rangeStart: Double = js.native
  
  /**
    * Specifies which region of the texture to use in order to render an image. Values range from 0 to 1 and indicate u, v, width, height. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
    */
  var rect: Vec4 = js.native
  
  /**
    * The distance from the right edge of the anchor. Can be used in combination with a split anchor to make the component's right edge always be 'right' units away from the right.
    */
  var right: Double = js.native
  
  /**
    * Reorder the text for RTL languages using a function registered by `app.systems.element.registerUnicodeConverter`.
    */
  var rtlReorder: Boolean = js.native
  
  /**
    * The Entity with a {@link pc.ScreenComponent} that this component belongs to. This is automatically set when the component is a child of a ScreenComponent.
    */
  var screen: Entity = js.native
  
  /**
    * An array of 4 {@link pc.Vec3}s that represent the bottom left, bottom right, top right and top left corners of the component relative to its parent {@link pc.ScreenComponent}.
    */
  var screenCorners: js.Array[Vec3] = js.native
  
  /**
    * The text shadow effect color and opacity. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var shadowColor: Color = js.native
  
  /**
    * The text shadow effect shift amount from original text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var shadowOffset: Vec2 = js.native
  
  /**
    * The spacing between the letters of the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var spacing: Double = js.native
  
  /**
    * The sprite to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
    */
  var sprite: Sprite = js.native
  
  /**
    * The id of the sprite asset to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
    */
  var spriteAsset: Double = js.native
  
  /**
    * The frame of the sprite to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types who have a sprite assigned.
    */
  var spriteFrame: Double = js.native
  
  /**
    * The text to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var text: String = js.native
  
  /**
    * The height of the text rendered by the component. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var textHeight: Double = js.native
  
  /**
    * The width of the text rendered by the component. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
    */
  var textWidth: Double = js.native
  
  /**
    * The texture to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
    */
  var texture: Texture = js.native
  
  /**
    * The id of the texture asset to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
    */
  var textureAsset: Double = js.native
  
  /**
    * The distance from the top edge of the anchor. Can be used in combination with a split anchor to make the component's bottom edge always be 'bottom' units away from the bottom.
    */
  var top: Double = js.native
  
  /**
    * The type of the ElementComponent. Can be:
    
    * {@link pc.ELEMENTTYPE_GROUP}: The component can be used as a layout mechanism to create groups of ElementComponents e.g. panels.
    * {@link pc.ELEMENTTYPE_IMAGE}: The component will render an image
    * {@link pc.ELEMENTTYPE_TEXT}: The component will render text
    */
  var `type`: String = js.native
  
  /**
    * Convert unicode characters using a function registered by `app.systems.element.registerUnicodeConverter`.
    */
  var unicodeConverter: Boolean = js.native
  
  /**
    * If true then the component will receive Mouse or Touch input events.
    */
  var useInput: Boolean = js.native
  
  /**
    * The width of the element as set in the editor. Note that in some cases this may not reflect the true width at which the element is rendered, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. See `calculatedWidth` in order to ensure you are reading the true width at which the element will be rendered.
    */
  var width: Double = js.native
  
  /**
    * An array of 4 {@link pc.Vec3}s that represent the bottom left, bottom right, top right and top left corners of the component in world space. Only works for 3D ElementComponents.
    */
  var worldCorners: js.Array[Vec3] = js.native
  
  /**
    * Whether to automatically wrap lines based on the element width. Only works for {@link pc.ELEMENTTYPE_TEXT} types, and when autoWidth is set to false.
    */
  var wrapLines: Boolean = js.native
}
