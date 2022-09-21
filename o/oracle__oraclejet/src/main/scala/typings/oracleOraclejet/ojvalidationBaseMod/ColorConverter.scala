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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojvalidation-base", "ColorConverter")
@js.native
open class ColorConverter ()
  extends StObject
     with Converter[^] {
  def this(options: ConverterOptions) = this()
  
  /* CompleteClass */
  override def format(value: ^): String | Null = js.native
  
  @JSName("getHint")
  def getHint_MColorConverter(): String = js.native
  
  /* CompleteClass */
  override def parse(value: String): ^ | Null = js.native
  
  @JSName("resolvedOptions")
  def resolvedOptions_MColorConverter(): ConverterOptions = js.native
}
object ColorConverter {
  
  // tslint:disable-next-line interface-over-type-literal
  trait ConverterOptions extends StObject {
    
    var format: js.UndefOr[rgb | hsl | hsv | hex | hex3] = js.undefined
  }
  object ConverterOptions {
    
    inline def apply(): ConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterOptions]
    }
    
    extension [Self <: ConverterOptions](x: Self) {
      
      inline def setFormat(value: rgb | hsl | hsv | hex | hex3): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
}
