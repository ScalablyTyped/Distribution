package typings
package milkcocoaLib.milkcocoaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("milkcocoa.MilkCocoa")
@js.native
class MilkCocoa protected () extends js.Object {
  def this(host: java.lang.String) = this()
  def this(host: java.lang.String, callback: js.Function) = this()
  def addAccount(email: java.lang.String, password: java.lang.String): scala.Unit = js.native
  def addAccount(email: java.lang.String, password: java.lang.String, options: js.Object): scala.Unit = js.native
  def addAccount(
    email: java.lang.String,
    password: java.lang.String,
    options: js.Object,
    callback: js.Function2[
      /* err */ milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.AddAccount, 
      /* user */ User, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def dataStore(path: java.lang.String): DataStore = js.native
  def getCurrentUser(
    callback: js.Function2[
      /* err */ milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.GetCurrentUser, 
      /* user */ milkcocoaLib.Anon_Id, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def login(
    email: java.lang.String,
    password: java.lang.String,
    callback: js.Function2[
      /* err */ milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.Login, 
      /* user */ User, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def logout(): scala.Unit = js.native
  def logout(callback: js.Function1[/* err */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

