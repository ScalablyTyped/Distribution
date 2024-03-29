package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.TextModelResolvedOptions")
@js.native
open class TextModelResolvedOptions () extends StObject {
  
  var _textModelResolvedOptionsBrand: Unit = js.native
  
  val bracketPairColorizationOptions: BracketPairColorizationOptions = js.native
  
  val defaultEOL: DefaultEndOfLine = js.native
  
  val indentSize: Double = js.native
  
  val insertSpaces: Boolean = js.native
  
  def originalIndentSize: Double | typings.monacoEditor.monacoEditorStrings.tabSize = js.native
  
  val tabSize: Double = js.native
  
  val trimAutoWhitespace: Boolean = js.native
}
