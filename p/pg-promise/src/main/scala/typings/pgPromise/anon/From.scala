package typings.pgPromise.anon

import typings.pgPromise.mod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From[S] extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var skip: js.UndefOr[String | js.Array[String] | (js.Function1[/* c */ Column[S], Boolean])] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object From {
  
  @scala.inline
  def apply[S](): From[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From[S]]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From[?], S] (val x: Self & From[S]) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setSkip(value: String | js.Array[String] | (js.Function1[/* c */ Column[S], Boolean])): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFunction1(value: /* c */ Column[S] => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSkipVarargs(value: String*): Self = StObject.set(x, "skip", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
