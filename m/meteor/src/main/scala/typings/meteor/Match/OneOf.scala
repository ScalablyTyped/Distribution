package typings.meteor.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Match.OneOf")
@js.native
object OneOf extends js.Object {
  def apply[T /* <: Pattern */](patterns: T*): Matcher[PatternMatch[T]] = js.native
}

