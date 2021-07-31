package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildbotCommandEvents extends StObject {
  
  /** Indicates whether we are using a cached Docker image (true) or had to pull the Docker image (false) for this command. */
  var dockerCacheHit: js.UndefOr[Boolean] = js.undefined
  
  /** Docker Image name. */
  var dockerImageName: js.UndefOr[String] = js.undefined
  
  /** The input cache miss ratio. */
  var inputCacheMiss: js.UndefOr[Double] = js.undefined
  
  /** The number of errors reported. */
  var numErrors: js.UndefOr[String] = js.undefined
  
  /** The number of warnings reported. */
  var numWarnings: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildbotCommandEvents {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildbotCommandEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotCommandEvents]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildbotCommandEventsMutableBuilder[Self <: GoogleDevtoolsRemotebuildbotCommandEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDockerCacheHit(value: Boolean): Self = StObject.set(x, "dockerCacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerCacheHitUndefined: Self = StObject.set(x, "dockerCacheHit", js.undefined)
    
    @scala.inline
    def setDockerImageName(value: String): Self = StObject.set(x, "dockerImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerImageNameUndefined: Self = StObject.set(x, "dockerImageName", js.undefined)
    
    @scala.inline
    def setInputCacheMiss(value: Double): Self = StObject.set(x, "inputCacheMiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputCacheMissUndefined: Self = StObject.set(x, "inputCacheMiss", js.undefined)
    
    @scala.inline
    def setNumErrors(value: String): Self = StObject.set(x, "numErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumErrorsUndefined: Self = StObject.set(x, "numErrors", js.undefined)
    
    @scala.inline
    def setNumWarnings(value: String): Self = StObject.set(x, "numWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumWarningsUndefined: Self = StObject.set(x, "numWarnings", js.undefined)
  }
}
