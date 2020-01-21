package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

