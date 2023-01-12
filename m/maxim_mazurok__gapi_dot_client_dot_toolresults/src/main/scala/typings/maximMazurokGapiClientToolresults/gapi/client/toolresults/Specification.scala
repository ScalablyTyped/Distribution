package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Specification extends StObject {
  
  /** An Android mobile test execution specification. */
  var androidTest: js.UndefOr[AndroidTest] = js.undefined
  
  /** An iOS mobile test execution specification. */
  var iosTest: js.UndefOr[IosTest] = js.undefined
}
object Specification {
  
  inline def apply(): Specification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Specification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Specification] (val x: Self) extends AnyVal {
    
    inline def setAndroidTest(value: AndroidTest): Self = StObject.set(x, "androidTest", value.asInstanceOf[js.Any])
    
    inline def setAndroidTestUndefined: Self = StObject.set(x, "androidTest", js.undefined)
    
    inline def setIosTest(value: IosTest): Self = StObject.set(x, "iosTest", value.asInstanceOf[js.Any])
    
    inline def setIosTestUndefined: Self = StObject.set(x, "iosTest", js.undefined)
  }
}
