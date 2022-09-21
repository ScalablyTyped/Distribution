package typings.nivoScales.anon

import typings.d3Scale.mod.NumberValue
import typings.nivoScales.computeMod.ComputedSerie
import typings.nivoScales.computeMod.SerieDatum
import typings.nivoScales.typesMod.ScaleBand
import typings.nivoScales.typesMod.ScaleLinear
import typings.nivoScales.typesMod.ScaleLog
import typings.nivoScales.typesMod.ScalePoint
import typings.nivoScales.typesMod.ScaleSymlog
import typings.nivoScales.typesMod.ScaleTime
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
  
  extension [Self <: Series[?, ?], S, D /* <: SerieDatum */](x: Self & (Series[S, D])) {
    
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
