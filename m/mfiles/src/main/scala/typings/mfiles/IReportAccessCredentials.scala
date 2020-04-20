package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportAccessCredentials extends js.Object {
  val Domain: String
  val ExtAccount: Boolean
  val Password: String
  val UserName: String
}

object IReportAccessCredentials {
  @scala.inline
  def apply(Domain: String, ExtAccount: Boolean, Password: String, UserName: String): IReportAccessCredentials = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], ExtAccount = ExtAccount.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportAccessCredentials]
  }
}

