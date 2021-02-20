package typings.ngGrid

import typings.ngGrid.ngGrid.IAggregate
import typings.ngGrid.ngGrid.IAggregateStatic
import typings.ngGrid.ngGrid.IColumn
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngAggregate")
  @js.native
  class ngAggregate protected () extends IAggregate {
    def this(aggEntity: js.Any, rowFactory: IRowFactory, rowHeight: Double, groupInitState: Boolean) = this()
  }
  @JSGlobal("ngAggregate")
  @js.native
  def ngAggregate: IAggregateStatic = js.native
  @scala.inline
  def ngAggregate_=(x: IAggregateStatic): Unit = js.Dynamic.global.updateDynamic("ngAggregate")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngColumn")
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
  }
  @JSGlobal("ngColumn")
  @js.native
  def ngColumn: IColumnStatic = js.native
  @scala.inline
  def ngColumn_=(x: IColumnStatic): Unit = js.Dynamic.global.updateDynamic("ngColumn")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngDimension")
  @js.native
  class ngDimension protected () extends IDimension {
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
  class ngEventProvider protected () extends IEventProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      domUtilityService: IDomUtilityService,
      $timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITimeoutService */ js.Any
    ) = this()
  }
  @JSGlobal("ngEventProvider")
  @js.native
  def ngEventProvider: IEventProviderStatic = js.native
  @scala.inline
  def ngEventProvider_=(x: IEventProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngEventProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngFooter")
  @js.native
  class ngFooter protected () extends IFooter {
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
    extends typings.ngGrid.ngGridReorderable
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngRenderedRange")
  @js.native
  class ngRenderedRange protected () extends IRenderedRange {
    def this(top: Double, bottom: Double) = this()
  }
  @JSGlobal("ngRenderedRange")
  @js.native
  def ngRenderedRange: IRenderedRangeStatic = js.native
  @scala.inline
  def ngRenderedRange_=(x: IRenderedRangeStatic): Unit = js.Dynamic.global.updateDynamic("ngRenderedRange")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngRow")
  @js.native
  class ngRow protected () extends IRow {
    def this(
      entity: js.Any,
      config: IRowConfig,
      selectionProvider: ISelectionProvider,
      rowIndex: Double,
      $utils: js.Any
    ) = this()
  }
  @JSGlobal("ngRow")
  @js.native
  def ngRow: IRowStatic = js.native
  @scala.inline
  def ngRow_=(x: IRowStatic): Unit = js.Dynamic.global.updateDynamic("ngRow")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngSearchProvider")
  @js.native
  class ngSearchProvider protected () extends ISearchProvider {
    def this(
      $scope: IGridScope,
      grid: IGridInstance,
      $filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IFilterService */ js.Any
    ) = this()
  }
  @JSGlobal("ngSearchProvider")
  @js.native
  def ngSearchProvider: ISearchProviderStatic = js.native
  @scala.inline
  def ngSearchProvider_=(x: ISearchProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngSearchProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngSelectionProvider")
  @js.native
  class ngSelectionProvider protected () extends ISelectionProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      $parse: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IParseService */ js.Any
    ) = this()
  }
  @JSGlobal("ngSelectionProvider")
  @js.native
  def ngSelectionProvider: ISelectionProviderStatic = js.native
  @scala.inline
  def ngSelectionProvider_=(x: ISelectionProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngSelectionProvider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ngStyleProvider")
  @js.native
  class ngStyleProvider protected () extends IStyleProvider {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  @JSGlobal("ngStyleProvider")
  @js.native
  def ngStyleProvider: IStyleProviderStatic = js.native
  @scala.inline
  def ngStyleProvider_=(x: IStyleProviderStatic): Unit = js.Dynamic.global.updateDynamic("ngStyleProvider")(x.asInstanceOf[js.Any])
}
