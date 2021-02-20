package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentAction extends StObject
@JSImport("monaco-editor", "languages.IndentAction")
@js.native
object IndentAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentAction with Double] = js.native
  
  /**
    * Insert new line and indent once (relative to the previous line's indentation).
    */
  @js.native
  sealed trait Indent extends IndentAction
  /* 1 */ val Indent: typings.monacoEditor.mod.languages.IndentAction.Indent with Double = js.native
  
  /**
    * Insert two new lines:
    *  - the first one indented which will hold the cursor
    *  - the second one at the same indentation level
    */
  @js.native
  sealed trait IndentOutdent extends IndentAction
  /* 2 */ val IndentOutdent: typings.monacoEditor.mod.languages.IndentAction.IndentOutdent with Double = js.native
  
  /**
    * Insert new line and copy the previous line's indentation.
    */
  @js.native
  sealed trait None extends IndentAction
  /* 0 */ val None: typings.monacoEditor.mod.languages.IndentAction.None with Double = js.native
  
  /**
    * Insert new line and outdent once (relative to the previous line's indentation).
    */
  @js.native
  sealed trait Outdent extends IndentAction
  /* 3 */ val Outdent: typings.monacoEditor.mod.languages.IndentAction.Outdent with Double = js.native
}
