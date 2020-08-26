package typings.preact.jsxMod.JSXInternal

import typings.preact.mod.PreactDOMAttributes
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMAttributes[Target /* <: EventTarget */] extends PreactDOMAttributes {
  // Media Events
  var onAbort: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onAbortCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[Target]] = js.native
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[Target]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[Target]] = js.native
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[Target]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[Target]] = js.native
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[Target]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[Target]] = js.native
  var onBlurCapture: js.UndefOr[FocusEventHandler[Target]] = js.native
  var onCanPlay: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onCanPlayCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onCanPlayThrough: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  // Form Events
  var onChange: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onChangeCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  // MouseEvents
  var onClick: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onClickCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[Target]] = js.native
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[Target]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[Target]] = js.native
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[Target]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[Target]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[Target]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[Target]] = js.native
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[Target]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[Target]] = js.native
  var onCutCapture: js.UndefOr[ClipboardEventHandler[Target]] = js.native
  var onDblClick: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onDblClickCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragCapture: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragEndCapture: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragEnterCapture: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragExitCapture: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragOverCapture: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDragStartCapture: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDropCapture: js.UndefOr[DragEventHandler[Target]] = js.native
  var onDurationChange: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onDurationChangeCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onEmptied: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onEmptiedCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onEncrypted: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onEncryptedCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onEnded: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onEndedCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onError: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onErrorCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[Target]] = js.native
  var onFocusCapture: js.UndefOr[FocusEventHandler[Target]] = js.native
  var onFormData: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onFormDataCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onInput: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onInputCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onInvalid: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onInvalidCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[Target]] = js.native
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[Target]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[Target]] = js.native
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[Target]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[Target]] = js.native
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[Target]] = js.native
  // Image Events
  var onLoad: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onLoadCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onLoadStart: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onLoadStartCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onLoadedData: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onLoadedDataCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onLoadedMetadata: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseEnterCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseLeaveCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[Target]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[Target]] = js.native
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[Target]] = js.native
  var onPause: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onPauseCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onPlay: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onPlayCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onPlaying: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onPlayingCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  // Pointer Events
  var onPointerOver: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[Target]] = js.native
  var onProgress: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onProgressCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onRateChange: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onRateChangeCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onReset: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onResetCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[Target]] = js.native
  var onScrollCapture: js.UndefOr[UIEventHandler[Target]] = js.native
  var onSearch: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSearchCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSeeked: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSeekedCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSeeking: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSeekingCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSelectCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onStalled: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onStalledCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSubmit: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSubmitCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSuspend: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onSuspendCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onTimeUpdate: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onTimeUpdateCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  // Details Events
  var onToggle: js.UndefOr[GenericEventHandler[Target]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[Target]] = js.native
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[Target]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[Target]] = js.native
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[Target]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[Target]] = js.native
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[Target]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[Target]] = js.native
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[Target]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[Target]] = js.native
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[Target]] = js.native
  var onVolumeChange: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onVolumeChangeCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onWaiting: js.UndefOr[GenericEventHandler[Target]] = js.native
  var onWaitingCapture: js.UndefOr[GenericEventHandler[Target]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[Target]] = js.native
  var onWheelCapture: js.UndefOr[WheelEventHandler[Target]] = js.native
}

object DOMAttributes {
  @scala.inline
  def apply[/* <: typings.std.EventTarget */ Target](): DOMAttributes[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMAttributes[Target]]
  }
  @scala.inline
  implicit class DOMAttributesOps[Self <: DOMAttributes[_], /* <: typings.std.EventTarget */ Target] (val x: Self with DOMAttributes[Target]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnAbort(value: GenericEventHandler[Target]): Self = this.set("onAbort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAbortCapture(value: GenericEventHandler[Target]): Self = this.set("onAbortCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAbortCapture: Self = this.set("onAbortCapture", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: AnimationEventHandler[Target]): Self = this.set("onAnimationEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnAnimationEndCapture(value: AnimationEventHandler[Target]): Self = this.set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationEndCapture: Self = this.set("onAnimationEndCapture", js.undefined)
    @scala.inline
    def setOnAnimationIteration(value: AnimationEventHandler[Target]): Self = this.set("onAnimationIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    @scala.inline
    def setOnAnimationIterationCapture(value: AnimationEventHandler[Target]): Self = this.set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationIterationCapture: Self = this.set("onAnimationIterationCapture", js.undefined)
    @scala.inline
    def setOnAnimationStart(value: AnimationEventHandler[Target]): Self = this.set("onAnimationStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    @scala.inline
    def setOnAnimationStartCapture(value: AnimationEventHandler[Target]): Self = this.set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimationStartCapture: Self = this.set("onAnimationStartCapture", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEventHandler[Target]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnBlurCapture(value: FocusEventHandler[Target]): Self = this.set("onBlurCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlurCapture: Self = this.set("onBlurCapture", js.undefined)
    @scala.inline
    def setOnCanPlay(value: GenericEventHandler[Target]): Self = this.set("onCanPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayCapture(value: GenericEventHandler[Target]): Self = this.set("onCanPlayCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCanPlayCapture: Self = this.set("onCanPlayCapture", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: GenericEventHandler[Target]): Self = this.set("onCanPlayThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnCanPlayThroughCapture(value: GenericEventHandler[Target]): Self = this.set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCanPlayThroughCapture: Self = this.set("onCanPlayThroughCapture", js.undefined)
    @scala.inline
    def setOnChange(value: GenericEventHandler[Target]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChangeCapture(value: GenericEventHandler[Target]): Self = this.set("onChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChangeCapture: Self = this.set("onChangeCapture", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEventHandler[Target]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClickCapture(value: MouseEventHandler[Target]): Self = this.set("onClickCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClickCapture: Self = this.set("onClickCapture", js.undefined)
    @scala.inline
    def setOnCompositionEnd(value: CompositionEventHandler[Target]): Self = this.set("onCompositionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    @scala.inline
    def setOnCompositionEndCapture(value: CompositionEventHandler[Target]): Self = this.set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionEndCapture: Self = this.set("onCompositionEndCapture", js.undefined)
    @scala.inline
    def setOnCompositionStart(value: CompositionEventHandler[Target]): Self = this.set("onCompositionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    @scala.inline
    def setOnCompositionStartCapture(value: CompositionEventHandler[Target]): Self = this.set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionStartCapture: Self = this.set("onCompositionStartCapture", js.undefined)
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEventHandler[Target]): Self = this.set("onCompositionUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    @scala.inline
    def setOnCompositionUpdateCapture(value: CompositionEventHandler[Target]): Self = this.set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompositionUpdateCapture: Self = this.set("onCompositionUpdateCapture", js.undefined)
    @scala.inline
    def setOnContextMenu(value: MouseEventHandler[Target]): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnContextMenuCapture(value: MouseEventHandler[Target]): Self = this.set("onContextMenuCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnContextMenuCapture: Self = this.set("onContextMenuCapture", js.undefined)
    @scala.inline
    def setOnCopy(value: ClipboardEventHandler[Target]): Self = this.set("onCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCopyCapture(value: ClipboardEventHandler[Target]): Self = this.set("onCopyCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCopyCapture: Self = this.set("onCopyCapture", js.undefined)
    @scala.inline
    def setOnCut(value: ClipboardEventHandler[Target]): Self = this.set("onCut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnCutCapture(value: ClipboardEventHandler[Target]): Self = this.set("onCutCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCutCapture: Self = this.set("onCutCapture", js.undefined)
    @scala.inline
    def setOnDblClick(value: MouseEventHandler[Target]): Self = this.set("onDblClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    @scala.inline
    def setOnDblClickCapture(value: MouseEventHandler[Target]): Self = this.set("onDblClickCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDblClickCapture: Self = this.set("onDblClickCapture", js.undefined)
    @scala.inline
    def setOnDrag(value: DragEventHandler[Target]): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragCapture(value: DragEventHandler[Target]): Self = this.set("onDragCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragCapture: Self = this.set("onDragCapture", js.undefined)
    @scala.inline
    def setOnDragEnd(value: DragEventHandler[Target]): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEndCapture(value: DragEventHandler[Target]): Self = this.set("onDragEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEndCapture: Self = this.set("onDragEndCapture", js.undefined)
    @scala.inline
    def setOnDragEnter(value: DragEventHandler[Target]): Self = this.set("onDragEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragEnterCapture(value: DragEventHandler[Target]): Self = this.set("onDragEnterCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEnterCapture: Self = this.set("onDragEnterCapture", js.undefined)
    @scala.inline
    def setOnDragExit(value: DragEventHandler[Target]): Self = this.set("onDragExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragExitCapture(value: DragEventHandler[Target]): Self = this.set("onDragExitCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragExitCapture: Self = this.set("onDragExitCapture", js.undefined)
    @scala.inline
    def setOnDragLeave(value: DragEventHandler[Target]): Self = this.set("onDragLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragLeaveCapture(value: DragEventHandler[Target]): Self = this.set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragLeaveCapture: Self = this.set("onDragLeaveCapture", js.undefined)
    @scala.inline
    def setOnDragOver(value: DragEventHandler[Target]): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragOverCapture(value: DragEventHandler[Target]): Self = this.set("onDragOverCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragOverCapture: Self = this.set("onDragOverCapture", js.undefined)
    @scala.inline
    def setOnDragStart(value: DragEventHandler[Target]): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragStartCapture(value: DragEventHandler[Target]): Self = this.set("onDragStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragStartCapture: Self = this.set("onDragStartCapture", js.undefined)
    @scala.inline
    def setOnDrop(value: DragEventHandler[Target]): Self = this.set("onDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDropCapture(value: DragEventHandler[Target]): Self = this.set("onDropCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDropCapture: Self = this.set("onDropCapture", js.undefined)
    @scala.inline
    def setOnDurationChange(value: GenericEventHandler[Target]): Self = this.set("onDurationChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnDurationChangeCapture(value: GenericEventHandler[Target]): Self = this.set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDurationChangeCapture: Self = this.set("onDurationChangeCapture", js.undefined)
    @scala.inline
    def setOnEmptied(value: GenericEventHandler[Target]): Self = this.set("onEmptied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEmptiedCapture(value: GenericEventHandler[Target]): Self = this.set("onEmptiedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEmptiedCapture: Self = this.set("onEmptiedCapture", js.undefined)
    @scala.inline
    def setOnEncrypted(value: GenericEventHandler[Target]): Self = this.set("onEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    @scala.inline
    def setOnEncryptedCapture(value: GenericEventHandler[Target]): Self = this.set("onEncryptedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEncryptedCapture: Self = this.set("onEncryptedCapture", js.undefined)
    @scala.inline
    def setOnEnded(value: GenericEventHandler[Target]): Self = this.set("onEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnEndedCapture(value: GenericEventHandler[Target]): Self = this.set("onEndedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEndedCapture: Self = this.set("onEndedCapture", js.undefined)
    @scala.inline
    def setOnError(value: GenericEventHandler[Target]): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnErrorCapture(value: GenericEventHandler[Target]): Self = this.set("onErrorCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnErrorCapture: Self = this.set("onErrorCapture", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEventHandler[Target]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnFocusCapture(value: FocusEventHandler[Target]): Self = this.set("onFocusCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocusCapture: Self = this.set("onFocusCapture", js.undefined)
    @scala.inline
    def setOnFormData(value: GenericEventHandler[Target]): Self = this.set("onFormData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFormData: Self = this.set("onFormData", js.undefined)
    @scala.inline
    def setOnFormDataCapture(value: GenericEventHandler[Target]): Self = this.set("onFormDataCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFormDataCapture: Self = this.set("onFormDataCapture", js.undefined)
    @scala.inline
    def setOnGotPointerCapture(value: PointerEventHandler[Target]): Self = this.set("onGotPointerCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnGotPointerCapture: Self = this.set("onGotPointerCapture", js.undefined)
    @scala.inline
    def setOnGotPointerCaptureCapture(value: PointerEventHandler[Target]): Self = this.set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnGotPointerCaptureCapture: Self = this.set("onGotPointerCaptureCapture", js.undefined)
    @scala.inline
    def setOnInput(value: GenericEventHandler[Target]): Self = this.set("onInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInputCapture(value: GenericEventHandler[Target]): Self = this.set("onInputCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInputCapture: Self = this.set("onInputCapture", js.undefined)
    @scala.inline
    def setOnInvalid(value: GenericEventHandler[Target]): Self = this.set("onInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnInvalidCapture(value: GenericEventHandler[Target]): Self = this.set("onInvalidCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInvalidCapture: Self = this.set("onInvalidCapture", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEventHandler[Target]): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyDownCapture(value: KeyboardEventHandler[Target]): Self = this.set("onKeyDownCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEventHandler[Target]): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyPressCapture(value: KeyboardEventHandler[Target]): Self = this.set("onKeyPressCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyPressCapture: Self = this.set("onKeyPressCapture", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEventHandler[Target]): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnKeyUpCapture(value: KeyboardEventHandler[Target]): Self = this.set("onKeyUpCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
    @scala.inline
    def setOnLoad(value: GenericEventHandler[Target]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadCapture(value: GenericEventHandler[Target]): Self = this.set("onLoadCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadCapture: Self = this.set("onLoadCapture", js.undefined)
    @scala.inline
    def setOnLoadStart(value: GenericEventHandler[Target]): Self = this.set("onLoadStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadStartCapture(value: GenericEventHandler[Target]): Self = this.set("onLoadStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadStartCapture: Self = this.set("onLoadStartCapture", js.undefined)
    @scala.inline
    def setOnLoadedData(value: GenericEventHandler[Target]): Self = this.set("onLoadedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedDataCapture(value: GenericEventHandler[Target]): Self = this.set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadedDataCapture: Self = this.set("onLoadedDataCapture", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: GenericEventHandler[Target]): Self = this.set("onLoadedMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnLoadedMetadataCapture(value: GenericEventHandler[Target]): Self = this.set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoadedMetadataCapture: Self = this.set("onLoadedMetadataCapture", js.undefined)
    @scala.inline
    def setOnLostPointerCapture(value: PointerEventHandler[Target]): Self = this.set("onLostPointerCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLostPointerCapture: Self = this.set("onLostPointerCapture", js.undefined)
    @scala.inline
    def setOnLostPointerCaptureCapture(value: PointerEventHandler[Target]): Self = this.set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLostPointerCaptureCapture: Self = this.set("onLostPointerCaptureCapture", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEventHandler[Target]): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseDownCapture(value: MouseEventHandler[Target]): Self = this.set("onMouseDownCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseDownCapture: Self = this.set("onMouseDownCapture", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEventHandler[Target]): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseEnterCapture(value: MouseEventHandler[Target]): Self = this.set("onMouseEnterCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseEnterCapture: Self = this.set("onMouseEnterCapture", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEventHandler[Target]): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseLeaveCapture(value: MouseEventHandler[Target]): Self = this.set("onMouseLeaveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseLeaveCapture: Self = this.set("onMouseLeaveCapture", js.undefined)
    @scala.inline
    def setOnMouseMove(value: MouseEventHandler[Target]): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseMoveCapture(value: MouseEventHandler[Target]): Self = this.set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseMoveCapture: Self = this.set("onMouseMoveCapture", js.undefined)
    @scala.inline
    def setOnMouseOut(value: MouseEventHandler[Target]): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOutCapture(value: MouseEventHandler[Target]): Self = this.set("onMouseOutCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOutCapture: Self = this.set("onMouseOutCapture", js.undefined)
    @scala.inline
    def setOnMouseOver(value: MouseEventHandler[Target]): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseOverCapture(value: MouseEventHandler[Target]): Self = this.set("onMouseOverCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOverCapture: Self = this.set("onMouseOverCapture", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEventHandler[Target]): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnMouseUpCapture(value: MouseEventHandler[Target]): Self = this.set("onMouseUpCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseUpCapture: Self = this.set("onMouseUpCapture", js.undefined)
    @scala.inline
    def setOnPaste(value: ClipboardEventHandler[Target]): Self = this.set("onPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnPasteCapture(value: ClipboardEventHandler[Target]): Self = this.set("onPasteCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPasteCapture: Self = this.set("onPasteCapture", js.undefined)
    @scala.inline
    def setOnPause(value: GenericEventHandler[Target]): Self = this.set("onPause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPauseCapture(value: GenericEventHandler[Target]): Self = this.set("onPauseCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPauseCapture: Self = this.set("onPauseCapture", js.undefined)
    @scala.inline
    def setOnPlay(value: GenericEventHandler[Target]): Self = this.set("onPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlayCapture(value: GenericEventHandler[Target]): Self = this.set("onPlayCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlayCapture: Self = this.set("onPlayCapture", js.undefined)
    @scala.inline
    def setOnPlaying(value: GenericEventHandler[Target]): Self = this.set("onPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPlayingCapture(value: GenericEventHandler[Target]): Self = this.set("onPlayingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlayingCapture: Self = this.set("onPlayingCapture", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: PointerEventHandler[Target]): Self = this.set("onPointerCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerCancelCapture(value: PointerEventHandler[Target]): Self = this.set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerCancelCapture: Self = this.set("onPointerCancelCapture", js.undefined)
    @scala.inline
    def setOnPointerDown(value: PointerEventHandler[Target]): Self = this.set("onPointerDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerDownCapture(value: PointerEventHandler[Target]): Self = this.set("onPointerDownCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerDownCapture: Self = this.set("onPointerDownCapture", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: PointerEventHandler[Target]): Self = this.set("onPointerEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerEnterCapture(value: PointerEventHandler[Target]): Self = this.set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerEnterCapture: Self = this.set("onPointerEnterCapture", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: PointerEventHandler[Target]): Self = this.set("onPointerLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerLeaveCapture(value: PointerEventHandler[Target]): Self = this.set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerLeaveCapture: Self = this.set("onPointerLeaveCapture", js.undefined)
    @scala.inline
    def setOnPointerMove(value: PointerEventHandler[Target]): Self = this.set("onPointerMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerMoveCapture(value: PointerEventHandler[Target]): Self = this.set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerMoveCapture: Self = this.set("onPointerMoveCapture", js.undefined)
    @scala.inline
    def setOnPointerOut(value: PointerEventHandler[Target]): Self = this.set("onPointerOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOutCapture(value: PointerEventHandler[Target]): Self = this.set("onPointerOutCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerOutCapture: Self = this.set("onPointerOutCapture", js.undefined)
    @scala.inline
    def setOnPointerOver(value: PointerEventHandler[Target]): Self = this.set("onPointerOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerOverCapture(value: PointerEventHandler[Target]): Self = this.set("onPointerOverCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerOverCapture: Self = this.set("onPointerOverCapture", js.undefined)
    @scala.inline
    def setOnPointerUp(value: PointerEventHandler[Target]): Self = this.set("onPointerUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnPointerUpCapture(value: PointerEventHandler[Target]): Self = this.set("onPointerUpCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointerUpCapture: Self = this.set("onPointerUpCapture", js.undefined)
    @scala.inline
    def setOnProgress(value: GenericEventHandler[Target]): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnProgressCapture(value: GenericEventHandler[Target]): Self = this.set("onProgressCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnProgressCapture: Self = this.set("onProgressCapture", js.undefined)
    @scala.inline
    def setOnRateChange(value: GenericEventHandler[Target]): Self = this.set("onRateChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnRateChangeCapture(value: GenericEventHandler[Target]): Self = this.set("onRateChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRateChangeCapture: Self = this.set("onRateChangeCapture", js.undefined)
    @scala.inline
    def setOnReset(value: GenericEventHandler[Target]): Self = this.set("onReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnResetCapture(value: GenericEventHandler[Target]): Self = this.set("onResetCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResetCapture: Self = this.set("onResetCapture", js.undefined)
    @scala.inline
    def setOnScroll(value: UIEventHandler[Target]): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnScrollCapture(value: UIEventHandler[Target]): Self = this.set("onScrollCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnScrollCapture: Self = this.set("onScrollCapture", js.undefined)
    @scala.inline
    def setOnSearch(value: GenericEventHandler[Target]): Self = this.set("onSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnSearchCapture(value: GenericEventHandler[Target]): Self = this.set("onSearchCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSearchCapture: Self = this.set("onSearchCapture", js.undefined)
    @scala.inline
    def setOnSeeked(value: GenericEventHandler[Target]): Self = this.set("onSeeked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeekedCapture(value: GenericEventHandler[Target]): Self = this.set("onSeekedCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSeekedCapture: Self = this.set("onSeekedCapture", js.undefined)
    @scala.inline
    def setOnSeeking(value: GenericEventHandler[Target]): Self = this.set("onSeeking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSeekingCapture(value: GenericEventHandler[Target]): Self = this.set("onSeekingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSeekingCapture: Self = this.set("onSeekingCapture", js.undefined)
    @scala.inline
    def setOnSelect(value: GenericEventHandler[Target]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectCapture(value: GenericEventHandler[Target]): Self = this.set("onSelectCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelectCapture: Self = this.set("onSelectCapture", js.undefined)
    @scala.inline
    def setOnStalled(value: GenericEventHandler[Target]): Self = this.set("onStalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnStalledCapture(value: GenericEventHandler[Target]): Self = this.set("onStalledCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStalledCapture: Self = this.set("onStalledCapture", js.undefined)
    @scala.inline
    def setOnSubmit(value: GenericEventHandler[Target]): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSubmitCapture(value: GenericEventHandler[Target]): Self = this.set("onSubmitCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSubmitCapture: Self = this.set("onSubmitCapture", js.undefined)
    @scala.inline
    def setOnSuspend(value: GenericEventHandler[Target]): Self = this.set("onSuspend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnSuspendCapture(value: GenericEventHandler[Target]): Self = this.set("onSuspendCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSuspendCapture: Self = this.set("onSuspendCapture", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: GenericEventHandler[Target]): Self = this.set("onTimeUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTimeUpdateCapture(value: GenericEventHandler[Target]): Self = this.set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTimeUpdateCapture: Self = this.set("onTimeUpdateCapture", js.undefined)
    @scala.inline
    def setOnToggle(value: GenericEventHandler[Target]): Self = this.set("onToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: TouchEventHandler[Target]): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchCancelCapture(value: TouchEventHandler[Target]): Self = this.set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchCancelCapture: Self = this.set("onTouchCancelCapture", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEventHandler[Target]): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchEndCapture(value: TouchEventHandler[Target]): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    @scala.inline
    def setOnTouchMove(value: TouchEventHandler[Target]): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchMoveCapture(value: TouchEventHandler[Target]): Self = this.set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchMoveCapture: Self = this.set("onTouchMoveCapture", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEventHandler[Target]): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTouchStartCapture(value: TouchEventHandler[Target]): Self = this.set("onTouchStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: TransitionEventHandler[Target]): Self = this.set("onTransitionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnTransitionEndCapture(value: TransitionEventHandler[Target]): Self = this.set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTransitionEndCapture: Self = this.set("onTransitionEndCapture", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: GenericEventHandler[Target]): Self = this.set("onVolumeChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnVolumeChangeCapture(value: GenericEventHandler[Target]): Self = this.set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnVolumeChangeCapture: Self = this.set("onVolumeChangeCapture", js.undefined)
    @scala.inline
    def setOnWaiting(value: GenericEventHandler[Target]): Self = this.set("onWaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWaitingCapture(value: GenericEventHandler[Target]): Self = this.set("onWaitingCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWaitingCapture: Self = this.set("onWaitingCapture", js.undefined)
    @scala.inline
    def setOnWheel(value: WheelEventHandler[Target]): Self = this.set("onWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setOnWheelCapture(value: WheelEventHandler[Target]): Self = this.set("onWheelCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWheelCapture: Self = this.set("onWheelCapture", js.undefined)
  }
  
}

