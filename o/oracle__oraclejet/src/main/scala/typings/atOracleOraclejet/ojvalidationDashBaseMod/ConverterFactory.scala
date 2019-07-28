package typings.atOracleOraclejet.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterFactory[V] extends js.Object {
  def createConverter(): Converter[V] = js.native
  // static CONVERTER_TYPE_COLOR: string;
  // static CONVERTER_TYPE_DATETIME: string;
  // static CONVERTER_TYPE_NUMBER: string;
  def createConverter(options: js.Object): Converter[V] = js.native
}

