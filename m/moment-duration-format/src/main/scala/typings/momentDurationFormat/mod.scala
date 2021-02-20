package typings.momentDurationFormat

import typings.momentDurationFormat.anon.FnCall
import typings.momentDurationFormat.momentDurationFormatBooleans.`false`
import typings.momentDurationFormat.momentDurationFormatBooleans.`true`
import typings.momentDurationFormat.momentDurationFormatStrings.m_
import typings.momentDurationFormat.momentDurationFormatStrings.mm_
import typings.momentDurationFormat.momentDurationFormatStrings.mmm_
import typings.momentDurationFormat.momentDurationFormatStrings.s_
import typings.momentDurationFormat.momentDurationFormatStrings.ss_
import typings.momentDurationFormat.momentDurationFormatStrings.sss_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-duration-format", JSImport.Namespace)
  @js.native
  def apply(_moment: FnCall): Unit = js.native
  
  /* augmented module */
  object momentAugmentingMod {
    
    object duration {
      
      @JSImport("moment", "duration.fn")
      @js.native
      val fn: Duration_ = js.native
    }
    
    @js.native
    trait DurationFormatSettings extends StObject {
      
      var decimalSeparator: js.UndefOr[String] = js.native
      
      var forceLength: js.UndefOr[Boolean] = js.native
      
      var grouping: js.UndefOr[js.Array[Double]] = js.native
      
      var groupingSeparator: js.UndefOr[String] = js.native
      
      var largest: js.UndefOr[Double] = js.native
      
      var maxValue: js.UndefOr[Double] = js.native
      
      var minValue: js.UndefOr[Double] = js.native
      
      var precision: js.UndefOr[Double] = js.native
      
      var stopTrim: js.UndefOr[String] = js.native
      
      var template: js.UndefOr[String | TemplateFunction] = js.native
      
      var trim: js.UndefOr[`false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])] = js.native
      
      var trunc: js.UndefOr[`true`] = js.native
      
      var useGrouping: js.UndefOr[Boolean] = js.native
      
      var useLeftUnits: js.UndefOr[Boolean] = js.native
      
      var usePlural: js.UndefOr[Boolean] = js.native
      
      var useSignificantDigits: js.UndefOr[`true`] = js.native
      
      var useToLocaleString: js.UndefOr[Boolean] = js.native
      
      var userLocale: js.UndefOr[String] = js.native
    }
    object DurationFormatSettings {
      
      @scala.inline
      def apply(): DurationFormatSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DurationFormatSettings]
      }
      
      @scala.inline
      implicit class DurationFormatSettingsMutableBuilder[Self <: DurationFormatSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
        
        @scala.inline
        def setForceLength(value: Boolean): Self = StObject.set(x, "forceLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceLengthUndefined: Self = StObject.set(x, "forceLength", js.undefined)
        
        @scala.inline
        def setGrouping(value: js.Array[Double]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupingSeparator(value: String): Self = StObject.set(x, "groupingSeparator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupingSeparatorUndefined: Self = StObject.set(x, "groupingSeparator", js.undefined)
        
        @scala.inline
        def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
        
        @scala.inline
        def setGroupingVarargs(value: Double*): Self = StObject.set(x, "grouping", js.Array(value :_*))
        
        @scala.inline
        def setLargest(value: Double): Self = StObject.set(x, "largest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLargestUndefined: Self = StObject.set(x, "largest", js.undefined)
        
        @scala.inline
        def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
        
        @scala.inline
        def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
        
        @scala.inline
        def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
        
        @scala.inline
        def setStopTrim(value: String): Self = StObject.set(x, "stopTrim", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopTrimUndefined: Self = StObject.set(x, "stopTrim", js.undefined)
        
        @scala.inline
        def setTemplate(value: String | TemplateFunction): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        @scala.inline
        def setTrim(value: `false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
        
        @scala.inline
        def setTrimVarargs(value: (UnitOfTrim | String)*): Self = StObject.set(x, "trim", js.Array(value :_*))
        
        @scala.inline
        def setTrunc(value: `true`): Self = StObject.set(x, "trunc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTruncUndefined: Self = StObject.set(x, "trunc", js.undefined)
        
        @scala.inline
        def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
        
        @scala.inline
        def setUseLeftUnits(value: Boolean): Self = StObject.set(x, "useLeftUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseLeftUnitsUndefined: Self = StObject.set(x, "useLeftUnits", js.undefined)
        
        @scala.inline
        def setUsePlural(value: Boolean): Self = StObject.set(x, "usePlural", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsePluralUndefined: Self = StObject.set(x, "usePlural", js.undefined)
        
        @scala.inline
        def setUseSignificantDigits(value: `true`): Self = StObject.set(x, "useSignificantDigits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseSignificantDigitsUndefined: Self = StObject.set(x, "useSignificantDigits", js.undefined)
        
        @scala.inline
        def setUseToLocaleString(value: Boolean): Self = StObject.set(x, "useToLocaleString", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseToLocaleStringUndefined: Self = StObject.set(x, "useToLocaleString", js.undefined)
        
        @scala.inline
        def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
      }
    }
    
    /* Inlined {[ duration in moment-duration-format.moment-duration-format.moment.DurationToken ]: string} */
    @js.native
    trait DurationLabelDef extends StObject {
      
      var M: String = js.native
      
      var MM: String = js.native
      
      var MMM: String = js.native
      
      var S: String = js.native
      
      var SS: String = js.native
      
      var SSS: String = js.native
      
      var d: String = js.native
      
      var dd: String = js.native
      
      var ddd: String = js.native
      
      var h: String = js.native
      
      var hh: String = js.native
      
      var hhh: String = js.native
      
      var m: String = js.native
      
      var mm: String = js.native
      
      var mmm: String = js.native
      
      var s: String = js.native
      
      var ss: String = js.native
      
      var sss: String = js.native
      
      var w: String = js.native
      
      var ww: String = js.native
      
      var www: String = js.native
      
      var y: String = js.native
      
      var yy: String = js.native
      
      var yyy: String = js.native
    }
    object DurationLabelDef {
      
      @scala.inline
      def apply(
        M: String,
        MM: String,
        MMM: String,
        S: String,
        SS: String,
        SSS: String,
        d: String,
        dd: String,
        ddd: String,
        h: String,
        hh: String,
        hhh: String,
        m: String,
        mm: String,
        mmm: String,
        s: String,
        ss: String,
        sss: String,
        w: String,
        ww: String,
        www: String,
        y: String,
        yy: String,
        yyy: String
      ): DurationLabelDef = {
        val __obj = js.Dynamic.literal(M = M.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], MMM = MMM.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], SS = SS.asInstanceOf[js.Any], SSS = SSS.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], ddd = ddd.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], hhh = hhh.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], mmm = mmm.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any], sss = sss.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], ww = ww.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any], yyy = yyy.asInstanceOf[js.Any])
        __obj.asInstanceOf[DurationLabelDef]
      }
      
      @scala.inline
      implicit class DurationLabelDefMutableBuilder[Self <: DurationLabelDef] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDd(value: String): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDdd(value: String): Self = StObject.set(x, "ddd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHh(value: String): Self = StObject.set(x, "hh", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHhh(value: String): Self = StObject.set(x, "hhh", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMM(value: String): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMMM(value: String): Self = StObject.set(x, "MMM", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSS(value: String): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSSS(value: String): Self = StObject.set(x, "SSS", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWw(value: String): Self = StObject.set(x, "ww", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWww(value: String): Self = StObject.set(x, "www", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYy(value: String): Self = StObject.set(x, "yy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYyy(value: String): Self = StObject.set(x, "yyy", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.momentDurationFormat.momentDurationFormatStrings.long
      - typings.momentDurationFormat.momentDurationFormatStrings.standard
      - typings.momentDurationFormat.momentDurationFormatStrings.short
    */
    trait DurationLabelType extends StObject
    object DurationLabelType {
      
      @scala.inline
      def long: typings.momentDurationFormat.momentDurationFormatStrings.long = "long".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.long]
      
      @scala.inline
      def short: typings.momentDurationFormat.momentDurationFormatStrings.short = "short".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.short]
      
      @scala.inline
      def standard: typings.momentDurationFormat.momentDurationFormatStrings.standard = "standard".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.standard]
    }
    
    @js.native
    trait DurationLabelTypeDef extends StObject {
      
      var string: String = js.native
      
      var `type`: DurationLabelType = js.native
    }
    object DurationLabelTypeDef {
      
      @scala.inline
      def apply(string: String, `type`: DurationLabelType): DurationLabelTypeDef = {
        val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[DurationLabelTypeDef]
      }
      
      @scala.inline
      implicit class DurationLabelTypeDefMutableBuilder[Self <: DurationLabelTypeDef] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: DurationLabelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.momentDurationFormat.momentDurationFormatStrings.HMS
      - typings.momentDurationFormat.momentDurationFormatStrings.HM
      - typings.momentDurationFormat.momentDurationFormatStrings.MS
    */
    trait DurationTemplate extends StObject
    object DurationTemplate {
      
      @scala.inline
      def HM: typings.momentDurationFormat.momentDurationFormatStrings.HM = "HM".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.HM]
      
      @scala.inline
      def HMS: typings.momentDurationFormat.momentDurationFormatStrings.HMS = "HMS".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.HMS]
      
      @scala.inline
      def MS: typings.momentDurationFormat.momentDurationFormatStrings.MS = "MS".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.MS]
    }
    
    /* Inlined {[ template in moment-duration-format.moment-duration-format.moment.DurationTemplate ]: string} */
    @js.native
    trait DurationTimeDef extends StObject {
      
      var HM: String = js.native
      
      var HMS: String = js.native
      
      var MS: String = js.native
    }
    object DurationTimeDef {
      
      @scala.inline
      def apply(HM: String, HMS: String, MS: String): DurationTimeDef = {
        val __obj = js.Dynamic.literal(HM = HM.asInstanceOf[js.Any], HMS = HMS.asInstanceOf[js.Any], MS = MS.asInstanceOf[js.Any])
        __obj.asInstanceOf[DurationTimeDef]
      }
      
      @scala.inline
      implicit class DurationTimeDefMutableBuilder[Self <: DurationTimeDef] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHM(value: String): Self = StObject.set(x, "HM", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHMS(value: String): Self = StObject.set(x, "HMS", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMS(value: String): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.momentDurationFormat.momentDurationFormatStrings.S
      - typings.momentDurationFormat.momentDurationFormatStrings.SS
      - typings.momentDurationFormat.momentDurationFormatStrings.SSS
      - typings.momentDurationFormat.momentDurationFormatStrings.s_
      - typings.momentDurationFormat.momentDurationFormatStrings.ss_
      - typings.momentDurationFormat.momentDurationFormatStrings.sss_
      - typings.momentDurationFormat.momentDurationFormatStrings.m_
      - typings.momentDurationFormat.momentDurationFormatStrings.mm_
      - typings.momentDurationFormat.momentDurationFormatStrings.mmm_
      - typings.momentDurationFormat.momentDurationFormatStrings.h
      - typings.momentDurationFormat.momentDurationFormatStrings.hh
      - typings.momentDurationFormat.momentDurationFormatStrings.hhh
      - typings.momentDurationFormat.momentDurationFormatStrings.d
      - typings.momentDurationFormat.momentDurationFormatStrings.dd
      - typings.momentDurationFormat.momentDurationFormatStrings.ddd
      - typings.momentDurationFormat.momentDurationFormatStrings.w
      - typings.momentDurationFormat.momentDurationFormatStrings.ww
      - typings.momentDurationFormat.momentDurationFormatStrings.www
      - typings.momentDurationFormat.momentDurationFormatStrings.M
      - typings.momentDurationFormat.momentDurationFormatStrings.MM
      - typings.momentDurationFormat.momentDurationFormatStrings.MMM
      - typings.momentDurationFormat.momentDurationFormatStrings.y
      - typings.momentDurationFormat.momentDurationFormatStrings.yy
      - typings.momentDurationFormat.momentDurationFormatStrings.yyy
    */
    trait DurationToken extends StObject
    object DurationToken {
      
      @scala.inline
      def M: typings.momentDurationFormat.momentDurationFormatStrings.M = "M".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.M]
      
      @scala.inline
      def MM: typings.momentDurationFormat.momentDurationFormatStrings.MM = "MM".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.MM]
      
      @scala.inline
      def MMM: typings.momentDurationFormat.momentDurationFormatStrings.MMM = "MMM".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.MMM]
      
      @scala.inline
      def S: typings.momentDurationFormat.momentDurationFormatStrings.S = "S".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.S]
      
      @scala.inline
      def SS: typings.momentDurationFormat.momentDurationFormatStrings.SS = "SS".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.SS]
      
      @scala.inline
      def SSS: typings.momentDurationFormat.momentDurationFormatStrings.SSS = "SSS".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.SSS]
      
      @scala.inline
      def d: typings.momentDurationFormat.momentDurationFormatStrings.d = "d".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.d]
      
      @scala.inline
      def dd: typings.momentDurationFormat.momentDurationFormatStrings.dd = "dd".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.dd]
      
      @scala.inline
      def ddd: typings.momentDurationFormat.momentDurationFormatStrings.ddd = "ddd".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.ddd]
      
      @scala.inline
      def h: typings.momentDurationFormat.momentDurationFormatStrings.h = "h".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.h]
      
      @scala.inline
      def hh: typings.momentDurationFormat.momentDurationFormatStrings.hh = "hh".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.hh]
      
      @scala.inline
      def hhh: typings.momentDurationFormat.momentDurationFormatStrings.hhh = "hhh".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.hhh]
      
      @scala.inline
      def m: m_ = "m".asInstanceOf[m_]
      
      @scala.inline
      def mm: mm_ = "mm".asInstanceOf[mm_]
      
      @scala.inline
      def mmm: mmm_ = "mmm".asInstanceOf[mmm_]
      
      @scala.inline
      def s: s_ = "s".asInstanceOf[s_]
      
      @scala.inline
      def ss: ss_ = "ss".asInstanceOf[ss_]
      
      @scala.inline
      def sss: sss_ = "sss".asInstanceOf[sss_]
      
      @scala.inline
      def w: typings.momentDurationFormat.momentDurationFormatStrings.w = "w".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.w]
      
      @scala.inline
      def ww: typings.momentDurationFormat.momentDurationFormatStrings.ww = "ww".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.ww]
      
      @scala.inline
      def www: typings.momentDurationFormat.momentDurationFormatStrings.www = "www".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.www]
      
      @scala.inline
      def y: typings.momentDurationFormat.momentDurationFormatStrings.y = "y".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.y]
      
      @scala.inline
      def yy: typings.momentDurationFormat.momentDurationFormatStrings.yy = "yy".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.yy]
      
      @scala.inline
      def yyy: typings.momentDurationFormat.momentDurationFormatStrings.yyy = "yyy".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.yyy]
    }
    
    @js.native
    trait Duration_ extends StObject {
      
      def format(): String = js.native
      def format(settings: DurationFormatSettings): String = js.native
      def format(template: String): String = js.native
      def format(template: String, precision: Double): String = js.native
      def format(template: String, precision: Double, settings: DurationFormatSettings): String = js.native
      def format(template: String, settings: DurationFormatSettings): String = js.native
      def format(template: TemplateFunction): String = js.native
      def format(template: TemplateFunction, precision: Double): String = js.native
      def format(template: TemplateFunction, precision: Double, settings: DurationFormatSettings): String = js.native
      def format(template: TemplateFunction, settings: DurationFormatSettings): String = js.native
      @JSName("format")
      var format_Original: Format = js.native
    }
    
    @js.native
    trait Format extends StObject {
      
      def apply(): String = js.native
      def apply(settings: DurationFormatSettings): String = js.native
      def apply(template: String): String = js.native
      def apply(template: String, precision: Double): String = js.native
      def apply(template: String, precision: Double, settings: DurationFormatSettings): String = js.native
      def apply(template: String, settings: DurationFormatSettings): String = js.native
      def apply(template: TemplateFunction): String = js.native
      def apply(template: TemplateFunction, precision: Double): String = js.native
      def apply(template: TemplateFunction, precision: Double, settings: DurationFormatSettings): String = js.native
      def apply(template: TemplateFunction, settings: DurationFormatSettings): String = js.native
      
      var defaults: DurationFormatSettings = js.native
    }
    
    @js.native
    trait LocaleSpecification extends StObject {
      
      var durationLabelTypes: js.UndefOr[js.Array[DurationLabelTypeDef]] = js.native
      
      var durationLabelsLong: js.UndefOr[DurationLabelDef] = js.native
      
      var durationLabelsShort: js.UndefOr[DurationLabelDef] = js.native
      
      var durationLabelsStandard: js.UndefOr[DurationLabelDef] = js.native
      
      var durationPluralKey: js.UndefOr[
            js.Function3[/* token */ String, /* integerValue */ Double, /* decimalValue */ Double, String]
          ] = js.native
      
      var durationTimeTemplates: js.UndefOr[DurationTimeDef] = js.native
    }
    object LocaleSpecification {
      
      @scala.inline
      def apply(): LocaleSpecification = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocaleSpecification]
      }
      
      @scala.inline
      implicit class LocaleSpecificationMutableBuilder[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDurationLabelTypes(value: js.Array[DurationLabelTypeDef]): Self = StObject.set(x, "durationLabelTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDurationLabelTypesUndefined: Self = StObject.set(x, "durationLabelTypes", js.undefined)
        
        @scala.inline
        def setDurationLabelTypesVarargs(value: DurationLabelTypeDef*): Self = StObject.set(x, "durationLabelTypes", js.Array(value :_*))
        
        @scala.inline
        def setDurationLabelsLong(value: DurationLabelDef): Self = StObject.set(x, "durationLabelsLong", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDurationLabelsLongUndefined: Self = StObject.set(x, "durationLabelsLong", js.undefined)
        
        @scala.inline
        def setDurationLabelsShort(value: DurationLabelDef): Self = StObject.set(x, "durationLabelsShort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDurationLabelsShortUndefined: Self = StObject.set(x, "durationLabelsShort", js.undefined)
        
        @scala.inline
        def setDurationLabelsStandard(value: DurationLabelDef): Self = StObject.set(x, "durationLabelsStandard", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDurationLabelsStandardUndefined: Self = StObject.set(x, "durationLabelsStandard", js.undefined)
        
        @scala.inline
        def setDurationPluralKey(value: (/* token */ String, /* integerValue */ Double, /* decimalValue */ Double) => String): Self = StObject.set(x, "durationPluralKey", js.Any.fromFunction3(value))
        
        @scala.inline
        def setDurationPluralKeyUndefined: Self = StObject.set(x, "durationPluralKey", js.undefined)
        
        @scala.inline
        def setDurationTimeTemplates(value: DurationTimeDef): Self = StObject.set(x, "durationTimeTemplates", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDurationTimeTemplatesUndefined: Self = StObject.set(x, "durationTimeTemplates", js.undefined)
      }
    }
    
    type TemplateFunction = js.ThisFunction0[/* this */ DurationFormatSettings, String]
    
    /* Rewritten from type alias, can be one of: 
      - typings.momentDurationFormat.momentDurationFormatStrings.large
      - typings.momentDurationFormat.momentDurationFormatStrings.small
      - typings.momentDurationFormat.momentDurationFormatStrings.both
      - typings.momentDurationFormat.momentDurationFormatStrings.mid
      - typings.momentDurationFormat.momentDurationFormatStrings.all
      - typings.momentDurationFormat.momentDurationFormatStrings.`final`
    */
    trait UnitOfTrim extends StObject
    object UnitOfTrim {
      
      @scala.inline
      def all: typings.momentDurationFormat.momentDurationFormatStrings.all = "all".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.all]
      
      @scala.inline
      def both: typings.momentDurationFormat.momentDurationFormatStrings.both = "both".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.both]
      
      @scala.inline
      def `final`: typings.momentDurationFormat.momentDurationFormatStrings.`final` = "final".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.`final`]
      
      @scala.inline
      def large: typings.momentDurationFormat.momentDurationFormatStrings.large = "large".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.large]
      
      @scala.inline
      def mid: typings.momentDurationFormat.momentDurationFormatStrings.mid = "mid".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.mid]
      
      @scala.inline
      def small: typings.momentDurationFormat.momentDurationFormatStrings.small = "small".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.small]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.momentDurationFormat.momentDurationFormatStrings.left
      - typings.momentDurationFormat.momentDurationFormatStrings.right
    */
    trait UnitOfTrimV1 extends StObject
    object UnitOfTrimV1 {
      
      @scala.inline
      def left: typings.momentDurationFormat.momentDurationFormatStrings.left = "left".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.left]
      
      @scala.inline
      def right: typings.momentDurationFormat.momentDurationFormatStrings.right = "right".asInstanceOf[typings.momentDurationFormat.momentDurationFormatStrings.right]
    }
  }
}
