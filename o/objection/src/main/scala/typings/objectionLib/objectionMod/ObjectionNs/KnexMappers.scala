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
    postProcessResponse: js.Any => js.Any,
    wrapIdentifier: (java.lang.String, js.Function1[/* identifier */ java.lang.String, java.lang.String]) => java.lang.String
  ): KnexMappers = {
    val __obj = js.Dynamic.literal(postProcessResponse = js.Any.fromFunction1(postProcessResponse), wrapIdentifier = js.Any.fromFunction2(wrapIdentifier))
  
    __obj.asInstanceOf[KnexMappers]
  }
}

