package typings
package mithrilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentTarget
  extends /* p */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var currentTarget: js.Any
}

object Anon_CurrentTarget {
  @scala.inline
  def apply(
    currentTarget: js.Any,
    StringDictionary: /* p */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_CurrentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentTarget")(currentTarget)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CurrentTarget]
  }
}

