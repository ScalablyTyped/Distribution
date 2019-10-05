package typings.preact.srcMod.h.JSX

import typings.preact.Anon_Html
import typings.preact.srcMod.ComponentChildren
import typings.preact.srcMod.PreactDOMAttributes
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes extends PreactDOMAttributes {
  // Media Events
  var onAbort: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onAbortCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onAnimationEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler] = js.undefined
  var onAnimationEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler] = js.undefined
  var onAnimationIteration: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler] = js.undefined
  var onAnimationStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler] = js.undefined
  var onBlur: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.FocusEventHandler] = js.undefined
  var onBlurCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.FocusEventHandler] = js.undefined
  var onCanPlay: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onCanPlayCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onCanPlayThrough: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  // Form Events
  var onChange: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onChangeCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  // MouseEvents
  var onClick: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onClickCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler] = js.undefined
  var onCompositionEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler] = js.undefined
  var onCompositionStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler] = js.undefined
  var onCompositionStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler] = js.undefined
  var onCompositionUpdate: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler] = js.undefined
  var onContextMenu: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onContextMenuCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler] = js.undefined
  var onCopyCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler] = js.undefined
  var onCut: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler] = js.undefined
  var onCutCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler] = js.undefined
  var onDblClick: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onDblClickCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onDrag: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragEnter: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragEnterCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragExit: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragExitCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragLeave: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragLeaveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragOver: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragOverCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDragStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDrop: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDropCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler] = js.undefined
  var onDurationChange: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onDurationChangeCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onEmptied: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onEmptiedCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onEncrypted: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onEncryptedCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onEnded: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onEndedCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onError: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onErrorCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.FocusEventHandler] = js.undefined
  var onFocusCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.FocusEventHandler] = js.undefined
  var onGotPointerCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onInput: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onInputCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onInvalid: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onInvalidCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  // Keyboard Events
  var onKeyDown: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler] = js.undefined
  var onKeyDownCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler] = js.undefined
  var onKeyPress: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler] = js.undefined
  var onKeyPressCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler] = js.undefined
  var onKeyUp: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler] = js.undefined
  var onKeyUpCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onLoadCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onLoadStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onLoadStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onLoadedData: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onLoadedDataCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onLoadedMetadata: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onLostPointerCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onMouseDown: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseDownCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseEnterCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseLeaveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseMove: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseMoveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseOut: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseOutCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseOver: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseOverCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseUp: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onMouseUpCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler] = js.undefined
  var onPaste: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler] = js.undefined
  var onPasteCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler] = js.undefined
  var onPause: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onPauseCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onPlay: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onPlayCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onPlaying: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onPlayingCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onPointerCancel: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerCancelCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerDown: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerDownCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerEnter: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerEnterCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerLeave: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerMove: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerMoveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerOut: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerOutCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  // Pointer Events
  var onPointerOver: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerOverCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerUp: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onPointerUpCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler] = js.undefined
  var onProgress: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onProgressCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onRateChange: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onRateChangeCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.UIEventHandler] = js.undefined
  var onScrollCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.UIEventHandler] = js.undefined
  var onSearch: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSearchCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSeeked: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSeekedCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSeeking: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSeekingCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSelectCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onStalled: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onStalledCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSubmit: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSubmitCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSuspend: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onSuspendCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onTimeUpdate: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler] = js.undefined
  var onTouchCancelCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler] = js.undefined
  var onTouchEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler] = js.undefined
  var onTouchEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler] = js.undefined
  var onTouchMove: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler] = js.undefined
  var onTouchMoveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler] = js.undefined
  var onTouchStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler] = js.undefined
  var onTouchStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TransitionEventHandler] = js.undefined
  var onTransitionEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TransitionEventHandler] = js.undefined
  var onVolumeChange: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onWaiting: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  var onWaitingCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.WheelEventHandler] = js.undefined
  var onWheelCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.WheelEventHandler] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply(
    children: ComponentChildren = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    onAbort: Event => Unit = null,
    onAbortCapture: Event => Unit = null,
    onAnimationEnd: AnimationEvent => Unit = null,
    onAnimationEndCapture: AnimationEvent => Unit = null,
    onAnimationIteration: AnimationEvent => Unit = null,
    onAnimationIterationCapture: AnimationEvent => Unit = null,
    onAnimationStart: AnimationEvent => Unit = null,
    onAnimationStartCapture: AnimationEvent => Unit = null,
    onBlur: FocusEvent => Unit = null,
    onBlurCapture: FocusEvent => Unit = null,
    onCanPlay: Event => Unit = null,
    onCanPlayCapture: Event => Unit = null,
    onCanPlayThrough: Event => Unit = null,
    onCanPlayThroughCapture: Event => Unit = null,
    onChange: Event => Unit = null,
    onChangeCapture: Event => Unit = null,
    onClick: MouseEvent => Unit = null,
    onClickCapture: MouseEvent => Unit = null,
    onCompositionEnd: CompositionEvent => Unit = null,
    onCompositionEndCapture: CompositionEvent => Unit = null,
    onCompositionStart: CompositionEvent => Unit = null,
    onCompositionStartCapture: CompositionEvent => Unit = null,
    onCompositionUpdate: CompositionEvent => Unit = null,
    onCompositionUpdateCapture: CompositionEvent => Unit = null,
    onContextMenu: MouseEvent => Unit = null,
    onContextMenuCapture: MouseEvent => Unit = null,
    onCopy: ClipboardEvent => Unit = null,
    onCopyCapture: ClipboardEvent => Unit = null,
    onCut: ClipboardEvent => Unit = null,
    onCutCapture: ClipboardEvent => Unit = null,
    onDblClick: MouseEvent => Unit = null,
    onDblClickCapture: MouseEvent => Unit = null,
    onDrag: DragEvent => Unit = null,
    onDragCapture: DragEvent => Unit = null,
    onDragEnd: DragEvent => Unit = null,
    onDragEndCapture: DragEvent => Unit = null,
    onDragEnter: DragEvent => Unit = null,
    onDragEnterCapture: DragEvent => Unit = null,
    onDragExit: DragEvent => Unit = null,
    onDragExitCapture: DragEvent => Unit = null,
    onDragLeave: DragEvent => Unit = null,
    onDragLeaveCapture: DragEvent => Unit = null,
    onDragOver: DragEvent => Unit = null,
    onDragOverCapture: DragEvent => Unit = null,
    onDragStart: DragEvent => Unit = null,
    onDragStartCapture: DragEvent => Unit = null,
    onDrop: DragEvent => Unit = null,
    onDropCapture: DragEvent => Unit = null,
    onDurationChange: Event => Unit = null,
    onDurationChangeCapture: Event => Unit = null,
    onEmptied: Event => Unit = null,
    onEmptiedCapture: Event => Unit = null,
    onEncrypted: Event => Unit = null,
    onEncryptedCapture: Event => Unit = null,
    onEnded: Event => Unit = null,
    onEndedCapture: Event => Unit = null,
    onError: Event => Unit = null,
    onErrorCapture: Event => Unit = null,
    onFocus: FocusEvent => Unit = null,
    onFocusCapture: FocusEvent => Unit = null,
    onGotPointerCapture: PointerEvent => Unit = null,
    onGotPointerCaptureCapture: PointerEvent => Unit = null,
    onInput: Event => Unit = null,
    onInputCapture: Event => Unit = null,
    onInvalid: Event => Unit = null,
    onInvalidCapture: Event => Unit = null,
    onKeyDown: KeyboardEvent => Unit = null,
    onKeyDownCapture: KeyboardEvent => Unit = null,
    onKeyPress: KeyboardEvent => Unit = null,
    onKeyPressCapture: KeyboardEvent => Unit = null,
    onKeyUp: KeyboardEvent => Unit = null,
    onKeyUpCapture: KeyboardEvent => Unit = null,
    onLoad: Event => Unit = null,
    onLoadCapture: Event => Unit = null,
    onLoadStart: Event => Unit = null,
    onLoadStartCapture: Event => Unit = null,
    onLoadedData: Event => Unit = null,
    onLoadedDataCapture: Event => Unit = null,
    onLoadedMetadata: Event => Unit = null,
    onLoadedMetadataCapture: Event => Unit = null,
    onLostPointerCapture: PointerEvent => Unit = null,
    onLostPointerCaptureCapture: PointerEvent => Unit = null,
    onMouseDown: MouseEvent => Unit = null,
    onMouseDownCapture: MouseEvent => Unit = null,
    onMouseEnter: MouseEvent => Unit = null,
    onMouseEnterCapture: MouseEvent => Unit = null,
    onMouseLeave: MouseEvent => Unit = null,
    onMouseLeaveCapture: MouseEvent => Unit = null,
    onMouseMove: MouseEvent => Unit = null,
    onMouseMoveCapture: MouseEvent => Unit = null,
    onMouseOut: MouseEvent => Unit = null,
    onMouseOutCapture: MouseEvent => Unit = null,
    onMouseOver: MouseEvent => Unit = null,
    onMouseOverCapture: MouseEvent => Unit = null,
    onMouseUp: MouseEvent => Unit = null,
    onMouseUpCapture: MouseEvent => Unit = null,
    onPaste: ClipboardEvent => Unit = null,
    onPasteCapture: ClipboardEvent => Unit = null,
    onPause: Event => Unit = null,
    onPauseCapture: Event => Unit = null,
    onPlay: Event => Unit = null,
    onPlayCapture: Event => Unit = null,
    onPlaying: Event => Unit = null,
    onPlayingCapture: Event => Unit = null,
    onPointerCancel: PointerEvent => Unit = null,
    onPointerCancelCapture: PointerEvent => Unit = null,
    onPointerDown: PointerEvent => Unit = null,
    onPointerDownCapture: PointerEvent => Unit = null,
    onPointerEnter: PointerEvent => Unit = null,
    onPointerEnterCapture: PointerEvent => Unit = null,
    onPointerLeave: PointerEvent => Unit = null,
    onPointerLeaveCapture: PointerEvent => Unit = null,
    onPointerMove: PointerEvent => Unit = null,
    onPointerMoveCapture: PointerEvent => Unit = null,
    onPointerOut: PointerEvent => Unit = null,
    onPointerOutCapture: PointerEvent => Unit = null,
    onPointerOver: PointerEvent => Unit = null,
    onPointerOverCapture: PointerEvent => Unit = null,
    onPointerUp: PointerEvent => Unit = null,
    onPointerUpCapture: PointerEvent => Unit = null,
    onProgress: Event => Unit = null,
    onProgressCapture: Event => Unit = null,
    onRateChange: Event => Unit = null,
    onRateChangeCapture: Event => Unit = null,
    onScroll: UIEvent => Unit = null,
    onScrollCapture: UIEvent => Unit = null,
    onSearch: Event => Unit = null,
    onSearchCapture: Event => Unit = null,
    onSeeked: Event => Unit = null,
    onSeekedCapture: Event => Unit = null,
    onSeeking: Event => Unit = null,
    onSeekingCapture: Event => Unit = null,
    onSelect: Event => Unit = null,
    onSelectCapture: Event => Unit = null,
    onStalled: Event => Unit = null,
    onStalledCapture: Event => Unit = null,
    onSubmit: Event => Unit = null,
    onSubmitCapture: Event => Unit = null,
    onSuspend: Event => Unit = null,
    onSuspendCapture: Event => Unit = null,
    onTimeUpdate: Event => Unit = null,
    onTimeUpdateCapture: Event => Unit = null,
    onTouchCancel: TouchEvent => Unit = null,
    onTouchCancelCapture: TouchEvent => Unit = null,
    onTouchEnd: TouchEvent => Unit = null,
    onTouchEndCapture: TouchEvent => Unit = null,
    onTouchMove: TouchEvent => Unit = null,
    onTouchMoveCapture: TouchEvent => Unit = null,
    onTouchStart: TouchEvent => Unit = null,
    onTouchStartCapture: TouchEvent => Unit = null,
    onTransitionEnd: TransitionEvent => Unit = null,
    onTransitionEndCapture: TransitionEvent => Unit = null,
    onVolumeChange: Event => Unit = null,
    onVolumeChangeCapture: Event => Unit = null,
    onWaiting: Event => Unit = null,
    onWaitingCapture: Event => Unit = null,
    onWheel: WheelEvent => Unit = null,
    onWheelCapture: WheelEvent => Unit = null
  ): DOMAttributes = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(js.Any.fromFunction1(onAbortCapture))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1(onAnimationEndCapture))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1(onAnimationIterationCapture))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1(onAnimationStartCapture))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(onCanPlayCapture))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(onCanPlayThroughCapture))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1(onChangeCapture))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1(onClickCapture))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1(onCompositionEndCapture))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1(onCompositionStartCapture))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1(onCompositionUpdateCapture))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(onContextMenuCapture))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(js.Any.fromFunction1(onCopyCapture))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(js.Any.fromFunction1(onCutCapture))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1(onDblClickCapture))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1(onDragCapture))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1(onDragEndCapture))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(onDragEnterCapture))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(js.Any.fromFunction1(onDragExitCapture))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(onDragLeaveCapture))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1(onDragOverCapture))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1(onDragStartCapture))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1(onDropCapture))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(onDurationChangeCapture))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(onEmptiedCapture))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(js.Any.fromFunction1(onEncryptedCapture))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(js.Any.fromFunction1(onEndedCapture))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(js.Any.fromFunction1(onErrorCapture))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1(onFocusCapture))
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(js.Any.fromFunction1(onGotPointerCapture))
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1(onGotPointerCaptureCapture))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1(onInputCapture))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(js.Any.fromFunction1(onInvalidCapture))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(onKeyDownCapture))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(onKeyPressCapture))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(onKeyUpCapture))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1(onLoadCapture))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(onLoadStartCapture))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(onLoadedDataCapture))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(onLoadedMetadataCapture))
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(js.Any.fromFunction1(onLostPointerCapture))
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(js.Any.fromFunction1(onLostPointerCaptureCapture))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(onMouseDownCapture))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseEnterCapture != null) __obj.updateDynamic("onMouseEnterCapture")(js.Any.fromFunction1(onMouseEnterCapture))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseLeaveCapture != null) __obj.updateDynamic("onMouseLeaveCapture")(js.Any.fromFunction1(onMouseLeaveCapture))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(onMouseMoveCapture))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(onMouseOutCapture))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(onMouseOverCapture))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(onMouseUpCapture))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(js.Any.fromFunction1(onPasteCapture))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(js.Any.fromFunction1(onPauseCapture))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(js.Any.fromFunction1(onPlayCapture))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(js.Any.fromFunction1(onPlayingCapture))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(onPointerCancelCapture))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(onPointerDownCapture))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(onPointerEnterCapture))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(onPointerLeaveCapture))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(onPointerMoveCapture))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(onPointerOutCapture))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(onPointerOverCapture))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(onPointerUpCapture))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(js.Any.fromFunction1(onProgressCapture))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(onRateChangeCapture))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onSearchCapture != null) __obj.updateDynamic("onSearchCapture")(js.Any.fromFunction1(onSearchCapture))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(js.Any.fromFunction1(onSeekedCapture))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(js.Any.fromFunction1(onSeekingCapture))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(js.Any.fromFunction1(onSelectCapture))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(js.Any.fromFunction1(onStalledCapture))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(js.Any.fromFunction1(onSuspendCapture))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1(onTimeUpdateCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1(onTouchCancelCapture))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1(onTouchMoveCapture))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction1(onTouchStartCapture))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(js.Any.fromFunction1(onTransitionEndCapture))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(onVolumeChangeCapture))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(js.Any.fromFunction1(onWaitingCapture))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    __obj.asInstanceOf[DOMAttributes]
  }
}

