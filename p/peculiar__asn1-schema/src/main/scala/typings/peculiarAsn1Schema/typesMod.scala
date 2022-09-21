package typings.peculiarAsn1Schema

import org.scalablytyped.runtime.Instantiable0
import typings.asn1js.mod.AsnType
import typings.asn1js.mod.BaseBlock
import typings.asn1js.mod.ValueBlock
import typings.asn1js.mod.ValueBlockJson
import typings.peculiarAsn1Schema.decoratorsMod.AsnItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnyConverterType = js.typedarray.ArrayBuffer | Null
  
  trait IAsnConverter[T, AsnType] extends StObject {
    
    /**
      * Returns JS value from ASN.1 object
      * @param value ASN.1 object from asn1js module
      */
    def fromASN(value: AsnType): T
    
    /**
      * Returns ASN.1 object from JS value
      * @param value JS value
      */
    def toASN(value: T): AsnType
  }
  object IAsnConverter {
    
    inline def apply[T, AsnType](fromASN: AsnType => T, toASN: T => AsnType): IAsnConverter[T, AsnType] = {
      val __obj = js.Dynamic.literal(fromASN = js.Any.fromFunction1(fromASN), toASN = js.Any.fromFunction1(toASN))
      __obj.asInstanceOf[IAsnConverter[T, AsnType]]
    }
    
    extension [Self <: IAsnConverter[?, ?], T, AsnType](x: Self & (IAsnConverter[T, AsnType])) {
      
      inline def setFromASN(value: AsnType => T): Self = StObject.set(x, "fromASN", js.Any.fromFunction1(value))
      
      inline def setToASN(value: T => AsnType): Self = StObject.set(x, "toASN", js.Any.fromFunction1(value))
    }
  }
  
  trait IAsnConvertible[T] extends StObject {
    
    def fromASN(asn: T): this.type
    
    def toASN(): T
    
    def toSchema(name: String): BaseBlock[ValueBlock, ValueBlockJson]
  }
  object IAsnConvertible {
    
    inline def apply[T](
      fromASN: T => IAsnConvertible[T],
      toASN: () => T,
      toSchema: String => BaseBlock[ValueBlock, ValueBlockJson]
    ): IAsnConvertible[T] = {
      val __obj = js.Dynamic.literal(fromASN = js.Any.fromFunction1(fromASN), toASN = js.Any.fromFunction0(toASN), toSchema = js.Any.fromFunction1(toSchema))
      __obj.asInstanceOf[IAsnConvertible[T]]
    }
    
    extension [Self <: IAsnConvertible[?], T](x: Self & IAsnConvertible[T]) {
      
      inline def setFromASN(value: T => IAsnConvertible[T]): Self = StObject.set(x, "fromASN", js.Any.fromFunction1(value))
      
      inline def setToASN(value: () => T): Self = StObject.set(x, "toASN", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: String => BaseBlock[ValueBlock, ValueBlockJson]): Self = StObject.set(x, "toSchema", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IAsnConvertibleConstructor
    extends StObject
       with Instantiable0[IAsnConvertible[AsnType]]
  
  @js.native
  trait IEmptyConstructor[T]
    extends StObject
       with Instantiable0[T]
       with AsnItemType[T]
  
  type IntegerConverterType = String | Double
}
