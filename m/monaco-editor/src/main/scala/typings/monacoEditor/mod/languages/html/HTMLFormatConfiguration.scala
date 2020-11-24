package typings.monacoEditor.mod.languages.html

import typings.monacoEditor.monacoEditorStrings.`force-aligned`
import typings.monacoEditor.monacoEditorStrings.`force-expand-multiline`
import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLFormatConfiguration extends js.Object {
  
  val contentUnformatted: String = js.native
  
  val endWithNewline: Boolean = js.native
  
  val extraLiners: String = js.native
  
  val indentHandlebars: Boolean = js.native
  
  val indentInnerHtml: Boolean = js.native
  
  val insertSpaces: Boolean = js.native
  
  val maxPreserveNewLines: Double = js.native
  
  val preserveNewLines: Boolean = js.native
  
  val tabSize: Double = js.native
  
  val unformatted: String = js.native
  
  val wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline` = js.native
  
  val wrapLineLength: Double = js.native
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
  
  @scala.inline
  implicit class HTMLFormatConfigurationOps[Self <: HTMLFormatConfiguration] (val x: Self) extends AnyVal {
    
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
    def setContentUnformatted(value: String): Self = this.set("contentUnformatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndWithNewline(value: Boolean): Self = this.set("endWithNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraLiners(value: String): Self = this.set("extraLiners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentHandlebars(value: Boolean): Self = this.set("indentHandlebars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentInnerHtml(value: Boolean): Self = this.set("indentInnerHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPreserveNewLines(value: Double): Self = this.set("maxPreserveNewLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveNewLines(value: Boolean): Self = this.set("preserveNewLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnformatted(value: String): Self = this.set("unformatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapAttributes(value: auto | force | `force-aligned` | `force-expand-multiline`): Self = this.set("wrapAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapLineLength(value: Double): Self = this.set("wrapLineLength", value.asInstanceOf[js.Any])
  }
}
