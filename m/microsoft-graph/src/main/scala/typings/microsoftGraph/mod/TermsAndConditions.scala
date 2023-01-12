package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermsAndConditions
  extends StObject
     with Entity {
  
  /**
    * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms
    * and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
    */
  var acceptanceStatement: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of acceptance statuses for this T&amp;C policy.
  var acceptanceStatuses: js.UndefOr[NullableOption[js.Array[TermsAndConditionsAcceptanceStatus]]] = js.undefined
  
  // The list of assignments for this T&amp;C policy.
  var assignments: js.UndefOr[NullableOption[js.Array[TermsAndConditionsAssignment]]] = js.undefined
  
  /**
    * Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user
    * on prompts to accept the T&amp;C policy.
    */
  var bodyText: js.UndefOr[NullableOption[String]] = js.undefined
  
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Administrator-supplied description of the T&amp;C policy.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Administrator-supplied name for the T&amp;C policy.
  var displayName: js.UndefOr[String] = js.undefined
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C
    * policy.
    */
  var title: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and
    * wishes to require users to re-accept the modified T&amp;C policy.
    */
  var version: js.UndefOr[Double] = js.undefined
}
object TermsAndConditions {
  
  inline def apply(): TermsAndConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TermsAndConditions] (val x: Self) extends AnyVal {
    
    inline def setAcceptanceStatement(value: NullableOption[String]): Self = StObject.set(x, "acceptanceStatement", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceStatementNull: Self = StObject.set(x, "acceptanceStatement", null)
    
    inline def setAcceptanceStatementUndefined: Self = StObject.set(x, "acceptanceStatement", js.undefined)
    
    inline def setAcceptanceStatuses(value: NullableOption[js.Array[TermsAndConditionsAcceptanceStatus]]): Self = StObject.set(x, "acceptanceStatuses", value.asInstanceOf[js.Any])
    
    inline def setAcceptanceStatusesNull: Self = StObject.set(x, "acceptanceStatuses", null)
    
    inline def setAcceptanceStatusesUndefined: Self = StObject.set(x, "acceptanceStatuses", js.undefined)
    
    inline def setAcceptanceStatusesVarargs(value: TermsAndConditionsAcceptanceStatus*): Self = StObject.set(x, "acceptanceStatuses", js.Array(value*))
    
    inline def setAssignments(value: NullableOption[js.Array[TermsAndConditionsAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: TermsAndConditionsAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setBodyText(value: NullableOption[String]): Self = StObject.set(x, "bodyText", value.asInstanceOf[js.Any])
    
    inline def setBodyTextNull: Self = StObject.set(x, "bodyText", null)
    
    inline def setBodyTextUndefined: Self = StObject.set(x, "bodyText", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
