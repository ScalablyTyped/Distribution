package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFolder
  extends StObject
     with Entity {
  
  // The collection of child folders in the folder. Navigation property. Read-only. Nullable.
  var childFolders: js.UndefOr[NullableOption[js.Array[ContactFolder]]] = js.undefined
  
  // The contacts in the folder. Navigation property. Read-only. Nullable.
  var contacts: js.UndefOr[NullableOption[js.Array[Contact]]] = js.undefined
  
  // The folder's display name.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  // The ID of the folder's parent folder.
  var parentFolderId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
}
object ContactFolder {
  
  @scala.inline
  def apply(): ContactFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFolder]
  }
  
  @scala.inline
  implicit class ContactFolderMutableBuilder[Self <: ContactFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildFolders(value: NullableOption[js.Array[ContactFolder]]): Self = StObject.set(x, "childFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildFoldersNull: Self = StObject.set(x, "childFolders", null)
    
    @scala.inline
    def setChildFoldersUndefined: Self = StObject.set(x, "childFolders", js.undefined)
    
    @scala.inline
    def setChildFoldersVarargs(value: ContactFolder*): Self = StObject.set(x, "childFolders", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: NullableOption[js.Array[Contact]]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactsNull: Self = StObject.set(x, "contacts", null)
    
    @scala.inline
    def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setParentFolderId(value: NullableOption[String]): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdNull: Self = StObject.set(x, "parentFolderId", null)
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value :_*))
  }
}
