package typings.node

import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonbufferMod.Blob
import typings.node.nodeColonstreamMod.Readable
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonstreamConsumersMod {
  
  @JSImport("node:stream/consumers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayBuffer(stream: ReadableStream): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def arrayBuffer(stream: Readable): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def arrayBuffer(stream: AsyncIterator[Any, Any, Unit]): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def blob(stream: ReadableStream): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def blob(stream: Readable): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def blob(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  
  inline def buffer(stream: ReadableStream): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def buffer(stream: Readable): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def buffer(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def json(stream: ReadableStream): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def json(stream: Readable): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def json(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def text(stream: ReadableStream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def text(stream: Readable): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def text(stream: AsyncIterator[Any, Any, Unit]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
