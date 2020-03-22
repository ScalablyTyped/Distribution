package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnexMappers extends js.Object {
  def postProcessResponse(response: js.Any): js.Any
  def wrapIdentifier(identifier: String, origWrap: Identity[String]): String
}

object KnexMappers {
  @scala.inline
  def apply(postProcessResponse: js.Any => js.Any, wrapIdentifier: (String, Identity[String]) => String): KnexMappers = {
    val __obj = js.Dynamic.literal(postProcessResponse = js.Any.fromFunction1(postProcessResponse), wrapIdentifier = js.Any.fromFunction2(wrapIdentifier))
  
    __obj.asInstanceOf[KnexMappers]
  }
}

