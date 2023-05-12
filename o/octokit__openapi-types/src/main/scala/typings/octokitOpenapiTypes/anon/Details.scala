package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.commit
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.issue_body
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.issue_comment
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.issue_title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  var details: Blobsha | Issuetitleurl | Issuebodyurl | Issuecommenturl
  
  /**
    * @description The location type. Because secrets may be found in different types of resources (ie. code, comments, issues), this field identifies the type of resource where the secret was found.
    * @example commit
    * @enum {string}
    */
  var `type`: commit | issue_title | issue_body | issue_comment
}
object Details {
  
  inline def apply(
    details: Blobsha | Issuetitleurl | Issuebodyurl | Issuecommenturl,
    `type`: commit | issue_title | issue_body | issue_comment
  ): Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: Blobsha | Issuetitleurl | Issuebodyurl | Issuecommenturl): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setType(value: commit | issue_title | issue_body | issue_comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
