package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_EMPTY
import typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_TEXT
import typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_VIEW_ZONE
import typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_WIDGET
import typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_GLYPH_MARGIN
import typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_DECORATIONS
import typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_NUMBERS
import typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_VIEW_ZONE
import typings.monacoEditor.mod.editor.MouseTargetType.OUTSIDE_EDITOR
import typings.monacoEditor.mod.editor.MouseTargetType.OVERLAY_WIDGET
import typings.monacoEditor.mod.editor.MouseTargetType.OVERVIEW_RULER
import typings.monacoEditor.mod.editor.MouseTargetType.SCROLLBAR
import typings.monacoEditor.mod.editor.MouseTargetType.TEXTAREA
import typings.monacoEditor.mod.editor.MouseTargetType.UNKNOWN
import typings.monacoEditor.monacoEditorStrings.above
import typings.monacoEditor.monacoEditorStrings.below
import typings.monacoEditor.monacoEditorStrings.left
import typings.monacoEditor.monacoEditorStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.mod.editor.IMouseTargetUnknown
  - typings.monacoEditor.mod.editor.IMouseTargetTextarea
  - typings.monacoEditor.mod.editor.IMouseTargetMargin
  - typings.monacoEditor.mod.editor.IMouseTargetViewZone
  - typings.monacoEditor.mod.editor.IMouseTargetContentText
  - typings.monacoEditor.mod.editor.IMouseTargetContentEmpty
  - typings.monacoEditor.mod.editor.IMouseTargetContentWidget
  - typings.monacoEditor.mod.editor.IMouseTargetOverlayWidget
  - typings.monacoEditor.mod.editor.IMouseTargetScrollbar
  - typings.monacoEditor.mod.editor.IMouseTargetOverviewRuler
  - typings.monacoEditor.mod.editor.IMouseTargetOutsideEditor
*/
trait IMouseTarget extends StObject
object IMouseTarget {
  
  inline def IMouseTargetContentEmpty(
    detail: IMouseTargetContentEmptyData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: CONTENT_EMPTY
  ): typings.monacoEditor.mod.editor.IMouseTargetContentEmpty = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetContentEmpty]
  }
  
  inline def IMouseTargetContentText(
    detail: IMouseTargetContentTextData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: CONTENT_TEXT
  ): typings.monacoEditor.mod.editor.IMouseTargetContentText = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetContentText]
  }
  
  inline def IMouseTargetContentWidget(detail: String, mouseColumn: Double, position: Null, range: Null, `type`: CONTENT_WIDGET): typings.monacoEditor.mod.editor.IMouseTargetContentWidget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetContentWidget]
  }
  
  inline def IMouseTargetMargin(
    detail: IMouseTargetMarginData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: GUTTER_GLYPH_MARGIN | GUTTER_LINE_NUMBERS | GUTTER_LINE_DECORATIONS
  ): typings.monacoEditor.mod.editor.IMouseTargetMargin = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetMargin]
  }
  
  inline def IMouseTargetOutsideEditor(
    mouseColumn: Double,
    outsideDistance: Double,
    outsidePosition: above | below | left | right,
    `type`: OUTSIDE_EDITOR
  ): typings.monacoEditor.mod.editor.IMouseTargetOutsideEditor = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], outsideDistance = outsideDistance.asInstanceOf[js.Any], outsidePosition = outsidePosition.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetOutsideEditor]
  }
  
  inline def IMouseTargetOverlayWidget(detail: String, mouseColumn: Double, position: Null, range: Null, `type`: OVERLAY_WIDGET): typings.monacoEditor.mod.editor.IMouseTargetOverlayWidget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetOverlayWidget]
  }
  
  inline def IMouseTargetOverviewRuler(mouseColumn: Double, `type`: OVERVIEW_RULER): typings.monacoEditor.mod.editor.IMouseTargetOverviewRuler = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetOverviewRuler]
  }
  
  inline def IMouseTargetScrollbar(mouseColumn: Double, position: Position, range: Range, `type`: SCROLLBAR): typings.monacoEditor.mod.editor.IMouseTargetScrollbar = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetScrollbar]
  }
  
  inline def IMouseTargetTextarea(mouseColumn: Double, position: Null, range: Null, `type`: TEXTAREA): typings.monacoEditor.mod.editor.IMouseTargetTextarea = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetTextarea]
  }
  
  inline def IMouseTargetUnknown(mouseColumn: Double, `type`: UNKNOWN): typings.monacoEditor.mod.editor.IMouseTargetUnknown = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetUnknown]
  }
  
  inline def IMouseTargetViewZone(
    detail: IMouseTargetViewZoneData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: GUTTER_VIEW_ZONE | CONTENT_VIEW_ZONE
  ): typings.monacoEditor.mod.editor.IMouseTargetViewZone = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IMouseTargetViewZone]
  }
}
