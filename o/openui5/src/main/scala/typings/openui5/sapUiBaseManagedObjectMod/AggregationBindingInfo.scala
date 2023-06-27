package typings.openui5.sapUiBaseManagedObjectMod

import typings.openui5.anon.Key
import typings.openui5.int
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationBindingInfo extends StObject {
  
  /**
    * Map of event handler functions keyed by the name of the binding events that they should be attached to
    */
  var events: js.UndefOr[Record[String, js.Function]] = js.undefined
  
  /**
    * A factory function that will be called to create an object for each item in the aggregation; this is
    * an alternative to providing a template object and can be used when the objects should differ depending
    * on the binding context; the factory function will be called with two parameters: an ID that should be
    * used for the created object and the binding context for which the object has to be created; the function
    * must return an object appropriate for the bound aggregation
    */
  var factory: js.UndefOr[
    js.Function2[
      /* p1 */ String, 
      /* p2 */ typings.openui5.sapUiModelContextMod.default, 
      ManagedObject
    ]
  ] = js.undefined
  
  /**
    * The predefined filters for this aggregation (optional)
    */
  var filters: js.UndefOr[
    typings.openui5.sapUiModelFilterMod.default | js.Array[typings.openui5.sapUiModelFilterMod.default]
  ] = js.undefined
  
  /**
    * A factory function to generate custom group visualization (optional). It should return a control suitable
    * to visualize a group header (e.g. a `sap.m.GroupHeaderListItem` for a `sap.m.List`).
    */
  var groupHeaderFactory: js.UndefOr[js.Function1[/* p1 */ Key, ManagedObject]] = js.undefined
  
  /**
    * Name of the key property or a function getting the context as only parameter to calculate a key for entries.
    * This can be used to improve update behaviour in models, where a key is not already available.
    */
  var key: js.UndefOr[
    String | (js.Function1[/* p1 */ typings.openui5.sapUiModelContextMod.default, String])
  ] = js.undefined
  
  /**
    * The amount of entries to be created (may exceed the size limit of the model)
    */
  var length: js.UndefOr[int] = js.undefined
  
  /**
    * Name of the model to bind against; when `undefined` or omitted, the default model is used
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Map of additional parameters for this binding; the names and value ranges of the supported parameters
    * depend on the model implementation, they should be documented with the `bindList` method of the corresponding
    * model class or with the model specific subclass of `sap.ui.model.ListBinding`
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Path in the model to bind to, either an absolute path or relative to the binding context for the corresponding
    * model; when the path contains a '>' sign, the string preceding it will override the `model` property
    * and the remainder after the '>' will be used as binding path
    */
  var path: String
  
  /**
    * The initial sort order (optional)
    */
  var sorter: js.UndefOr[
    typings.openui5.sapUiModelSorterMod.default | js.Array[typings.openui5.sapUiModelSorterMod.default]
  ] = js.undefined
  
  /**
    * the first entry of the list to be created
    */
  var startIndex: js.UndefOr[int] = js.undefined
  
  /**
    * Whether the binding should be suspended initially
    */
  var suspended: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The template to clone for each item in the aggregation; either a template or a factory must be given
    */
  var template: js.UndefOr[ManagedObject] = js.undefined
  
  /**
    * Whether the framework should assume that the application takes care of the lifecycle of the given template;
    * when set to `true`, the template can be used in multiple bindings, either in parallel or over time, and
    * the framework won't clone it when this `ManagedObject` is cloned; when set to `false`, the lifecycle
    * of the template is bound to the lifecycle of the binding, when the aggregation is unbound or when this
    * `ManagedObject` is destroyed, the template also will be destroyed, and when this `ManagedObject` is cloned,
    * the template will be cloned as well; the third option (`undefined`) only exists for compatibility reasons,
    * its behavior is not fully reliable and it may leak the template
    */
  var templateShareable: js.UndefOr[Boolean] = js.undefined
}
object AggregationBindingInfo {
  
  inline def apply(path: String): AggregationBindingInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationBindingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationBindingInfo] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Record[String, js.Function]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFactory(value: (/* p1 */ String, /* p2 */ typings.openui5.sapUiModelContextMod.default) => ManagedObject): Self = StObject.set(x, "factory", js.Any.fromFunction2(value))
    
    inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
    inline def setFilters(
      value: typings.openui5.sapUiModelFilterMod.default | js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: typings.openui5.sapUiModelFilterMod.default*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setGroupHeaderFactory(value: /* p1 */ Key => ManagedObject): Self = StObject.set(x, "groupHeaderFactory", js.Any.fromFunction1(value))
    
    inline def setGroupHeaderFactoryUndefined: Self = StObject.set(x, "groupHeaderFactory", js.undefined)
    
    inline def setKey(value: String | (js.Function1[/* p1 */ typings.openui5.sapUiModelContextMod.default, String])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyFunction1(value: /* p1 */ typings.openui5.sapUiModelContextMod.default => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLength(value: int): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSorter(
      value: typings.openui5.sapUiModelSorterMod.default | js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
    
    inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    inline def setSorterVarargs(value: typings.openui5.sapUiModelSorterMod.default*): Self = StObject.set(x, "sorter", js.Array(value*))
    
    inline def setStartIndex(value: int): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    inline def setTemplate(value: ManagedObject): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateShareable(value: Boolean): Self = StObject.set(x, "templateShareable", value.asInstanceOf[js.Any])
    
    inline def setTemplateShareableUndefined: Self = StObject.set(x, "templateShareable", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
