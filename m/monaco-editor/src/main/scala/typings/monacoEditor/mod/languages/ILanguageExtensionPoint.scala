package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageExtensionPoint extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var configuration: js.UndefOr[Uri] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var filenamePatterns: js.UndefOr[js.Array[String]] = js.native
  var filenames: js.UndefOr[js.Array[String]] = js.native
  var firstLine: js.UndefOr[String] = js.native
  var id: String = js.native
  var mimetypes: js.UndefOr[js.Array[String]] = js.native
}

object ILanguageExtensionPoint {
  @scala.inline
  def apply(id: String): ILanguageExtensionPoint = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageExtensionPoint]
  }
  @scala.inline
  implicit class ILanguageExtensionPointOps[Self <: ILanguageExtensionPoint] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    @scala.inline
    def setConfiguration(value: Uri): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFilenamePatternsVarargs(value: String*): Self = this.set("filenamePatterns", js.Array(value :_*))
    @scala.inline
    def setFilenamePatterns(value: js.Array[String]): Self = this.set("filenamePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenamePatterns: Self = this.set("filenamePatterns", js.undefined)
    @scala.inline
    def setFilenamesVarargs(value: String*): Self = this.set("filenames", js.Array(value :_*))
    @scala.inline
    def setFilenames(value: js.Array[String]): Self = this.set("filenames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenames: Self = this.set("filenames", js.undefined)
    @scala.inline
    def setFirstLine(value: String): Self = this.set("firstLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstLine: Self = this.set("firstLine", js.undefined)
    @scala.inline
    def setMimetypesVarargs(value: String*): Self = this.set("mimetypes", js.Array(value :_*))
    @scala.inline
    def setMimetypes(value: js.Array[String]): Self = this.set("mimetypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimetypes: Self = this.set("mimetypes", js.undefined)
  }
  
}

