package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDescriptor extends StObject {
  
  /** A human-readable description of this log. This information appears in the documentation and can contain details. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The human-readable name for this log. This information appears on the user interface and should be concise. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The set of labels that are available to describe a specific log entry. Runtime requests that contain labels not specified here are considered invalid. */
  var labels: js.UndefOr[js.Array[LabelDescriptor]] = js.undefined
  
  /**
    * The name of the log. It must be less than 512 characters long and can include the following characters: upper- and lower-case alphanumeric characters [A-Za-z0-9], and punctuation
    * characters including slash, underscore, hyphen, period [/_-.].
    */
  var name: js.UndefOr[String] = js.undefined
}
object LogDescriptor {
  
  inline def apply(): LogDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDescriptor]
  }
  
  extension [Self <: LogDescriptor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: js.Array[LabelDescriptor]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: LabelDescriptor*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
