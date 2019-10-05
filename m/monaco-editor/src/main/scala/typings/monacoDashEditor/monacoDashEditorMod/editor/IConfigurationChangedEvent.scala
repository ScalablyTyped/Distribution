package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurationChangedEvent extends js.Object {
  val accessibilitySupport: Boolean
  val autoClosingBrackets: Boolean
  val autoClosingOvertype: Boolean
  val autoClosingQuotes: Boolean
  val autoIndent: Boolean
  val autoSurround: Boolean
  val canUseLayerHinting: Boolean
  val contribInfo: Boolean
  val copyWithSyntaxHighlighting: Boolean
  val dragAndDrop: Boolean
  val editorClassName: Boolean
  val emptySelectionClipboard: Boolean
  val fontInfo: Boolean
  val layoutInfo: Boolean
  val lineHeight: Boolean
  val multiCursorMergeOverlapping: Boolean
  val multiCursorModifier: Boolean
  val pixelRatio: Boolean
  val readOnly: Boolean
  val tabFocusMode: Boolean
  val useTabStops: Boolean
  val viewInfo: Boolean
  val wordSeparators: Boolean
  val wrappingInfo: Boolean
}

object IConfigurationChangedEvent {
  @scala.inline
  def apply(
    accessibilitySupport: Boolean,
    autoClosingBrackets: Boolean,
    autoClosingOvertype: Boolean,
    autoClosingQuotes: Boolean,
    autoIndent: Boolean,
    autoSurround: Boolean,
    canUseLayerHinting: Boolean,
    contribInfo: Boolean,
    copyWithSyntaxHighlighting: Boolean,
    dragAndDrop: Boolean,
    editorClassName: Boolean,
    emptySelectionClipboard: Boolean,
    fontInfo: Boolean,
    layoutInfo: Boolean,
    lineHeight: Boolean,
    multiCursorMergeOverlapping: Boolean,
    multiCursorModifier: Boolean,
    pixelRatio: Boolean,
    readOnly: Boolean,
    tabFocusMode: Boolean,
    useTabStops: Boolean,
    viewInfo: Boolean,
    wordSeparators: Boolean,
    wrappingInfo: Boolean
  ): IConfigurationChangedEvent = {
    val __obj = js.Dynamic.literal(accessibilitySupport = accessibilitySupport, autoClosingBrackets = autoClosingBrackets, autoClosingOvertype = autoClosingOvertype, autoClosingQuotes = autoClosingQuotes, autoIndent = autoIndent, autoSurround = autoSurround, canUseLayerHinting = canUseLayerHinting, contribInfo = contribInfo, copyWithSyntaxHighlighting = copyWithSyntaxHighlighting, dragAndDrop = dragAndDrop, editorClassName = editorClassName, emptySelectionClipboard = emptySelectionClipboard, fontInfo = fontInfo, layoutInfo = layoutInfo, lineHeight = lineHeight, multiCursorMergeOverlapping = multiCursorMergeOverlapping, multiCursorModifier = multiCursorModifier, pixelRatio = pixelRatio, readOnly = readOnly, tabFocusMode = tabFocusMode, useTabStops = useTabStops, viewInfo = viewInfo, wordSeparators = wordSeparators, wrappingInfo = wrappingInfo)
  
    __obj.asInstanceOf[IConfigurationChangedEvent]
  }
}

