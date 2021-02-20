package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyContactGroupMembersResponse extends StObject {
  
  /** The contact people resource names that cannot be removed from their last contact group. */
  var canNotRemoveLastContactGroupResourceNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The contact people resource names that were not found. */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
}
object ModifyContactGroupMembersResponse {
  
  @scala.inline
  def apply(): ModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyContactGroupMembersResponse]
  }
  
  @scala.inline
  implicit class ModifyContactGroupMembersResponseMutableBuilder[Self <: ModifyContactGroupMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanNotRemoveLastContactGroupResourceNames(value: js.Array[String]): Self = StObject.set(x, "canNotRemoveLastContactGroupResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanNotRemoveLastContactGroupResourceNamesUndefined: Self = StObject.set(x, "canNotRemoveLastContactGroupResourceNames", js.undefined)
    
    @scala.inline
    def setCanNotRemoveLastContactGroupResourceNamesVarargs(value: String*): Self = StObject.set(x, "canNotRemoveLastContactGroupResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setNotFoundResourceNames(value: js.Array[String]): Self = StObject.set(x, "notFoundResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundResourceNamesUndefined: Self = StObject.set(x, "notFoundResourceNames", js.undefined)
    
    @scala.inline
    def setNotFoundResourceNamesVarargs(value: String*): Self = StObject.set(x, "notFoundResourceNames", js.Array(value :_*))
  }
}
