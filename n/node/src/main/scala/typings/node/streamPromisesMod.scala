package typings.node

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.FinishedOptions
import typings.node.streamMod.PipelineDestination
import typings.node.streamMod.PipelineOptions
import typings.node.streamMod.PipelineSource
import typings.node.streamMod.PipelineTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamPromisesMod {
  
  @JSImport("stream/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finished(stream: ReadWriteStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def finished(stream: ReadWriteStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def finished(stream: ReadableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def finished(stream: ReadableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def finished(stream: WritableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def finished(stream: WritableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def pipeline(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | PipelineOptions)*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def pipeline(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | PipelineOptions)*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream], options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B, options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B, options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B, options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    destination: B,
    options: PipelineOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    transform4: T4,
    destination: B,
    options: PipelineOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
