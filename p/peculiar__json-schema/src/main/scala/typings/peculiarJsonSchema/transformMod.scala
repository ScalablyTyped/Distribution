package typings.peculiarJsonSchema

import org.scalablytyped.runtime.StringDictionary
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.peculiarJsonSchema.schemaMod.IJsonSchemaItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("@peculiar/json-schema/build/types/transform", "JsonTransform")
  @js.native
  open class JsonTransform () extends StObject
  /* static members */
  object JsonTransform {
    
    @JSImport("@peculiar/json-schema/build/types/transform", "JsonTransform")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkTypes(value: Any, schemaItem: IJsonSchemaItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTypes")(value.asInstanceOf[js.Any], schemaItem.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkValues(data: Any, schemaItem: IJsonSchemaItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkValues")(data.asInstanceOf[js.Any], schemaItem.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getSchemaByName(schema: IJsonSchema): IJsonNamedSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaByName")(schema.asInstanceOf[js.Any]).asInstanceOf[IJsonNamedSchema]
    inline def getSchemaByName(schema: IJsonSchema, name: String): IJsonNamedSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaByName")(schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IJsonNamedSchema]
  }
  
  type IJsonNamedSchema = StringDictionary[IJsonSchemaItem]
}
