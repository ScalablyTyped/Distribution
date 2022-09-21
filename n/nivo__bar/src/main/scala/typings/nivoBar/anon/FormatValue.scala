package typings.nivoBar.anon

import typings.nivoBar.typesMod.BarDatum
import typings.nivoBar.typesMod.ComputedDatum
import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScale
import typings.nivoCore.mod.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatValue[RawDatum /* <: BarDatum */] extends StObject {
  
  def formatValue(value: Double): String
  
  var getColor: OrdinalColorScale[ComputedDatum[RawDatum]]
  
  def getIndex(datum: RawDatum): String
  
  def getTooltipLabel(datum: ComputedDatum[RawDatum]): String
  
  var hiddenIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var margin: Margin
}
object FormatValue {
  
  inline def apply[RawDatum /* <: BarDatum */](
    formatValue: Double => String,
    getColor: ComputedDatum[RawDatum] => String,
    getIndex: RawDatum => String,
    getTooltipLabel: ComputedDatum[RawDatum] => String,
    margin: Margin
  ): FormatValue[RawDatum] = {
    val __obj = js.Dynamic.literal(formatValue = js.Any.fromFunction1(formatValue), getColor = js.Any.fromFunction1(getColor), getIndex = js.Any.fromFunction1(getIndex), getTooltipLabel = js.Any.fromFunction1(getTooltipLabel), margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatValue[RawDatum]]
  }
  
  extension [Self <: FormatValue[?], RawDatum /* <: BarDatum */](x: Self & FormatValue[RawDatum]) {
    
    inline def setFormatValue(value: Double => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
    
    inline def setGetColor(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setGetIndex(value: RawDatum => String): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
    
    inline def setGetTooltipLabel(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "getTooltipLabel", js.Any.fromFunction1(value))
    
    inline def setHiddenIds(value: js.Array[String]): Self = StObject.set(x, "hiddenIds", value.asInstanceOf[js.Any])
    
    inline def setHiddenIdsUndefined: Self = StObject.set(x, "hiddenIds", js.undefined)
    
    inline def setHiddenIdsVarargs(value: String*): Self = StObject.set(x, "hiddenIds", js.Array(value*))
    
    inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
  }
}
