package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdditionalFolder extends js.Object {
  var Folder: String
  var Impersonation: IImpersonation
  var LimitInMB: Double
  def Clone(): IAdditionalFolder
}

object IAdditionalFolder {
  @scala.inline
  def apply(Clone: () => IAdditionalFolder, Folder: String, Impersonation: IImpersonation, LimitInMB: Double): IAdditionalFolder = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Folder = Folder, Impersonation = Impersonation, LimitInMB = LimitInMB)
  
    __obj.asInstanceOf[IAdditionalFolder]
  }
}

