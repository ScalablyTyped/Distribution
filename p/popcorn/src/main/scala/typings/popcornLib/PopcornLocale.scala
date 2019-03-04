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
  def apply(get: js.Function0[java.lang.String], set: js.Function1[java.lang.String, js.Any]): PopcornLocale = {
    val __obj = js.Dynamic.literal(get = get, set = set)
  
    __obj.asInstanceOf[PopcornLocale]
  }
}

