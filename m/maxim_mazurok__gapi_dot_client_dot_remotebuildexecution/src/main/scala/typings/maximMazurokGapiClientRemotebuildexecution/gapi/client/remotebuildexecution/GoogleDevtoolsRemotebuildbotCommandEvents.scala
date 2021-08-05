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
  
  inline def apply(): GoogleDevtoolsRemotebuildbotCommandEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotCommandEvents]
  }
  
  extension [Self <: GoogleDevtoolsRemotebuildbotCommandEvents](x: Self) {
    
    inline def setDockerCacheHit(value: Boolean): Self = StObject.set(x, "dockerCacheHit", value.asInstanceOf[js.Any])
    
    inline def setDockerCacheHitUndefined: Self = StObject.set(x, "dockerCacheHit", js.undefined)
    
    inline def setDockerImageName(value: String): Self = StObject.set(x, "dockerImageName", value.asInstanceOf[js.Any])
    
    inline def setDockerImageNameUndefined: Self = StObject.set(x, "dockerImageName", js.undefined)
    
    inline def setInputCacheMiss(value: Double): Self = StObject.set(x, "inputCacheMiss", value.asInstanceOf[js.Any])
    
    inline def setInputCacheMissUndefined: Self = StObject.set(x, "inputCacheMiss", js.undefined)
    
    inline def setNumErrors(value: String): Self = StObject.set(x, "numErrors", value.asInstanceOf[js.Any])
    
    inline def setNumErrorsUndefined: Self = StObject.set(x, "numErrors", js.undefined)
    
    inline def setNumWarnings(value: String): Self = StObject.set(x, "numWarnings", value.asInstanceOf[js.Any])
    
    inline def setNumWarningsUndefined: Self = StObject.set(x, "numWarnings", js.undefined)
  }
}
