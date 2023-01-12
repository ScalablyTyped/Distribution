package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterShare
  extends StObject
     with PrinterBase {
  
  /**
    * If true, all users and groups will be granted access to this printer share. This supersedes the allow lists defined by
    * the allowedUsers and allowedGroups navigation properties.
    */
  var allowAllUsers: js.UndefOr[Boolean] = js.undefined
  
  // The groups whose users have access to print using the printer.
  var allowedGroups: js.UndefOr[NullableOption[js.Array[Group]]] = js.undefined
  
  // The users who have access to print using the printer.
  var allowedUsers: js.UndefOr[NullableOption[js.Array[User]]] = js.undefined
  
  // The DateTimeOffset when the printer share was created. Read-only.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The printer that this printer share is related to.
  var printer: js.UndefOr[NullableOption[Printer]] = js.undefined
}
object PrinterShare {
  
  inline def apply(): PrinterShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterShare]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterShare] (val x: Self) extends AnyVal {
    
    inline def setAllowAllUsers(value: Boolean): Self = StObject.set(x, "allowAllUsers", value.asInstanceOf[js.Any])
    
    inline def setAllowAllUsersUndefined: Self = StObject.set(x, "allowAllUsers", js.undefined)
    
    inline def setAllowedGroups(value: NullableOption[js.Array[Group]]): Self = StObject.set(x, "allowedGroups", value.asInstanceOf[js.Any])
    
    inline def setAllowedGroupsNull: Self = StObject.set(x, "allowedGroups", null)
    
    inline def setAllowedGroupsUndefined: Self = StObject.set(x, "allowedGroups", js.undefined)
    
    inline def setAllowedGroupsVarargs(value: Group*): Self = StObject.set(x, "allowedGroups", js.Array(value*))
    
    inline def setAllowedUsers(value: NullableOption[js.Array[User]]): Self = StObject.set(x, "allowedUsers", value.asInstanceOf[js.Any])
    
    inline def setAllowedUsersNull: Self = StObject.set(x, "allowedUsers", null)
    
    inline def setAllowedUsersUndefined: Self = StObject.set(x, "allowedUsers", js.undefined)
    
    inline def setAllowedUsersVarargs(value: User*): Self = StObject.set(x, "allowedUsers", js.Array(value*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setPrinter(value: NullableOption[Printer]): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
    
    inline def setPrinterNull: Self = StObject.set(x, "printer", null)
    
    inline def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
  }
}
