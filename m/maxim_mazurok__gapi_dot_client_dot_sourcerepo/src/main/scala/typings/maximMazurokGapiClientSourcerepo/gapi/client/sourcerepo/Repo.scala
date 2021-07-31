package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.TopLevel
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig}
    */ typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.Repo & TopLevel[js.Any]
  ] = js.undefined
  
  /** The disk usage of the repo, in bytes. Read-only field. Size is only returned by GetRepo. */
  var size: js.UndefOr[String] = js.undefined
  
  /** URL to clone the repository from Google Cloud Source Repositories. Read-only field. */
  var url: js.UndefOr[String] = js.undefined
}
object Repo {
  
  @scala.inline
  def apply(): Repo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repo]
  }
  
  @scala.inline
  implicit class RepoMutableBuilder[Self <: Repo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMirrorConfig(value: MirrorConfig): Self = StObject.set(x, "mirrorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorConfigUndefined: Self = StObject.set(x, "mirrorConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPubsubConfigs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig}
      */ typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.Repo & TopLevel[js.Any]
    ): Self = StObject.set(x, "pubsubConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubConfigsUndefined: Self = StObject.set(x, "pubsubConfigs", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
