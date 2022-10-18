package typings.nukaCarousel

import typings.nukaCarousel.libTypesMod.CarouselProps
import typings.nukaCarousel.libTypesMod.ControlProps
import typings.nukaCarousel.libTypesMod.InternalCarouselProps
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nuka-carousel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(rawProps: CarouselProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(rawProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("nuka-carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nuka-carousel", "default.defaultProps")
    @js.native
    def defaultProps: InternalCarouselProps = js.native
    inline def defaultProps_=(x: InternalCarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nuka-carousel", "Alignment")
  @js.native
  object Alignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nukaCarousel.libTypesMod.Alignment & String] = js.native
    
    /* "center" */ val Center: typings.nukaCarousel.libTypesMod.Alignment.Center & String = js.native
    
    /* "left" */ val Left: typings.nukaCarousel.libTypesMod.Alignment.Left & String = js.native
    
    /* "right" */ val Right: typings.nukaCarousel.libTypesMod.Alignment.Right & String = js.native
  }
  
  @JSImport("nuka-carousel", "Directions")
  @js.native
  object Directions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nukaCarousel.libTypesMod.Directions & String] = js.native
    
    /* "down" */ val Down: typings.nukaCarousel.libTypesMod.Directions.Down & String = js.native
    
    /* "next" */ val Next: typings.nukaCarousel.libTypesMod.Directions.Next & String = js.native
    
    /* "prev" */ val Prev: typings.nukaCarousel.libTypesMod.Directions.Prev & String = js.native
    
    /* "up" */ val Up: typings.nukaCarousel.libTypesMod.Directions.Up & String = js.native
  }
  
  inline def NextButton(
    hasNextSlideHasNextButtonClassNameNextButtonStyleNextButtonTextNextButtonOnClickDisabledOnUserNavigation: ControlProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NextButton")(hasNextSlideHasNextButtonClassNameNextButtonStyleNextButtonTextNextButtonOnClickDisabledOnUserNavigation.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PagingDots(
    hasPagingDotsIndicesHasPagingDotsContainerClassNamePagingDotsClassNamePagingDotsStylePagingDotsOnClickCurrentSlideOnUserNavigationSlideCountGoToSlide: ControlProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PagingDots")(hasPagingDotsIndicesHasPagingDotsContainerClassNamePagingDotsClassNamePagingDotsStylePagingDotsOnClickCurrentSlideOnUserNavigationSlideCountGoToSlide.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("nuka-carousel", "Positions")
  @js.native
  object Positions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nukaCarousel.libTypesMod.Positions & String] = js.native
    
    /* "BottomCenter" */ val BottomCenter: typings.nukaCarousel.libTypesMod.Positions.BottomCenter & String = js.native
    
    /* "BottomLeft" */ val BottomLeft: typings.nukaCarousel.libTypesMod.Positions.BottomLeft & String = js.native
    
    /* "BottomRight" */ val BottomRight: typings.nukaCarousel.libTypesMod.Positions.BottomRight & String = js.native
    
    /* "CenterCenter" */ val CenterCenter: typings.nukaCarousel.libTypesMod.Positions.CenterCenter & String = js.native
    
    /* "CenterLeft" */ val CenterLeft: typings.nukaCarousel.libTypesMod.Positions.CenterLeft & String = js.native
    
    /* "CenterRight" */ val CenterRight: typings.nukaCarousel.libTypesMod.Positions.CenterRight & String = js.native
    
    /* "TopCenter" */ val TopCenter: typings.nukaCarousel.libTypesMod.Positions.TopCenter & String = js.native
    
    /* "TopLeft" */ val TopLeft: typings.nukaCarousel.libTypesMod.Positions.TopLeft & String = js.native
    
    /* "TopRight" */ val TopRight: typings.nukaCarousel.libTypesMod.Positions.TopRight & String = js.native
  }
  
  inline def PreviousButton(
    hasPreviousSlideHasPrevButtonClassNamePrevButtonStylePrevButtonTextPrevButtonOnClickOnUserNavigationDisabled: ControlProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreviousButton")(hasPreviousSlideHasPrevButtonClassNamePrevButtonStylePrevButtonTextPrevButtonOnClickOnUserNavigationDisabled.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("nuka-carousel", "ScrollMode")
  @js.native
  object ScrollMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nukaCarousel.libTypesMod.ScrollMode & String] = js.native
    
    /* "page" */ val page: typings.nukaCarousel.libTypesMod.ScrollMode.page & String = js.native
    
    /* "remainder" */ val remainder: typings.nukaCarousel.libTypesMod.ScrollMode.remainder & String = js.native
  }
}
