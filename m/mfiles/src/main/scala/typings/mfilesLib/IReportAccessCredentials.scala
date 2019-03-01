package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportAccessCredentials extends js.Object {
  val Domain: java.lang.String
  val ExtAccount: scala.Boolean
  val Password: java.lang.String
  val UserName: java.lang.String
}

object IReportAccessCredentials {
  @scala.inline
  def apply(
    Domain: java.lang.String,
    ExtAccount: scala.Boolean,
    Password: java.lang.String,
    UserName: java.lang.String
  ): IReportAccessCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Domain")(Domain)
    __obj.updateDynamic("ExtAccount")(ExtAccount)
    __obj.updateDynamic("Password")(Password)
    __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[IReportAccessCredentials]
  }
}

