package typings.naverWhale.whale.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeSet extends js.Object {
  
  /** Optional. Websites' appcaches.  */
  var appcache: js.UndefOr[Boolean] = js.native
  
  /** Optional. The browser's cache. Note: when removing data, this clears the entire cache: it is not limited to the range you specify.  */
  var cache: js.UndefOr[Boolean] = js.native
  
  /** Optional. The browser's cookies.  */
  var cookies: js.UndefOr[Boolean] = js.native
  
  /** Optional. The browser's download list.  */
  var downloads: js.UndefOr[Boolean] = js.native
  
  /** Optional. Websites' file systems.  */
  var fileSystems: js.UndefOr[Boolean] = js.native
  
  /** Optional. The browser's stored form data.  */
  var formData: js.UndefOr[Boolean] = js.native
  
  /** Optional. The browser's history.  */
  var history: js.UndefOr[Boolean] = js.native
  
  /** Optional. Websites' IndexedDB data.  */
  var indexedDB: js.UndefOr[Boolean] = js.native
  
  /** Optional. Websites' local storage data.  */
  var localStorage: js.UndefOr[Boolean] = js.native
  
  /** Optional. Stored passwords.  */
  var passwords: js.UndefOr[Boolean] = js.native
  
  /** Optional. Plugins' data.  */
  var pluginData: js.UndefOr[Boolean] = js.native
  
  /** Optional. Server-bound certificates.  */
  var serverBoundCertificates: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.
    * Since Chrome 39.
    * Service Workers.
    */
  var serviceWorkers: js.UndefOr[Boolean] = js.native
  
  /** Optional. Websites' WebSQL data.  */
  var webSQL: js.UndefOr[Boolean] = js.native
}
object DataTypeSet {
  
  @scala.inline
  def apply(): DataTypeSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTypeSet]
  }
  
  @scala.inline
  implicit class DataTypeSetOps[Self <: DataTypeSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppcache(value: Boolean): Self = this.set("appcache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppcache: Self = this.set("appcache", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCookies(value: Boolean): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setDownloads(value: Boolean): Self = this.set("downloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloads: Self = this.set("downloads", js.undefined)
    
    @scala.inline
    def setFileSystems(value: Boolean): Self = this.set("fileSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystems: Self = this.set("fileSystems", js.undefined)
    
    @scala.inline
    def setFormData(value: Boolean): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setIndexedDB(value: Boolean): Self = this.set("indexedDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexedDB: Self = this.set("indexedDB", js.undefined)
    
    @scala.inline
    def setLocalStorage(value: Boolean): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
    
    @scala.inline
    def setPasswords(value: Boolean): Self = this.set("passwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswords: Self = this.set("passwords", js.undefined)
    
    @scala.inline
    def setPluginData(value: Boolean): Self = this.set("pluginData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginData: Self = this.set("pluginData", js.undefined)
    
    @scala.inline
    def setServerBoundCertificates(value: Boolean): Self = this.set("serverBoundCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerBoundCertificates: Self = this.set("serverBoundCertificates", js.undefined)
    
    @scala.inline
    def setServiceWorkers(value: Boolean): Self = this.set("serviceWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceWorkers: Self = this.set("serviceWorkers", js.undefined)
    
    @scala.inline
    def setWebSQL(value: Boolean): Self = this.set("webSQL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSQL: Self = this.set("webSQL", js.undefined)
  }
}
