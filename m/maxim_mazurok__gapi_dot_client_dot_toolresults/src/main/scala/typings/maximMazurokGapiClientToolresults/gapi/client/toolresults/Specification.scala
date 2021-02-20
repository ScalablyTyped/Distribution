package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Specification extends StObject {
  
  /** An Android mobile test execution specification. */
  var androidTest: js.UndefOr[AndroidTest] = js.native
  
  /** An iOS mobile test execution specification. */
  var iosTest: js.UndefOr[IosTest] = js.native
}
object Specification {
  
  @scala.inline
  def apply(): Specification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Specification]
  }
  
  @scala.inline
  implicit class SpecificationMutableBuilder[Self <: Specification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidTest(value: AndroidTest): Self = StObject.set(x, "androidTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidTestUndefined: Self = StObject.set(x, "androidTest", js.undefined)
    
    @scala.inline
    def setIosTest(value: IosTest): Self = StObject.set(x, "iosTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosTestUndefined: Self = StObject.set(x, "iosTest", js.undefined)
  }
}
