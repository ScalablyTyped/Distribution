package typings.nukaCarousel.typesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.nukaCarousel.anon.Count
import typings.nukaCarousel.nukaCarouselStrings.firstSlide
import typings.nukaCarousel.nukaCarouselStrings.lastSlide
import typings.nukaCarousel.nukaCarouselStrings.nextSlide
import typings.nukaCarousel.nukaCarouselStrings.pause
import typings.nukaCarousel.nukaCarouselStrings.previousSlide
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
