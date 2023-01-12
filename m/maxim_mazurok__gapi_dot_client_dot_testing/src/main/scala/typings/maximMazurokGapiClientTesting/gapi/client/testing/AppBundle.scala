package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppBundle extends StObject {
  
  /** .aab file representing the app bundle under test. */
  var bundleLocation: js.UndefOr[FileReference] = js.undefined
}
object AppBundle {
  
  inline def apply(): AppBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBundle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppBundle] (val x: Self) extends AnyVal {
    
    inline def setBundleLocation(value: FileReference): Self = StObject.set(x, "bundleLocation", value.asInstanceOf[js.Any])
    
    inline def setBundleLocationUndefined: Self = StObject.set(x, "bundleLocation", js.undefined)
  }
}
