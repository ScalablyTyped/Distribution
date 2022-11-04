package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/shared/lib/router/router.NextRouter, 'pathname' | 'asPath' | 'isReady' | 'isFallback'> */
trait PickNextRouterpathnameasP extends StObject {
  
  var asPath: String
  
  var isFallback: js.Function0[Boolean]
  
  var isReady: Boolean
  
  var pathname: String
}
object PickNextRouterpathnameasP {
  
  inline def apply(asPath: String, isFallback: () => Boolean, isReady: Boolean, pathname: String): PickNextRouterpathnameasP = {
    val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], isFallback = js.Any.fromFunction0(isFallback), isReady = isReady.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNextRouterpathnameasP]
  }
  
  extension [Self <: PickNextRouterpathnameasP](x: Self) {
    
    inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
    
    inline def setIsFallback(value: () => Boolean): Self = StObject.set(x, "isFallback", js.Any.fromFunction0(value))
    
    inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
  }
}
