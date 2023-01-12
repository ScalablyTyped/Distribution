package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aborted extends StObject {
  
  var aborted: Boolean
  
  var errored: Boolean
  
  var outstandingRequests: Double
  
  var streamEnd: Boolean
}
object Aborted {
  
  inline def apply(aborted: Boolean, errored: Boolean, outstandingRequests: Double, streamEnd: Boolean): Aborted = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], errored = errored.asInstanceOf[js.Any], outstandingRequests = outstandingRequests.asInstanceOf[js.Any], streamEnd = streamEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aborted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aborted] (val x: Self) extends AnyVal {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setOutstandingRequests(value: Double): Self = StObject.set(x, "outstandingRequests", value.asInstanceOf[js.Any])
    
    inline def setStreamEnd(value: Boolean): Self = StObject.set(x, "streamEnd", value.asInstanceOf[js.Any])
  }
}
