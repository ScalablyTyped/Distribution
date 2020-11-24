package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.Control")
@js.native
abstract class Control protected ()
  extends typings.openui5.sap.ui.core.Control {
  /**
    * Creates and initializes a new control with the given <code>sId</code> and settings.The set of
    * allowed entries in the <code>mSettings</code> object depends on the concretesubclass and is
    * described there. See {@link sap.ui.core.Element} for a general description of thisargument.The
    * settings supported by Control are:<ul><li>Properties<ul><li>{@link #getBusy busy} : boolean
    * (default: false)</li><li>{@link #getBusyIndicatorDelay busyIndicatorDelay} : int (default:
    * 1000)</li></ul></li></ul>Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId optional id for the new control; generated automatically if no non-empty id is given    
    * Note: this can be omitted, no matter whether <code>mSettings</code> will be given or not!
    * @param mSettings optional map/JSON-object with initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
}
