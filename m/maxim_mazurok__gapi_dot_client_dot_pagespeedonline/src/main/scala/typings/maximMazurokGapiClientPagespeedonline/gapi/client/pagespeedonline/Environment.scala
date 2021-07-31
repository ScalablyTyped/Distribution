package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /** The benchmark index number that indicates rough device class. */
  var benchmarkIndex: js.UndefOr[Double] = js.undefined
  
  /** The user agent string of the version of Chrome used. */
  var hostUserAgent: js.UndefOr[String] = js.undefined
  
  /** The user agent string that was sent over the network. */
  var networkUserAgent: js.UndefOr[String] = js.undefined
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenchmarkIndex(value: Double): Self = StObject.set(x, "benchmarkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenchmarkIndexUndefined: Self = StObject.set(x, "benchmarkIndex", js.undefined)
    
    @scala.inline
    def setHostUserAgent(value: String): Self = StObject.set(x, "hostUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUserAgentUndefined: Self = StObject.set(x, "hostUserAgent", js.undefined)
    
    @scala.inline
    def setNetworkUserAgent(value: String): Self = StObject.set(x, "networkUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUserAgentUndefined: Self = StObject.set(x, "networkUserAgent", js.undefined)
  }
}
