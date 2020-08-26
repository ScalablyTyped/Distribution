package typings.parentPackageJson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentPackage extends js.Object {
  var path: String = js.native
  def parse(): StringDictionary[js.Any] = js.native
  def read(): String = js.native
}

object ParentPackage {
  @scala.inline
  def apply(parse: () => StringDictionary[js.Any], path: String, read: () => String): ParentPackage = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse), path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[ParentPackage]
  }
  @scala.inline
  implicit class ParentPackageOps[Self <: ParentPackage] (val x: Self) extends AnyVal {
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
    def setParse(value: () => StringDictionary[js.Any]): Self = this.set("parse", js.Any.fromFunction0(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: () => String): Self = this.set("read", js.Any.fromFunction0(value))
  }
  
}

