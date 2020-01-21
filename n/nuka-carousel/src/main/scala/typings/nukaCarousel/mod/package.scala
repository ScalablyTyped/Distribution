package typings.nukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Carousel = typings.react.mod.Component[
    typings.nukaCarousel.mod.CarouselProps, 
    typings.nukaCarousel.mod.CarouselState, 
    js.Any
  ]
  type CarouselRenderControl = js.Function1[
    /* props */ typings.nukaCarousel.mod.CarouselSlideRenderControlProps, 
    typings.react.mod.ReactNode
  ]
  type CarouselSlideWidthProp = java.lang.String | scala.Double
  type CarouselSlidesToScrollProp = scala.Double | typings.nukaCarousel.nukaCarouselStrings.auto
  type NextButtonProps = typings.nukaCarousel.mod.CarouselSlideRenderControlProps
  type PagingDotsProps = typings.nukaCarousel.mod.CarouselSlideRenderControlProps
  type PreviousButtonProps = typings.nukaCarousel.mod.CarouselSlideRenderControlProps
}
