package typings.nivoArcs.anon

import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoArcs.nivoArcsStrings.end
import typings.nivoArcs.nivoArcsStrings.start
import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.mod.Interpolation
import typings.reactSpringCore.mod.TransitionFn
import typings.reactSpringCore.mod.TransitionRenderFn
import typings.reactSpringWeb.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolateLink[Datum /* <: DatumWithArcAndColor */] extends StObject {
  
  def interpolateLink(
    startAngleValue: SpringValue[Double],
    endAngleValue: SpringValue[Double],
    innerRadiusValue: SpringValue[Double],
    outerRadiusValue: SpringValue[Double],
    offsetValue: SpringValue[Double],
    diagonalLengthValue: SpringValue[Double],
    straightLengthValue: SpringValue[Double]
  ): Interpolation[String | Null, Any]
  
  def interpolateTextAnchor(
    startAngleValue: SpringValue[Double],
    endAngleValue: SpringValue[Double],
    innerRadiusValue: SpringValue[Double],
    outerRadiusValue: SpringValue[Double]
  ): Interpolation[end | start, Any]
  
  def interpolateTextPosition(
    startAngleValue: SpringValue[Double],
    endAngleValue: SpringValue[Double],
    innerRadiusValue: SpringValue[Double],
    outerRadiusValue: SpringValue[Double],
    offsetValue: SpringValue[Double],
    diagonalLengthValue: SpringValue[Double],
    straightLengthValue: SpringValue[Double],
    textOffsetValue: SpringValue[Double]
  ): Interpolation[String, Any]
  
  var transition: TransitionFn[Datum, InnerRadius]
}
object InterpolateLink {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](
    interpolateLink: (SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double]) => Interpolation[String | Null, Any],
    interpolateTextAnchor: (SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double]) => Interpolation[end | start, Any],
    interpolateTextPosition: (SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double]) => Interpolation[String, Any],
    transition: /* render */ TransitionRenderFn[Datum, InnerRadius] => Element
  ): InterpolateLink[Datum] = {
    val __obj = js.Dynamic.literal(interpolateLink = js.Any.fromFunction7(interpolateLink), interpolateTextAnchor = js.Any.fromFunction4(interpolateTextAnchor), interpolateTextPosition = js.Any.fromFunction8(interpolateTextPosition), transition = js.Any.fromFunction1(transition))
    __obj.asInstanceOf[InterpolateLink[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolateLink[?], Datum /* <: DatumWithArcAndColor */] (val x: Self & InterpolateLink[Datum]) extends AnyVal {
    
    inline def setInterpolateLink(
      value: (SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double]) => Interpolation[String | Null, Any]
    ): Self = StObject.set(x, "interpolateLink", js.Any.fromFunction7(value))
    
    inline def setInterpolateTextAnchor(
      value: (SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double]) => Interpolation[end | start, Any]
    ): Self = StObject.set(x, "interpolateTextAnchor", js.Any.fromFunction4(value))
    
    inline def setInterpolateTextPosition(
      value: (SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double], SpringValue[Double]) => Interpolation[String, Any]
    ): Self = StObject.set(x, "interpolateTextPosition", js.Any.fromFunction8(value))
    
    inline def setTransition(value: /* render */ TransitionRenderFn[Datum, InnerRadius] => Element): Self = StObject.set(x, "transition", js.Any.fromFunction1(value))
  }
}
