package typings.nivoCirclePacking

import typings.nivoCirclePacking.distTypesTypesMod.CircleProps
import typings.react.mod.global.JSX.Element
import typings.reactSpringWeb.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircleHtmlMod {
  
  @JSImport("@nivo/circle-packing/dist/types/CircleHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CircleHtml[RawDatum](param0: CircleProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CircleHtml")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def interpolateBorderWidth(borderWidth: Double, radiusValue: Interpolation[Double, Any]): Interpolation[Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateBorderWidth")(borderWidth.asInstanceOf[js.Any], radiusValue.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Double, Any]]
  
  inline def interpolatePosition(positionValue: SpringValue[Double], radiusValue: Interpolation[Double, Any]): Interpolation[Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePosition")(positionValue.asInstanceOf[js.Any], radiusValue.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Double, Any]]
  
  inline def interpolateSize(radiusValue: Interpolation[Double, Any]): Interpolation[Double, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSize")(radiusValue.asInstanceOf[js.Any]).asInstanceOf[Interpolation[Double, Any]]
}
