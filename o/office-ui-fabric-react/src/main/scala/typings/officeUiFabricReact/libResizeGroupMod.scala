package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.anon.AddMeasurementToCache
import typings.officeUiFabricReact.anon.GetInitialResizeGroupState
import typings.officeUiFabricReact.anon.IsMeasured
import typings.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResizeGroupMod {
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "MeasuredContext")
  @js.native
  val MeasuredContext: Context[IsMeasured] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "ResizeGroup")
  @js.native
  class ResizeGroup protected ()
    extends typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "ResizeGroup")
  @js.native
  val ResizeGroup: Instantiable1[
    /* props */ IResizeGroupProps, 
    typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "ResizeGroupBase")
  @js.native
  class ResizeGroupBase protected ()
    extends typings.officeUiFabricReact.resizeGroupMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "ResizeGroupDirection")
  @js.native
  object ResizeGroupDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection & Double] = js.native
    
    /* 0 */ val horizontal: typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.vertical & Double = js.native
  }
  
  inline def getMeasurementCache(): AddMeasurementToCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeasurementCache")().asInstanceOf[AddMeasurementToCache]
  
  inline def getNextResizeGroupStateProvider(): GetInitialResizeGroupState = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextResizeGroupStateProvider")().asInstanceOf[GetInitialResizeGroupState]
  inline def getNextResizeGroupStateProvider(measurementCache: AddMeasurementToCache): GetInitialResizeGroupState = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextResizeGroupStateProvider")(measurementCache.asInstanceOf[js.Any]).asInstanceOf[GetInitialResizeGroupState]
}
