package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBundle extends StObject {
  
  /** .aab file representing the app bundle under test. */
  var bundleLocation: js.UndefOr[FileReference] = js.native
}
object AppBundle {
  
  @scala.inline
  def apply(): AppBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBundle]
  }
  
  @scala.inline
  implicit class AppBundleMutableBuilder[Self <: AppBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleLocation(value: FileReference): Self = StObject.set(x, "bundleLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleLocationUndefined: Self = StObject.set(x, "bundleLocation", js.undefined)
  }
}
