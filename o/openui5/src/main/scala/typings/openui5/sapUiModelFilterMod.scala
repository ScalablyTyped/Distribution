package typings.openui5

import typings.openui5.anon.And
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelFilterOperatorMod.FilterOperator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelFilterMod {
  
  @JSImport("sap/ui/model/Filter", JSImport.Default)
  @js.native
  open class default protected () extends Filter {
    def this(/**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String) = this()
    def this(/**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter]) = this()
    /**
      * Constructor for Filter.
      *
      * You either pass a single object literal with the filter parameters or use the individual constructor
      * arguments. No matter which variant is used, only certain combinations of parameters are supported (the
      * following list uses the names from the object literal):
      * 	A `path`, `operator` and one or two values (`value1`, `value2`), depending on the operator A `path`
      * and a custom filter function `test` An array of other filters named `filters` and a Boolean flag
      * `and` that specifies whether to combine the filters with an AND (`true`) or an OR (`false`) operator.
      *  An error will be logged to the console if an invalid combination of parameters is provided.
      *
      * Please note that a model implementation may not support a custom filter function, e.g. if the model does
      * not perform client-side filtering. It also depends on the model implementation if the filtering is case
      * sensitive or not. Client models filter case insensitive compared to the OData models which filter case
      * sensitive by default. See particular model documentation for details.
      *
      * The filter operators {@link sap.ui.model.FilterOperator.Any "Any"} and {@link sap.ui.model.FilterOperator.All
      * "All"} are only supported in V4 OData models. When creating a filter instance with these filter operators,
      * the argument `variable` only accepts a string identifier and `condition` needs to be another filter instance.
      */
    def this(/**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean]
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean]
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean]
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: String,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: js.Array[Filter],
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: js.Function1[/* p1 */ Any, Boolean],
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: Unit,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Any,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
    def this(
      /**
      * Filter info object or a path or an array of filters
      */
    vFilterInfo: And,
      /**
      * Either a filter operator or a custom filter function or a `boolean` flag that defines how to combine
      * multiple filters
      */
    vOperator: FilterOperator,
      /**
      * First value to use with the given filter operator
      */
    vValue1: Unit,
      /**
      * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
      * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
      */
    vValue2: Any
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/Filter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compares two values
      *
      * This is the default comparator function used for client-side filtering, if no custom comparator is given
      * in the constructor. It does compare just by using equal/less than/greater than with automatic type casting,
      * except for null values, which are neither less or greater, and string values where localeCompare is used.
      *
      * The comparator method returns -1, 0, 1 for comparable values and NaN for non-comparable values.
      *
      * @returns -1, 0, 1 or NaN depending on the compare result
      */
    inline def defaultComparator(/**
      * the first value to compare
      */
    a: Any, /**
      * the second value to compare
      */
    b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultComparator")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Creates a new subclass of class sap.ui.model.Filter with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Filter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Filter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.Filter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Filter
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the comparator function as provided on construction of this filter, see {@link sap.ui.model.Filter#constructor},
      * parameter `vFilterInfo.comparator`.
      *
      * @returns The comparator function
      */
    def getComparator(): js.Function1[/* p1 */ Any, js.UndefOr[Boolean]] = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the filter instance which is used as the condition for lambda operators, see {@link sap.ui.model.Filter#constructor},
      * parameter `vFilterInfo.condition`.
      *
      * @returns The filter instance
      */
    def getCondition(): js.UndefOr[Filter] = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the array of filters as specified on construction of this filter, see {@link sap.ui.model.Filter#constructor},
      * parameter `vFilterInfo.filters`
      *
      * @returns The array of filters
      */
    def getFilters(): js.UndefOr[js.Array[Filter]] = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the filter operator used for this filter, see {@link sap.ui.model.Filter#constructor}, parameter
      * `vFilterInfo.operator` or `vOperator`.
      *
      * @returns The operator
      */
    def getOperator(): js.UndefOr[
        FilterOperator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String)
      ] = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the binding path for this filter, see {@link sap.ui.model.Filter#constructor}, parameter `vFilterInfo`
      * or `vFilterInfo.path`.
      *
      * @returns The binding path
      */
    def getPath(): js.UndefOr[String] = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the test function which is used to filter the items, see {@link sap.ui.model.Filter#constructor},
      * parameter `vFilterInfo.test`.
      *
      * @returns The test function
      */
    def getTest(): js.Function2[/* p1 */ Any, /* p2 */ Any, js.UndefOr[Boolean]] = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the first value that is used with the given filter operator, see {@link sap.ui.model.Filter#constructor},
      * parameter `vFilterInfo.value1` or `vValue1`.
      *
      * @returns The first value
      */
    def getValue1(): Any = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the second value that is used with the given filter operator, see {@link sap.ui.model.Filter#constructor},
      * parameter `vFilterInfo.value2` or `vValue2`.
      *
      * @returns The second value
      */
    def getValue2(): Any = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Returns the variable name used in lambda operators, see {@link sap.ui.model.Filter#constructor}, parameter
      * `vFilterInfo.variable`.
      *
      * @returns The variable name
      */
    def getVariable(): js.UndefOr[String] = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Indicates whether an "AND" logical conjunction is applied on the filters, see {@link sap.ui.model.Filter#constructor},
      * parameter `vFilterInfo.and`.
      *
      * @returns Whether "AND" is being applied
      */
    def isAnd(): Boolean = js.native
    
    /**
      * @SINCE 1.96.0
      *
      * Indicates whether a string value should be compared case sensitive, see {@link sap.ui.model.Filter#constructor},
      * parameter `vFilterInfo.caseSensitive`.
      *
      * @returns Whether the string values should be compared case sensitive
      */
    def isCaseSensitive(): Boolean = js.native
  }
}
