package typings.nukaCarousel

import typings.nukaCarousel.anon.PickControlPropscellAlign
import typings.nukaCarousel.anon.PickControlPropscellAlignCellAlign
import typings.nukaCarousel.libTypesMod.Alignment
import typings.nukaCarousel.libTypesMod.ControlProps
import typings.nukaCarousel.libTypesMod.ScrollMode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultControlsMod {
  
  @JSImport("nuka-carousel/lib/default-controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NextButton(
    hasNextSlideHasNextButtonClassNameNextButtonStyleNextButtonTextNextButtonOnClickDisabledOnUserNavigation: ControlProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NextButton")(hasNextSlideHasNextButtonClassNameNextButtonStyleNextButtonTextNextButtonOnClickDisabledOnUserNavigation.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PagingDots(
    hasPagingDotsIndicesHasPagingDotsContainerClassNamePagingDotsClassNamePagingDotsStylePagingDotsOnClickCurrentSlideOnUserNavigationSlideCountGoToSlide: ControlProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PagingDots")(hasPagingDotsIndicesHasPagingDotsContainerClassNamePagingDotsClassNamePagingDotsStylePagingDotsOnClickCurrentSlideOnUserNavigationSlideCountGoToSlide.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PreviousButton(
    hasPreviousSlideHasPrevButtonClassNamePrevButtonStylePrevButtonTextPrevButtonOnClickOnUserNavigationDisabled: ControlProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreviousButton")(hasPreviousSlideHasPrevButtonClassNamePrevButtonStylePrevButtonTextPrevButtonOnClickOnUserNavigationDisabled.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getDotIndexes(
    slideCount: Double,
    slidesToScroll: Double,
    scrollMode: ScrollMode,
    slidesToShow: Double,
    wrapAround: Boolean,
    cellAlign: Alignment
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotIndexes")(slideCount.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], scrollMode.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], wrapAround.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def nextButtonDisabled(hasCellAlignCurrentSlideSlideCountSlidesToShowWrapAround: PickControlPropscellAlign): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nextButtonDisabled")(hasCellAlignCurrentSlideSlideCountSlidesToShowWrapAround.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prevButtonDisabled(hasCellAlignCurrentSlideSlidesToShowWrapAround: PickControlPropscellAlignCellAlign): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("prevButtonDisabled")(hasCellAlignCurrentSlideSlidesToShowWrapAround.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
