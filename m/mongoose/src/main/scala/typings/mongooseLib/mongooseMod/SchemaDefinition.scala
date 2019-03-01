package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Intellisense for Schema definitions
  */
trait SchemaDefinition
  extends /* path */ org.scalablytyped.runtime.StringDictionary[SchemaTypeOpts[_] | Schema[_] | SchemaType]

object SchemaDefinition {
  @scala.inline
  def apply(
    StringDictionary: /* path */ org.scalablytyped.runtime.StringDictionary[SchemaTypeOpts[_] | Schema[_] | SchemaType] = null
  ): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SchemaDefinition]
  }
}

