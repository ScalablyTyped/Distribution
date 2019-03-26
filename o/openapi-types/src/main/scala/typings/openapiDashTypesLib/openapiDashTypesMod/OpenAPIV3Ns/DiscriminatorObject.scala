package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscriminatorObject extends js.Object {
  var mapping: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var propertyName: java.lang.String
}

object DiscriminatorObject {
  @scala.inline
  def apply(
    propertyName: java.lang.String,
    mapping: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): DiscriminatorObject = {
    val __obj = js.Dynamic.literal(propertyName = propertyName)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[DiscriminatorObject]
  }
}

