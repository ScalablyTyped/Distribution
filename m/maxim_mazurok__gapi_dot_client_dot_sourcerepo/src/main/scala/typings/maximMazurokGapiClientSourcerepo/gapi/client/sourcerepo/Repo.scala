package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repo extends js.Object {
  
  /** How this repository mirrors a repository managed by another service. Read-only field. */
  var mirrorConfig: js.UndefOr[MirrorConfig] = js.native
  
  /** Resource name of the repository, of the form `projects//repos/`. The repo name may contain slashes. eg, `projects/myproject/repos/name/with/slash` */
  var name: js.UndefOr[String] = js.native
  
  /** How this repository publishes a change in the repository through Cloud Pub/Sub. Keyed by the topic names. */
  var pubsubConfigs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig}
    */ typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.Repo with TopLevel[js.Any]
  ] = js.native
  
  /** The disk usage of the repo, in bytes. Read-only field. Size is only returned by GetRepo. */
  var size: js.UndefOr[String] = js.native
  
  /** URL to clone the repository from Google Cloud Source Repositories. Read-only field. */
  var url: js.UndefOr[String] = js.native
}
object Repo {
  
  @scala.inline
  def apply(): Repo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repo]
  }
  
  @scala.inline
  implicit class RepoOps[Self <: Repo] (val x: Self) extends AnyVal {
    
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
    def setMirrorConfig(value: MirrorConfig): Self = this.set("mirrorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMirrorConfig: Self = this.set("mirrorConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPubsubConfigs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig}
      */ typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.Repo with TopLevel[js.Any]
    ): Self = this.set("pubsubConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubConfigs: Self = this.set("pubsubConfigs", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
