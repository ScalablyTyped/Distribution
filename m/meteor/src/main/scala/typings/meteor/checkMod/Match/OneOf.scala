package typings.meteor.checkMod.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/check", "Match.OneOf")
@js.native
object OneOf extends js.Object {
  def apply[T /* <: Pattern */](patterns: T*): Matcher[PatternMatch[T]] = js.native
}

