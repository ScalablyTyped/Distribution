package typings.nightwatch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppActivity extends StObject {
  
  var appActivity: String
  
  var appPackage: String
  
  var appWaitActivity: js.UndefOr[String] = js.undefined
  
  var appWaitPackage: js.UndefOr[String] = js.undefined
  
  var dontStopAppOnReset: js.UndefOr[Boolean] = js.undefined
  
  var intentAction: js.UndefOr[String] = js.undefined
  
  var intentCategory: js.UndefOr[String] = js.undefined
  
  var intentFlags: js.UndefOr[String] = js.undefined
  
  var optionalIntentArguments: js.UndefOr[String] = js.undefined
}
object AppActivity {
  
  inline def apply(appActivity: String, appPackage: String): AppActivity = {
    val __obj = js.Dynamic.literal(appActivity = appActivity.asInstanceOf[js.Any], appPackage = appPackage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppActivity] (val x: Self) extends AnyVal {
    
    inline def setAppActivity(value: String): Self = StObject.set(x, "appActivity", value.asInstanceOf[js.Any])
    
    inline def setAppPackage(value: String): Self = StObject.set(x, "appPackage", value.asInstanceOf[js.Any])
    
    inline def setAppWaitActivity(value: String): Self = StObject.set(x, "appWaitActivity", value.asInstanceOf[js.Any])
    
    inline def setAppWaitActivityUndefined: Self = StObject.set(x, "appWaitActivity", js.undefined)
    
    inline def setAppWaitPackage(value: String): Self = StObject.set(x, "appWaitPackage", value.asInstanceOf[js.Any])
    
    inline def setAppWaitPackageUndefined: Self = StObject.set(x, "appWaitPackage", js.undefined)
    
    inline def setDontStopAppOnReset(value: Boolean): Self = StObject.set(x, "dontStopAppOnReset", value.asInstanceOf[js.Any])
    
    inline def setDontStopAppOnResetUndefined: Self = StObject.set(x, "dontStopAppOnReset", js.undefined)
    
    inline def setIntentAction(value: String): Self = StObject.set(x, "intentAction", value.asInstanceOf[js.Any])
    
    inline def setIntentActionUndefined: Self = StObject.set(x, "intentAction", js.undefined)
    
    inline def setIntentCategory(value: String): Self = StObject.set(x, "intentCategory", value.asInstanceOf[js.Any])
    
    inline def setIntentCategoryUndefined: Self = StObject.set(x, "intentCategory", js.undefined)
    
    inline def setIntentFlags(value: String): Self = StObject.set(x, "intentFlags", value.asInstanceOf[js.Any])
    
    inline def setIntentFlagsUndefined: Self = StObject.set(x, "intentFlags", js.undefined)
    
    inline def setOptionalIntentArguments(value: String): Self = StObject.set(x, "optionalIntentArguments", value.asInstanceOf[js.Any])
    
    inline def setOptionalIntentArgumentsUndefined: Self = StObject.set(x, "optionalIntentArguments", js.undefined)
  }
}
