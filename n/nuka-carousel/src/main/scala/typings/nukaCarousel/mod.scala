package typings.nukaCarousel

import typings.nukaCarousel.typesMod.CarouselProps
import typings.nukaCarousel.typesMod.ControlProps
import typings.nukaCarousel.typesMod.InternalCarouselProps
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
    def apply(value: String): js.UndefOr[typings.nukaCarousel.typesMod.Alignment & String] = js.native
    
    /* "center" */ val Center: typings.nukaCarousel.typesMod.Alignment.Center & String = js.native
    
    /* "left" */ val Left: typings.nukaCarousel.typesMod.Alignment.Left & String = js.native
    
    /* "right" */ val Right: typings.nukaCarousel.typesMod.Alignment.Right & String = js.native
  }
  
  @JSImport("nuka-carousel", "Directions")
  @js.native
  object Directions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nukaCarousel.typesMod.Directions & String] = js.native
    
    /* "down" */ val Down: typings.nukaCarousel.typesMod.Directions.Down & String = js.native
    
    /* "next" */ val Next: typings.nukaCarousel.typesMod.Directions.Next & String = js.native
    
    /* "prev" */ val Prev: typings.nukaCarousel.typesMod.Directions.Prev & String = js.native
    
    /* "up" */ val Up: typings.nukaCarousel.typesMod.Directions.Up & String = js.native
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
    def apply(value: String): js.UndefOr[typings.nukaCarousel.typesMod.Positions & String] = js.native
    
    /* "BottomCenter" */ val BottomCenter: typings.nukaCarousel.typesMod.Positions.BottomCenter & String = js.native
    
    /* "BottomLeft" */ val BottomLeft: typings.nukaCarousel.typesMod.Positions.BottomLeft & String = js.native
    
    /* "BottomRight" */ val BottomRight: typings.nukaCarousel.typesMod.Positions.BottomRight & String = js.native
    
    /* "CenterCenter" */ val CenterCenter: typings.nukaCarousel.typesMod.Positions.CenterCenter & String = js.native
    
    /* "CenterLeft" */ val CenterLeft: typings.nukaCarousel.typesMod.Positions.CenterLeft & String = js.native
    
    /* "CenterRight" */ val CenterRight: typings.nukaCarousel.typesMod.Positions.CenterRight & String = js.native
    
    /* "TopCenter" */ val TopCenter: typings.nukaCarousel.typesMod.Positions.TopCenter & String = js.native
    
    /* "TopLeft" */ val TopLeft: typings.nukaCarousel.typesMod.Positions.TopLeft & String = js.native
    
    /* "TopRight" */ val TopRight: typings.nukaCarousel.typesMod.Positions.TopRight & String = js.native
  }
  
  inline def PreviousButton(
    hasPreviousSlideHasPrevButtonClassNamePrevButtonStylePrevButtonTextPrevButtonOnClickOnUserNavigationDisabled: ControlProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreviousButton")(hasPreviousSlideHasPrevButtonClassNamePrevButtonStylePrevButtonTextPrevButtonOnClickOnUserNavigationDisabled.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("nuka-carousel", "ScrollMode")
  @js.native
  object ScrollMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nukaCarousel.typesMod.ScrollMode & String] = js.native
    
    /* "page" */ val page: typings.nukaCarousel.typesMod.ScrollMode.page & String = js.native
    
    /* "remainder" */ val remainder: typings.nukaCarousel.typesMod.ScrollMode.remainder & String = js.native
  }
}
