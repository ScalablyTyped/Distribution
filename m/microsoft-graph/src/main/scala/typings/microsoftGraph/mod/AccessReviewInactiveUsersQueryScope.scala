package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewInactiveUsersQueryScope
  extends StObject
     with AccessReviewQueryScope {
  
  /**
    * Defines the duration of inactivity. Inactivity is based on the last sign in date of the user compared to the access
    * review instance's start date. If this property is not specified, it's assigned the default value PT0S.
    */
  var inactiveDuration: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewInactiveUsersQueryScope {
  
  inline def apply(): AccessReviewInactiveUsersQueryScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewInactiveUsersQueryScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewInactiveUsersQueryScope] (val x: Self) extends AnyVal {
    
    inline def setInactiveDuration(value: NullableOption[String]): Self = StObject.set(x, "inactiveDuration", value.asInstanceOf[js.Any])
    
    inline def setInactiveDurationNull: Self = StObject.set(x, "inactiveDuration", null)
    
    inline def setInactiveDurationUndefined: Self = StObject.set(x, "inactiveDuration", js.undefined)
  }
}
