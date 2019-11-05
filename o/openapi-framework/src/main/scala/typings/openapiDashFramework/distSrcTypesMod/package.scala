package typings.openapiDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.RegExp

  type OpenAPIErrorTransformer = js.Function2[/* has0 */ js.Object, /* has1 */ js.Object, js.Object]
  type PathSecurityTuple = js.Tuple2[RegExp, js.Array[SecurityRequirement]]
  type SecurityRequirement = StringDictionary[js.Array[SecurityScope]]
  type SecurityScope = String
}
