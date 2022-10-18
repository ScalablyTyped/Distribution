package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelSorterMod {
  
  @JSImport("sap/ui/model/Sorter", JSImport.Default)
  @js.native
  open class default protected () extends Sorter {
    /**
      * Constructor for Sorter.
      */
    def this(/**
      * the binding path used for sorting
      */
    sPath: String) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Boolean
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Boolean,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: js.Function
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Boolean,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: Boolean
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Unit,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: js.Function
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Unit,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: Boolean
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Boolean,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: js.Function,
      /**
      * A custom comparator function, which is used for client-side sorting instead of the default comparator
      * method. Information about parameters and expected return values of such a method can be found in the
      * {@link #.defaultComparator default comparator} documentation. **Note:** Custom comparator functions are
      * meant to be used on the client. Models that implement sorting in the backend usually don't support custom
      * comparator functions. Consult the documentation of the specific model implementation.
      */
    fnComparator: js.Function
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Boolean,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: Boolean,
      /**
      * A custom comparator function, which is used for client-side sorting instead of the default comparator
      * method. Information about parameters and expected return values of such a method can be found in the
      * {@link #.defaultComparator default comparator} documentation. **Note:** Custom comparator functions are
      * meant to be used on the client. Models that implement sorting in the backend usually don't support custom
      * comparator functions. Consult the documentation of the specific model implementation.
      */
    fnComparator: js.Function
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Boolean,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: Unit,
      /**
      * A custom comparator function, which is used for client-side sorting instead of the default comparator
      * method. Information about parameters and expected return values of such a method can be found in the
      * {@link #.defaultComparator default comparator} documentation. **Note:** Custom comparator functions are
      * meant to be used on the client. Models that implement sorting in the backend usually don't support custom
      * comparator functions. Consult the documentation of the specific model implementation.
      */
    fnComparator: js.Function
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Unit,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: js.Function,
      /**
      * A custom comparator function, which is used for client-side sorting instead of the default comparator
      * method. Information about parameters and expected return values of such a method can be found in the
      * {@link #.defaultComparator default comparator} documentation. **Note:** Custom comparator functions are
      * meant to be used on the client. Models that implement sorting in the backend usually don't support custom
      * comparator functions. Consult the documentation of the specific model implementation.
      */
    fnComparator: js.Function
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Unit,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: Boolean,
      /**
      * A custom comparator function, which is used for client-side sorting instead of the default comparator
      * method. Information about parameters and expected return values of such a method can be found in the
      * {@link #.defaultComparator default comparator} documentation. **Note:** Custom comparator functions are
      * meant to be used on the client. Models that implement sorting in the backend usually don't support custom
      * comparator functions. Consult the documentation of the specific model implementation.
      */
    fnComparator: js.Function
    ) = this()
    def this(
      /**
      * the binding path used for sorting
      */
    sPath: String,
      /**
      * whether the sort order should be descending
      */
    bDescending: Unit,
      /**
      * configure grouping of the content, can either be true to enable grouping based on the raw model property
      * value, or a function which calculates the group value out of the context (e.g. oContext.getProperty("date").getYear()
      * for year grouping). The control needs to implement the grouping behaviour for the aggregation which you
      * want to group. In case a function is provided it must either return a primitive type value as the group
      * key or an object containing a "key" property and additional properties needed for group visualization.
      * This object or the object with the primitive type return value as "key" property is passed to the `groupHeaderFactory`
      * function that has been specified to create the group header for the control aggregation; see {@link sap.ui.base.ManagedObject#bindAggregation}.
      * **Note:** Grouping via `vGroup=true` is only possible (and only makes sense) for the primary sort property.
      * A more complicated grouping is possible by providing a grouping function. The sort order needs to fit
      * to the grouping also in this case. See also {@link topic:ec79a5d5918f4f7f9cbc2150e66778cc Sorting, Grouping,
      * and Filtering for List Binding}.
      */
    vGroup: Unit,
      /**
      * A custom comparator function, which is used for client-side sorting instead of the default comparator
      * method. Information about parameters and expected return values of such a method can be found in the
      * {@link #.defaultComparator default comparator} documentation. **Note:** Custom comparator functions are
      * meant to be used on the client. Models that implement sorting in the backend usually don't support custom
      * comparator functions. Consult the documentation of the specific model implementation.
      */
    fnComparator: js.Function
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/Sorter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compares two values
      *
      * This is the default comparator function used for clientside sorting, if no custom comparator is given
      * in the constructor. It does compare just by using equal/less than/greater than with automatic type casting,
      * except for null values, which are last in ascending order, and string values where localeCompare is used.
      *
      * The comparator method returns -1, 0 or 1, depending on the order of the two items and is suitable to
      * be used as a comparator method for Array.sort.
      *
      * @returns -1, 0 or 1 depending on the compare result
      */
    inline def defaultComparator(/**
      * the first value to compare
      */
    a: Any, /**
      * the second value to compare
      */
    b: Any): int = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultComparator")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[int]
    
    /**
      * Creates a new subclass of class sap.ui.model.Sorter with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Sorter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Sorter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.Sorter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Sorter
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Returns a group object, at least containing a "key" property for group detection. May contain additional
      * properties as provided by a custom group function.
      *
      * @returns An object containing a key property and optional custom properties
      */
    def getGroup(/**
      * the binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default): Record[String, Any] = js.native
    
    /**
      * Returns the group function of this Sorter. If grouping is not enabled on this Sorter, it will return
      * undefined, if no explicit group function has been defined the default group function is returned. The
      * returned function is bound to its Sorter, so it will group according to its own property path, even if
      * it is used in the context of another Sorter.
      *
      * @returns The group function
      */
    def getGroupFunction(): js.Function = js.native
  }
}
