package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MouseTargetType extends js.Object
@JSImport("monaco-editor", "editor.MouseTargetType")
@js.native
object MouseTargetType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MouseTargetType with Double] = js.native
  
  /**
    * Mouse is on top of empty space in the content (e.g. after line text or below last line)
    */
  @js.native
  sealed trait CONTENT_EMPTY extends MouseTargetType
  /* 7 */ @js.native
  object CONTENT_EMPTY extends TopLevel[CONTENT_EMPTY with Double]
  
  /**
    * Mouse is on top of text in the content.
    */
  @js.native
  sealed trait CONTENT_TEXT extends MouseTargetType
  /* 6 */ @js.native
  object CONTENT_TEXT extends TopLevel[CONTENT_TEXT with Double]
  
  /**
    * Mouse is on top of a view zone in the content.
    */
  @js.native
  sealed trait CONTENT_VIEW_ZONE extends MouseTargetType
  /* 8 */ @js.native
  object CONTENT_VIEW_ZONE extends TopLevel[CONTENT_VIEW_ZONE with Double]
  
  /**
    * Mouse is on top of a content widget.
    */
  @js.native
  sealed trait CONTENT_WIDGET extends MouseTargetType
  /* 9 */ @js.native
  object CONTENT_WIDGET extends TopLevel[CONTENT_WIDGET with Double]
  
  /**
    * Mouse is on top of the glyph margin
    */
  @js.native
  sealed trait GUTTER_GLYPH_MARGIN extends MouseTargetType
  /* 2 */ @js.native
  object GUTTER_GLYPH_MARGIN extends TopLevel[GUTTER_GLYPH_MARGIN with Double]
  
  /**
    * Mouse is on top of the line decorations
    */
  @js.native
  sealed trait GUTTER_LINE_DECORATIONS extends MouseTargetType
  /* 4 */ @js.native
  object GUTTER_LINE_DECORATIONS extends TopLevel[GUTTER_LINE_DECORATIONS with Double]
  
  /**
    * Mouse is on top of the line numbers
    */
  @js.native
  sealed trait GUTTER_LINE_NUMBERS extends MouseTargetType
  /* 3 */ @js.native
  object GUTTER_LINE_NUMBERS extends TopLevel[GUTTER_LINE_NUMBERS with Double]
  
  /**
    * Mouse is on top of the whitespace left in the gutter by a view zone.
    */
  @js.native
  sealed trait GUTTER_VIEW_ZONE extends MouseTargetType
  /* 5 */ @js.native
  object GUTTER_VIEW_ZONE extends TopLevel[GUTTER_VIEW_ZONE with Double]
  
  /**
    * Mouse is outside of the editor.
    */
  @js.native
  sealed trait OUTSIDE_EDITOR extends MouseTargetType
  /* 13 */ @js.native
  object OUTSIDE_EDITOR extends TopLevel[OUTSIDE_EDITOR with Double]
  
  /**
    * Mouse is on top of an overlay widget.
    */
  @js.native
  sealed trait OVERLAY_WIDGET extends MouseTargetType
  /* 12 */ @js.native
  object OVERLAY_WIDGET extends TopLevel[OVERLAY_WIDGET with Double]
  
  /**
    * Mouse is on top of the decorations overview ruler.
    */
  @js.native
  sealed trait OVERVIEW_RULER extends MouseTargetType
  /* 10 */ @js.native
  object OVERVIEW_RULER extends TopLevel[OVERVIEW_RULER with Double]
  
  /**
    * Mouse is on top of a scrollbar.
    */
  @js.native
  sealed trait SCROLLBAR extends MouseTargetType
  /* 11 */ @js.native
  object SCROLLBAR extends TopLevel[SCROLLBAR with Double]
  
  /**
    * Mouse is on top of the textarea used for input.
    */
  @js.native
  sealed trait TEXTAREA extends MouseTargetType
  /* 1 */ @js.native
  object TEXTAREA extends TopLevel[TEXTAREA with Double]
  
  /**
    * Mouse is on top of an unknown element.
    */
  @js.native
  sealed trait UNKNOWN extends MouseTargetType
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
}
