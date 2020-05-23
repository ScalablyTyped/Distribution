package typings.peculiarAsn1Schema

import typings.peculiarAsn1Schema.typesMod.AnyConverterType
import typings.peculiarAsn1Schema.typesMod.IAsnConverter
import typings.peculiarAsn1Schema.typesMod.IntegerConverterType
import typings.std.ArrayBuffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/converters", JSImport.Namespace)
@js.native
object convertersMod extends js.Object {
  val AsnAnyConverter: IAsnConverter[AnyConverterType, js.Any] = js.native
  val AsnBitStringConverter: IAsnConverter[ArrayBuffer, js.Any] = js.native
  val AsnBmpStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnBooleanConverter: IAsnConverter[Boolean, js.Any] = js.native
  val AsnCharacterStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnEnumeratedConverter: IAsnConverter[Double, js.Any] = js.native
  val AsnGeneralStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnGeneralizedTimeConverter: IAsnConverter[Date, js.Any] = js.native
  val AsnGraphicStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnIA5StringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnIntegerArrayBufferConverter: IAsnConverter[ArrayBuffer, js.Any] = js.native
  val AsnIntegerConverter: IAsnConverter[IntegerConverterType, js.Any] = js.native
  val AsnNullConverter: IAsnConverter[Null, js.Any] = js.native
  val AsnNumericStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnObjectIdentifierConverter: IAsnConverter[String, js.Any] = js.native
  val AsnOctetStringConverter: IAsnConverter[ArrayBuffer, js.Any] = js.native
  val AsnPrintableStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnTeletexStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnUTCTimeConverter: IAsnConverter[Date, js.Any] = js.native
  val AsnUniversalStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnUtf8StringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnVideotexStringConverter: IAsnConverter[String, js.Any] = js.native
  val AsnVisibleStringConverter: IAsnConverter[String, js.Any] = js.native
}

