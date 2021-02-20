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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait LinearScale extends Scale {
    
    var max: js.UndefOr[auto | Double] = js.native
    
    var min: js.UndefOr[auto | Double] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var stacked: js.UndefOr[Boolean] = js.native
    
    var `type`: linear = js.native
  }
  object LinearScale {
    
    @scala.inline
    def apply(`type`: linear): LinearScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearScale]
    }
    
    @scala.inline
    implicit class LinearScaleMutableBuilder[Self <: LinearScale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      @scala.inline
      def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogScale extends Scale {
    
    var base: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[auto | Double] = js.native
    
    var min: js.UndefOr[auto | Double] = js.native
    
    var `type`: log = js.native
  }
  object LogScale {
    
    @scala.inline
    def apply(`type`: log): LogScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogScale]
    }
    
    @scala.inline
    implicit class LogScaleMutableBuilder[Self <: LogScale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PointScale extends Scale {
    
    var `type`: point = js.native
  }
  object PointScale {
    
    @scala.inline
    def apply(`type`: point): PointScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointScale]
    }
    
    @scala.inline
    implicit class PointScaleMutableBuilder[Self <: PointScale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def LinearScale(`type`: linear): typings.nivoScales.mod.LinearScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoScales.mod.LinearScale]
    }
    
    @scala.inline
    def LogScale(`type`: log): typings.nivoScales.mod.LogScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoScales.mod.LogScale]
    }
    
    @scala.inline
    def PointScale(`type`: point): typings.nivoScales.mod.PointScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoScales.mod.PointScale]
    }
    
    @scala.inline
    def SymlogScale(`type`: symlog): typings.nivoScales.mod.SymlogScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoScales.mod.SymlogScale]
    }
    
    @scala.inline
    def TimeScale(`type`: time): typings.nivoScales.mod.TimeScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoScales.mod.TimeScale]
    }
    
    @scala.inline
    def TimeScaleFormatted(format: String, `type`: time): typings.nivoScales.mod.TimeScaleFormatted = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoScales.mod.TimeScaleFormatted]
    }
  }
  
  type ScaleFunc = js.Function1[/* value */ String | Double | Date, Double]
  
  @js.native
  trait SymlogScale extends Scale {
    
    var constant: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[auto | Double] = js.native
    
    var min: js.UndefOr[auto | Double] = js.native
    
    var `type`: symlog = js.native
  }
  object SymlogScale {
    
    @scala.inline
    def apply(`type`: symlog): SymlogScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymlogScale]
    }
    
    @scala.inline
    implicit class SymlogScaleMutableBuilder[Self <: SymlogScale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstant(value: Double): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      @scala.inline
      def setMax(value: auto | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: auto | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setType(value: symlog): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimeScale extends Scale {
    
    var max: js.UndefOr[auto | Date] = js.native
    
    var min: js.UndefOr[auto | Date] = js.native
    
    var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.native
    
    var `type`: time = js.native
    
    var useUTC: js.UndefOr[Boolean] = js.native
  }
  object TimeScale {
    
    @scala.inline
    def apply(`type`: time): TimeScale = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeScale]
    }
    
    @scala.inline
    implicit class TimeScaleMutableBuilder[Self <: TimeScale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: auto | Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: auto | Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPrecision(value: millisecond | second | minute | hour | month | year | day): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setType(value: time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUTCUndefined: Self = StObject.set(x, "useUTC", js.undefined)
    }
  }
  
  @js.native
  trait TimeScaleFormatted extends Scale {
    
    var format: String = js.native
    
    var max: js.UndefOr[auto | String] = js.native
    
    var min: js.UndefOr[auto | String] = js.native
    
    var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.native
    
    var `type`: time = js.native
    
    var useUTC: js.UndefOr[Boolean] = js.native
  }
  object TimeScaleFormatted {
    
    @scala.inline
    def apply(format: String, `type`: time): TimeScaleFormatted = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeScaleFormatted]
    }
    
    @scala.inline
    implicit class TimeScaleFormattedMutableBuilder[Self <: TimeScaleFormatted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: auto | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: auto | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPrecision(value: millisecond | second | minute | hour | month | year | day): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setType(value: time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUTCUndefined: Self = StObject.set(x, "useUTC", js.undefined)
    }
  }
}
