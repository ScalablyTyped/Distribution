package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatInputPathObject extends js.Object {
  /**
    * The file name including extension (if any) such as 'index.html'
    */
  var base: js.UndefOr[String] = js.native
  /**
    * The full directory path such as '/home/user/dir' or 'c:\path\dir'
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * The file extension (if any) such as '.html'
    */
  var ext: js.UndefOr[String] = js.native
  /**
    * The file name without extension (if any) such as 'index'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The root of the path such as '/' or 'c:\'
    */
  var root: js.UndefOr[String] = js.native
}

object FormatInputPathObject {
  @scala.inline
  def apply(): FormatInputPathObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatInputPathObject]
  }
  @scala.inline
  implicit class FormatInputPathObjectOps[Self <: FormatInputPathObject] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

