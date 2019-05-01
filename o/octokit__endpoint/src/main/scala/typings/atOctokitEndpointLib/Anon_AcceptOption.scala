package typings
package atOctokitEndpointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptOption
  extends /* option */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var accept: java.lang.String
  var `user-agent`: java.lang.String
}

object Anon_AcceptOption {
  @scala.inline
  def apply(
    accept: java.lang.String,
    `user-agent`: java.lang.String,
    StringDictionary: /* option */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_AcceptOption = {
    val __obj = js.Dynamic.literal(accept = accept)
    __obj.updateDynamic("user-agent")(`user-agent`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_AcceptOption]
  }
}

