package typings
package monacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comments extends js.Object {
  var comments: scala.Boolean
  var other: scala.Boolean
  var strings: scala.Boolean
}

object Anon_Comments {
  @scala.inline
  def apply(comments: scala.Boolean, other: scala.Boolean, strings: scala.Boolean): Anon_Comments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("other")(other)
    __obj.updateDynamic("strings")(strings)
    __obj.asInstanceOf[Anon_Comments]
  }
}

