package typings.powerbiVisualsTools.mod.extensibility

import typings.powerbiVisualsTools.mod.DataView
import typings.powerbiVisualsTools.mod.EditMode
import typings.powerbiVisualsTools.mod.EnumerateVisualObjectInstancesOptions
import typings.powerbiVisualsTools.mod.FilterAction
import typings.powerbiVisualsTools.mod.IFilter
import typings.powerbiVisualsTools.mod.IViewport
import typings.powerbiVisualsTools.mod.ViewMode
import typings.powerbiVisualsTools.mod.VisualObjectInstanceEnumeration
import typings.powerbiVisualsTools.mod.VisualObjectInstancesToPersist
import typings.powerbiVisualsTools.mod.VisualUpdateType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Change Log Version 1.11.0
  * Added `selectionManager.registerOnSelectCallback()` method for Report Bookmarks support
  */
object visual {
  
  /**
    * Represents a visualization displayed within an application (PowerBI dashboards, ad-hoc reporting, etc.).
    * This interface does not make assumptions about the underlying JS/HTML constructs the visual uses to render itself.
    */
  @js.native
  trait IVisual
    extends StObject
       with typings.powerbiVisualsTools.mod.extensibility.IVisual {
    
    /** Gets the set of objects that the visual is currently displaying. */
    var enumerateObjectInstances: js.UndefOr[
        js.Function1[
          /* options */ EnumerateVisualObjectInstancesOptions, 
          VisualObjectInstanceEnumeration
        ]
      ] = js.native
    
    /** Notifies the IVisual of an update (data, viewmode, size change). */
    // tslint:disable-next-line:no-unnecessary-generics
    def update[T](options: typings.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions): Unit = js.native
    def update[T](options: typings.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions, viewModel: T): Unit = js.native
  }
  
  trait IVisualHost
    extends StObject
       with typings.powerbiVisualsTools.mod.extensibility.IVisualHost {
    
    var allowInteractions: Boolean
    
    def applyJsonFilter(filter: IFilter, objectName: String, propertyName: String, action: FilterAction): Unit
    
    var authenticationService: IAuthenticationService
    
    var colorPalette: IColorPalette
    
    def createLocalizationManager(): ILocalizationManager
    
    def createSelectionIdBuilder(): typings.powerbiVisualsTools.mod.visuals.ISelectionIdBuilder
    
    def createSelectionManager(): ISelectionManager
    
    def launchUrl(url: String): Unit
    
    var locale: String
    
    def persistProperties(changes: VisualObjectInstancesToPersist): Unit
    
    def refreshHostData(): Unit
    
    var telemetry: ITelemetryService
    
    var tooltipService: ITooltipService
  }
  object IVisualHost {
    
    inline def apply(
      allowInteractions: Boolean,
      applyJsonFilter: (IFilter, String, String, FilterAction) => Unit,
      authenticationService: IAuthenticationService,
      colorPalette: IColorPalette,
      createLocalizationManager: () => ILocalizationManager,
      createSelectionIdBuilder: () => typings.powerbiVisualsTools.mod.visuals.ISelectionIdBuilder,
      createSelectionManager: () => ISelectionManager,
      instanceId: String,
      launchUrl: String => Unit,
      locale: String,
      persistProperties: VisualObjectInstancesToPersist => Unit,
      refreshHostData: () => Unit,
      telemetry: ITelemetryService,
      tooltipService: ITooltipService
    ): typings.powerbiVisualsTools.mod.extensibility.visual.IVisualHost = {
      val __obj = js.Dynamic.literal(allowInteractions = allowInteractions.asInstanceOf[js.Any], applyJsonFilter = js.Any.fromFunction4(applyJsonFilter), authenticationService = authenticationService.asInstanceOf[js.Any], colorPalette = colorPalette.asInstanceOf[js.Any], createLocalizationManager = js.Any.fromFunction0(createLocalizationManager), createSelectionIdBuilder = js.Any.fromFunction0(createSelectionIdBuilder), createSelectionManager = js.Any.fromFunction0(createSelectionManager), instanceId = instanceId.asInstanceOf[js.Any], launchUrl = js.Any.fromFunction1(launchUrl), locale = locale.asInstanceOf[js.Any], persistProperties = js.Any.fromFunction1(persistProperties), refreshHostData = js.Any.fromFunction0(refreshHostData), telemetry = telemetry.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.powerbiVisualsTools.mod.extensibility.visual.IVisualHost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.powerbiVisualsTools.mod.extensibility.visual.IVisualHost] (val x: Self) extends AnyVal {
      
      inline def setAllowInteractions(value: Boolean): Self = StObject.set(x, "allowInteractions", value.asInstanceOf[js.Any])
      
      inline def setApplyJsonFilter(value: (IFilter, String, String, FilterAction) => Unit): Self = StObject.set(x, "applyJsonFilter", js.Any.fromFunction4(value))
      
      inline def setAuthenticationService(value: IAuthenticationService): Self = StObject.set(x, "authenticationService", value.asInstanceOf[js.Any])
      
      inline def setColorPalette(value: IColorPalette): Self = StObject.set(x, "colorPalette", value.asInstanceOf[js.Any])
      
      inline def setCreateLocalizationManager(value: () => ILocalizationManager): Self = StObject.set(x, "createLocalizationManager", js.Any.fromFunction0(value))
      
      inline def setCreateSelectionIdBuilder(value: () => typings.powerbiVisualsTools.mod.visuals.ISelectionIdBuilder): Self = StObject.set(x, "createSelectionIdBuilder", js.Any.fromFunction0(value))
      
      inline def setCreateSelectionManager(value: () => ISelectionManager): Self = StObject.set(x, "createSelectionManager", js.Any.fromFunction0(value))
      
      inline def setLaunchUrl(value: String => Unit): Self = StObject.set(x, "launchUrl", js.Any.fromFunction1(value))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setPersistProperties(value: VisualObjectInstancesToPersist => Unit): Self = StObject.set(x, "persistProperties", js.Any.fromFunction1(value))
      
      inline def setRefreshHostData(value: () => Unit): Self = StObject.set(x, "refreshHostData", js.Any.fromFunction0(value))
      
      inline def setTelemetry(value: ITelemetryService): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait VisualConstructorOptions
    extends StObject
       with typings.powerbiVisualsTools.mod.extensibility.VisualConstructorOptions {
    
    var element: HTMLElement
    
    var host: typings.powerbiVisualsTools.mod.extensibility.visual.IVisualHost
  }
  object VisualConstructorOptions {
    
    inline def apply(element: HTMLElement, host: typings.powerbiVisualsTools.mod.extensibility.visual.IVisualHost): typings.powerbiVisualsTools.mod.extensibility.visual.VisualConstructorOptions = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.powerbiVisualsTools.mod.extensibility.visual.VisualConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.powerbiVisualsTools.mod.extensibility.visual.VisualConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHost(value: typings.powerbiVisualsTools.mod.extensibility.visual.IVisualHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    }
  }
  
  trait VisualUpdateOptions
    extends StObject
       with typings.powerbiVisualsTools.mod.extensibility.VisualUpdateOptions {
    
    var dataViews: js.Array[DataView]
    
    var editMode: js.UndefOr[EditMode] = js.undefined
    
    var viewMode: js.UndefOr[ViewMode] = js.undefined
    
    var viewport: IViewport
  }
  object VisualUpdateOptions {
    
    inline def apply(dataViews: js.Array[DataView], `type`: VisualUpdateType, viewport: IViewport): typings.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions = {
      val __obj = js.Dynamic.literal(dataViews = dataViews.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setDataViews(value: js.Array[DataView]): Self = StObject.set(x, "dataViews", value.asInstanceOf[js.Any])
      
      inline def setDataViewsVarargs(value: DataView*): Self = StObject.set(x, "dataViews", js.Array(value*))
      
      inline def setEditMode(value: EditMode): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
      
      inline def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
}
