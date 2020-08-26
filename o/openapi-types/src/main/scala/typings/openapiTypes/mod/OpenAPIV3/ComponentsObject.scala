package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentsObject extends js.Object {
  var callbacks: js.UndefOr[StringDictionary[ReferenceObject | CallbackObject]] = js.native
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.native
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.native
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.native
  var parameters: js.UndefOr[StringDictionary[ReferenceObject | ParameterObject]] = js.native
  var requestBodies: js.UndefOr[StringDictionary[ReferenceObject | RequestBodyObject]] = js.native
  var responses: js.UndefOr[StringDictionary[ReferenceObject | ResponseObject]] = js.native
  var schemas: js.UndefOr[StringDictionary[ReferenceObject | SchemaObject]] = js.native
  var securitySchemes: js.UndefOr[StringDictionary[ReferenceObject | SecuritySchemeObject]] = js.native
}

object ComponentsObject {
  @scala.inline
  def apply(): ComponentsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsObject]
  }
  @scala.inline
  implicit class ComponentsObjectOps[Self <: ComponentsObject] (val x: Self) extends AnyVal {
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
    def setCallbacks(value: StringDictionary[ReferenceObject | CallbackObject]): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = this.set("examples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setLinks(value: StringDictionary[ReferenceObject | LinkObject]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setParameters(value: StringDictionary[ReferenceObject | ParameterObject]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setRequestBodies(value: StringDictionary[ReferenceObject | RequestBodyObject]): Self = this.set("requestBodies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBodies: Self = this.set("requestBodies", js.undefined)
    @scala.inline
    def setResponses(value: StringDictionary[ReferenceObject | ResponseObject]): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
    @scala.inline
    def setSchemas(value: StringDictionary[ReferenceObject | SchemaObject]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    @scala.inline
    def setSecuritySchemes(value: StringDictionary[ReferenceObject | SecuritySchemeObject]): Self = this.set("securitySchemes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecuritySchemes: Self = this.set("securitySchemes", js.undefined)
  }
  
}

