package typings
package openui5Lib.sapNs.uiNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.Filter")
@js.native
class Filter protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter]) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: openui5Lib.Anon_StartsWith) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: scala.Boolean) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: openui5Lib.Anon_StartsWith) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: scala.Boolean) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: openui5Lib.Anon_StartsWith) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: scala.Boolean) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: js.Any, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: openui5Lib.Anon_StartsWith, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: scala.Boolean, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: js.Any, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: openui5Lib.Anon_StartsWith, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: scala.Boolean, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: js.Any, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: openui5Lib.Anon_StartsWith, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: scala.Boolean, oValue1: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: js.Any, oValue1: js.Any, oValue2: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: openui5Lib.Anon_StartsWith, oValue1: js.Any, oValue2: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: java.lang.String, vOperator: scala.Boolean, oValue1: js.Any, oValue2: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: js.Any, oValue1: js.Any, oValue2: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: openui5Lib.Anon_StartsWith, oValue1: js.Any, oValue2: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Any, vOperator: scala.Boolean, oValue1: js.Any, oValue2: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: js.Any, oValue1: js.Any, oValue2: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: openui5Lib.Anon_StartsWith, oValue1: js.Any, oValue2: js.Any) = this()
  /**
           * Constructor for Filter.You either pass a single object literal with the filter parameters or use the
           * individual constructor arguments.No matter which variant is used, only certain combinations of
           * parameters are supported(the following list uses the names from the object literal):<ul><li>A
           * <code>path</code>, <code>operator</code> and one or two values (<code>value1</code>,
           * <code>value2</code>), depending on the operator</li><li>A <code>path</code> and a custom filter
           * function <code>test</code></li><li>An array of other filters named <code>filters</code> and a
           * Boolean flag <code>and</code> that specifies whether to combine    the filters with an AND
           * (<code>true</code>) or an OR (<code>false</code>) operator.</li></ul>An error will be logged to the
           * console if an invalid combination of parameters is provided.Please note that a model implementation
           * may not support a custom filter function, e.g. if the model does not perform client side
           * filtering.It also depends on the model implementation if the filtering is case sensitive or not.See
           * particular model documentation for details.
           * @param vFilterInfo Filter info object or a path or an array of filters
           * @param vOperator Either a filter operator or a custom filter function or a Boolean flag that defines
           * how to combine multiple filters
           * @param oValue1 First value to use with the given filter operator
           * @param oValue2 Second value to use with the given filter operator (only for some operators)
          */
  def this(vFilterInfo: js.Array[Filter], vOperator: scala.Boolean, oValue1: js.Any, oValue2: js.Any) = this()
}

