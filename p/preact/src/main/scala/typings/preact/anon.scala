package typings.preact

import typings.preact.jsxMod.JSXInternal.AnimationEventHandler
import typings.preact.jsxMod.JSXInternal.CSSProperties
import typings.preact.jsxMod.JSXInternal.ClipboardEventHandler
import typings.preact.jsxMod.JSXInternal.CompositionEventHandler
import typings.preact.jsxMod.JSXInternal.DragEventHandler
import typings.preact.jsxMod.JSXInternal.FocusEventHandler
import typings.preact.jsxMod.JSXInternal.GenericEventHandler
import typings.preact.jsxMod.JSXInternal.KeyboardEventHandler
import typings.preact.jsxMod.JSXInternal.MouseEventHandler
import typings.preact.jsxMod.JSXInternal.PointerEventHandler
import typings.preact.jsxMod.JSXInternal.TouchEventHandler
import typings.preact.jsxMod.JSXInternal.TransitionEventHandler
import typings.preact.jsxMod.JSXInternal.UIEventHandler
import typings.preact.jsxMod.JSXInternal.WheelEventHandler
import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.mod.Key
import typings.preact.preactStrings.`lazy`
import typings.preact.preactStrings.`no-referrer-when-downgrade`
import typings.preact.preactStrings.`no-referrer`
import typings.preact.preactStrings.`origin-when-cross-origin`
import typings.preact.preactStrings.`same-origin`
import typings.preact.preactStrings.`strict-origin-when-cross-origin`
import typings.preact.preactStrings.`strict-origin`
import typings.preact.preactStrings.`unsafe-url`
import typings.preact.preactStrings.async
import typings.preact.preactStrings.auto
import typings.preact.preactStrings.characters
import typings.preact.preactStrings.done
import typings.preact.preactStrings.eager
import typings.preact.preactStrings.enter
import typings.preact.preactStrings.go
import typings.preact.preactStrings.ltr
import typings.preact.preactStrings.next
import typings.preact.preactStrings.no
import typings.preact.preactStrings.none
import typings.preact.preactStrings.off
import typings.preact.preactStrings.on
import typings.preact.preactStrings.origin
import typings.preact.preactStrings.previous
import typings.preact.preactStrings.rtl
import typings.preact.preactStrings.search
import typings.preact.preactStrings.send
import typings.preact.preactStrings.sentences
import typings.preact.preactStrings.sync
import typings.preact.preactStrings.words
import typings.preact.preactStrings.yes
import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[T] extends StObject {
    
    def children(value: T): ComponentChildren
  }
  object `0` {
    
    inline def apply[T](children: T => ComponentChildren): `0`[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[`0`[T]]
    }
    
    extension [Self <: `0`[?], T](x: Self & `0`[T]) {
      
      inline def setChildren(value: T => ComponentChildren): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait Children extends StObject {
    
    var children: ComponentChildren
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait ChildrenComponentChildren extends StObject {
    
    var children: typings.preact.internalMod.ComponentChildren
  }
  object ChildrenComponentChildren {
    
    inline def apply(): ChildrenComponentChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildrenComponentChildren]
    }
    
    extension [Self <: ChildrenComponentChildren](x: Self) {
      
      inline def setChildren(value: typings.preact.internalMod.ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: typings.preact.internalMod.ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait CurrentTarget[Target /* <: EventTarget */] extends StObject {
    
    val currentTarget: Target
  }
  object CurrentTarget {
    
    inline def apply[Target /* <: EventTarget */](currentTarget: Target): CurrentTarget[Target] = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentTarget[Target]]
    }
    
    extension [Self <: CurrentTarget[?], Target /* <: EventTarget */](x: Self & CurrentTarget[Target]) {
      
      inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultProps extends StObject {
    
    var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer Defaults */ js.Any
  }
  object DefaultProps {
    
    inline def apply(
      defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer Defaults */ js.Any
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    extension [Self <: DefaultProps](x: Self) {
      
      inline def setDefaultProps(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer Defaults */ js.Any
      ): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined preact.preact/src/jsx.JSXInternal.HTMLAttributes<std.HTMLInputElement> & {  defaultValue :string | undefined} */
  trait HTMLAttributesHTMLInputEl extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accept: js.UndefOr[String] = js.undefined
    
    var acceptCharset: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var action: js.UndefOr[String] = js.undefined
    
    var allow: js.UndefOr[String] = js.undefined
    
    var allowFullScreen: js.UndefOr[Boolean] = js.undefined
    
    var allowTransparency: js.UndefOr[Boolean] = js.undefined
    
    var alt: js.UndefOr[String] = js.undefined
    
    var as: js.UndefOr[String] = js.undefined
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var autoCapitalize: js.UndefOr[off | none | on | sentences | words | characters] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    // Non-standard Attributes
    var autocapitalize: js.UndefOr[off | none | on | sentences | words | characters] = js.undefined
    
    var autocomplete: js.UndefOr[String] = js.undefined
    
    var autocorrect: js.UndefOr[String] = js.undefined
    
    var autofocus: js.UndefOr[Boolean] = js.undefined
    
    var capture: js.UndefOr[Boolean | String] = js.undefined
    
    var cellPadding: js.UndefOr[Double | String] = js.undefined
    
    var cellSpacing: js.UndefOr[Double | String] = js.undefined
    
    var challenge: js.UndefOr[String] = js.undefined
    
    var charSet: js.UndefOr[String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ComponentChildren] = js.undefined
    
    var cite: js.UndefOr[String] = js.undefined
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Boolean] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var controlsList: js.UndefOr[String] = js.undefined
    
    var coords: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var dateTime: js.UndefOr[String] = js.undefined
    
    var decoding: js.UndefOr[sync | async | auto] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[auto | rtl | ltr] = js.undefined
    
    var disablePictureInPicture: js.UndefOr[Boolean] = js.undefined
    
    var disableRemotePlayback: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var download: js.UndefOr[Any] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var encType: js.UndefOr[String] = js.undefined
    
    var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
    
    var `for`: js.UndefOr[String] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    var frameBorder: js.UndefOr[Double | String] = js.undefined
    
    var headers: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var hrefLang: js.UndefOr[String] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var httpEquiv: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr[String] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    // Microdata Attributes
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var jsx: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var keyParams: js.UndefOr[String] = js.undefined
    
    var keyType: js.UndefOr[String] = js.undefined
    
    var kind: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[eager | `lazy`] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var low: js.UndefOr[Double] = js.undefined
    
    var manifest: js.UndefOr[String] = js.undefined
    
    var marginHeight: js.UndefOr[Double] = js.undefined
    
    var marginWidth: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var mediaGroup: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noValidate: js.UndefOr[Boolean] = js.undefined
    
    var nomodule: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    // Media Events
    var onAbort: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onAbortCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    // Animation Events
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onBeforeInputCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlurCapture: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThroughCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // Form Events
    var onChange: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onChangeCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // MouseEvents
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onClickCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    // Composition Events
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenuCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    // Clipboard Events
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCopyCapture: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCutCapture: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onDblClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDblClickCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragCapture: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEndCapture: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnterCapture: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExitCapture: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeaveCapture: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOverCapture: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStartCapture: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDropCapture: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChangeCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptied: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptiedCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncryptedCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onEnded: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onEndedCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onError: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onErrorCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // Focus Events
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocusCapture: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onFormData: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onFormDataCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onGotPointerCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onInput: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onInputCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalid: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalidCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // Keyboard Events
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    // Image Events
    var onLoad: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStartCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedDataCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadataCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onLostPointerCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDownCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnterCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeaveCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseMoveCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOutCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOverCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUpCapture: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPasteCapture: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPause: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onPauseCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlay: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlayCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlaying: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlayingCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOutCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    // Pointer Events
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOverCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgress: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgressCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onRateChange: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onRateChangeCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onReset: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onResetCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // UI Events
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onScrollCapture: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onSearch: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSearchCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeked: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeekedCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeking: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeekingCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // Selection Events
    var onSelect: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelectCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalled: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalledCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmit: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmitCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuspend: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuspendCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdateCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // Details Events
    var onToggle: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // Touch Events
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchCancelCapture: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMoveCapture: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStartCapture: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    // Transition Events
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChangeCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaiting: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaitingCapture: js.UndefOr[GenericEventHandler[HTMLInputElement]] = js.undefined
    
    // Wheel Events
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    var onWheelCapture: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    var onfocusin: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onfocusinCapture: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onfocusout: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onfocusoutCapture: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var optimum: js.UndefOr[Double] = js.undefined
    
    var part: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var ping: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var playsInline: js.UndefOr[Boolean] = js.undefined
    
    var poster: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var preload: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[typings.preact.mod.Ref[HTMLInputElement]] = js.undefined
    
    var referrerpolicy: js.UndefOr[
        `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
      ] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var sandbox: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var scoped: js.UndefOr[Boolean] = js.undefined
    
    var scrolling: js.UndefOr[String] = js.undefined
    
    var seamless: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var span: js.UndefOr[Double] = js.undefined
    
    var spellCheck: js.UndefOr[Boolean] = js.undefined
    
    var spellcheck: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var srcDoc: js.UndefOr[String] = js.undefined
    
    var srcLang: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
    
    var srcset: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[String | CSSProperties] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var useMap: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    var volume: js.UndefOr[String | Double] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var wmode: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[String] = js.undefined
  }
  object HTMLAttributesHTMLInputEl {
    
    inline def apply(): HTMLAttributesHTMLInputEl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLAttributesHTMLInputEl]
    }
    
    extension [Self <: HTMLAttributesHTMLInputEl](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAutoCapitalize(value: off | none | on | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Boolean): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsList(value: String): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
      
      inline def setControlsListUndefined: Self = StObject.set(x, "controlsList", js.undefined)
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      inline def setDecoding(value: sync | async | auto): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
      
      inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDir(value: auto | rtl | ltr): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisablePictureInPicture(value: Boolean): Self = StObject.set(x, "disablePictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
      
      inline def setDisableRemotePlayback(value: Boolean): Self = StObject.set(x, "disableRemotePlayback", value.asInstanceOf[js.Any])
      
      inline def setDisableRemotePlaybackUndefined: Self = StObject.set(x, "disableRemotePlayback", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      inline def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterkeyhint", value.asInstanceOf[js.Any])
      
      inline def setEnterkeyhintUndefined: Self = StObject.set(x, "enterkeyhint", js.undefined)
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      inline def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      inline def setNomodule(value: Boolean): Self = StObject.set(x, "nomodule", value.asInstanceOf[js.Any])
      
      inline def setNomoduleUndefined: Self = StObject.set(x, "nomodule", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      inline def setOnAbortCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onAbortCapture", value.asInstanceOf[js.Any])
      
      inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEventHandler[HTMLInputElement]): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEndCapture(value: AnimationEventHandler[HTMLInputElement]): Self = StObject.set(x, "onAnimationEndCapture", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEventHandler[HTMLInputElement]): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationIterationCapture(value: AnimationEventHandler[HTMLInputElement]): Self = StObject.set(x, "onAnimationIterationCapture", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEventHandler[HTMLInputElement]): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationStartCapture(value: AnimationEventHandler[HTMLInputElement]): Self = StObject.set(x, "onAnimationStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnBeforeInput(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeInputCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onBeforeInputCapture", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEventHandler[HTMLInputElement]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurCapture(value: FocusEventHandler[HTMLInputElement]): Self = StObject.set(x, "onBlurCapture", value.asInstanceOf[js.Any])
      
      inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCanPlayCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
      
      inline def setOnCanPlayThrough(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayThroughCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCanPlayThroughCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onClickCapture", value.asInstanceOf[js.Any])
      
      inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionEndCapture(value: CompositionEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCompositionEndCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionStartCapture(value: CompositionEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCompositionStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionUpdateCapture(value: CompositionEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCompositionUpdateCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
      
      inline def setOnContextMenuCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onContextMenuCapture", value.asInstanceOf[js.Any])
      
      inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      inline def setOnCopyCapture(value: ClipboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCopyCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
      
      inline def setOnCutCapture(value: ClipboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onCutCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDblClick(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
      
      inline def setOnDblClickCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDblClickCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDblClickCaptureUndefined: Self = StObject.set(x, "onDblClickCapture", js.undefined)
      
      inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
      
      inline def setOnDrag(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      inline def setOnDragCapture(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
      
      inline def setOnDragEnd(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
      
      inline def setOnDragEndCapture(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragEndCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnterCapture(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragEnterCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
      
      inline def setOnDragExitCapture(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragExitCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
      
      inline def setOnDragLeaveCapture(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragLeaveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
      
      inline def setOnDragOverCapture(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragOverCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartCapture(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDragStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      inline def setOnDropCapture(value: DragEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDropCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
      
      inline def setOnDurationChangeCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onDurationChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
      
      inline def setOnEmptiedCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onEmptiedCapture", value.asInstanceOf[js.Any])
      
      inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
      
      inline def setOnEncryptedCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onEncryptedCapture", value.asInstanceOf[js.Any])
      
      inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
      
      inline def setOnEndedCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onEndedCapture", value.asInstanceOf[js.Any])
      
      inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnErrorCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onErrorCapture", value.asInstanceOf[js.Any])
      
      inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEventHandler[HTMLInputElement]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusCapture(value: FocusEventHandler[HTMLInputElement]): Self = StObject.set(x, "onFocusCapture", value.asInstanceOf[js.Any])
      
      inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnFormData(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onFormData", value.asInstanceOf[js.Any])
      
      inline def setOnFormDataCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onFormDataCapture", value.asInstanceOf[js.Any])
      
      inline def setOnFormDataCaptureUndefined: Self = StObject.set(x, "onFormDataCapture", js.undefined)
      
      inline def setOnFormDataUndefined: Self = StObject.set(x, "onFormData", js.undefined)
      
      inline def setOnGotPointerCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onGotPointerCapture", value.asInstanceOf[js.Any])
      
      inline def setOnGotPointerCaptureCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
      
      inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
      
      inline def setOnInput(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      inline def setOnInputCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onInputCapture", value.asInstanceOf[js.Any])
      
      inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
      
      inline def setOnInvalidCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onInvalidCapture", value.asInstanceOf[js.Any])
      
      inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownCapture(value: KeyboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onKeyDownCapture", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressCapture(value: KeyboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onKeyPressCapture", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      inline def setOnKeyUpCapture(value: KeyboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onKeyUpCapture", value.asInstanceOf[js.Any])
      
      inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLoadCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
      
      inline def setOnLoadStart(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
      
      inline def setOnLoadStartCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLoadStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedDataCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLoadedDataCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedMetadataCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLoadedMetadataCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnLostPointerCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLostPointerCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLostPointerCaptureCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
      
      inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
      
      inline def setOnMouseDown(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDownCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseDownCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseEnterCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterCaptureUndefined: Self = StObject.set(x, "onMouseEnterCapture", js.undefined)
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseLeaveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveCaptureUndefined: Self = StObject.set(x, "onMouseLeaveCapture", js.undefined)
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnMouseMoveCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseMoveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOutCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseOutCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOverCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseOverCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
      
      inline def setOnMouseUpCapture(value: MouseEventHandler[HTMLInputElement]): Self = StObject.set(x, "onMouseUpCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
      
      inline def setOnPasteCapture(value: ClipboardEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPasteCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPauseCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPauseCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      inline def setOnPlayCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPlayCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
      
      inline def setOnPlayingCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPlayingCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
      
      inline def setOnPointerCancelCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
      
      inline def setOnPointerDownCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
      
      inline def setOnPointerEnterCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
      
      inline def setOnPointerLeaveCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
      
      inline def setOnPointerMoveCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOutCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerOutCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOverCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerOverCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
      
      inline def setOnPointerUpCapture(value: PointerEventHandler[HTMLInputElement]): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      inline def setOnProgressCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onProgressCapture", value.asInstanceOf[js.Any])
      
      inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
      
      inline def setOnRateChangeCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onRateChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      inline def setOnResetCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onResetCapture", value.asInstanceOf[js.Any])
      
      inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEventHandler[HTMLInputElement]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      inline def setOnScrollCapture(value: UIEventHandler[HTMLInputElement]): Self = StObject.set(x, "onScrollCapture", value.asInstanceOf[js.Any])
      
      inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSearch(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSearch", value.asInstanceOf[js.Any])
      
      inline def setOnSearchCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSearchCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSearchCaptureUndefined: Self = StObject.set(x, "onSearchCapture", js.undefined)
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSeeked(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
      
      inline def setOnSeekedCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSeekedCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
      
      inline def setOnSeekingCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSeekingCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSelectCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
      
      inline def setOnStalledCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onStalledCapture", value.asInstanceOf[js.Any])
      
      inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      inline def setOnSubmitCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSubmitCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
      
      inline def setOnSuspendCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onSuspendCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnTimeUpdateCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTimeUpdateCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnToggle(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      inline def setOnTouchCancelCapture(value: TouchEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTouchCancelCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndCapture(value: TouchEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      inline def setOnTouchMoveCapture(value: TouchEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTouchMoveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartCapture(value: TouchEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTransitionEndCapture(value: TransitionEventHandler[HTMLInputElement]): Self = StObject.set(x, "onTransitionEndCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
      
      inline def setOnVolumeChangeCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onVolumeChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
      
      inline def setOnWaitingCapture(value: GenericEventHandler[HTMLInputElement]): Self = StObject.set(x, "onWaitingCapture", value.asInstanceOf[js.Any])
      
      inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEventHandler[HTMLInputElement]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
      
      inline def setOnWheelCapture(value: WheelEventHandler[HTMLInputElement]): Self = StObject.set(x, "onWheelCapture", value.asInstanceOf[js.Any])
      
      inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOnfocusin(value: FocusEventHandler[HTMLInputElement]): Self = StObject.set(x, "onfocusin", value.asInstanceOf[js.Any])
      
      inline def setOnfocusinCapture(value: FocusEventHandler[HTMLInputElement]): Self = StObject.set(x, "onfocusinCapture", value.asInstanceOf[js.Any])
      
      inline def setOnfocusinCaptureUndefined: Self = StObject.set(x, "onfocusinCapture", js.undefined)
      
      inline def setOnfocusinUndefined: Self = StObject.set(x, "onfocusin", js.undefined)
      
      inline def setOnfocusout(value: FocusEventHandler[HTMLInputElement]): Self = StObject.set(x, "onfocusout", value.asInstanceOf[js.Any])
      
      inline def setOnfocusoutCapture(value: FocusEventHandler[HTMLInputElement]): Self = StObject.set(x, "onfocusoutCapture", value.asInstanceOf[js.Any])
      
      inline def setOnfocusoutCaptureUndefined: Self = StObject.set(x, "onfocusoutCapture", js.undefined)
      
      inline def setOnfocusoutUndefined: Self = StObject.set(x, "onfocusout", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      inline def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPing(value: String): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: typings.preact.mod.Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setReferrerpolicy(
        value: `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
      ): Self = StObject.set(x, "referrerpolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerpolicyUndefined: Self = StObject.set(x, "referrerpolicy", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: String | CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setVolume(value: String | Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait Html extends StObject {
    
    var __html: String
  }
  object Html {
    
    inline def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref[RefType] extends StObject {
    
    var children: js.UndefOr[ComponentChildren] = js.undefined
    
    var ref: js.UndefOr[typings.preact.mod.Ref[RefType]] = js.undefined
  }
  object Ref {
    
    inline def apply[RefType](): Ref[RefType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[RefType]]
    }
    
    extension [Self <: Ref[?], RefType](x: Self & Ref[RefType]) {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setRef(value: typings.preact.mod.Ref[RefType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ RefType | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<std.EventTarget, std.Event> */
  trait TargetedEventEventTargetE extends StObject {
    
    var AT_TARGET: Double
    
    var BUBBLING_PHASE: Double
    
    var CAPTURING_PHASE: Double
    
    var NONE: Double
    
    var bubbles: Boolean
    
    var cancelBubble: Boolean
    
    var cancelable: Boolean
    
    var composed: Boolean
    
    def composedPath(): js.Array[EventTarget]
    @JSName("composedPath")
    var composedPath_Original: js.Function0[js.Array[EventTarget]]
    
    val currentTarget: EventTarget
    
    var defaultPrevented: Boolean
    
    var eventPhase: Double
    
    def initEvent(`type`: String): Unit
    @JSName("initEvent")
    var initEvent_Original: js.Function1[/* type */ String, Unit]
    
    var isTrusted: Boolean
    
    def preventDefault(): Unit
    @JSName("preventDefault")
    var preventDefault_Original: js.Function0[Unit]
    
    var returnValue: Boolean
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
    
    def stopImmediatePropagation(): Unit
    @JSName("stopImmediatePropagation")
    var stopImmediatePropagation_Original: js.Function0[Unit]
    
    def stopPropagation(): Unit
    @JSName("stopPropagation")
    var stopPropagation_Original: js.Function0[Unit]
    
    var target: js.UndefOr[EventTarget | Null] = js.undefined
    
    var timeStamp: DOMHighResTimeStamp
    
    var `type`: String
  }
  object TargetedEventEventTargetE {
    
    inline def apply(
      AT_TARGET: Double,
      BUBBLING_PHASE: Double,
      CAPTURING_PHASE: Double,
      NONE: Double,
      bubbles: Boolean,
      cancelBubble: Boolean,
      cancelable: Boolean,
      composed: Boolean,
      composedPath: () => js.Array[EventTarget],
      currentTarget: EventTarget,
      defaultPrevented: Boolean,
      eventPhase: Double,
      initEvent: /* type */ String => Unit,
      isTrusted: Boolean,
      preventDefault: () => Unit,
      returnValue: Boolean,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      timeStamp: DOMHighResTimeStamp,
      `type`: String
    ): TargetedEventEventTargetE = {
      val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction1(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetedEventEventTargetE]
    }
    
    extension [Self <: TargetedEventEventTargetE](x: Self) {
      
      inline def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      inline def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T] extends StObject {
    
    var children: ComponentChildren
    
    var value: T
  }
  object Value {
    
    inline def apply[T](value: T): Value[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    extension [Self <: Value[?], T](x: Self & Value[T]) {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
