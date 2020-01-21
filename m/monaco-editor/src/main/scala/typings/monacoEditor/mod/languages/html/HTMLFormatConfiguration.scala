package typings.monacoEditor.mod.languages.html

import typings.monacoEditor.monacoEditorStrings.`force-aligned`
import typings.monacoEditor.monacoEditorStrings.`force-expand-multiline`
import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLFormatConfiguration extends js.Object {
  val contentUnformatted: String
  val endWithNewline: Boolean
  val extraLiners: String
  val indentHandlebars: Boolean
  val indentInnerHtml: Boolean
  val insertSpaces: Boolean
  val maxPreserveNewLines: Double
  val preserveNewLines: Boolean
  val tabSize: Double
  val unformatted: String
  val wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline`
  val wrapLineLength: Double
}

object HTMLFormatConfiguration {
  @scala.inline
  def apply(
    contentUnformatted: String,
    endWithNewline: Boolean,
    extraLiners: String,
    indentHandlebars: Boolean,
    indentInnerHtml: Boolean,
    insertSpaces: Boolean,
    maxPreserveNewLines: Double,
    preserveNewLines: Boolean,
    tabSize: Double,
    unformatted: String,
    wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline`,
    wrapLineLength: Double
  ): HTMLFormatConfiguration = {
    val __obj = js.Dynamic.literal(contentUnformatted = contentUnformatted.asInstanceOf[js.Any], endWithNewline = endWithNewline.asInstanceOf[js.Any], extraLiners = extraLiners.asInstanceOf[js.Any], indentHandlebars = indentHandlebars.asInstanceOf[js.Any], indentInnerHtml = indentInnerHtml.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], maxPreserveNewLines = maxPreserveNewLines.asInstanceOf[js.Any], preserveNewLines = preserveNewLines.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], unformatted = unformatted.asInstanceOf[js.Any], wrapAttributes = wrapAttributes.asInstanceOf[js.Any], wrapLineLength = wrapLineLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLFormatConfiguration]
  }
}

