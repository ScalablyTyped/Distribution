package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlActiveDirectoryConfig extends StObject {
  
  /** The name of the domain (e.g., mydomain.com). */
  var domain: js.UndefOr[String] = js.native
  
  /** This is always sql#activeDirectoryConfig. */
  var kind: js.UndefOr[String] = js.native
}
object SqlActiveDirectoryConfig {
  
  @scala.inline
  def apply(): SqlActiveDirectoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlActiveDirectoryConfig]
  }
  
  @scala.inline
  implicit class SqlActiveDirectoryConfigMutableBuilder[Self <: SqlActiveDirectoryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
