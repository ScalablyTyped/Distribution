package typings
package atNivoCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_[T] extends js.Object {
  var id: java.lang.String
  var `match`: js.Object | atNivoCoreLib.atNivoCoreMod.SvgFillMatcher[T] | atNivoCoreLib.atNivoCoreLibStrings.`*`
}

object Anon_ {
  @scala.inline
  def apply[T](
    id: java.lang.String,
    `match`: js.Object | atNivoCoreLib.atNivoCoreMod.SvgFillMatcher[T] | atNivoCoreLib.atNivoCoreLibStrings.`*`
  ): Anon_[T] = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_[T]]
  }
}

