package typings.phin.phinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var promisified: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof phin */ js.Any = js.native
  def apply(
    options: IOptions | IStreamResponseOptions | (IWithData[IOptions | IStreamResponseOptions]) | (IWithForm[IOptions | IStreamResponseOptions])
  ): js.Promise[IResponse] = js.native
  def apply(options: String): js.Promise[IResponse] = js.native
}

