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
  open class ngAggregate protected ()
    extends StObject
       with IAggregate {
    def this(aggEntity: Any, rowFactory: IRowFactory, rowHeight: Double, groupInitState: Boolean) = this()
    
    /* CompleteClass */
    var aggChildren: js.Array[Any] = js.native
    
    /* CompleteClass */
    var aggIndex: Double = js.native
    
    /* CompleteClass */
    var aggLabelFilter: Any = js.native
    
    /* CompleteClass */
    var children: js.Array[Any] = js.native
    
    /* CompleteClass */
    var collapsed: Boolean = js.native
    
    /* CompleteClass */
    var depth: Double = js.native
    
    /* CompleteClass */
    var entity: Any = js.native
    
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
    var parent: Any = js.native
    
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
  inline def ngAggregate_=(x: IAggregateStatic): Unit = js.Dynamic.global.updateDynamic("ngAggregate")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngColumn")
  @js.native
  open class ngColumn protected ()
    extends StObject
       with IColumn {
    def this(
      config: IGridOptions,
      $scope: IGridScope,
      grid: IGridInstance,
      domUtilityService: IDomUtilityService,
      $templateCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITemplateCacheService */ Any,
      $utils: Any
    ) = this()
    
    /* CompleteClass */
    var aggLabelFilter: Any = js.native
    
    /* CompleteClass */
    var cellClass: String = js.native
    
    /* CompleteClass */
    var cellEditableCondition: Any = js.native
    
    /* CompleteClass */
    var cellFilter: Any = js.native
    
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
    override def gripClick(): Any = js.native
    
    /* CompleteClass */
    override def gripOnMouseDown(event: Any): Any = js.native
    
    /* CompleteClass */
    override def gripOnMouseUp(event: Any): Unit = js.native
    
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
    override def onMouseMove(event: Any): Unit = js.native
    
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
    override def sort(event: Any): Boolean = js.native
    
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
  inline def ngColumn_=(x: IColumnStatic): Unit = js.Dynamic.global.updateDynamic("ngColumn")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngDimension")
  @js.native
  open class ngDimension protected ()
    extends StObject
       with IDimension {
    def this(options: Any) = this()
  }
  @JSGlobal("ngDimension")
  @js.native
  def ngDimension: IDimensionStatic = js.native
  inline def ngDimension_=(x: IDimensionStatic): Unit = js.Dynamic.global.updateDynamic("ngDimension")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngEventProvider")
  @js.native
  open class ngEventProvider protected ()
    extends StObject
       with IEventProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      domUtilityService: IDomUtilityService,
      $timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITimeoutService */ Any
    ) = this()
    
    /* CompleteClass */
    override def assignEvents(): Unit = js.native
    
    /* CompleteClass */
    override def assignGridEventHandlers(): Unit = js.native
    
    /* CompleteClass */
    var colToMove: IColumn = js.native
    
    /* CompleteClass */
    override def dragOver(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def dragStart(event: Any): Unit = js.native
    
    /* CompleteClass */
    var groupToMove: Any = js.native
    
    /* CompleteClass */
    override def onGroupDrop(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def onGroupMouseDown(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def onHeaderDrop(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def onHeaderMouseDown(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def setDraggables(): Unit = js.native
  }
  @JSGlobal("ngEventProvider")
  @js.native
  def ngEventProvider: IEventProviderStatic = js.native
  inline def ngEventProvider_=(x: IEventProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngEventProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngFooter")
  @js.native
  open class ngFooter protected ()
    extends StObject
       with IFooter {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  @JSGlobal("ngFooter")
  @js.native
  def ngFooter: IFooterStatic = js.native
  inline def ngFooter_=(x: IFooterStatic): Unit = js.Dynamic.global.updateDynamic("ngFooter")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ngGridReorderable")
  @js.native
  open class ngGridReorderable ()
    extends StObject
       with typings.ngGrid.ngGridReorderable
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngRenderedRange")
  @js.native
  open class ngRenderedRange protected ()
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
  inline def ngRenderedRange_=(x: IRenderedRangeStatic): Unit = js.Dynamic.global.updateDynamic("ngRenderedRange")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngRow")
  @js.native
  open class ngRow protected ()
    extends StObject
       with IRow {
    def this(
      entity: Any,
      config: IRowConfig,
      selectionProvider: ISelectionProvider,
      rowIndex: Double,
      $utils: Any
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
    override def continueSelection(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def copy(): IRow = js.native
    
    /* CompleteClass */
    var cursor: String = js.native
    
    /* CompleteClass */
    override def ensureEntity(expected: Any): Unit = js.native
    
    /* CompleteClass */
    var entity: Any = js.native
    
    /* CompleteClass */
    override def getProperty(path: String): Any = js.native
    
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
    override def toggleSelected(event: Any): Boolean = js.native
    
    /* CompleteClass */
    var utils: Any = js.native
  }
  @JSGlobal("ngRow")
  @js.native
  def ngRow: IRowStatic = js.native
  inline def ngRow_=(x: IRowStatic): Unit = js.Dynamic.global.updateDynamic("ngRow")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngSearchProvider")
  @js.native
  open class ngSearchProvider protected ()
    extends StObject
       with ISearchProvider {
    def this(
      $scope: IGridScope,
      grid: IGridInstance,
      $filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IFilterService */ Any
    ) = this()
    
    /* CompleteClass */
    override def evalFilter(): Unit = js.native
    
    /* CompleteClass */
    var extFilter: Boolean = js.native
    
    /* CompleteClass */
    var fieldMap: Any = js.native
  }
  @JSGlobal("ngSearchProvider")
  @js.native
  def ngSearchProvider: ISearchProviderStatic = js.native
  inline def ngSearchProvider_=(x: ISearchProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngSearchProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngSelectionProvider")
  @js.native
  open class ngSelectionProvider protected ()
    extends StObject
       with ISelectionProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      $parse: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IParseService */ Any
    ) = this()
    
    /* CompleteClass */
    override def ChangeSelection(rowItem: Any, event: Any): Unit = js.native
    
    /* CompleteClass */
    override def getSelection(entity: Any): Double = js.native
    
    /* CompleteClass */
    override def getSelectionIndex(entity: Any): Double = js.native
    
    /* CompleteClass */
    var ignoreSelectedItemChanges: Boolean = js.native
    
    /* CompleteClass */
    var lastClickedRow: Any = js.native
    
    /* CompleteClass */
    var multi: Boolean = js.native
    
    /* CompleteClass */
    var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ Any = js.native
    
    /* CompleteClass */
    var selectedIndex: Double = js.native
    
    /* CompleteClass */
    var selectedItems: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def setSelection(rowItem: IRow, isSelected: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit = js.native
  }
  @JSGlobal("ngSelectionProvider")
  @js.native
  def ngSelectionProvider: ISelectionProviderStatic = js.native
  inline def ngSelectionProvider_=(x: ISelectionProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngSelectionProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngStyleProvider")
  @js.native
  open class ngStyleProvider protected ()
    extends StObject
       with IStyleProvider {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  @JSGlobal("ngStyleProvider")
  @js.native
  def ngStyleProvider: IStyleProviderStatic = js.native
  inline def ngStyleProvider_=(x: IStyleProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngStyleProvider")(x.asInstanceOf[js.Any])
}
