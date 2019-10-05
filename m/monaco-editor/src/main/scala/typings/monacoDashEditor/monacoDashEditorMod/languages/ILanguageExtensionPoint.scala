package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageExtensionPoint extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var configuration: js.UndefOr[Uri] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var filenamePatterns: js.UndefOr[js.Array[String]] = js.undefined
  var filenames: js.UndefOr[js.Array[String]] = js.undefined
  var firstLine: js.UndefOr[String] = js.undefined
  var id: String
  var mimetypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ILanguageExtensionPoint {
  @scala.inline
  def apply(
    id: String,
    aliases: js.Array[String] = null,
    configuration: Uri = null,
    extensions: js.Array[String] = null,
    filenamePatterns: js.Array[String] = null,
    filenames: js.Array[String] = null,
    firstLine: String = null,
    mimetypes: js.Array[String] = null
  ): ILanguageExtensionPoint = {
    val __obj = js.Dynamic.literal(id = id)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (filenamePatterns != null) __obj.updateDynamic("filenamePatterns")(filenamePatterns)
    if (filenames != null) __obj.updateDynamic("filenames")(filenames)
    if (firstLine != null) __obj.updateDynamic("firstLine")(firstLine)
    if (mimetypes != null) __obj.updateDynamic("mimetypes")(mimetypes)
    __obj.asInstanceOf[ILanguageExtensionPoint]
  }
}

