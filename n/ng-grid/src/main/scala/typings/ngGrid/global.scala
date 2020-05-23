package typings.ngGrid

import org.scalablytyped.runtime.TopLevel
import typings.ngGrid.ngGrid.IAggregate
import typings.ngGrid.ngGrid.IAggregateStatic
import typings.ngGrid.ngGrid.IColumn
import typings.ngGrid.ngGrid.IColumnDef
import typings.ngGrid.ngGrid.IColumnStatic
import typings.ngGrid.ngGrid.IDimension
import typings.ngGrid.ngGrid.IDimensionStatic
import typings.ngGrid.ngGrid.IEventProvider
import typings.ngGrid.ngGrid.IEventProviderStatic
import typings.ngGrid.ngGrid.IFooter
import typings.ngGrid.ngGrid.IFooterStatic
import typings.ngGrid.ngGrid.IGridInstance
import typings.ngGrid.ngGrid.IGridOptions
import typings.ngGrid.ngGrid.IGridScope
import typings.ngGrid.ngGrid.IRenderedRange
import typings.ngGrid.ngGrid.IRenderedRangeStatic
import typings.ngGrid.ngGrid.IRow
import typings.ngGrid.ngGrid.IRowConfig
import typings.ngGrid.ngGrid.IRowFactory
import typings.ngGrid.ngGrid.IRowStatic
import typings.ngGrid.ngGrid.ISearchProvider
import typings.ngGrid.ngGrid.ISearchProviderStatic
import typings.ngGrid.ngGrid.ISelectionProvider
import typings.ngGrid.ngGrid.ISelectionProviderStatic
import typings.ngGrid.ngGrid.IStyleProvider
import typings.ngGrid.ngGrid.IStyleProviderStatic
import typings.ngGrid.ngGrid.service.IDomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class ngAggregate protected () extends IAggregate {
    def this(aggEntity: js.Any, rowFactory: IRowFactory, rowHeight: Double, groupInitState: Boolean) = this()
    /* CompleteClass */
    override var aggChildren: js.Array[_] = js.native
    /* CompleteClass */
    override var aggIndex: Double = js.native
    /* CompleteClass */
    override var aggLabelFilter: js.Any = js.native
    /* CompleteClass */
    override var children: js.Array[_] = js.native
    /* CompleteClass */
    override var collapsed: Boolean = js.native
    /* CompleteClass */
    override var depth: Double = js.native
    /* CompleteClass */
    override var entity: js.Any = js.native
    /* CompleteClass */
    override var field: String = js.native
    /* CompleteClass */
    override var groupInitState: Boolean = js.native
    /* CompleteClass */
    override var isAggRow: Boolean = js.native
    /* CompleteClass */
    override var label: String = js.native
    /* CompleteClass */
    override var offsetLeft: Double = js.native
    /* CompleteClass */
    override var offsetTop: Double = js.native
    /* CompleteClass */
    override var parent: js.Any = js.native
    /* CompleteClass */
    override var rowFactory: IRowFactory = js.native
    /* CompleteClass */
    override var rowHeight: Double = js.native
    /* CompleteClass */
    override var rowIndex: Double = js.native
  }
  
  @js.native
  class ngColumn protected () extends IColumn {
    def this(
      config: IGridOptions,
      $scope: IGridScope,
      grid: IGridInstance,
      domUtilityService: IDomUtilityService,
      $templateCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITemplateCacheService */ js.Any,
      $utils: js.Any
    ) = this()
    /* CompleteClass */
    override var aggLabelFilter: js.Any = js.native
    /* CompleteClass */
    override var cellClass: String = js.native
    /* CompleteClass */
    override var cellEditableCondition: js.Any = js.native
    /* CompleteClass */
    override var cellFilter: js.Any = js.native
    /* CompleteClass */
    override var cellTemplate: String = js.native
    /* CompleteClass */
    override var colDef: IColumnDef = js.native
    /* CompleteClass */
    override var cursor: String = js.native
    /* CompleteClass */
    override var displayName: String = js.native
    /* CompleteClass */
    override var enableCellEdit: Boolean = js.native
    /* CompleteClass */
    override var field: String = js.native
    /* CompleteClass */
    override var groupIndex: Double = js.native
    /* CompleteClass */
    override var groupable: Boolean = js.native
    /* CompleteClass */
    override var headerCellTemplate: String = js.native
    /* CompleteClass */
    override var headerClass: String = js.native
    /* CompleteClass */
    override var headerRowHeight: Double = js.native
    /* CompleteClass */
    override var index: Double = js.native
    /* CompleteClass */
    override var isAggCol: Boolean = js.native
    /* CompleteClass */
    override var isGroupedBy: Boolean = js.native
    /* CompleteClass */
    override var maxWidth: Double = js.native
    /* CompleteClass */
    override var minWidth: Double = js.native
    /* CompleteClass */
    override var originalIndex: Double = js.native
    /* CompleteClass */
    override var pinnable: Boolean = js.native
    /* CompleteClass */
    override var pinned: Boolean = js.native
    /* CompleteClass */
    override var resizable: Boolean = js.native
    /* CompleteClass */
    override var sortDirection: String = js.native
    /* CompleteClass */
    override var sortPriority: Double = js.native
    /* CompleteClass */
    override var sortable: Boolean = js.native
    /* CompleteClass */
    override var sortingAlgorithm: js.Function = js.native
    /* CompleteClass */
    override var visible: Boolean = js.native
    /* CompleteClass */
    override var width: Double = js.native
    /* CompleteClass */
    override def copy(): IColumn = js.native
    /* CompleteClass */
    override def gripClick(): js.Any = js.native
    /* CompleteClass */
    override def gripOnMouseDown(event: js.Any): js.Any = js.native
    /* CompleteClass */
    override def gripOnMouseUp(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def groupedByClass(): String = js.native
    /* CompleteClass */
    override def noSortVisible(): Boolean = js.native
    /* CompleteClass */
    override def onMouseMove(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def setVars(fromCol: IColumn): Unit = js.native
    /* CompleteClass */
    override def showSortButtonDown(): Boolean = js.native
    /* CompleteClass */
    override def showSortButtonUp(): Boolean = js.native
    /* CompleteClass */
    override def sort(event: js.Any): Boolean = js.native
    /* CompleteClass */
    override def toggleVisible(): Unit = js.native
  }
  
  @js.native
  class ngDimension protected () extends IDimension {
    def this(options: js.Any) = this()
  }
  
  @js.native
  class ngEventProvider protected () extends IEventProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      domUtilityService: IDomUtilityService,
      $timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITimeoutService */ js.Any
    ) = this()
    /* CompleteClass */
    override var colToMove: IColumn = js.native
    /* CompleteClass */
    override var groupToMove: js.Any = js.native
    /* CompleteClass */
    override def assignEvents(): Unit = js.native
    /* CompleteClass */
    override def assignGridEventHandlers(): Unit = js.native
    /* CompleteClass */
    override def dragOver(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def dragStart(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def onGroupDrop(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def onGroupMouseDown(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def onHeaderDrop(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def onHeaderMouseDown(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def setDraggables(): Unit = js.native
  }
  
  @js.native
  class ngFooter protected () extends IFooter {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  
  @js.native
  class ngGridReorderable ()
    extends typings.ngGrid.ngGridReorderable
  
  @js.native
  class ngRenderedRange protected () extends IRenderedRange {
    def this(top: Double, bottom: Double) = this()
    /* CompleteClass */
    override var bottomRow: Double = js.native
    /* CompleteClass */
    override var topRow: Double = js.native
  }
  
  @js.native
  class ngRow protected () extends IRow {
    def this(
      entity: js.Any,
      config: IRowConfig,
      selectionProvider: ISelectionProvider,
      rowIndex: Double,
      $utils: js.Any
    ) = this()
    /* CompleteClass */
    override var config: IRowConfig = js.native
    /* CompleteClass */
    override var cursor: String = js.native
    /* CompleteClass */
    override var entity: js.Any = js.native
    /* CompleteClass */
    override var offsetTop: Double = js.native
    /* CompleteClass */
    override var rowDisplayIndex: Double = js.native
    /* CompleteClass */
    override var rowIndex: Double = js.native
    /* CompleteClass */
    override var selected: Boolean = js.native
    /* CompleteClass */
    override var selectionProvider: ISelectionProvider = js.native
    /* CompleteClass */
    override var utils: js.Any = js.native
    /* CompleteClass */
    override def afterSelectionChange(): Unit = js.native
    /* CompleteClass */
    override def alternatingRowClass(): Unit = js.native
    /* CompleteClass */
    override def beforeSelectionChange(): Unit = js.native
    /* CompleteClass */
    override def continueSelection(event: js.Any): Unit = js.native
    /* CompleteClass */
    override def copy(): IRow = js.native
    /* CompleteClass */
    override def ensureEntity(expected: js.Any): Unit = js.native
    /* CompleteClass */
    override def getProperty(path: String): js.Any = js.native
    /* CompleteClass */
    override def setSelection(isSelected: Boolean): Unit = js.native
    /* CompleteClass */
    override def setVars(fromRow: IRow): Unit = js.native
    /* CompleteClass */
    override def toggleSelected(event: js.Any): Boolean = js.native
  }
  
  @js.native
  class ngSearchProvider protected () extends ISearchProvider {
    def this(
      $scope: IGridScope,
      grid: IGridInstance,
      $filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IFilterService */ js.Any
    ) = this()
    /* CompleteClass */
    override var extFilter: Boolean = js.native
    /* CompleteClass */
    override var fieldMap: js.Any = js.native
    /* CompleteClass */
    override def evalFilter(): Unit = js.native
  }
  
  @js.native
  class ngSelectionProvider protected () extends ISelectionProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      $parse: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IParseService */ js.Any
    ) = this()
    /* CompleteClass */
    override var ignoreSelectedItemChanges: Boolean = js.native
    /* CompleteClass */
    override var lastClickedRow: js.Any = js.native
    /* CompleteClass */
    override var multi: Boolean = js.native
    /* CompleteClass */
    override var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any = js.native
    /* CompleteClass */
    override var selectedIndex: Double = js.native
    /* CompleteClass */
    override var selectedItems: js.Array[_] = js.native
    /* CompleteClass */
    override def ChangeSelection(rowItem: js.Any, event: js.Any): Unit = js.native
    /* CompleteClass */
    override def getSelection(entity: js.Any): Double = js.native
    /* CompleteClass */
    override def getSelectionIndex(entity: js.Any): Double = js.native
    /* CompleteClass */
    override def setSelection(rowItem: IRow, isSelected: Boolean): Unit = js.native
    /* CompleteClass */
    override def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit = js.native
  }
  
  @js.native
  class ngStyleProvider protected () extends IStyleProvider {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  
  @js.native
  object ngAggregate extends TopLevel[IAggregateStatic]
  
  @js.native
  object ngColumn extends TopLevel[IColumnStatic]
  
  @js.native
  object ngDimension extends TopLevel[IDimensionStatic]
  
  @js.native
  object ngEventProvider extends TopLevel[IEventProviderStatic]
  
  @js.native
  object ngFooter extends TopLevel[IFooterStatic]
  
  @js.native
  object ngRenderedRange extends TopLevel[IRenderedRangeStatic]
  
  @js.native
  object ngRow extends TopLevel[IRowStatic]
  
  @js.native
  object ngSearchProvider extends TopLevel[ISearchProviderStatic]
  
  @js.native
  object ngSelectionProvider extends TopLevel[ISelectionProviderStatic]
  
  @js.native
  object ngStyleProvider extends TopLevel[IStyleProviderStatic]
  
}

