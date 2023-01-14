package typings.meteorMdgValidatedMethod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var noRetry: js.UndefOr[Boolean] = js.undefined
    
    var onResultReceived: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
    
    var returnStubValue: js.UndefOr[Boolean] = js.undefined
    
    var throwStubExceptions: js.UndefOr[Boolean] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setNoRetry(value: Boolean): Self = StObject.set(x, "noRetry", value.asInstanceOf[js.Any])
      
      inline def setNoRetryUndefined: Self = StObject.set(x, "noRetry", js.undefined)
      
      inline def setOnResultReceived(value: /* result */ Any => Unit): Self = StObject.set(x, "onResultReceived", js.Any.fromFunction1(value))
      
      inline def setOnResultReceivedUndefined: Self = StObject.set(x, "onResultReceived", js.undefined)
      
      inline def setReturnStubValue(value: Boolean): Self = StObject.set(x, "returnStubValue", value.asInstanceOf[js.Any])
      
      inline def setReturnStubValueUndefined: Self = StObject.set(x, "returnStubValue", js.undefined)
      
      inline def setThrowStubExceptions(value: Boolean): Self = StObject.set(x, "throwStubExceptions", value.asInstanceOf[js.Any])
      
      inline def setThrowStubExceptionsUndefined: Self = StObject.set(x, "throwStubExceptions", js.undefined)
    }
  }
  
  trait Name[TName /* <: String */] extends StObject {
    
    var name: /* import warning: importer.ImportType#apply Failed type conversion: TName extends string ? TName : string */ js.Any
  }
  object Name {
    
    inline def apply[TName /* <: String */](
      name: /* import warning: importer.ImportType#apply Failed type conversion: TName extends string ? TName : string */ js.Any
    ): Name[TName] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[TName]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name[?], TName /* <: String */] (val x: Self & Name[TName]) extends AnyVal {
      
      inline def setName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TName extends string ? TName : string */ js.Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
