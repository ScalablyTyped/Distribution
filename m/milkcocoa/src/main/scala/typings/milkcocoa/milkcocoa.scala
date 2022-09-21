package typings.milkcocoa

import typings.milkcocoa.anon.Id
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser
import typings.milkcocoa.milkcocoa.MilkCocoa.Error.Login
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object milkcocoa {
  
  @js.native
  trait MilkCocoa extends StObject {
    
    def addAccount(email: String, password: String): Unit = js.native
    def addAccount(email: String, password: String, options: js.Object): Unit = js.native
    def addAccount(
      email: String,
      password: String,
      options: js.Object,
      callback: js.Function2[/* err */ AddAccount, /* user */ User, Unit]
    ): Unit = js.native
    def addAccount(
      email: String,
      password: String,
      options: Unit,
      callback: js.Function2[/* err */ AddAccount, /* user */ User, Unit]
    ): Unit = js.native
    
    def dataStore(path: String): DataStore = js.native
    
    def getCurrentUser(callback: js.Function2[/* err */ GetCurrentUser, /* user */ Id, Unit]): Unit = js.native
    
    def login(email: String, password: String, callback: js.Function2[/* err */ Login, /* user */ User, Unit]): Unit = js.native
    
    def logout(): Unit = js.native
    def logout(callback: js.Function1[/* err */ String, Unit]): Unit = js.native
  }
  object MilkCocoa {
    
    object Error {
      
      @js.native
      sealed trait AddAccount extends StObject
      @JSGlobal("milkcocoa.MilkCocoa.Error.AddAccount")
      @js.native
      object AddAccount extends StObject {
        
        @js.native
        sealed trait AlreadyExist
          extends StObject
             with AddAccount
        
        // FormatError = 1, AlreadyExist = 2
        @js.native
        sealed trait FormatError
          extends StObject
             with AddAccount
      }
      
      @js.native
      sealed trait GetCurrentUser extends StObject
      @JSGlobal("milkcocoa.MilkCocoa.Error.GetCurrentUser")
      @js.native
      object GetCurrentUser extends StObject {
        
        // NotLoggedIn = 1
        @js.native
        sealed trait NotLoggedIn
          extends StObject
             with GetCurrentUser
      }
      
      @js.native
      sealed trait Login extends StObject
      @JSGlobal("milkcocoa.MilkCocoa.Error.Login")
      @js.native
      object Login extends StObject {
        
        @js.native
        sealed trait EmailNotVerificated
          extends StObject
             with Login
        
        // FormatError = 1, LoginError = 2, EmailNotVerificated = 3
        @js.native
        sealed trait FormatError
          extends StObject
             with Login
        
        @js.native
        sealed trait LoginError
          extends StObject
             with Login
      }
    }
  }
  
  @js.native
  trait DataStore extends StObject {
    
    def child(path: String): DataStore = js.native
    
    def get(id: String, callback: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
    
    def off(event: String): Unit = js.native
    
    // event push, remove, set, send
    def on(event: String, callback: js.Function1[/* data */ DataStoreCallbackData, Unit]): Unit = js.native
    
    def parent(): DataStore = js.native
    
    def push(`object`: js.Object): Unit = js.native
    def push(`object`: js.Object, callback: js.Function1[/* data */ DataStoreCallbackData, Unit]): Unit = js.native
    
    def query(): Query = js.native
    def query(condition: js.Object): Query = js.native
    
    def remove(id: String): Unit = js.native
    
    def root(): DataStore = js.native
    
    def send(`object`: js.Object): Unit = js.native
    
    def set(id: String, data: js.Object): Unit = js.native
  }
  
  trait DataStoreCallbackData extends StObject {
    
    var err: String
    
    var id: String
    
    var path: String
    
    var value: Any
  }
  object DataStoreCallbackData {
    
    inline def apply(err: String, id: String, path: String, value: Any): DataStoreCallbackData = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataStoreCallbackData]
    }
    
    extension [Self <: DataStoreCallbackData](x: Self) {
      
      inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query extends StObject {
    
    def done(callback: js.Function1[/* data */ Any, Unit]): Unit
    
    def limit(number: Double): Query
    
    def skip(index: Double): Query
    
    // mode  asc, desc
    def sort(mode: String): Query
  }
  object Query {
    
    inline def apply(
      done: js.Function1[/* data */ Any, Unit] => Unit,
      limit: Double => Query,
      skip: Double => Query,
      sort: String => Query
    ): Query = {
      val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), limit = js.Any.fromFunction1(limit), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setDone(value: js.Function1[/* data */ Any, Unit] => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setLimit(value: Double => Query): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      inline def setSkip(value: Double => Query): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      inline def setSort(value: String => Query): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    }
  }
  
  trait User extends StObject {
    
    var email: String
    
    var id: String
  }
  object User {
    
    inline def apply(email: String, id: String): User = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
