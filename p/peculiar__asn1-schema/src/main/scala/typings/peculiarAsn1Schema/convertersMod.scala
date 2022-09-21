package typings.peculiarAsn1Schema

import typings.asn1js.mod.AsnType
import typings.asn1js.mod.BitString
import typings.asn1js.mod.Enumerated
import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.Integer
import typings.asn1js.mod.ObjectIdentifier
import typings.asn1js.mod.OctetString
import typings.asn1js.mod.UTCTime
import typings.peculiarAsn1Schema.enumsMod.AsnPropTypes
import typings.peculiarAsn1Schema.typesMod.AnyConverterType
import typings.peculiarAsn1Schema.typesMod.IAsnConverter
import typings.peculiarAsn1Schema.typesMod.IntegerConverterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertersMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnAnyConverter")
  @js.native
  val AsnAnyConverter: IAsnConverter[AnyConverterType, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnBitStringConverter")
  @js.native
  val AsnBitStringConverter: IAsnConverter[js.typedarray.ArrayBuffer, BitString] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnBmpStringConverter")
  @js.native
  val AsnBmpStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnBooleanConverter")
  @js.native
  val AsnBooleanConverter: IAsnConverter[Boolean, typings.asn1js.mod.Boolean] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnCharacterStringConverter")
  @js.native
  val AsnCharacterStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnEnumeratedConverter")
  @js.native
  val AsnEnumeratedConverter: IAsnConverter[Double, Enumerated] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnGeneralStringConverter")
  @js.native
  val AsnGeneralStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnGeneralizedTimeConverter")
  @js.native
  val AsnGeneralizedTimeConverter: IAsnConverter[js.Date, GeneralizedTime] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnGraphicStringConverter")
  @js.native
  val AsnGraphicStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnIA5StringConverter")
  @js.native
  val AsnIA5StringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnIntegerArrayBufferConverter")
  @js.native
  val AsnIntegerArrayBufferConverter: IAsnConverter[js.typedarray.ArrayBuffer, Integer] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnIntegerBigIntConverter")
  @js.native
  val AsnIntegerBigIntConverter: IAsnConverter[js.BigInt, Integer] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnIntegerConverter")
  @js.native
  val AsnIntegerConverter: IAsnConverter[IntegerConverterType, Integer] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnNullConverter")
  @js.native
  val AsnNullConverter: IAsnConverter[Null, typings.asn1js.mod.Null] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnNumericStringConverter")
  @js.native
  val AsnNumericStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnObjectIdentifierConverter")
  @js.native
  val AsnObjectIdentifierConverter: IAsnConverter[String, ObjectIdentifier] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnOctetStringConverter")
  @js.native
  val AsnOctetStringConverter: IAsnConverter[js.typedarray.ArrayBuffer, OctetString] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnPrintableStringConverter")
  @js.native
  val AsnPrintableStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnTeletexStringConverter")
  @js.native
  val AsnTeletexStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnUTCTimeConverter")
  @js.native
  val AsnUTCTimeConverter: IAsnConverter[js.Date, UTCTime] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnUniversalStringConverter")
  @js.native
  val AsnUniversalStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnUtf8StringConverter")
  @js.native
  val AsnUtf8StringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnVideotexStringConverter")
  @js.native
  val AsnVideotexStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema/build/types/converters", "AsnVisibleStringConverter")
  @js.native
  val AsnVisibleStringConverter: IAsnConverter[String, AsnType] = js.native
  
  inline def defaultConverter(`type`: AsnPropTypes): (IAsnConverter[Any, AsnType]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultConverter")(`type`.asInstanceOf[js.Any]).asInstanceOf[(IAsnConverter[Any, AsnType]) | Null]
}
