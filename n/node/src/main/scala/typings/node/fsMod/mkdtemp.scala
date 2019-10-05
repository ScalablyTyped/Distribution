package typings.node.fsMod

import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.nodeStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "mkdtemp")
@js.native
object mkdtemp extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    */
  def apply(
    prefix: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ java.lang.String, Unit]
  ): Unit = js.native
  def apply(
    prefix: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ java.lang.String), Unit]
  ): Unit = js.native
  def apply(
    prefix: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ java.lang.String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: java.lang.String,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ java.lang.String), Unit]
  ): Unit = js.native
  def apply(
    prefix: java.lang.String,
    options: Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: java.lang.String,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ java.lang.String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: java.lang.String,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ java.lang.String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: java.lang.String,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ java.lang.String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: java.lang.String,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: java.lang.String): js.Promise[java.lang.String] = js.native
  def __promisify__(prefix: java.lang.String, options: java.lang.String): js.Promise[java.lang.String | Buffer] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: java.lang.String, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def __promisify__(prefix: java.lang.String, options: Anon_EncodingBufferEncoding): js.Promise[java.lang.String] = js.native
  def __promisify__(prefix: java.lang.String, options: Anon_EncodingNull): js.Promise[java.lang.String | Buffer] = js.native
  def __promisify__(prefix: java.lang.String, options: BufferEncoding): js.Promise[java.lang.String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(prefix: java.lang.String, options: buffer): js.Promise[Buffer] = js.native
}

