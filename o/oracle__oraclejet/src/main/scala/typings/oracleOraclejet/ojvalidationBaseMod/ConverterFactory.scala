package typings.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterFactory[V] extends js.Object {
  
  // static CONVERTER_TYPE_COLOR: string;
  // static CONVERTER_TYPE_DATETIME: string;
  // static CONVERTER_TYPE_NUMBER: string;
  def createConverter(): Converter[V] = js.native
  def createConverter(options: js.Object): Converter[V] = js.native
}
