package typings.openui5.sapUiBaseManagedObjectMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectBindingInfo extends StObject {
  
  /**
    * Map of event handler functions keyed by the name of the binding events that they are attached to
    */
  var events: js.UndefOr[Record[String, js.Function]] = js.undefined
  
  /**
    * Name of the model to bind against; when `undefined` or omitted, the default model is used
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Map of additional parameters for this binding; the names and value ranges of the supported parameters
    * depend on the model implementation and should be documented with the `bindContext` method of the corresponding
    * model class or with the model-specific subclass of `sap.ui.model.ContextBinding`
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Path in the model to bind to, either an absolute path or relative to the binding context for the corresponding
    * model. If the path contains a '>' sign, the string preceding it will override the `model` property,
    * and the remainder after the '>' sign will be used as binding path
    */
  var path: String
  
  /**
    * Whether the binding is initially suspended
    */
  var suspended: js.UndefOr[Boolean] = js.undefined
}
object ObjectBindingInfo {
  
  inline def apply(path: String): ObjectBindingInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectBindingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectBindingInfo] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Record[String, js.Function]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
  }
}
