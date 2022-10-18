package typings.peculiarAsn1Schema

import typings.peculiarAsn1Schema.buildTypesTypesMod.IEmptyConstructor
import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesConvertMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/convert", "AsnConvert")
  @js.native
  open class AsnConvert () extends StObject
  /* static members */
  object AsnConvert {
    
    @JSImport("@peculiar/asn1-schema/build/types/convert", "AsnConvert")
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
}
