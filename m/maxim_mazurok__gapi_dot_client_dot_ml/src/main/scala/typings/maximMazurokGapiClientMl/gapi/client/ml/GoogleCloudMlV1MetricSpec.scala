package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1MetricSpec extends StObject {
  
  /** metric name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Target specifies the target value for the given metric; once real metric deviates from the threshold by a certain percentage, the node count changes. */
  var target: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1MetricSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1MetricSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1MetricSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1MetricSpecMutableBuilder[Self <: GoogleCloudMlV1MetricSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
