package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsArray extends StObject {
  
  /** @description The GitHub Apps that have push access to this branch. Use the slugified version of the app name. **Note**: The list of users, apps, and teams in total is limited to 100 items. */
  var apps: js.Array[String]
}
object AppsArray {
  
  inline def apply(apps: js.Array[String]): AppsArray = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsArray] (val x: Self) extends AnyVal {
    
    inline def setApps(value: js.Array[String]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsVarargs(value: String*): Self = StObject.set(x, "apps", js.Array(value*))
  }
}
