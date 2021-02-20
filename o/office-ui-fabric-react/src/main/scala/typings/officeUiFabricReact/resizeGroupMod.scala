package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.anon.AddMeasurementToCache
import typings.officeUiFabricReact.anon.GetInitialResizeGroupState
import typings.officeUiFabricReact.anon.IsMeasured
import typings.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeGroupMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "MeasuredContext")
  @js.native
  val MeasuredContext: Context[IsMeasured] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "ResizeGroup")
  @js.native
  class ResizeGroup protected ()
    extends typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "ResizeGroup")
  @js.native
  val ResizeGroup: Instantiable1[
    /* props */ IResizeGroupProps, 
    typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "ResizeGroupBase")
  @js.native
  class ResizeGroupBase protected ()
    extends typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "ResizeGroupDirection")
  @js.native
  object ResizeGroupDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection with Double] = js.native
    
    /* 0 */ val horizontal: typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.vertical with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "getMeasurementCache")
  @js.native
  def getMeasurementCache(): AddMeasurementToCache = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "getNextResizeGroupStateProvider")
  @js.native
  def getNextResizeGroupStateProvider(): GetInitialResizeGroupState = js.native
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup", "getNextResizeGroupStateProvider")
  @js.native
  def getNextResizeGroupStateProvider(measurementCache: AddMeasurementToCache): GetInitialResizeGroupState = js.native
}
