package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PositionAffinity extends StObject
@JSImport("monaco-editor", "editor.PositionAffinity")
@js.native
object PositionAffinity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionAffinity & Double] = js.native
  
  /**
    * Prefers the left most position.
    */
  @js.native
  sealed trait Left
    extends StObject
       with PositionAffinity
  /* 0 */ val Left: typings.monacoEditor.mod.editor.PositionAffinity.Left & Double = js.native
  
  /**
    * If the given position is on injected text, prefers the position left of it.
    */
  @js.native
  sealed trait LeftOfInjectedText
    extends StObject
       with PositionAffinity
  /* 3 */ val LeftOfInjectedText: typings.monacoEditor.mod.editor.PositionAffinity.LeftOfInjectedText & Double = js.native
  
  /**
    * No preference.
    */
  @js.native
  sealed trait None
    extends StObject
       with PositionAffinity
  /* 2 */ val None: typings.monacoEditor.mod.editor.PositionAffinity.None & Double = js.native
  
  /**
    * Prefers the right most position.
    */
  @js.native
  sealed trait Right
    extends StObject
       with PositionAffinity
  /* 1 */ val Right: typings.monacoEditor.mod.editor.PositionAffinity.Right & Double = js.native
  
  /**
    * If the given position is on injected text, prefers the position right of it.
    */
  @js.native
  sealed trait RightOfInjectedText
    extends StObject
       with PositionAffinity
  /* 4 */ val RightOfInjectedText: typings.monacoEditor.mod.editor.PositionAffinity.RightOfInjectedText & Double = js.native
}
