package typings.moduleDeps.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deps extends js.Object {
  @JSName("package")
  var _package: js.Any = js.native
  var deps: StringDictionary[Boolean] = js.native
  var source: String = js.native
}

object Deps {
  @scala.inline
  def apply(_package: js.Any, deps: StringDictionary[Boolean], source: String): Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
  @scala.inline
  implicit class DepsOps[Self <: Deps] (val x: Self) extends AnyVal {
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
    def set_package(value: js.Any): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeps(value: StringDictionary[Boolean]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

