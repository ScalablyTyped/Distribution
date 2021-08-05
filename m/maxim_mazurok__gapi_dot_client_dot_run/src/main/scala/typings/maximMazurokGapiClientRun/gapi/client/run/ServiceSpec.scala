package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSpec extends StObject {
  
  /** Template holds the latest specification for the Revision to be stamped out. */
  var template: js.UndefOr[RevisionTemplate] = js.undefined
  
  /** Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations. */
  var traffic: js.UndefOr[js.Array[TrafficTarget]] = js.undefined
}
object ServiceSpec {
  
  inline def apply(): ServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpec]
  }
  
  extension [Self <: ServiceSpec](x: Self) {
    
    inline def setTemplate(value: RevisionTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTraffic(value: js.Array[TrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    inline def setTrafficVarargs(value: TrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value :_*))
  }
}
