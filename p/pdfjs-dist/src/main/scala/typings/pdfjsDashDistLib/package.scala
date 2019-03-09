package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pdfjsDashDistLib {
  type AlgorithmIdentifier = java.lang.String | Algorithm
  type AudioWorklet = Worklet
  type AutoKeyword = pdfjsDashDistLib.pdfjsDashDistLibStrings.auto
  type BigInteger = stdLib.Uint8Array
  type BlobCallback = js.Function1[/* blob */ Blob | scala.Null, scala.Unit]
  type BlobPart = BufferSource | Blob | java.lang.String
  type BodyInit = _BodyInit | ReadableStream[stdLib.Uint8Array] | BufferSource | java.lang.String
  type BufferSource = stdLib.ArrayBufferView | stdLib.ArrayBuffer
  type CDATASection = Text
  type CSSSupportsRule = CSSConditionRule
  type ChannelMergerNode = AudioNode
  type ChannelSplitterNode = AudioNode
  type Comment = CharacterData
  type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters
  type ConstrainDouble = scala.Double | ConstrainDoubleRange
  type ConstrainLong = scala.Double | ConstrainLongRange
  type DOMHighResTimeStamp = scala.Double
  type DOMTimeStamp = scala.Double
  type DecodeErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ AudioBuffer, scala.Unit]
  type DocumentTimeline = AnimationTimeline
  type ErrorEventHandler = js.Function5[
    /* event */ Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* fileno */ js.UndefOr[scala.Double], 
    /* columnNumber */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[stdLib.Error], 
    scala.Unit
  ]
  type EventHandlerNonNull = js.Function1[/* event */ Event, js.Any]
  type EventListener = js.Function1[/* evt */ Event, scala.Unit]
  type EventListenerOrEventListenerObject = EventListener | EventListenerObject
  type Float32List = stdLib.Float32Array | js.Array[GLfloat]
  type ForEachCallback = js.Function2[
    /* keyId */ stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer | scala.Null, 
    /* status */ MediaKeyStatus, 
    scala.Unit
  ]
  type FormDataEntryValue = File | java.lang.String
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type GLbitfield = scala.Double
  type GLboolean = scala.Boolean
  type GLclampf = scala.Double
  type GLenum = scala.Double
  type GLfloat = scala.Double
  type GLint = scala.Double
  type GLintptr = scala.Double
  type GLsizei = scala.Double
  type GLsizeiptr = scala.Double
  type GLuint = scala.Double
  type GamepadHapticActuatorType = pdfjsDashDistLib.pdfjsDashDistLibStrings.vibration
  type HashAlgorithmIdentifier = AlgorithmIdentifier
  type HeadersInit = Headers | js.Array[js.Array[java.lang.String]] | (stdLib.Record[java.lang.String, java.lang.String])
  type IDBKeyPath = java.lang.String
  type IDBValidKey = scala.Double | java.lang.String | stdLib.Date | BufferSource | IDBArrayKey
  type Int32List = stdLib.Int32Array | js.Array[GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[IntersectionObserverEntry], 
    /* observer */ IntersectionObserver, 
    scala.Unit
  ]
  type LineAndPositionSetting = scala.Double | AutoKeyword
  type MSCredentialType = pdfjsDashDistLib.pdfjsDashDistLibStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MediaStreamTrackAudioSourceNode = AudioNode
  type MessageEventSource = _MessageEventSource | WindowProxy
  /** @deprecated */
  type MouseWheelEvent = WheelEvent
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[MutationRecord], 
    /* observer */ MutationObserver, 
    scala.Unit
  ]
  type NamedCurve = java.lang.String
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ MediaStream, scala.Unit]
  type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, scala.Unit]
  type OnBeforeUnloadEventHandler = OnBeforeUnloadEventHandlerNonNull | scala.Null
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ Event, java.lang.String | scala.Null]
  type OnErrorEventHandler = OnErrorEventHandlerNonNull | scala.Null
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[js.Any], 
    js.Any
  ]
  type PaymentRequestUpdateEventInit = EventInit
  type PerformanceEntryList = js.Array[PerformanceEntry]
  type PerformanceMark = PerformanceEntry
  type PerformanceMeasure = PerformanceEntry
  type PerformanceObserverCallback = js.Function2[
    /* entries */ PerformanceObserverEntryList, 
    /* observer */ PerformanceObserver, 
    scala.Unit
  ]
  type PositionCallback = js.Function1[/* position */ Position, scala.Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ PositionError, scala.Unit]
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  type RTCAnswerOptions = RTCOfferAnswerOptions
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type RTCRtpDecodingParameters = RTCRtpCodingParameters
  type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, scala.Unit]
  type RTCStatsCallback = js.Function1[/* report */ RTCStatsReport, scala.Unit]
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ ReadableStreamDefaultController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  type RenderingContext = _RenderingContext | WebGLRenderingContext
  type RequestInfo = Request | java.lang.String
  type SVGMatrix = DOMMatrix
  type SVGPathSegClosePath = SVGPathSeg
  type SVGPoint = DOMPoint
  type SVGRect = DOMRect
  type ScopedCredentialType = pdfjsDashDistLib.pdfjsDashDistLibStrings.ScopedCred
  type StaticRange = AbstractRange
  type TimerHandler = java.lang.String | js.Function
  type Transferable = _Transferable | stdLib.ArrayBuffer
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type VibratePattern = scala.Double | js.Array[scala.Double]
  type VoidFunction = js.Function0[scala.Unit]
  type WebGLBuffer = WebGLObject
  type WebGLFramebuffer = WebGLObject
  type WebGLProgram = WebGLObject
  type WebGLRenderbuffer = WebGLObject
  type WebGLRenderingContext = WebGLRenderingContextBase
  type WebGLShader = WebGLObject
  type WebGLTexture = WebGLObject
  type WebGLVertexArrayObjectOES = WebGLObject
  type WebKitCSSMatrix = DOMMatrix
  type WindowProxy = Window
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  type webkitURL = URL
}
