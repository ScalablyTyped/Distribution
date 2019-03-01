package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHash
  extends /* columnName */ org.scalablytyped.runtime.StringDictionary[js.Array[ValidationErrorItem]]

object ErrorHash {
  @scala.inline
  def apply(
    StringDictionary: /* columnName */ org.scalablytyped.runtime.StringDictionary[js.Array[ValidationErrorItem]] = null
  ): ErrorHash = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ErrorHash]
  }
}

