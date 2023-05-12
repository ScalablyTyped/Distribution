package typings.nukaCarousel.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.nukaCarousel.anon.Count
import typings.nukaCarousel.anon.PartialInternalCarouselPr
import typings.nukaCarousel.mod.^
import typings.nukaCarousel.nukaCarouselStrings.firstSlide
import typings.nukaCarousel.nukaCarouselStrings.lastSlide
import typings.nukaCarousel.nukaCarouselStrings.nextSlide
import typings.nukaCarousel.nukaCarouselStrings.pause
import typings.nukaCarousel.nukaCarouselStrings.previousSlide
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: ForwardRefExoticComponent[PartialInternalCarouselPr] = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[ForwardRefExoticComponent[PartialInternalCarouselPr]]

inline def NextButton(param0: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NextButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def PagingDots(param0: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PagingDots")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def PreviousButton(param0: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreviousButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Animation easing function accepting a normalized time between 0 and 1,
  * inclusive, and returning an eased time, which equals 0 at normalizedTime==0
  * and equals 1 at normalizedTime==1
  */
type EasingFunction = js.Function1[/* normalizedTime */ Double, Double]

/* Rewritten from type alias, can be one of: 
  - typings.nukaCarousel.nukaCarouselStrings.nextSlide
  - typings.nukaCarousel.nukaCarouselStrings.previousSlide
  - typings.nukaCarousel.nukaCarouselStrings.firstSlide
  - typings.nukaCarousel.nukaCarouselStrings.lastSlide
  - typings.nukaCarousel.nukaCarouselStrings.pause
  - scala.Null
*/
type KeyCodeFunction = _KeyCodeFunction | Null

type KeyCodeMap = NumberDictionary[firstSlide | lastSlide | nextSlide | pause | previousSlide]

type RenderAnnounceSlideMessage = js.Function1[/* props */ Count, String]

/**
  * A function to override what to render on an edge/corner of the modal.
  *
  * Pass in null to not render the default controls on an edge.
  */
type RenderControls = (js.Function1[/* props */ ControlProps, ReactNode]) | Null
