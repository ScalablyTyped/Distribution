package typings.milkcocoa.milkcocoaNs

import typings.milkcocoa.Anon_Id
import typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.AddAccount
import typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.GetCurrentUser
import typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.Login
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("milkcocoa.MilkCocoa")
@js.native
class MilkCocoa protected () extends js.Object {
  def this(host: String) = this()
  def this(host: String, callback: js.Function) = this()
  def addAccount(email: String, password: String): Unit = js.native
  def addAccount(email: String, password: String, options: js.Object): Unit = js.native
  def addAccount(
    email: String,
    password: String,
    options: js.Object,
    callback: js.Function2[/* err */ AddAccount, /* user */ User, Unit]
  ): Unit = js.native
  def dataStore(path: String): DataStore = js.native
  def getCurrentUser(callback: js.Function2[/* err */ GetCurrentUser, /* user */ Anon_Id, Unit]): Unit = js.native
  def login(email: String, password: String, callback: js.Function2[/* err */ Login, /* user */ User, Unit]): Unit = js.native
  def logout(): Unit = js.native
  def logout(callback: js.Function1[/* err */ String, Unit]): Unit = js.native
}

