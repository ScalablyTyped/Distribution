package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildbotCommandEvents extends StObject {
  
  /** Indicates if and how Container Manager is being used for task execution. */
  var cmUsage: js.UndefOr[String] = js.undefined
  
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
  
  /** Indicates whether output files and/or output directories were found relative to the execution root or to the user provided work directory or both or none. */
  var outputLocation: js.UndefOr[String] = js.undefined
  
  /** Indicates whether an asynchronous container was used for execution. */
  var usedAsyncContainer: js.UndefOr[Boolean] = js.undefined
}
object GoogleDevtoolsRemotebuildbotCommandEvents {
  
  inline def apply(): GoogleDevtoolsRemotebuildbotCommandEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotCommandEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDevtoolsRemotebuildbotCommandEvents] (val x: Self) extends AnyVal {
    
    inline def setCmUsage(value: String): Self = StObject.set(x, "cmUsage", value.asInstanceOf[js.Any])
    
    inline def setCmUsageUndefined: Self = StObject.set(x, "cmUsage", js.undefined)
    
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
    
    inline def setOutputLocation(value: String): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    
    inline def setUsedAsyncContainer(value: Boolean): Self = StObject.set(x, "usedAsyncContainer", value.asInstanceOf[js.Any])
    
    inline def setUsedAsyncContainerUndefined: Self = StObject.set(x, "usedAsyncContainer", js.undefined)
  }
}
