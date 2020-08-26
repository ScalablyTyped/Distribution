package typings.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateCache extends js.Object {
  def clear(): Unit = js.native
  def get(cacheKey: String): js.UndefOr[String] = js.native
  def set(cacheKey: String, value: String): Unit = js.native
}

object TemplateCache {
  @scala.inline
  def apply(clear: () => Unit, get: String => js.UndefOr[String], set: (String, String) => Unit): TemplateCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[TemplateCache]
  }
  @scala.inline
  implicit class TemplateCacheOps[Self <: TemplateCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: String => js.UndefOr[String]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, String) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

