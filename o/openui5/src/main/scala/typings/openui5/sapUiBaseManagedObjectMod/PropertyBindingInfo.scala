package typings.openui5.sapUiBaseManagedObjectMod

import typings.openui5.sapUiModelBindingModeMod.BindingMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyBindingInfo extends StObject {
  
  /**
    * Additional constraints to be used when constructing a type object from a type name, ignored when a type
    * object is given
    */
  var constraints: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Map of event handler functions keyed by the name of the binding events that they should be attached to
    */
  var events: js.UndefOr[Record[String, js.Function]] = js.undefined
  
  /**
    * Format options to be used for the type; only taken into account when the type is specified by its name
    * - a given type object won't be modified
    */
  var formatOptions: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Function to convert model data into a property value
    */
  var formatter: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Binding mode to be used for this property binding (e.g. one way)
    */
  var mode: js.UndefOr[
    BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String)
  ] = js.undefined
  
  /**
    * Name of the model to bind against; when `undefined` or omitted, the default model is used
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Map of additional parameters for this binding; the names and value ranges of the supported parameters
    * depend on the model implementation, they should be documented with the `bindProperty` method of the corresponding
    * model class or with the model specific subclass of `sap.ui.model.PropertyBinding`
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Array of binding info objects for the parts of a composite binding; the structure of each binding info
    * is the same as described for the `oBindingInfo` as a whole.
    *
    * If a part is not specified as a binding info object but as a simple string, a binding info object will
    * be created with that string as `path`. The string may start with a model name prefix (see property `path`).
    *
    * **Note**: recursive composite bindings are currently not supported. Therefore, a part must not contain
    * a `parts` property.
    */
  var parts: js.UndefOr[js.Array[String | PropertyBindingInfo]] = js.undefined
  
  /**
    * Path in the model to bind to, either an absolute path or relative to the binding context for the corresponding
    * model; when the path contains a '>' sign, the string preceding it will override the `model` property
    * and the remainder after the '>' will be used as binding path
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the binding should be suspended initially
    */
  var suspended: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Target type to be used by the type when formatting model data, for example "boolean" or "string" or "any";
    * defaults to the property's type
    */
  var targetType: js.UndefOr[String] = js.undefined
  
  /**
    * A type object or the name of a type class to create such a type object; the type will be used for converting
    * model data to a property value (aka "formatting") and vice versa (in binding mode `TwoWay`, aka "parsing")
    */
  var `type`: js.UndefOr[typings.openui5.sapUiModelTypeMod.default | String] = js.undefined
  
  /**
    * Whether the parameters to the formatter function should be passed as the related JavaScript primitive
    * values. In this case the values of the model are parsed by the {@link sap.ui.model.SimpleType#getModelFormat model format }
    * of the specified types from the binding parts.
    *
    * **Note**: use this flag only when using multiple bindings.
    */
  var useInternalValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the parameters to the formatter function should be passed as raw values. In this case the specified
    * types for the binding parts are not used and the values are not formatted.
    *
    * **Note**: use this flag only when using multiple bindings. If you use only one binding and want raw values
    * then simply don't specify a type for that binding.
    */
  var useRawValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Since 1.61, defines a static binding with the given value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object PropertyBindingInfo {
  
  inline def apply(): PropertyBindingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyBindingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyBindingInfo] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setEvents(value: Record[String, js.Function]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFormatOptions(value: js.Object): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
    
    inline def setFormatter(value: js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setMode(
      value: BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String)
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParts(value: js.Array[String | PropertyBindingInfo]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: (String | PropertyBindingInfo)*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setType(value: typings.openui5.sapUiModelTypeMod.default | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseInternalValues(value: Boolean): Self = StObject.set(x, "useInternalValues", value.asInstanceOf[js.Any])
    
    inline def setUseInternalValuesUndefined: Self = StObject.set(x, "useInternalValues", js.undefined)
    
    inline def setUseRawValues(value: Boolean): Self = StObject.set(x, "useRawValues", value.asInstanceOf[js.Any])
    
    inline def setUseRawValuesUndefined: Self = StObject.set(x, "useRawValues", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
