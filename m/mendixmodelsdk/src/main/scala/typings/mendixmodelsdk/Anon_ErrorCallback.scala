package typings.mendixmodelsdk

import typings.mendixmodelsdk.distCommonMod.common.IErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ErrorCallback extends js.Object {
  def handleError(message: String): Unit = js.native
  def handleError(message: String, errorCallback: IErrorCallback): Unit = js.native
}

