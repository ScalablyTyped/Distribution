package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityMarks extends StObject {
  
  /**
    * Mutable user specified security marks belonging to the parent resource. Constraints are as follows: * Keys and values are treated as case insensitive * Keys must be between 1 - 256
    * characters (inclusive) * Keys must be letters, numbers, underscores, or dashes * Values have leading and trailing whitespace trimmed, remaining characters must be between 1 - 4096
    * characters (inclusive)
    */
  var marks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.SecurityMarks & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples:
    * "organizations/{organization_id}/assets/{asset_id}/securityMarks" "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
    */
  var name: js.UndefOr[String] = js.undefined
}
object SecurityMarks {
  
  @scala.inline
  def apply(): SecurityMarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityMarks]
  }
  
  @scala.inline
  implicit class SecurityMarksMutableBuilder[Self <: SecurityMarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.SecurityMarks & TopLevel[js.Any]
    ): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
