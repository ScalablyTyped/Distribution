package typings.atNivoCore

import typings.atNivoCore.atNivoCoreMod.SvgFillMatcher
import typings.atNivoCore.atNivoCoreStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_[T] extends js.Object {
  var id: String
  var `match`: js.Object | SvgFillMatcher[T] | Asterisk
}

object Anon_ {
  @scala.inline
  def apply[T](id: String, `match`: js.Object | SvgFillMatcher[T] | Asterisk): Anon_[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_[T]]
  }
}

