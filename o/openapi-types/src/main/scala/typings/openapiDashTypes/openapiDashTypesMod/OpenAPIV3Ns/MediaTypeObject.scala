package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTypeObject extends js.Object {
  var encoding: js.UndefOr[StringDictionary[EncodingObject]] = js.undefined
  var example: js.UndefOr[js.Any] = js.undefined
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.undefined
  var schema: js.UndefOr[ReferenceObject | SchemaObject] = js.undefined
}

object MediaTypeObject {
  @scala.inline
  def apply(
    encoding: StringDictionary[EncodingObject] = null,
    example: js.Any = null,
    examples: StringDictionary[ReferenceObject | ExampleObject] = null,
    schema: ReferenceObject | SchemaObject = null
  ): MediaTypeObject = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (example != null) __obj.updateDynamic("example")(example)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeObject]
  }
}

