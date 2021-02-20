package typings.preact.jsxCsstypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VendorLonghandPropertiesFallback[TLength] extends StObject {
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var MozAnimationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    */
  var MozAnimationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var MozAnimationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    */
  var MozAnimationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    */
  var MozAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    */
  var MozAnimationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    */
  var MozAnimationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var MozAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Syntax**: `none | button | button-arrow-down | button-arrow-next | button-arrow-previous | button-arrow-up | button-bevel | button-focus | caret | checkbox | checkbox-container | checkbox-label | checkmenuitem | dualbutton | groupbox | listbox | listitem | menuarrow | menubar | menucheckbox | menuimage | menuitem | menuitemtext | menulist | menulist-button | menulist-text | menulist-textfield | menupopup | menuradio | menuseparator | meterbar | meterchunk | progressbar | progressbar-vertical | progresschunk | progresschunk-vertical | radio | radio-container | radio-label | radiomenuitem | range | range-thumb | resizer | resizerpanel | scale-horizontal | scalethumbend | scalethumb-horizontal | scalethumbstart | scalethumbtick | scalethumb-vertical | scale-vertical | scrollbarbutton-down | scrollbarbutton-left | scrollbarbutton-right | scrollbarbutton-up | scrollbarthumb-horizontal | scrollbarthumb-vertical | scrollbartrack-horizontal | scrollbartrack-vertical | searchfield | separator | sheet | spinner | spinner-downbutton | spinner-textfield | spinner-upbutton | splitter | statusbar | statusbarpanel | tab | tabpanel | tabpanels | tab-scroll-arrow-back | tab-scroll-arrow-forward | textfield | textfield-multiline | toolbar | toolbarbutton | toolbarbutton-dropdown | toolbargripper | toolbox | tooltip | treeheader | treeheadercell | treeheadersortarrow | treeitem | treeline | treetwisty | treetwistyopen | treeview | -moz-mac-unified-toolbar | -moz-win-borderless-glass | -moz-win-browsertabbar-toolbox | -moz-win-communicationstext | -moz-win-communications-toolbox | -moz-win-exclude-glass | -moz-win-glass | -moz-win-mediatext | -moz-win-media-toolbox | -moz-window-button-box | -moz-window-button-box-maximized | -moz-window-button-close | -moz-window-button-maximize | -moz-window-button-minimize | -moz-window-button-restore | -moz-window-frame-bottom | -moz-window-frame-left | -moz-window-frame-right | -moz-window-titlebar | -moz-window-titlebar-maximized`
    *
    * **Initial value**: `none` (but this value is overridden in the user agent CSS)
    */
  var MozAppearance: js.UndefOr[MozAppearanceProperty | js.Array[MozAppearanceProperty]] = js.native
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Syntax**: `visible | hidden`
    *
    * **Initial value**: `visible`
    */
  var MozBackfaceVisibility: js.UndefOr[BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-bottom-colors`** CSS property sets a list of colors for the bottom border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var MozBorderBottomColors: js.UndefOr[MozBorderBottomColorsProperty | js.Array[MozBorderBottomColorsProperty]] = js.native
  
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var MozBorderEndColor: js.UndefOr[BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]] = js.native
  
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    */
  var MozBorderEndStyle: js.UndefOr[BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]] = js.native
  
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    */
  var MozBorderEndWidth: js.UndefOr[
    BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]
  ] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-left-colors`** CSS property sets a list of colors for the left border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var MozBorderLeftColors: js.UndefOr[MozBorderLeftColorsProperty | js.Array[MozBorderLeftColorsProperty]] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-right-colors`** CSS property sets a list of colors for the right border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var MozBorderRightColors: js.UndefOr[MozBorderRightColorsProperty | js.Array[MozBorderRightColorsProperty]] = js.native
  
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var MozBorderStartColor: js.UndefOr[BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]] = js.native
  
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    */
  var MozBorderStartStyle: js.UndefOr[BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-top-colors`** CSS property sets a list of colors for the top border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var MozBorderTopColors: js.UndefOr[MozBorderTopColorsProperty | js.Array[MozBorderTopColorsProperty]] = js.native
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Syntax**: `content-box | border-box`
    *
    * **Initial value**: `content-box`
    */
  var MozBoxSizing: js.UndefOr[BoxSizingProperty | js.Array[BoxSizingProperty]] = js.native
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Syntax**: `<integer> | auto`
    *
    * **Initial value**: `auto`
    */
  var MozColumnCount: js.UndefOr[ColumnCountProperty | js.Array[ColumnCountProperty]] = js.native
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Syntax**: `auto | balance | balance-all`
    *
    * **Initial value**: `balance`
    */
  var MozColumnFill: js.UndefOr[ColumnFillProperty | js.Array[ColumnFillProperty]] = js.native
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    */
  var MozColumnGap: js.UndefOr[ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]] = js.native
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var MozColumnRuleColor: js.UndefOr[ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]] = js.native
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var MozColumnRuleStyle: js.UndefOr[ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]] = js.native
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var MozColumnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]] = js.native
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Syntax**: `<length> | auto`
    *
    * **Initial value**: `auto`
    */
  var MozColumnWidth: js.UndefOr[ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]] = js.native
  
  /**
    * If you reference an SVG image in a webpage (such as with the `<img>` element or as a background image), the SVG image can coordinate with the embedding element (its context) to have the image adopt property values set on the embedding element. To do this the embedding element needs to list the properties that are to be made available to the image by listing them as values of the **`-moz-context-properties`** property, and the image needs to opt in to using those properties by using values such as the `context-fill` value.
    *
    * **Syntax**: `none | [ fill | fill-opacity | stroke | stroke-opacity ]#`
    *
    * **Initial value**: `none`
    */
  var MozContextProperties: js.UndefOr[MozContextPropertiesProperty | js.Array[MozContextPropertiesProperty]] = js.native
  
  /**
    * The non-standard **`-moz-float-edge`** CSS property specifies whether the height and width properties of the element include the margin, border, or padding thickness.
    *
    * **Syntax**: `border-box | content-box | margin-box | padding-box`
    *
    * **Initial value**: `content-box`
    */
  var MozFloatEdge: js.UndefOr[MozFloatEdgeProperty | js.Array[MozFloatEdgeProperty]] = js.native
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Syntax**: `normal | <feature-tag-value>#`
    *
    * **Initial value**: `normal`
    */
  var MozFontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]] = js.native
  
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
    *
    * **Syntax**: `normal | <string>`
    *
    * **Initial value**: `normal`
    */
  var MozFontLanguageOverride: js.UndefOr[FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]] = js.native
  
  /**
    * The **`-moz-force-broken-image-icon`** extended CSS property can be used to force the broken image icon to be shown even when a broken image has an `alt` attribute.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `0`
    */
  var MozForceBrokenImageIcon: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var MozHyphens: js.UndefOr[HyphensProperty | js.Array[HyphensProperty]] = js.native
  
  /**
    * For certain XUL elements and pseudo-elements that use an image from the `list-style-image` property, this property specifies a region of the image that is used in place of the whole image. This allows elements to use different pieces of the same image to improve performance.
    *
    * **Syntax**: `<shape> | auto`
    *
    * **Initial value**: `auto`
    */
  var MozImageRegion: js.UndefOr[MozImageRegionProperty | js.Array[MozImageRegionProperty]] = js.native
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var MozMarginEnd: js.UndefOr[MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var MozMarginStart: js.UndefOr[
    MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`-moz-orient`** CSS property specifies the orientation of the element to which it's applied.
    *
    * **Syntax**: `inline | block | horizontal | vertical`
    *
    * **Initial value**: `inline`
    */
  var MozOrient: js.UndefOr[MozOrientProperty | js.Array[MozOrientProperty]] = js.native
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-bottomleft`** CSS property can be used to round the bottom-left corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    */
  var MozOutlineRadiusBottomleft: js.UndefOr[
    MozOutlineRadiusBottomleftProperty[TLength] | js.Array[MozOutlineRadiusBottomleftProperty[TLength]]
  ] = js.native
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-bottomright`** CSS property can be used to round the bottom-right corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    */
  var MozOutlineRadiusBottomright: js.UndefOr[
    MozOutlineRadiusBottomrightProperty[TLength] | js.Array[MozOutlineRadiusBottomrightProperty[TLength]]
  ] = js.native
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-topleft`** CSS property can be used to round the top-left corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    */
  var MozOutlineRadiusTopleft: js.UndefOr[
    MozOutlineRadiusTopleftProperty[TLength] | js.Array[MozOutlineRadiusTopleftProperty[TLength]]
  ] = js.native
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-topright`** CSS property can be used to round the top-right corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    */
  var MozOutlineRadiusTopright: js.UndefOr[
    MozOutlineRadiusToprightProperty[TLength] | js.Array[MozOutlineRadiusToprightProperty[TLength]]
  ] = js.native
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var MozPaddingEnd: js.UndefOr[PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var MozPaddingStart: js.UndefOr[
    PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Syntax**: `none | <length>`
    *
    * **Initial value**: `none`
    */
  var MozPerspective: js.UndefOr[PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]] = js.native
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var MozPerspectiveOrigin: js.UndefOr[
    PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]
  ] = js.native
  
  /**
    * **`-moz-stack-sizing`** is an extended CSS property. Normally, a `stack` will change its size so that all of its child elements are completely visible. For example, moving a child of the stack far to the right will widen the stack so the child remains visible.
    *
    * **Syntax**: `ignore | stretch-to-fit`
    *
    * **Initial value**: `stretch-to-fit`
    */
  var MozStackSizing: js.UndefOr[MozStackSizingProperty | js.Array[MozStackSizingProperty]] = js.native
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    */
  var MozTabSize: js.UndefOr[TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]] = js.native
  
  /**
    * The **`-moz-text-blink`** non-standard Mozilla CSS extension specifies the blink mode.
    *
    * **Syntax**: `none | blink`
    *
    * **Initial value**: `none`
    */
  var MozTextBlink: js.UndefOr[MozTextBlinkProperty | js.Array[MozTextBlinkProperty]] = js.native
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Syntax**: `none | auto | <percentage>`
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    */
  var MozTextSizeAdjust: js.UndefOr[TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var MozTransformOrigin: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.native
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Syntax**: `flat | preserve-3d`
    *
    * **Initial value**: `flat`
    */
  var MozTransformStyle: js.UndefOr[TransformStyleProperty | js.Array[TransformStyleProperty]] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var MozTransitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var MozTransitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var MozTransitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var MozTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  
  /**
    * The **`-moz-user-focus`** CSS property is used to indicate whether an element can have the focus.
    *
    * **Syntax**: `ignore | normal | select-after | select-before | select-menu | select-same | select-all | none`
    *
    * **Initial value**: `none`
    */
  var MozUserFocus: js.UndefOr[MozUserFocusProperty | js.Array[MozUserFocusProperty]] = js.native
  
  /**
    * The **`user-modify`** property has no effect in Firefox. It was originally planned to determine whether or not the content of an element can be edited by a user.
    *
    * **Syntax**: `read-only | read-write | write-only`
    *
    * **Initial value**: `read-only`
    */
  var MozUserModify: js.UndefOr[MozUserModifyProperty | js.Array[MozUserModifyProperty]] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    */
  var MozUserSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  
  /**
    * The **`-moz-window-dragging`** CSS property specifies whether a window is draggable or not. It only works in Chrome code, and only on Mac OS X.
    *
    * **Syntax**: `drag | no-drag`
    *
    * **Initial value**: `drag`
    */
  var MozWindowDragging: js.UndefOr[MozWindowDraggingProperty | js.Array[MozWindowDraggingProperty]] = js.native
  
  /**
    * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
    *
    * **Syntax**: `default | menu | tooltip | sheet | none`
    *
    * **Initial value**: `default`
    */
  var MozWindowShadow: js.UndefOr[MozWindowShadowProperty | js.Array[MozWindowShadowProperty]] = js.native
  
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Syntax**: `fill | contain | cover | none | scale-down`
    *
    * **Initial value**: `fill`
    */
  var OObjectFit: js.UndefOr[ObjectFitProperty | js.Array[ObjectFitProperty]] = js.native
  
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var OObjectPosition: js.UndefOr[ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]] = js.native
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    */
  var OTabSize: js.UndefOr[TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]] = js.native
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    */
  var OTextOverflow: js.UndefOr[TextOverflowProperty | js.Array[TextOverflowProperty]] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var OTransformOrigin: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.native
  
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * **Syntax**: `normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position>`
    *
    * **Initial value**: `normal`
    */
  var WebkitAlignContent: js.UndefOr[AlignContentProperty | js.Array[AlignContentProperty]] = js.native
  
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Syntax**: `normal | stretch | <baseline-position> | [ <overflow-position>? <self-position> ]`
    *
    * **Initial value**: `normal`
    */
  var WebkitAlignItems: js.UndefOr[AlignItemsProperty | js.Array[AlignItemsProperty]] = js.native
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
    *
    * **Initial value**: `auto`
    */
  var WebkitAlignSelf: js.UndefOr[AlignSelfProperty | js.Array[AlignSelfProperty]] = js.native
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var WebkitAnimationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    */
  var WebkitAnimationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var WebkitAnimationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    */
  var WebkitAnimationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    */
  var WebkitAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    */
  var WebkitAnimationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    */
  var WebkitAnimationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var WebkitAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Syntax**: `none | button | button-bevel | caret | checkbox | default-button | inner-spin-button | listbox | listitem | media-controls-background | media-controls-fullscreen-background | media-current-time-display | media-enter-fullscreen-button | media-exit-fullscreen-button | media-fullscreen-button | media-mute-button | media-overlay-play-button | media-play-button | media-seek-back-button | media-seek-forward-button | media-slider | media-sliderthumb | media-time-remaining-display | media-toggle-closed-captions-button | media-volume-slider | media-volume-slider-container | media-volume-sliderthumb | menulist | menulist-button | menulist-text | menulist-textfield | meter | progress-bar | progress-bar-value | push-button | radio | searchfield | searchfield-cancel-button | searchfield-decoration | searchfield-results-button | searchfield-results-decoration | slider-horizontal | slider-vertical | sliderthumb-horizontal | sliderthumb-vertical | square-button | textarea | textfield`
    *
    * **Initial value**: `none` (but this value is overridden in the user agent CSS)
    */
  var WebkitAppearance: js.UndefOr[WebkitAppearanceProperty | js.Array[WebkitAppearanceProperty]] = js.native
  
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    */
  var WebkitBackdropFilter: js.UndefOr[BackdropFilterProperty | js.Array[BackdropFilterProperty]] = js.native
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Syntax**: `visible | hidden`
    *
    * **Initial value**: `visible`
    */
  var WebkitBackfaceVisibility: js.UndefOr[BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]] = js.native
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    */
  var WebkitBackgroundClip: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    */
  var WebkitBackgroundOrigin: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    */
  var WebkitBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `<'color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitBorderBeforeColor: js.UndefOr[WebkitBorderBeforeColorProperty | js.Array[WebkitBorderBeforeColorProperty]] = js.native
  
  /**
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var WebkitBorderBeforeStyle: js.UndefOr[WebkitBorderBeforeStyleProperty | js.Array[WebkitBorderBeforeStyleProperty]] = js.native
  
  /**
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var WebkitBorderBeforeWidth: js.UndefOr[
    WebkitBorderBeforeWidthProperty[TLength] | js.Array[WebkitBorderBeforeWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var WebkitBorderBottomLeftRadius: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var WebkitBorderBottomRightRadius: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Syntax**: `<number-percentage>{1,4} && fill?`
    *
    * **Initial value**: `100%`
    */
  var WebkitBorderImageSlice: js.UndefOr[BorderImageSliceProperty | js.Array[BorderImageSliceProperty]] = js.native
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var WebkitBorderTopLeftRadius: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var WebkitBorderTopRightRadius: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    */
  var WebkitBoxDecorationBreak: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
  
  /**
    * The **`-webkit-box-reflect`** CSS property lets you reflect the content of an element in one specific direction.
    *
    * **Syntax**: `[ above | below | right | left ]? <length>? <image>?`
    *
    * **Initial value**: `none`
    */
  var WebkitBoxReflect: js.UndefOr[WebkitBoxReflectProperty[TLength] | js.Array[WebkitBoxReflectProperty[TLength]]] = js.native
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    */
  var WebkitBoxShadow: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Syntax**: `content-box | border-box`
    *
    * **Initial value**: `content-box`
    */
  var WebkitBoxSizing: js.UndefOr[BoxSizingProperty | js.Array[BoxSizingProperty]] = js.native
  
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Syntax**: `<clip-source> | [ <basic-shape> || <geometry-box> ] | none`
    *
    * **Initial value**: `none`
    */
  var WebkitClipPath: js.UndefOr[ClipPathProperty | js.Array[ClipPathProperty]] = js.native
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Syntax**: `<integer> | auto`
    *
    * **Initial value**: `auto`
    */
  var WebkitColumnCount: js.UndefOr[ColumnCountProperty | js.Array[ColumnCountProperty]] = js.native
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Syntax**: `auto | balance | balance-all`
    *
    * **Initial value**: `balance`
    */
  var WebkitColumnFill: js.UndefOr[ColumnFillProperty | js.Array[ColumnFillProperty]] = js.native
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    */
  var WebkitColumnGap: js.UndefOr[ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]] = js.native
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitColumnRuleColor: js.UndefOr[ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]] = js.native
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var WebkitColumnRuleStyle: js.UndefOr[ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]] = js.native
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var WebkitColumnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]] = js.native
  
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Syntax**: `none | all`
    *
    * **Initial value**: `none`
    */
  var WebkitColumnSpan: js.UndefOr[ColumnSpanProperty | js.Array[ColumnSpanProperty]] = js.native
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Syntax**: `<length> | auto`
    *
    * **Initial value**: `auto`
    */
  var WebkitColumnWidth: js.UndefOr[ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]] = js.native
  
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    */
  var WebkitFilter: js.UndefOr[FilterProperty | js.Array[FilterProperty]] = js.native
  
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
    *
    * **Syntax**: `content | <'width'>`
    *
    * **Initial value**: `auto`
    */
  var WebkitFlexBasis: js.UndefOr[FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]] = js.native
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Syntax**: `row | row-reverse | column | column-reverse`
    *
    * **Initial value**: `row`
    */
  var WebkitFlexDirection: js.UndefOr[FlexDirectionProperty | js.Array[FlexDirectionProperty]] = js.native
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    */
  var WebkitFlexGrow: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `1`
    */
  var WebkitFlexShrink: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Syntax**: `nowrap | wrap | wrap-reverse`
    *
    * **Initial value**: `nowrap`
    */
  var WebkitFlexWrap: js.UndefOr[FlexWrapProperty | js.Array[FlexWrapProperty]] = js.native
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Syntax**: `normal | <feature-tag-value>#`
    *
    * **Initial value**: `normal`
    */
  var WebkitFontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]] = js.native
  
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Syntax**: `auto | normal | none`
    *
    * **Initial value**: `auto`
    */
  var WebkitFontKerning: js.UndefOr[FontKerningProperty | js.Array[FontKerningProperty]] = js.native
  
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> ]`
    *
    * **Initial value**: `normal`
    */
  var WebkitFontVariantLigatures: js.UndefOr[FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]] = js.native
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var WebkitHyphens: js.UndefOr[HyphensProperty | js.Array[HyphensProperty]] = js.native
  
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Syntax**: `normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ]`
    *
    * **Initial value**: `normal`
    */
  var WebkitJustifyContent: js.UndefOr[JustifyContentProperty | js.Array[JustifyContentProperty]] = js.native
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    */
  var WebkitLineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  
  /**
    * The **`-webkit-line-clamp`** CSS property allows limiting of the contents of a block container to the specified number of lines.
    *
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var WebkitLineClamp: js.UndefOr[WebkitLineClampProperty | js.Array[WebkitLineClampProperty]] = js.native
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var WebkitMarginEnd: js.UndefOr[MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var WebkitMarginStart: js.UndefOr[
    MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * If a `-webkit-mask-image` is specified, `-webkit-mask-attachment` determines whether the mask image's position is fixed within the viewport, or scrolls along with its containing block.
    *
    * **Syntax**: `<attachment>#`
    *
    * **Initial value**: `scroll`
    */
  var WebkitMaskAttachment: js.UndefOr[WebkitMaskAttachmentProperty | js.Array[WebkitMaskAttachmentProperty]] = js.native
  
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Syntax**: `[ <box> | border | padding | content | text ]#`
    *
    * **Initial value**: `border`
    */
  var WebkitMaskClip: js.UndefOr[WebkitMaskClipProperty | js.Array[WebkitMaskClipProperty]] = js.native
  
  /**
    * The **`-webkit-mask-composite`** property specifies the manner in which multiple mask images applied to the same element are composited with one another. Mask images are composited in the opposite order that they are declared with the `-webkit-mask-image` property.
    *
    * **Syntax**: `<composite-style>#`
    *
    * **Initial value**: `source-over`
    */
  var WebkitMaskComposite: js.UndefOr[WebkitMaskCompositeProperty | js.Array[WebkitMaskCompositeProperty]] = js.native
  
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Syntax**: `<mask-reference>#`
    *
    * **Initial value**: `none`
    */
  var WebkitMaskImage: js.UndefOr[WebkitMaskImageProperty | js.Array[WebkitMaskImageProperty]] = js.native
  
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Syntax**: `[ <box> | border | padding | content ]#`
    *
    * **Initial value**: `padding`
    */
  var WebkitMaskOrigin: js.UndefOr[WebkitMaskOriginProperty | js.Array[WebkitMaskOriginProperty]] = js.native
  
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Syntax**: `<position>#`
    *
    * **Initial value**: `0% 0%`
    */
  var WebkitMaskPosition: js.UndefOr[
    WebkitMaskPositionProperty[TLength] | js.Array[WebkitMaskPositionProperty[TLength]]
  ] = js.native
  
  /**
    * The `-webkit-mask-position-x` CSS property sets the initial horizontal position of a mask image.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right ]#`
    *
    * **Initial value**: `0%`
    */
  var WebkitMaskPositionX: js.UndefOr[
    WebkitMaskPositionXProperty[TLength] | js.Array[WebkitMaskPositionXProperty[TLength]]
  ] = js.native
  
  /**
    * The `-webkit-mask-position-y` CSS property sets the initial vertical position of a mask image.
    *
    * **Syntax**: `[ <length-percentage> | top | center | bottom ]#`
    *
    * **Initial value**: `0%`
    */
  var WebkitMaskPositionY: js.UndefOr[
    WebkitMaskPositionYProperty[TLength] | js.Array[WebkitMaskPositionYProperty[TLength]]
  ] = js.native
  
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Syntax**: `<repeat-style>#`
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeat: js.UndefOr[WebkitMaskRepeatProperty | js.Array[WebkitMaskRepeatProperty]] = js.native
  
  /**
    * The `-webkit-mask-repeat-x` property specifies whether and how a mask image is repeated (tiled) horizontally.
    *
    * **Syntax**: `repeat | no-repeat | space | round`
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeatX: js.UndefOr[WebkitMaskRepeatXProperty | js.Array[WebkitMaskRepeatXProperty]] = js.native
  
  /**
    * The `-webkit-mask-repeat-y` property sets whether and how a mask image is repeated (tiled) vertically.
    *
    * **Syntax**: `repeat | no-repeat | space | round`
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeatY: js.UndefOr[WebkitMaskRepeatYProperty | js.Array[WebkitMaskRepeatYProperty]] = js.native
  
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    */
  var WebkitMaskSize: js.UndefOr[WebkitMaskSizeProperty[TLength] | js.Array[WebkitMaskSizeProperty[TLength]]] = js.native
  
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Syntax**: `<'max-width'>`
    *
    * **Initial value**: `0`
    */
  var WebkitMaxInlineSize: js.UndefOr[MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]] = js.native
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `0`
    */
  var WebkitOrder: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The `-webkit-overflow-scrolling` CSS property controls whether or not touch devices use momentum-based scrolling for a given element.
    *
    * **Syntax**: `auto | touch`
    *
    * **Initial value**: `auto`
    */
  var WebkitOverflowScrolling: js.UndefOr[WebkitOverflowScrollingProperty | js.Array[WebkitOverflowScrollingProperty]] = js.native
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var WebkitPaddingEnd: js.UndefOr[PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var WebkitPaddingStart: js.UndefOr[
    PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Syntax**: `none | <length>`
    *
    * **Initial value**: `none`
    */
  var WebkitPerspective: js.UndefOr[PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]] = js.native
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var WebkitPerspectiveOrigin: js.UndefOr[
    PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]
  ] = js.native
  
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Syntax**: `economy | exact`
    *
    * **Initial value**: `economy`
    */
  var WebkitPrintColorAdjust: js.UndefOr[ColorAdjustProperty | js.Array[ColorAdjustProperty]] = js.native
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Syntax**: `none | [ x | y | block | inline | both ] [ mandatory | proximity ]?`
    *
    * **Initial value**: `none`
    */
  var WebkitScrollSnapType: js.UndefOr[ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]] = js.native
  
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    */
  var WebkitShapeMargin: js.UndefOr[ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]] = js.native
  
  /**
    * **`-webkit-tap-highlight-color`** is a non-standard CSS property that sets the color of the highlight that appears over a link while it's being tapped. The highlighting indicates to the user that their tap is being successfully recognized, and indicates which element they're tapping on.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `black`
    */
  var WebkitTapHighlightColor: js.UndefOr[WebkitTapHighlightColorProperty | js.Array[WebkitTapHighlightColorProperty]] = js.native
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    */
  var WebkitTextCombine: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextDecorationColor: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    */
  var WebkitTextDecorationLine: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
  
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Syntax**: `none | [ objects || [ spaces | [ leading-spaces || trailing-spaces ] ] || edges || box-decoration ]`
    *
    * **Initial value**: `objects`
    */
  var WebkitTextDecorationSkip: js.UndefOr[TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]] = js.native
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    */
  var WebkitTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
  
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextEmphasisColor: js.UndefOr[TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]] = js.native
  
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Syntax**: `[ over | under ] && [ right | left ]`
    *
    * **Initial value**: `over right`
    */
  var WebkitTextEmphasisPosition: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Syntax**: `none | [ [ filled | open ] || [ dot | circle | double-circle | triangle | sesame ] ] | <string>`
    *
    * **Initial value**: `none`
    */
  var WebkitTextEmphasisStyle: js.UndefOr[TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]] = js.native
  
  /**
    * The **`-webkit-text-fill-color`** CSS property specifies the fill color of characters of text. If this property is not set, the value of the `color` property is used.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextFillColor: js.UndefOr[WebkitTextFillColorProperty | js.Array[WebkitTextFillColorProperty]] = js.native
  
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Syntax**: `mixed | upright | sideways`
    *
    * **Initial value**: `mixed`
    */
  var WebkitTextOrientation: js.UndefOr[TextOrientationProperty | js.Array[TextOrientationProperty]] = js.native
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Syntax**: `none | auto | <percentage>`
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    */
  var WebkitTextSizeAdjust: js.UndefOr[TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]] = js.native
  
  /**
    * The **`-webkit-text-stroke-color`** CSS property specifies the stroke color of characters of text. If this property is not set, the value of the `color` property is used.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextStrokeColor: js.UndefOr[WebkitTextStrokeColorProperty | js.Array[WebkitTextStrokeColorProperty]] = js.native
  
  /**
    * The **`-webkit-text-stroke-width`** CSS property specifies the width of the stroke for text.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var WebkitTextStrokeWidth: js.UndefOr[
    WebkitTextStrokeWidthProperty[TLength] | js.Array[WebkitTextStrokeWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Syntax**: `auto | from-font | [ under || [ left | right ] ]`
    *
    * **Initial value**: `auto`
    */
  var WebkitTextUnderlinePosition: js.UndefOr[TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]] = js.native
  
  /**
    * The `-webkit-touch-callout` CSS property controls the display of the default callout shown when you touch and hold a touch target.
    *
    * **Syntax**: `default | none`
    *
    * **Initial value**: `default`
    */
  var WebkitTouchCallout: js.UndefOr[WebkitTouchCalloutProperty | js.Array[WebkitTouchCalloutProperty]] = js.native
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    */
  var WebkitTransform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var WebkitTransformOrigin: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.native
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Syntax**: `flat | preserve-3d`
    *
    * **Initial value**: `flat`
    */
  var WebkitTransformStyle: js.UndefOr[TransformStyleProperty | js.Array[TransformStyleProperty]] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var WebkitTransitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var WebkitTransitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var WebkitTransitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var WebkitTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  
  /**
    * **Syntax**: `read-only | read-write | read-write-plaintext-only`
    *
    * **Initial value**: `read-only`
    */
  var WebkitUserModify: js.UndefOr[WebkitUserModifyProperty | js.Array[WebkitUserModifyProperty]] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    */
  var WebkitUserSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
    *
    * **Initial value**: `horizontal-tb`
    */
  var WebkitWritingMode: js.UndefOr[WritingModeProperty | js.Array[WritingModeProperty]] = js.native
  
  /**
    * The **`-ms-accelerator`** CSS property is a Microsoft extension that sets or retrieves a string indicating whether the object represents a keyboard shortcut.
    *
    * **Syntax**: `false | true`
    *
    * **Initial value**: `false`
    */
  var msAccelerator: js.UndefOr[MsAcceleratorProperty | js.Array[MsAcceleratorProperty]] = js.native
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
    *
    * **Initial value**: `auto`
    */
  var msAlignSelf: js.UndefOr[AlignSelfProperty | js.Array[AlignSelfProperty]] = js.native
  
  /**
    * The **`-ms-block-progression`** CSS property is a Microsoft extension that specifies the block progression and layout orientation.
    *
    * **Syntax**: `tb | rl | bt | lr`
    *
    * **Initial value**: `tb`
    */
  var msBlockProgression: js.UndefOr[MsBlockProgressionProperty | js.Array[MsBlockProgressionProperty]] = js.native
  
  /**
    * The **`-ms-content-zoom-chaining`** CSS property is a Microsoft extension specifying the zoom behavior that occurs when a user hits the zoom limit during page manipulation.
    *
    * **Syntax**: `none | chained`
    *
    * **Initial value**: `none`
    */
  var msContentZoomChaining: js.UndefOr[MsContentZoomChainingProperty | js.Array[MsContentZoomChainingProperty]] = js.native
  
  /**
    * The **`-ms-content-zoom-limit-max`** CSS property is a Microsoft extension that specifies the selected elements' maximum zoom factor.
    *
    * **Syntax**: `<percentage>`
    *
    * **Initial value**: `400%`
    */
  var msContentZoomLimitMax: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`-ms-content-zoom-limit-min`** CSS property is a Microsoft extension that specifies the minimum zoom factor.
    *
    * **Syntax**: `<percentage>`
    *
    * **Initial value**: `100%`
    */
  var msContentZoomLimitMin: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`-ms-content-zoom-snap-points`** CSS property is a Microsoft extension that specifies where zoom snap-points are located.
    *
    * **Syntax**: `snapInterval( <percentage>, <percentage> ) | snapList( <percentage># )`
    *
    * **Initial value**: `snapInterval(0%, 100%)`
    */
  var msContentZoomSnapPoints: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`-ms-content-zoom-snap-type`** CSS property is a Microsoft extension that specifies how zooming is affected by defined snap-points.
    *
    * **Syntax**: `none | proximity | mandatory`
    *
    * **Initial value**: `none`
    */
  var msContentZoomSnapType: js.UndefOr[MsContentZoomSnapTypeProperty | js.Array[MsContentZoomSnapTypeProperty]] = js.native
  
  /**
    * The **`-ms-content-zooming`** CSS property is a Microsoft extension that specifies whether zooming is enabled.
    *
    * **Syntax**: `none | zoom`
    *
    * **Initial value**: zoom for the top level element, none for all other elements
    */
  var msContentZooming: js.UndefOr[MsContentZoomingProperty | js.Array[MsContentZoomingProperty]] = js.native
  
  /**
    * The `-ms-filter` CSS property is a Microsoft extension that sets or retrieves the filter or collection of filters applied to an object.
    *
    * **Syntax**: `<string>`
    *
    * **Initial value**: "" (the empty string)
    */
  var msFilter: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Syntax**: `row | row-reverse | column | column-reverse`
    *
    * **Initial value**: `row`
    */
  var msFlexDirection: js.UndefOr[FlexDirectionProperty | js.Array[FlexDirectionProperty]] = js.native
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    */
  var msFlexPositive: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`-ms-flow-from`** CSS property is a Microsoft extension that gets or sets a value identifying a region container in the document that accepts the content flow from the data source.
    *
    * **Syntax**: `[ none | <custom-ident> ]#`
    *
    * **Initial value**: `none`
    */
  var msFlowFrom: js.UndefOr[MsFlowFromProperty | js.Array[MsFlowFromProperty]] = js.native
  
  /**
    * The **`-ms-flow-into`** CSS property is a Microsoft extension that gets or sets a value identifying an iframe container in the document that serves as the region's data source.
    *
    * **Syntax**: `[ none | <custom-ident> ]#`
    *
    * **Initial value**: `none`
    */
  var msFlowInto: js.UndefOr[MsFlowIntoProperty | js.Array[MsFlowIntoProperty]] = js.native
  
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track.
    *
    * **Syntax**: `<track-size>+`
    *
    * **Initial value**: `auto`
    */
  var msGridColumns: js.UndefOr[GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]] = js.native
  
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track.
    *
    * **Syntax**: `<track-size>+`
    *
    * **Initial value**: `auto`
    */
  var msGridRows: js.UndefOr[GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]] = js.native
  
  /**
    * The **`-ms-high-contrast-adjust`** CSS property is a Microsoft extension that gets or sets a value indicating whether to override any CSS properties that would have been set in high contrast mode.
    *
    * **Syntax**: `auto | none`
    *
    * **Initial value**: `auto`
    */
  var msHighContrastAdjust: js.UndefOr[MsHighContrastAdjustProperty | js.Array[MsHighContrastAdjustProperty]] = js.native
  
  /**
    * The **`-ms-hyphenate-limit-chars`** CSS property is a Microsoft extension that specifies one to three values indicating the minimum number of characters in a hyphenated word. If the word does not meet the required minimum number of characters in the word, before the hyphen, or after the hyphen, then the word is not hyphenated.
    *
    * **Syntax**: `auto | <integer>{1,3}`
    *
    * **Initial value**: `auto`
    */
  var msHyphenateLimitChars: js.UndefOr[MsHyphenateLimitCharsProperty | js.Array[MsHyphenateLimitCharsProperty]] = js.native
  
  /**
    * The **`-ms-hyphenate-limit-lines`** CSS property is a Microsoft extension specifying the maximum number of consecutive lines in an element that may be ended with a hyphenated word.
    *
    * **Syntax**: `no-limit | <integer>`
    *
    * **Initial value**: `no-limit`
    */
  var msHyphenateLimitLines: js.UndefOr[MsHyphenateLimitLinesProperty | js.Array[MsHyphenateLimitLinesProperty]] = js.native
  
  /**
    * The `**-ms-hyphenate-limit-zone**` CSS property is a Microsoft extension specifying the width of the hyphenation zone.
    *
    * **Syntax**: `<percentage> | <length>`
    *
    * **Initial value**: `0`
    */
  var msHyphenateLimitZone: js.UndefOr[
    MsHyphenateLimitZoneProperty[TLength] | js.Array[MsHyphenateLimitZoneProperty[TLength]]
  ] = js.native
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var msHyphens: js.UndefOr[HyphensProperty | js.Array[HyphensProperty]] = js.native
  
  /**
    * The **`-ms-ime-align`** CSS property is a Microsoft extension aligning the Input Method Editor (IME) candidate window box relative to the element on which the IME composition is active. The extension is implemented in Microsoft Edge and Internet Explorer 11.
    *
    * **Syntax**: `auto | after`
    *
    * **Initial value**: `auto`
    */
  var msImeAlign: js.UndefOr[MsImeAlignProperty | js.Array[MsImeAlignProperty]] = js.native
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    */
  var msLineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `0`
    */
  var msOrder: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`-ms-overflow-style`** CSS property is a Microsoft extension controlling the behavior of scrollbars when the content of an element overflows.
    *
    * **Syntax**: `auto | none | scrollbar | -ms-autohiding-scrollbar`
    *
    * **Initial value**: `auto`
    */
  var msOverflowStyle: js.UndefOr[MsOverflowStyleProperty | js.Array[MsOverflowStyleProperty]] = js.native
  
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    */
  var msOverflowX: js.UndefOr[OverflowXProperty | js.Array[OverflowXProperty]] = js.native
  
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    */
  var msOverflowY: js.UndefOr[OverflowYProperty | js.Array[OverflowYProperty]] = js.native
  
  /**
    * The `**-ms-scroll-chaining**` CSS property is a Microsoft extension that specifies the scrolling behavior that occurs when a user hits the scroll limit during a manipulation.
    *
    * **Syntax**: `chained | none`
    *
    * **Initial value**: `chained`
    */
  var msScrollChaining: js.UndefOr[MsScrollChainingProperty | js.Array[MsScrollChainingProperty]] = js.native
  
  /**
    * The `**-ms-scroll-limit-x-max**` CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollLeft` property.
    *
    * **Syntax**: `auto | <length>`
    *
    * **Initial value**: `auto`
    */
  var msScrollLimitXMax: js.UndefOr[
    MsScrollLimitXMaxProperty[TLength] | js.Array[MsScrollLimitXMaxProperty[TLength]]
  ] = js.native
  
  /**
    * The **`-ms-scroll-limit-x-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollLeft` property.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var msScrollLimitXMin: js.UndefOr[
    MsScrollLimitXMinProperty[TLength] | js.Array[MsScrollLimitXMinProperty[TLength]]
  ] = js.native
  
  /**
    * The **`-ms-scroll-limit-y-max`** CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollTop` property.
    *
    * **Syntax**: `auto | <length>`
    *
    * **Initial value**: `auto`
    */
  var msScrollLimitYMax: js.UndefOr[
    MsScrollLimitYMaxProperty[TLength] | js.Array[MsScrollLimitYMaxProperty[TLength]]
  ] = js.native
  
  /**
    * The **`-ms-scroll-limit-y-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollTop` property.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var msScrollLimitYMin: js.UndefOr[
    MsScrollLimitYMinProperty[TLength] | js.Array[MsScrollLimitYMinProperty[TLength]]
  ] = js.native
  
  /**
    * The **`-ms-scroll-rails`** CSS property is a Microsoft extension that specifies whether scrolling locks to the primary axis of motion.
    *
    * **Syntax**: `none | railed`
    *
    * **Initial value**: `railed`
    */
  var msScrollRails: js.UndefOr[MsScrollRailsProperty | js.Array[MsScrollRailsProperty]] = js.native
  
  /**
    * The **`-ms-scroll-snap-points-x`** CSS property is a Microsoft extension that specifies where snap-points will be located along the x-axis.
    *
    * **Syntax**: `snapInterval( <length-percentage>, <length-percentage> ) | snapList( <length-percentage># )`
    *
    * **Initial value**: `snapInterval(0px, 100%)`
    */
  var msScrollSnapPointsX: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`-ms-scroll-snap-points-y`** CSS property is a Microsoft extension that specifies where snap-points will be located along the y-axis.
    *
    * **Syntax**: `snapInterval( <length-percentage>, <length-percentage> ) | snapList( <length-percentage># )`
    *
    * **Initial value**: `snapInterval(0px, 100%)`
    */
  var msScrollSnapPointsY: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Syntax**: `none | proximity | mandatory`
    *
    * **Initial value**: `none`
    */
  var msScrollSnapType: js.UndefOr[MsScrollSnapTypeProperty | js.Array[MsScrollSnapTypeProperty]] = js.native
  
  /**
    * The **`-ms-scroll-translation`** CSS property is a Microsoft extension that specifies whether vertical-to-horizontal scroll wheel translation occurs on the specified element.
    *
    * **Syntax**: `none | vertical-to-horizontal`
    *
    * **Initial value**: `none`
    */
  var msScrollTranslation: js.UndefOr[MsScrollTranslationProperty | js.Array[MsScrollTranslationProperty]] = js.native
  
  /**
    * The **`-ms-scrollbar-3dlight-color`** CSS property is a Microsoft extension specifying the color of the top and left edges of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: depends on user agent
    */
  var msScrollbar3dlightColor: js.UndefOr[MsScrollbar3dlightColorProperty | js.Array[MsScrollbar3dlightColorProperty]] = js.native
  
  /**
    * The **`-ms-scrollbar-arrow-color`** CSS property is a Microsoft extension that specifies the color of the arrow elements of a scroll arrow.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ButtonText`
    */
  var msScrollbarArrowColor: js.UndefOr[MsScrollbarArrowColorProperty | js.Array[MsScrollbarArrowColorProperty]] = js.native
  
  /**
    * The `**-ms-scrollbar-base-color**` CSS property is a Microsoft extension that specifies the base color of the main elements of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: depends on user agent
    */
  var msScrollbarBaseColor: js.UndefOr[MsScrollbarBaseColorProperty | js.Array[MsScrollbarBaseColorProperty]] = js.native
  
  /**
    * The **`-ms-scrollbar-darkshadow-color`** CSS property is a Microsoft extension that specifies the color of a scroll bar's gutter.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDDarkShadow`
    */
  var msScrollbarDarkshadowColor: js.UndefOr[
    MsScrollbarDarkshadowColorProperty | js.Array[MsScrollbarDarkshadowColorProperty]
  ] = js.native
  
  /**
    * The `**-ms-scrollbar-face-color**` CSS property is a Microsoft extension that specifies the color of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDFace`
    */
  var msScrollbarFaceColor: js.UndefOr[MsScrollbarFaceColorProperty | js.Array[MsScrollbarFaceColorProperty]] = js.native
  
  /**
    * The `**-ms-scrollbar-highlight-color**` CSS property is a Microsoft extension that specifies the color of the slider tray, the top and left edges of the scroll box, and the scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDHighlight`
    */
  var msScrollbarHighlightColor: js.UndefOr[MsScrollbarHighlightColorProperty | js.Array[MsScrollbarHighlightColorProperty]] = js.native
  
  /**
    * The **`-ms-scrollbar-shadow-color`** CSS property is a Microsoft extension that specifies the color of the bottom and right edges of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDDarkShadow`
    */
  var msScrollbarShadowColor: js.UndefOr[MsScrollbarShadowColorProperty | js.Array[MsScrollbarShadowColorProperty]] = js.native
  
  /**
    * The **`-ms-text-autospace`** CSS property is a Microsoft extension that specifies the autospacing and narrow space width adjustment of text.
    *
    * **Syntax**: `none | ideograph-alpha | ideograph-numeric | ideograph-parenthesis | ideograph-space`
    *
    * **Initial value**: `none`
    */
  var msTextAutospace: js.UndefOr[MsTextAutospaceProperty | js.Array[MsTextAutospaceProperty]] = js.native
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    */
  var msTextCombineHorizontal: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    */
  var msTextOverflow: js.UndefOr[TextOverflowProperty | js.Array[TextOverflowProperty]] = js.native
  
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Syntax**: `auto | none | [ [ pan-x | pan-left | pan-right ] || [ pan-y | pan-up | pan-down ] || pinch-zoom ] | manipulation`
    *
    * **Initial value**: `auto`
    */
  var msTouchAction: js.UndefOr[TouchActionProperty | js.Array[TouchActionProperty]] = js.native
  
  /**
    * The **`-ms-touch-select`** CSS property is a Microsoft extension that toggles the gripper visual elements that enable touch text selection.
    *
    * **Syntax**: `grippers | none`
    *
    * **Initial value**: `grippers`
    */
  var msTouchSelect: js.UndefOr[MsTouchSelectProperty | js.Array[MsTouchSelectProperty]] = js.native
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    */
  var msTransform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var msTransformOrigin: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var msTransitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var msTransitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var msTransitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var msTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `none | element | text`
    *
    * **Initial value**: `text`
    */
  var msUserSelect: js.UndefOr[MsUserSelectProperty | js.Array[MsUserSelectProperty]] = js.native
  
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Syntax**: `normal | break-all | keep-all | break-word`
    *
    * **Initial value**: `normal`
    */
  var msWordBreak: js.UndefOr[WordBreakProperty | js.Array[WordBreakProperty]] = js.native
  
  /**
    * The **`-ms-wrap-flow`** CSS property is a Microsoft extension that specifies how exclusions impact inline content within block-level elements.
    *
    * **Syntax**: `auto | both | start | end | maximum | clear`
    *
    * **Initial value**: `auto`
    */
  var msWrapFlow: js.UndefOr[MsWrapFlowProperty | js.Array[MsWrapFlowProperty]] = js.native
  
  /**
    * The **`-ms-wrap-margin`** CSS property is a Microsoft extension that specifies a margin that offsets the inner wrap shape from other shapes.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var msWrapMargin: js.UndefOr[MsWrapMarginProperty[TLength] | js.Array[MsWrapMarginProperty[TLength]]] = js.native
  
  /**
    * The **`-ms-wrap-through`** CSS property is a Microsoft extension that specifies how content should wrap around an exclusion element.
    *
    * **Syntax**: `wrap | none`
    *
    * **Initial value**: `wrap`
    */
  var msWrapThrough: js.UndefOr[MsWrapThroughProperty | js.Array[MsWrapThroughProperty]] = js.native
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
    *
    * **Initial value**: `horizontal-tb`
    */
  var msWritingMode: js.UndefOr[WritingModeProperty | js.Array[WritingModeProperty]] = js.native
}
object VendorLonghandPropertiesFallback {
  
  @scala.inline
  def apply[TLength](): VendorLonghandPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorLonghandPropertiesFallback[TLength]]
  }
  
  @scala.inline
  implicit class VendorLonghandPropertiesFallbackMutableBuilder[Self <: VendorLonghandPropertiesFallback[_], TLength] (val x: Self with VendorLonghandPropertiesFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def setMozAnimationDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "MozAnimationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationDelayUndefined: Self = StObject.set(x, "MozAnimationDelay", js.undefined)
    
    @scala.inline
    def setMozAnimationDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "MozAnimationDelay", js.Array(value :_*))
    
    @scala.inline
    def setMozAnimationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = StObject.set(x, "MozAnimationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationDirectionUndefined: Self = StObject.set(x, "MozAnimationDirection", js.undefined)
    
    @scala.inline
    def setMozAnimationDirectionVarargs(value: AnimationDirectionProperty*): Self = StObject.set(x, "MozAnimationDirection", js.Array(value :_*))
    
    @scala.inline
    def setMozAnimationDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "MozAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationDurationUndefined: Self = StObject.set(x, "MozAnimationDuration", js.undefined)
    
    @scala.inline
    def setMozAnimationDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "MozAnimationDuration", js.Array(value :_*))
    
    @scala.inline
    def setMozAnimationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = StObject.set(x, "MozAnimationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationFillModeUndefined: Self = StObject.set(x, "MozAnimationFillMode", js.undefined)
    
    @scala.inline
    def setMozAnimationFillModeVarargs(value: AnimationFillModeProperty*): Self = StObject.set(x, "MozAnimationFillMode", js.Array(value :_*))
    
    @scala.inline
    def setMozAnimationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = StObject.set(x, "MozAnimationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationIterationCountUndefined: Self = StObject.set(x, "MozAnimationIterationCount", js.undefined)
    
    @scala.inline
    def setMozAnimationIterationCountVarargs(value: AnimationIterationCountProperty*): Self = StObject.set(x, "MozAnimationIterationCount", js.Array(value :_*))
    
    @scala.inline
    def setMozAnimationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = StObject.set(x, "MozAnimationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationNameUndefined: Self = StObject.set(x, "MozAnimationName", js.undefined)
    
    @scala.inline
    def setMozAnimationNameVarargs(value: AnimationNameProperty*): Self = StObject.set(x, "MozAnimationName", js.Array(value :_*))
    
    @scala.inline
    def setMozAnimationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = StObject.set(x, "MozAnimationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationPlayStateUndefined: Self = StObject.set(x, "MozAnimationPlayState", js.undefined)
    
    @scala.inline
    def setMozAnimationPlayStateVarargs(value: AnimationPlayStateProperty*): Self = StObject.set(x, "MozAnimationPlayState", js.Array(value :_*))
    
    @scala.inline
    def setMozAnimationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = StObject.set(x, "MozAnimationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationTimingFunctionUndefined: Self = StObject.set(x, "MozAnimationTimingFunction", js.undefined)
    
    @scala.inline
    def setMozAnimationTimingFunctionVarargs(value: AnimationTimingFunctionProperty*): Self = StObject.set(x, "MozAnimationTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setMozAppearance(value: MozAppearanceProperty | js.Array[MozAppearanceProperty]): Self = StObject.set(x, "MozAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAppearanceUndefined: Self = StObject.set(x, "MozAppearance", js.undefined)
    
    @scala.inline
    def setMozAppearanceVarargs(value: MozAppearanceProperty*): Self = StObject.set(x, "MozAppearance", js.Array(value :_*))
    
    @scala.inline
    def setMozBackfaceVisibility(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): Self = StObject.set(x, "MozBackfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBackfaceVisibilityUndefined: Self = StObject.set(x, "MozBackfaceVisibility", js.undefined)
    
    @scala.inline
    def setMozBackfaceVisibilityVarargs(value: BackfaceVisibilityProperty*): Self = StObject.set(x, "MozBackfaceVisibility", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderBottomColors(value: MozBorderBottomColorsProperty | js.Array[MozBorderBottomColorsProperty]): Self = StObject.set(x, "MozBorderBottomColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderBottomColorsUndefined: Self = StObject.set(x, "MozBorderBottomColors", js.undefined)
    
    @scala.inline
    def setMozBorderBottomColorsVarargs(value: MozBorderBottomColorsProperty*): Self = StObject.set(x, "MozBorderBottomColors", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderEndColor(value: BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]): Self = StObject.set(x, "MozBorderEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderEndColorUndefined: Self = StObject.set(x, "MozBorderEndColor", js.undefined)
    
    @scala.inline
    def setMozBorderEndColorVarargs(value: BorderInlineEndColorProperty*): Self = StObject.set(x, "MozBorderEndColor", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderEndStyle(value: BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]): Self = StObject.set(x, "MozBorderEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderEndStyleUndefined: Self = StObject.set(x, "MozBorderEndStyle", js.undefined)
    
    @scala.inline
    def setMozBorderEndStyleVarargs(value: BorderInlineEndStyleProperty*): Self = StObject.set(x, "MozBorderEndStyle", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderEndWidth(value: BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]): Self = StObject.set(x, "MozBorderEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderEndWidthUndefined: Self = StObject.set(x, "MozBorderEndWidth", js.undefined)
    
    @scala.inline
    def setMozBorderEndWidthVarargs(value: BorderInlineEndWidthProperty[TLength]*): Self = StObject.set(x, "MozBorderEndWidth", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderLeftColors(value: MozBorderLeftColorsProperty | js.Array[MozBorderLeftColorsProperty]): Self = StObject.set(x, "MozBorderLeftColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderLeftColorsUndefined: Self = StObject.set(x, "MozBorderLeftColors", js.undefined)
    
    @scala.inline
    def setMozBorderLeftColorsVarargs(value: MozBorderLeftColorsProperty*): Self = StObject.set(x, "MozBorderLeftColors", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderRightColors(value: MozBorderRightColorsProperty | js.Array[MozBorderRightColorsProperty]): Self = StObject.set(x, "MozBorderRightColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderRightColorsUndefined: Self = StObject.set(x, "MozBorderRightColors", js.undefined)
    
    @scala.inline
    def setMozBorderRightColorsVarargs(value: MozBorderRightColorsProperty*): Self = StObject.set(x, "MozBorderRightColors", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderStartColor(value: BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]): Self = StObject.set(x, "MozBorderStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderStartColorUndefined: Self = StObject.set(x, "MozBorderStartColor", js.undefined)
    
    @scala.inline
    def setMozBorderStartColorVarargs(value: BorderInlineStartColorProperty*): Self = StObject.set(x, "MozBorderStartColor", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderStartStyle(value: BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]): Self = StObject.set(x, "MozBorderStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderStartStyleUndefined: Self = StObject.set(x, "MozBorderStartStyle", js.undefined)
    
    @scala.inline
    def setMozBorderStartStyleVarargs(value: BorderInlineStartStyleProperty*): Self = StObject.set(x, "MozBorderStartStyle", js.Array(value :_*))
    
    @scala.inline
    def setMozBorderTopColors(value: MozBorderTopColorsProperty | js.Array[MozBorderTopColorsProperty]): Self = StObject.set(x, "MozBorderTopColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderTopColorsUndefined: Self = StObject.set(x, "MozBorderTopColors", js.undefined)
    
    @scala.inline
    def setMozBorderTopColorsVarargs(value: MozBorderTopColorsProperty*): Self = StObject.set(x, "MozBorderTopColors", js.Array(value :_*))
    
    @scala.inline
    def setMozBoxSizing(value: BoxSizingProperty | js.Array[BoxSizingProperty]): Self = StObject.set(x, "MozBoxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBoxSizingUndefined: Self = StObject.set(x, "MozBoxSizing", js.undefined)
    
    @scala.inline
    def setMozBoxSizingVarargs(value: BoxSizingProperty*): Self = StObject.set(x, "MozBoxSizing", js.Array(value :_*))
    
    @scala.inline
    def setMozColumnCount(value: ColumnCountProperty | js.Array[ColumnCountProperty]): Self = StObject.set(x, "MozColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnCountUndefined: Self = StObject.set(x, "MozColumnCount", js.undefined)
    
    @scala.inline
    def setMozColumnCountVarargs(value: ColumnCountProperty*): Self = StObject.set(x, "MozColumnCount", js.Array(value :_*))
    
    @scala.inline
    def setMozColumnFill(value: ColumnFillProperty | js.Array[ColumnFillProperty]): Self = StObject.set(x, "MozColumnFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnFillUndefined: Self = StObject.set(x, "MozColumnFill", js.undefined)
    
    @scala.inline
    def setMozColumnFillVarargs(value: ColumnFillProperty*): Self = StObject.set(x, "MozColumnFill", js.Array(value :_*))
    
    @scala.inline
    def setMozColumnGap(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): Self = StObject.set(x, "MozColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnGapUndefined: Self = StObject.set(x, "MozColumnGap", js.undefined)
    
    @scala.inline
    def setMozColumnGapVarargs(value: ColumnGapProperty[TLength]*): Self = StObject.set(x, "MozColumnGap", js.Array(value :_*))
    
    @scala.inline
    def setMozColumnRuleColor(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): Self = StObject.set(x, "MozColumnRuleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnRuleColorUndefined: Self = StObject.set(x, "MozColumnRuleColor", js.undefined)
    
    @scala.inline
    def setMozColumnRuleColorVarargs(value: ColumnRuleColorProperty*): Self = StObject.set(x, "MozColumnRuleColor", js.Array(value :_*))
    
    @scala.inline
    def setMozColumnRuleStyle(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): Self = StObject.set(x, "MozColumnRuleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnRuleStyleUndefined: Self = StObject.set(x, "MozColumnRuleStyle", js.undefined)
    
    @scala.inline
    def setMozColumnRuleStyleVarargs(value: ColumnRuleStyleProperty*): Self = StObject.set(x, "MozColumnRuleStyle", js.Array(value :_*))
    
    @scala.inline
    def setMozColumnRuleWidth(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): Self = StObject.set(x, "MozColumnRuleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnRuleWidthUndefined: Self = StObject.set(x, "MozColumnRuleWidth", js.undefined)
    
    @scala.inline
    def setMozColumnRuleWidthVarargs(value: ColumnRuleWidthProperty[TLength]*): Self = StObject.set(x, "MozColumnRuleWidth", js.Array(value :_*))
    
    @scala.inline
    def setMozColumnWidth(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): Self = StObject.set(x, "MozColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnWidthUndefined: Self = StObject.set(x, "MozColumnWidth", js.undefined)
    
    @scala.inline
    def setMozColumnWidthVarargs(value: ColumnWidthProperty[TLength]*): Self = StObject.set(x, "MozColumnWidth", js.Array(value :_*))
    
    @scala.inline
    def setMozContextProperties(value: MozContextPropertiesProperty | js.Array[MozContextPropertiesProperty]): Self = StObject.set(x, "MozContextProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozContextPropertiesUndefined: Self = StObject.set(x, "MozContextProperties", js.undefined)
    
    @scala.inline
    def setMozContextPropertiesVarargs(value: MozContextPropertiesProperty*): Self = StObject.set(x, "MozContextProperties", js.Array(value :_*))
    
    @scala.inline
    def setMozFloatEdge(value: MozFloatEdgeProperty | js.Array[MozFloatEdgeProperty]): Self = StObject.set(x, "MozFloatEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozFloatEdgeUndefined: Self = StObject.set(x, "MozFloatEdge", js.undefined)
    
    @scala.inline
    def setMozFloatEdgeVarargs(value: MozFloatEdgeProperty*): Self = StObject.set(x, "MozFloatEdge", js.Array(value :_*))
    
    @scala.inline
    def setMozFontFeatureSettings(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): Self = StObject.set(x, "MozFontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozFontFeatureSettingsUndefined: Self = StObject.set(x, "MozFontFeatureSettings", js.undefined)
    
    @scala.inline
    def setMozFontFeatureSettingsVarargs(value: FontFeatureSettingsProperty*): Self = StObject.set(x, "MozFontFeatureSettings", js.Array(value :_*))
    
    @scala.inline
    def setMozFontLanguageOverride(value: FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]): Self = StObject.set(x, "MozFontLanguageOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozFontLanguageOverrideUndefined: Self = StObject.set(x, "MozFontLanguageOverride", js.undefined)
    
    @scala.inline
    def setMozFontLanguageOverrideVarargs(value: FontLanguageOverrideProperty*): Self = StObject.set(x, "MozFontLanguageOverride", js.Array(value :_*))
    
    @scala.inline
    def setMozForceBrokenImageIcon(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "MozForceBrokenImageIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozForceBrokenImageIconUndefined: Self = StObject.set(x, "MozForceBrokenImageIcon", js.undefined)
    
    @scala.inline
    def setMozForceBrokenImageIconVarargs(value: GlobalsNumber*): Self = StObject.set(x, "MozForceBrokenImageIcon", js.Array(value :_*))
    
    @scala.inline
    def setMozHyphens(value: HyphensProperty | js.Array[HyphensProperty]): Self = StObject.set(x, "MozHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozHyphensUndefined: Self = StObject.set(x, "MozHyphens", js.undefined)
    
    @scala.inline
    def setMozHyphensVarargs(value: HyphensProperty*): Self = StObject.set(x, "MozHyphens", js.Array(value :_*))
    
    @scala.inline
    def setMozImageRegion(value: MozImageRegionProperty | js.Array[MozImageRegionProperty]): Self = StObject.set(x, "MozImageRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozImageRegionUndefined: Self = StObject.set(x, "MozImageRegion", js.undefined)
    
    @scala.inline
    def setMozImageRegionVarargs(value: MozImageRegionProperty*): Self = StObject.set(x, "MozImageRegion", js.Array(value :_*))
    
    @scala.inline
    def setMozMarginEnd(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): Self = StObject.set(x, "MozMarginEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozMarginEndUndefined: Self = StObject.set(x, "MozMarginEnd", js.undefined)
    
    @scala.inline
    def setMozMarginEndVarargs(value: MarginInlineEndProperty[TLength]*): Self = StObject.set(x, "MozMarginEnd", js.Array(value :_*))
    
    @scala.inline
    def setMozMarginStart(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): Self = StObject.set(x, "MozMarginStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozMarginStartUndefined: Self = StObject.set(x, "MozMarginStart", js.undefined)
    
    @scala.inline
    def setMozMarginStartVarargs(value: MarginInlineStartProperty[TLength]*): Self = StObject.set(x, "MozMarginStart", js.Array(value :_*))
    
    @scala.inline
    def setMozOrient(value: MozOrientProperty | js.Array[MozOrientProperty]): Self = StObject.set(x, "MozOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozOrientUndefined: Self = StObject.set(x, "MozOrient", js.undefined)
    
    @scala.inline
    def setMozOrientVarargs(value: MozOrientProperty*): Self = StObject.set(x, "MozOrient", js.Array(value :_*))
    
    @scala.inline
    def setMozOutlineRadiusBottomleft(
      value: MozOutlineRadiusBottomleftProperty[TLength] | js.Array[MozOutlineRadiusBottomleftProperty[TLength]]
    ): Self = StObject.set(x, "MozOutlineRadiusBottomleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozOutlineRadiusBottomleftUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.undefined)
    
    @scala.inline
    def setMozOutlineRadiusBottomleftVarargs(value: MozOutlineRadiusBottomleftProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.Array(value :_*))
    
    @scala.inline
    def setMozOutlineRadiusBottomright(
      value: MozOutlineRadiusBottomrightProperty[TLength] | js.Array[MozOutlineRadiusBottomrightProperty[TLength]]
    ): Self = StObject.set(x, "MozOutlineRadiusBottomright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozOutlineRadiusBottomrightUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomright", js.undefined)
    
    @scala.inline
    def setMozOutlineRadiusBottomrightVarargs(value: MozOutlineRadiusBottomrightProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadiusBottomright", js.Array(value :_*))
    
    @scala.inline
    def setMozOutlineRadiusTopleft(
      value: MozOutlineRadiusTopleftProperty[TLength] | js.Array[MozOutlineRadiusTopleftProperty[TLength]]
    ): Self = StObject.set(x, "MozOutlineRadiusTopleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozOutlineRadiusTopleftUndefined: Self = StObject.set(x, "MozOutlineRadiusTopleft", js.undefined)
    
    @scala.inline
    def setMozOutlineRadiusTopleftVarargs(value: MozOutlineRadiusTopleftProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadiusTopleft", js.Array(value :_*))
    
    @scala.inline
    def setMozOutlineRadiusTopright(
      value: MozOutlineRadiusToprightProperty[TLength] | js.Array[MozOutlineRadiusToprightProperty[TLength]]
    ): Self = StObject.set(x, "MozOutlineRadiusTopright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozOutlineRadiusToprightUndefined: Self = StObject.set(x, "MozOutlineRadiusTopright", js.undefined)
    
    @scala.inline
    def setMozOutlineRadiusToprightVarargs(value: MozOutlineRadiusToprightProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadiusTopright", js.Array(value :_*))
    
    @scala.inline
    def setMozPaddingEnd(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): Self = StObject.set(x, "MozPaddingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozPaddingEndUndefined: Self = StObject.set(x, "MozPaddingEnd", js.undefined)
    
    @scala.inline
    def setMozPaddingEndVarargs(value: PaddingInlineEndProperty[TLength]*): Self = StObject.set(x, "MozPaddingEnd", js.Array(value :_*))
    
    @scala.inline
    def setMozPaddingStart(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): Self = StObject.set(x, "MozPaddingStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozPaddingStartUndefined: Self = StObject.set(x, "MozPaddingStart", js.undefined)
    
    @scala.inline
    def setMozPaddingStartVarargs(value: PaddingInlineStartProperty[TLength]*): Self = StObject.set(x, "MozPaddingStart", js.Array(value :_*))
    
    @scala.inline
    def setMozPerspective(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): Self = StObject.set(x, "MozPerspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozPerspectiveOrigin(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): Self = StObject.set(x, "MozPerspectiveOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozPerspectiveOriginUndefined: Self = StObject.set(x, "MozPerspectiveOrigin", js.undefined)
    
    @scala.inline
    def setMozPerspectiveOriginVarargs(value: PerspectiveOriginProperty[TLength]*): Self = StObject.set(x, "MozPerspectiveOrigin", js.Array(value :_*))
    
    @scala.inline
    def setMozPerspectiveUndefined: Self = StObject.set(x, "MozPerspective", js.undefined)
    
    @scala.inline
    def setMozPerspectiveVarargs(value: PerspectiveProperty[TLength]*): Self = StObject.set(x, "MozPerspective", js.Array(value :_*))
    
    @scala.inline
    def setMozStackSizing(value: MozStackSizingProperty | js.Array[MozStackSizingProperty]): Self = StObject.set(x, "MozStackSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozStackSizingUndefined: Self = StObject.set(x, "MozStackSizing", js.undefined)
    
    @scala.inline
    def setMozStackSizingVarargs(value: MozStackSizingProperty*): Self = StObject.set(x, "MozStackSizing", js.Array(value :_*))
    
    @scala.inline
    def setMozTabSize(value: TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]): Self = StObject.set(x, "MozTabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTabSizeUndefined: Self = StObject.set(x, "MozTabSize", js.undefined)
    
    @scala.inline
    def setMozTabSizeVarargs(value: TabSizeProperty[TLength]*): Self = StObject.set(x, "MozTabSize", js.Array(value :_*))
    
    @scala.inline
    def setMozTextBlink(value: MozTextBlinkProperty | js.Array[MozTextBlinkProperty]): Self = StObject.set(x, "MozTextBlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTextBlinkUndefined: Self = StObject.set(x, "MozTextBlink", js.undefined)
    
    @scala.inline
    def setMozTextBlinkVarargs(value: MozTextBlinkProperty*): Self = StObject.set(x, "MozTextBlink", js.Array(value :_*))
    
    @scala.inline
    def setMozTextSizeAdjust(value: TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]): Self = StObject.set(x, "MozTextSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTextSizeAdjustUndefined: Self = StObject.set(x, "MozTextSizeAdjust", js.undefined)
    
    @scala.inline
    def setMozTextSizeAdjustVarargs(value: TextSizeAdjustProperty*): Self = StObject.set(x, "MozTextSizeAdjust", js.Array(value :_*))
    
    @scala.inline
    def setMozTransformOrigin(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): Self = StObject.set(x, "MozTransformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTransformOriginUndefined: Self = StObject.set(x, "MozTransformOrigin", js.undefined)
    
    @scala.inline
    def setMozTransformOriginVarargs(value: TransformOriginProperty[TLength]*): Self = StObject.set(x, "MozTransformOrigin", js.Array(value :_*))
    
    @scala.inline
    def setMozTransformStyle(value: TransformStyleProperty | js.Array[TransformStyleProperty]): Self = StObject.set(x, "MozTransformStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTransformStyleUndefined: Self = StObject.set(x, "MozTransformStyle", js.undefined)
    
    @scala.inline
    def setMozTransformStyleVarargs(value: TransformStyleProperty*): Self = StObject.set(x, "MozTransformStyle", js.Array(value :_*))
    
    @scala.inline
    def setMozTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "MozTransitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTransitionDelayUndefined: Self = StObject.set(x, "MozTransitionDelay", js.undefined)
    
    @scala.inline
    def setMozTransitionDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "MozTransitionDelay", js.Array(value :_*))
    
    @scala.inline
    def setMozTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "MozTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTransitionDurationUndefined: Self = StObject.set(x, "MozTransitionDuration", js.undefined)
    
    @scala.inline
    def setMozTransitionDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "MozTransitionDuration", js.Array(value :_*))
    
    @scala.inline
    def setMozTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = StObject.set(x, "MozTransitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTransitionPropertyUndefined: Self = StObject.set(x, "MozTransitionProperty", js.undefined)
    
    @scala.inline
    def setMozTransitionPropertyVarargs(value: TransitionPropertyProperty*): Self = StObject.set(x, "MozTransitionProperty", js.Array(value :_*))
    
    @scala.inline
    def setMozTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = StObject.set(x, "MozTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTransitionTimingFunctionUndefined: Self = StObject.set(x, "MozTransitionTimingFunction", js.undefined)
    
    @scala.inline
    def setMozTransitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): Self = StObject.set(x, "MozTransitionTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setMozUserFocus(value: MozUserFocusProperty | js.Array[MozUserFocusProperty]): Self = StObject.set(x, "MozUserFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozUserFocusUndefined: Self = StObject.set(x, "MozUserFocus", js.undefined)
    
    @scala.inline
    def setMozUserFocusVarargs(value: MozUserFocusProperty*): Self = StObject.set(x, "MozUserFocus", js.Array(value :_*))
    
    @scala.inline
    def setMozUserModify(value: MozUserModifyProperty | js.Array[MozUserModifyProperty]): Self = StObject.set(x, "MozUserModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozUserModifyUndefined: Self = StObject.set(x, "MozUserModify", js.undefined)
    
    @scala.inline
    def setMozUserModifyVarargs(value: MozUserModifyProperty*): Self = StObject.set(x, "MozUserModify", js.Array(value :_*))
    
    @scala.inline
    def setMozUserSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = StObject.set(x, "MozUserSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozUserSelectUndefined: Self = StObject.set(x, "MozUserSelect", js.undefined)
    
    @scala.inline
    def setMozUserSelectVarargs(value: UserSelectProperty*): Self = StObject.set(x, "MozUserSelect", js.Array(value :_*))
    
    @scala.inline
    def setMozWindowDragging(value: MozWindowDraggingProperty | js.Array[MozWindowDraggingProperty]): Self = StObject.set(x, "MozWindowDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozWindowDraggingUndefined: Self = StObject.set(x, "MozWindowDragging", js.undefined)
    
    @scala.inline
    def setMozWindowDraggingVarargs(value: MozWindowDraggingProperty*): Self = StObject.set(x, "MozWindowDragging", js.Array(value :_*))
    
    @scala.inline
    def setMozWindowShadow(value: MozWindowShadowProperty | js.Array[MozWindowShadowProperty]): Self = StObject.set(x, "MozWindowShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozWindowShadowUndefined: Self = StObject.set(x, "MozWindowShadow", js.undefined)
    
    @scala.inline
    def setMozWindowShadowVarargs(value: MozWindowShadowProperty*): Self = StObject.set(x, "MozWindowShadow", js.Array(value :_*))
    
    @scala.inline
    def setMsAccelerator(value: MsAcceleratorProperty | js.Array[MsAcceleratorProperty]): Self = StObject.set(x, "msAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsAcceleratorUndefined: Self = StObject.set(x, "msAccelerator", js.undefined)
    
    @scala.inline
    def setMsAcceleratorVarargs(value: MsAcceleratorProperty*): Self = StObject.set(x, "msAccelerator", js.Array(value :_*))
    
    @scala.inline
    def setMsAlignSelf(value: AlignSelfProperty | js.Array[AlignSelfProperty]): Self = StObject.set(x, "msAlignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsAlignSelfUndefined: Self = StObject.set(x, "msAlignSelf", js.undefined)
    
    @scala.inline
    def setMsAlignSelfVarargs(value: AlignSelfProperty*): Self = StObject.set(x, "msAlignSelf", js.Array(value :_*))
    
    @scala.inline
    def setMsBlockProgression(value: MsBlockProgressionProperty | js.Array[MsBlockProgressionProperty]): Self = StObject.set(x, "msBlockProgression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsBlockProgressionUndefined: Self = StObject.set(x, "msBlockProgression", js.undefined)
    
    @scala.inline
    def setMsBlockProgressionVarargs(value: MsBlockProgressionProperty*): Self = StObject.set(x, "msBlockProgression", js.Array(value :_*))
    
    @scala.inline
    def setMsContentZoomChaining(value: MsContentZoomChainingProperty | js.Array[MsContentZoomChainingProperty]): Self = StObject.set(x, "msContentZoomChaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomChainingUndefined: Self = StObject.set(x, "msContentZoomChaining", js.undefined)
    
    @scala.inline
    def setMsContentZoomChainingVarargs(value: MsContentZoomChainingProperty*): Self = StObject.set(x, "msContentZoomChaining", js.Array(value :_*))
    
    @scala.inline
    def setMsContentZoomLimitMax(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "msContentZoomLimitMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomLimitMaxUndefined: Self = StObject.set(x, "msContentZoomLimitMax", js.undefined)
    
    @scala.inline
    def setMsContentZoomLimitMaxVarargs(value: GlobalsString*): Self = StObject.set(x, "msContentZoomLimitMax", js.Array(value :_*))
    
    @scala.inline
    def setMsContentZoomLimitMin(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "msContentZoomLimitMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomLimitMinUndefined: Self = StObject.set(x, "msContentZoomLimitMin", js.undefined)
    
    @scala.inline
    def setMsContentZoomLimitMinVarargs(value: GlobalsString*): Self = StObject.set(x, "msContentZoomLimitMin", js.Array(value :_*))
    
    @scala.inline
    def setMsContentZoomSnapPoints(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "msContentZoomSnapPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomSnapPointsUndefined: Self = StObject.set(x, "msContentZoomSnapPoints", js.undefined)
    
    @scala.inline
    def setMsContentZoomSnapPointsVarargs(value: GlobalsString*): Self = StObject.set(x, "msContentZoomSnapPoints", js.Array(value :_*))
    
    @scala.inline
    def setMsContentZoomSnapType(value: MsContentZoomSnapTypeProperty | js.Array[MsContentZoomSnapTypeProperty]): Self = StObject.set(x, "msContentZoomSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomSnapTypeUndefined: Self = StObject.set(x, "msContentZoomSnapType", js.undefined)
    
    @scala.inline
    def setMsContentZoomSnapTypeVarargs(value: MsContentZoomSnapTypeProperty*): Self = StObject.set(x, "msContentZoomSnapType", js.Array(value :_*))
    
    @scala.inline
    def setMsContentZooming(value: MsContentZoomingProperty | js.Array[MsContentZoomingProperty]): Self = StObject.set(x, "msContentZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomingUndefined: Self = StObject.set(x, "msContentZooming", js.undefined)
    
    @scala.inline
    def setMsContentZoomingVarargs(value: MsContentZoomingProperty*): Self = StObject.set(x, "msContentZooming", js.Array(value :_*))
    
    @scala.inline
    def setMsFilter(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "msFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsFilterUndefined: Self = StObject.set(x, "msFilter", js.undefined)
    
    @scala.inline
    def setMsFilterVarargs(value: GlobalsString*): Self = StObject.set(x, "msFilter", js.Array(value :_*))
    
    @scala.inline
    def setMsFlexDirection(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): Self = StObject.set(x, "msFlexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsFlexDirectionUndefined: Self = StObject.set(x, "msFlexDirection", js.undefined)
    
    @scala.inline
    def setMsFlexDirectionVarargs(value: FlexDirectionProperty*): Self = StObject.set(x, "msFlexDirection", js.Array(value :_*))
    
    @scala.inline
    def setMsFlexPositive(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "msFlexPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsFlexPositiveUndefined: Self = StObject.set(x, "msFlexPositive", js.undefined)
    
    @scala.inline
    def setMsFlexPositiveVarargs(value: GlobalsNumber*): Self = StObject.set(x, "msFlexPositive", js.Array(value :_*))
    
    @scala.inline
    def setMsFlowFrom(value: MsFlowFromProperty | js.Array[MsFlowFromProperty]): Self = StObject.set(x, "msFlowFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsFlowFromUndefined: Self = StObject.set(x, "msFlowFrom", js.undefined)
    
    @scala.inline
    def setMsFlowFromVarargs(value: MsFlowFromProperty*): Self = StObject.set(x, "msFlowFrom", js.Array(value :_*))
    
    @scala.inline
    def setMsFlowInto(value: MsFlowIntoProperty | js.Array[MsFlowIntoProperty]): Self = StObject.set(x, "msFlowInto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsFlowIntoUndefined: Self = StObject.set(x, "msFlowInto", js.undefined)
    
    @scala.inline
    def setMsFlowIntoVarargs(value: MsFlowIntoProperty*): Self = StObject.set(x, "msFlowInto", js.Array(value :_*))
    
    @scala.inline
    def setMsGridColumns(value: GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]): Self = StObject.set(x, "msGridColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsGridColumnsUndefined: Self = StObject.set(x, "msGridColumns", js.undefined)
    
    @scala.inline
    def setMsGridColumnsVarargs(value: GridAutoColumnsProperty[TLength]*): Self = StObject.set(x, "msGridColumns", js.Array(value :_*))
    
    @scala.inline
    def setMsGridRows(value: GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]): Self = StObject.set(x, "msGridRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsGridRowsUndefined: Self = StObject.set(x, "msGridRows", js.undefined)
    
    @scala.inline
    def setMsGridRowsVarargs(value: GridAutoRowsProperty[TLength]*): Self = StObject.set(x, "msGridRows", js.Array(value :_*))
    
    @scala.inline
    def setMsHighContrastAdjust(value: MsHighContrastAdjustProperty | js.Array[MsHighContrastAdjustProperty]): Self = StObject.set(x, "msHighContrastAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsHighContrastAdjustUndefined: Self = StObject.set(x, "msHighContrastAdjust", js.undefined)
    
    @scala.inline
    def setMsHighContrastAdjustVarargs(value: MsHighContrastAdjustProperty*): Self = StObject.set(x, "msHighContrastAdjust", js.Array(value :_*))
    
    @scala.inline
    def setMsHyphenateLimitChars(value: MsHyphenateLimitCharsProperty | js.Array[MsHyphenateLimitCharsProperty]): Self = StObject.set(x, "msHyphenateLimitChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsHyphenateLimitCharsUndefined: Self = StObject.set(x, "msHyphenateLimitChars", js.undefined)
    
    @scala.inline
    def setMsHyphenateLimitCharsVarargs(value: MsHyphenateLimitCharsProperty*): Self = StObject.set(x, "msHyphenateLimitChars", js.Array(value :_*))
    
    @scala.inline
    def setMsHyphenateLimitLines(value: MsHyphenateLimitLinesProperty | js.Array[MsHyphenateLimitLinesProperty]): Self = StObject.set(x, "msHyphenateLimitLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsHyphenateLimitLinesUndefined: Self = StObject.set(x, "msHyphenateLimitLines", js.undefined)
    
    @scala.inline
    def setMsHyphenateLimitLinesVarargs(value: MsHyphenateLimitLinesProperty*): Self = StObject.set(x, "msHyphenateLimitLines", js.Array(value :_*))
    
    @scala.inline
    def setMsHyphenateLimitZone(value: MsHyphenateLimitZoneProperty[TLength] | js.Array[MsHyphenateLimitZoneProperty[TLength]]): Self = StObject.set(x, "msHyphenateLimitZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsHyphenateLimitZoneUndefined: Self = StObject.set(x, "msHyphenateLimitZone", js.undefined)
    
    @scala.inline
    def setMsHyphenateLimitZoneVarargs(value: MsHyphenateLimitZoneProperty[TLength]*): Self = StObject.set(x, "msHyphenateLimitZone", js.Array(value :_*))
    
    @scala.inline
    def setMsHyphens(value: HyphensProperty | js.Array[HyphensProperty]): Self = StObject.set(x, "msHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsHyphensUndefined: Self = StObject.set(x, "msHyphens", js.undefined)
    
    @scala.inline
    def setMsHyphensVarargs(value: HyphensProperty*): Self = StObject.set(x, "msHyphens", js.Array(value :_*))
    
    @scala.inline
    def setMsImeAlign(value: MsImeAlignProperty | js.Array[MsImeAlignProperty]): Self = StObject.set(x, "msImeAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsImeAlignUndefined: Self = StObject.set(x, "msImeAlign", js.undefined)
    
    @scala.inline
    def setMsImeAlignVarargs(value: MsImeAlignProperty*): Self = StObject.set(x, "msImeAlign", js.Array(value :_*))
    
    @scala.inline
    def setMsLineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = StObject.set(x, "msLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsLineBreakUndefined: Self = StObject.set(x, "msLineBreak", js.undefined)
    
    @scala.inline
    def setMsLineBreakVarargs(value: LineBreakProperty*): Self = StObject.set(x, "msLineBreak", js.Array(value :_*))
    
    @scala.inline
    def setMsOrder(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "msOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsOrderUndefined: Self = StObject.set(x, "msOrder", js.undefined)
    
    @scala.inline
    def setMsOrderVarargs(value: GlobalsNumber*): Self = StObject.set(x, "msOrder", js.Array(value :_*))
    
    @scala.inline
    def setMsOverflowStyle(value: MsOverflowStyleProperty | js.Array[MsOverflowStyleProperty]): Self = StObject.set(x, "msOverflowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsOverflowStyleUndefined: Self = StObject.set(x, "msOverflowStyle", js.undefined)
    
    @scala.inline
    def setMsOverflowStyleVarargs(value: MsOverflowStyleProperty*): Self = StObject.set(x, "msOverflowStyle", js.Array(value :_*))
    
    @scala.inline
    def setMsOverflowX(value: OverflowXProperty | js.Array[OverflowXProperty]): Self = StObject.set(x, "msOverflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsOverflowXUndefined: Self = StObject.set(x, "msOverflowX", js.undefined)
    
    @scala.inline
    def setMsOverflowXVarargs(value: OverflowXProperty*): Self = StObject.set(x, "msOverflowX", js.Array(value :_*))
    
    @scala.inline
    def setMsOverflowY(value: OverflowYProperty | js.Array[OverflowYProperty]): Self = StObject.set(x, "msOverflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsOverflowYUndefined: Self = StObject.set(x, "msOverflowY", js.undefined)
    
    @scala.inline
    def setMsOverflowYVarargs(value: OverflowYProperty*): Self = StObject.set(x, "msOverflowY", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollChaining(value: MsScrollChainingProperty | js.Array[MsScrollChainingProperty]): Self = StObject.set(x, "msScrollChaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollChainingUndefined: Self = StObject.set(x, "msScrollChaining", js.undefined)
    
    @scala.inline
    def setMsScrollChainingVarargs(value: MsScrollChainingProperty*): Self = StObject.set(x, "msScrollChaining", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollLimitXMax(value: MsScrollLimitXMaxProperty[TLength] | js.Array[MsScrollLimitXMaxProperty[TLength]]): Self = StObject.set(x, "msScrollLimitXMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollLimitXMaxUndefined: Self = StObject.set(x, "msScrollLimitXMax", js.undefined)
    
    @scala.inline
    def setMsScrollLimitXMaxVarargs(value: MsScrollLimitXMaxProperty[TLength]*): Self = StObject.set(x, "msScrollLimitXMax", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollLimitXMin(value: MsScrollLimitXMinProperty[TLength] | js.Array[MsScrollLimitXMinProperty[TLength]]): Self = StObject.set(x, "msScrollLimitXMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollLimitXMinUndefined: Self = StObject.set(x, "msScrollLimitXMin", js.undefined)
    
    @scala.inline
    def setMsScrollLimitXMinVarargs(value: MsScrollLimitXMinProperty[TLength]*): Self = StObject.set(x, "msScrollLimitXMin", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollLimitYMax(value: MsScrollLimitYMaxProperty[TLength] | js.Array[MsScrollLimitYMaxProperty[TLength]]): Self = StObject.set(x, "msScrollLimitYMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollLimitYMaxUndefined: Self = StObject.set(x, "msScrollLimitYMax", js.undefined)
    
    @scala.inline
    def setMsScrollLimitYMaxVarargs(value: MsScrollLimitYMaxProperty[TLength]*): Self = StObject.set(x, "msScrollLimitYMax", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollLimitYMin(value: MsScrollLimitYMinProperty[TLength] | js.Array[MsScrollLimitYMinProperty[TLength]]): Self = StObject.set(x, "msScrollLimitYMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollLimitYMinUndefined: Self = StObject.set(x, "msScrollLimitYMin", js.undefined)
    
    @scala.inline
    def setMsScrollLimitYMinVarargs(value: MsScrollLimitYMinProperty[TLength]*): Self = StObject.set(x, "msScrollLimitYMin", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollRails(value: MsScrollRailsProperty | js.Array[MsScrollRailsProperty]): Self = StObject.set(x, "msScrollRails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollRailsUndefined: Self = StObject.set(x, "msScrollRails", js.undefined)
    
    @scala.inline
    def setMsScrollRailsVarargs(value: MsScrollRailsProperty*): Self = StObject.set(x, "msScrollRails", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollSnapPointsX(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "msScrollSnapPointsX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollSnapPointsXUndefined: Self = StObject.set(x, "msScrollSnapPointsX", js.undefined)
    
    @scala.inline
    def setMsScrollSnapPointsXVarargs(value: GlobalsString*): Self = StObject.set(x, "msScrollSnapPointsX", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollSnapPointsY(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "msScrollSnapPointsY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollSnapPointsYUndefined: Self = StObject.set(x, "msScrollSnapPointsY", js.undefined)
    
    @scala.inline
    def setMsScrollSnapPointsYVarargs(value: GlobalsString*): Self = StObject.set(x, "msScrollSnapPointsY", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollSnapType(value: MsScrollSnapTypeProperty | js.Array[MsScrollSnapTypeProperty]): Self = StObject.set(x, "msScrollSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollSnapTypeUndefined: Self = StObject.set(x, "msScrollSnapType", js.undefined)
    
    @scala.inline
    def setMsScrollSnapTypeVarargs(value: MsScrollSnapTypeProperty*): Self = StObject.set(x, "msScrollSnapType", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollTranslation(value: MsScrollTranslationProperty | js.Array[MsScrollTranslationProperty]): Self = StObject.set(x, "msScrollTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollTranslationUndefined: Self = StObject.set(x, "msScrollTranslation", js.undefined)
    
    @scala.inline
    def setMsScrollTranslationVarargs(value: MsScrollTranslationProperty*): Self = StObject.set(x, "msScrollTranslation", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollbar3dlightColor(value: MsScrollbar3dlightColorProperty | js.Array[MsScrollbar3dlightColorProperty]): Self = StObject.set(x, "msScrollbar3dlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollbar3dlightColorUndefined: Self = StObject.set(x, "msScrollbar3dlightColor", js.undefined)
    
    @scala.inline
    def setMsScrollbar3dlightColorVarargs(value: MsScrollbar3dlightColorProperty*): Self = StObject.set(x, "msScrollbar3dlightColor", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollbarArrowColor(value: MsScrollbarArrowColorProperty | js.Array[MsScrollbarArrowColorProperty]): Self = StObject.set(x, "msScrollbarArrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollbarArrowColorUndefined: Self = StObject.set(x, "msScrollbarArrowColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarArrowColorVarargs(value: MsScrollbarArrowColorProperty*): Self = StObject.set(x, "msScrollbarArrowColor", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollbarBaseColor(value: MsScrollbarBaseColorProperty | js.Array[MsScrollbarBaseColorProperty]): Self = StObject.set(x, "msScrollbarBaseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollbarBaseColorUndefined: Self = StObject.set(x, "msScrollbarBaseColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarBaseColorVarargs(value: MsScrollbarBaseColorProperty*): Self = StObject.set(x, "msScrollbarBaseColor", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollbarDarkshadowColor(value: MsScrollbarDarkshadowColorProperty | js.Array[MsScrollbarDarkshadowColorProperty]): Self = StObject.set(x, "msScrollbarDarkshadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollbarDarkshadowColorUndefined: Self = StObject.set(x, "msScrollbarDarkshadowColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarDarkshadowColorVarargs(value: MsScrollbarDarkshadowColorProperty*): Self = StObject.set(x, "msScrollbarDarkshadowColor", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollbarFaceColor(value: MsScrollbarFaceColorProperty | js.Array[MsScrollbarFaceColorProperty]): Self = StObject.set(x, "msScrollbarFaceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollbarFaceColorUndefined: Self = StObject.set(x, "msScrollbarFaceColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarFaceColorVarargs(value: MsScrollbarFaceColorProperty*): Self = StObject.set(x, "msScrollbarFaceColor", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollbarHighlightColor(value: MsScrollbarHighlightColorProperty | js.Array[MsScrollbarHighlightColorProperty]): Self = StObject.set(x, "msScrollbarHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollbarHighlightColorUndefined: Self = StObject.set(x, "msScrollbarHighlightColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarHighlightColorVarargs(value: MsScrollbarHighlightColorProperty*): Self = StObject.set(x, "msScrollbarHighlightColor", js.Array(value :_*))
    
    @scala.inline
    def setMsScrollbarShadowColor(value: MsScrollbarShadowColorProperty | js.Array[MsScrollbarShadowColorProperty]): Self = StObject.set(x, "msScrollbarShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollbarShadowColorUndefined: Self = StObject.set(x, "msScrollbarShadowColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarShadowColorVarargs(value: MsScrollbarShadowColorProperty*): Self = StObject.set(x, "msScrollbarShadowColor", js.Array(value :_*))
    
    @scala.inline
    def setMsTextAutospace(value: MsTextAutospaceProperty | js.Array[MsTextAutospaceProperty]): Self = StObject.set(x, "msTextAutospace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTextAutospaceUndefined: Self = StObject.set(x, "msTextAutospace", js.undefined)
    
    @scala.inline
    def setMsTextAutospaceVarargs(value: MsTextAutospaceProperty*): Self = StObject.set(x, "msTextAutospace", js.Array(value :_*))
    
    @scala.inline
    def setMsTextCombineHorizontal(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = StObject.set(x, "msTextCombineHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTextCombineHorizontalUndefined: Self = StObject.set(x, "msTextCombineHorizontal", js.undefined)
    
    @scala.inline
    def setMsTextCombineHorizontalVarargs(value: TextCombineUprightProperty*): Self = StObject.set(x, "msTextCombineHorizontal", js.Array(value :_*))
    
    @scala.inline
    def setMsTextOverflow(value: TextOverflowProperty | js.Array[TextOverflowProperty]): Self = StObject.set(x, "msTextOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTextOverflowUndefined: Self = StObject.set(x, "msTextOverflow", js.undefined)
    
    @scala.inline
    def setMsTextOverflowVarargs(value: TextOverflowProperty*): Self = StObject.set(x, "msTextOverflow", js.Array(value :_*))
    
    @scala.inline
    def setMsTouchAction(value: TouchActionProperty | js.Array[TouchActionProperty]): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTouchActionUndefined: Self = StObject.set(x, "msTouchAction", js.undefined)
    
    @scala.inline
    def setMsTouchActionVarargs(value: TouchActionProperty*): Self = StObject.set(x, "msTouchAction", js.Array(value :_*))
    
    @scala.inline
    def setMsTouchSelect(value: MsTouchSelectProperty | js.Array[MsTouchSelectProperty]): Self = StObject.set(x, "msTouchSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTouchSelectUndefined: Self = StObject.set(x, "msTouchSelect", js.undefined)
    
    @scala.inline
    def setMsTouchSelectVarargs(value: MsTouchSelectProperty*): Self = StObject.set(x, "msTouchSelect", js.Array(value :_*))
    
    @scala.inline
    def setMsTransform(value: TransformProperty | js.Array[TransformProperty]): Self = StObject.set(x, "msTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransformOrigin(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): Self = StObject.set(x, "msTransformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransformOriginUndefined: Self = StObject.set(x, "msTransformOrigin", js.undefined)
    
    @scala.inline
    def setMsTransformOriginVarargs(value: TransformOriginProperty[TLength]*): Self = StObject.set(x, "msTransformOrigin", js.Array(value :_*))
    
    @scala.inline
    def setMsTransformUndefined: Self = StObject.set(x, "msTransform", js.undefined)
    
    @scala.inline
    def setMsTransformVarargs(value: TransformProperty*): Self = StObject.set(x, "msTransform", js.Array(value :_*))
    
    @scala.inline
    def setMsTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "msTransitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransitionDelayUndefined: Self = StObject.set(x, "msTransitionDelay", js.undefined)
    
    @scala.inline
    def setMsTransitionDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "msTransitionDelay", js.Array(value :_*))
    
    @scala.inline
    def setMsTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "msTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransitionDurationUndefined: Self = StObject.set(x, "msTransitionDuration", js.undefined)
    
    @scala.inline
    def setMsTransitionDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "msTransitionDuration", js.Array(value :_*))
    
    @scala.inline
    def setMsTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = StObject.set(x, "msTransitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransitionPropertyUndefined: Self = StObject.set(x, "msTransitionProperty", js.undefined)
    
    @scala.inline
    def setMsTransitionPropertyVarargs(value: TransitionPropertyProperty*): Self = StObject.set(x, "msTransitionProperty", js.Array(value :_*))
    
    @scala.inline
    def setMsTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = StObject.set(x, "msTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransitionTimingFunctionUndefined: Self = StObject.set(x, "msTransitionTimingFunction", js.undefined)
    
    @scala.inline
    def setMsTransitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): Self = StObject.set(x, "msTransitionTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setMsUserSelect(value: MsUserSelectProperty | js.Array[MsUserSelectProperty]): Self = StObject.set(x, "msUserSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsUserSelectUndefined: Self = StObject.set(x, "msUserSelect", js.undefined)
    
    @scala.inline
    def setMsUserSelectVarargs(value: MsUserSelectProperty*): Self = StObject.set(x, "msUserSelect", js.Array(value :_*))
    
    @scala.inline
    def setMsWordBreak(value: WordBreakProperty | js.Array[WordBreakProperty]): Self = StObject.set(x, "msWordBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsWordBreakUndefined: Self = StObject.set(x, "msWordBreak", js.undefined)
    
    @scala.inline
    def setMsWordBreakVarargs(value: WordBreakProperty*): Self = StObject.set(x, "msWordBreak", js.Array(value :_*))
    
    @scala.inline
    def setMsWrapFlow(value: MsWrapFlowProperty | js.Array[MsWrapFlowProperty]): Self = StObject.set(x, "msWrapFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsWrapFlowUndefined: Self = StObject.set(x, "msWrapFlow", js.undefined)
    
    @scala.inline
    def setMsWrapFlowVarargs(value: MsWrapFlowProperty*): Self = StObject.set(x, "msWrapFlow", js.Array(value :_*))
    
    @scala.inline
    def setMsWrapMargin(value: MsWrapMarginProperty[TLength] | js.Array[MsWrapMarginProperty[TLength]]): Self = StObject.set(x, "msWrapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsWrapMarginUndefined: Self = StObject.set(x, "msWrapMargin", js.undefined)
    
    @scala.inline
    def setMsWrapMarginVarargs(value: MsWrapMarginProperty[TLength]*): Self = StObject.set(x, "msWrapMargin", js.Array(value :_*))
    
    @scala.inline
    def setMsWrapThrough(value: MsWrapThroughProperty | js.Array[MsWrapThroughProperty]): Self = StObject.set(x, "msWrapThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsWrapThroughUndefined: Self = StObject.set(x, "msWrapThrough", js.undefined)
    
    @scala.inline
    def setMsWrapThroughVarargs(value: MsWrapThroughProperty*): Self = StObject.set(x, "msWrapThrough", js.Array(value :_*))
    
    @scala.inline
    def setMsWritingMode(value: WritingModeProperty | js.Array[WritingModeProperty]): Self = StObject.set(x, "msWritingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsWritingModeUndefined: Self = StObject.set(x, "msWritingMode", js.undefined)
    
    @scala.inline
    def setMsWritingModeVarargs(value: WritingModeProperty*): Self = StObject.set(x, "msWritingMode", js.Array(value :_*))
    
    @scala.inline
    def setOObjectFit(value: ObjectFitProperty | js.Array[ObjectFitProperty]): Self = StObject.set(x, "OObjectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOObjectFitUndefined: Self = StObject.set(x, "OObjectFit", js.undefined)
    
    @scala.inline
    def setOObjectFitVarargs(value: ObjectFitProperty*): Self = StObject.set(x, "OObjectFit", js.Array(value :_*))
    
    @scala.inline
    def setOObjectPosition(value: ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]): Self = StObject.set(x, "OObjectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOObjectPositionUndefined: Self = StObject.set(x, "OObjectPosition", js.undefined)
    
    @scala.inline
    def setOObjectPositionVarargs(value: ObjectPositionProperty[TLength]*): Self = StObject.set(x, "OObjectPosition", js.Array(value :_*))
    
    @scala.inline
    def setOTabSize(value: TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]): Self = StObject.set(x, "OTabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTabSizeUndefined: Self = StObject.set(x, "OTabSize", js.undefined)
    
    @scala.inline
    def setOTabSizeVarargs(value: TabSizeProperty[TLength]*): Self = StObject.set(x, "OTabSize", js.Array(value :_*))
    
    @scala.inline
    def setOTextOverflow(value: TextOverflowProperty | js.Array[TextOverflowProperty]): Self = StObject.set(x, "OTextOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTextOverflowUndefined: Self = StObject.set(x, "OTextOverflow", js.undefined)
    
    @scala.inline
    def setOTextOverflowVarargs(value: TextOverflowProperty*): Self = StObject.set(x, "OTextOverflow", js.Array(value :_*))
    
    @scala.inline
    def setOTransformOrigin(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): Self = StObject.set(x, "OTransformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTransformOriginUndefined: Self = StObject.set(x, "OTransformOrigin", js.undefined)
    
    @scala.inline
    def setOTransformOriginVarargs(value: TransformOriginProperty[TLength]*): Self = StObject.set(x, "OTransformOrigin", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAlignContent(value: AlignContentProperty | js.Array[AlignContentProperty]): Self = StObject.set(x, "WebkitAlignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAlignContentUndefined: Self = StObject.set(x, "WebkitAlignContent", js.undefined)
    
    @scala.inline
    def setWebkitAlignContentVarargs(value: AlignContentProperty*): Self = StObject.set(x, "WebkitAlignContent", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAlignItems(value: AlignItemsProperty | js.Array[AlignItemsProperty]): Self = StObject.set(x, "WebkitAlignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAlignItemsUndefined: Self = StObject.set(x, "WebkitAlignItems", js.undefined)
    
    @scala.inline
    def setWebkitAlignItemsVarargs(value: AlignItemsProperty*): Self = StObject.set(x, "WebkitAlignItems", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAlignSelf(value: AlignSelfProperty | js.Array[AlignSelfProperty]): Self = StObject.set(x, "WebkitAlignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAlignSelfUndefined: Self = StObject.set(x, "WebkitAlignSelf", js.undefined)
    
    @scala.inline
    def setWebkitAlignSelfVarargs(value: AlignSelfProperty*): Self = StObject.set(x, "WebkitAlignSelf", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAnimationDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "WebkitAnimationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationDelayUndefined: Self = StObject.set(x, "WebkitAnimationDelay", js.undefined)
    
    @scala.inline
    def setWebkitAnimationDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "WebkitAnimationDelay", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAnimationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = StObject.set(x, "WebkitAnimationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationDirectionUndefined: Self = StObject.set(x, "WebkitAnimationDirection", js.undefined)
    
    @scala.inline
    def setWebkitAnimationDirectionVarargs(value: AnimationDirectionProperty*): Self = StObject.set(x, "WebkitAnimationDirection", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAnimationDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "WebkitAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationDurationUndefined: Self = StObject.set(x, "WebkitAnimationDuration", js.undefined)
    
    @scala.inline
    def setWebkitAnimationDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "WebkitAnimationDuration", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAnimationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = StObject.set(x, "WebkitAnimationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationFillModeUndefined: Self = StObject.set(x, "WebkitAnimationFillMode", js.undefined)
    
    @scala.inline
    def setWebkitAnimationFillModeVarargs(value: AnimationFillModeProperty*): Self = StObject.set(x, "WebkitAnimationFillMode", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAnimationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = StObject.set(x, "WebkitAnimationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationIterationCountUndefined: Self = StObject.set(x, "WebkitAnimationIterationCount", js.undefined)
    
    @scala.inline
    def setWebkitAnimationIterationCountVarargs(value: AnimationIterationCountProperty*): Self = StObject.set(x, "WebkitAnimationIterationCount", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAnimationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = StObject.set(x, "WebkitAnimationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationNameUndefined: Self = StObject.set(x, "WebkitAnimationName", js.undefined)
    
    @scala.inline
    def setWebkitAnimationNameVarargs(value: AnimationNameProperty*): Self = StObject.set(x, "WebkitAnimationName", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAnimationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = StObject.set(x, "WebkitAnimationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationPlayStateUndefined: Self = StObject.set(x, "WebkitAnimationPlayState", js.undefined)
    
    @scala.inline
    def setWebkitAnimationPlayStateVarargs(value: AnimationPlayStateProperty*): Self = StObject.set(x, "WebkitAnimationPlayState", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAnimationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = StObject.set(x, "WebkitAnimationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationTimingFunctionUndefined: Self = StObject.set(x, "WebkitAnimationTimingFunction", js.undefined)
    
    @scala.inline
    def setWebkitAnimationTimingFunctionVarargs(value: AnimationTimingFunctionProperty*): Self = StObject.set(x, "WebkitAnimationTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setWebkitAppearance(value: WebkitAppearanceProperty | js.Array[WebkitAppearanceProperty]): Self = StObject.set(x, "WebkitAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAppearanceUndefined: Self = StObject.set(x, "WebkitAppearance", js.undefined)
    
    @scala.inline
    def setWebkitAppearanceVarargs(value: WebkitAppearanceProperty*): Self = StObject.set(x, "WebkitAppearance", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBackdropFilter(value: BackdropFilterProperty | js.Array[BackdropFilterProperty]): Self = StObject.set(x, "WebkitBackdropFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBackdropFilterUndefined: Self = StObject.set(x, "WebkitBackdropFilter", js.undefined)
    
    @scala.inline
    def setWebkitBackdropFilterVarargs(value: BackdropFilterProperty*): Self = StObject.set(x, "WebkitBackdropFilter", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBackfaceVisibility(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): Self = StObject.set(x, "WebkitBackfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBackfaceVisibilityUndefined: Self = StObject.set(x, "WebkitBackfaceVisibility", js.undefined)
    
    @scala.inline
    def setWebkitBackfaceVisibilityVarargs(value: BackfaceVisibilityProperty*): Self = StObject.set(x, "WebkitBackfaceVisibility", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBackgroundClip(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self = StObject.set(x, "WebkitBackgroundClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBackgroundClipUndefined: Self = StObject.set(x, "WebkitBackgroundClip", js.undefined)
    
    @scala.inline
    def setWebkitBackgroundClipVarargs(value: BackgroundClipProperty*): Self = StObject.set(x, "WebkitBackgroundClip", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBackgroundOrigin(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self = StObject.set(x, "WebkitBackgroundOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBackgroundOriginUndefined: Self = StObject.set(x, "WebkitBackgroundOrigin", js.undefined)
    
    @scala.inline
    def setWebkitBackgroundOriginVarargs(value: BackgroundOriginProperty*): Self = StObject.set(x, "WebkitBackgroundOrigin", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = StObject.set(x, "WebkitBackgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBackgroundSizeUndefined: Self = StObject.set(x, "WebkitBackgroundSize", js.undefined)
    
    @scala.inline
    def setWebkitBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): Self = StObject.set(x, "WebkitBackgroundSize", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBorderBeforeColor(value: WebkitBorderBeforeColorProperty | js.Array[WebkitBorderBeforeColorProperty]): Self = StObject.set(x, "WebkitBorderBeforeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderBeforeColorUndefined: Self = StObject.set(x, "WebkitBorderBeforeColor", js.undefined)
    
    @scala.inline
    def setWebkitBorderBeforeColorVarargs(value: WebkitBorderBeforeColorProperty*): Self = StObject.set(x, "WebkitBorderBeforeColor", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBorderBeforeStyle(value: WebkitBorderBeforeStyleProperty | js.Array[WebkitBorderBeforeStyleProperty]): Self = StObject.set(x, "WebkitBorderBeforeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderBeforeStyleUndefined: Self = StObject.set(x, "WebkitBorderBeforeStyle", js.undefined)
    
    @scala.inline
    def setWebkitBorderBeforeStyleVarargs(value: WebkitBorderBeforeStyleProperty*): Self = StObject.set(x, "WebkitBorderBeforeStyle", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBorderBeforeWidth(
      value: WebkitBorderBeforeWidthProperty[TLength] | js.Array[WebkitBorderBeforeWidthProperty[TLength]]
    ): Self = StObject.set(x, "WebkitBorderBeforeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderBeforeWidthUndefined: Self = StObject.set(x, "WebkitBorderBeforeWidth", js.undefined)
    
    @scala.inline
    def setWebkitBorderBeforeWidthVarargs(value: WebkitBorderBeforeWidthProperty[TLength]*): Self = StObject.set(x, "WebkitBorderBeforeWidth", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBorderBottomLeftRadius(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self = StObject.set(x, "WebkitBorderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "WebkitBorderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setWebkitBorderBottomLeftRadiusVarargs(value: BorderBottomLeftRadiusProperty[TLength]*): Self = StObject.set(x, "WebkitBorderBottomLeftRadius", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBorderBottomRightRadius(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): Self = StObject.set(x, "WebkitBorderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderBottomRightRadiusUndefined: Self = StObject.set(x, "WebkitBorderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setWebkitBorderBottomRightRadiusVarargs(value: BorderBottomRightRadiusProperty[TLength]*): Self = StObject.set(x, "WebkitBorderBottomRightRadius", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBorderImageSlice(value: BorderImageSliceProperty | js.Array[BorderImageSliceProperty]): Self = StObject.set(x, "WebkitBorderImageSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderImageSliceUndefined: Self = StObject.set(x, "WebkitBorderImageSlice", js.undefined)
    
    @scala.inline
    def setWebkitBorderImageSliceVarargs(value: BorderImageSliceProperty*): Self = StObject.set(x, "WebkitBorderImageSlice", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBorderTopLeftRadius(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self = StObject.set(x, "WebkitBorderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderTopLeftRadiusUndefined: Self = StObject.set(x, "WebkitBorderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setWebkitBorderTopLeftRadiusVarargs(value: BorderTopLeftRadiusProperty[TLength]*): Self = StObject.set(x, "WebkitBorderTopLeftRadius", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBorderTopRightRadius(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self = StObject.set(x, "WebkitBorderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderTopRightRadiusUndefined: Self = StObject.set(x, "WebkitBorderTopRightRadius", js.undefined)
    
    @scala.inline
    def setWebkitBorderTopRightRadiusVarargs(value: BorderTopRightRadiusProperty[TLength]*): Self = StObject.set(x, "WebkitBorderTopRightRadius", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxDecorationBreak(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self = StObject.set(x, "WebkitBoxDecorationBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBoxDecorationBreakUndefined: Self = StObject.set(x, "WebkitBoxDecorationBreak", js.undefined)
    
    @scala.inline
    def setWebkitBoxDecorationBreakVarargs(value: BoxDecorationBreakProperty*): Self = StObject.set(x, "WebkitBoxDecorationBreak", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxReflect(value: WebkitBoxReflectProperty[TLength] | js.Array[WebkitBoxReflectProperty[TLength]]): Self = StObject.set(x, "WebkitBoxReflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBoxReflectUndefined: Self = StObject.set(x, "WebkitBoxReflect", js.undefined)
    
    @scala.inline
    def setWebkitBoxReflectVarargs(value: WebkitBoxReflectProperty[TLength]*): Self = StObject.set(x, "WebkitBoxReflect", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxShadow(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self = StObject.set(x, "WebkitBoxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBoxShadowUndefined: Self = StObject.set(x, "WebkitBoxShadow", js.undefined)
    
    @scala.inline
    def setWebkitBoxShadowVarargs(value: BoxShadowProperty*): Self = StObject.set(x, "WebkitBoxShadow", js.Array(value :_*))
    
    @scala.inline
    def setWebkitBoxSizing(value: BoxSizingProperty | js.Array[BoxSizingProperty]): Self = StObject.set(x, "WebkitBoxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBoxSizingUndefined: Self = StObject.set(x, "WebkitBoxSizing", js.undefined)
    
    @scala.inline
    def setWebkitBoxSizingVarargs(value: BoxSizingProperty*): Self = StObject.set(x, "WebkitBoxSizing", js.Array(value :_*))
    
    @scala.inline
    def setWebkitClipPath(value: ClipPathProperty | js.Array[ClipPathProperty]): Self = StObject.set(x, "WebkitClipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitClipPathUndefined: Self = StObject.set(x, "WebkitClipPath", js.undefined)
    
    @scala.inline
    def setWebkitClipPathVarargs(value: ClipPathProperty*): Self = StObject.set(x, "WebkitClipPath", js.Array(value :_*))
    
    @scala.inline
    def setWebkitColumnCount(value: ColumnCountProperty | js.Array[ColumnCountProperty]): Self = StObject.set(x, "WebkitColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnCountUndefined: Self = StObject.set(x, "WebkitColumnCount", js.undefined)
    
    @scala.inline
    def setWebkitColumnCountVarargs(value: ColumnCountProperty*): Self = StObject.set(x, "WebkitColumnCount", js.Array(value :_*))
    
    @scala.inline
    def setWebkitColumnFill(value: ColumnFillProperty | js.Array[ColumnFillProperty]): Self = StObject.set(x, "WebkitColumnFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnFillUndefined: Self = StObject.set(x, "WebkitColumnFill", js.undefined)
    
    @scala.inline
    def setWebkitColumnFillVarargs(value: ColumnFillProperty*): Self = StObject.set(x, "WebkitColumnFill", js.Array(value :_*))
    
    @scala.inline
    def setWebkitColumnGap(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): Self = StObject.set(x, "WebkitColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnGapUndefined: Self = StObject.set(x, "WebkitColumnGap", js.undefined)
    
    @scala.inline
    def setWebkitColumnGapVarargs(value: ColumnGapProperty[TLength]*): Self = StObject.set(x, "WebkitColumnGap", js.Array(value :_*))
    
    @scala.inline
    def setWebkitColumnRuleColor(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): Self = StObject.set(x, "WebkitColumnRuleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnRuleColorUndefined: Self = StObject.set(x, "WebkitColumnRuleColor", js.undefined)
    
    @scala.inline
    def setWebkitColumnRuleColorVarargs(value: ColumnRuleColorProperty*): Self = StObject.set(x, "WebkitColumnRuleColor", js.Array(value :_*))
    
    @scala.inline
    def setWebkitColumnRuleStyle(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): Self = StObject.set(x, "WebkitColumnRuleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnRuleStyleUndefined: Self = StObject.set(x, "WebkitColumnRuleStyle", js.undefined)
    
    @scala.inline
    def setWebkitColumnRuleStyleVarargs(value: ColumnRuleStyleProperty*): Self = StObject.set(x, "WebkitColumnRuleStyle", js.Array(value :_*))
    
    @scala.inline
    def setWebkitColumnRuleWidth(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): Self = StObject.set(x, "WebkitColumnRuleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnRuleWidthUndefined: Self = StObject.set(x, "WebkitColumnRuleWidth", js.undefined)
    
    @scala.inline
    def setWebkitColumnRuleWidthVarargs(value: ColumnRuleWidthProperty[TLength]*): Self = StObject.set(x, "WebkitColumnRuleWidth", js.Array(value :_*))
    
    @scala.inline
    def setWebkitColumnSpan(value: ColumnSpanProperty | js.Array[ColumnSpanProperty]): Self = StObject.set(x, "WebkitColumnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnSpanUndefined: Self = StObject.set(x, "WebkitColumnSpan", js.undefined)
    
    @scala.inline
    def setWebkitColumnSpanVarargs(value: ColumnSpanProperty*): Self = StObject.set(x, "WebkitColumnSpan", js.Array(value :_*))
    
    @scala.inline
    def setWebkitColumnWidth(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): Self = StObject.set(x, "WebkitColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnWidthUndefined: Self = StObject.set(x, "WebkitColumnWidth", js.undefined)
    
    @scala.inline
    def setWebkitColumnWidthVarargs(value: ColumnWidthProperty[TLength]*): Self = StObject.set(x, "WebkitColumnWidth", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFilter(value: FilterProperty | js.Array[FilterProperty]): Self = StObject.set(x, "WebkitFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFilterUndefined: Self = StObject.set(x, "WebkitFilter", js.undefined)
    
    @scala.inline
    def setWebkitFilterVarargs(value: FilterProperty*): Self = StObject.set(x, "WebkitFilter", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFlexBasis(value: FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]): Self = StObject.set(x, "WebkitFlexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexBasisUndefined: Self = StObject.set(x, "WebkitFlexBasis", js.undefined)
    
    @scala.inline
    def setWebkitFlexBasisVarargs(value: FlexBasisProperty[TLength]*): Self = StObject.set(x, "WebkitFlexBasis", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFlexDirection(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): Self = StObject.set(x, "WebkitFlexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexDirectionUndefined: Self = StObject.set(x, "WebkitFlexDirection", js.undefined)
    
    @scala.inline
    def setWebkitFlexDirectionVarargs(value: FlexDirectionProperty*): Self = StObject.set(x, "WebkitFlexDirection", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFlexGrow(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "WebkitFlexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexGrowUndefined: Self = StObject.set(x, "WebkitFlexGrow", js.undefined)
    
    @scala.inline
    def setWebkitFlexGrowVarargs(value: GlobalsNumber*): Self = StObject.set(x, "WebkitFlexGrow", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFlexShrink(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "WebkitFlexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexShrinkUndefined: Self = StObject.set(x, "WebkitFlexShrink", js.undefined)
    
    @scala.inline
    def setWebkitFlexShrinkVarargs(value: GlobalsNumber*): Self = StObject.set(x, "WebkitFlexShrink", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFlexWrap(value: FlexWrapProperty | js.Array[FlexWrapProperty]): Self = StObject.set(x, "WebkitFlexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexWrapUndefined: Self = StObject.set(x, "WebkitFlexWrap", js.undefined)
    
    @scala.inline
    def setWebkitFlexWrapVarargs(value: FlexWrapProperty*): Self = StObject.set(x, "WebkitFlexWrap", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFontFeatureSettings(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): Self = StObject.set(x, "WebkitFontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFontFeatureSettingsUndefined: Self = StObject.set(x, "WebkitFontFeatureSettings", js.undefined)
    
    @scala.inline
    def setWebkitFontFeatureSettingsVarargs(value: FontFeatureSettingsProperty*): Self = StObject.set(x, "WebkitFontFeatureSettings", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFontKerning(value: FontKerningProperty | js.Array[FontKerningProperty]): Self = StObject.set(x, "WebkitFontKerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFontKerningUndefined: Self = StObject.set(x, "WebkitFontKerning", js.undefined)
    
    @scala.inline
    def setWebkitFontKerningVarargs(value: FontKerningProperty*): Self = StObject.set(x, "WebkitFontKerning", js.Array(value :_*))
    
    @scala.inline
    def setWebkitFontVariantLigatures(value: FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]): Self = StObject.set(x, "WebkitFontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFontVariantLigaturesUndefined: Self = StObject.set(x, "WebkitFontVariantLigatures", js.undefined)
    
    @scala.inline
    def setWebkitFontVariantLigaturesVarargs(value: FontVariantLigaturesProperty*): Self = StObject.set(x, "WebkitFontVariantLigatures", js.Array(value :_*))
    
    @scala.inline
    def setWebkitHyphens(value: HyphensProperty | js.Array[HyphensProperty]): Self = StObject.set(x, "WebkitHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitHyphensUndefined: Self = StObject.set(x, "WebkitHyphens", js.undefined)
    
    @scala.inline
    def setWebkitHyphensVarargs(value: HyphensProperty*): Self = StObject.set(x, "WebkitHyphens", js.Array(value :_*))
    
    @scala.inline
    def setWebkitJustifyContent(value: JustifyContentProperty | js.Array[JustifyContentProperty]): Self = StObject.set(x, "WebkitJustifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitJustifyContentUndefined: Self = StObject.set(x, "WebkitJustifyContent", js.undefined)
    
    @scala.inline
    def setWebkitJustifyContentVarargs(value: JustifyContentProperty*): Self = StObject.set(x, "WebkitJustifyContent", js.Array(value :_*))
    
    @scala.inline
    def setWebkitLineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = StObject.set(x, "WebkitLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitLineBreakUndefined: Self = StObject.set(x, "WebkitLineBreak", js.undefined)
    
    @scala.inline
    def setWebkitLineBreakVarargs(value: LineBreakProperty*): Self = StObject.set(x, "WebkitLineBreak", js.Array(value :_*))
    
    @scala.inline
    def setWebkitLineClamp(value: WebkitLineClampProperty | js.Array[WebkitLineClampProperty]): Self = StObject.set(x, "WebkitLineClamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitLineClampUndefined: Self = StObject.set(x, "WebkitLineClamp", js.undefined)
    
    @scala.inline
    def setWebkitLineClampVarargs(value: WebkitLineClampProperty*): Self = StObject.set(x, "WebkitLineClamp", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMarginEnd(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): Self = StObject.set(x, "WebkitMarginEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMarginEndUndefined: Self = StObject.set(x, "WebkitMarginEnd", js.undefined)
    
    @scala.inline
    def setWebkitMarginEndVarargs(value: MarginInlineEndProperty[TLength]*): Self = StObject.set(x, "WebkitMarginEnd", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMarginStart(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): Self = StObject.set(x, "WebkitMarginStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMarginStartUndefined: Self = StObject.set(x, "WebkitMarginStart", js.undefined)
    
    @scala.inline
    def setWebkitMarginStartVarargs(value: MarginInlineStartProperty[TLength]*): Self = StObject.set(x, "WebkitMarginStart", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskAttachment(value: WebkitMaskAttachmentProperty | js.Array[WebkitMaskAttachmentProperty]): Self = StObject.set(x, "WebkitMaskAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskAttachmentUndefined: Self = StObject.set(x, "WebkitMaskAttachment", js.undefined)
    
    @scala.inline
    def setWebkitMaskAttachmentVarargs(value: WebkitMaskAttachmentProperty*): Self = StObject.set(x, "WebkitMaskAttachment", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskClip(value: WebkitMaskClipProperty | js.Array[WebkitMaskClipProperty]): Self = StObject.set(x, "WebkitMaskClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskClipUndefined: Self = StObject.set(x, "WebkitMaskClip", js.undefined)
    
    @scala.inline
    def setWebkitMaskClipVarargs(value: WebkitMaskClipProperty*): Self = StObject.set(x, "WebkitMaskClip", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskComposite(value: WebkitMaskCompositeProperty | js.Array[WebkitMaskCompositeProperty]): Self = StObject.set(x, "WebkitMaskComposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskCompositeUndefined: Self = StObject.set(x, "WebkitMaskComposite", js.undefined)
    
    @scala.inline
    def setWebkitMaskCompositeVarargs(value: WebkitMaskCompositeProperty*): Self = StObject.set(x, "WebkitMaskComposite", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskImage(value: WebkitMaskImageProperty | js.Array[WebkitMaskImageProperty]): Self = StObject.set(x, "WebkitMaskImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskImageUndefined: Self = StObject.set(x, "WebkitMaskImage", js.undefined)
    
    @scala.inline
    def setWebkitMaskImageVarargs(value: WebkitMaskImageProperty*): Self = StObject.set(x, "WebkitMaskImage", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskOrigin(value: WebkitMaskOriginProperty | js.Array[WebkitMaskOriginProperty]): Self = StObject.set(x, "WebkitMaskOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskOriginUndefined: Self = StObject.set(x, "WebkitMaskOrigin", js.undefined)
    
    @scala.inline
    def setWebkitMaskOriginVarargs(value: WebkitMaskOriginProperty*): Self = StObject.set(x, "WebkitMaskOrigin", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskPosition(value: WebkitMaskPositionProperty[TLength] | js.Array[WebkitMaskPositionProperty[TLength]]): Self = StObject.set(x, "WebkitMaskPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskPositionUndefined: Self = StObject.set(x, "WebkitMaskPosition", js.undefined)
    
    @scala.inline
    def setWebkitMaskPositionVarargs(value: WebkitMaskPositionProperty[TLength]*): Self = StObject.set(x, "WebkitMaskPosition", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskPositionX(value: WebkitMaskPositionXProperty[TLength] | js.Array[WebkitMaskPositionXProperty[TLength]]): Self = StObject.set(x, "WebkitMaskPositionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskPositionXUndefined: Self = StObject.set(x, "WebkitMaskPositionX", js.undefined)
    
    @scala.inline
    def setWebkitMaskPositionXVarargs(value: WebkitMaskPositionXProperty[TLength]*): Self = StObject.set(x, "WebkitMaskPositionX", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskPositionY(value: WebkitMaskPositionYProperty[TLength] | js.Array[WebkitMaskPositionYProperty[TLength]]): Self = StObject.set(x, "WebkitMaskPositionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskPositionYUndefined: Self = StObject.set(x, "WebkitMaskPositionY", js.undefined)
    
    @scala.inline
    def setWebkitMaskPositionYVarargs(value: WebkitMaskPositionYProperty[TLength]*): Self = StObject.set(x, "WebkitMaskPositionY", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskRepeat(value: WebkitMaskRepeatProperty | js.Array[WebkitMaskRepeatProperty]): Self = StObject.set(x, "WebkitMaskRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskRepeatUndefined: Self = StObject.set(x, "WebkitMaskRepeat", js.undefined)
    
    @scala.inline
    def setWebkitMaskRepeatVarargs(value: WebkitMaskRepeatProperty*): Self = StObject.set(x, "WebkitMaskRepeat", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskRepeatX(value: WebkitMaskRepeatXProperty | js.Array[WebkitMaskRepeatXProperty]): Self = StObject.set(x, "WebkitMaskRepeatX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskRepeatXUndefined: Self = StObject.set(x, "WebkitMaskRepeatX", js.undefined)
    
    @scala.inline
    def setWebkitMaskRepeatXVarargs(value: WebkitMaskRepeatXProperty*): Self = StObject.set(x, "WebkitMaskRepeatX", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskRepeatY(value: WebkitMaskRepeatYProperty | js.Array[WebkitMaskRepeatYProperty]): Self = StObject.set(x, "WebkitMaskRepeatY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskRepeatYUndefined: Self = StObject.set(x, "WebkitMaskRepeatY", js.undefined)
    
    @scala.inline
    def setWebkitMaskRepeatYVarargs(value: WebkitMaskRepeatYProperty*): Self = StObject.set(x, "WebkitMaskRepeatY", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaskSize(value: WebkitMaskSizeProperty[TLength] | js.Array[WebkitMaskSizeProperty[TLength]]): Self = StObject.set(x, "WebkitMaskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskSizeUndefined: Self = StObject.set(x, "WebkitMaskSize", js.undefined)
    
    @scala.inline
    def setWebkitMaskSizeVarargs(value: WebkitMaskSizeProperty[TLength]*): Self = StObject.set(x, "WebkitMaskSize", js.Array(value :_*))
    
    @scala.inline
    def setWebkitMaxInlineSize(value: MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]): Self = StObject.set(x, "WebkitMaxInlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaxInlineSizeUndefined: Self = StObject.set(x, "WebkitMaxInlineSize", js.undefined)
    
    @scala.inline
    def setWebkitMaxInlineSizeVarargs(value: MaxInlineSizeProperty[TLength]*): Self = StObject.set(x, "WebkitMaxInlineSize", js.Array(value :_*))
    
    @scala.inline
    def setWebkitOrder(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "WebkitOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitOrderUndefined: Self = StObject.set(x, "WebkitOrder", js.undefined)
    
    @scala.inline
    def setWebkitOrderVarargs(value: GlobalsNumber*): Self = StObject.set(x, "WebkitOrder", js.Array(value :_*))
    
    @scala.inline
    def setWebkitOverflowScrolling(value: WebkitOverflowScrollingProperty | js.Array[WebkitOverflowScrollingProperty]): Self = StObject.set(x, "WebkitOverflowScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitOverflowScrollingUndefined: Self = StObject.set(x, "WebkitOverflowScrolling", js.undefined)
    
    @scala.inline
    def setWebkitOverflowScrollingVarargs(value: WebkitOverflowScrollingProperty*): Self = StObject.set(x, "WebkitOverflowScrolling", js.Array(value :_*))
    
    @scala.inline
    def setWebkitPaddingEnd(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): Self = StObject.set(x, "WebkitPaddingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitPaddingEndUndefined: Self = StObject.set(x, "WebkitPaddingEnd", js.undefined)
    
    @scala.inline
    def setWebkitPaddingEndVarargs(value: PaddingInlineEndProperty[TLength]*): Self = StObject.set(x, "WebkitPaddingEnd", js.Array(value :_*))
    
    @scala.inline
    def setWebkitPaddingStart(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): Self = StObject.set(x, "WebkitPaddingStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitPaddingStartUndefined: Self = StObject.set(x, "WebkitPaddingStart", js.undefined)
    
    @scala.inline
    def setWebkitPaddingStartVarargs(value: PaddingInlineStartProperty[TLength]*): Self = StObject.set(x, "WebkitPaddingStart", js.Array(value :_*))
    
    @scala.inline
    def setWebkitPerspective(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): Self = StObject.set(x, "WebkitPerspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitPerspectiveOrigin(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): Self = StObject.set(x, "WebkitPerspectiveOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitPerspectiveOriginUndefined: Self = StObject.set(x, "WebkitPerspectiveOrigin", js.undefined)
    
    @scala.inline
    def setWebkitPerspectiveOriginVarargs(value: PerspectiveOriginProperty[TLength]*): Self = StObject.set(x, "WebkitPerspectiveOrigin", js.Array(value :_*))
    
    @scala.inline
    def setWebkitPerspectiveUndefined: Self = StObject.set(x, "WebkitPerspective", js.undefined)
    
    @scala.inline
    def setWebkitPerspectiveVarargs(value: PerspectiveProperty[TLength]*): Self = StObject.set(x, "WebkitPerspective", js.Array(value :_*))
    
    @scala.inline
    def setWebkitPrintColorAdjust(value: ColorAdjustProperty | js.Array[ColorAdjustProperty]): Self = StObject.set(x, "WebkitPrintColorAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitPrintColorAdjustUndefined: Self = StObject.set(x, "WebkitPrintColorAdjust", js.undefined)
    
    @scala.inline
    def setWebkitPrintColorAdjustVarargs(value: ColorAdjustProperty*): Self = StObject.set(x, "WebkitPrintColorAdjust", js.Array(value :_*))
    
    @scala.inline
    def setWebkitScrollSnapType(value: ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]): Self = StObject.set(x, "WebkitScrollSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitScrollSnapTypeUndefined: Self = StObject.set(x, "WebkitScrollSnapType", js.undefined)
    
    @scala.inline
    def setWebkitScrollSnapTypeVarargs(value: ScrollSnapTypeProperty*): Self = StObject.set(x, "WebkitScrollSnapType", js.Array(value :_*))
    
    @scala.inline
    def setWebkitShapeMargin(value: ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]): Self = StObject.set(x, "WebkitShapeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitShapeMarginUndefined: Self = StObject.set(x, "WebkitShapeMargin", js.undefined)
    
    @scala.inline
    def setWebkitShapeMarginVarargs(value: ShapeMarginProperty[TLength]*): Self = StObject.set(x, "WebkitShapeMargin", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTapHighlightColor(value: WebkitTapHighlightColorProperty | js.Array[WebkitTapHighlightColorProperty]): Self = StObject.set(x, "WebkitTapHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTapHighlightColorUndefined: Self = StObject.set(x, "WebkitTapHighlightColor", js.undefined)
    
    @scala.inline
    def setWebkitTapHighlightColorVarargs(value: WebkitTapHighlightColorProperty*): Self = StObject.set(x, "WebkitTapHighlightColor", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextCombine(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = StObject.set(x, "WebkitTextCombine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextCombineUndefined: Self = StObject.set(x, "WebkitTextCombine", js.undefined)
    
    @scala.inline
    def setWebkitTextCombineVarargs(value: TextCombineUprightProperty*): Self = StObject.set(x, "WebkitTextCombine", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextDecorationColor(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): Self = StObject.set(x, "WebkitTextDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextDecorationColorUndefined: Self = StObject.set(x, "WebkitTextDecorationColor", js.undefined)
    
    @scala.inline
    def setWebkitTextDecorationColorVarargs(value: TextDecorationColorProperty*): Self = StObject.set(x, "WebkitTextDecorationColor", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextDecorationLine(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): Self = StObject.set(x, "WebkitTextDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextDecorationLineUndefined: Self = StObject.set(x, "WebkitTextDecorationLine", js.undefined)
    
    @scala.inline
    def setWebkitTextDecorationLineVarargs(value: TextDecorationLineProperty*): Self = StObject.set(x, "WebkitTextDecorationLine", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextDecorationSkip(value: TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]): Self = StObject.set(x, "WebkitTextDecorationSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextDecorationSkipUndefined: Self = StObject.set(x, "WebkitTextDecorationSkip", js.undefined)
    
    @scala.inline
    def setWebkitTextDecorationSkipVarargs(value: TextDecorationSkipProperty*): Self = StObject.set(x, "WebkitTextDecorationSkip", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextDecorationStyle(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): Self = StObject.set(x, "WebkitTextDecorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextDecorationStyleUndefined: Self = StObject.set(x, "WebkitTextDecorationStyle", js.undefined)
    
    @scala.inline
    def setWebkitTextDecorationStyleVarargs(value: TextDecorationStyleProperty*): Self = StObject.set(x, "WebkitTextDecorationStyle", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextEmphasisColor(value: TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]): Self = StObject.set(x, "WebkitTextEmphasisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextEmphasisColorUndefined: Self = StObject.set(x, "WebkitTextEmphasisColor", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasisColorVarargs(value: TextEmphasisColorProperty*): Self = StObject.set(x, "WebkitTextEmphasisColor", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextEmphasisPosition(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "WebkitTextEmphasisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextEmphasisPositionUndefined: Self = StObject.set(x, "WebkitTextEmphasisPosition", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasisPositionVarargs(value: GlobalsString*): Self = StObject.set(x, "WebkitTextEmphasisPosition", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextEmphasisStyle(value: TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]): Self = StObject.set(x, "WebkitTextEmphasisStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextEmphasisStyleUndefined: Self = StObject.set(x, "WebkitTextEmphasisStyle", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasisStyleVarargs(value: TextEmphasisStyleProperty*): Self = StObject.set(x, "WebkitTextEmphasisStyle", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextFillColor(value: WebkitTextFillColorProperty | js.Array[WebkitTextFillColorProperty]): Self = StObject.set(x, "WebkitTextFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextFillColorUndefined: Self = StObject.set(x, "WebkitTextFillColor", js.undefined)
    
    @scala.inline
    def setWebkitTextFillColorVarargs(value: WebkitTextFillColorProperty*): Self = StObject.set(x, "WebkitTextFillColor", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextOrientation(value: TextOrientationProperty | js.Array[TextOrientationProperty]): Self = StObject.set(x, "WebkitTextOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextOrientationUndefined: Self = StObject.set(x, "WebkitTextOrientation", js.undefined)
    
    @scala.inline
    def setWebkitTextOrientationVarargs(value: TextOrientationProperty*): Self = StObject.set(x, "WebkitTextOrientation", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextSizeAdjust(value: TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]): Self = StObject.set(x, "WebkitTextSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextSizeAdjustUndefined: Self = StObject.set(x, "WebkitTextSizeAdjust", js.undefined)
    
    @scala.inline
    def setWebkitTextSizeAdjustVarargs(value: TextSizeAdjustProperty*): Self = StObject.set(x, "WebkitTextSizeAdjust", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextStrokeColor(value: WebkitTextStrokeColorProperty | js.Array[WebkitTextStrokeColorProperty]): Self = StObject.set(x, "WebkitTextStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextStrokeColorUndefined: Self = StObject.set(x, "WebkitTextStrokeColor", js.undefined)
    
    @scala.inline
    def setWebkitTextStrokeColorVarargs(value: WebkitTextStrokeColorProperty*): Self = StObject.set(x, "WebkitTextStrokeColor", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextStrokeWidth(value: WebkitTextStrokeWidthProperty[TLength] | js.Array[WebkitTextStrokeWidthProperty[TLength]]): Self = StObject.set(x, "WebkitTextStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextStrokeWidthUndefined: Self = StObject.set(x, "WebkitTextStrokeWidth", js.undefined)
    
    @scala.inline
    def setWebkitTextStrokeWidthVarargs(value: WebkitTextStrokeWidthProperty[TLength]*): Self = StObject.set(x, "WebkitTextStrokeWidth", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTextUnderlinePosition(value: TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]): Self = StObject.set(x, "WebkitTextUnderlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextUnderlinePositionUndefined: Self = StObject.set(x, "WebkitTextUnderlinePosition", js.undefined)
    
    @scala.inline
    def setWebkitTextUnderlinePositionVarargs(value: TextUnderlinePositionProperty*): Self = StObject.set(x, "WebkitTextUnderlinePosition", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTouchCallout(value: WebkitTouchCalloutProperty | js.Array[WebkitTouchCalloutProperty]): Self = StObject.set(x, "WebkitTouchCallout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTouchCalloutUndefined: Self = StObject.set(x, "WebkitTouchCallout", js.undefined)
    
    @scala.inline
    def setWebkitTouchCalloutVarargs(value: WebkitTouchCalloutProperty*): Self = StObject.set(x, "WebkitTouchCallout", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTransform(value: TransformProperty | js.Array[TransformProperty]): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransformOrigin(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): Self = StObject.set(x, "WebkitTransformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransformOriginUndefined: Self = StObject.set(x, "WebkitTransformOrigin", js.undefined)
    
    @scala.inline
    def setWebkitTransformOriginVarargs(value: TransformOriginProperty[TLength]*): Self = StObject.set(x, "WebkitTransformOrigin", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTransformStyle(value: TransformStyleProperty | js.Array[TransformStyleProperty]): Self = StObject.set(x, "WebkitTransformStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransformStyleUndefined: Self = StObject.set(x, "WebkitTransformStyle", js.undefined)
    
    @scala.inline
    def setWebkitTransformStyleVarargs(value: TransformStyleProperty*): Self = StObject.set(x, "WebkitTransformStyle", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTransformUndefined: Self = StObject.set(x, "WebkitTransform", js.undefined)
    
    @scala.inline
    def setWebkitTransformVarargs(value: TransformProperty*): Self = StObject.set(x, "WebkitTransform", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "WebkitTransitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransitionDelayUndefined: Self = StObject.set(x, "WebkitTransitionDelay", js.undefined)
    
    @scala.inline
    def setWebkitTransitionDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "WebkitTransitionDelay", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "WebkitTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransitionDurationUndefined: Self = StObject.set(x, "WebkitTransitionDuration", js.undefined)
    
    @scala.inline
    def setWebkitTransitionDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "WebkitTransitionDuration", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = StObject.set(x, "WebkitTransitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransitionPropertyUndefined: Self = StObject.set(x, "WebkitTransitionProperty", js.undefined)
    
    @scala.inline
    def setWebkitTransitionPropertyVarargs(value: TransitionPropertyProperty*): Self = StObject.set(x, "WebkitTransitionProperty", js.Array(value :_*))
    
    @scala.inline
    def setWebkitTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = StObject.set(x, "WebkitTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransitionTimingFunctionUndefined: Self = StObject.set(x, "WebkitTransitionTimingFunction", js.undefined)
    
    @scala.inline
    def setWebkitTransitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): Self = StObject.set(x, "WebkitTransitionTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setWebkitUserModify(value: WebkitUserModifyProperty | js.Array[WebkitUserModifyProperty]): Self = StObject.set(x, "WebkitUserModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitUserModifyUndefined: Self = StObject.set(x, "WebkitUserModify", js.undefined)
    
    @scala.inline
    def setWebkitUserModifyVarargs(value: WebkitUserModifyProperty*): Self = StObject.set(x, "WebkitUserModify", js.Array(value :_*))
    
    @scala.inline
    def setWebkitUserSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = StObject.set(x, "WebkitUserSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitUserSelectUndefined: Self = StObject.set(x, "WebkitUserSelect", js.undefined)
    
    @scala.inline
    def setWebkitUserSelectVarargs(value: UserSelectProperty*): Self = StObject.set(x, "WebkitUserSelect", js.Array(value :_*))
    
    @scala.inline
    def setWebkitWritingMode(value: WritingModeProperty | js.Array[WritingModeProperty]): Self = StObject.set(x, "WebkitWritingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitWritingModeUndefined: Self = StObject.set(x, "WebkitWritingMode", js.undefined)
    
    @scala.inline
    def setWebkitWritingModeVarargs(value: WritingModeProperty*): Self = StObject.set(x, "WebkitWritingMode", js.Array(value :_*))
  }
}
