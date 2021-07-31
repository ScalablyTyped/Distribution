package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentMatrix extends StObject {
  
  /** A list of Android devices; the test will be run only on the specified devices. */
  var androidDeviceList: js.UndefOr[AndroidDeviceList] = js.undefined
  
  /** A matrix of Android devices. */
  var androidMatrix: js.UndefOr[AndroidMatrix] = js.undefined
  
  /** A list of iOS devices. */
  var iosDeviceList: js.UndefOr[IosDeviceList] = js.undefined
}
object EnvironmentMatrix {
  
  @scala.inline
  def apply(): EnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentMatrix]
  }
  
  @scala.inline
  implicit class EnvironmentMatrixMutableBuilder[Self <: EnvironmentMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidDeviceList(value: AndroidDeviceList): Self = StObject.set(x, "androidDeviceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDeviceListUndefined: Self = StObject.set(x, "androidDeviceList", js.undefined)
    
    @scala.inline
    def setAndroidMatrix(value: AndroidMatrix): Self = StObject.set(x, "androidMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidMatrixUndefined: Self = StObject.set(x, "androidMatrix", js.undefined)
    
    @scala.inline
    def setIosDeviceList(value: IosDeviceList): Self = StObject.set(x, "iosDeviceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDeviceListUndefined: Self = StObject.set(x, "iosDeviceList", js.undefined)
  }
}
