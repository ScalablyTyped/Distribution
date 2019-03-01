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

object KnexMappers {
  @scala.inline
  def apply(
    postProcessResponse: js.Function1[js.Any, js.Any],
    wrapIdentifier: js.Function2[
      java.lang.String, 
      js.Function1[/* identifier */ java.lang.String, java.lang.String], 
      java.lang.String
    ]
  ): KnexMappers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postProcessResponse")(postProcessResponse)
    __obj.updateDynamic("wrapIdentifier")(wrapIdentifier)
    __obj.asInstanceOf[KnexMappers]
  }
}

