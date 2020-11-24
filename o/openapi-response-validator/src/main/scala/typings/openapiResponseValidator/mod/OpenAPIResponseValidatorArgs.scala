package typings.openapiResponseValidator.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.ErrorObject
import typings.ajv.mod.FormatDefinition
import typings.ajv.mod.FormatValidator
import typings.openapiResponseValidator.anon.Schema
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPIV3.ComponentsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPIResponseValidatorArgs extends js.Object {
  
  var components: js.UndefOr[ComponentsObject] = js.native
  
  var customFormats: StringDictionary[FormatValidator | FormatDefinition] = js.native
  
  var definitions: StringDictionary[IJsonSchema] = js.native
  
  var errorTransformer: js.UndefOr[
    js.Function2[
      /* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, 
      /* ajvError */ ErrorObject, 
      _
    ]
  ] = js.native
  
  var externalSchemas: StringDictionary[IJsonSchema] = js.native
  
  var loggingKey: String = js.native
  
  var responses: StringDictionary[Schema] = js.native
}
object OpenAPIResponseValidatorArgs {
  
  @scala.inline
  def apply(
    customFormats: StringDictionary[FormatValidator | FormatDefinition],
    definitions: StringDictionary[IJsonSchema],
    externalSchemas: StringDictionary[IJsonSchema],
    loggingKey: String,
    responses: StringDictionary[Schema]
  ): OpenAPIResponseValidatorArgs = {
    val __obj = js.Dynamic.literal(customFormats = customFormats.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any], externalSchemas = externalSchemas.asInstanceOf[js.Any], loggingKey = loggingKey.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIResponseValidatorArgs]
  }
  
  @scala.inline
  implicit class OpenAPIResponseValidatorArgsOps[Self <: OpenAPIResponseValidatorArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomFormats(value: StringDictionary[FormatValidator | FormatDefinition]): Self = this.set("customFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitions(value: StringDictionary[IJsonSchema]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = this.set("externalSchemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingKey(value: String): Self = this.set("loggingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponses(value: StringDictionary[Schema]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: ComponentsObject): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setErrorTransformer(
      value: (/* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, /* ajvError */ ErrorObject) => _
    ): Self = this.set("errorTransformer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteErrorTransformer: Self = this.set("errorTransformer", js.undefined)
  }
}
