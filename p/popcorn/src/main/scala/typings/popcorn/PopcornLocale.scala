package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornLocale extends js.Object {
  def get(): String
  def set(langRegion: String): js.Any
}

object PopcornLocale {
  @scala.inline
  def apply(get: () => String, set: String => js.Any): PopcornLocale = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[PopcornLocale]
  }
}

