package typings.nukaDashCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nukaDashCarouselMod {
  import typings.nukaDashCarousel.nukaDashCarouselStrings.auto
  import typings.react.reactMod.Component
  import typings.react.reactMod.ReactNode

  type Carousel = Component[CarouselProps, CarouselState, js.Any]
  type CarouselRenderControl = js.Function1[/* props */ CarouselSlideRenderControlProps, ReactNode]
  type CarouselSlideWidthProp = String | Double
  type CarouselSlidesToScrollProp = Double | auto
  type NextButtonProps = CarouselSlideRenderControlProps
  type PagingDotsProps = CarouselSlideRenderControlProps
  type PreviousButtonProps = CarouselSlideRenderControlProps
}
