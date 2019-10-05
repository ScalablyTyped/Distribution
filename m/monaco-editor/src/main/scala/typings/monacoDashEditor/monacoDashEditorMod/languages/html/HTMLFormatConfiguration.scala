package typings.monacoDashEditor.monacoDashEditorMod.languages.html

import typings.monacoDashEditor.monacoDashEditorStrings.`force-aligned`
import typings.monacoDashEditor.monacoDashEditorStrings.`force-expand-multiline`
import typings.monacoDashEditor.monacoDashEditorStrings.auto
import typings.monacoDashEditor.monacoDashEditorStrings.force
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
    val __obj = js.Dynamic.literal(contentUnformatted = contentUnformatted, endWithNewline = endWithNewline, extraLiners = extraLiners, indentHandlebars = indentHandlebars, indentInnerHtml = indentInnerHtml, insertSpaces = insertSpaces, maxPreserveNewLines = maxPreserveNewLines, preserveNewLines = preserveNewLines, tabSize = tabSize, unformatted = unformatted, wrapAttributes = wrapAttributes.asInstanceOf[js.Any], wrapLineLength = wrapLineLength)
  
    __obj.asInstanceOf[HTMLFormatConfiguration]
  }
}

