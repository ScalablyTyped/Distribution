package typings.nightwatch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateObject extends StObject {
  
  var dateObject: js.UndefOr[js.Date] = js.undefined
  
  var isError: js.UndefOr[Boolean] = js.undefined
  
  var testCase: js.UndefOr[String] = js.undefined
  
  var testSuite: js.UndefOr[String] = js.undefined
}
object DateObject {
  
  inline def apply(): DateObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateObject] (val x: Self) extends AnyVal {
    
    inline def setDateObject(value: js.Date): Self = StObject.set(x, "dateObject", value.asInstanceOf[js.Any])
    
    inline def setDateObjectUndefined: Self = StObject.set(x, "dateObject", js.undefined)
    
    inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
    
    inline def setTestCase(value: String): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
    
    inline def setTestSuite(value: String): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteUndefined: Self = StObject.set(x, "testSuite", js.undefined)
  }
}
