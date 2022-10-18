package typings.next.anon

import typings.next.distServerLoadComponentsMod.ReactLoadableManifest
import typings.next.distSharedLibUtilsMod.DocumentType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMod extends StObject {
  
  var Document: DocumentType
  
  var appMod: Any
  
  var appRenderToHTML: Any
  
  var appServerMod: Any
  
  var buildId: String
  
  var buildManifest: typings.next.distServerGetPageFilesMod.BuildManifest
  
  var config: typings.next.distServerConfigSharedMod.NextConfig
  
  var dev: Boolean
  
  var error500Mod: Any
  
  var errorMod: Any
  
  var page: String
  
  var pageMod: Any
  
  var pagesRenderToHTML: Any
  
  var reactLoadableManifest: ReactLoadableManifest
  
  var serverCSSManifest: Any
  
  var serverComponentManifest: Any
  
  var subresourceIntegrityManifest: js.UndefOr[Record[String, String]] = js.undefined
}
object AppMod {
  
  inline def apply(
    Document: DocumentType,
    appMod: Any,
    appRenderToHTML: Any,
    appServerMod: Any,
    buildId: String,
    buildManifest: typings.next.distServerGetPageFilesMod.BuildManifest,
    config: typings.next.distServerConfigSharedMod.NextConfig,
    dev: Boolean,
    error500Mod: Any,
    errorMod: Any,
    page: String,
    pageMod: Any,
    pagesRenderToHTML: Any,
    reactLoadableManifest: ReactLoadableManifest,
    serverCSSManifest: Any,
    serverComponentManifest: Any
  ): AppMod = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], appMod = appMod.asInstanceOf[js.Any], appRenderToHTML = appRenderToHTML.asInstanceOf[js.Any], appServerMod = appServerMod.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], error500Mod = error500Mod.asInstanceOf[js.Any], errorMod = errorMod.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageMod = pageMod.asInstanceOf[js.Any], pagesRenderToHTML = pagesRenderToHTML.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any], serverCSSManifest = serverCSSManifest.asInstanceOf[js.Any], serverComponentManifest = serverComponentManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMod]
  }
  
  extension [Self <: AppMod](x: Self) {
    
    inline def setAppMod(value: Any): Self = StObject.set(x, "appMod", value.asInstanceOf[js.Any])
    
    inline def setAppRenderToHTML(value: Any): Self = StObject.set(x, "appRenderToHTML", value.asInstanceOf[js.Any])
    
    inline def setAppServerMod(value: Any): Self = StObject.set(x, "appServerMod", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildManifest(value: typings.next.distServerGetPageFilesMod.BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typings.next.distServerConfigSharedMod.NextConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: DocumentType): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setError500Mod(value: Any): Self = StObject.set(x, "error500Mod", value.asInstanceOf[js.Any])
    
    inline def setErrorMod(value: Any): Self = StObject.set(x, "errorMod", value.asInstanceOf[js.Any])
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageMod(value: Any): Self = StObject.set(x, "pageMod", value.asInstanceOf[js.Any])
    
    inline def setPagesRenderToHTML(value: Any): Self = StObject.set(x, "pagesRenderToHTML", value.asInstanceOf[js.Any])
    
    inline def setReactLoadableManifest(value: ReactLoadableManifest): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
    
    inline def setServerCSSManifest(value: Any): Self = StObject.set(x, "serverCSSManifest", value.asInstanceOf[js.Any])
    
    inline def setServerComponentManifest(value: Any): Self = StObject.set(x, "serverComponentManifest", value.asInstanceOf[js.Any])
    
    inline def setSubresourceIntegrityManifest(value: Record[String, String]): Self = StObject.set(x, "subresourceIntegrityManifest", value.asInstanceOf[js.Any])
    
    inline def setSubresourceIntegrityManifestUndefined: Self = StObject.set(x, "subresourceIntegrityManifest", js.undefined)
  }
}
