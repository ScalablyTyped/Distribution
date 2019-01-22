package typings
package nukaDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nukaDashCarouselMod {
  type Carousel = reactLib.reactMod.Component[CarouselProps, CarouselState, js.Any]
  type CarouselCellAlignProp = nukaDashCarouselLib.nukaDashCarouselLibStrings.left | nukaDashCarouselLib.nukaDashCarouselLibStrings.center | nukaDashCarouselLib.nukaDashCarouselLibStrings.right
  type CarouselHeightModeProp = nukaDashCarouselLib.nukaDashCarouselLibStrings.first | nukaDashCarouselLib.nukaDashCarouselLibStrings.current | nukaDashCarouselLib.nukaDashCarouselLibStrings.max
  type CarouselRenderControl = js.Function1[/* props */ CarouselSlideRenderControlProps, reactLib.reactMod.ReactNs.ReactNode]
  type CarouselSlideWidthProp = java.lang.String | scala.Double
  type CarouselSlidesToScrollProp = scala.Double | nukaDashCarouselLib.nukaDashCarouselLibStrings.auto
}
