package typings.playcanvas.global.pc

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
@JSGlobal("pc.ElementComponent")
@js.native
open class ElementComponent protected ()
  extends typings.playcanvas.mod.ElementComponent {
  /**
    * Create a new ElementComponent instance.
    *
    * @param {import('./system.js').ElementComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.ElementComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
