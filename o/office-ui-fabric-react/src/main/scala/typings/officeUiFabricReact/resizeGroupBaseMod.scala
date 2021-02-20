package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.AddMeasurementToCache
import typings.officeUiFabricReact.anon.GetInitialResizeGroupState
import typings.officeUiFabricReact.anon.IsMeasured
import typings.officeUiFabricReact.officeUiFabricReactStrings.grow
import typings.officeUiFabricReact.officeUiFabricReactStrings.shrink
import typings.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import typings.react.mod.Component
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeGroupBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", "MeasuredContext")
  @js.native
  val MeasuredContext: Context[IsMeasured] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", "ResizeGroupBase")
  @js.native
  class ResizeGroupBase protected ()
    extends Component[IResizeGroupProps, IResizeGroupState, js.Any] {
    def this(props: IResizeGroupProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MResizeGroupBase(nextProps: IResizeGroupProps): Unit = js.native
    
    var _afterComponentRendered: js.Any = js.native
    
    var _async: js.Any = js.native
    
    var _events: js.Any = js.native
    
    var _hasRenderedContent: js.Any = js.native
    
    var _initialHiddenDiv: js.Any = js.native
    
    var _nextResizeGroupStateProvider: js.Any = js.native
    
    var _onResize: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _updateHiddenDiv: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MResizeGroupBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizeGroupBase(prevProps: IResizeGroupProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizeGroupBase(): Unit = js.native
    
    def remeasure(): Unit = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", "getMeasurementCache")
  @js.native
  def getMeasurementCache(): AddMeasurementToCache = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", "getNextResizeGroupStateProvider")
  @js.native
  def getNextResizeGroupStateProvider(): GetInitialResizeGroupState = js.native
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", "getNextResizeGroupStateProvider")
  @js.native
  def getNextResizeGroupStateProvider(measurementCache: AddMeasurementToCache): GetInitialResizeGroupState = js.native
  
  @js.native
  trait IResizeGroupState extends StObject {
    
    /**
      * Data to render in a hidden div for measurement
      */
    var dataToMeasure: js.UndefOr[js.Any] = js.native
    
    /**
      * Set to true when the content container might have new dimensions and should
      * be remeasured.
      */
    var measureContainer: js.UndefOr[Boolean] = js.native
    
    /**
      * Final data used to render proper sized component
      */
    var renderedData: js.UndefOr[js.Any] = js.native
    
    /**
      * Are we resizing to accommodate having more or less available space?
      * The 'grow' direction is when the container may have more room than the last render,
      * such as when a window resize occurs. This means we will try to fit more content in the window.
      * The 'shrink' direction is when the contents don't fit in the container and we need
      * to find a transformation of the data that makes everything fit.
      */
    var resizeDirection: js.UndefOr[grow | shrink] = js.native
  }
  object IResizeGroupState {
    
    @scala.inline
    def apply(): IResizeGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizeGroupState]
    }
    
    @scala.inline
    implicit class IResizeGroupStateMutableBuilder[Self <: IResizeGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataToMeasure(value: js.Any): Self = StObject.set(x, "dataToMeasure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataToMeasureUndefined: Self = StObject.set(x, "dataToMeasure", js.undefined)
      
      @scala.inline
      def setMeasureContainer(value: Boolean): Self = StObject.set(x, "measureContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureContainerUndefined: Self = StObject.set(x, "measureContainer", js.undefined)
      
      @scala.inline
      def setRenderedData(value: js.Any): Self = StObject.set(x, "renderedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedDataUndefined: Self = StObject.set(x, "renderedData", js.undefined)
      
      @scala.inline
      def setResizeDirection(value: grow | shrink): Self = StObject.set(x, "resizeDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeDirectionUndefined: Self = StObject.set(x, "resizeDirection", js.undefined)
    }
  }
}
