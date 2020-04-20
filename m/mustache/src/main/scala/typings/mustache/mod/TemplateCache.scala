package typings.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCache extends js.Object {
  def clear(): Unit
  def get(cacheKey: String): js.UndefOr[String]
  def set(cacheKey: String, value: String): Unit
}

object TemplateCache {
  @scala.inline
  def apply(clear: () => Unit, get: String => js.UndefOr[String], set: (String, String) => Unit): TemplateCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[TemplateCache]
  }
}

