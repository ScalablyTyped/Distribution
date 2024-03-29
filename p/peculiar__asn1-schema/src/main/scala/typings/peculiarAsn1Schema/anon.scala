package typings.peculiarAsn1Schema

import org.scalablytyped.runtime.StringDictionary
import typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes
import typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes
import typings.peculiarAsn1Schema.buildTypesSchemaMod.AsnSchemaType
import typings.peculiarAsn1Schema.buildTypesSchemaMod.IAsnSchemaItem
import typings.peculiarAsn1Schema.buildTypesTypesMod.IEmptyConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @peculiar/asn1-schema.@peculiar/asn1-schema/build/types/schema.IAsnSchema & std.Required<std.Pick<@peculiar/asn1-schema.@peculiar/asn1-schema/build/types/schema.IAsnSchema, 'schema'>> */
  trait IAsnSchemaRequiredPickIAs extends StObject {
    
    var itemType: AsnPropTypes | IEmptyConstructor[Any]
    
    var items: StringDictionary[IAsnSchemaItem]
    
    var schema: js.UndefOr[AsnSchemaType] = js.undefined
    
    var `type`: AsnTypeTypes
  }
  object IAsnSchemaRequiredPickIAs {
    
    inline def apply(
      itemType: AsnPropTypes | IEmptyConstructor[Any],
      items: StringDictionary[IAsnSchemaItem],
      `type`: AsnTypeTypes
    ): IAsnSchemaRequiredPickIAs = {
      val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsnSchemaRequiredPickIAs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAsnSchemaRequiredPickIAs] (val x: Self) extends AnyVal {
      
      inline def setItemType(value: AsnPropTypes | IEmptyConstructor[Any]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItems(value: StringDictionary[IAsnSchemaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: AsnSchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setType(value: AsnTypeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
