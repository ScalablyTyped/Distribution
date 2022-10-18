package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.anon.AddMeasurementToCache
import typings.officeUiFabricReact.anon.GetInitialResizeGroupState
import typings.officeUiFabricReact.anon.IsMeasured
import typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.IResizeGroupProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsResizeGroupMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "MeasuredContext")
  @js.native
  val MeasuredContext: Context[IsMeasured] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "ResizeGroup")
  @js.native
  open class ResizeGroup protected ()
    extends typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDotbaseMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "ResizeGroup")
  @js.native
  val ResizeGroup: Instantiable1[
    /* props */ IResizeGroupProps, 
    typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDotbaseMod.ResizeGroupBase
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "ResizeGroupBase")
  @js.native
  open class ResizeGroupBase protected ()
    extends typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDotbaseMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "ResizeGroupDirection")
  @js.native
  object ResizeGroupDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.ResizeGroupDirection & Double
      ] = js.native
    
    /* 0 */ val horizontal: typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.ResizeGroupDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.ResizeGroupDirection.vertical & Double = js.native
  }
  
  inline def getMeasurementCache(): AddMeasurementToCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeasurementCache")().asInstanceOf[AddMeasurementToCache]
  
  inline def getNextResizeGroupStateProvider(): GetInitialResizeGroupState = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextResizeGroupStateProvider")().asInstanceOf[GetInitialResizeGroupState]
  inline def getNextResizeGroupStateProvider(measurementCache: AddMeasurementToCache): GetInitialResizeGroupState = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextResizeGroupStateProvider")(measurementCache.asInstanceOf[js.Any]).asInstanceOf[GetInitialResizeGroupState]
}
