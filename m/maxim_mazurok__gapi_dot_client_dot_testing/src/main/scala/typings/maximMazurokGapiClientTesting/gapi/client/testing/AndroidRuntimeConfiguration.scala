package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidRuntimeConfiguration extends StObject {
  
  /** The set of available locales. */
  var locales: js.UndefOr[js.Array[Locale]] = js.native
  
  /** The set of available orientations. */
  var orientations: js.UndefOr[js.Array[Orientation]] = js.native
}
object AndroidRuntimeConfiguration {
  
  @scala.inline
  def apply(): AndroidRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidRuntimeConfiguration]
  }
  
  @scala.inline
  implicit class AndroidRuntimeConfigurationMutableBuilder[Self <: AndroidRuntimeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocales(value: js.Array[Locale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    @scala.inline
    def setOrientations(value: js.Array[Orientation]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    @scala.inline
    def setOrientationsVarargs(value: Orientation*): Self = StObject.set(x, "orientations", js.Array(value :_*))
  }
}
