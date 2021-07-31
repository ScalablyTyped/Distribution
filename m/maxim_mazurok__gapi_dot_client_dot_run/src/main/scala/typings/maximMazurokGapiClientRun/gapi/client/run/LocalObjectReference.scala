package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalObjectReference extends StObject {
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[String] = js.undefined
}
object LocalObjectReference {
  
  @scala.inline
  def apply(): LocalObjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalObjectReference]
  }
  
  @scala.inline
  implicit class LocalObjectReferenceMutableBuilder[Self <: LocalObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
