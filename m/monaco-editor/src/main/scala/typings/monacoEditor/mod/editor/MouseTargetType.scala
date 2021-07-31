package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MouseTargetType extends StObject
@JSImport("monaco-editor", "editor.MouseTargetType")
@js.native
object MouseTargetType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MouseTargetType & Double] = js.native
  
  /**
    * Mouse is on top of empty space in the content (e.g. after line text or below last line)
    */
  @js.native
  sealed trait CONTENT_EMPTY
    extends StObject
       with MouseTargetType
  /* 7 */ val CONTENT_EMPTY: typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_EMPTY & Double = js.native
  
  /**
    * Mouse is on top of text in the content.
    */
  @js.native
  sealed trait CONTENT_TEXT
    extends StObject
       with MouseTargetType
  /* 6 */ val CONTENT_TEXT: typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_TEXT & Double = js.native
  
  /**
    * Mouse is on top of a view zone in the content.
    */
  @js.native
  sealed trait CONTENT_VIEW_ZONE
    extends StObject
       with MouseTargetType
  /* 8 */ val CONTENT_VIEW_ZONE: typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_VIEW_ZONE & Double = js.native
  
  /**
    * Mouse is on top of a content widget.
    */
  @js.native
  sealed trait CONTENT_WIDGET
    extends StObject
       with MouseTargetType
  /* 9 */ val CONTENT_WIDGET: typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_WIDGET & Double = js.native
  
  /**
    * Mouse is on top of the glyph margin
    */
  @js.native
  sealed trait GUTTER_GLYPH_MARGIN
    extends StObject
       with MouseTargetType
  /* 2 */ val GUTTER_GLYPH_MARGIN: typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_GLYPH_MARGIN & Double = js.native
  
  /**
    * Mouse is on top of the line decorations
    */
  @js.native
  sealed trait GUTTER_LINE_DECORATIONS
    extends StObject
       with MouseTargetType
  /* 4 */ val GUTTER_LINE_DECORATIONS: typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_DECORATIONS & Double = js.native
  
  /**
    * Mouse is on top of the line numbers
    */
  @js.native
  sealed trait GUTTER_LINE_NUMBERS
    extends StObject
       with MouseTargetType
  /* 3 */ val GUTTER_LINE_NUMBERS: typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_NUMBERS & Double = js.native
  
  /**
    * Mouse is on top of the whitespace left in the gutter by a view zone.
    */
  @js.native
  sealed trait GUTTER_VIEW_ZONE
    extends StObject
       with MouseTargetType
  /* 5 */ val GUTTER_VIEW_ZONE: typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_VIEW_ZONE & Double = js.native
  
  /**
    * Mouse is outside of the editor.
    */
  @js.native
  sealed trait OUTSIDE_EDITOR
    extends StObject
       with MouseTargetType
  /* 13 */ val OUTSIDE_EDITOR: typings.monacoEditor.mod.editor.MouseTargetType.OUTSIDE_EDITOR & Double = js.native
  
  /**
    * Mouse is on top of an overlay widget.
    */
  @js.native
  sealed trait OVERLAY_WIDGET
    extends StObject
       with MouseTargetType
  /* 12 */ val OVERLAY_WIDGET: typings.monacoEditor.mod.editor.MouseTargetType.OVERLAY_WIDGET & Double = js.native
  
  /**
    * Mouse is on top of the decorations overview ruler.
    */
  @js.native
  sealed trait OVERVIEW_RULER
    extends StObject
       with MouseTargetType
  /* 10 */ val OVERVIEW_RULER: typings.monacoEditor.mod.editor.MouseTargetType.OVERVIEW_RULER & Double = js.native
  
  /**
    * Mouse is on top of a scrollbar.
    */
  @js.native
  sealed trait SCROLLBAR
    extends StObject
       with MouseTargetType
  /* 11 */ val SCROLLBAR: typings.monacoEditor.mod.editor.MouseTargetType.SCROLLBAR & Double = js.native
  
  /**
    * Mouse is on top of the textarea used for input.
    */
  @js.native
  sealed trait TEXTAREA
    extends StObject
       with MouseTargetType
  /* 1 */ val TEXTAREA: typings.monacoEditor.mod.editor.MouseTargetType.TEXTAREA & Double = js.native
  
  /**
    * Mouse is on top of an unknown element.
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with MouseTargetType
  /* 0 */ val UNKNOWN: typings.monacoEditor.mod.editor.MouseTargetType.UNKNOWN & Double = js.native
}
