package typings.nivoScales

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.day
import typings.nivoScales.nivoScalesStrings.hour
import typings.nivoScales.nivoScalesStrings.linear
import typings.nivoScales.nivoScalesStrings.log
import typings.nivoScales.nivoScalesStrings.millisecond
import typings.nivoScales.nivoScalesStrings.minute
import typings.nivoScales.nivoScalesStrings.month
import typings.nivoScales.nivoScalesStrings.point
import typings.nivoScales.nivoScalesStrings.second
import typings.nivoScales.nivoScalesStrings.symlog
import typings.nivoScales.nivoScalesStrings.time
import typings.nivoScales.nivoScalesStrings.year
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait LinearScale
    extends StObject
       with Scale {
    
    var max: js.UndefOr[auto | Double] = js.undefined
    
    var min: js.UndefOr[auto | Double] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    var `type`: linear
  }
  object LinearScale {
    
    inline def apply(): LinearScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("linear")
      __obj.asInstanceOf[LinearScale]
    }
    
    extension [Self <: LinearScale](x: Self) {
      
      inline def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogScale
    extends StObject
       with Scale {
    
    var base: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[auto | Double] = js.undefined
    
    var min: js.UndefOr[auto | Double] = js.undefined
    
    var `type`: log
  }
  object LogScale {
    
    inline def apply(): LogScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("log")
      __obj.asInstanceOf[LogScale]
    }
    
    extension [Self <: LogScale](x: Self) {
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointScale
    extends StObject
       with Scale {
    
    var `type`: point
  }
  object PointScale {
    
    inline def apply(): PointScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("point")
      __obj.asInstanceOf[PointScale]
    }
    
    extension [Self <: PointScale](x: Self) {
      
      inline def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoScales.mod.LinearScale
    - typings.nivoScales.mod.PointScale
    - typings.nivoScales.mod.TimeScale
    - typings.nivoScales.mod.TimeScaleFormatted
    - typings.nivoScales.mod.LogScale
    - typings.nivoScales.mod.SymlogScale
  */
  trait Scale extends StObject
  object Scale {
    
    inline def LinearScale(): typings.nivoScales.mod.LinearScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("linear")
      __obj.asInstanceOf[typings.nivoScales.mod.LinearScale]
    }
    
    inline def LogScale(): typings.nivoScales.mod.LogScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("log")
      __obj.asInstanceOf[typings.nivoScales.mod.LogScale]
    }
    
    inline def PointScale(): typings.nivoScales.mod.PointScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("point")
      __obj.asInstanceOf[typings.nivoScales.mod.PointScale]
    }
    
    inline def SymlogScale(): typings.nivoScales.mod.SymlogScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("symlog")
      __obj.asInstanceOf[typings.nivoScales.mod.SymlogScale]
    }
    
    inline def TimeScale(): typings.nivoScales.mod.TimeScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("time")
      __obj.asInstanceOf[typings.nivoScales.mod.TimeScale]
    }
    
    inline def TimeScaleFormatted(format: String): typings.nivoScales.mod.TimeScaleFormatted = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("time")
      __obj.asInstanceOf[typings.nivoScales.mod.TimeScaleFormatted]
    }
  }
  
  type ScaleFunc = js.Function1[/* value */ String | Double | Date, Double]
  
  trait SymlogScale
    extends StObject
       with Scale {
    
    var constant: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[auto | Double] = js.undefined
    
    var min: js.UndefOr[auto | Double] = js.undefined
    
    var `type`: symlog
  }
  object SymlogScale {
    
    inline def apply(): SymlogScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("symlog")
      __obj.asInstanceOf[SymlogScale]
    }
    
    extension [Self <: SymlogScale](x: Self) {
      
      inline def setConstant(value: Double): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      inline def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: symlog): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeScale
    extends StObject
       with Scale {
    
    var max: js.UndefOr[auto | Date] = js.undefined
    
    var min: js.UndefOr[auto | Date] = js.undefined
    
    var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.undefined
    
    var `type`: time
    
    var useUTC: js.UndefOr[Boolean] = js.undefined
  }
  object TimeScale {
    
    inline def apply(): TimeScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("time")
      __obj.asInstanceOf[TimeScale]
    }
    
    extension [Self <: TimeScale](x: Self) {
      
      inline def setMax(value: auto | Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: auto | Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPrecision(value: millisecond | second | minute | hour | month | year | day): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setType(value: time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
      
      inline def setUseUTCUndefined: Self = StObject.set(x, "useUTC", js.undefined)
    }
  }
  
  trait TimeScaleFormatted
    extends StObject
       with Scale {
    
    var format: String
    
    var max: js.UndefOr[auto | String] = js.undefined
    
    var min: js.UndefOr[auto | String] = js.undefined
    
    var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.undefined
    
    var `type`: time
    
    var useUTC: js.UndefOr[Boolean] = js.undefined
  }
  object TimeScaleFormatted {
    
    inline def apply(format: String): TimeScaleFormatted = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("time")
      __obj.asInstanceOf[TimeScaleFormatted]
    }
    
    extension [Self <: TimeScaleFormatted](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setMax(value: auto | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: auto | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPrecision(value: millisecond | second | minute | hour | month | year | day): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setType(value: time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
      
      inline def setUseUTCUndefined: Self = StObject.set(x, "useUTC", js.undefined)
    }
  }
}
