package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (filenamePatterns != null) __obj.updateDynamic("filenamePatterns")(filenamePatterns.asInstanceOf[js.Any])
    if (filenames != null) __obj.updateDynamic("filenames")(filenames.asInstanceOf[js.Any])
    if (firstLine != null) __obj.updateDynamic("firstLine")(firstLine.asInstanceOf[js.Any])
    if (mimetypes != null) __obj.updateDynamic("mimetypes")(mimetypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageExtensionPoint]
  }
}

