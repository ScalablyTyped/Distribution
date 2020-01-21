package typings.phin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phin", "unpromisified")
@js.native
object unpromisified extends js.Object {
  def apply(
    options: IOptions | IStreamResponseOptions | (IWithData[IOptions | IStreamResponseOptions]) | (IWithForm[IOptions | IStreamResponseOptions]),
    callback: (ICallback[IResponse | IStreamResponse]) | IErrorCallback
  ): Unit = js.native
  def apply(options: String, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
}

