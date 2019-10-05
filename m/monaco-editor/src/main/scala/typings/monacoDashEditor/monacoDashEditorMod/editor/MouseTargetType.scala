package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MouseTargetType extends js.Object

@JSImport("monaco-editor", "editor.MouseTargetType")
@js.native
object MouseTargetType extends js.Object {
  /**
    * Mouse is on top of empty space in the content (e.g. after line text or below last line)
    */
  @js.native
  sealed trait CONTENT_EMPTY extends MouseTargetType
  
  /**
    * Mouse is on top of text in the content.
    */
  @js.native
  sealed trait CONTENT_TEXT extends MouseTargetType
  
  /**
    * Mouse is on top of a view zone in the content.
    */
  @js.native
  sealed trait CONTENT_VIEW_ZONE extends MouseTargetType
  
  /**
    * Mouse is on top of a content widget.
    */
  @js.native
  sealed trait CONTENT_WIDGET extends MouseTargetType
  
  /**
    * Mouse is on top of the glyph margin
    */
  @js.native
  sealed trait GUTTER_GLYPH_MARGIN extends MouseTargetType
  
  /**
    * Mouse is on top of the line decorations
    */
  @js.native
  sealed trait GUTTER_LINE_DECORATIONS extends MouseTargetType
  
  /**
    * Mouse is on top of the line numbers
    */
  @js.native
  sealed trait GUTTER_LINE_NUMBERS extends MouseTargetType
  
  /**
    * Mouse is on top of the whitespace left in the gutter by a view zone.
    */
  @js.native
  sealed trait GUTTER_VIEW_ZONE extends MouseTargetType
  
  /**
    * Mouse is outside of the editor.
    */
  @js.native
  sealed trait OUTSIDE_EDITOR extends MouseTargetType
  
  /**
    * Mouse is on top of an overlay widget.
    */
  @js.native
  sealed trait OVERLAY_WIDGET extends MouseTargetType
  
  /**
    * Mouse is on top of the decorations overview ruler.
    */
  @js.native
  sealed trait OVERVIEW_RULER extends MouseTargetType
  
  /**
    * Mouse is on top of a scrollbar.
    */
  @js.native
  sealed trait SCROLLBAR extends MouseTargetType
  
  /**
    * Mouse is on top of the textarea used for input.
    */
  @js.native
  sealed trait TEXTAREA extends MouseTargetType
  
  /**
    * Mouse is on top of an unknown element.
    */
  @js.native
  sealed trait UNKNOWN extends MouseTargetType
  
  /* 7 */ val CONTENT_EMPTY: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.CONTENT_EMPTY with Double = js.native
  /* 6 */ val CONTENT_TEXT: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.CONTENT_TEXT with Double = js.native
  /* 8 */ val CONTENT_VIEW_ZONE: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.CONTENT_VIEW_ZONE with Double = js.native
  /* 9 */ val CONTENT_WIDGET: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.CONTENT_WIDGET with Double = js.native
  /* 2 */ val GUTTER_GLYPH_MARGIN: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.GUTTER_GLYPH_MARGIN with Double = js.native
  /* 4 */ val GUTTER_LINE_DECORATIONS: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.GUTTER_LINE_DECORATIONS with Double = js.native
  /* 3 */ val GUTTER_LINE_NUMBERS: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.GUTTER_LINE_NUMBERS with Double = js.native
  /* 5 */ val GUTTER_VIEW_ZONE: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.GUTTER_VIEW_ZONE with Double = js.native
  /* 13 */ val OUTSIDE_EDITOR: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.OUTSIDE_EDITOR with Double = js.native
  /* 12 */ val OVERLAY_WIDGET: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.OVERLAY_WIDGET with Double = js.native
  /* 10 */ val OVERVIEW_RULER: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.OVERVIEW_RULER with Double = js.native
  /* 11 */ val SCROLLBAR: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.SCROLLBAR with Double = js.native
  /* 1 */ val TEXTAREA: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.TEXTAREA with Double = js.native
  /* 0 */ val UNKNOWN: typings.monacoDashEditor.monacoDashEditorMod.editor.MouseTargetType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MouseTargetType with Double] = js.native
}

