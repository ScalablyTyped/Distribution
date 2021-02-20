package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojcolorMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.ColorConverter.ConverterOptions
import typings.oracleOraclejet.oracleOraclejetStrings.hex
import typings.oracleOraclejet.oracleOraclejetStrings.hex3
import typings.oracleOraclejet.oracleOraclejetStrings.hsl
import typings.oracleOraclejet.oracleOraclejetStrings.hsv
import typings.oracleOraclejet.oracleOraclejetStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojvalidation-base", "ColorConverter")
@js.native
class ColorConverter () extends Converter[^] {
  def this(options: ConverterOptions) = this()
  
  @JSName("getHint")
  def getHint_MColorConverter(): String = js.native
  
  @JSName("resolvedOptions")
  def resolvedOptions_MColorConverter(): ConverterOptions = js.native
}
object ColorConverter {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ConverterOptions extends StObject {
    
    var format: js.UndefOr[rgb | hsl | hsv | hex | hex3] = js.native
  }
  object ConverterOptions {
    
    @scala.inline
    def apply(): ConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterOptions]
    }
    
    @scala.inline
    implicit class ConverterOptionsMutableBuilder[Self <: ConverterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: rgb | hsl | hsv | hex | hex3): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
}
