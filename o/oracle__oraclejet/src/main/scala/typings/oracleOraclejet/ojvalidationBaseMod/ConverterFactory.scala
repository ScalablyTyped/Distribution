package typings.oracleOraclejet.ojvalidationBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterFactory[V] extends StObject {
  
  // static CONVERTER_TYPE_COLOR: string;
  // static CONVERTER_TYPE_DATETIME: string;
  // static CONVERTER_TYPE_NUMBER: string;
  def createConverter(): Converter[V] = js.native
  def createConverter(options: js.Object): Converter[V] = js.native
}
