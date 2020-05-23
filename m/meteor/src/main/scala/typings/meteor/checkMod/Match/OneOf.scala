package typings.meteor.checkMod.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/check", "Match.OneOf")
@js.native
object OneOf extends js.Object {
  def apply[T /* <: js.Array[Pattern] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patterns because its type T is not an array type */ patterns: T
  ): Matcher[
    PatternMatch[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ] = js.native
}

