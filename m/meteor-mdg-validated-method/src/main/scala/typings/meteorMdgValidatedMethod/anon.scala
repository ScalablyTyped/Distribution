package typings.meteorMdgValidatedMethod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var noRetry: js.UndefOr[Boolean] = js.undefined
    
    var onResultReceived: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
    
    var returnStubValue: js.UndefOr[Boolean] = js.undefined
    
    var throwStubExceptions: js.UndefOr[Boolean] = js.undefined
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoRetry(value: Boolean): Self = StObject.set(x, "noRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRetryUndefined: Self = StObject.set(x, "noRetry", js.undefined)
      
      @scala.inline
      def setOnResultReceived(value: /* result */ js.Any => Unit): Self = StObject.set(x, "onResultReceived", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResultReceivedUndefined: Self = StObject.set(x, "onResultReceived", js.undefined)
      
      @scala.inline
      def setReturnStubValue(value: Boolean): Self = StObject.set(x, "returnStubValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnStubValueUndefined: Self = StObject.set(x, "returnStubValue", js.undefined)
      
      @scala.inline
      def setThrowStubExceptions(value: Boolean): Self = StObject.set(x, "throwStubExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowStubExceptionsUndefined: Self = StObject.set(x, "throwStubExceptions", js.undefined)
    }
  }
  
  trait Name[TName /* <: String */] extends StObject {
    
    var name: String | TName
  }
  object Name {
    
    @scala.inline
    def apply[TName /* <: String */](name: String | TName): Name[TName] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[TName]]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name[?], TName /* <: String */] (val x: Self & Name[TName]) extends AnyVal {
      
      @scala.inline
      def setName(value: String | TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
