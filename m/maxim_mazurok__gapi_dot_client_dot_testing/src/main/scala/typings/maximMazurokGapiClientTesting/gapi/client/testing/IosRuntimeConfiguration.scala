package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosRuntimeConfiguration extends StObject {
  
  /** The set of available locales. */
  var locales: js.UndefOr[js.Array[Locale]] = js.undefined
  
  /** The set of available orientations. */
  var orientations: js.UndefOr[js.Array[Orientation]] = js.undefined
}
object IosRuntimeConfiguration {
  
  inline def apply(): IosRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosRuntimeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosRuntimeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLocales(value: js.Array[Locale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setOrientations(value: js.Array[Orientation]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    inline def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    inline def setOrientationsVarargs(value: Orientation*): Self = StObject.set(x, "orientations", js.Array(value*))
  }
}
