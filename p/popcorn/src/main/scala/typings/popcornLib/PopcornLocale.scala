package typings
package popcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornLocale extends js.Object {
  def get(): java.lang.String
  def set(langRegion: java.lang.String): js.Any
}

object PopcornLocale {
  @scala.inline
  def apply(get: () => java.lang.String, set: java.lang.String => js.Any): PopcornLocale = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[PopcornLocale]
  }
}

