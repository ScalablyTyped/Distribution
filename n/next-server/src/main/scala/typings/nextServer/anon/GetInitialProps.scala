package typings.nextServer.anon

import typings.nextServer.libUtilsMod.BaseContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInitialProps[C /* <: BaseContext */, IP] extends StObject {
  
  var getInitialProps: js.UndefOr[js.Function1[/* context */ C, IP | js.Promise[IP]]] = js.undefined
}
object GetInitialProps {
  
  @scala.inline
  def apply[C /* <: BaseContext */, IP](): GetInitialProps[C, IP] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInitialProps[C, IP]]
  }
  
  @scala.inline
  implicit class GetInitialPropsMutableBuilder[Self <: GetInitialProps[?, ?], C /* <: BaseContext */, IP] (val x: Self & (GetInitialProps[C, IP])) extends AnyVal {
    
    @scala.inline
    def setGetInitialProps(value: /* context */ C => IP | js.Promise[IP]): Self = StObject.set(x, "getInitialProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInitialPropsUndefined: Self = StObject.set(x, "getInitialProps", js.undefined)
  }
}
