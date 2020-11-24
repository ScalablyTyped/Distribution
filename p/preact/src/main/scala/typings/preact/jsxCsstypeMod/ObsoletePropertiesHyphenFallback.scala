package typings.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObsoletePropertiesHyphenFallback[TLength] extends js.Object {
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `-khtml-box-align`: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-khtml-box-direction`: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-khtml-box-flex`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-khtml-box-flex-group`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `-khtml-box-lines`: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-khtml-box-ordinal-group`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-khtml-box-orient`: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-khtml-box-pack`: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-khtml-line-break`: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var `-khtml-opacity`: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-khtml-user-select`: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var `-moz-background-clip`: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var `-moz-background-inline-policy`: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var `-moz-background-origin`: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var `-moz-background-size`: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Syntax**: `<url> | none`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-binding`: js.UndefOr[MozBindingProperty | js.Array[MozBindingProperty]] = js.native
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    *
    * @deprecated
    */
  var `-moz-border-radius`: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.native
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-bottomleft`: js.UndefOr[
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
  var `-moz-border-radius-bottomright`: js.UndefOr[
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
  var `-moz-border-radius-topleft`: js.UndefOr[
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
  var `-moz-border-radius-topright`: js.UndefOr[
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
  var `-moz-box-align`: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-moz-box-direction`: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-box-flex`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-moz-box-ordinal-group`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-moz-box-orient`: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-moz-box-pack`: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-box-shadow`: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var `-moz-opacity`: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.native
  
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * @deprecated
    */
  var `-moz-outline`: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.native
  
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Syntax**: `<color> | invert`
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var `-moz-outline-color`: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * **Syntax**: `<outline-radius>{1,4} [ / <outline-radius>{1,4} ]?`
    *
    * @deprecated
    */
  var `-moz-outline-radius`: js.UndefOr[MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]] = js.native
  
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `auto | <'border-style'>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-outline-style`: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.native
  
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var `-moz-outline-width`: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.native
  
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Syntax**: `auto | start | end | left | right | center | justify`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-moz-text-align-last`: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.native
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var `-moz-text-decoration-color`: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-text-decoration-line`: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var `-moz-text-decoration-style`: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
  
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Syntax**: `auto | none | enabled | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-moz-user-input`: js.UndefOr[MozUserInputProperty | js.Array[MozUserInputProperty]] = js.native
  
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-ms-ime-mode`: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
  
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var `-ms-scrollbar-track-color`: js.UndefOr[MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]] = js.native
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    *
    * @deprecated
    */
  var `-o-animation`: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.native
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-animation-delay`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-o-animation-direction`: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-animation-duration`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-animation-fill-mode`: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-o-animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-animation-name`: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var `-o-animation-play-state`: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var `-o-animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var `-o-background-size`: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    *
    * @deprecated
    */
  var `-o-border-image`: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.native
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-transform`: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    *
    * @deprecated
    */
  var `-o-transition`: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-transition-delay`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-transition-duration`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var `-o-transition-property`: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var `-o-transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `-webkit-box-align`: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-webkit-box-direction`: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-webkit-box-flex`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-webkit-box-flex-group`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `-webkit-box-lines`: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-webkit-box-ordinal-group`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-webkit-box-orient`: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-webkit-box-pack`: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-webkit-scroll-snap-points-x`: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
  
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-webkit-scroll-snap-points-y`: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `box-align`: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `box-direction`: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `box-flex`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `box-flex-group`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `box-lines`: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `box-ordinal-group`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `box-orient`: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `box-pack`: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  
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
  var `font-variant-alternates`: js.UndefOr[FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]] = js.native
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `grid-column-gap`: js.UndefOr[GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]] = js.native
  
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'grid-row-gap'> <'grid-column-gap'>?`
    *
    * @deprecated
    */
  var `grid-gap`: js.UndefOr[GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]] = js.native
  
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `grid-row-gap`: js.UndefOr[GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]] = js.native
  
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `ime-mode`: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block`: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block-end`: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block-start`: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline`: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline-end`: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline-start`: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.native
  
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Syntax**: `none | <position>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-coordinate`: js.UndefOr[
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
  var `scroll-snap-destination`: js.UndefOr[
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
  var `scroll-snap-points-x`: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
  
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-points-y`: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
  
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-type-x`: js.UndefOr[ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]] = js.native
  
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-type-y`: js.UndefOr[ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]] = js.native
  
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var `scrollbar-track-color`: js.UndefOr[MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]] = js.native
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `text-combine-horizontal`: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
}
object ObsoletePropertiesHyphenFallback {
  
  @scala.inline
  def apply[TLength](): ObsoletePropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObsoletePropertiesHyphenFallback[TLength]]
  }
  
  @scala.inline
  implicit class ObsoletePropertiesHyphenFallbackOps[Self <: ObsoletePropertiesHyphenFallback[_], TLength] (val x: Self with ObsoletePropertiesHyphenFallback[TLength]) extends AnyVal {
    
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
    def `set-khtml-box-alignVarargs`(value: BoxAlignProperty*): Self = this.set("-khtml-box-align", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-box-align`(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = this.set("-khtml-box-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-box-align`: Self = this.set("-khtml-box-align", js.undefined)
    
    @scala.inline
    def `set-khtml-box-directionVarargs`(value: BoxDirectionProperty*): Self = this.set("-khtml-box-direction", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-box-direction`(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = this.set("-khtml-box-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-box-direction`: Self = this.set("-khtml-box-direction", js.undefined)
    
    @scala.inline
    def `set-khtml-box-flexVarargs`(value: GlobalsNumber*): Self = this.set("-khtml-box-flex", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-box-flex`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("-khtml-box-flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-box-flex`: Self = this.set("-khtml-box-flex", js.undefined)
    
    @scala.inline
    def `set-khtml-box-flex-groupVarargs`(value: GlobalsNumber*): Self = this.set("-khtml-box-flex-group", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-box-flex-group`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("-khtml-box-flex-group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-box-flex-group`: Self = this.set("-khtml-box-flex-group", js.undefined)
    
    @scala.inline
    def `set-khtml-box-linesVarargs`(value: BoxLinesProperty*): Self = this.set("-khtml-box-lines", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-box-lines`(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = this.set("-khtml-box-lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-box-lines`: Self = this.set("-khtml-box-lines", js.undefined)
    
    @scala.inline
    def `set-khtml-box-ordinal-groupVarargs`(value: GlobalsNumber*): Self = this.set("-khtml-box-ordinal-group", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-box-ordinal-group`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("-khtml-box-ordinal-group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-box-ordinal-group`: Self = this.set("-khtml-box-ordinal-group", js.undefined)
    
    @scala.inline
    def `set-khtml-box-orientVarargs`(value: BoxOrientProperty*): Self = this.set("-khtml-box-orient", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-box-orient`(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = this.set("-khtml-box-orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-box-orient`: Self = this.set("-khtml-box-orient", js.undefined)
    
    @scala.inline
    def `set-khtml-box-packVarargs`(value: BoxPackProperty*): Self = this.set("-khtml-box-pack", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-box-pack`(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = this.set("-khtml-box-pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-box-pack`: Self = this.set("-khtml-box-pack", js.undefined)
    
    @scala.inline
    def `set-khtml-line-breakVarargs`(value: LineBreakProperty*): Self = this.set("-khtml-line-break", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-line-break`(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = this.set("-khtml-line-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-line-break`: Self = this.set("-khtml-line-break", js.undefined)
    
    @scala.inline
    def `set-khtml-opacityVarargs`(value: OpacityProperty*): Self = this.set("-khtml-opacity", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-opacity`(value: OpacityProperty | js.Array[OpacityProperty]): Self = this.set("-khtml-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-opacity`: Self = this.set("-khtml-opacity", js.undefined)
    
    @scala.inline
    def `set-khtml-user-selectVarargs`(value: UserSelectProperty*): Self = this.set("-khtml-user-select", js.Array(value :_*))
    
    @scala.inline
    def `set-khtml-user-select`(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = this.set("-khtml-user-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-khtml-user-select`: Self = this.set("-khtml-user-select", js.undefined)
    
    @scala.inline
    def `set-moz-background-clipVarargs`(value: BackgroundClipProperty*): Self = this.set("-moz-background-clip", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-background-clip`(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self = this.set("-moz-background-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-background-clip`: Self = this.set("-moz-background-clip", js.undefined)
    
    @scala.inline
    def `set-moz-background-inline-policyVarargs`(value: BoxDecorationBreakProperty*): Self = this.set("-moz-background-inline-policy", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-background-inline-policy`(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self = this.set("-moz-background-inline-policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-background-inline-policy`: Self = this.set("-moz-background-inline-policy", js.undefined)
    
    @scala.inline
    def `set-moz-background-originVarargs`(value: BackgroundOriginProperty*): Self = this.set("-moz-background-origin", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-background-origin`(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self = this.set("-moz-background-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-background-origin`: Self = this.set("-moz-background-origin", js.undefined)
    
    @scala.inline
    def `set-moz-background-sizeVarargs`(value: BackgroundSizeProperty[TLength]*): Self = this.set("-moz-background-size", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-background-size`(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = this.set("-moz-background-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-background-size`: Self = this.set("-moz-background-size", js.undefined)
    
    @scala.inline
    def `set-moz-bindingVarargs`(value: MozBindingProperty*): Self = this.set("-moz-binding", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-binding`(value: MozBindingProperty | js.Array[MozBindingProperty]): Self = this.set("-moz-binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-binding`: Self = this.set("-moz-binding", js.undefined)
    
    @scala.inline
    def `set-moz-border-radiusVarargs`(value: BorderRadiusProperty[TLength]*): Self = this.set("-moz-border-radius", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-border-radius`(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): Self = this.set("-moz-border-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-border-radius`: Self = this.set("-moz-border-radius", js.undefined)
    
    @scala.inline
    def `set-moz-border-radius-bottomleftVarargs`(value: BorderBottomLeftRadiusProperty[TLength]*): Self = this.set("-moz-border-radius-bottomleft", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-border-radius-bottomleft`(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self = this.set("-moz-border-radius-bottomleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-border-radius-bottomleft`: Self = this.set("-moz-border-radius-bottomleft", js.undefined)
    
    @scala.inline
    def `set-moz-border-radius-bottomrightVarargs`(value: BorderBottomRightRadiusProperty[TLength]*): Self = this.set("-moz-border-radius-bottomright", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-border-radius-bottomright`(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): Self = this.set("-moz-border-radius-bottomright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-border-radius-bottomright`: Self = this.set("-moz-border-radius-bottomright", js.undefined)
    
    @scala.inline
    def `set-moz-border-radius-topleftVarargs`(value: BorderTopLeftRadiusProperty[TLength]*): Self = this.set("-moz-border-radius-topleft", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-border-radius-topleft`(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self = this.set("-moz-border-radius-topleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-border-radius-topleft`: Self = this.set("-moz-border-radius-topleft", js.undefined)
    
    @scala.inline
    def `set-moz-border-radius-toprightVarargs`(value: BorderTopRightRadiusProperty[TLength]*): Self = this.set("-moz-border-radius-topright", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-border-radius-topright`(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self = this.set("-moz-border-radius-topright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-border-radius-topright`: Self = this.set("-moz-border-radius-topright", js.undefined)
    
    @scala.inline
    def `set-moz-box-alignVarargs`(value: BoxAlignProperty*): Self = this.set("-moz-box-align", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-box-align`(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = this.set("-moz-box-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-box-align`: Self = this.set("-moz-box-align", js.undefined)
    
    @scala.inline
    def `set-moz-box-directionVarargs`(value: BoxDirectionProperty*): Self = this.set("-moz-box-direction", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-box-direction`(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = this.set("-moz-box-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-box-direction`: Self = this.set("-moz-box-direction", js.undefined)
    
    @scala.inline
    def `set-moz-box-flexVarargs`(value: GlobalsNumber*): Self = this.set("-moz-box-flex", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-box-flex`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("-moz-box-flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-box-flex`: Self = this.set("-moz-box-flex", js.undefined)
    
    @scala.inline
    def `set-moz-box-ordinal-groupVarargs`(value: GlobalsNumber*): Self = this.set("-moz-box-ordinal-group", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-box-ordinal-group`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("-moz-box-ordinal-group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-box-ordinal-group`: Self = this.set("-moz-box-ordinal-group", js.undefined)
    
    @scala.inline
    def `set-moz-box-orientVarargs`(value: BoxOrientProperty*): Self = this.set("-moz-box-orient", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-box-orient`(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = this.set("-moz-box-orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-box-orient`: Self = this.set("-moz-box-orient", js.undefined)
    
    @scala.inline
    def `set-moz-box-packVarargs`(value: BoxPackProperty*): Self = this.set("-moz-box-pack", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-box-pack`(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = this.set("-moz-box-pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-box-pack`: Self = this.set("-moz-box-pack", js.undefined)
    
    @scala.inline
    def `set-moz-box-shadowVarargs`(value: BoxShadowProperty*): Self = this.set("-moz-box-shadow", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-box-shadow`(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self = this.set("-moz-box-shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-box-shadow`: Self = this.set("-moz-box-shadow", js.undefined)
    
    @scala.inline
    def `set-moz-opacityVarargs`(value: OpacityProperty*): Self = this.set("-moz-opacity", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-opacity`(value: OpacityProperty | js.Array[OpacityProperty]): Self = this.set("-moz-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-opacity`: Self = this.set("-moz-opacity", js.undefined)
    
    @scala.inline
    def `set-moz-outlineVarargs`(value: OutlineProperty[TLength]*): Self = this.set("-moz-outline", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-outline`(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): Self = this.set("-moz-outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-outline`: Self = this.set("-moz-outline", js.undefined)
    
    @scala.inline
    def `set-moz-outline-colorVarargs`(value: OutlineColorProperty*): Self = this.set("-moz-outline-color", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-outline-color`(value: OutlineColorProperty | js.Array[OutlineColorProperty]): Self = this.set("-moz-outline-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-outline-color`: Self = this.set("-moz-outline-color", js.undefined)
    
    @scala.inline
    def `set-moz-outline-radiusVarargs`(value: MozOutlineRadiusProperty[TLength]*): Self = this.set("-moz-outline-radius", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-outline-radius`(value: MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]): Self = this.set("-moz-outline-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-outline-radius`: Self = this.set("-moz-outline-radius", js.undefined)
    
    @scala.inline
    def `set-moz-outline-styleVarargs`(value: OutlineStyleProperty*): Self = this.set("-moz-outline-style", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-outline-style`(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): Self = this.set("-moz-outline-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-outline-style`: Self = this.set("-moz-outline-style", js.undefined)
    
    @scala.inline
    def `set-moz-outline-widthVarargs`(value: OutlineWidthProperty[TLength]*): Self = this.set("-moz-outline-width", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-outline-width`(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): Self = this.set("-moz-outline-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-outline-width`: Self = this.set("-moz-outline-width", js.undefined)
    
    @scala.inline
    def `set-moz-text-align-lastVarargs`(value: TextAlignLastProperty*): Self = this.set("-moz-text-align-last", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-text-align-last`(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): Self = this.set("-moz-text-align-last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-text-align-last`: Self = this.set("-moz-text-align-last", js.undefined)
    
    @scala.inline
    def `set-moz-text-decoration-colorVarargs`(value: TextDecorationColorProperty*): Self = this.set("-moz-text-decoration-color", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-text-decoration-color`(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): Self = this.set("-moz-text-decoration-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-text-decoration-color`: Self = this.set("-moz-text-decoration-color", js.undefined)
    
    @scala.inline
    def `set-moz-text-decoration-lineVarargs`(value: TextDecorationLineProperty*): Self = this.set("-moz-text-decoration-line", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-text-decoration-line`(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): Self = this.set("-moz-text-decoration-line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-text-decoration-line`: Self = this.set("-moz-text-decoration-line", js.undefined)
    
    @scala.inline
    def `set-moz-text-decoration-styleVarargs`(value: TextDecorationStyleProperty*): Self = this.set("-moz-text-decoration-style", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-text-decoration-style`(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): Self = this.set("-moz-text-decoration-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-text-decoration-style`: Self = this.set("-moz-text-decoration-style", js.undefined)
    
    @scala.inline
    def `set-moz-user-inputVarargs`(value: MozUserInputProperty*): Self = this.set("-moz-user-input", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-user-input`(value: MozUserInputProperty | js.Array[MozUserInputProperty]): Self = this.set("-moz-user-input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-user-input`: Self = this.set("-moz-user-input", js.undefined)
    
    @scala.inline
    def `set-ms-ime-modeVarargs`(value: ImeModeProperty*): Self = this.set("-ms-ime-mode", js.Array(value :_*))
    
    @scala.inline
    def `set-ms-ime-mode`(value: ImeModeProperty | js.Array[ImeModeProperty]): Self = this.set("-ms-ime-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-ime-mode`: Self = this.set("-ms-ime-mode", js.undefined)
    
    @scala.inline
    def `set-ms-scrollbar-track-colorVarargs`(value: MsScrollbarTrackColorProperty*): Self = this.set("-ms-scrollbar-track-color", js.Array(value :_*))
    
    @scala.inline
    def `set-ms-scrollbar-track-color`(value: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]): Self = this.set("-ms-scrollbar-track-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-scrollbar-track-color`: Self = this.set("-ms-scrollbar-track-color", js.undefined)
    
    @scala.inline
    def `set-o-animationVarargs`(value: AnimationProperty*): Self = this.set("-o-animation", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation`(value: AnimationProperty | js.Array[AnimationProperty]): Self = this.set("-o-animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation`: Self = this.set("-o-animation", js.undefined)
    
    @scala.inline
    def `set-o-animation-delayVarargs`(value: GlobalsString*): Self = this.set("-o-animation-delay", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation-delay`(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("-o-animation-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation-delay`: Self = this.set("-o-animation-delay", js.undefined)
    
    @scala.inline
    def `set-o-animation-directionVarargs`(value: AnimationDirectionProperty*): Self = this.set("-o-animation-direction", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation-direction`(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = this.set("-o-animation-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation-direction`: Self = this.set("-o-animation-direction", js.undefined)
    
    @scala.inline
    def `set-o-animation-durationVarargs`(value: GlobalsString*): Self = this.set("-o-animation-duration", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation-duration`(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("-o-animation-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation-duration`: Self = this.set("-o-animation-duration", js.undefined)
    
    @scala.inline
    def `set-o-animation-fill-modeVarargs`(value: AnimationFillModeProperty*): Self = this.set("-o-animation-fill-mode", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation-fill-mode`(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = this.set("-o-animation-fill-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation-fill-mode`: Self = this.set("-o-animation-fill-mode", js.undefined)
    
    @scala.inline
    def `set-o-animation-iteration-countVarargs`(value: AnimationIterationCountProperty*): Self = this.set("-o-animation-iteration-count", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation-iteration-count`(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = this.set("-o-animation-iteration-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation-iteration-count`: Self = this.set("-o-animation-iteration-count", js.undefined)
    
    @scala.inline
    def `set-o-animation-nameVarargs`(value: AnimationNameProperty*): Self = this.set("-o-animation-name", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation-name`(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = this.set("-o-animation-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation-name`: Self = this.set("-o-animation-name", js.undefined)
    
    @scala.inline
    def `set-o-animation-play-stateVarargs`(value: AnimationPlayStateProperty*): Self = this.set("-o-animation-play-state", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation-play-state`(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = this.set("-o-animation-play-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation-play-state`: Self = this.set("-o-animation-play-state", js.undefined)
    
    @scala.inline
    def `set-o-animation-timing-functionVarargs`(value: AnimationTimingFunctionProperty*): Self = this.set("-o-animation-timing-function", js.Array(value :_*))
    
    @scala.inline
    def `set-o-animation-timing-function`(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = this.set("-o-animation-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-animation-timing-function`: Self = this.set("-o-animation-timing-function", js.undefined)
    
    @scala.inline
    def `set-o-background-sizeVarargs`(value: BackgroundSizeProperty[TLength]*): Self = this.set("-o-background-size", js.Array(value :_*))
    
    @scala.inline
    def `set-o-background-size`(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = this.set("-o-background-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-background-size`: Self = this.set("-o-background-size", js.undefined)
    
    @scala.inline
    def `set-o-border-imageVarargs`(value: BorderImageProperty*): Self = this.set("-o-border-image", js.Array(value :_*))
    
    @scala.inline
    def `set-o-border-image`(value: BorderImageProperty | js.Array[BorderImageProperty]): Self = this.set("-o-border-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-border-image`: Self = this.set("-o-border-image", js.undefined)
    
    @scala.inline
    def `set-o-transformVarargs`(value: TransformProperty*): Self = this.set("-o-transform", js.Array(value :_*))
    
    @scala.inline
    def `set-o-transform`(value: TransformProperty | js.Array[TransformProperty]): Self = this.set("-o-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-transform`: Self = this.set("-o-transform", js.undefined)
    
    @scala.inline
    def `set-o-transitionVarargs`(value: TransitionProperty*): Self = this.set("-o-transition", js.Array(value :_*))
    
    @scala.inline
    def `set-o-transition`(value: TransitionProperty | js.Array[TransitionProperty]): Self = this.set("-o-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-transition`: Self = this.set("-o-transition", js.undefined)
    
    @scala.inline
    def `set-o-transition-delayVarargs`(value: GlobalsString*): Self = this.set("-o-transition-delay", js.Array(value :_*))
    
    @scala.inline
    def `set-o-transition-delay`(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("-o-transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-transition-delay`: Self = this.set("-o-transition-delay", js.undefined)
    
    @scala.inline
    def `set-o-transition-durationVarargs`(value: GlobalsString*): Self = this.set("-o-transition-duration", js.Array(value :_*))
    
    @scala.inline
    def `set-o-transition-duration`(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("-o-transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-transition-duration`: Self = this.set("-o-transition-duration", js.undefined)
    
    @scala.inline
    def `set-o-transition-propertyVarargs`(value: TransitionPropertyProperty*): Self = this.set("-o-transition-property", js.Array(value :_*))
    
    @scala.inline
    def `set-o-transition-property`(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = this.set("-o-transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-transition-property`: Self = this.set("-o-transition-property", js.undefined)
    
    @scala.inline
    def `set-o-transition-timing-functionVarargs`(value: TransitionTimingFunctionProperty*): Self = this.set("-o-transition-timing-function", js.Array(value :_*))
    
    @scala.inline
    def `set-o-transition-timing-function`(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = this.set("-o-transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-transition-timing-function`: Self = this.set("-o-transition-timing-function", js.undefined)
    
    @scala.inline
    def `set-webkit-box-alignVarargs`(value: BoxAlignProperty*): Self = this.set("-webkit-box-align", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-box-align`(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = this.set("-webkit-box-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-box-align`: Self = this.set("-webkit-box-align", js.undefined)
    
    @scala.inline
    def `set-webkit-box-directionVarargs`(value: BoxDirectionProperty*): Self = this.set("-webkit-box-direction", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-box-direction`(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = this.set("-webkit-box-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-box-direction`: Self = this.set("-webkit-box-direction", js.undefined)
    
    @scala.inline
    def `set-webkit-box-flexVarargs`(value: GlobalsNumber*): Self = this.set("-webkit-box-flex", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-box-flex`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("-webkit-box-flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-box-flex`: Self = this.set("-webkit-box-flex", js.undefined)
    
    @scala.inline
    def `set-webkit-box-flex-groupVarargs`(value: GlobalsNumber*): Self = this.set("-webkit-box-flex-group", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-box-flex-group`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("-webkit-box-flex-group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-box-flex-group`: Self = this.set("-webkit-box-flex-group", js.undefined)
    
    @scala.inline
    def `set-webkit-box-linesVarargs`(value: BoxLinesProperty*): Self = this.set("-webkit-box-lines", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-box-lines`(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = this.set("-webkit-box-lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-box-lines`: Self = this.set("-webkit-box-lines", js.undefined)
    
    @scala.inline
    def `set-webkit-box-ordinal-groupVarargs`(value: GlobalsNumber*): Self = this.set("-webkit-box-ordinal-group", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-box-ordinal-group`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("-webkit-box-ordinal-group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-box-ordinal-group`: Self = this.set("-webkit-box-ordinal-group", js.undefined)
    
    @scala.inline
    def `set-webkit-box-orientVarargs`(value: BoxOrientProperty*): Self = this.set("-webkit-box-orient", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-box-orient`(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = this.set("-webkit-box-orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-box-orient`: Self = this.set("-webkit-box-orient", js.undefined)
    
    @scala.inline
    def `set-webkit-box-packVarargs`(value: BoxPackProperty*): Self = this.set("-webkit-box-pack", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-box-pack`(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = this.set("-webkit-box-pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-box-pack`: Self = this.set("-webkit-box-pack", js.undefined)
    
    @scala.inline
    def `set-webkit-scroll-snap-points-xVarargs`(value: ScrollSnapPointsXProperty*): Self = this.set("-webkit-scroll-snap-points-x", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-scroll-snap-points-x`(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): Self = this.set("-webkit-scroll-snap-points-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-scroll-snap-points-x`: Self = this.set("-webkit-scroll-snap-points-x", js.undefined)
    
    @scala.inline
    def `set-webkit-scroll-snap-points-yVarargs`(value: ScrollSnapPointsYProperty*): Self = this.set("-webkit-scroll-snap-points-y", js.Array(value :_*))
    
    @scala.inline
    def `set-webkit-scroll-snap-points-y`(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): Self = this.set("-webkit-scroll-snap-points-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-webkit-scroll-snap-points-y`: Self = this.set("-webkit-scroll-snap-points-y", js.undefined)
    
    @scala.inline
    def `setBox-alignVarargs`(value: BoxAlignProperty*): Self = this.set("box-align", js.Array(value :_*))
    
    @scala.inline
    def `setBox-align`(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = this.set("box-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBox-align`: Self = this.set("box-align", js.undefined)
    
    @scala.inline
    def `setBox-directionVarargs`(value: BoxDirectionProperty*): Self = this.set("box-direction", js.Array(value :_*))
    
    @scala.inline
    def `setBox-direction`(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = this.set("box-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBox-direction`: Self = this.set("box-direction", js.undefined)
    
    @scala.inline
    def `setBox-flexVarargs`(value: GlobalsNumber*): Self = this.set("box-flex", js.Array(value :_*))
    
    @scala.inline
    def `setBox-flex`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("box-flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBox-flex`: Self = this.set("box-flex", js.undefined)
    
    @scala.inline
    def `setBox-flex-groupVarargs`(value: GlobalsNumber*): Self = this.set("box-flex-group", js.Array(value :_*))
    
    @scala.inline
    def `setBox-flex-group`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("box-flex-group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBox-flex-group`: Self = this.set("box-flex-group", js.undefined)
    
    @scala.inline
    def `setBox-linesVarargs`(value: BoxLinesProperty*): Self = this.set("box-lines", js.Array(value :_*))
    
    @scala.inline
    def `setBox-lines`(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = this.set("box-lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBox-lines`: Self = this.set("box-lines", js.undefined)
    
    @scala.inline
    def `setBox-ordinal-groupVarargs`(value: GlobalsNumber*): Self = this.set("box-ordinal-group", js.Array(value :_*))
    
    @scala.inline
    def `setBox-ordinal-group`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("box-ordinal-group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBox-ordinal-group`: Self = this.set("box-ordinal-group", js.undefined)
    
    @scala.inline
    def `setBox-orientVarargs`(value: BoxOrientProperty*): Self = this.set("box-orient", js.Array(value :_*))
    
    @scala.inline
    def `setBox-orient`(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = this.set("box-orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBox-orient`: Self = this.set("box-orient", js.undefined)
    
    @scala.inline
    def `setBox-packVarargs`(value: BoxPackProperty*): Self = this.set("box-pack", js.Array(value :_*))
    
    @scala.inline
    def `setBox-pack`(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = this.set("box-pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBox-pack`: Self = this.set("box-pack", js.undefined)
    
    @scala.inline
    def setClipVarargs(value: ClipProperty*): Self = this.set("clip", js.Array(value :_*))
    
    @scala.inline
    def setClip(value: ClipProperty | js.Array[ClipProperty]): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def `setFont-variant-alternatesVarargs`(value: FontVariantAlternatesProperty*): Self = this.set("font-variant-alternates", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variant-alternates`(value: FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]): Self = this.set("font-variant-alternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-variant-alternates`: Self = this.set("font-variant-alternates", js.undefined)
    
    @scala.inline
    def `setGrid-column-gapVarargs`(value: GridColumnGapProperty[TLength]*): Self = this.set("grid-column-gap", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-column-gap`(value: GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]): Self = this.set("grid-column-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGrid-column-gap`: Self = this.set("grid-column-gap", js.undefined)
    
    @scala.inline
    def `setGrid-gapVarargs`(value: GridGapProperty[TLength]*): Self = this.set("grid-gap", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-gap`(value: GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]): Self = this.set("grid-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGrid-gap`: Self = this.set("grid-gap", js.undefined)
    
    @scala.inline
    def `setGrid-row-gapVarargs`(value: GridRowGapProperty[TLength]*): Self = this.set("grid-row-gap", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-row-gap`(value: GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]): Self = this.set("grid-row-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGrid-row-gap`: Self = this.set("grid-row-gap", js.undefined)
    
    @scala.inline
    def `setIme-modeVarargs`(value: ImeModeProperty*): Self = this.set("ime-mode", js.Array(value :_*))
    
    @scala.inline
    def `setIme-mode`(value: ImeModeProperty | js.Array[ImeModeProperty]): Self = this.set("ime-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIme-mode`: Self = this.set("ime-mode", js.undefined)
    
    @scala.inline
    def `setOffset-blockVarargs`(value: InsetBlockProperty[TLength]*): Self = this.set("offset-block", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-block`(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): Self = this.set("offset-block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-block`: Self = this.set("offset-block", js.undefined)
    
    @scala.inline
    def `setOffset-block-endVarargs`(value: InsetBlockEndProperty[TLength]*): Self = this.set("offset-block-end", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-block-end`(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): Self = this.set("offset-block-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-block-end`: Self = this.set("offset-block-end", js.undefined)
    
    @scala.inline
    def `setOffset-block-startVarargs`(value: InsetBlockStartProperty[TLength]*): Self = this.set("offset-block-start", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-block-start`(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): Self = this.set("offset-block-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-block-start`: Self = this.set("offset-block-start", js.undefined)
    
    @scala.inline
    def `setOffset-inlineVarargs`(value: InsetInlineProperty[TLength]*): Self = this.set("offset-inline", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-inline`(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): Self = this.set("offset-inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-inline`: Self = this.set("offset-inline", js.undefined)
    
    @scala.inline
    def `setOffset-inline-endVarargs`(value: InsetInlineEndProperty[TLength]*): Self = this.set("offset-inline-end", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-inline-end`(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): Self = this.set("offset-inline-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-inline-end`: Self = this.set("offset-inline-end", js.undefined)
    
    @scala.inline
    def `setOffset-inline-startVarargs`(value: InsetInlineStartProperty[TLength]*): Self = this.set("offset-inline-start", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-inline-start`(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): Self = this.set("offset-inline-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-inline-start`: Self = this.set("offset-inline-start", js.undefined)
    
    @scala.inline
    def `setScroll-snap-coordinateVarargs`(value: ScrollSnapCoordinateProperty[TLength]*): Self = this.set("scroll-snap-coordinate", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-coordinate`(value: ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]): Self = this.set("scroll-snap-coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScroll-snap-coordinate`: Self = this.set("scroll-snap-coordinate", js.undefined)
    
    @scala.inline
    def `setScroll-snap-destinationVarargs`(value: ScrollSnapDestinationProperty[TLength]*): Self = this.set("scroll-snap-destination", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-destination`(value: ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]): Self = this.set("scroll-snap-destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScroll-snap-destination`: Self = this.set("scroll-snap-destination", js.undefined)
    
    @scala.inline
    def `setScroll-snap-points-xVarargs`(value: ScrollSnapPointsXProperty*): Self = this.set("scroll-snap-points-x", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-points-x`(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): Self = this.set("scroll-snap-points-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScroll-snap-points-x`: Self = this.set("scroll-snap-points-x", js.undefined)
    
    @scala.inline
    def `setScroll-snap-points-yVarargs`(value: ScrollSnapPointsYProperty*): Self = this.set("scroll-snap-points-y", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-points-y`(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): Self = this.set("scroll-snap-points-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScroll-snap-points-y`: Self = this.set("scroll-snap-points-y", js.undefined)
    
    @scala.inline
    def `setScroll-snap-type-xVarargs`(value: ScrollSnapTypeXProperty*): Self = this.set("scroll-snap-type-x", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-type-x`(value: ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]): Self = this.set("scroll-snap-type-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScroll-snap-type-x`: Self = this.set("scroll-snap-type-x", js.undefined)
    
    @scala.inline
    def `setScroll-snap-type-yVarargs`(value: ScrollSnapTypeYProperty*): Self = this.set("scroll-snap-type-y", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-type-y`(value: ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]): Self = this.set("scroll-snap-type-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScroll-snap-type-y`: Self = this.set("scroll-snap-type-y", js.undefined)
    
    @scala.inline
    def `setScrollbar-track-colorVarargs`(value: MsScrollbarTrackColorProperty*): Self = this.set("scrollbar-track-color", js.Array(value :_*))
    
    @scala.inline
    def `setScrollbar-track-color`(value: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]): Self = this.set("scrollbar-track-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScrollbar-track-color`: Self = this.set("scrollbar-track-color", js.undefined)
    
    @scala.inline
    def `setText-combine-horizontalVarargs`(value: TextCombineUprightProperty*): Self = this.set("text-combine-horizontal", js.Array(value :_*))
    
    @scala.inline
    def `setText-combine-horizontal`(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = this.set("text-combine-horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-combine-horizontal`: Self = this.set("text-combine-horizontal", js.undefined)
  }
}
