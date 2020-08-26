package typings.officeUiFabricReact.mod

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "FocusZone")
@js.native
class FocusZone protected ()
  extends typings.officeUiFabricReact.libFocusZoneMod.FocusZone {
  def this(props: IFocusZoneProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "FocusZone")
@js.native
object FocusZone extends js.Object {
  /**
    * Handle global tab presses so that we can patch tabindexes on the fly.
    * HEADS UP: This must not be an arrow function in order to be referentially equal among instances
    * for ref counting to work correctly!
    */
  var _onKeyDownCapture: js.Any = js.native
  var defaultProps: IFocusZoneProps = js.native
  /** Used for testing purposes only. */
  def getOuterZones(): Double = js.native
}

