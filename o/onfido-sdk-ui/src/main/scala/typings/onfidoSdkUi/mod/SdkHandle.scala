package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkHandle extends StObject {
  
  var containerId: js.UndefOr[String] = js.undefined
  
  var options: NormalisedSdkOptions
  
  def setOptions(options: SdkOptions): Unit
  
  def tearDown(): Unit
}
object SdkHandle {
  
  inline def apply(options: NormalisedSdkOptions, setOptions: SdkOptions => Unit, tearDown: () => Unit): SdkHandle = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], setOptions = js.Any.fromFunction1(setOptions), tearDown = js.Any.fromFunction0(tearDown))
    __obj.asInstanceOf[SdkHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SdkHandle] (val x: Self) extends AnyVal {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setOptions(value: NormalisedSdkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSetOptions(value: SdkOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    inline def setTearDown(value: () => Unit): Self = StObject.set(x, "tearDown", js.Any.fromFunction0(value))
  }
}
