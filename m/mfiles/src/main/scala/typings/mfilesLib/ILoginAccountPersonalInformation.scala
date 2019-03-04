package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginAccountPersonalInformation extends js.Object {
  val AccountName: java.lang.String
  val Email: java.lang.String
  val FullName: java.lang.String
}

object ILoginAccountPersonalInformation {
  @scala.inline
  def apply(AccountName: java.lang.String, Email: java.lang.String, FullName: java.lang.String): ILoginAccountPersonalInformation = {
    val __obj = js.Dynamic.literal(AccountName = AccountName, Email = Email, FullName = FullName)
  
    __obj.asInstanceOf[ILoginAccountPersonalInformation]
  }
}

