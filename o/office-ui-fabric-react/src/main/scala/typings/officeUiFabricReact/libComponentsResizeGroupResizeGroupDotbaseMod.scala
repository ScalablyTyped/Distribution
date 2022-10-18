package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.AddMeasurementToCache
import typings.officeUiFabricReact.anon.GetInitialResizeGroupState
import typings.officeUiFabricReact.anon.IsMeasured
import typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.IResizeGroupProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.grow
import typings.officeUiFabricReact.officeUiFabricReactStrings.shrink
import typings.react.mod.Component
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsResizeGroupResizeGroupDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", "MeasuredContext")
  @js.native
  val MeasuredContext: Context[IsMeasured] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", "ResizeGroupBase")
  @js.native
  open class ResizeGroupBase protected () extends Component[IResizeGroupProps, IResizeGroupState, Any] {
    def this(props: IResizeGroupProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MResizeGroupBase(nextProps: IResizeGroupProps): Unit = js.native
    
    /* private */ var _afterComponentRendered: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _hasRenderedContent: Any = js.native
    
    /* private */ var _initialHiddenDiv: Any = js.native
    
    /* private */ var _nextResizeGroupStateProvider: Any = js.native
    
    /* private */ var _onResize: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _updateHiddenDiv: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MResizeGroupBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizeGroupBase(prevProps: IResizeGroupProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizeGroupBase(): Unit = js.native
    
    def remeasure(): Unit = js.native
  }
  
  inline def getMeasurementCache(): AddMeasurementToCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeasurementCache")().asInstanceOf[AddMeasurementToCache]
  
  inline def getNextResizeGroupStateProvider(): GetInitialResizeGroupState = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextResizeGroupStateProvider")().asInstanceOf[GetInitialResizeGroupState]
  inline def getNextResizeGroupStateProvider(measurementCache: AddMeasurementToCache): GetInitialResizeGroupState = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextResizeGroupStateProvider")(measurementCache.asInstanceOf[js.Any]).asInstanceOf[GetInitialResizeGroupState]
  
  trait IResizeGroupState extends StObject {
    
    /**
      * Data to render in a hidden div for measurement
      */
    var dataToMeasure: js.UndefOr[Any] = js.undefined
    
    /**
      * Set to true when the content container might have new dimensions and should
      * be remeasured.
      */
    var measureContainer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Final data used to render proper sized component
      */
    var renderedData: js.UndefOr[Any] = js.undefined
    
    /**
      * Are we resizing to accommodate having more or less available space?
      * The 'grow' direction is when the container may have more room than the last render,
      * such as when a window resize occurs. This means we will try to fit more content in the window.
      * The 'shrink' direction is when the contents don't fit in the container and we need
      * to find a transformation of the data that makes everything fit.
      */
    var resizeDirection: js.UndefOr[grow | shrink] = js.undefined
  }
  object IResizeGroupState {
    
    inline def apply(): IResizeGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizeGroupState]
    }
    
    extension [Self <: IResizeGroupState](x: Self) {
      
      inline def setDataToMeasure(value: Any): Self = StObject.set(x, "dataToMeasure", value.asInstanceOf[js.Any])
      
      inline def setDataToMeasureUndefined: Self = StObject.set(x, "dataToMeasure", js.undefined)
      
      inline def setMeasureContainer(value: Boolean): Self = StObject.set(x, "measureContainer", value.asInstanceOf[js.Any])
      
      inline def setMeasureContainerUndefined: Self = StObject.set(x, "measureContainer", js.undefined)
      
      inline def setRenderedData(value: Any): Self = StObject.set(x, "renderedData", value.asInstanceOf[js.Any])
      
      inline def setRenderedDataUndefined: Self = StObject.set(x, "renderedData", js.undefined)
      
      inline def setResizeDirection(value: grow | shrink): Self = StObject.set(x, "resizeDirection", value.asInstanceOf[js.Any])
      
      inline def setResizeDirectionUndefined: Self = StObject.set(x, "resizeDirection", js.undefined)
    }
  }
}
