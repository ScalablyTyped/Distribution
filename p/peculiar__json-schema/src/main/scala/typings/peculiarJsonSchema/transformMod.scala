package typings.peculiarJsonSchema

import org.scalablytyped.runtime.StringDictionary
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.peculiarJsonSchema.schemaMod.IJsonSchemaItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/transform", JSImport.Namespace)
@js.native
object transformMod extends js.Object {
  @js.native
  class JsonTransform () extends js.Object
  
  /* static members */
  @js.native
  object JsonTransform extends js.Object {
    /* protected */ def checkTypes(value: js.Any, schemaItem: IJsonSchemaItem): Unit = js.native
    /* protected */ def checkValues(data: js.Any, schemaItem: IJsonSchemaItem): Unit = js.native
    /* protected */ def getSchemaByName(schema: IJsonSchema): IJsonNamedSchema = js.native
    /* protected */ def getSchemaByName(schema: IJsonSchema, name: String): IJsonNamedSchema = js.native
  }
  
  type IJsonNamedSchema = StringDictionary[IJsonSchemaItem]
}

