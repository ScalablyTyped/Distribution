package typings.mz.mzMod.fs

import typings.mz.Anon_EncodingString
import typings.mz.mzStrings.buffer
import typings.node.Anon_BufferEncoding
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingNull
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz", "fs.mkdtemp")
@js.native
object mkdtemp extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    */
  def apply(
    prefix: String,
    callback: js.Function2[js.UndefOr[ErrnoException | Null], /* folder */ String, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(prefix: String, options: String): js.Promise[String] = js.native
  def apply(
    prefix: String,
    options: String,
    callback: js.Function2[js.UndefOr[ErrnoException | Null], Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(prefix: String, options: Anon_EncodingString): js.Promise[String] = js.native
  def apply(
    prefix: String,
    options: Anon_EncodingString,
    callback: js.Function2[/* err */ js.UndefOr[ErrnoException], /* folder */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: String): js.Promise[String] = js.native
  def __promisify__(prefix: String, options: String): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: String, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def __promisify__(prefix: String, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
  def __promisify__(prefix: String, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
  def __promisify__(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(prefix: String, options: buffer): js.Promise[Buffer] = js.native
}

