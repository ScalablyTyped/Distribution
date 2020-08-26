package typings.nextServer.getPageFilesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildManifest extends js.Object {
  var devFiles: js.Array[String] = js.native
  var pages: StringDictionary[js.Array[String]] = js.native
}

object BuildManifest {
  @scala.inline
  def apply(devFiles: js.Array[String], pages: StringDictionary[js.Array[String]]): BuildManifest = {
    val __obj = js.Dynamic.literal(devFiles = devFiles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildManifest]
  }
  @scala.inline
  implicit class BuildManifestOps[Self <: BuildManifest] (val x: Self) extends AnyVal {
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
    def setDevFilesVarargs(value: String*): Self = this.set("devFiles", js.Array(value :_*))
    @scala.inline
    def setDevFiles(value: js.Array[String]): Self = this.set("devFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setPages(value: StringDictionary[js.Array[String]]): Self = this.set("pages", value.asInstanceOf[js.Any])
  }
  
}

