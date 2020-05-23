package typings.peculiarAsn1Schema

import typings.peculiarAsn1Schema.decoratorsMod.IAsn1PropOptions
import typings.peculiarAsn1Schema.decoratorsMod.IAsn1TypeOptions
import typings.peculiarAsn1Schema.typesMod.AnyConverterType
import typings.peculiarAsn1Schema.typesMod.IAsnConverter
import typings.peculiarAsn1Schema.typesMod.IEmptyConstructor
import typings.peculiarAsn1Schema.typesMod.IntegerConverterType
import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AsnArray[T] ()
    extends typings.peculiarAsn1Schema.objectsMod.AsnArray[T] {
    def this(items: js.Array[T]) = this()
  }
  
  @js.native
  class AsnConvert ()
    extends typings.peculiarAsn1Schema.convertMod.AsnConvert
  
  @js.native
  class AsnParser ()
    extends typings.peculiarAsn1Schema.parserMod.AsnParser
  
  @js.native
  class AsnSchemaValidationError ()
    extends typings.peculiarAsn1Schema.schemaValidationMod.AsnSchemaValidationError
  
  @js.native
  class AsnSerializer ()
    extends typings.peculiarAsn1Schema.serializerMod.AsnSerializer
  
  @js.native
  class BitString[T /* <: Double */] ()
    extends typings.peculiarAsn1Schema.indexMod.BitString[T] {
    def this(value: T) = this()
    def this(value: BufferSource) = this()
    def this(value: BufferSource, unusedBits: Double) = this()
  }
  
  @js.native
  class OctetString ()
    extends typings.peculiarAsn1Schema.indexMod.OctetString {
    def this(byteLength: Double) = this()
    def this(bytes: js.Array[Double]) = this()
    def this(bytes: BufferSource) = this()
  }
  
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
  def AsnProp(options: IAsn1PropOptions): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def AsnType(options: IAsn1TypeOptions): js.Function1[/* target */ js.Object, Unit] = js.native
  /* static members */
  @js.native
  object AsnConvert extends js.Object {
    def parse[T](data: BufferSource, target: IEmptyConstructor[T]): T = js.native
    def serialize(obj: js.Any): ArrayBuffer = js.native
  }
  
  /* static members */
  @js.native
  object AsnParser extends js.Object {
    /**
      * Deserializes an object from the asn1js object
      * @param asn1Schema asn1js object
      * @param target Target schema for object deserialization
      */
    def fromASN[T](asn1Schema: js.Any, target: IEmptyConstructor[T]): js.Any = js.native
    /**
      * Deserializes an object from the ASN.1 encoded buffer
      * @param data ASN.1 encoded buffer
      * @param target Target schema for object deserialization
      */
    def parse[T](data: BufferSource, target: IEmptyConstructor[T]): T = js.native
  }
  
  @js.native
  object AsnPropTypes extends js.Object {
    /* 1 */ val Any: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.Any with Double = js.native
    /* 4 */ val BitString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.BitString with Double = js.native
    /* 9 */ val BmpString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.BmpString with Double = js.native
    /* 2 */ val Boolean: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.Boolean with Double = js.native
    /* 19 */ val CharacterString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.CharacterString with Double = js.native
    /* 22 */ val DATE: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.DATE with Double = js.native
    /* 24 */ val DateTime: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.DateTime with Double = js.native
    /* 25 */ val Duration: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.Duration with Double = js.native
    /* 6 */ val Enumerated: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.Enumerated with Double = js.native
    /* 18 */ val GeneralString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.GeneralString with Double = js.native
    /* 21 */ val GeneralizedTime: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.GeneralizedTime with Double = js.native
    /* 16 */ val GraphicString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.GraphicString with Double = js.native
    /* 15 */ val IA5String: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.IA5String with Double = js.native
    /* 5 */ val Integer: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.Integer with Double = js.native
    /* 27 */ val Null: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.Null with Double = js.native
    /* 11 */ val NumericString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.NumericString with Double = js.native
    /* 7 */ val ObjectIdentifier: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.ObjectIdentifier with Double = js.native
    /* 3 */ val OctetString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.OctetString with Double = js.native
    /* 12 */ val PrintableString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.PrintableString with Double = js.native
    /* 26 */ val TIME: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.TIME with Double = js.native
    /* 13 */ val TeletexString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.TeletexString with Double = js.native
    /* 23 */ val TimeOfDay: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.TimeOfDay with Double = js.native
    /* 20 */ val UTCTime: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.UTCTime with Double = js.native
    /* 10 */ val UniversalString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.UniversalString with Double = js.native
    /* 8 */ val Utf8String: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.Utf8String with Double = js.native
    /* 14 */ val VideotexString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.VideotexString with Double = js.native
    /* 17 */ val VisibleString: typings.peculiarAsn1Schema.enumsMod.AsnPropTypes.VisibleString with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.peculiarAsn1Schema.enumsMod.AsnPropTypes with Double] = js.native
  }
  
  /* static members */
  @js.native
  object AsnSerializer extends js.Object {
    var toAsnItem: js.Any = js.native
    /**
      * Serializes an object to the ASN.1 encoded buffer
      * @param obj The object to serialize
      */
    def serialize(obj: js.Any): ArrayBuffer = js.native
    /**
      * Serialize an object to the asn1js object
      * @param obj The object to serialize
      */
    def toASN(obj: js.Any): js.Any = js.native
  }
  
  @js.native
  object AsnTypeTypes extends js.Object {
    /* 2 */ val Choice: typings.peculiarAsn1Schema.enumsMod.AsnTypeTypes.Choice with Double = js.native
    /* 0 */ val Sequence: typings.peculiarAsn1Schema.enumsMod.AsnTypeTypes.Sequence with Double = js.native
    /* 1 */ val Set: typings.peculiarAsn1Schema.enumsMod.AsnTypeTypes.Set with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.peculiarAsn1Schema.enumsMod.AsnTypeTypes with Double] = js.native
  }
  
}

