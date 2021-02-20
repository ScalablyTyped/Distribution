package typings.ngTable

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IAngularEvent
import typings.angular.mod.IAttributes
import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import typings.angular.mod.IScope
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicInterfacesMod {
  
  /* Inlined angular.angular.IScope & {  $column :ng-table.ng-table/src/browser/public-interfaces.IColumnDef | undefined,   $columns :std.Array<ng-table.ng-table/src/browser/public-interfaces.IColumnDef>} */
  @js.native
  trait ColumnFieldContext extends StObject {
    
    @JSName("$apply")
    def $apply(): js.Any = js.native
    @JSName("$apply")
    def $apply(exp: String): js.Any = js.native
    @JSName("$apply")
    def $apply(exp: js.Function1[/* scope */ IScope, _]): js.Any = js.native
    
    @JSName("$applyAsync")
    def $applyAsync(): js.Any = js.native
    @JSName("$applyAsync")
    def $applyAsync(exp: String): js.Any = js.native
    @JSName("$applyAsync")
    def $applyAsync(exp: js.Function1[/* scope */ IScope, _]): js.Any = js.native
    
    /**
      * Dispatches an event name downwards to all child scopes (and their children) notifying the registered $rootScope.Scope listeners.
      *
      * The event life cycle starts at the scope on which $broadcast was called. All listeners listening for name event on this scope get notified. Afterwards, the event propagates to all direct and indirect scopes of the current scope and calls all registered listeners along the way. The event cannot be canceled.
      *
      * Any exception emitted from the listeners will be passed onto the $exceptionHandler service.
      *
      * @param name Event name to broadcast.
      * @param args Optional one or more arguments which will be passed onto the event listeners.
      */
    @JSName("$broadcast")
    def $broadcast(name: String, args: js.Any*): IAngularEvent = js.native
    
    @JSName("$column")
    var $column: js.UndefOr[IColumnDef] = js.native
    
    @JSName("$columns")
    var $columns: js.Array[IColumnDef] = js.native
    
    @JSName("$destroy")
    def $destroy(): Unit = js.native
    
    @JSName("$digest")
    def $digest(): Unit = js.native
    
    /**
      * Dispatches an event name upwards through the scope hierarchy notifying the registered $rootScope.Scope listeners.
      *
      * The event life cycle starts at the scope on which $emit was called. All listeners listening for name event on this scope get notified. Afterwards, the event traverses upwards toward the root scope and calls all registered listeners along the way. The event will stop propagating if one of the listeners cancels it.
      *
      * Any exception emitted from the listeners will be passed onto the $exceptionHandler service.
      *
      * @param name Event name to emit.
      * @param args Optional one or more arguments which will be passed onto the event listeners.
      */
    @JSName("$emit")
    def $emit(name: String, args: js.Any*): IAngularEvent = js.native
    
    @JSName("$eval")
    def $eval(): js.Any = js.native
    @JSName("$eval")
    def $eval(expression: String): js.Any = js.native
    @JSName("$eval")
    def $eval(expression: String, locals: js.Object): js.Any = js.native
    @JSName("$eval")
    def $eval(expression: js.Function1[/* scope */ IScope, _]): js.Any = js.native
    @JSName("$eval")
    def $eval(expression: js.Function1[/* scope */ IScope, _], locals: js.Object): js.Any = js.native
    
    @JSName("$evalAsync")
    def $evalAsync(): Unit = js.native
    @JSName("$evalAsync")
    def $evalAsync(expression: String): Unit = js.native
    @JSName("$evalAsync")
    def $evalAsync(expression: String, locals: js.Object): Unit = js.native
    @JSName("$evalAsync")
    def $evalAsync(expression: js.Function1[/* scope */ IScope, Unit]): Unit = js.native
    @JSName("$evalAsync")
    def $evalAsync(expression: js.Function1[/* scope */ IScope, Unit], locals: js.Object): Unit = js.native
    
    @JSName("$id")
    var $id: Double = js.native
    
    /**
      * Call this method to determine if this scope has been explicitly suspended. It will not
      * tell you whether an ancestor has been suspended.
      * To determine if this scope will be excluded from a digest triggered at the $rootScope,
      * for example, you must check all its ancestors:
      *
      * ```
      * function isExcludedFromDigest(scope) {
      *   while(scope) {
      *     if (scope.$isSuspended()) return true;
      *     scope = scope.$parent;
      *   }
      *   return false;
      * ```
      *
      * Be aware that a scope may not be included in digests if it has a suspended ancestor,
      * even if `$isSuspended()` returns false.
      *
      * @returns true if the current scope has been suspended.
      */
    @JSName("$isSuspended")
    def $isSuspended(): Boolean = js.native
    
    // Defaults to false by the implementation checking strategy
    @JSName("$new")
    def $new(): IScope = js.native
    @JSName("$new")
    def $new(isolate: js.UndefOr[scala.Nothing], parent: IScope): IScope = js.native
    @JSName("$new")
    def $new(isolate: Boolean): IScope = js.native
    @JSName("$new")
    def $new(isolate: Boolean, parent: IScope): IScope = js.native
    
    /**
      * Listens on events of a given type. See $emit for discussion of event life cycle.
      *
      * The event listener function format is: function(event, args...).
      *
      * @param name Event name to listen on.
      * @param listener Function to call when the event is emitted.
      */
    @JSName("$on")
    def $on(name: String, listener: js.Function2[/* event */ IAngularEvent, /* repeated */ js.Any, _]): js.Function0[Unit] = js.native
    
    @JSName("$parent")
    var $parent: IScope = js.native
    
    /**
      * Resume watchers of this scope subtree in case it was suspended.
      *
      * See {$rootScope.Scope#$suspend} for information about the dangers of using this approach.
      */
    @JSName("$resume")
    def $resume(): Unit = js.native
    
    @JSName("$root")
    var $root: IRootScopeService = js.native
    
    /**
      * Suspend watchers of this scope subtree so that they will not be invoked during digest.
      *
      * This can be used to optimize your application when you know that running those watchers
      * is redundant.
      *
      * **Warning**
      *
      * Suspending scopes from the digest cycle can have unwanted and difficult to debug results.
      * Only use this approach if you are confident that you know what you are doing and have
      * ample tests to ensure that bindings get updated as you expect.
      *
      * Some of the things to consider are:
      *
      * * Any external event on a directive/component will not trigger a digest while the hosting
      *   scope is suspended - even if the event handler calls `$apply()` or `$rootScope.$digest()`.
      * * Transcluded content exists on a scope that inherits from outside a directive but exists
      *   as a child of the directive's containing scope. If the containing scope is suspended the
      *   transcluded scope will also be suspended, even if the scope from which the transcluded
      *   scope inherits is not suspended.
      * * Multiple directives trying to manage the suspended status of a scope can confuse each other:
      *    * A call to `$suspend()` on an already suspended scope is a no-op.
      *    * A call to `$resume()` on a non-suspended scope is a no-op.
      *    * If two directives suspend a scope, then one of them resumes the scope, the scope will no
      *      longer be suspended. This could result in the other directive believing a scope to be
      *      suspended when it is not.
      * * If a parent scope is suspended then all its descendants will be also excluded from future
      *   digests whether or not they have been suspended themselves. Note that this also applies to
      *   isolate child scopes.
      * * Calling `$digest()` directly on a descendant of a suspended scope will still run the watchers
      *   for that scope and its descendants. When digesting we only check whether the current scope is
      *   locally suspended, rather than checking whether it has a suspended ancestor.
      * * Calling `$resume()` on a scope that has a suspended ancestor will not cause the scope to be
      *   included in future digests until all its ancestors have been resumed.
      * * Resolved promises, e.g. from explicit `$q` deferreds and `$http` calls, trigger `$apply()`
      *   against the `$rootScope` and so will still trigger a global digest even if the promise was
      *   initiated by a component that lives on a suspended scope.
      */
    @JSName("$suspend")
    def $suspend(): Unit = js.native
    
    @JSName("$watch")
    def $watch(watchExpression: String): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch(watchExpression: String, listener: js.UndefOr[scala.Nothing], objectEquality: Boolean): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch(watchExpression: String, listener: String): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch(watchExpression: String, listener: String, objectEquality: Boolean): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch(watchExpression: js.Function1[/* scope */ IScope, _]): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch(
      watchExpression: js.Function1[/* scope */ IScope, _],
      listener: js.UndefOr[scala.Nothing],
      objectEquality: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch(watchExpression: js.Function1[/* scope */ IScope, _], listener: String): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch(watchExpression: js.Function1[/* scope */ IScope, _], listener: String, objectEquality: Boolean): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch[T](
      watchExpression: String,
      listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _]
    ): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch[T](
      watchExpression: String,
      listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _],
      objectEquality: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch[T](
      watchExpression: js.Function1[/* scope */ IScope, T],
      listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _]
    ): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch[T](
      watchExpression: js.Function1[/* scope */ IScope, T],
      listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _],
      objectEquality: Boolean
    ): js.Function0[Unit] = js.native
    
    @JSName("$watchCollection")
    def $watchCollection[T](
      watchExpression: String,
      listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _]
    ): js.Function0[Unit] = js.native
    @JSName("$watchCollection")
    def $watchCollection[T](
      watchExpression: js.Function1[/* scope */ IScope, T],
      listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _]
    ): js.Function0[Unit] = js.native
    
    @JSName("$watchGroup")
    def $watchGroup(
      watchExpressions: js.Array[_ | (js.Function1[/* scope */ IScope, _])],
      listener: js.Function3[/* newValue */ js.Any, /* oldValue */ js.Any, /* scope */ IScope, _]
    ): js.Function0[Unit] = js.native
    
    @JSName("$watch")
    def $watch_T[T](watchExpression: String): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch_T[T](watchExpression: String, listener: js.UndefOr[scala.Nothing], objectEquality: Boolean): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch_T[T](watchExpression: js.Function1[/* scope */ IScope, T]): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch_T[T](
      watchExpression: js.Function1[/* scope */ IScope, T],
      listener: js.UndefOr[scala.Nothing],
      objectEquality: Boolean
    ): js.Function0[Unit] = js.native
    
    // Hidden members
    @JSName("$$isolateBindings")
    var DollarDollarisolateBindings: js.Any = js.native
    
    @JSName("$$phase")
    var DollarDollarphase: js.Any = js.native
  }
  
  type DynamicTableColField[T] = IDynamicTableColFieldFunc[T] | T
  
  @js.native
  trait IColumnDef extends StObject {
    
    /**
      * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
      *
      * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
      */
    def `class`(): String = js.native
    def `class`(context: ColumnFieldContext): String = js.native
    /**
      * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
      *
      * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
      */
    def `class`(value: String): Unit = js.native
    /**
      * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
      *
      * To set this on the `td` tag of a html table use the attribute `header-class` or `data-header-class`
      */
    @JSName("class")
    var class_Original: IColumnField[String] = js.native
    
    /**
      * The `ISelectOption`s that can be used in a html filter template for this colums.
      */
    var data: js.UndefOr[SelectData] = js.native
    
    /**
      * The definition of 0 or more html filter templates that should be rendered for this column in
      * the table header
      */
    def filter(): IFilterTemplateDefMap = js.native
    def filter(context: ColumnFieldContext): IFilterTemplateDefMap = js.native
    /**
      * The definition of 0 or more html filter templates that should be rendered for this column in
      * the table header
      */
    def filter(value: IFilterTemplateDefMap): Unit = js.native
    
    /**
      * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
      * At the creation of the `NgTableParams` this field will be called and the result then assigned
      * to the `data` field of this column.
      */
    def filterData(): IPromise[SelectData] | SelectData = js.native
    def filterData(context: ColumnFieldContext): IPromise[SelectData] | SelectData = js.native
    /**
      * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
      * At the creation of the `NgTableParams` this field will be called and the result then assigned
      * to the `data` field of this column.
      */
    def filterData(value: IPromise[SelectData]): Unit = js.native
    def filterData(value: SelectData): Unit = js.native
    /**
      * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
      * At the creation of the `NgTableParams` this field will be called and the result then assigned
      * to the `data` field of this column.
      */
    @JSName("filterData")
    var filterData_Original: IColumnField[IPromise[SelectData] | SelectData] = js.native
    
    /**
      * The definition of 0 or more html filter templates that should be rendered for this column in
      * the table header
      */
    @JSName("filter")
    var filter_Original: IColumnField[IFilterTemplateDefMap] = js.native
    
    /**
      * The name of the data row field that will be used to group on, or false when this column
      * does not support grouping
      */
    def groupable(): String | Boolean = js.native
    def groupable(context: ColumnFieldContext): String | Boolean = js.native
    /**
      * The name of the data row field that will be used to group on, or false when this column
      * does not support grouping
      */
    def groupable(value: String): Unit = js.native
    def groupable(value: Boolean): Unit = js.native
    /**
      * The name of the data row field that will be used to group on, or false when this column
      * does not support grouping
      */
    @JSName("groupable")
    var groupable_Original: IColumnField[String | Boolean] = js.native
    
    /**
      * The url of a custom html template that should be used to render a table header for this column
      *
      * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
      */
    def headerTemplateURL(): String | Boolean = js.native
    def headerTemplateURL(context: ColumnFieldContext): String | Boolean = js.native
    /**
      * The url of a custom html template that should be used to render a table header for this column
      *
      * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
      */
    def headerTemplateURL(value: String): Unit = js.native
    def headerTemplateURL(value: Boolean): Unit = js.native
    /**
      * The url of a custom html template that should be used to render a table header for this column
      *
      * To set this on the `td` tag for a html table use the attribute `header` or `data-header`
      */
    @JSName("headerTemplateURL")
    var headerTemplateURL_Original: IColumnField[String | Boolean] = js.native
    
    /**
      * The text that should be used as a tooltip for this column in the table header
      */
    def headerTitle(): String = js.native
    def headerTitle(context: ColumnFieldContext): String = js.native
    /**
      * The text that should be used as a tooltip for this column in the table header
      */
    def headerTitle(value: String): Unit = js.native
    /**
      * The text that should be used as a tooltip for this column in the table header
      */
    @JSName("headerTitle")
    var headerTitle_Original: IColumnField[String] = js.native
    
    /**
      * The index position of this column within the `$columns` container array
      */
    var id: Double = js.native
    
    /**
      * Determines whether this column should be displayed in the table
      *
      * To set this on the `td` tag for a html table use the attribute `ng-if`
      */
    def show(): Boolean = js.native
    def show(context: ColumnFieldContext): Boolean = js.native
    /**
      * Determines whether this column should be displayed in the table
      *
      * To set this on the `td` tag for a html table use the attribute `ng-if`
      */
    def show(value: Boolean): Unit = js.native
    /**
      * Determines whether this column should be displayed in the table
      *
      * To set this on the `td` tag for a html table use the attribute `ng-if`
      */
    @JSName("show")
    var show_Original: IColumnField[Boolean] = js.native
    
    /**
      * The name of the data row field that will be used to sort on, or false when this column
      * does not support sorting
      */
    def sortable(): String | Boolean = js.native
    def sortable(context: ColumnFieldContext): String | Boolean = js.native
    /**
      * The name of the data row field that will be used to sort on, or false when this column
      * does not support sorting
      */
    def sortable(value: String): Unit = js.native
    def sortable(value: Boolean): Unit = js.native
    /**
      * The name of the data row field that will be used to sort on, or false when this column
      * does not support sorting
      */
    @JSName("sortable")
    var sortable_Original: IColumnField[String | Boolean] = js.native
    
    /**
      * The title of this column that should be displayed in the table header
      */
    def title(): String = js.native
    def title(context: ColumnFieldContext): String = js.native
    /**
      * The title of this column that should be displayed in the table header
      */
    def title(value: String): Unit = js.native
    
    /**
      * An alternate column title. Typically this can be used for responsive table layouts
      * where the titleAlt should be used for small screen sizes
      */
    def titleAlt(): String = js.native
    def titleAlt(context: ColumnFieldContext): String = js.native
    /**
      * An alternate column title. Typically this can be used for responsive table layouts
      * where the titleAlt should be used for small screen sizes
      */
    def titleAlt(value: String): Unit = js.native
    /**
      * An alternate column title. Typically this can be used for responsive table layouts
      * where the titleAlt should be used for small screen sizes
      */
    @JSName("titleAlt")
    var titleAlt_Original: IColumnField[String] = js.native
    
    /**
      * The title of this column that should be displayed in the table header
      */
    @JSName("title")
    var title_Original: IColumnField[String] = js.native
  }
  
  @js.native
  trait IColumnField[T] extends StObject {
    
    def apply(): T = js.native
    def apply(context: ColumnFieldContext): T = js.native
    def apply(value: T): Unit = js.native
    
    def assign($scope: IScope, value: T): Unit = js.native
  }
  
  @js.native
  trait IDynamicTableColDef extends StObject {
    
    /**
      * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
      */
    var `class`: js.UndefOr[DynamicTableColField[String]] = js.native
    
    /**
      * The definition of 0 or more html filter templates that should be rendered for this column in
      * the table header
      */
    var filter: js.UndefOr[DynamicTableColField[IFilterTemplateDefMap]] = js.native
    
    /**
      * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
      * At the creation of the `NgTableParams` this field will be called and the result then assigned
      * to the `data` field of this column.
      */
    var filterData: js.UndefOr[DynamicTableColField[IPromise[SelectData] | SelectData]] = js.native
    
    /**
      * The name of the data row field that will be used to group on, or false when this column
      * does not support grouping
      */
    var groupable: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
    
    /**
      * The url of a custom html template that should be used to render a table header for this column
      */
    var headerTemplateURL: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
    
    /**
      * The text that should be used as a tooltip for this column in the table header
      */
    var headerTitle: js.UndefOr[DynamicTableColField[String]] = js.native
    
    /**
      * Determines whether this column should be displayed in the table
      */
    var show: js.UndefOr[DynamicTableColField[Boolean]] = js.native
    
    /**
      * The name of the data row field that will be used to sort on, or false when this column
      * does not support sorting
      */
    var sortable: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
    
    /**
      * The title of this column that should be displayed in the table header
      */
    var title: js.UndefOr[DynamicTableColField[String]] = js.native
    
    /**
      * An alternate column title. Typically this can be used for responsive table layouts
      * where the titleAlt should be used for small screen sizes
      */
    var titleAlt: js.UndefOr[DynamicTableColField[String]] = js.native
  }
  object IDynamicTableColDef {
    
    @scala.inline
    def apply(): IDynamicTableColDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDynamicTableColDef]
    }
    
    @scala.inline
    implicit class IDynamicTableColDefMutableBuilder[Self <: IDynamicTableColDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: DynamicTableColField[String]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassFunction1(value: /* context */ ColumnFieldContext => String): Self = StObject.set(x, "class", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setFilter(value: DynamicTableColField[IFilterTemplateDefMap]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterData(value: DynamicTableColField[IPromise[SelectData] | SelectData]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDataFunction0(value: () => js.Array[ISelectOption] | IPromise[js.Array[ISelectOption]]): Self = StObject.set(x, "filterData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFilterDataFunction1(value: /* context */ ColumnFieldContext => IPromise[SelectData] | SelectData): Self = StObject.set(x, "filterData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterDataUndefined: Self = StObject.set(x, "filterData", js.undefined)
      
      @scala.inline
      def setFilterDataVarargs(value: ISelectOption*): Self = StObject.set(x, "filterData", js.Array(value :_*))
      
      @scala.inline
      def setFilterFunction1(value: /* context */ ColumnFieldContext => IFilterTemplateDefMap): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGroupable(value: DynamicTableColField[String | Boolean]): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupableFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = StObject.set(x, "groupable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
      
      @scala.inline
      def setHeaderTemplateURL(value: DynamicTableColField[String | Boolean]): Self = StObject.set(x, "headerTemplateURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateURLFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = StObject.set(x, "headerTemplateURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderTemplateURLUndefined: Self = StObject.set(x, "headerTemplateURL", js.undefined)
      
      @scala.inline
      def setHeaderTitle(value: DynamicTableColField[String]): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTitleFunction1(value: /* context */ ColumnFieldContext => String): Self = StObject.set(x, "headerTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      @scala.inline
      def setShow(value: DynamicTableColField[Boolean]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFunction1(value: /* context */ ColumnFieldContext => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSortable(value: DynamicTableColField[String | Boolean]): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = StObject.set(x, "sortable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setTitle(value: DynamicTableColField[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlt(value: DynamicTableColField[String]): Self = StObject.set(x, "titleAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAltFunction1(value: /* context */ ColumnFieldContext => String): Self = StObject.set(x, "titleAlt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleAltUndefined: Self = StObject.set(x, "titleAlt", js.undefined)
      
      @scala.inline
      def setTitleFunction1(value: /* context */ ColumnFieldContext => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type IDynamicTableColFieldFunc[T] = js.Function1[/* context */ ColumnFieldContext, T]
  
  @js.native
  trait IFilterConfigValues extends StObject {
    
    /**
      * A map of alias names and their corrosponding urls. A lookup against this map will be used
      * to find the url matching an alias name.
      * If no match is found then a url will be derived using the following pattern `${defaultBaseUrl}${aliasName}.${defaultExt}`
      */
    var aliasUrls: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The default base url to use when deriving the url for a filter template given just an alias name
      * Defaults to 'ng-table/filters/'
      */
    var defaultBaseUrl: js.UndefOr[String] = js.native
    
    /**
      * The extension to use when deriving the url of a filter template when given just an alias name
      */
    var defaultExt: js.UndefOr[String] = js.native
  }
  object IFilterConfigValues {
    
    @scala.inline
    def apply(): IFilterConfigValues = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilterConfigValues]
    }
    
    @scala.inline
    implicit class IFilterConfigValuesMutableBuilder[Self <: IFilterConfigValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasUrls(value: StringDictionary[String]): Self = StObject.set(x, "aliasUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUrlsUndefined: Self = StObject.set(x, "aliasUrls", js.undefined)
      
      @scala.inline
      def setDefaultBaseUrl(value: String): Self = StObject.set(x, "defaultBaseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBaseUrlUndefined: Self = StObject.set(x, "defaultBaseUrl", js.undefined)
      
      @scala.inline
      def setDefaultExt(value: String): Self = StObject.set(x, "defaultExt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExtUndefined: Self = StObject.set(x, "defaultExt", js.undefined)
    }
  }
  
  @js.native
  trait IFilterTemplateDef extends StObject {
    
    /**
      * A url to a html template or an alias to a url registered using the {@link ngTableFilterConfigProvider}
      */
    var id: String = js.native
    
    /**
      * The text that should be rendered as a prompt to assist the user when entering a filter value
      */
    var placeholder: String = js.native
  }
  object IFilterTemplateDef {
    
    @scala.inline
    def apply(id: String, placeholder: String): IFilterTemplateDef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFilterTemplateDef]
    }
    
    @scala.inline
    implicit class IFilterTemplateDefMutableBuilder[Self <: IFilterTemplateDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  type IFilterTemplateDefMap = StringDictionary[String | IFilterTemplateDef]
  
  type ISelectDataFunc = js.Function0[js.Array[ISelectOption] | IPromise[js.Array[ISelectOption]]]
  
  @js.native
  trait ISelectOption extends StObject {
    
    var id: String | Double = js.native
    
    var title: String = js.native
  }
  object ISelectOption {
    
    @scala.inline
    def apply(id: String | Double, title: String): ISelectOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectOption]
    }
    
    @scala.inline
    implicit class ISelectOptionMutableBuilder[Self <: ISelectOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITableInputAttributes extends IAttributes {
    
    var disableFilter: js.UndefOr[String] = js.native
    
    var ngTable: js.UndefOr[String] = js.native
    
    var ngTableDynamic: js.UndefOr[String] = js.native
    
    var showFilter: js.UndefOr[String] = js.native
    
    var showGroup: js.UndefOr[String] = js.native
    
    var templateHeader: js.UndefOr[String] = js.native
    
    var templatePagination: js.UndefOr[String] = js.native
  }
  object ITableInputAttributes {
    
    @scala.inline
    def apply(
      $addClass: String => Unit,
      $attr: js.Object,
      $normalize: String => String,
      $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], _]) => Function,
      $removeClass: String => Unit,
      $set: (String, js.Any) => Unit,
      $updateClass: (String, String) => Unit
    ): ITableInputAttributes = {
      val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass))
      __obj.asInstanceOf[ITableInputAttributes]
    }
    
    @scala.inline
    implicit class ITableInputAttributesMutableBuilder[Self <: ITableInputAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableFilter(value: String): Self = StObject.set(x, "disableFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFilterUndefined: Self = StObject.set(x, "disableFilter", js.undefined)
      
      @scala.inline
      def setNgTable(value: String): Self = StObject.set(x, "ngTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgTableDynamic(value: String): Self = StObject.set(x, "ngTableDynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgTableDynamicUndefined: Self = StObject.set(x, "ngTableDynamic", js.undefined)
      
      @scala.inline
      def setNgTableUndefined: Self = StObject.set(x, "ngTable", js.undefined)
      
      @scala.inline
      def setShowFilter(value: String): Self = StObject.set(x, "showFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFilterUndefined: Self = StObject.set(x, "showFilter", js.undefined)
      
      @scala.inline
      def setShowGroup(value: String): Self = StObject.set(x, "showGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGroupUndefined: Self = StObject.set(x, "showGroup", js.undefined)
      
      @scala.inline
      def setTemplateHeader(value: String): Self = StObject.set(x, "templateHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateHeaderUndefined: Self = StObject.set(x, "templateHeader", js.undefined)
      
      @scala.inline
      def setTemplatePagination(value: String): Self = StObject.set(x, "templatePagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatePaginationUndefined: Self = StObject.set(x, "templatePagination", js.undefined)
    }
  }
  
  type SelectData = js.Array[ISelectOption] | ISelectDataFunc
}
