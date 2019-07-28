package typings.atNivoCore

import typings.atNivoCore.atNivoCoreMod.SvgFillMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_[T] extends js.Object {
  var id: String
  var `match`: js.Object | SvgFillMatcher[T] | typings.atNivoCore.atNivoCoreStrings.`*`
}

object Anon_ {
  @scala.inline
  def apply[T](id: String, `match`: js.Object | SvgFillMatcher[T] | typings.atNivoCore.atNivoCoreStrings.`*`): Anon_[T] = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_[T]]
  }
}

