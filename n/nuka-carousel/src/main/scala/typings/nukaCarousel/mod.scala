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
  
  @JSImport("nuka-carousel", "D3EasingFunctions")
  @js.native
  object D3EasingFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nukaCarousel.typesMod.D3EasingFunctions & String] = js.native
    
    /* "easeBack" */ val EaseBack: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseBack & String = js.native
    
    /* "easeBackIn" */ val EaseBackIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseBackIn & String = js.native
    
    /* "easeBackInOut" */ val EaseBackInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseBackInOut & String = js.native
    
    /* "easeBackOut" */ val EaseBackOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseBackOut & String = js.native
    
    /* "easeBounce" */ val EaseBounce: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseBounce & String = js.native
    
    /* "easeBounceIn" */ val EaseBounceIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseBounceIn & String = js.native
    
    /* "easeBounceInOut" */ val EaseBounceInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseBounceInOut & String = js.native
    
    /* "easeBounceOut" */ val EaseBounceOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseBounceOut & String = js.native
    
    /* "easeCircle" */ val EaseCircle: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseCircle & String = js.native
    
    /* "easeCircleIn" */ val EaseCircleIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseCircleIn & String = js.native
    
    /* "easeCircleInOut" */ val EaseCircleInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseCircleInOut & String = js.native
    
    /* "easeCircleOut" */ val EaseCircleOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseCircleOut & String = js.native
    
    /* "easeCubic" */ val EaseCubic: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseCubic & String = js.native
    
    /* "easeCubicIn" */ val EaseCubicIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseCubicIn & String = js.native
    
    /* "easeCubicInOut" */ val EaseCubicInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseCubicInOut & String = js.native
    
    /* "easeCubicOut" */ val EaseCubicOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseCubicOut & String = js.native
    
    /* "easeElastic" */ val EaseElastic: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseElastic & String = js.native
    
    /* "easeElasticIn" */ val EaseElasticIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseElasticIn & String = js.native
    
    /* "easeElasticInOut" */ val EaseElasticInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseElasticInOut & String = js.native
    
    /* "easeElasticOut" */ val EaseElasticOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseElasticOut & String = js.native
    
    /* "easeExp" */ val EaseExp: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseExp & String = js.native
    
    /* "easeExpIn" */ val EaseExpIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseExpIn & String = js.native
    
    /* "easeExpInOut" */ val EaseExpInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseExpInOut & String = js.native
    
    /* "easeExpOut" */ val EaseExpOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseExpOut & String = js.native
    
    /* "easeLinear" */ val EaseLinear: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseLinear & String = js.native
    
    /* "easePoly" */ val EasePoly: typings.nukaCarousel.typesMod.D3EasingFunctions.EasePoly & String = js.native
    
    /* "easePolyIn" */ val EasePolyIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EasePolyIn & String = js.native
    
    /* "easePolyInOut" */ val EasePolyInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EasePolyInOut & String = js.native
    
    /* "easePolyOut" */ val EasePolyOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EasePolyOut & String = js.native
    
    /* "easeQuad" */ val EaseQuad: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseQuad & String = js.native
    
    /* "easeQuadIn" */ val EaseQuadIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseQuadIn & String = js.native
    
    /* "easeQuadInOut" */ val EaseQuadInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseQuadInOut & String = js.native
    
    /* "easeQuadOut" */ val EaseQuadOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseQuadOut & String = js.native
    
    /* "easeSin" */ val EaseSin: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseSin & String = js.native
    
    /* "easeSinIn" */ val EaseSinIn: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseSinIn & String = js.native
    
    /* "easeSinInOut" */ val EaseSinInOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseSinInOut & String = js.native
    
    /* "easeSinOut" */ val EaseSinOut: typings.nukaCarousel.typesMod.D3EasingFunctions.EaseSinOut & String = js.native
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
  
  inline def NextButton(props: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NextButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PagingDots(props: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PagingDots")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
  
  inline def PreviousButton(props: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreviousButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("nuka-carousel", "ScrollMode")
  @js.native
  object ScrollMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nukaCarousel.typesMod.ScrollMode & String] = js.native
    
    /* "page" */ val page: typings.nukaCarousel.typesMod.ScrollMode.page & String = js.native
    
    /* "remainder" */ val remainder: typings.nukaCarousel.typesMod.ScrollMode.remainder & String = js.native
  }
}
