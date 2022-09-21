package typings.node.streamWebMod

import typings.node.streamWebMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ReadableStreamBYOBReader: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("ReadableStreamBYOBReader").asInstanceOf[Any]

inline def ReadableStreamBYOBRequest: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("ReadableStreamBYOBRequest").asInstanceOf[Any]

type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer

type QueuingStrategySize[T] = js.Function1[/* chunk */ js.UndefOr[T], Double]

type ReadableByteStreamControllerCallback = js.Function1[/* controller */ ReadableByteStreamController, Unit | js.Thenable[Unit]]

type ReadableStreamController[T] = ReadableStreamDefaultController[T]

type ReadableStreamErrorCallback = js.Function1[/* reason */ Any, Unit | js.Thenable[Unit]]

type TransformerFlushCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | js.Thenable[Unit]]

type TransformerStartCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Any]

type TransformerTransformCallback[I, O] = js.Function2[
/* chunk */ I, 
/* controller */ TransformStreamDefaultController[O], 
Unit | js.Thenable[Unit]]

type UnderlyingSinkAbortCallback = js.Function1[/* reason */ js.UndefOr[Any], Unit | js.Thenable[Unit]]

type UnderlyingSinkCloseCallback = js.Function0[Unit | js.Thenable[Unit]]

type UnderlyingSinkStartCallback = js.Function1[/* controller */ WritableStreamDefaultController, Any]

type UnderlyingSinkWriteCallback[W] = js.Function2[
/* chunk */ W, 
/* controller */ WritableStreamDefaultController, 
Unit | js.Thenable[Unit]]

type UnderlyingSourceCancelCallback = js.Function1[/* reason */ js.UndefOr[Any], Unit | js.Thenable[Unit]]

type UnderlyingSourcePullCallback[R] = js.Function1[/* controller */ ReadableStreamController[R], Unit | js.Thenable[Unit]]

type UnderlyingSourceStartCallback[R] = js.Function1[/* controller */ ReadableStreamController[R], Any]
