package typings.ngGrid

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngAggregate")
  @js.native
  class ngAggregate protected ()
    extends StObject
       with IAggregate {
    def this(aggEntity: js.Any, rowFactory: IRowFactory, rowHeight: Double, groupInitState: Boolean) = this()
    
    /* CompleteClass */
    var aggChildren: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var aggIndex: Double = js.native
    
    /* CompleteClass */
    var aggLabelFilter: js.Any = js.native
    
    /* CompleteClass */
    var children: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var collapsed: Boolean = js.native
    
    /* CompleteClass */
    var depth: Double = js.native
    
    /* CompleteClass */
    var entity: js.Any = js.native
    
    /* CompleteClass */
    var field: String = js.native
    
    /* CompleteClass */
    var groupInitState: Boolean = js.native
    
    /* CompleteClass */
    var isAggRow: Boolean = js.native
    
    /* CompleteClass */
    var label: String = js.native
    
    /* CompleteClass */
    var offsetLeft: Double = js.native
    
    /* CompleteClass */
    var offsetTop: Double = js.native
    
    /* CompleteClass */
    var parent: js.Any = js.native
    
    /* CompleteClass */
    var rowFactory: IRowFactory = js.native
    
    /* CompleteClass */
    var rowHeight: Double = js.native
    
    /* CompleteClass */
    var rowIndex: Double = js.native
  }
  @JSGlobal("ngAggregate")
  @js.native
  def ngAggregate: IAggregateStatic = js.native
  @scala.inline
  def ngAggregate_=(x: IAggregateStatic): Unit = js.Dynamic.global.updateDynamic("ngAggregate")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngColumn")
  @js.native
  class ngColumn protected ()
    extends StObject
       with IColumn {
    def this(
      config: IGridOptions,
      $scope: IGridScope,
      grid: IGridInstance,
      domUtilityService: IDomUtilityService,
      $templateCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITemplateCacheService */ js.Any,
      $utils: js.Any
    ) = this()
    
    /* CompleteClass */
    var aggLabelFilter: js.Any = js.native
    
    /* CompleteClass */
    var cellClass: String = js.native
    
    /* CompleteClass */
    var cellEditableCondition: js.Any = js.native
    
    /* CompleteClass */
    var cellFilter: js.Any = js.native
    
    /* CompleteClass */
    var cellTemplate: String = js.native
    
    /* CompleteClass */
    var colDef: IColumnDef = js.native
    
    /* CompleteClass */
    override def copy(): IColumn = js.native
    
    /* CompleteClass */
    var cursor: String = js.native
    
    /* CompleteClass */
    var displayName: String = js.native
    
    /* CompleteClass */
    var enableCellEdit: Boolean = js.native
    
    /* CompleteClass */
    var field: String = js.native
    
    /* CompleteClass */
    override def gripClick(): js.Any = js.native
    
    /* CompleteClass */
    override def gripOnMouseDown(event: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def gripOnMouseUp(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    var groupIndex: Double = js.native
    
    /* CompleteClass */
    var groupable: Boolean = js.native
    
    /* CompleteClass */
    override def groupedByClass(): String = js.native
    
    /* CompleteClass */
    var headerCellTemplate: String = js.native
    
    /* CompleteClass */
    var headerClass: String = js.native
    
    /* CompleteClass */
    var headerRowHeight: Double = js.native
    
    /* CompleteClass */
    var index: Double = js.native
    
    /* CompleteClass */
    var isAggCol: Boolean = js.native
    
    /* CompleteClass */
    var isGroupedBy: Boolean = js.native
    
    /* CompleteClass */
    var maxWidth: Double = js.native
    
    /* CompleteClass */
    var minWidth: Double = js.native
    
    /* CompleteClass */
    override def noSortVisible(): Boolean = js.native
    
    /* CompleteClass */
    override def onMouseMove(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    var originalIndex: Double = js.native
    
    /* CompleteClass */
    var pinnable: Boolean = js.native
    
    /* CompleteClass */
    var pinned: Boolean = js.native
    
    /* CompleteClass */
    var resizable: Boolean = js.native
    
    /* CompleteClass */
    override def setVars(fromCol: IColumn): Unit = js.native
    
    /* CompleteClass */
    override def showSortButtonDown(): Boolean = js.native
    
    /* CompleteClass */
    override def showSortButtonUp(): Boolean = js.native
    
    /* CompleteClass */
    override def sort(event: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var sortDirection: String = js.native
    
    /* CompleteClass */
    var sortPriority: Double = js.native
    
    /* CompleteClass */
    var sortable: Boolean = js.native
    
    /* CompleteClass */
    var sortingAlgorithm: js.Function = js.native
    
    /* CompleteClass */
    override def toggleVisible(): Unit = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  @JSGlobal("ngColumn")
  @js.native
  def ngColumn: IColumnStatic = js.native
  @scala.inline
  def ngColumn_=(x: IColumnStatic): Unit = js.Dynamic.global.updateDynamic("ngColumn")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngDimension")
  @js.native
  class ngDimension protected ()
    extends StObject
       with IDimension {
    def this(options: js.Any) = this()
  }
  @JSGlobal("ngDimension")
  @js.native
  def ngDimension: IDimensionStatic = js.native
  @scala.inline
  def ngDimension_=(x: IDimensionStatic): Unit = js.Dynamic.global.updateDynamic("ngDimension")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngEventProvider")
  @js.native
  class ngEventProvider protected ()
    extends StObject
       with IEventProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      domUtilityService: IDomUtilityService,
      $timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITimeoutService */ js.Any
    ) = this()
    
    /* CompleteClass */
    override def assignEvents(): Unit = js.native
    
    /* CompleteClass */
    override def assignGridEventHandlers(): Unit = js.native
    
    /* CompleteClass */
    var colToMove: IColumn = js.native
    
    /* CompleteClass */
    override def dragOver(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def dragStart(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    var groupToMove: js.Any = js.native
    
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
  @JSGlobal("ngEventProvider")
  @js.native
  def ngEventProvider: IEventProviderStatic = js.native
  @scala.inline
  def ngEventProvider_=(x: IEventProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngEventProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngFooter")
  @js.native
  class ngFooter protected ()
    extends StObject
       with IFooter {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  @JSGlobal("ngFooter")
  @js.native
  def ngFooter: IFooterStatic = js.native
  @scala.inline
  def ngFooter_=(x: IFooterStatic): Unit = js.Dynamic.global.updateDynamic("ngFooter")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ngGridReorderable")
  @js.native
  class ngGridReorderable ()
    extends StObject
       with typings.ngGrid.ngGridReorderable
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngRenderedRange")
  @js.native
  class ngRenderedRange protected ()
    extends StObject
       with IRenderedRange {
    def this(top: Double, bottom: Double) = this()
    
    /* CompleteClass */
    var bottomRow: Double = js.native
    
    /* CompleteClass */
    var topRow: Double = js.native
  }
  @JSGlobal("ngRenderedRange")
  @js.native
  def ngRenderedRange: IRenderedRangeStatic = js.native
  @scala.inline
  def ngRenderedRange_=(x: IRenderedRangeStatic): Unit = js.Dynamic.global.updateDynamic("ngRenderedRange")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngRow")
  @js.native
  class ngRow protected ()
    extends StObject
       with IRow {
    def this(
      entity: js.Any,
      config: IRowConfig,
      selectionProvider: ISelectionProvider,
      rowIndex: Double,
      $utils: js.Any
    ) = this()
    
    /* CompleteClass */
    override def afterSelectionChange(): Unit = js.native
    
    /* CompleteClass */
    override def alternatingRowClass(): Unit = js.native
    
    /* CompleteClass */
    override def beforeSelectionChange(): Unit = js.native
    
    /* CompleteClass */
    var config: IRowConfig = js.native
    
    /* CompleteClass */
    override def continueSelection(event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def copy(): IRow = js.native
    
    /* CompleteClass */
    var cursor: String = js.native
    
    /* CompleteClass */
    override def ensureEntity(expected: js.Any): Unit = js.native
    
    /* CompleteClass */
    var entity: js.Any = js.native
    
    /* CompleteClass */
    override def getProperty(path: String): js.Any = js.native
    
    /* CompleteClass */
    var offsetTop: Double = js.native
    
    /* CompleteClass */
    var rowDisplayIndex: Double = js.native
    
    /* CompleteClass */
    var rowIndex: Double = js.native
    
    /* CompleteClass */
    var selected: Boolean = js.native
    
    /* CompleteClass */
    var selectionProvider: ISelectionProvider = js.native
    
    /* CompleteClass */
    override def setSelection(isSelected: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setVars(fromRow: IRow): Unit = js.native
    
    /* CompleteClass */
    override def toggleSelected(event: js.Any): Boolean = js.native
    
    /* CompleteClass */
    var utils: js.Any = js.native
  }
  @JSGlobal("ngRow")
  @js.native
  def ngRow: IRowStatic = js.native
  @scala.inline
  def ngRow_=(x: IRowStatic): Unit = js.Dynamic.global.updateDynamic("ngRow")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngSearchProvider")
  @js.native
  class ngSearchProvider protected ()
    extends StObject
       with ISearchProvider {
    def this(
      $scope: IGridScope,
      grid: IGridInstance,
      $filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IFilterService */ js.Any
    ) = this()
    
    /* CompleteClass */
    override def evalFilter(): Unit = js.native
    
    /* CompleteClass */
    var extFilter: Boolean = js.native
    
    /* CompleteClass */
    var fieldMap: js.Any = js.native
  }
  @JSGlobal("ngSearchProvider")
  @js.native
  def ngSearchProvider: ISearchProviderStatic = js.native
  @scala.inline
  def ngSearchProvider_=(x: ISearchProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngSearchProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngSelectionProvider")
  @js.native
  class ngSelectionProvider protected ()
    extends StObject
       with ISelectionProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      $parse: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IParseService */ js.Any
    ) = this()
    
    /* CompleteClass */
    override def ChangeSelection(rowItem: js.Any, event: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getSelection(entity: js.Any): Double = js.native
    
    /* CompleteClass */
    override def getSelectionIndex(entity: js.Any): Double = js.native
    
    /* CompleteClass */
    var ignoreSelectedItemChanges: Boolean = js.native
    
    /* CompleteClass */
    var lastClickedRow: js.Any = js.native
    
    /* CompleteClass */
    var multi: Boolean = js.native
    
    /* CompleteClass */
    var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any = js.native
    
    /* CompleteClass */
    var selectedIndex: Double = js.native
    
    /* CompleteClass */
    var selectedItems: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    override def setSelection(rowItem: IRow, isSelected: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit = js.native
  }
  @JSGlobal("ngSelectionProvider")
  @js.native
  def ngSelectionProvider: ISelectionProviderStatic = js.native
  @scala.inline
  def ngSelectionProvider_=(x: ISelectionProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngSelectionProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngStyleProvider")
  @js.native
  class ngStyleProvider protected ()
    extends StObject
       with IStyleProvider {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  @JSGlobal("ngStyleProvider")
  @js.native
  def ngStyleProvider: IStyleProviderStatic = js.native
  @scala.inline
  def ngStyleProvider_=(x: IStyleProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngStyleProvider")(x.asInstanceOf[js.Any])
}
