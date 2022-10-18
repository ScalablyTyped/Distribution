package typings.next.anon

import typings.next.distSharedLibUtilsMod.BaseContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInitialProps[C /* <: BaseContext */, IP] extends StObject {
  
  /**
    * Used for initial page load data population. Data returned from `getInitialProps` is serialized when server rendered.
    * Make sure to return plain `Object` without using `Date`, `Map`, `Set`.
    * @param ctx Context of `page`
    */
  var getInitialProps: js.UndefOr[js.Function1[/* context */ C, IP | js.Promise[IP]]] = js.undefined
}
object GetInitialProps {
  
  inline def apply[C /* <: BaseContext */, IP](): GetInitialProps[C, IP] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInitialProps[C, IP]]
  }
  
  extension [Self <: GetInitialProps[?, ?], C /* <: BaseContext */, IP](x: Self & (GetInitialProps[C, IP])) {
    
    inline def setGetInitialProps(value: /* context */ C => IP | js.Promise[IP]): Self = StObject.set(x, "getInitialProps", js.Any.fromFunction1(value))
    
    inline def setGetInitialPropsUndefined: Self = StObject.set(x, "getInitialProps", js.undefined)
  }
}
