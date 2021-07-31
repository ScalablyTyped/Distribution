package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectConfig extends StObject {
  
  /** Reject a Git push that contains a private key. */
  var enablePrivateKeyCheck: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the project. Values are of the form `projects/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** How this project publishes a change in the repositories through Cloud Pub/Sub. Keyed by the topic names. */
  var pubsubConfigs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig}
    */ typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.ProjectConfig & TopLevel[js.Any]
  ] = js.undefined
}
object ProjectConfig {
  
  @scala.inline
  def apply(): ProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectConfig]
  }
  
  @scala.inline
  implicit class ProjectConfigMutableBuilder[Self <: ProjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablePrivateKeyCheck(value: Boolean): Self = StObject.set(x, "enablePrivateKeyCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePrivateKeyCheckUndefined: Self = StObject.set(x, "enablePrivateKeyCheck", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPubsubConfigs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.sourcerepo.gapi.client.sourcerepo.PubsubConfig}
      */ typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.ProjectConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "pubsubConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubConfigsUndefined: Self = StObject.set(x, "pubsubConfigs", js.undefined)
  }
}
