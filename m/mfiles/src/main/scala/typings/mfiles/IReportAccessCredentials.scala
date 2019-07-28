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
    val __obj = js.Dynamic.literal(Domain = Domain, ExtAccount = ExtAccount, Password = Password, UserName = UserName)
  
    __obj.asInstanceOf[IReportAccessCredentials]
  }
}

