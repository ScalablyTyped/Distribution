package typings.milkcocoa.milkcocoa

import typings.milkcocoa.anon.Id
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.Login
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MilkCocoa extends js.Object {
  def addAccount(email: String, password: String): Unit = js.native
  def addAccount(
    email: String,
    password: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ AddAccount, /* user */ User, Unit]
  ): Unit = js.native
  def addAccount(email: String, password: String, options: js.Object): Unit = js.native
  def addAccount(
    email: String,
    password: String,
    options: js.Object,
    callback: js.Function2[/* err */ AddAccount, /* user */ User, Unit]
  ): Unit = js.native
  def dataStore(path: String): DataStore = js.native
  def getCurrentUser(callback: js.Function2[/* err */ GetCurrentUser, /* user */ Id, Unit]): Unit = js.native
  def login(email: String, password: String, callback: js.Function2[/* err */ Login, /* user */ User, Unit]): Unit = js.native
  def logout(): Unit = js.native
  def logout(callback: js.Function1[/* err */ String, Unit]): Unit = js.native
}

@JSGlobal("milkcocoa.MilkCocoa")
@js.native
object MilkCocoa extends js.Object {
  @js.native
  object Error extends js.Object {
    @js.native
    sealed trait AddAccount extends js.Object
    
    @js.native
    sealed trait GetCurrentUser extends js.Object
    
    @js.native
    sealed trait Login extends js.Object
    
    @js.native
    object AddAccount extends js.Object {
      @js.native
      sealed trait AlreadyExist extends AddAccount
      
      // FormatError = 1, AlreadyExist = 2
      @js.native
      sealed trait FormatError extends AddAccount
      
    }
    
    @js.native
    object GetCurrentUser extends js.Object {
      // NotLoggedIn = 1
      @js.native
      sealed trait NotLoggedIn extends GetCurrentUser
      
    }
    
    @js.native
    object Login extends js.Object {
      @js.native
      sealed trait EmailNotVerificated extends Login
      
      // FormatError = 1, LoginError = 2, EmailNotVerificated = 3
      @js.native
      sealed trait FormatError extends Login
      
      @js.native
      sealed trait LoginError extends Login
      
    }
    
  }
  
}

