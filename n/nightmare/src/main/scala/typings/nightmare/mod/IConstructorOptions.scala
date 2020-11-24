package typings.nightmare.mod

import typings.nightmare.anon.Downloads
import typings.nightmare.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConstructorOptions extends js.Object {
  
  var cookiesFile: js.UndefOr[String] = js.native
  
  var electronPath: js.UndefOr[String] = js.native
  
  var executionTimeout: js.UndefOr[Double] = js.native
  
  //in ms
  var gotoTimeout: js.UndefOr[Double] = js.native
  
  var ignoreDownloads: js.UndefOr[Boolean] = js.native
  
  var ignoreSslErrors: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[js.Any] = js.native
  
  var loadImages: js.UndefOr[Boolean] = js.native
  
  var maxDownloadRequestWait: js.UndefOr[Double] = js.native
  
  var openDevTools: js.UndefOr[Mode] = js.native
  
  var paths: js.UndefOr[Downloads] = js.native
  
  var phantomPath: js.UndefOr[String] = js.native
  
  var pollInterval: js.UndefOr[Double] = js.native
  
   // number | string;
  var port: js.UndefOr[Double] = js.native
  
  var proxy: js.UndefOr[String] = js.native
  
  var proxyAuth: js.UndefOr[String] = js.native
  
  var proxyType: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var sslProtocol: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[js.Any] = js.native
  
  var typeInterval: js.UndefOr[Double] = js.native
  
    // number | string;
  var waitTimeout: js.UndefOr[Double] = js.native
  
  var weak: js.UndefOr[Boolean] = js.native
  
  var webSecurity: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object IConstructorOptions {
  
  @scala.inline
  def apply(): IConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstructorOptions]
  }
  
  @scala.inline
  implicit class IConstructorOptionsOps[Self <: IConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setCookiesFile(value: String): Self = this.set("cookiesFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookiesFile: Self = this.set("cookiesFile", js.undefined)
    
    @scala.inline
    def setElectronPath(value: String): Self = this.set("electronPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectronPath: Self = this.set("electronPath", js.undefined)
    
    @scala.inline
    def setExecutionTimeout(value: Double): Self = this.set("executionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionTimeout: Self = this.set("executionTimeout", js.undefined)
    
    @scala.inline
    def setGotoTimeout(value: Double): Self = this.set("gotoTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGotoTimeout: Self = this.set("gotoTimeout", js.undefined)
    
    @scala.inline
    def setIgnoreDownloads(value: Boolean): Self = this.set("ignoreDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDownloads: Self = this.set("ignoreDownloads", js.undefined)
    
    @scala.inline
    def setIgnoreSslErrors(value: Boolean): Self = this.set("ignoreSslErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSslErrors: Self = this.set("ignoreSslErrors", js.undefined)
    
    @scala.inline
    def setInterval(value: js.Any): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setLoadImages(value: Boolean): Self = this.set("loadImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadImages: Self = this.set("loadImages", js.undefined)
    
    @scala.inline
    def setMaxDownloadRequestWait(value: Double): Self = this.set("maxDownloadRequestWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDownloadRequestWait: Self = this.set("maxDownloadRequestWait", js.undefined)
    
    @scala.inline
    def setOpenDevTools(value: Mode): Self = this.set("openDevTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenDevTools: Self = this.set("openDevTools", js.undefined)
    
    @scala.inline
    def setPaths(value: Downloads): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setPhantomPath(value: String): Self = this.set("phantomPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhantomPath: Self = this.set("phantomPath", js.undefined)
    
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setProxyAuth(value: String): Self = this.set("proxyAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyAuth: Self = this.set("proxyAuth", js.undefined)
    
    @scala.inline
    def setProxyType(value: String): Self = this.set("proxyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyType: Self = this.set("proxyType", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSslProtocol(value: String): Self = this.set("sslProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslProtocol: Self = this.set("sslProtocol", js.undefined)
    
    @scala.inline
    def setTimeout(value: js.Any): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTypeInterval(value: Double): Self = this.set("typeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeInterval: Self = this.set("typeInterval", js.undefined)
    
    @scala.inline
    def setWaitTimeout(value: Double): Self = this.set("waitTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitTimeout: Self = this.set("waitTimeout", js.undefined)
    
    @scala.inline
    def setWeak(value: Boolean): Self = this.set("weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeak: Self = this.set("weak", js.undefined)
    
    @scala.inline
    def setWebSecurity(value: Boolean): Self = this.set("webSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSecurity: Self = this.set("webSecurity", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
