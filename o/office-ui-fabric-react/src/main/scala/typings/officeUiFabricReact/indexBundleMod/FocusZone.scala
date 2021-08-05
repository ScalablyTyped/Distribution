package typings.officeUiFabricReact.indexBundleMod

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "FocusZone")
@js.native
class FocusZone protected ()
  extends typings.officeUiFabricReact.mod.FocusZone {
  def this(props: IFocusZoneProps) = this()
}
/* static members */
object FocusZone {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FocusZone")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Handle global tab presses so that we can patch tabindexes on the fly.
    * HEADS UP: This must not be an arrow function in order to be referentially equal among instances
    * for ref counting to work correctly!
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FocusZone._onKeyDownCapture")
  @js.native
  def _onKeyDownCapture: js.Any = js.native
  inline def _onKeyDownCapture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_onKeyDownCapture")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FocusZone.defaultProps")
  @js.native
  def defaultProps: IFocusZoneProps = js.native
  inline def defaultProps_=(x: IFocusZoneProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  /** Used for testing purposes only. */
  inline def getOuterZones(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterZones")().asInstanceOf[Double]
}
