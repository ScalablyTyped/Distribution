package typings.next

import typings.next.anon.DataStream
import typings.next.anon.Element
import typings.next.distServerAppRenderMod.FlightRouterState
import typings.std.ReadableStream
import typings.std.TextDecoder
import typings.std.TransformStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerNodeWebStreamsHelperMod {
  
  @JSImport("next/dist/server/node-web-streams-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chainStreams[T](streams: js.Array[ReadableStream[T]]): ReadableStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainStreams")(streams.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[T]]
  
  inline def continueFromInitialStream(renderStream: ReactReadableStream, param1: DataStream): js.Promise[ReadableStream[js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("continueFromInitialStream")(renderStream.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStream[js.typedarray.Uint8Array]]]
  
  inline def createBufferedTransformStream(): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBufferedTransformStream")().asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  inline def createBufferedTransformStream(transform: js.Function1[/* v */ String, String | js.Promise[String]]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBufferedTransformStream")(transform.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createDeferredSuffixStream(suffix: String): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredSuffixStream")(suffix.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createHeadInjectionTransformStream(inject: js.Function0[js.Promise[String]]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeadInjectionTransformStream")(inject.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createInlineDataStream(dataStream: ReadableStream[js.typedarray.Uint8Array]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInlineDataStream")(dataStream.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createInsertedHTMLStream(getServerInsertedHTML: js.Function0[js.Promise[String]]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsertedHTMLStream")(getServerInsertedHTML.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createRootLayoutValidatorStream(assetPrefix: String, getTree: js.Function0[FlightRouterState]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRootLayoutValidatorStream")(assetPrefix.asInstanceOf[js.Any], getTree.asInstanceOf[js.Any])).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  inline def createRootLayoutValidatorStream(assetPrefix: Unit, getTree: js.Function0[FlightRouterState]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRootLayoutValidatorStream")(assetPrefix.asInstanceOf[js.Any], getTree.asInstanceOf[js.Any])).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createSuffixStream(suffix: String): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSuffixStream")(suffix.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def decodeText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")().asInstanceOf[String]
  inline def decodeText(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeText(input: js.typedarray.Uint8Array, textDecoder: TextDecoder): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(input.asInstanceOf[js.Any], textDecoder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeText(input: Unit, textDecoder: TextDecoder): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(input.asInstanceOf[js.Any], textDecoder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeText(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeText")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readableStreamTee[T](readable: ReadableStream[T]): js.Tuple2[ReadableStream[T], ReadableStream[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readableStreamTee")(readable.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ReadableStream[T], ReadableStream[T]]]
  
  inline def renderToInitialStream(param0: Element): js.Promise[ReactReadableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToInitialStream")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReactReadableStream]]
  
  inline def streamFromArray(strings: js.Array[String]): ReadableStream[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamFromArray")(strings.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[js.typedarray.Uint8Array]]
  
  inline def streamToString(stream: ReadableStream[js.typedarray.Uint8Array]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToString")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @js.native
  trait ReactReadableStream
    extends StObject
       with ReadableStream[js.typedarray.Uint8Array] {
    
    var allReady: js.UndefOr[js.Promise[Unit]] = js.native
  }
}
