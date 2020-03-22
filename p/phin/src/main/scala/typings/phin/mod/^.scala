package typings.phin.mod

import typings.phin.IWithDataIJSONResponseOpt
import typings.phin.IWithDataIOptions
import typings.phin.IWithDataIStreamResponseO
import typings.phin.IWithFormIJSONResponseOpt
import typings.phin.IWithFormIOptions
import typings.phin.IWithFormIStreamResponseO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var promisified: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof phin */ js.Any = js.native
  def apply(options: String): js.Promise[IResponse] = js.native
  def apply(options: IWithDataIOptions): js.Promise[IResponse] = js.native
  def apply(options: IWithDataIStreamResponseO): js.Promise[IStreamResponse] = js.native
  def apply(options: IWithFormIOptions): js.Promise[IResponse] = js.native
  def apply(options: IWithFormIStreamResponseO): js.Promise[IStreamResponse] = js.native
  def apply(options: IOptions): js.Promise[IResponse] = js.native
  def apply(options: IStreamResponseOptions): js.Promise[IStreamResponse] = js.native
  def apply[T](options: IWithDataIJSONResponseOpt): js.Promise[IJSONResponse[T]] = js.native
  def apply[T](options: IWithFormIJSONResponseOpt): js.Promise[IJSONResponse[T]] = js.native
  def apply[T](options: IJSONResponseOptions): js.Promise[IJSONResponse[T]] = js.native
}

