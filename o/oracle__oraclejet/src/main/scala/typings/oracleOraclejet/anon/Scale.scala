package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typings.oracleOraclejet.oracleOraclejetStrings.days
import typings.oracleOraclejet.oracleOraclejetStrings.hours
import typings.oracleOraclejet.oracleOraclejetStrings.minutes
import typings.oracleOraclejet.oracleOraclejetStrings.months
import typings.oracleOraclejet.oracleOraclejetStrings.quarters
import typings.oracleOraclejet.oracleOraclejetStrings.seconds
import typings.oracleOraclejet.oracleOraclejetStrings.weeks
import typings.oracleOraclejet.oracleOraclejetStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scale extends StObject {
  
  var converter: js.UndefOr[Converters | typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  
  var zoomOrder: js.UndefOr[js.Array[String]] = js.native
}
object Scale {
  
  @scala.inline
  def apply(scale: seconds | minutes | hours | days | weeks | months | quarters | years): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: Converters | typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOrder(value: js.Array[String]): Self = StObject.set(x, "zoomOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOrderUndefined: Self = StObject.set(x, "zoomOrder", js.undefined)
    
    @scala.inline
    def setZoomOrderVarargs(value: String*): Self = StObject.set(x, "zoomOrder", js.Array(value :_*))
  }
}
