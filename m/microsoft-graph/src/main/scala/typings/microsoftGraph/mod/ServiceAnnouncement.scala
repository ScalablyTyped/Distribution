package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAnnouncement
  extends StObject
     with Entity {
  
  /**
    * A collection of service health information for tenant. This property is a contained navigation property, it is nullable
    * and readonly.
    */
  var healthOverviews: js.UndefOr[NullableOption[js.Array[ServiceHealth]]] = js.undefined
  
  /**
    * A collection of service issues for tenant. This property is a contained navigation property, it is nullable and
    * readonly.
    */
  var issues: js.UndefOr[NullableOption[js.Array[ServiceHealthIssue]]] = js.undefined
  
  /**
    * A collection of service messages for tenant. This property is a contained navigation property, it is nullable and
    * readonly.
    */
  var messages: js.UndefOr[NullableOption[js.Array[ServiceUpdateMessage]]] = js.undefined
}
object ServiceAnnouncement {
  
  inline def apply(): ServiceAnnouncement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAnnouncement]
  }
  
  extension [Self <: ServiceAnnouncement](x: Self) {
    
    inline def setHealthOverviews(value: NullableOption[js.Array[ServiceHealth]]): Self = StObject.set(x, "healthOverviews", value.asInstanceOf[js.Any])
    
    inline def setHealthOverviewsNull: Self = StObject.set(x, "healthOverviews", null)
    
    inline def setHealthOverviewsUndefined: Self = StObject.set(x, "healthOverviews", js.undefined)
    
    inline def setHealthOverviewsVarargs(value: ServiceHealth*): Self = StObject.set(x, "healthOverviews", js.Array(value*))
    
    inline def setIssues(value: NullableOption[js.Array[ServiceHealthIssue]]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesNull: Self = StObject.set(x, "issues", null)
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: ServiceHealthIssue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setMessages(value: NullableOption[js.Array[ServiceUpdateMessage]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: ServiceUpdateMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
