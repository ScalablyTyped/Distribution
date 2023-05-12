package typings.nivoAxes.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaHidden extends StObject {
  
  var ariaHidden: Requireable[Boolean]
  
  var format: Requireable[NonNullable[js.UndefOr[String | (js.Function1[/* repeated */ Any, Any]) | Null]]]
  
  var legend: Requireable[ReactNodeLike]
  
  var legendOffset: Requireable[Double]
  
  var legendPosition: Requireable[String]
  
  var renderTick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var tickPadding: Requireable[Double]
  
  var tickRotation: Requireable[Double]
  
  var tickSize: Requireable[Double]
  
  var tickValues: Requireable[
    NonNullable[
      js.UndefOr[
        String | Double | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | Double | js.Date | Null]]) | Null]]) | Null
      ]
    ]
  ]
  
  var ticksPosition: Requireable[String]
}
object AriaHidden {
  
  inline def apply(
    ariaHidden: Requireable[Boolean],
    format: Requireable[NonNullable[js.UndefOr[String | (js.Function1[/* repeated */ Any, Any]) | Null]]],
    legend: Requireable[ReactNodeLike],
    legendOffset: Requireable[Double],
    legendPosition: Requireable[String],
    renderTick: Requireable[js.Function1[/* repeated */ Any, Any]],
    tickPadding: Requireable[Double],
    tickRotation: Requireable[Double],
    tickSize: Requireable[Double],
    tickValues: Requireable[
      NonNullable[
        js.UndefOr[
          String | Double | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | Double | js.Date | Null]]) | Null]]) | Null
        ]
      ]
    ],
    ticksPosition: Requireable[String]
  ): AriaHidden = {
    val __obj = js.Dynamic.literal(ariaHidden = ariaHidden.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], legendOffset = legendOffset.asInstanceOf[js.Any], legendPosition = legendPosition.asInstanceOf[js.Any], renderTick = renderTick.asInstanceOf[js.Any], tickPadding = tickPadding.asInstanceOf[js.Any], tickRotation = tickRotation.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickValues = tickValues.asInstanceOf[js.Any], ticksPosition = ticksPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaHidden]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaHidden] (val x: Self) extends AnyVal {
    
    inline def setAriaHidden(value: Requireable[Boolean]): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
    
    inline def setFormat(
      value: Requireable[NonNullable[js.UndefOr[String | (js.Function1[/* repeated */ Any, Any]) | Null]]]
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendOffset(value: Requireable[Double]): Self = StObject.set(x, "legendOffset", value.asInstanceOf[js.Any])
    
    inline def setLegendPosition(value: Requireable[String]): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setRenderTick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "renderTick", value.asInstanceOf[js.Any])
    
    inline def setTickPadding(value: Requireable[Double]): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
    
    inline def setTickRotation(value: Requireable[Double]): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
    
    inline def setTickSize(value: Requireable[Double]): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    inline def setTickValues(
      value: Requireable[
          NonNullable[
            js.UndefOr[
              String | Double | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | Double | js.Date | Null]]) | Null]]) | Null
            ]
          ]
        ]
    ): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    inline def setTicksPosition(value: Requireable[String]): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
  }
}
