package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.RangeMapping")
@js.native
open class RangeMapping protected () extends StObject {
  def this(originalRange: Range, modifiedRange: Range) = this()
  
  /**
    * The modified range.
    */
  val modifiedRange: Range = js.native
  
  /**
    * The original range.
    */
  val originalRange: Range = js.native
}
