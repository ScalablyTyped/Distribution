package typings.peculiarJsonSchema

import org.scalablytyped.runtime.StringDictionary
import typings.peculiarJsonSchema.buildTypesPropTypesMod.JsonPropTypes
import typings.peculiarJsonSchema.buildTypesTypesMod.IEmptyConstructor
import typings.peculiarJsonSchema.buildTypesTypesMod.IJsonConverter
import typings.peculiarJsonSchema.buildTypesTypesMod.IValidation
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSchemaMod {
  
  @JSImport("@peculiar/json-schema/build/types/schema", "JsonSchemaStorage")
  @js.native
  open class JsonSchemaStorage () extends StObject {
    
    /**
      * Creates new schema
      * @param target Target object
      */
    def create(target: js.Object): IJsonSchema = js.native
    
    /* protected */ def findParentSchema(target: js.Object): IJsonSchema | Null = js.native
    
    def get(target: js.Object): IJsonSchema = js.native
    
    def has(target: js.Object): Boolean = js.native
    
    /* protected */ var items: Map[js.Object, IJsonSchema] = js.native
    
    def set(target: js.Object, schema: IJsonSchema): this.type = js.native
  }
  
  trait IJsonSchema extends StObject {
    
    var names: StringDictionary[StringDictionary[IJsonSchemaItem]]
    
    var target: IEmptyConstructor[Any]
  }
  object IJsonSchema {
    
    inline def apply(names: StringDictionary[StringDictionary[IJsonSchemaItem]], target: IEmptyConstructor[Any]): IJsonSchema = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJsonSchema] (val x: Self) extends AnyVal {
      
      inline def setNames(value: StringDictionary[StringDictionary[IJsonSchemaItem]]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: IEmptyConstructor[Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait IJsonSchemaItem extends StObject {
    
    var converter: js.UndefOr[IJsonConverter[Any, Any]] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var repeated: js.UndefOr[Boolean] = js.undefined
    
    var `type`: JsonPropTypes | IEmptyConstructor[Any]
    
    var validations: js.Array[IValidation]
  }
  object IJsonSchemaItem {
    
    inline def apply(`type`: JsonPropTypes | IEmptyConstructor[Any], validations: js.Array[IValidation]): IJsonSchemaItem = {
      val __obj = js.Dynamic.literal(validations = validations.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonSchemaItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJsonSchemaItem] (val x: Self) extends AnyVal {
      
      inline def setConverter(value: IJsonConverter[Any, Any]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
      
      inline def setType(value: JsonPropTypes | IEmptyConstructor[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidations(value: js.Array[IValidation]): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
      
      inline def setValidationsVarargs(value: IValidation*): Self = StObject.set(x, "validations", js.Array(value*))
    }
  }
  
  trait IValidationEvent extends StObject {
    
    var propName: String
    
    var value: Any
  }
  object IValidationEvent {
    
    inline def apply(propName: String, value: Any): IValidationEvent = {
      val __obj = js.Dynamic.literal(propName = propName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidationEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IValidationEvent] (val x: Self) extends AnyVal {
      
      inline def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
