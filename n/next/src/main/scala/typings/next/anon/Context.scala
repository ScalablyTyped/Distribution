package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: String
  
  var contextInfo: Any
  
  def getResolve(): Any
  
  var request: String
}
object Context {
  
  inline def apply(context: String, contextInfo: Any, getResolve: () => Any, request: String): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contextInfo = contextInfo.asInstanceOf[js.Any], getResolve = js.Any.fromFunction0(getResolve), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: Any): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setGetResolve(value: () => Any): Self = StObject.set(x, "getResolve", js.Any.fromFunction0(value))
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
