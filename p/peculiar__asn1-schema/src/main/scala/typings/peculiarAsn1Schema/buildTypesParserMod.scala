package typings.peculiarAsn1Schema

import typings.asn1js.mod.AsnType
import typings.peculiarAsn1Schema.buildTypesTypesMod.IEmptyConstructor
import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesParserMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/parser", "AsnParser")
  @js.native
  open class AsnParser () extends StObject
  /* static members */
  object AsnParser {
    
    @JSImport("@peculiar/asn1-schema/build/types/parser", "AsnParser")
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
}
