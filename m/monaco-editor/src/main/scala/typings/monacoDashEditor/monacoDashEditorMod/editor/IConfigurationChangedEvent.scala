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
    val __obj = js.Dynamic.literal(accessibilitySupport = accessibilitySupport.asInstanceOf[js.Any], autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], autoClosingOvertype = autoClosingOvertype.asInstanceOf[js.Any], autoClosingQuotes = autoClosingQuotes.asInstanceOf[js.Any], autoIndent = autoIndent.asInstanceOf[js.Any], autoSurround = autoSurround.asInstanceOf[js.Any], canUseLayerHinting = canUseLayerHinting.asInstanceOf[js.Any], contribInfo = contribInfo.asInstanceOf[js.Any], copyWithSyntaxHighlighting = copyWithSyntaxHighlighting.asInstanceOf[js.Any], dragAndDrop = dragAndDrop.asInstanceOf[js.Any], editorClassName = editorClassName.asInstanceOf[js.Any], emptySelectionClipboard = emptySelectionClipboard.asInstanceOf[js.Any], fontInfo = fontInfo.asInstanceOf[js.Any], layoutInfo = layoutInfo.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], multiCursorMergeOverlapping = multiCursorMergeOverlapping.asInstanceOf[js.Any], multiCursorModifier = multiCursorModifier.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], tabFocusMode = tabFocusMode.asInstanceOf[js.Any], useTabStops = useTabStops.asInstanceOf[js.Any], viewInfo = viewInfo.asInstanceOf[js.Any], wordSeparators = wordSeparators.asInstanceOf[js.Any], wrappingInfo = wrappingInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConfigurationChangedEvent]
  }
}

