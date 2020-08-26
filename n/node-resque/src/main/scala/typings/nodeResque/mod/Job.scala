package typings.nodeResque.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job[TResult] extends js.Object {
  var pluginOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  def perform(args: js.Any*): js.Promise[TResult] = js.native
}

object Job {
  @scala.inline
  def apply[TResult](perform: /* repeated */ js.Any => js.Promise[TResult]): Job[TResult] = {
    val __obj = js.Dynamic.literal(perform = js.Any.fromFunction1(perform))
    __obj.asInstanceOf[Job[TResult]]
  }
  @scala.inline
  implicit class JobOps[Self <: Job[_], TResult] (val x: Self with Job[TResult]) extends AnyVal {
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
    def setPerform(value: /* repeated */ js.Any => js.Promise[TResult]): Self = this.set("perform", js.Any.fromFunction1(value))
    @scala.inline
    def setPluginOptions(value: StringDictionary[js.Any]): Self = this.set("pluginOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginOptions: Self = this.set("pluginOptions", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
  
}

