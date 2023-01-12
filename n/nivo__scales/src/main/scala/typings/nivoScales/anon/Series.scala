package typings.nivoScales.anon

import typings.d3Scale.mod.NumberValue
import typings.nivoScales.distTypesComputeMod.ComputedSerie
import typings.nivoScales.distTypesComputeMod.SerieDatum
import typings.nivoScales.distTypesTypesMod.ScaleBand
import typings.nivoScales.distTypesTypesMod.ScaleLinear
import typings.nivoScales.distTypesTypesMod.ScaleLog
import typings.nivoScales.distTypesTypesMod.ScalePoint
import typings.nivoScales.distTypesTypesMod.ScaleSymlog
import typings.nivoScales.distTypesTypesMod.ScaleTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Series[S, D /* <: SerieDatum */] extends StObject {
  
  var series: js.Array[ComputedSerie[S, D]]
  
  var x: All
  
  var xScale: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
    /* import warning: importer.ImportType#apply Failed type conversion: D['x'] */ js.Any
  ]) | (ScaleBand[
    /* import warning: importer.ImportType#apply Failed type conversion: D['x'] */ js.Any
  ])
  
  var y: All
  
  var yScale: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
    /* import warning: importer.ImportType#apply Failed type conversion: D['y'] */ js.Any
  ]) | (ScaleBand[
    /* import warning: importer.ImportType#apply Failed type conversion: D['y'] */ js.Any
  ])
}
object Series {
  
  inline def apply[S, D /* <: SerieDatum */](
    series: js.Array[ComputedSerie[S, D]],
    x: All,
    xScale: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
      /* import warning: importer.ImportType#apply Failed type conversion: D['x'] */ js.Any
    ]) | (ScaleBand[
      /* import warning: importer.ImportType#apply Failed type conversion: D['x'] */ js.Any
    ]),
    y: All,
    yScale: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
      /* import warning: importer.ImportType#apply Failed type conversion: D['y'] */ js.Any
    ]) | (ScaleBand[
      /* import warning: importer.ImportType#apply Failed type conversion: D['y'] */ js.Any
    ])
  ): Series[S, D] = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Series[S, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Series[?, ?], S, D /* <: SerieDatum */] (val x: Self & (Series[S, D])) extends AnyVal {
    
    inline def setSeries(value: js.Array[ComputedSerie[S, D]]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesVarargs(value: (ComputedSerie[S, D])*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setX(value: All): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXScale(
      value: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
          /* import warning: importer.ImportType#apply Failed type conversion: D['x'] */ js.Any
        ]) | (ScaleBand[
          /* import warning: importer.ImportType#apply Failed type conversion: D['x'] */ js.Any
        ])
    ): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setY(value: All): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYScale(
      value: ScaleLog | ScaleSymlog | ScaleLinear[Double] | (ScaleTime[js.Date | NumberValue]) | (ScalePoint[
          /* import warning: importer.ImportType#apply Failed type conversion: D['y'] */ js.Any
        ]) | (ScaleBand[
          /* import warning: importer.ImportType#apply Failed type conversion: D['y'] */ js.Any
        ])
    ): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
