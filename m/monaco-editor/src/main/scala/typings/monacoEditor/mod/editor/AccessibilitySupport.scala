package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessibilitySupport extends StObject
@JSImport("monaco-editor", "editor.AccessibilitySupport")
@js.native
object AccessibilitySupport extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessibilitySupport & Double] = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with AccessibilitySupport
  /* 1 */ val Disabled: typings.monacoEditor.mod.editor.AccessibilitySupport.Disabled & Double = js.native
  
  @js.native
  sealed trait Enabled
    extends StObject
       with AccessibilitySupport
  /* 2 */ val Enabled: typings.monacoEditor.mod.editor.AccessibilitySupport.Enabled & Double = js.native
  
  /**
    * This should be the browser case where it is not known if a screen reader is attached or no.
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with AccessibilitySupport
  /* 0 */ val Unknown: typings.monacoEditor.mod.editor.AccessibilitySupport.Unknown & Double = js.native
}
