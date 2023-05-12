package typings.nivoScales.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleTypeToScale[Input, Output] extends StObject {
  
  var band: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleBand<Input> : never */ js.Any
  
  var linear: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleLinear<Output> : never */ js.Any
  
  var log: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleLog : never */ js.Any
  
  var point: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue ? @nivo/scales.@nivo/scales/dist/types/types.ScalePoint<Input> : never */ js.Any
  
  var symlog: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleSymlog : never */ js.Any
  
  var time: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue | std.Date ? @nivo/scales.@nivo/scales/dist/types/types.ScaleTime<Input> : never */ js.Any
}
object ScaleTypeToScale {
  
  inline def apply[Input, Output](
    band: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleBand<Input> : never */ js.Any,
    linear: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleLinear<Output> : never */ js.Any,
    log: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleLog : never */ js.Any,
    point: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue ? @nivo/scales.@nivo/scales/dist/types/types.ScalePoint<Input> : never */ js.Any,
    symlog: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleSymlog : never */ js.Any,
    time: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue | std.Date ? @nivo/scales.@nivo/scales/dist/types/types.ScaleTime<Input> : never */ js.Any
  ): ScaleTypeToScale[Input, Output] = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], symlog = symlog.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleTypeToScale[Input, Output]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleTypeToScale[?, ?], Input, Output] (val x: Self & (ScaleTypeToScale[Input, Output])) extends AnyVal {
    
    inline def setBand(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleBand<Input> : never */ js.Any
    ): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setLinear(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleLinear<Output> : never */ js.Any
    ): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLog(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleLog : never */ js.Any
    ): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setPoint(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue ? @nivo/scales.@nivo/scales/dist/types/types.ScalePoint<Input> : never */ js.Any
    ): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setSymlog(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.NumericValue ? @nivo/scales.@nivo/scales/dist/types/types.ScaleSymlog : never */ js.Any
    ): Self = StObject.set(x, "symlog", value.asInstanceOf[js.Any])
    
    inline def setTime(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Input extends @nivo/scales.@nivo/scales/dist/types/types.StringValue | std.Date ? @nivo/scales.@nivo/scales/dist/types/types.ScaleTime<Input> : never */ js.Any
    ): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
