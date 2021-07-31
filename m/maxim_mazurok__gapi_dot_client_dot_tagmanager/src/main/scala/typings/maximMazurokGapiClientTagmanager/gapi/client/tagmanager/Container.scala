package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The Container ID uniquely identifies the GTM Container. */
  var containerId: js.UndefOr[String] = js.undefined
  
  /** List of domain names associated with the Container. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update */
  var domainName: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The fingerprint of the GTM Container as computed at storage time. This value is recomputed whenever the account is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /** Container display name. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update */
  var name: js.UndefOr[String] = js.undefined
  
  /** Container Notes. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update */
  var notes: js.UndefOr[String] = js.undefined
  
  /** GTM Container's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Container Public ID. */
  var publicId: js.UndefOr[String] = js.undefined
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  
  /** List of Usage Contexts for the Container. Valid values include: web, android, or ios. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update */
  var usageContext: js.UndefOr[js.Array[String]] = js.undefined
}
object Container {
  
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setDomainName(value: js.Array[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setDomainNameVarargs(value: String*): Self = StObject.set(x, "domainName", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    @scala.inline
    def setUsageContext(value: js.Array[String]): Self = StObject.set(x, "usageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageContextUndefined: Self = StObject.set(x, "usageContext", js.undefined)
    
    @scala.inline
    def setUsageContextVarargs(value: String*): Self = StObject.set(x, "usageContext", js.Array(value :_*))
  }
}
