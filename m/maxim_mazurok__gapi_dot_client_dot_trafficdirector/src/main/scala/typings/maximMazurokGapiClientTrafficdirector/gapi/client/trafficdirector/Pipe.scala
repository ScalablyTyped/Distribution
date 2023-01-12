package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipe extends StObject {
  
  /** The mode for the Pipe. Not applicable for abstract sockets. */
  var mode: js.UndefOr[Double] = js.undefined
  
  /**
    * Unix Domain Socket path. On Linux, paths starting with '@' will use the abstract namespace. The starting '@' is replaced by a null byte by Envoy. Paths starting with '@' will result
    * in an error in environments other than Linux.
    */
  var path: js.UndefOr[String] = js.undefined
}
object Pipe {
  
  inline def apply(): Pipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pipe] (val x: Self) extends AnyVal {
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
