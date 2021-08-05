package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Commit
import typings.octokitTypes.anon.Enabled
import typings.octokitTypes.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetBranchResponseData extends StObject {
  
  var _links: Self
  
  var commit: Commit
  
  var name: String
  
  var `protected`: Boolean
  
  var protection: Enabled
  
  var protection_url: String
}
object ReposGetBranchResponseData {
  
  inline def apply(
    _links: Self,
    commit: Commit,
    name: String,
    `protected`: Boolean,
    protection: Enabled,
    protection_url: String
  ): ReposGetBranchResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseData]
  }
  
  extension [Self <: ReposGetBranchResponseData](x: Self) {
    
    inline def setCommit(value: Commit): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtection(value: Enabled): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Self): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
