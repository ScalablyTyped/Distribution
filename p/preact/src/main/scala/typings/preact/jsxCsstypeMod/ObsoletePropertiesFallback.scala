package typings.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObsoletePropertiesFallback[TLength] extends js.Object {
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var KhtmlBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var KhtmlBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var KhtmlBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var KhtmlBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var KhtmlBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var KhtmlBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlLineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var KhtmlOpacity: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlUserSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var MozBackgroundClip: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var MozBackgroundOrigin: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var MozBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Syntax**: `<url> | none`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBinding: js.UndefOr[MozBindingProperty | js.Array[MozBindingProperty]] = js.native
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    *
    * @deprecated
    */
  var MozBorderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.native
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomleft: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomright: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopleft: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopright: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var MozBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var MozBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var MozBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var MozBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var MozBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBoxShadow: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var MozOpacity: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.native
  
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * @deprecated
    */
  var MozOutline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.native
  
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Syntax**: `<color> | invert`
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var MozOutlineColor: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * **Syntax**: `<outline-radius>{1,4} [ / <outline-radius>{1,4} ]?`
    *
    * @deprecated
    */
  var MozOutlineRadius: js.UndefOr[MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]] = js.native
  
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `auto | <'border-style'>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozOutlineStyle: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.native
  
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var MozOutlineWidth: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.native
  
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Syntax**: `auto | start | end | left | right | center | justify`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozTextAlignLast: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.native
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var MozTextDecorationColor: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextDecorationLine: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var MozTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
  
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Syntax**: `auto | none | enabled | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozUserInput: js.UndefOr[MozUserInputProperty | js.Array[MozUserInputProperty]] = js.native
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    *
    * @deprecated
    */
  var OAnimation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.native
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var OAnimationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var OAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var OAnimationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var OBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    *
    * @deprecated
    */
  var OBorderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.native
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OTransform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    *
    * @deprecated
    */
  var OTransition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var OTransitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var WebkitBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var WebkitBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var WebkitBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var WebkitBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var WebkitBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var WebkitBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
  
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var boxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var boxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var boxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var boxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var boxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var boxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  
  /**
    * The **`clip`** CSS property defines what portion of an element is visible. The `clip` property applies only to absolutely positioned elements, that is elements with `position:absolute` or `position:fixed`.
    *
    * **Syntax**: `<shape> | auto`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var clip: js.UndefOr[ClipProperty | js.Array[ClipProperty]] = js.native
  
  /**
    * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
    *
    * **Syntax**: `normal | [ stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) ]`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var fontVariantAlternates: js.UndefOr[FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]] = js.native
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridColumnGap: js.UndefOr[GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]] = js.native
  
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'grid-row-gap'> <'grid-column-gap'>?`
    *
    * @deprecated
    */
  var gridGap: js.UndefOr[GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]] = js.native
  
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridRowGap: js.UndefOr[GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]] = js.native
  
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var imeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
  
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var msImeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
  
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var msScrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]] = js.native
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlock: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInline: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.native
  
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Syntax**: `none | <position>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapCoordinate: js.UndefOr[
    ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]
  ] = js.native
  
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var scrollSnapDestination: js.UndefOr[
    ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]
  ] = js.native
  
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
  
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
  
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]] = js.native
  
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]] = js.native
  
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var scrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]] = js.native
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var textCombineHorizontal: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
}
object ObsoletePropertiesFallback {
  
  @scala.inline
  def apply[TLength](): ObsoletePropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObsoletePropertiesFallback[TLength]]
  }
  
  @scala.inline
  implicit class ObsoletePropertiesFallbackOps[Self <: ObsoletePropertiesFallback[_], TLength] (val x: Self with ObsoletePropertiesFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKhtmlBoxAlignVarargs(value: BoxAlignProperty*): Self = this.set("KhtmlBoxAlign", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = this.set("KhtmlBoxAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlBoxAlign: Self = this.set("KhtmlBoxAlign", js.undefined)
    
    @scala.inline
    def setKhtmlBoxDirectionVarargs(value: BoxDirectionProperty*): Self = this.set("KhtmlBoxDirection", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = this.set("KhtmlBoxDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlBoxDirection: Self = this.set("KhtmlBoxDirection", js.undefined)
    
    @scala.inline
    def setKhtmlBoxFlexVarargs(value: GlobalsNumber*): Self = this.set("KhtmlBoxFlex", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("KhtmlBoxFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlBoxFlex: Self = this.set("KhtmlBoxFlex", js.undefined)
    
    @scala.inline
    def setKhtmlBoxFlexGroupVarargs(value: GlobalsNumber*): Self = this.set("KhtmlBoxFlexGroup", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlBoxFlexGroup: Self = this.set("KhtmlBoxFlexGroup", js.undefined)
    
    @scala.inline
    def setKhtmlBoxLinesVarargs(value: BoxLinesProperty*): Self = this.set("KhtmlBoxLines", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = this.set("KhtmlBoxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlBoxLines: Self = this.set("KhtmlBoxLines", js.undefined)
    
    @scala.inline
    def setKhtmlBoxOrdinalGroupVarargs(value: GlobalsNumber*): Self = this.set("KhtmlBoxOrdinalGroup", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlBoxOrdinalGroup: Self = this.set("KhtmlBoxOrdinalGroup", js.undefined)
    
    @scala.inline
    def setKhtmlBoxOrientVarargs(value: BoxOrientProperty*): Self = this.set("KhtmlBoxOrient", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = this.set("KhtmlBoxOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlBoxOrient: Self = this.set("KhtmlBoxOrient", js.undefined)
    
    @scala.inline
    def setKhtmlBoxPackVarargs(value: BoxPackProperty*): Self = this.set("KhtmlBoxPack", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = this.set("KhtmlBoxPack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlBoxPack: Self = this.set("KhtmlBoxPack", js.undefined)
    
    @scala.inline
    def setKhtmlLineBreakVarargs(value: LineBreakProperty*): Self = this.set("KhtmlLineBreak", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlLineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = this.set("KhtmlLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlLineBreak: Self = this.set("KhtmlLineBreak", js.undefined)
    
    @scala.inline
    def setKhtmlOpacityVarargs(value: OpacityProperty*): Self = this.set("KhtmlOpacity", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlOpacity(value: OpacityProperty | js.Array[OpacityProperty]): Self = this.set("KhtmlOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlOpacity: Self = this.set("KhtmlOpacity", js.undefined)
    
    @scala.inline
    def setKhtmlUserSelectVarargs(value: UserSelectProperty*): Self = this.set("KhtmlUserSelect", js.Array(value :_*))
    
    @scala.inline
    def setKhtmlUserSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = this.set("KhtmlUserSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKhtmlUserSelect: Self = this.set("KhtmlUserSelect", js.undefined)
    
    @scala.inline
    def setMozBackgroundClipVarargs(value: BackgroundClipProperty*): Self = this.set("MozBackgroundClip", js.Array(value :_*))
    
    @scala.inline
    def setMozBackgroundClip(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self = this.set("MozBackgroundClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBackgroundClip: Self = this.set("MozBackgroundClip", js.undefined)
    
    @scala.inline
    def setMozBackgroundInlinePolicyVarargs(value: BoxDecorationBreakProperty*): Self = this.set("MozBackgroundInlinePolicy", js.Array(value :_*))
    
    @scala.inline
    def setMozBackgroundInlinePolicy(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self = this.set("MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBackgroundInlinePolicy: Self = this.set("MozBackgroundInlinePolicy", js.undefined)
    
    @scala.inline
    def setMozBackgroundOriginVarargs(value: BackgroundOriginProperty*): Self = this.set("MozBackgroundOrigin", js.Array(value :_*))
    
    @scala.inline
    def setMozBackgroundOrigin(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self = this.set("MozBackgroundOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBackgroundOrigin: Self = this.set("MozBackgroundOrigin", js.undefined)
    
    @scala.inline
    def setMozBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): Self = this.set("MozBackgroundSize", js.Array(value :_*))
    
    @scala.inline
    def setMozBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = this.set("MozBackgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBackgroundSize: Self = this.set("MozBackgroundSize", js.undefined)
    
    @scala.inline
    def setMozBindingVarargs(value: MozBindingProperty*): Self = this.set("MozBinding", js.Array(value :_*))
    
    @scala.inline
    def setMozBinding(value: MozBindingProperty | js.Array[MozBindingProperty]): Self = this.set("MozBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBinding: Self = this.set("MozBinding", js.undefined)
    
    @scala.inline
    def setMozBorderRadiusVarargs(value: BorderRadiusProperty[TLength]*): Self = this.set("MozBorderRadius", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderRadius(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): Self = this.set("MozBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderRadius: Self = this.set("MozBorderRadius", js.undefined)
    
    @scala.inline
    def setMozBorderRadiusBottomleftVarargs(value: BorderBottomLeftRadiusProperty[TLength]*): Self = this.set("MozBorderRadiusBottomleft", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderRadiusBottomleft(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self = this.set("MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderRadiusBottomleft: Self = this.set("MozBorderRadiusBottomleft", js.undefined)
    
    @scala.inline
    def setMozBorderRadiusBottomrightVarargs(value: BorderBottomRightRadiusProperty[TLength]*): Self = this.set("MozBorderRadiusBottomright", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderRadiusBottomright(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): Self = this.set("MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderRadiusBottomright: Self = this.set("MozBorderRadiusBottomright", js.undefined)
    
    @scala.inline
    def setMozBorderRadiusTopleftVarargs(value: BorderTopLeftRadiusProperty[TLength]*): Self = this.set("MozBorderRadiusTopleft", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderRadiusTopleft(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self = this.set("MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderRadiusTopleft: Self = this.set("MozBorderRadiusTopleft", js.undefined)
    
    @scala.inline
    def setMozBorderRadiusToprightVarargs(value: BorderTopRightRadiusProperty[TLength]*): Self = this.set("MozBorderRadiusTopright", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderRadiusTopright(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self = this.set("MozBorderRadiusTopright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderRadiusTopright: Self = this.set("MozBorderRadiusTopright", js.undefined)
    
    @scala.inline
    def setMozBoxAlignVarargs(value: BoxAlignProperty*): Self = this.set("MozBoxAlign", js.Array(value :_*))
    
    @scala.inline
    def setMozBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = this.set("MozBoxAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBoxAlign: Self = this.set("MozBoxAlign", js.undefined)
    
    @scala.inline
    def setMozBoxDirectionVarargs(value: BoxDirectionProperty*): Self = this.set("MozBoxDirection", js.Array(value :_*))
    
    @scala.inline
    def setMozBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = this.set("MozBoxDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBoxDirection: Self = this.set("MozBoxDirection", js.undefined)
    
    @scala.inline
    def setMozBoxFlexVarargs(value: GlobalsNumber*): Self = this.set("MozBoxFlex", js.Array(value :_*))
    
    @scala.inline
    def setMozBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("MozBoxFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBoxFlex: Self = this.set("MozBoxFlex", js.undefined)
    
    @scala.inline
    def setMozBoxOrdinalGroupVarargs(value: GlobalsNumber*): Self = this.set("MozBoxOrdinalGroup", js.Array(value :_*))
    
    @scala.inline
    def setMozBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBoxOrdinalGroup: Self = this.set("MozBoxOrdinalGroup", js.undefined)
    
    @scala.inline
    def setMozBoxOrientVarargs(value: BoxOrientProperty*): Self = this.set("MozBoxOrient", js.Array(value :_*))
    
    @scala.inline
    def setMozBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = this.set("MozBoxOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBoxOrient: Self = this.set("MozBoxOrient", js.undefined)
    
    @scala.inline
    def setMozBoxPackVarargs(value: BoxPackProperty*): Self = this.set("MozBoxPack", js.Array(value :_*))
    
    @scala.inline
    def setMozBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = this.set("MozBoxPack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBoxPack: Self = this.set("MozBoxPack", js.undefined)
    
    @scala.inline
    def setMozBoxShadowVarargs(value: BoxShadowProperty*): Self = this.set("MozBoxShadow", js.Array(value :_*))
    
    @scala.inline
    def setMozBoxShadow(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self = this.set("MozBoxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBoxShadow: Self = this.set("MozBoxShadow", js.undefined)
    
    @scala.inline
    def setMozOpacityVarargs(value: OpacityProperty*): Self = this.set("MozOpacity", js.Array(value :_*))
    
    @scala.inline
    def setMozOpacity(value: OpacityProperty | js.Array[OpacityProperty]): Self = this.set("MozOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozOpacity: Self = this.set("MozOpacity", js.undefined)
    
    @scala.inline
    def setMozOutlineVarargs(value: OutlineProperty[TLength]*): Self = this.set("MozOutline", js.Array(value :_*))
    
    @scala.inline
    def setMozOutline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): Self = this.set("MozOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozOutline: Self = this.set("MozOutline", js.undefined)
    
    @scala.inline
    def setMozOutlineColorVarargs(value: OutlineColorProperty*): Self = this.set("MozOutlineColor", js.Array(value :_*))
    
    @scala.inline
    def setMozOutlineColor(value: OutlineColorProperty | js.Array[OutlineColorProperty]): Self = this.set("MozOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozOutlineColor: Self = this.set("MozOutlineColor", js.undefined)
    
    @scala.inline
    def setMozOutlineRadiusVarargs(value: MozOutlineRadiusProperty[TLength]*): Self = this.set("MozOutlineRadius", js.Array(value :_*))
    
    @scala.inline
    def setMozOutlineRadius(value: MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]): Self = this.set("MozOutlineRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozOutlineRadius: Self = this.set("MozOutlineRadius", js.undefined)
    
    @scala.inline
    def setMozOutlineStyleVarargs(value: OutlineStyleProperty*): Self = this.set("MozOutlineStyle", js.Array(value :_*))
    
    @scala.inline
    def setMozOutlineStyle(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): Self = this.set("MozOutlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozOutlineStyle: Self = this.set("MozOutlineStyle", js.undefined)
    
    @scala.inline
    def setMozOutlineWidthVarargs(value: OutlineWidthProperty[TLength]*): Self = this.set("MozOutlineWidth", js.Array(value :_*))
    
    @scala.inline
    def setMozOutlineWidth(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): Self = this.set("MozOutlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozOutlineWidth: Self = this.set("MozOutlineWidth", js.undefined)
    
    @scala.inline
    def setMozTextAlignLastVarargs(value: TextAlignLastProperty*): Self = this.set("MozTextAlignLast", js.Array(value :_*))
    
    @scala.inline
    def setMozTextAlignLast(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): Self = this.set("MozTextAlignLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTextAlignLast: Self = this.set("MozTextAlignLast", js.undefined)
    
    @scala.inline
    def setMozTextDecorationColorVarargs(value: TextDecorationColorProperty*): Self = this.set("MozTextDecorationColor", js.Array(value :_*))
    
    @scala.inline
    def setMozTextDecorationColor(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): Self = this.set("MozTextDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTextDecorationColor: Self = this.set("MozTextDecorationColor", js.undefined)
    
    @scala.inline
    def setMozTextDecorationLineVarargs(value: TextDecorationLineProperty*): Self = this.set("MozTextDecorationLine", js.Array(value :_*))
    
    @scala.inline
    def setMozTextDecorationLine(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): Self = this.set("MozTextDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTextDecorationLine: Self = this.set("MozTextDecorationLine", js.undefined)
    
    @scala.inline
    def setMozTextDecorationStyleVarargs(value: TextDecorationStyleProperty*): Self = this.set("MozTextDecorationStyle", js.Array(value :_*))
    
    @scala.inline
    def setMozTextDecorationStyle(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): Self = this.set("MozTextDecorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTextDecorationStyle: Self = this.set("MozTextDecorationStyle", js.undefined)
    
    @scala.inline
    def setMozUserInputVarargs(value: MozUserInputProperty*): Self = this.set("MozUserInput", js.Array(value :_*))
    
    @scala.inline
    def setMozUserInput(value: MozUserInputProperty | js.Array[MozUserInputProperty]): Self = this.set("MozUserInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozUserInput: Self = this.set("MozUserInput", js.undefined)
    
    @scala.inline
    def setOAnimationVarargs(value: AnimationProperty*): Self = this.set("OAnimation", js.Array(value :_*))
    
    @scala.inline
    def setOAnimation(value: AnimationProperty | js.Array[AnimationProperty]): Self = this.set("OAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimation: Self = this.set("OAnimation", js.undefined)
    
    @scala.inline
    def setOAnimationDelayVarargs(value: GlobalsString*): Self = this.set("OAnimationDelay", js.Array(value :_*))
    
    @scala.inline
    def setOAnimationDelay(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("OAnimationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimationDelay: Self = this.set("OAnimationDelay", js.undefined)
    
    @scala.inline
    def setOAnimationDirectionVarargs(value: AnimationDirectionProperty*): Self = this.set("OAnimationDirection", js.Array(value :_*))
    
    @scala.inline
    def setOAnimationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = this.set("OAnimationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimationDirection: Self = this.set("OAnimationDirection", js.undefined)
    
    @scala.inline
    def setOAnimationDurationVarargs(value: GlobalsString*): Self = this.set("OAnimationDuration", js.Array(value :_*))
    
    @scala.inline
    def setOAnimationDuration(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("OAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimationDuration: Self = this.set("OAnimationDuration", js.undefined)
    
    @scala.inline
    def setOAnimationFillModeVarargs(value: AnimationFillModeProperty*): Self = this.set("OAnimationFillMode", js.Array(value :_*))
    
    @scala.inline
    def setOAnimationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = this.set("OAnimationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimationFillMode: Self = this.set("OAnimationFillMode", js.undefined)
    
    @scala.inline
    def setOAnimationIterationCountVarargs(value: AnimationIterationCountProperty*): Self = this.set("OAnimationIterationCount", js.Array(value :_*))
    
    @scala.inline
    def setOAnimationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = this.set("OAnimationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimationIterationCount: Self = this.set("OAnimationIterationCount", js.undefined)
    
    @scala.inline
    def setOAnimationNameVarargs(value: AnimationNameProperty*): Self = this.set("OAnimationName", js.Array(value :_*))
    
    @scala.inline
    def setOAnimationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = this.set("OAnimationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimationName: Self = this.set("OAnimationName", js.undefined)
    
    @scala.inline
    def setOAnimationPlayStateVarargs(value: AnimationPlayStateProperty*): Self = this.set("OAnimationPlayState", js.Array(value :_*))
    
    @scala.inline
    def setOAnimationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = this.set("OAnimationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimationPlayState: Self = this.set("OAnimationPlayState", js.undefined)
    
    @scala.inline
    def setOAnimationTimingFunctionVarargs(value: AnimationTimingFunctionProperty*): Self = this.set("OAnimationTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setOAnimationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = this.set("OAnimationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAnimationTimingFunction: Self = this.set("OAnimationTimingFunction", js.undefined)
    
    @scala.inline
    def setOBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): Self = this.set("OBackgroundSize", js.Array(value :_*))
    
    @scala.inline
    def setOBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = this.set("OBackgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBackgroundSize: Self = this.set("OBackgroundSize", js.undefined)
    
    @scala.inline
    def setOBorderImageVarargs(value: BorderImageProperty*): Self = this.set("OBorderImage", js.Array(value :_*))
    
    @scala.inline
    def setOBorderImage(value: BorderImageProperty | js.Array[BorderImageProperty]): Self = this.set("OBorderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOBorderImage: Self = this.set("OBorderImage", js.undefined)
    
    @scala.inline
    def setOTransformVarargs(value: TransformProperty*): Self = this.set("OTransform", js.Array(value :_*))
    
    @scala.inline
    def setOTransform(value: TransformProperty | js.Array[TransformProperty]): Self = this.set("OTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTransform: Self = this.set("OTransform", js.undefined)
    
    @scala.inline
    def setOTransitionVarargs(value: TransitionProperty*): Self = this.set("OTransition", js.Array(value :_*))
    
    @scala.inline
    def setOTransition(value: TransitionProperty | js.Array[TransitionProperty]): Self = this.set("OTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTransition: Self = this.set("OTransition", js.undefined)
    
    @scala.inline
    def setOTransitionDelayVarargs(value: GlobalsString*): Self = this.set("OTransitionDelay", js.Array(value :_*))
    
    @scala.inline
    def setOTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("OTransitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTransitionDelay: Self = this.set("OTransitionDelay", js.undefined)
    
    @scala.inline
    def setOTransitionDurationVarargs(value: GlobalsString*): Self = this.set("OTransitionDuration", js.Array(value :_*))
    
    @scala.inline
    def setOTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("OTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTransitionDuration: Self = this.set("OTransitionDuration", js.undefined)
    
    @scala.inline
    def setOTransitionPropertyVarargs(value: TransitionPropertyProperty*): Self = this.set("OTransitionProperty", js.Array(value :_*))
    
    @scala.inline
    def setOTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = this.set("OTransitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTransitionProperty: Self = this.set("OTransitionProperty", js.undefined)
    
    @scala.inline
    def setOTransitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): Self = this.set("OTransitionTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setOTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = this.set("OTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTransitionTimingFunction: Self = this.set("OTransitionTimingFunction", js.undefined)
    
    @scala.inline
    def setWebkitBoxAlignVarargs(value: BoxAlignProperty*): Self = this.set("WebkitBoxAlign", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = this.set("WebkitBoxAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxAlign: Self = this.set("WebkitBoxAlign", js.undefined)
    
    @scala.inline
    def setWebkitBoxDirectionVarargs(value: BoxDirectionProperty*): Self = this.set("WebkitBoxDirection", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = this.set("WebkitBoxDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxDirection: Self = this.set("WebkitBoxDirection", js.undefined)
    
    @scala.inline
    def setWebkitBoxFlexVarargs(value: GlobalsNumber*): Self = this.set("WebkitBoxFlex", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("WebkitBoxFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxFlex: Self = this.set("WebkitBoxFlex", js.undefined)
    
    @scala.inline
    def setWebkitBoxFlexGroupVarargs(value: GlobalsNumber*): Self = this.set("WebkitBoxFlexGroup", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxFlexGroup: Self = this.set("WebkitBoxFlexGroup", js.undefined)
    
    @scala.inline
    def setWebkitBoxLinesVarargs(value: BoxLinesProperty*): Self = this.set("WebkitBoxLines", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = this.set("WebkitBoxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxLines: Self = this.set("WebkitBoxLines", js.undefined)
    
    @scala.inline
    def setWebkitBoxOrdinalGroupVarargs(value: GlobalsNumber*): Self = this.set("WebkitBoxOrdinalGroup", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxOrdinalGroup: Self = this.set("WebkitBoxOrdinalGroup", js.undefined)
    
    @scala.inline
    def setWebkitBoxOrientVarargs(value: BoxOrientProperty*): Self = this.set("WebkitBoxOrient", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = this.set("WebkitBoxOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxOrient: Self = this.set("WebkitBoxOrient", js.undefined)
    
    @scala.inline
    def setWebkitBoxPackVarargs(value: BoxPackProperty*): Self = this.set("WebkitBoxPack", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = this.set("WebkitBoxPack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxPack: Self = this.set("WebkitBoxPack", js.undefined)
    
    @scala.inline
    def setWebkitScrollSnapPointsXVarargs(value: ScrollSnapPointsXProperty*): Self = this.set("WebkitScrollSnapPointsX", js.Array(value :_*))
    
    @scala.inline
    def setWebkitScrollSnapPointsX(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): Self = this.set("WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitScrollSnapPointsX: Self = this.set("WebkitScrollSnapPointsX", js.undefined)
    
    @scala.inline
    def setWebkitScrollSnapPointsYVarargs(value: ScrollSnapPointsYProperty*): Self = this.set("WebkitScrollSnapPointsY", js.Array(value :_*))
    
    @scala.inline
    def setWebkitScrollSnapPointsY(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): Self = this.set("WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitScrollSnapPointsY: Self = this.set("WebkitScrollSnapPointsY", js.undefined)
    
    @scala.inline
    def setBoxAlignVarargs(value: BoxAlignProperty*): Self = this.set("boxAlign", js.Array(value :_*))
    
    @scala.inline
    def setBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = this.set("boxAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxAlign: Self = this.set("boxAlign", js.undefined)
    
    @scala.inline
    def setBoxDirectionVarargs(value: BoxDirectionProperty*): Self = this.set("boxDirection", js.Array(value :_*))
    
    @scala.inline
    def setBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = this.set("boxDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxDirection: Self = this.set("boxDirection", js.undefined)
    
    @scala.inline
    def setBoxFlexVarargs(value: GlobalsNumber*): Self = this.set("boxFlex", js.Array(value :_*))
    
    @scala.inline
    def setBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("boxFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxFlex: Self = this.set("boxFlex", js.undefined)
    
    @scala.inline
    def setBoxFlexGroupVarargs(value: GlobalsNumber*): Self = this.set("boxFlexGroup", js.Array(value :_*))
    
    @scala.inline
    def setBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("boxFlexGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxFlexGroup: Self = this.set("boxFlexGroup", js.undefined)
    
    @scala.inline
    def setBoxLinesVarargs(value: BoxLinesProperty*): Self = this.set("boxLines", js.Array(value :_*))
    
    @scala.inline
    def setBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = this.set("boxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxLines: Self = this.set("boxLines", js.undefined)
    
    @scala.inline
    def setBoxOrdinalGroupVarargs(value: GlobalsNumber*): Self = this.set("boxOrdinalGroup", js.Array(value :_*))
    
    @scala.inline
    def setBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("boxOrdinalGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxOrdinalGroup: Self = this.set("boxOrdinalGroup", js.undefined)
    
    @scala.inline
    def setBoxOrientVarargs(value: BoxOrientProperty*): Self = this.set("boxOrient", js.Array(value :_*))
    
    @scala.inline
    def setBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = this.set("boxOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxOrient: Self = this.set("boxOrient", js.undefined)
    
    @scala.inline
    def setBoxPackVarargs(value: BoxPackProperty*): Self = this.set("boxPack", js.Array(value :_*))
    
    @scala.inline
    def setBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = this.set("boxPack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxPack: Self = this.set("boxPack", js.undefined)
    
    @scala.inline
    def setClipVarargs(value: ClipProperty*): Self = this.set("clip", js.Array(value :_*))
    
    @scala.inline
    def setClip(value: ClipProperty | js.Array[ClipProperty]): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setFontVariantAlternatesVarargs(value: FontVariantAlternatesProperty*): Self = this.set("fontVariantAlternates", js.Array(value :_*))
    
    @scala.inline
    def setFontVariantAlternates(value: FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]): Self = this.set("fontVariantAlternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariantAlternates: Self = this.set("fontVariantAlternates", js.undefined)
    
    @scala.inline
    def setGridColumnGapVarargs(value: GridColumnGapProperty[TLength]*): Self = this.set("gridColumnGap", js.Array(value :_*))
    
    @scala.inline
    def setGridColumnGap(value: GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]): Self = this.set("gridColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridColumnGap: Self = this.set("gridColumnGap", js.undefined)
    
    @scala.inline
    def setGridGapVarargs(value: GridGapProperty[TLength]*): Self = this.set("gridGap", js.Array(value :_*))
    
    @scala.inline
    def setGridGap(value: GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]): Self = this.set("gridGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridGap: Self = this.set("gridGap", js.undefined)
    
    @scala.inline
    def setGridRowGapVarargs(value: GridRowGapProperty[TLength]*): Self = this.set("gridRowGap", js.Array(value :_*))
    
    @scala.inline
    def setGridRowGap(value: GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]): Self = this.set("gridRowGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridRowGap: Self = this.set("gridRowGap", js.undefined)
    
    @scala.inline
    def setImeModeVarargs(value: ImeModeProperty*): Self = this.set("imeMode", js.Array(value :_*))
    
    @scala.inline
    def setImeMode(value: ImeModeProperty | js.Array[ImeModeProperty]): Self = this.set("imeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImeMode: Self = this.set("imeMode", js.undefined)
    
    @scala.inline
    def setMsImeModeVarargs(value: ImeModeProperty*): Self = this.set("msImeMode", js.Array(value :_*))
    
    @scala.inline
    def setMsImeMode(value: ImeModeProperty | js.Array[ImeModeProperty]): Self = this.set("msImeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsImeMode: Self = this.set("msImeMode", js.undefined)
    
    @scala.inline
    def setMsScrollbarTrackColorVarargs(value: MsScrollbarTrackColorProperty*): Self = this.set("msScrollbarTrackColor", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollbarTrackColor(value: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]): Self = this.set("msScrollbarTrackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollbarTrackColor: Self = this.set("msScrollbarTrackColor", js.undefined)
    
    @scala.inline
    def setOffsetBlockVarargs(value: InsetBlockProperty[TLength]*): Self = this.set("offsetBlock", js.Array(value :_*))
    
    @scala.inline
    def setOffsetBlock(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): Self = this.set("offsetBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetBlock: Self = this.set("offsetBlock", js.undefined)
    
    @scala.inline
    def setOffsetBlockEndVarargs(value: InsetBlockEndProperty[TLength]*): Self = this.set("offsetBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def setOffsetBlockEnd(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): Self = this.set("offsetBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetBlockEnd: Self = this.set("offsetBlockEnd", js.undefined)
    
    @scala.inline
    def setOffsetBlockStartVarargs(value: InsetBlockStartProperty[TLength]*): Self = this.set("offsetBlockStart", js.Array(value :_*))
    
    @scala.inline
    def setOffsetBlockStart(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): Self = this.set("offsetBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetBlockStart: Self = this.set("offsetBlockStart", js.undefined)
    
    @scala.inline
    def setOffsetInlineVarargs(value: InsetInlineProperty[TLength]*): Self = this.set("offsetInline", js.Array(value :_*))
    
    @scala.inline
    def setOffsetInline(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): Self = this.set("offsetInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetInline: Self = this.set("offsetInline", js.undefined)
    
    @scala.inline
    def setOffsetInlineEndVarargs(value: InsetInlineEndProperty[TLength]*): Self = this.set("offsetInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def setOffsetInlineEnd(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): Self = this.set("offsetInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetInlineEnd: Self = this.set("offsetInlineEnd", js.undefined)
    
    @scala.inline
    def setOffsetInlineStartVarargs(value: InsetInlineStartProperty[TLength]*): Self = this.set("offsetInlineStart", js.Array(value :_*))
    
    @scala.inline
    def setOffsetInlineStart(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): Self = this.set("offsetInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetInlineStart: Self = this.set("offsetInlineStart", js.undefined)
    
    @scala.inline
    def setScrollSnapCoordinateVarargs(value: ScrollSnapCoordinateProperty[TLength]*): Self = this.set("scrollSnapCoordinate", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapCoordinate(value: ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]): Self = this.set("scrollSnapCoordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapCoordinate: Self = this.set("scrollSnapCoordinate", js.undefined)
    
    @scala.inline
    def setScrollSnapDestinationVarargs(value: ScrollSnapDestinationProperty[TLength]*): Self = this.set("scrollSnapDestination", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapDestination(value: ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]): Self = this.set("scrollSnapDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapDestination: Self = this.set("scrollSnapDestination", js.undefined)
    
    @scala.inline
    def setScrollSnapPointsXVarargs(value: ScrollSnapPointsXProperty*): Self = this.set("scrollSnapPointsX", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapPointsX(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): Self = this.set("scrollSnapPointsX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapPointsX: Self = this.set("scrollSnapPointsX", js.undefined)
    
    @scala.inline
    def setScrollSnapPointsYVarargs(value: ScrollSnapPointsYProperty*): Self = this.set("scrollSnapPointsY", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapPointsY(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): Self = this.set("scrollSnapPointsY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapPointsY: Self = this.set("scrollSnapPointsY", js.undefined)
    
    @scala.inline
    def setScrollSnapTypeXVarargs(value: ScrollSnapTypeXProperty*): Self = this.set("scrollSnapTypeX", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapTypeX(value: ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]): Self = this.set("scrollSnapTypeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapTypeX: Self = this.set("scrollSnapTypeX", js.undefined)
    
    @scala.inline
    def setScrollSnapTypeYVarargs(value: ScrollSnapTypeYProperty*): Self = this.set("scrollSnapTypeY", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapTypeY(value: ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]): Self = this.set("scrollSnapTypeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapTypeY: Self = this.set("scrollSnapTypeY", js.undefined)
    
    @scala.inline
    def setScrollbarTrackColorVarargs(value: MsScrollbarTrackColorProperty*): Self = this.set("scrollbarTrackColor", js.Array(value :_*))
    
    @scala.inline
    def setScrollbarTrackColor(value: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]): Self = this.set("scrollbarTrackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarTrackColor: Self = this.set("scrollbarTrackColor", js.undefined)
    
    @scala.inline
    def setTextCombineHorizontalVarargs(value: TextCombineUprightProperty*): Self = this.set("textCombineHorizontal", js.Array(value :_*))
    
    @scala.inline
    def setTextCombineHorizontal(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = this.set("textCombineHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextCombineHorizontal: Self = this.set("textCombineHorizontal", js.undefined)
  }
}
