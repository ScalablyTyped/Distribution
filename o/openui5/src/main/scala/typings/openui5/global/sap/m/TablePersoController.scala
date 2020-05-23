package typings.openui5.global.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.TablePersoController")
@js.native
class TablePersoController protected ()
  extends typings.openui5.sap.m.TablePersoController {
  /**
    * The TablePersoController can be used to connect a table that you want to providea personalization
    * dialog for, with a persistence service such as one provided bythe unified shell.Accepts an object
    * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
    * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
    * description of the syntax of the settings object.
    * @param sId optional id for the new control; generated automatically if            no non-empty id is given
    * Note: this can be omitted, no matter            whether <code>mSettings</code> will be given or not!
    * @param mSettings optional map/JSON-object with initial settings for the            new component instance
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
}

