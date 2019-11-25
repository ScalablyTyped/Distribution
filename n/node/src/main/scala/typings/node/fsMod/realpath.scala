package typings.node.fsMod

import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "realpath")
@js.native
object realpath extends js.Object {
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ java.lang.String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ java.lang.String), Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: buffer_,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: PathLike): js.Promise[java.lang.String] = js.native
  def __promisify__(path: PathLike, options: java.lang.String): js.Promise[java.lang.String | Buffer] = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: PathLike, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[java.lang.String] = js.native
  def __promisify__(path: PathLike, options: Anon_EncodingNull): js.Promise[java.lang.String | Buffer] = js.native
  def __promisify__(path: PathLike, options: BufferEncoding): js.Promise[java.lang.String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(path: PathLike, options: buffer_): js.Promise[Buffer] = js.native
  def native(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ java.lang.String), Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String | Buffer, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ java.lang.String), Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String | Buffer, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String, Unit]
  ): Unit = js.native
  @JSName("native")
  def native_buffer(
    path: PathLike,
    options: buffer_,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
}

