package typings.phantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkRequest extends StObject {
  
  def abort(): Unit
  
  def changeUrl(url: String): Unit
  
  def setHeader(name: String, value: String): Unit
}
object NetworkRequest {
  
  inline def apply(abort: () => Unit, changeUrl: String => Unit, setHeader: (String, String) => Unit): NetworkRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
    __obj.asInstanceOf[NetworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkRequest] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setChangeUrl(value: String => Unit): Self = StObject.set(x, "changeUrl", js.Any.fromFunction1(value))
    
    inline def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
  }
}
