package typings.parquetjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaInterfaceMod {
  
  trait NestedFieldsInterface
    extends StObject
       with SchemaInterfaceField {
    
    var fields: SchemaInterface
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var repeated: js.UndefOr[Boolean] = js.undefined
  }
  object NestedFieldsInterface {
    
    inline def apply(fields: SchemaInterface): NestedFieldsInterface = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedFieldsInterface]
    }
    
    extension [Self <: NestedFieldsInterface](x: Self) {
      
      inline def setFields(value: SchemaInterface): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
    }
  }
  
  type SchemaInterface = StringDictionary[SchemaInterfaceField]
  
  /* Rewritten from type alias, can be one of: 
    - typings.parquetjs.schemaInterfaceMod.SingleFieldInterface
    - typings.parquetjs.schemaInterfaceMod.NestedFieldsInterface
  */
  trait SchemaInterfaceField extends StObject
  object SchemaInterfaceField {
    
    inline def NestedFieldsInterface(fields: SchemaInterface): typings.parquetjs.schemaInterfaceMod.NestedFieldsInterface = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parquetjs.schemaInterfaceMod.NestedFieldsInterface]
    }
    
    inline def SingleFieldInterface(`type`: String): typings.parquetjs.schemaInterfaceMod.SingleFieldInterface = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parquetjs.schemaInterfaceMod.SingleFieldInterface]
    }
  }
  
  trait SingleFieldInterface
    extends StObject
       with SchemaInterfaceField {
    
    var bitWidth: js.UndefOr[Double] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var repeated: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
  }
  object SingleFieldInterface {
    
    inline def apply(`type`: String): SingleFieldInterface = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleFieldInterface]
    }
    
    extension [Self <: SingleFieldInterface](x: Self) {
      
      inline def setBitWidth(value: Double): Self = StObject.set(x, "bitWidth", value.asInstanceOf[js.Any])
      
      inline def setBitWidthUndefined: Self = StObject.set(x, "bitWidth", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
