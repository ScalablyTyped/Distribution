package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildbotCommandEvents extends js.Object {
  
  /** Indicates whether we are using a cached Docker image (true) or had to pull the Docker image (false) for this command. */
  var dockerCacheHit: js.UndefOr[Boolean] = js.native
  
  /** Docker Image name. */
  var dockerImageName: js.UndefOr[String] = js.native
  
  /** The input cache miss ratio. */
  var inputCacheMiss: js.UndefOr[Double] = js.native
  
  /** The number of errors reported. */
  var numErrors: js.UndefOr[String] = js.native
  
  /** The number of warnings reported. */
  var numWarnings: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildbotCommandEvents {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildbotCommandEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotCommandEvents]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildbotCommandEventsOps[Self <: GoogleDevtoolsRemotebuildbotCommandEvents] (val x: Self) extends AnyVal {
    
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
    def setDockerCacheHit(value: Boolean): Self = this.set("dockerCacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerCacheHit: Self = this.set("dockerCacheHit", js.undefined)
    
    @scala.inline
    def setDockerImageName(value: String): Self = this.set("dockerImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerImageName: Self = this.set("dockerImageName", js.undefined)
    
    @scala.inline
    def setInputCacheMiss(value: Double): Self = this.set("inputCacheMiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputCacheMiss: Self = this.set("inputCacheMiss", js.undefined)
    
    @scala.inline
    def setNumErrors(value: String): Self = this.set("numErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumErrors: Self = this.set("numErrors", js.undefined)
    
    @scala.inline
    def setNumWarnings(value: String): Self = this.set("numWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumWarnings: Self = this.set("numWarnings", js.undefined)
  }
}
