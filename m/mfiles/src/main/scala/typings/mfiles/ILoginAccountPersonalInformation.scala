package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginAccountPersonalInformation extends js.Object {
  val AccountName: String
  val Email: String
  val FullName: String
}

object ILoginAccountPersonalInformation {
  @scala.inline
  def apply(AccountName: String, Email: String, FullName: String): ILoginAccountPersonalInformation = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILoginAccountPersonalInformation]
  }
}

