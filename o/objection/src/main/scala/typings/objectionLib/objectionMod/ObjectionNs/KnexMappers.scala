package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KnexMappers extends js.Object {
  def postProcessResponse(response: js.Any): js.Any
  def wrapIdentifier(
    identifier: java.lang.String,
    origWrap: js.Function1[/* identifier */ java.lang.String, java.lang.String]
  ): java.lang.String
}

