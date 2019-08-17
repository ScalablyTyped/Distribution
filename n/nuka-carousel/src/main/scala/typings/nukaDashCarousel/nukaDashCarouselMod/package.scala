package typings.nukaDashCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nukaDashCarouselMod {
  import typings.csstype.csstypeMod.Properties
  import typings.nukaDashCarousel.nukaDashCarouselStrings.auto
  import typings.react.reactMod.Component
  import typings.react.reactMod.ReactNode

  type CSSProperties = Properties[String | Double]
  type Carousel = Component[CarouselProps, CarouselState, js.Any]
  type CarouselRenderControl = js.Function1[/* props */ CarouselSlideRenderControlProps, ReactNode]
  type CarouselSlideWidthProp = String | Double
  type CarouselSlidesToScrollProp = Double | auto
}
