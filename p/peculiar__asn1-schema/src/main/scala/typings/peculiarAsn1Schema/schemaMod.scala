package typings.peculiarAsn1Schema

import org.scalablytyped.runtime.StringDictionary
import typings.asn1js.mod.AsnType
import typings.asn1js.mod.Choice
import typings.asn1js.mod.Sequence
import typings.asn1js.mod.Set
import typings.peculiarAsn1Schema.anon.IAsnSchemaRequiredPickIAs
import typings.peculiarAsn1Schema.decoratorsMod.AsnRepeatType
import typings.peculiarAsn1Schema.enumsMod.AsnPropTypes
import typings.peculiarAsn1Schema.enumsMod.AsnTypeTypes
import typings.peculiarAsn1Schema.peculiarAsn1SchemaBooleans.`false`
import typings.peculiarAsn1Schema.peculiarAsn1SchemaBooleans.`true`
import typings.peculiarAsn1Schema.typesMod.IAsnConverter
import typings.peculiarAsn1Schema.typesMod.IEmptyConstructor
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/schema", "AsnSchemaStorage")
  @js.native
  open class AsnSchemaStorage () extends StObject {
    
    def cache(target: IEmptyConstructor[Any]): Unit = js.native
    
    def create(target: js.Object, useNames: Boolean): AsnSchemaType = js.native
    
    def createDefault(target: js.Object): IAsnSchema = js.native
    
    /* protected */ def findParentSchema(target: js.Object): IAsnSchema | Null = js.native
    
    def get(target: IEmptyConstructor[Any]): IAsnSchema = js.native
    @JSName("get")
    def get_false(target: IEmptyConstructor[Any], checkSchema: `false`): IAsnSchema = js.native
    @JSName("get")
    def get_true(target: IEmptyConstructor[Any], checkSchema: `true`): IAsnSchemaRequiredPickIAs = js.native
    
    def has(target: js.Object): Boolean = js.native
    
    /* protected */ var items: WeakMap[js.Object, IAsnSchema] = js.native
    
    def set(target: js.Object, schema: IAsnSchema): this.type = js.native
  }
  
  type AsnSchemaType = Sequence | Set | Choice
  
  trait IAsnSchema extends StObject {
    
    var itemType: AsnPropTypes | IEmptyConstructor[Any]
    
    var items: StringDictionary[IAsnSchemaItem]
    
    var schema: js.UndefOr[AsnSchemaType] = js.undefined
    
    var `type`: AsnTypeTypes
  }
  object IAsnSchema {
    
    inline def apply(
      itemType: AsnPropTypes | IEmptyConstructor[Any],
      items: StringDictionary[IAsnSchemaItem],
      `type`: AsnTypeTypes
    ): IAsnSchema = {
      val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsnSchema]
    }
    
    extension [Self <: IAsnSchema](x: Self) {
      
      inline def setItemType(value: AsnPropTypes | IEmptyConstructor[Any]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItems(value: StringDictionary[IAsnSchemaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: AsnSchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setType(value: AsnTypeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAsnSchemaItem extends StObject {
    
    var context: js.UndefOr[Double] = js.undefined
    
    var converter: js.UndefOr[IAsnConverter[Any, AsnType]] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var `implicit`: js.UndefOr[Boolean] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var repeated: js.UndefOr[AsnRepeatType] = js.undefined
    
    var `type`: AsnPropTypes | IEmptyConstructor[Any]
  }
  object IAsnSchemaItem {
    
    inline def apply(`type`: AsnPropTypes | IEmptyConstructor[Any]): IAsnSchemaItem = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsnSchemaItem]
    }
    
    extension [Self <: IAsnSchemaItem](x: Self) {
      
      inline def setContext(value: Double): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setConverter(value: IAsnConverter[Any, AsnType]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setRepeated(value: AsnRepeatType): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
      
      inline def setType(value: AsnPropTypes | IEmptyConstructor[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
