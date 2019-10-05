package typings.milkcocoa.milkcocoa

import typings.milkcocoa.Anon_Id
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.Login
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
      
      /* 1 */ val AlreadyExist: typings.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount.AlreadyExist with Double = js.native
      /* 0 */ val FormatError: typings.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount.FormatError with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[AddAccount with Double] = js.native
    }
    
    @js.native
    object GetCurrentUser extends js.Object {
      // NotLoggedIn = 1
      @js.native
      sealed trait NotLoggedIn extends GetCurrentUser
      
      /* 0 */ val NotLoggedIn: typings.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser.NotLoggedIn with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[GetCurrentUser with Double] = js.native
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
      
      /* 2 */ val EmailNotVerificated: typings.milkcocoa.milkcocoa.MilkCocoa.Error.Login.EmailNotVerificated with Double = js.native
      /* 0 */ val FormatError: typings.milkcocoa.milkcocoa.MilkCocoa.Error.Login.FormatError with Double = js.native
      /* 1 */ val LoginError: typings.milkcocoa.milkcocoa.MilkCocoa.Error.Login.LoginError with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Login with Double] = js.native
    }
    
  }
  
}

