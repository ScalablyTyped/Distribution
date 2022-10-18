package typings.peculiarAsn1Schema

import typings.asn1js.mod.AsnType
import typings.asn1js.mod.Enumerated
import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.Integer
import typings.asn1js.mod.ObjectIdentifier
import typings.asn1js.mod.UTCTime
import typings.peculiarAsn1Schema.buildTypesDecoratorsMod.AsnPropDecorator
import typings.peculiarAsn1Schema.buildTypesDecoratorsMod.AsnTypeDecorator
import typings.peculiarAsn1Schema.buildTypesDecoratorsMod.IAsn1PropOptions
import typings.peculiarAsn1Schema.buildTypesDecoratorsMod.IAsn1SequenceOptions
import typings.peculiarAsn1Schema.buildTypesDecoratorsMod.IAsn1SetOptions
import typings.peculiarAsn1Schema.buildTypesDecoratorsMod.IAsn1TypeOptions
import typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes
import typings.peculiarAsn1Schema.buildTypesTypesMod.AnyConverterType
import typings.peculiarAsn1Schema.buildTypesTypesMod.IAsnConverter
import typings.peculiarAsn1Schema.buildTypesTypesMod.IEmptyConstructor
import typings.peculiarAsn1Schema.buildTypesTypesMod.IntegerConverterType
import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@peculiar/asn1-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnAnyConverter")
  @js.native
  val AsnAnyConverter: IAsnConverter[AnyConverterType, AsnType] = js.native
  
  /* note: abstract class */ @JSImport("@peculiar/asn1-schema", "AsnArray")
  @js.native
  open class AsnArray[T] ()
    extends typings.peculiarAsn1Schema.buildTypesObjectsMod.AsnArray[T] {
    def this(items: js.Array[T]) = this()
  }
  
  @JSImport("@peculiar/asn1-schema", "AsnBitStringConverter")
  @js.native
  val AsnBitStringConverter: IAsnConverter[js.typedarray.ArrayBuffer, typings.asn1js.mod.BitString] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnBmpStringConverter")
  @js.native
  val AsnBmpStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnBooleanConverter")
  @js.native
  val AsnBooleanConverter: IAsnConverter[Boolean, typings.asn1js.mod.Boolean] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnCharacterStringConverter")
  @js.native
  val AsnCharacterStringConverter: IAsnConverter[String, AsnType] = js.native
  
  inline def AsnChoiceType(): AsnTypeDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnChoiceType")().asInstanceOf[AsnTypeDecorator]
  
  @JSImport("@peculiar/asn1-schema", "AsnConvert")
  @js.native
  open class AsnConvert ()
    extends typings.peculiarAsn1Schema.buildTypesConvertMod.AsnConvert
  /* static members */
  object AsnConvert {
    
    @JSImport("@peculiar/asn1-schema", "AsnConvert")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse[T](data: BufferSource, target: IEmptyConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def serialize(obj: Any): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Returns a string representation of an ASN.1 encoded data
      * @param data ASN.1 encoded buffer source
      * @returns String representation of ASN.1 structure
      */
    inline def toString(data: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
      * Returns a string representation of an ASN.1 schema
      * @param obj Object which can be serialized to ASN.1 schema
      * @returns String representation of ASN.1 structure
      */
    inline def toString(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("@peculiar/asn1-schema", "AsnEnumeratedConverter")
  @js.native
  val AsnEnumeratedConverter: IAsnConverter[Double, Enumerated] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnGeneralStringConverter")
  @js.native
  val AsnGeneralStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnGeneralizedTimeConverter")
  @js.native
  val AsnGeneralizedTimeConverter: IAsnConverter[js.Date, GeneralizedTime] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnGraphicStringConverter")
  @js.native
  val AsnGraphicStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnIA5StringConverter")
  @js.native
  val AsnIA5StringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnIntegerArrayBufferConverter")
  @js.native
  val AsnIntegerArrayBufferConverter: IAsnConverter[js.typedarray.ArrayBuffer, Integer] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnIntegerBigIntConverter")
  @js.native
  val AsnIntegerBigIntConverter: IAsnConverter[js.BigInt, Integer] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnIntegerConverter")
  @js.native
  val AsnIntegerConverter: IAsnConverter[IntegerConverterType, Integer] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnNullConverter")
  @js.native
  val AsnNullConverter: IAsnConverter[Null, typings.asn1js.mod.Null] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnNumericStringConverter")
  @js.native
  val AsnNumericStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnObjectIdentifierConverter")
  @js.native
  val AsnObjectIdentifierConverter: IAsnConverter[String, ObjectIdentifier] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnOctetStringConverter")
  @js.native
  val AsnOctetStringConverter: IAsnConverter[js.typedarray.ArrayBuffer, typings.asn1js.mod.OctetString] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnParser")
  @js.native
  open class AsnParser ()
    extends typings.peculiarAsn1Schema.buildTypesParserMod.AsnParser
  /* static members */
  object AsnParser {
    
    @JSImport("@peculiar/asn1-schema", "AsnParser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deserializes an object from the asn1js object
      * @param asn1Schema asn1js object
      * @param target Target schema for object deserialization
      */
    inline def fromASN[T](asn1Schema: AsnType, target: IEmptyConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromASN")(asn1Schema.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Deserializes an object from the ASN.1 encoded buffer
      * @param data ASN.1 encoded buffer
      * @param target Target schema for object deserialization
      */
    inline def parse[T](data: BufferSource, target: IEmptyConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@peculiar/asn1-schema", "AsnPrintableStringConverter")
  @js.native
  val AsnPrintableStringConverter: IAsnConverter[String, AsnType] = js.native
  
  inline def AsnProp(options: IAsn1PropOptions): AsnPropDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnProp")(options.asInstanceOf[js.Any]).asInstanceOf[AsnPropDecorator]
  
  @JSImport("@peculiar/asn1-schema", "AsnPropTypes")
  @js.native
  object AsnPropTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes & Double] = js.native
    
    /* 1 */ val Any: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Any & Double = js.native
    
    /* 4 */ val BitString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.BitString & Double = js.native
    
    /* 9 */ val BmpString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.BmpString & Double = js.native
    
    /* 2 */ val Boolean: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Boolean & Double = js.native
    
    /* 19 */ val CharacterString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.CharacterString & Double = js.native
    
    /* 22 */ val DATE: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.DATE & Double = js.native
    
    /* 24 */ val DateTime: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.DateTime & Double = js.native
    
    /* 25 */ val Duration: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Duration & Double = js.native
    
    /* 6 */ val Enumerated: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Enumerated & Double = js.native
    
    /* 18 */ val GeneralString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.GeneralString & Double = js.native
    
    /* 21 */ val GeneralizedTime: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.GeneralizedTime & Double = js.native
    
    /* 16 */ val GraphicString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.GraphicString & Double = js.native
    
    /* 15 */ val IA5String: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.IA5String & Double = js.native
    
    /* 5 */ val Integer: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Integer & Double = js.native
    
    /* 27 */ val Null: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Null & Double = js.native
    
    /* 11 */ val NumericString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.NumericString & Double = js.native
    
    /* 7 */ val ObjectIdentifier: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.ObjectIdentifier & Double = js.native
    
    /* 3 */ val OctetString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.OctetString & Double = js.native
    
    /* 12 */ val PrintableString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.PrintableString & Double = js.native
    
    /* 26 */ val TIME: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.TIME & Double = js.native
    
    /* 13 */ val TeletexString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.TeletexString & Double = js.native
    
    /* 23 */ val TimeOfDay: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.TimeOfDay & Double = js.native
    
    /* 20 */ val UTCTime: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.UTCTime & Double = js.native
    
    /* 10 */ val UniversalString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.UniversalString & Double = js.native
    
    /* 8 */ val Utf8String: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Utf8String & Double = js.native
    
    /* 14 */ val VideotexString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.VideotexString & Double = js.native
    
    /* 17 */ val VisibleString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.VisibleString & Double = js.native
  }
  
  @JSImport("@peculiar/asn1-schema", "AsnSchemaValidationError")
  @js.native
  open class AsnSchemaValidationError ()
    extends typings.peculiarAsn1Schema.buildTypesErrorsMod.AsnSchemaValidationError
  
  inline def AsnSequenceType(options: IAsn1SequenceOptions): AsnTypeDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnSequenceType")(options.asInstanceOf[js.Any]).asInstanceOf[AsnTypeDecorator]
  
  @JSImport("@peculiar/asn1-schema", "AsnSerializer")
  @js.native
  open class AsnSerializer ()
    extends typings.peculiarAsn1Schema.buildTypesSerializerMod.AsnSerializer
  /* static members */
  object AsnSerializer {
    
    @JSImport("@peculiar/asn1-schema", "AsnSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Serializes an object to the ASN.1 encoded buffer
      * @param obj The object to serialize
      */
    inline def serialize(obj: Any): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Serialize an object to the asn1js object
      * @param obj The object to serialize
      */
    inline def toASN(obj: Any): AsnType = ^.asInstanceOf[js.Dynamic].applyDynamic("toASN")(obj.asInstanceOf[js.Any]).asInstanceOf[AsnType]
    
    @JSImport("@peculiar/asn1-schema", "AsnSerializer.toAsnItem")
    @js.native
    def toAsnItem: Any = js.native
    inline def toAsnItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toAsnItem")(x.asInstanceOf[js.Any])
  }
  
  inline def AsnSetType(options: IAsn1SetOptions): AsnTypeDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnSetType")(options.asInstanceOf[js.Any]).asInstanceOf[AsnTypeDecorator]
  
  @JSImport("@peculiar/asn1-schema", "AsnTeletexStringConverter")
  @js.native
  val AsnTeletexStringConverter: IAsnConverter[String, AsnType] = js.native
  
  inline def AsnType(options: IAsn1TypeOptions): AsnTypeDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnType")(options.asInstanceOf[js.Any]).asInstanceOf[AsnTypeDecorator]
  
  @JSImport("@peculiar/asn1-schema", "AsnTypeTypes")
  @js.native
  object AsnTypeTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes & Double] = js.native
    
    /* 2 */ val Choice: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes.Choice & Double = js.native
    
    /* 0 */ val Sequence: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes.Sequence & Double = js.native
    
    /* 1 */ val Set: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes.Set & Double = js.native
  }
  
  @JSImport("@peculiar/asn1-schema", "AsnUTCTimeConverter")
  @js.native
  val AsnUTCTimeConverter: IAsnConverter[js.Date, UTCTime] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnUniversalStringConverter")
  @js.native
  val AsnUniversalStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnUtf8StringConverter")
  @js.native
  val AsnUtf8StringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnVideotexStringConverter")
  @js.native
  val AsnVideotexStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "AsnVisibleStringConverter")
  @js.native
  val AsnVisibleStringConverter: IAsnConverter[String, AsnType] = js.native
  
  @JSImport("@peculiar/asn1-schema", "BitString")
  @js.native
  open class BitString[T /* <: Double */] ()
    extends typings.peculiarAsn1Schema.buildTypesTypesIndexMod.BitString[T] {
    def this(value: T) = this()
    def this(value: BufferSource) = this()
    def this(value: BufferSource, unusedBits: Double) = this()
  }
  
  @JSImport("@peculiar/asn1-schema", "OctetString")
  @js.native
  open class OctetString ()
    extends typings.peculiarAsn1Schema.buildTypesTypesIndexMod.OctetString {
    def this(byteLength: Double) = this()
    def this(bytes: js.Array[Double]) = this()
    def this(bytes: BufferSource) = this()
  }
  
  inline def defaultConverter(`type`: AsnPropTypes): (IAsnConverter[Any, AsnType]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultConverter")(`type`.asInstanceOf[js.Any]).asInstanceOf[(IAsnConverter[Any, AsnType]) | Null]
}
