package typings.ngGrid

import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class ngAggregate protected () extends IAggregate {
    def this(aggEntity: js.Any, rowFactory: IRowFactory, rowHeight: Double, groupInitState: Boolean) = this()
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
  }
  
  @js.native
  class ngSearchProvider protected () extends ISearchProvider {
    def this(
      $scope: IGridScope,
      grid: IGridInstance,
      $filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IFilterService */ js.Any
    ) = this()
  }
  
  @js.native
  class ngSelectionProvider protected () extends ISelectionProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      $parse: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IParseService */ js.Any
    ) = this()
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

