package typings.preact.jsxCsstypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardShorthandPropertiesHyphenFallback[TLength] extends StObject {
  
  /**
    * The `**all**` CSS shorthand property sets all of an element's properties (other than `unicode-bidi` and `direction`) to their initial or inherited values, or to the values specified in another stylesheet origin.
    *
    * **Syntax**: `initial | inherit | unset | revert`
    *
    * **Initial value**: There is no practical initial value for it.
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **37** | **27**  | **9.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/all
    */
  var all: js.UndefOr[Globals | js.Array[Globals]] = js.undefined
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation
    */
  var animation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.undefined
  
  /**
    * The **`background`** shorthand CSS property sets all background style properties at once, such as color, image, origin and size, or repeat method.
    *
    * **Syntax**: `[ <bg-layer> , ]* <final-bg-layer>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background
    */
  var background: js.UndefOr[BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]] = js.undefined
  
  /**
    * The **`border`** CSS property sets an element's border. It's a shorthand for `border-width`, `border-style`, and `border-color`.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border
    */
  var border: js.UndefOr[BorderProperty[TLength] | js.Array[BorderProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block
    */
  var `border-block`: js.UndefOr[BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
    */
  var `border-block-end`: js.UndefOr[BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
    */
  var `border-block-start`: js.UndefOr[BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-bottom`** CSS property is a shorthand that sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`. These properties set an element's bottom border.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom
    */
  var `border-bottom`: js.UndefOr[BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-color`** shorthand CSS property sets the color of all sides of an element's border.
    *
    * **Syntax**: `<color>{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-color
    */
  var `border-color`: js.UndefOr[BorderColorProperty | js.Array[BorderColorProperty]] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    *
    * | Chrome  |  Firefox  | Safari  |  Edge  |   IE   |
    * | :-----: | :-------: | :-----: | :----: | :----: |
    * | **16**  |  **15**   |  **6**  | **12** | **11** |
    * | 7 _-x-_ | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image
    */
  var `border-image`: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.undefined
  
  /**
    * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline
    */
  var `border-inline`: js.UndefOr[BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
    */
  var `border-inline-end`: js.UndefOr[BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline-start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start
    */
  var `border-inline-start`: js.UndefOr[
    BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-left`** CSS property is a shorthand that sets the values of `border-left-width`, `border-left-style` and `border-left-color`. These properties set an element's left border.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left
    */
  var `border-left`: js.UndefOr[BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-radius
    */
  var `border-radius`: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-right`** CSS property is a shorthand that sets the values of `border-right-width`, `border-right-style` and `border-right-color`. These properties set an element's right border.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right
    */
  var `border-right`: js.UndefOr[BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-style`** CSS property is a shorthand property that sets the line style for all four sides of an element's border.
    *
    * **Syntax**: `<line-style>{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-style
    */
  var `border-style`: js.UndefOr[BorderStyleProperty | js.Array[BorderStyleProperty]] = js.undefined
  
  /**
    * The **`border-top`** CSS property is a shorthand that sets the values of `border-top-width`, `border-top-style` and `border-top-color`. These properties set an element's top border.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top
    */
  var `border-top`: js.UndefOr[BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-width`** shorthand CSS property sets the widths of all four sides of an element's border.
    *
    * **Syntax**: `<line-width>{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-width
    */
  var `border-width`: js.UndefOr[BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule
    */
  var `column-rule`: js.UndefOr[ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]] = js.undefined
  
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **50** | **52**  |  **9**  | **12** | **10** |
    * |        |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/columns
    */
  var columns: js.UndefOr[ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]] = js.undefined
  
  /**
    * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |    IE    |
    * | :------: | :-----: | :-------: | :----: | :------: |
    * |  **29**  | **20**  |   **9**   | **12** |  **11**  |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex
    */
  var flex: js.UndefOr[FlexProperty[TLength] | js.Array[FlexProperty[TLength]]] = js.undefined
  
  /**
    * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
    *
    * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-flow
    */
  var `flex-flow`: js.UndefOr[FlexFlowProperty | js.Array[FlexFlowProperty]] = js.undefined
  
  /**
    * The **`font`** CSS property is a shorthand for `font-style`, `font-variant`, `font-weight`, `font-size`, `line-height`, and `font-family`. Alternatively, it sets an element's font to a system font.
    *
    * **Syntax**: `[ [ <'font-style'> || <font-variant-css21> || <'font-weight'> || <'font-stretch'> ]? <'font-size'> [ / <'line-height'> ]? <'font-family'> ] | caption | icon | menu | message-box | small-caption | status-bar`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font
    */
  var font: js.UndefOr[FontProperty | js.Array[FontProperty]] = js.undefined
  
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'row-gap'> <'column-gap'>?`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **84** | **63**  |   No   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |     Chrome      |     Firefox     |      Safari       |  Edge  | IE  |
    * | :-------------: | :-------------: | :---------------: | :----: | :-: |
    * |     **66**      |     **61**      |      **12**       | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ | 10.1 _(grid-gap)_ |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **66** | **61**  |   No   | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/gap
    */
  var gap: js.UndefOr[GapProperty[TLength] | js.Array[GapProperty[TLength]]] = js.undefined
  
  /**
    * The **`grid`** CSS property is a shorthand property that sets all of the explicit grid properties (`grid-template-rows`, `grid-template-columns`, and `grid-template-areas`), and all the implicit grid properties (`grid-auto-rows`, `grid-auto-columns`, and `grid-auto-flow`), in a single declaration.
    *
    * **Syntax**: `<'grid-template'> | <'grid-template-rows'> / [ auto-flow && dense? ] <'grid-auto-columns'>? | [ auto-flow && dense? ] <'grid-auto-rows'>? / <'grid-template-columns'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid
    */
  var grid: js.UndefOr[GridProperty | js.Array[GridProperty]] = js.undefined
  
  /**
    * The **`grid-area`** CSS property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`, specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]{0,3}`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
    */
  var `grid-area`: js.UndefOr[GridAreaProperty | js.Array[GridAreaProperty]] = js.undefined
  
  /**
    * The **`grid-column`** CSS property is a shorthand property for `grid-column-start` and `grid-column-end` specifying a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
    */
  var `grid-column`: js.UndefOr[GridColumnProperty | js.Array[GridColumnProperty]] = js.undefined
  
  /**
    * The **`grid-row`** CSS property is a shorthand property for `grid-row-start` and `grid-row-end` specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
    */
  var `grid-row`: js.UndefOr[GridRowProperty | js.Array[GridRowProperty]] = js.undefined
  
  /**
    * The **`grid-template`** CSS property is a shorthand property for defining grid columns, rows, and areas.
    *
    * **Syntax**: `none | [ <'grid-template-rows'> / <'grid-template-columns'> ] | [ <line-names>? <string> <track-size>? <line-names>? ]+ [ / <explicit-track-list> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
    */
  var `grid-template`: js.UndefOr[GridTemplateProperty | js.Array[GridTemplateProperty]] = js.undefined
  
  /**
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var `line-clamp`: js.UndefOr[LineClampProperty | js.Array[LineClampProperty]] = js.undefined
  
  /**
    * The **`list-style`** CSS property is a shorthand to set list style properties `list-style-type`, `list-style-image`, and `list-style-position`.
    *
    * **Syntax**: `<'list-style-type'> || <'list-style-position'> || <'list-style-image'>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style
    */
  var `list-style`: js.UndefOr[ListStyleProperty | js.Array[ListStyleProperty]] = js.undefined
  
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * **Syntax**: `[ <length> | <percentage> | auto ]{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var margin: js.UndefOr[MarginProperty[TLength] | js.Array[MarginProperty[TLength]]] = js.undefined
  
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * **Syntax**: `<mask-layer>#`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  |  **2**  | **3.2** | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask
    */
  var mask: js.UndefOr[MaskProperty[TLength] | js.Array[MaskProperty[TLength]]] = js.undefined
  
  /**
    * The **`mask-border`** CSS property lets you create a mask along the edge of an element's border.
    *
    * **Syntax**: `<'mask-border-source'> || <'mask-border-slice'> [ / <'mask-border-width'>? [ / <'mask-border-outset'> ]? ]? || <'mask-border-repeat'> || <'mask-border-mode'>`
    */
  var `mask-border`: js.UndefOr[MaskBorderProperty | js.Array[MaskBorderProperty]] = js.undefined
  
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
    *
    * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
    *
    * |    Chrome     | Firefox | Safari |  Edge  | IE  |
    * | :-----------: | :-----: | :----: | :----: | :-: |
    * |    **55**     | **72**  |   No   | **79** | No  |
    * | 46 _(motion)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var motion: js.UndefOr[OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]] = js.undefined
  
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
    *
    * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
    *
    * |    Chrome     | Firefox | Safari |  Edge  | IE  |
    * | :-----------: | :-----: | :----: | :----: | :-: |
    * |    **55**     | **72**  |   No   | **79** | No  |
    * | 46 _(motion)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var offset: js.UndefOr[OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]] = js.undefined
  
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline
    */
  var outline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.undefined
  
  /**
    * The **`overflow`** CSS property sets what to do when an element's content is too big to fit in its block formatting context. It is a shorthand for `overflow-x` and `overflow-y`.
    *
    * **Syntax**: `[ visible | hidden | clip | scroll | auto ]{1,2}`
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow
    */
  var overflow: js.UndefOr[OverflowProperty | js.Array[OverflowProperty]] = js.undefined
  
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * **Syntax**: `[ <length> | <percentage> ]{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var padding: js.UndefOr[PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]] = js.undefined
  
  /**
    * The CSS **`place-items`** shorthand property sets the `align-items` and `justify-items` properties, respectively. If the second value is not set, the first value is also used for it.
    *
    * **Syntax**: `<'align-items'> <'justify-items'>?`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  | **11** | **79** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  | **11** | **79** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-items
    */
  var `place-items`: js.UndefOr[PlaceItemsProperty | js.Array[PlaceItemsProperty]] = js.undefined
  
  /**
    * The **`place-self`** CSS property is a shorthand property sets both the `align-self` and `justify-self` properties. The first value is the `align-self` property value, the second the `justify-self` one. If the second value is not present, the first value is also used for it.
    *
    * **Syntax**: `<'align-self'> <'justify-self'>?`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  |   No   | **79** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  |   No   | **79** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-self
    */
  var `place-self`: js.UndefOr[PlaceSelfProperty | js.Array[PlaceSelfProperty]] = js.undefined
  
  /**
    * The **`text-decoration`** CSS property sets the appearance of decorative lines on text. It is a shorthand for `text-decoration-line`, `text-decoration-color`, and `text-decoration-style`.
    *
    * **Syntax**: `<'text-decoration-line'> || <'text-decoration-style'> || <'text-decoration-color'> || <'text-decoration-thickness'>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration
    */
  var `text-decoration`: js.UndefOr[TextDecorationProperty[TLength] | js.Array[TextDecorationProperty[TLength]]] = js.undefined
  
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
    *
    * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
    * | :----------: | :-----: | :-----: | :----------: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
    */
  var `text-emphasis`: js.UndefOr[TextEmphasisProperty | js.Array[TextEmphasisProperty]] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition
    */
  var transition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.undefined
}
object StandardShorthandPropertiesHyphenFallback {
  
  inline def apply[TLength](): StandardShorthandPropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardShorthandPropertiesHyphenFallback[TLength]]
  }
  
  extension [Self <: StandardShorthandPropertiesHyphenFallback[?], TLength](x: Self & StandardShorthandPropertiesHyphenFallback[TLength]) {
    
    inline def setAll(value: Globals | js.Array[Globals]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAllVarargs(value: Globals*): Self = StObject.set(x, "all", js.Array(value :_*))
    
    inline def setAnimation(value: AnimationProperty | js.Array[AnimationProperty]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAnimationVarargs(value: AnimationProperty*): Self = StObject.set(x, "animation", js.Array(value :_*))
    
    inline def setBackground(value: BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBackgroundVarargs(value: BackgroundProperty[TLength]*): Self = StObject.set(x, "background", js.Array(value :_*))
    
    inline def setBorder(value: BorderProperty[TLength] | js.Array[BorderProperty[TLength]]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block`(value: BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]): Self = StObject.set(x, "border-block", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-end`(value: BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]): Self = StObject.set(x, "border-block-end", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-endUndefined`: Self = StObject.set(x, "border-block-end", js.undefined)
    
    inline def `setBorder-block-endVarargs`(value: BorderBlockEndProperty[TLength]*): Self = StObject.set(x, "border-block-end", js.Array(value :_*))
    
    inline def `setBorder-block-start`(value: BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]): Self = StObject.set(x, "border-block-start", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-startUndefined`: Self = StObject.set(x, "border-block-start", js.undefined)
    
    inline def `setBorder-block-startVarargs`(value: BorderBlockStartProperty[TLength]*): Self = StObject.set(x, "border-block-start", js.Array(value :_*))
    
    inline def `setBorder-blockUndefined`: Self = StObject.set(x, "border-block", js.undefined)
    
    inline def `setBorder-blockVarargs`(value: BorderBlockProperty[TLength]*): Self = StObject.set(x, "border-block", js.Array(value :_*))
    
    inline def `setBorder-bottom`(value: BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    inline def `setBorder-bottomVarargs`(value: BorderBottomProperty[TLength]*): Self = StObject.set(x, "border-bottom", js.Array(value :_*))
    
    inline def `setBorder-color`(value: BorderColorProperty | js.Array[BorderColorProperty]): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-colorVarargs`(value: BorderColorProperty*): Self = StObject.set(x, "border-color", js.Array(value :_*))
    
    inline def `setBorder-image`(value: BorderImageProperty | js.Array[BorderImageProperty]): Self = StObject.set(x, "border-image", value.asInstanceOf[js.Any])
    
    inline def `setBorder-imageUndefined`: Self = StObject.set(x, "border-image", js.undefined)
    
    inline def `setBorder-imageVarargs`(value: BorderImageProperty*): Self = StObject.set(x, "border-image", js.Array(value :_*))
    
    inline def `setBorder-inline`(value: BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]): Self = StObject.set(x, "border-inline", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-end`(value: BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]): Self = StObject.set(x, "border-inline-end", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-endUndefined`: Self = StObject.set(x, "border-inline-end", js.undefined)
    
    inline def `setBorder-inline-endVarargs`(value: BorderInlineEndProperty[TLength]*): Self = StObject.set(x, "border-inline-end", js.Array(value :_*))
    
    inline def `setBorder-inline-start`(value: BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]): Self = StObject.set(x, "border-inline-start", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-startUndefined`: Self = StObject.set(x, "border-inline-start", js.undefined)
    
    inline def `setBorder-inline-startVarargs`(value: BorderInlineStartProperty[TLength]*): Self = StObject.set(x, "border-inline-start", js.Array(value :_*))
    
    inline def `setBorder-inlineUndefined`: Self = StObject.set(x, "border-inline", js.undefined)
    
    inline def `setBorder-inlineVarargs`(value: BorderInlineProperty[TLength]*): Self = StObject.set(x, "border-inline", js.Array(value :_*))
    
    inline def `setBorder-left`(value: BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
    inline def `setBorder-leftVarargs`(value: BorderLeftProperty[TLength]*): Self = StObject.set(x, "border-left", js.Array(value :_*))
    
    inline def `setBorder-radius`(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def `setBorder-radiusVarargs`(value: BorderRadiusProperty[TLength]*): Self = StObject.set(x, "border-radius", js.Array(value :_*))
    
    inline def `setBorder-right`(value: BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    inline def `setBorder-rightVarargs`(value: BorderRightProperty[TLength]*): Self = StObject.set(x, "border-right", js.Array(value :_*))
    
    inline def `setBorder-style`(value: BorderStyleProperty | js.Array[BorderStyleProperty]): Self = StObject.set(x, "border-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-styleUndefined`: Self = StObject.set(x, "border-style", js.undefined)
    
    inline def `setBorder-styleVarargs`(value: BorderStyleProperty*): Self = StObject.set(x, "border-style", js.Array(value :_*))
    
    inline def `setBorder-top`(value: BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    inline def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    inline def `setBorder-topVarargs`(value: BorderTopProperty[TLength]*): Self = StObject.set(x, "border-top", js.Array(value :_*))
    
    inline def `setBorder-width`(value: BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def `setBorder-widthVarargs`(value: BorderWidthProperty[TLength]*): Self = StObject.set(x, "border-width", js.Array(value :_*))
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderVarargs(value: BorderProperty[TLength]*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    inline def `setColumn-rule`(value: ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]): Self = StObject.set(x, "column-rule", value.asInstanceOf[js.Any])
    
    inline def `setColumn-ruleUndefined`: Self = StObject.set(x, "column-rule", js.undefined)
    
    inline def `setColumn-ruleVarargs`(value: ColumnRuleProperty[TLength]*): Self = StObject.set(x, "column-rule", js.Array(value :_*))
    
    inline def setColumns(value: ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnsProperty[TLength]*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setFlex(value: FlexProperty[TLength] | js.Array[FlexProperty[TLength]]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def `setFlex-flow`(value: FlexFlowProperty | js.Array[FlexFlowProperty]): Self = StObject.set(x, "flex-flow", value.asInstanceOf[js.Any])
    
    inline def `setFlex-flowUndefined`: Self = StObject.set(x, "flex-flow", js.undefined)
    
    inline def `setFlex-flowVarargs`(value: FlexFlowProperty*): Self = StObject.set(x, "flex-flow", js.Array(value :_*))
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFlexVarargs(value: FlexProperty[TLength]*): Self = StObject.set(x, "flex", js.Array(value :_*))
    
    inline def setFont(value: FontProperty | js.Array[FontProperty]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontVarargs(value: FontProperty*): Self = StObject.set(x, "font", js.Array(value :_*))
    
    inline def setGap(value: GapProperty[TLength] | js.Array[GapProperty[TLength]]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setGapVarargs(value: GapProperty[TLength]*): Self = StObject.set(x, "gap", js.Array(value :_*))
    
    inline def setGrid(value: GridProperty | js.Array[GridProperty]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def `setGrid-area`(value: GridAreaProperty | js.Array[GridAreaProperty]): Self = StObject.set(x, "grid-area", value.asInstanceOf[js.Any])
    
    inline def `setGrid-areaUndefined`: Self = StObject.set(x, "grid-area", js.undefined)
    
    inline def `setGrid-areaVarargs`(value: GridAreaProperty*): Self = StObject.set(x, "grid-area", js.Array(value :_*))
    
    inline def `setGrid-column`(value: GridColumnProperty | js.Array[GridColumnProperty]): Self = StObject.set(x, "grid-column", value.asInstanceOf[js.Any])
    
    inline def `setGrid-columnUndefined`: Self = StObject.set(x, "grid-column", js.undefined)
    
    inline def `setGrid-columnVarargs`(value: GridColumnProperty*): Self = StObject.set(x, "grid-column", js.Array(value :_*))
    
    inline def `setGrid-row`(value: GridRowProperty | js.Array[GridRowProperty]): Self = StObject.set(x, "grid-row", value.asInstanceOf[js.Any])
    
    inline def `setGrid-rowUndefined`: Self = StObject.set(x, "grid-row", js.undefined)
    
    inline def `setGrid-rowVarargs`(value: GridRowProperty*): Self = StObject.set(x, "grid-row", js.Array(value :_*))
    
    inline def `setGrid-template`(value: GridTemplateProperty | js.Array[GridTemplateProperty]): Self = StObject.set(x, "grid-template", value.asInstanceOf[js.Any])
    
    inline def `setGrid-templateUndefined`: Self = StObject.set(x, "grid-template", js.undefined)
    
    inline def `setGrid-templateVarargs`(value: GridTemplateProperty*): Self = StObject.set(x, "grid-template", js.Array(value :_*))
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGridVarargs(value: GridProperty*): Self = StObject.set(x, "grid", js.Array(value :_*))
    
    inline def `setLine-clamp`(value: LineClampProperty | js.Array[LineClampProperty]): Self = StObject.set(x, "line-clamp", value.asInstanceOf[js.Any])
    
    inline def `setLine-clampUndefined`: Self = StObject.set(x, "line-clamp", js.undefined)
    
    inline def `setLine-clampVarargs`(value: LineClampProperty*): Self = StObject.set(x, "line-clamp", js.Array(value :_*))
    
    inline def `setList-style`(value: ListStyleProperty | js.Array[ListStyleProperty]): Self = StObject.set(x, "list-style", value.asInstanceOf[js.Any])
    
    inline def `setList-styleUndefined`: Self = StObject.set(x, "list-style", js.undefined)
    
    inline def `setList-styleVarargs`(value: ListStyleProperty*): Self = StObject.set(x, "list-style", js.Array(value :_*))
    
    inline def setMargin(value: MarginProperty[TLength] | js.Array[MarginProperty[TLength]]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: MarginProperty[TLength]*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    inline def setMask(value: MaskProperty[TLength] | js.Array[MaskProperty[TLength]]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def `setMask-border`(value: MaskBorderProperty | js.Array[MaskBorderProperty]): Self = StObject.set(x, "mask-border", value.asInstanceOf[js.Any])
    
    inline def `setMask-borderUndefined`: Self = StObject.set(x, "mask-border", js.undefined)
    
    inline def `setMask-borderVarargs`(value: MaskBorderProperty*): Self = StObject.set(x, "mask-border", js.Array(value :_*))
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMaskVarargs(value: MaskProperty[TLength]*): Self = StObject.set(x, "mask", js.Array(value :_*))
    
    inline def setMotion(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    inline def setMotionVarargs(value: OffsetProperty[TLength]*): Self = StObject.set(x, "motion", js.Array(value :_*))
    
    inline def setOffset(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: OffsetProperty[TLength]*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    inline def setOutline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setOutlineVarargs(value: OutlineProperty[TLength]*): Self = StObject.set(x, "outline", js.Array(value :_*))
    
    inline def setOverflow(value: OverflowProperty | js.Array[OverflowProperty]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setOverflowVarargs(value: OverflowProperty*): Self = StObject.set(x, "overflow", js.Array(value :_*))
    
    inline def setPadding(value: PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: PaddingProperty[TLength]*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    inline def `setPlace-items`(value: PlaceItemsProperty | js.Array[PlaceItemsProperty]): Self = StObject.set(x, "place-items", value.asInstanceOf[js.Any])
    
    inline def `setPlace-itemsUndefined`: Self = StObject.set(x, "place-items", js.undefined)
    
    inline def `setPlace-itemsVarargs`(value: PlaceItemsProperty*): Self = StObject.set(x, "place-items", js.Array(value :_*))
    
    inline def `setPlace-self`(value: PlaceSelfProperty | js.Array[PlaceSelfProperty]): Self = StObject.set(x, "place-self", value.asInstanceOf[js.Any])
    
    inline def `setPlace-selfUndefined`: Self = StObject.set(x, "place-self", js.undefined)
    
    inline def `setPlace-selfVarargs`(value: PlaceSelfProperty*): Self = StObject.set(x, "place-self", js.Array(value :_*))
    
    inline def `setText-decoration`(value: TextDecorationProperty[TLength] | js.Array[TextDecorationProperty[TLength]]): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
    
    inline def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
    
    inline def `setText-decorationVarargs`(value: TextDecorationProperty[TLength]*): Self = StObject.set(x, "text-decoration", js.Array(value :_*))
    
    inline def `setText-emphasis`(value: TextEmphasisProperty | js.Array[TextEmphasisProperty]): Self = StObject.set(x, "text-emphasis", value.asInstanceOf[js.Any])
    
    inline def `setText-emphasisUndefined`: Self = StObject.set(x, "text-emphasis", js.undefined)
    
    inline def `setText-emphasisVarargs`(value: TextEmphasisProperty*): Self = StObject.set(x, "text-emphasis", js.Array(value :_*))
    
    inline def setTransition(value: TransitionProperty | js.Array[TransitionProperty]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setTransitionVarargs(value: TransitionProperty*): Self = StObject.set(x, "transition", js.Array(value :_*))
  }
}
