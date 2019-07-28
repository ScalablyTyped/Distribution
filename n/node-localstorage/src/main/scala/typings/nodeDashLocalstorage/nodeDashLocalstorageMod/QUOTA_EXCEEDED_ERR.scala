package typings.nodeDashLocalstorage.nodeDashLocalstorageMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-localstorage", "QUOTA_EXCEEDED_ERR")
@js.native
class QUOTA_EXCEEDED_ERR protected () extends Error {
  /**
    * Creates a specific `Error` object for **Quota Exceeded Errors**.
    * @param message Message explaining the error.
    */
  def this(message: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

