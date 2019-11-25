package typings.preact.srcMod.h.JSX

import typings.preact.Anon_Html
import typings.preact.srcMod.ComponentChildren
import typings.preact.srcMod.PreactDOMAttributes
import typings.std.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[Target /* <: EventTarget */] extends PreactDOMAttributes {
  // Media Events
  var onAbort: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onAbortCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onAnimationEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler[Target]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler[Target]] = js.undefined
  var onAnimationIteration: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler[Target]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler[Target]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler[Target]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.AnimationEventHandler[Target]] = js.undefined
  var onBlur: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.FocusEventHandler[Target]] = js.undefined
  var onBlurCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.FocusEventHandler[Target]] = js.undefined
  var onCanPlay: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onCanPlayCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onCanPlayThrough: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onChangeCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  // MouseEvents
  var onClick: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onClickCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler[Target]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler[Target]] = js.undefined
  var onCompositionStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler[Target]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler[Target]] = js.undefined
  var onCompositionUpdate: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler[Target]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.CompositionEventHandler[Target]] = js.undefined
  var onContextMenu: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onContextMenuCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.undefined
  var onCopyCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.undefined
  var onCut: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.undefined
  var onCutCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.undefined
  var onDblClick: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onDblClickCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onDrag: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragEnter: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragEnterCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragExit: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragExitCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragLeave: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragOver: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragOverCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDragStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDrop: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDropCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.DragEventHandler[Target]] = js.undefined
  var onDurationChange: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onEmptied: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onEmptiedCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onEncrypted: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onEncryptedCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onEnded: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onEndedCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onError: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onErrorCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.FocusEventHandler[Target]] = js.undefined
  var onFocusCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.FocusEventHandler[Target]] = js.undefined
  var onGotPointerCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onInput: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onInputCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onInvalid: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onInvalidCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  // Keyboard Events
  var onKeyDown: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.undefined
  var onKeyDownCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.undefined
  var onKeyPress: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.undefined
  var onKeyPressCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.undefined
  var onKeyUp: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.undefined
  var onKeyUpCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onLoadCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onLoadStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onLoadStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onLoadedData: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onLoadedMetadata: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onLostPointerCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onMouseDown: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseDownCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseEnter: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseEnterCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseLeave: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseLeaveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseMove: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseOut: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseOutCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseOver: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseOverCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseUp: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onMouseUpCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.MouseEventHandler[Target]] = js.undefined
  var onPaste: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.undefined
  var onPasteCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.undefined
  var onPause: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onPauseCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onPlay: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onPlayCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onPlaying: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onPlayingCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onPointerCancel: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerDown: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerDownCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerEnter: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerLeave: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerMove: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerOut: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerOutCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  // Pointer Events
  var onPointerOver: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerOverCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerUp: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onPointerUpCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.PointerEventHandler[Target]] = js.undefined
  var onProgress: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onProgressCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onRateChange: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onRateChangeCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.UIEventHandler[Target]] = js.undefined
  var onScrollCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.UIEventHandler[Target]] = js.undefined
  var onSearch: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSearchCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSeeked: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSeekedCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSeeking: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSeekingCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSelectCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onStalled: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onStalledCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSubmit: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSubmitCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSuspend: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onSuspendCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onTimeUpdate: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler[Target]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler[Target]] = js.undefined
  var onTouchEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler[Target]] = js.undefined
  var onTouchEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler[Target]] = js.undefined
  var onTouchMove: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler[Target]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler[Target]] = js.undefined
  var onTouchStart: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler[Target]] = js.undefined
  var onTouchStartCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TouchEventHandler[Target]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TransitionEventHandler[Target]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.TransitionEventHandler[Target]] = js.undefined
  var onVolumeChange: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onWaiting: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  var onWaitingCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.GenericEventHandler[Target]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.WheelEventHandler[Target]] = js.undefined
  var onWheelCapture: js.UndefOr[typings.preact.srcJsxMod.JSXInternal.WheelEventHandler[Target]] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply[Target /* <: EventTarget */](
    children: ComponentChildren = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    onAbort: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onAbortCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onAnimationEnd: typings.preact.srcJsxMod.JSXInternal.TargetedAnimationEvent[Target] => Unit = null,
    onAnimationEndCapture: typings.preact.srcJsxMod.JSXInternal.TargetedAnimationEvent[Target] => Unit = null,
    onAnimationIteration: typings.preact.srcJsxMod.JSXInternal.TargetedAnimationEvent[Target] => Unit = null,
    onAnimationIterationCapture: typings.preact.srcJsxMod.JSXInternal.TargetedAnimationEvent[Target] => Unit = null,
    onAnimationStart: typings.preact.srcJsxMod.JSXInternal.TargetedAnimationEvent[Target] => Unit = null,
    onAnimationStartCapture: typings.preact.srcJsxMod.JSXInternal.TargetedAnimationEvent[Target] => Unit = null,
    onBlur: typings.preact.srcJsxMod.JSXInternal.TargetedFocusEvent[Target] => Unit = null,
    onBlurCapture: typings.preact.srcJsxMod.JSXInternal.TargetedFocusEvent[Target] => Unit = null,
    onCanPlay: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onCanPlayCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onCanPlayThrough: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onCanPlayThroughCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onChange: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onChangeCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onClick: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onClickCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onCompositionEnd: typings.preact.srcJsxMod.JSXInternal.TargetedCompositionEvent[Target] => Unit = null,
    onCompositionEndCapture: typings.preact.srcJsxMod.JSXInternal.TargetedCompositionEvent[Target] => Unit = null,
    onCompositionStart: typings.preact.srcJsxMod.JSXInternal.TargetedCompositionEvent[Target] => Unit = null,
    onCompositionStartCapture: typings.preact.srcJsxMod.JSXInternal.TargetedCompositionEvent[Target] => Unit = null,
    onCompositionUpdate: typings.preact.srcJsxMod.JSXInternal.TargetedCompositionEvent[Target] => Unit = null,
    onCompositionUpdateCapture: typings.preact.srcJsxMod.JSXInternal.TargetedCompositionEvent[Target] => Unit = null,
    onContextMenu: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onContextMenuCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onCopy: typings.preact.srcJsxMod.JSXInternal.TargetedClipboardEvent[Target] => Unit = null,
    onCopyCapture: typings.preact.srcJsxMod.JSXInternal.TargetedClipboardEvent[Target] => Unit = null,
    onCut: typings.preact.srcJsxMod.JSXInternal.TargetedClipboardEvent[Target] => Unit = null,
    onCutCapture: typings.preact.srcJsxMod.JSXInternal.TargetedClipboardEvent[Target] => Unit = null,
    onDblClick: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onDblClickCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onDrag: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragCapture: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragEnd: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragEndCapture: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragEnter: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragEnterCapture: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragExit: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragExitCapture: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragLeave: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragLeaveCapture: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragOver: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragOverCapture: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragStart: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDragStartCapture: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDrop: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDropCapture: typings.preact.srcJsxMod.JSXInternal.TargetedDragEvent[Target] => Unit = null,
    onDurationChange: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onDurationChangeCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onEmptied: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onEmptiedCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onEncrypted: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onEncryptedCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onEnded: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onEndedCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onError: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onErrorCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onFocus: typings.preact.srcJsxMod.JSXInternal.TargetedFocusEvent[Target] => Unit = null,
    onFocusCapture: typings.preact.srcJsxMod.JSXInternal.TargetedFocusEvent[Target] => Unit = null,
    onGotPointerCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onGotPointerCaptureCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onInput: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onInputCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onInvalid: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onInvalidCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onKeyDown: typings.preact.srcJsxMod.JSXInternal.TargetedKeyboardEvent[Target] => Unit = null,
    onKeyDownCapture: typings.preact.srcJsxMod.JSXInternal.TargetedKeyboardEvent[Target] => Unit = null,
    onKeyPress: typings.preact.srcJsxMod.JSXInternal.TargetedKeyboardEvent[Target] => Unit = null,
    onKeyPressCapture: typings.preact.srcJsxMod.JSXInternal.TargetedKeyboardEvent[Target] => Unit = null,
    onKeyUp: typings.preact.srcJsxMod.JSXInternal.TargetedKeyboardEvent[Target] => Unit = null,
    onKeyUpCapture: typings.preact.srcJsxMod.JSXInternal.TargetedKeyboardEvent[Target] => Unit = null,
    onLoad: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onLoadCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onLoadStart: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onLoadStartCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onLoadedData: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onLoadedDataCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onLoadedMetadata: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onLoadedMetadataCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onLostPointerCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onLostPointerCaptureCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onMouseDown: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseDownCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseEnter: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseEnterCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseLeave: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseLeaveCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseMove: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseMoveCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseOut: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseOutCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseOver: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseOverCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseUp: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onMouseUpCapture: typings.preact.srcJsxMod.JSXInternal.TargetedMouseEvent[Target] => Unit = null,
    onPaste: typings.preact.srcJsxMod.JSXInternal.TargetedClipboardEvent[Target] => Unit = null,
    onPasteCapture: typings.preact.srcJsxMod.JSXInternal.TargetedClipboardEvent[Target] => Unit = null,
    onPause: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onPauseCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onPlay: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onPlayCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onPlaying: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onPlayingCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onPointerCancel: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerCancelCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerDown: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerDownCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerEnter: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerEnterCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerLeave: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerLeaveCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerMove: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerMoveCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerOut: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerOutCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerOver: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerOverCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerUp: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onPointerUpCapture: typings.preact.srcJsxMod.JSXInternal.TargetedPointerEvent[Target] => Unit = null,
    onProgress: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onProgressCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onRateChange: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onRateChangeCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onScroll: typings.preact.srcJsxMod.JSXInternal.TargetedUIEvent[Target] => Unit = null,
    onScrollCapture: typings.preact.srcJsxMod.JSXInternal.TargetedUIEvent[Target] => Unit = null,
    onSearch: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSearchCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSeeked: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSeekedCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSeeking: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSeekingCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSelect: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSelectCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onStalled: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onStalledCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSubmit: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSubmitCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSuspend: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onSuspendCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onTimeUpdate: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onTimeUpdateCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onTouchCancel: typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target] => Unit = null,
    onTouchCancelCapture: typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target] => Unit = null,
    onTouchEnd: typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target] => Unit = null,
    onTouchEndCapture: typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target] => Unit = null,
    onTouchMove: typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target] => Unit = null,
    onTouchMoveCapture: typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target] => Unit = null,
    onTouchStart: typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target] => Unit = null,
    onTouchStartCapture: typings.preact.srcJsxMod.JSXInternal.TargetedTouchEvent[Target] => Unit = null,
    onTransitionEnd: typings.preact.srcJsxMod.JSXInternal.TargetedTransitionEvent[Target] => Unit = null,
    onTransitionEndCapture: typings.preact.srcJsxMod.JSXInternal.TargetedTransitionEvent[Target] => Unit = null,
    onVolumeChange: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onVolumeChangeCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onWaiting: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onWaitingCapture: typings.preact.srcJsxMod.JSXInternal.TargetedEvent[Target, Event] => Unit = null,
    onWheel: typings.preact.srcJsxMod.JSXInternal.TargetedWheelEvent[Target] => Unit = null,
    onWheelCapture: typings.preact.srcJsxMod.JSXInternal.TargetedWheelEvent[Target] => Unit = null
  ): DOMAttributes[Target] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[DOMAttributes[Target]]
  }
}

