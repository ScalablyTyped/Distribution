package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.IJsonSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaObject
  extends IJsonSchema
     with /* index */ StringDictionary[js.Any]
     with Schema {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var discriminator: js.UndefOr[String] = js.native
  
  var example: js.UndefOr[js.Any] = js.native
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.native
  
  @JSName("items")
  var items_SchemaObject: js.UndefOr[ItemsObject] = js.native
  
  @JSName("properties")
  var properties_SchemaObject: js.UndefOr[StringDictionary[SchemaObject]] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var xml: js.UndefOr[XMLObject] = js.native
}
object SchemaObject {
  
  @scala.inline
  def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  
  @scala.inline
  implicit class SchemaObjectMutableBuilder[Self <: SchemaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    @scala.inline
    def setExample(value: js.Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setItems(value: ItemsObject): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[SchemaObject]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setXml(value: XMLObject): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
