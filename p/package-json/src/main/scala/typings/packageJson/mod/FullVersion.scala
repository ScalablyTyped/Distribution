package typings.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.packageJson.anon.Integrity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullVersion
  extends AbbreviatedVersion
     with HoistedData {
  val _id: String = js.native
  val _nodeVersion: String = js.native
  val _npmUser: String = js.native
  val _npmVersion: String = js.native
  val files: js.UndefOr[js.Array[String]] = js.native
  val gitHead: js.UndefOr[String] = js.native
  val main: js.UndefOr[String] = js.native
  val man: js.UndefOr[js.Array[String]] = js.native
  val scripts: js.UndefOr[StringDictionary[String]] = js.native
  val types: js.UndefOr[String] = js.native
  @JSName("typings")
  val typings_ : js.UndefOr[String] = js.native
}

object FullVersion {
  @scala.inline
  def apply(
    _id: String,
    _nodeVersion: String,
    _npmUser: String,
    _npmVersion: String,
    dist: Integrity,
    name: String,
    version: String
  ): FullVersion = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _nodeVersion = _nodeVersion.asInstanceOf[js.Any], _npmUser = _npmUser.asInstanceOf[js.Any], _npmVersion = _npmVersion.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullVersion]
  }
  @scala.inline
  implicit class FullVersionOps[Self <: FullVersion] (val x: Self) extends AnyVal {
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def set_nodeVersion(value: String): Self = this.set("_nodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def set_npmUser(value: String): Self = this.set("_npmUser", value.asInstanceOf[js.Any])
    @scala.inline
    def set_npmVersion(value: String): Self = this.set("_npmVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setGitHead(value: String): Self = this.set("gitHead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitHead: Self = this.set("gitHead", js.undefined)
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    @scala.inline
    def setManVarargs(value: String*): Self = this.set("man", js.Array(value :_*))
    @scala.inline
    def setMan(value: js.Array[String]): Self = this.set("man", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMan: Self = this.set("man", js.undefined)
    @scala.inline
    def setScripts(value: StringDictionary[String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    @scala.inline
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setTypings_(value: String): Self = this.set("typings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypings_ : Self = this.set("typings", js.undefined)
  }
  
}

