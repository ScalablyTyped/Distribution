package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repo extends StObject {
  
  /** How this repository mirrors a repository managed by another service. Read-only field. */
  var mirrorConfig: js.UndefOr[MirrorConfig] = js.undefined
  
  /** Resource name of the repository, of the form `projects//repos/`. The repo name may contain slashes. eg, `projects/myproject/repos/name/with/slash` */
  var name: js.UndefOr[String] = js.undefined
  
  /** How this repository publishes a change in the repository through Cloud Pub/Sub. Keyed by the topic names. */
  var pubsubConfigs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig} */ js.Any
  ] = js.undefined
  
  /** The disk usage of the repo, in bytes. Read-only field. Size is only returned by GetRepo. */
  var size: js.UndefOr[String] = js.undefined
  
  /** URL to clone the repository from Google Cloud Source Repositories. Read-only field. */
  var url: js.UndefOr[String] = js.undefined
}
object Repo {
  
  inline def apply(): Repo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repo]
  }
  
  extension [Self <: Repo](x: Self) {
    
    inline def setMirrorConfig(value: MirrorConfig): Self = StObject.set(x, "mirrorConfig", value.asInstanceOf[js.Any])
    
    inline def setMirrorConfigUndefined: Self = StObject.set(x, "mirrorConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPubsubConfigs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig} */ js.Any
    ): Self = StObject.set(x, "pubsubConfigs", value.asInstanceOf[js.Any])
    
    inline def setPubsubConfigsUndefined: Self = StObject.set(x, "pubsubConfigs", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
