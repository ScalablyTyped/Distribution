package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAssignmentRequestorSettings extends StObject {
  
  // If false, the requestor is not permitted to include a schedule in their request.
  var allowCustomAssignmentSchedule: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, allows on-behalf-of requestors to create a request to add access for another principal.
  var enableOnBehalfRequestorsToAddAccess: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, allows on-behalf-of requestors to create a request to remove access for another principal.
  var enableOnBehalfRequestorsToRemoveAccess: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, allows on-behalf-of requestors to create a request to update access for another principal.
  var enableOnBehalfRequestorsToUpdateAccess: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, allows requestors to create a request to add access for themselves.
  var enableTargetsToSelfAddAccess: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, allows requestors to create a request to remove their access.
  var enableTargetsToSelfRemoveAccess: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, allows requestors to create a request to update their access.
  var enableTargetsToSelfUpdateAccess: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The principals who can request on-behalf-of others.
  var onBehalfRequestors: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
}
object AccessPackageAssignmentRequestorSettings {
  
  inline def apply(): AccessPackageAssignmentRequestorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAssignmentRequestorSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageAssignmentRequestorSettings] (val x: Self) extends AnyVal {
    
    inline def setAllowCustomAssignmentSchedule(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCustomAssignmentSchedule", value.asInstanceOf[js.Any])
    
    inline def setAllowCustomAssignmentScheduleNull: Self = StObject.set(x, "allowCustomAssignmentSchedule", null)
    
    inline def setAllowCustomAssignmentScheduleUndefined: Self = StObject.set(x, "allowCustomAssignmentSchedule", js.undefined)
    
    inline def setEnableOnBehalfRequestorsToAddAccess(value: NullableOption[Boolean]): Self = StObject.set(x, "enableOnBehalfRequestorsToAddAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableOnBehalfRequestorsToAddAccessNull: Self = StObject.set(x, "enableOnBehalfRequestorsToAddAccess", null)
    
    inline def setEnableOnBehalfRequestorsToAddAccessUndefined: Self = StObject.set(x, "enableOnBehalfRequestorsToAddAccess", js.undefined)
    
    inline def setEnableOnBehalfRequestorsToRemoveAccess(value: NullableOption[Boolean]): Self = StObject.set(x, "enableOnBehalfRequestorsToRemoveAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableOnBehalfRequestorsToRemoveAccessNull: Self = StObject.set(x, "enableOnBehalfRequestorsToRemoveAccess", null)
    
    inline def setEnableOnBehalfRequestorsToRemoveAccessUndefined: Self = StObject.set(x, "enableOnBehalfRequestorsToRemoveAccess", js.undefined)
    
    inline def setEnableOnBehalfRequestorsToUpdateAccess(value: NullableOption[Boolean]): Self = StObject.set(x, "enableOnBehalfRequestorsToUpdateAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableOnBehalfRequestorsToUpdateAccessNull: Self = StObject.set(x, "enableOnBehalfRequestorsToUpdateAccess", null)
    
    inline def setEnableOnBehalfRequestorsToUpdateAccessUndefined: Self = StObject.set(x, "enableOnBehalfRequestorsToUpdateAccess", js.undefined)
    
    inline def setEnableTargetsToSelfAddAccess(value: NullableOption[Boolean]): Self = StObject.set(x, "enableTargetsToSelfAddAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableTargetsToSelfAddAccessNull: Self = StObject.set(x, "enableTargetsToSelfAddAccess", null)
    
    inline def setEnableTargetsToSelfAddAccessUndefined: Self = StObject.set(x, "enableTargetsToSelfAddAccess", js.undefined)
    
    inline def setEnableTargetsToSelfRemoveAccess(value: NullableOption[Boolean]): Self = StObject.set(x, "enableTargetsToSelfRemoveAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableTargetsToSelfRemoveAccessNull: Self = StObject.set(x, "enableTargetsToSelfRemoveAccess", null)
    
    inline def setEnableTargetsToSelfRemoveAccessUndefined: Self = StObject.set(x, "enableTargetsToSelfRemoveAccess", js.undefined)
    
    inline def setEnableTargetsToSelfUpdateAccess(value: NullableOption[Boolean]): Self = StObject.set(x, "enableTargetsToSelfUpdateAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableTargetsToSelfUpdateAccessNull: Self = StObject.set(x, "enableTargetsToSelfUpdateAccess", null)
    
    inline def setEnableTargetsToSelfUpdateAccessUndefined: Self = StObject.set(x, "enableTargetsToSelfUpdateAccess", js.undefined)
    
    inline def setOnBehalfRequestors(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "onBehalfRequestors", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfRequestorsNull: Self = StObject.set(x, "onBehalfRequestors", null)
    
    inline def setOnBehalfRequestorsUndefined: Self = StObject.set(x, "onBehalfRequestors", js.undefined)
    
    inline def setOnBehalfRequestorsVarargs(value: SubjectSet*): Self = StObject.set(x, "onBehalfRequestors", js.Array(value*))
  }
}
