package typings.peculiarAsn1Schema

import typings.peculiarAsn1Schema.buildTypesDecoratorsMod.AsnItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesEnumsMod {
  
  @js.native
  sealed trait AsnPropTypes
    extends StObject
       with AsnItemType[Any]
  @JSImport("@peculiar/asn1-schema/build/types/enums", "AsnPropTypes")
  @js.native
  object AsnPropTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AsnPropTypes & Double] = js.native
    
    @js.native
    sealed trait Any
      extends StObject
         with AsnPropTypes
    /* 1 */ val Any: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Any & Double = js.native
    
    @js.native
    sealed trait BitString
      extends StObject
         with AsnPropTypes
    /* 4 */ val BitString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.BitString & Double = js.native
    
    @js.native
    sealed trait BmpString
      extends StObject
         with AsnPropTypes
    /* 9 */ val BmpString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.BmpString & Double = js.native
    
    @js.native
    sealed trait Boolean
      extends StObject
         with AsnPropTypes
    /* 2 */ val Boolean: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Boolean & Double = js.native
    
    @js.native
    sealed trait CharacterString
      extends StObject
         with AsnPropTypes
    /* 19 */ val CharacterString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.CharacterString & Double = js.native
    
    @js.native
    sealed trait DATE
      extends StObject
         with AsnPropTypes
    /* 22 */ val DATE: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.DATE & Double = js.native
    
    @js.native
    sealed trait DateTime
      extends StObject
         with AsnPropTypes
    /* 24 */ val DateTime: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.DateTime & Double = js.native
    
    @js.native
    sealed trait Duration
      extends StObject
         with AsnPropTypes
    /* 25 */ val Duration: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Duration & Double = js.native
    
    @js.native
    sealed trait Enumerated
      extends StObject
         with AsnPropTypes
    /* 6 */ val Enumerated: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Enumerated & Double = js.native
    
    @js.native
    sealed trait GeneralString
      extends StObject
         with AsnPropTypes
    /* 18 */ val GeneralString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.GeneralString & Double = js.native
    
    @js.native
    sealed trait GeneralizedTime
      extends StObject
         with AsnPropTypes
    /* 21 */ val GeneralizedTime: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.GeneralizedTime & Double = js.native
    
    @js.native
    sealed trait GraphicString
      extends StObject
         with AsnPropTypes
    /* 16 */ val GraphicString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.GraphicString & Double = js.native
    
    @js.native
    sealed trait IA5String
      extends StObject
         with AsnPropTypes
    /* 15 */ val IA5String: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.IA5String & Double = js.native
    
    @js.native
    sealed trait Integer
      extends StObject
         with AsnPropTypes
    /* 5 */ val Integer: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Integer & Double = js.native
    
    @js.native
    sealed trait Null
      extends StObject
         with AsnPropTypes
    /* 27 */ val Null: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Null & Double = js.native
    
    @js.native
    sealed trait NumericString
      extends StObject
         with AsnPropTypes
    /* 11 */ val NumericString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.NumericString & Double = js.native
    
    @js.native
    sealed trait ObjectIdentifier
      extends StObject
         with AsnPropTypes
    /* 7 */ val ObjectIdentifier: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.ObjectIdentifier & Double = js.native
    
    @js.native
    sealed trait OctetString
      extends StObject
         with AsnPropTypes
    /* 3 */ val OctetString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.OctetString & Double = js.native
    
    @js.native
    sealed trait PrintableString
      extends StObject
         with AsnPropTypes
    /* 12 */ val PrintableString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.PrintableString & Double = js.native
    
    @js.native
    sealed trait TIME
      extends StObject
         with AsnPropTypes
    /* 26 */ val TIME: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.TIME & Double = js.native
    
    @js.native
    sealed trait TeletexString
      extends StObject
         with AsnPropTypes
    /* 13 */ val TeletexString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.TeletexString & Double = js.native
    
    @js.native
    sealed trait TimeOfDay
      extends StObject
         with AsnPropTypes
    /* 23 */ val TimeOfDay: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.TimeOfDay & Double = js.native
    
    @js.native
    sealed trait UTCTime
      extends StObject
         with AsnPropTypes
    /* 20 */ val UTCTime: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.UTCTime & Double = js.native
    
    @js.native
    sealed trait UniversalString
      extends StObject
         with AsnPropTypes
    /* 10 */ val UniversalString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.UniversalString & Double = js.native
    
    @js.native
    sealed trait Utf8String
      extends StObject
         with AsnPropTypes
    /* 8 */ val Utf8String: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.Utf8String & Double = js.native
    
    @js.native
    sealed trait VideotexString
      extends StObject
         with AsnPropTypes
    /* 14 */ val VideotexString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.VideotexString & Double = js.native
    
    @js.native
    sealed trait VisibleString
      extends StObject
         with AsnPropTypes
    /* 17 */ val VisibleString: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes.VisibleString & Double = js.native
  }
  
  @js.native
  sealed trait AsnTypeTypes extends StObject
  @JSImport("@peculiar/asn1-schema/build/types/enums", "AsnTypeTypes")
  @js.native
  object AsnTypeTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AsnTypeTypes & Double] = js.native
    
    @js.native
    sealed trait Choice
      extends StObject
         with AsnTypeTypes
    /* 2 */ val Choice: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes.Choice & Double = js.native
    
    @js.native
    sealed trait Sequence
      extends StObject
         with AsnTypeTypes
    /* 0 */ val Sequence: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes.Sequence & Double = js.native
    
    @js.native
    sealed trait Set
      extends StObject
         with AsnTypeTypes
    /* 1 */ val Set: typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes.Set & Double = js.native
  }
}
