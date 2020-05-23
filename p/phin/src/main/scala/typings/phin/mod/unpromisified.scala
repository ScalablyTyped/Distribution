package typings.phin.mod

import typings.phin.anon.IWithDataIJSONResponseOpt
import typings.phin.anon.IWithDataIOptions
import typings.phin.anon.IWithDataIStreamResponseO
import typings.phin.anon.IWithFormIJSONResponseOpt
import typings.phin.anon.IWithFormIOptions
import typings.phin.anon.IWithFormIStreamResponseO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phin", "unpromisified")
@js.native
object unpromisified extends js.Object {
  def apply(options: String, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
  def apply(options: IWithDataIOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
  def apply(options: IWithDataIStreamResponseO, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = js.native
  def apply(options: IWithFormIOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
  def apply(options: IWithFormIStreamResponseO, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = js.native
  def apply(options: IOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
  def apply(options: IStreamResponseOptions, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = js.native
  def apply[T](options: IWithDataIJSONResponseOpt, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = js.native
  def apply[T](options: IWithFormIJSONResponseOpt, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = js.native
  def apply[T](options: IJSONResponseOptions, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = js.native
}

