package typings.openui5.global.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.m.TablePersoDialog")
@js.native
class TablePersoDialog protected ()
  extends StObject
     with typings.openui5.sap.m.TablePersoDialog {
  /**
    * The TablePersoDialog can be used to display and allow modification of personalization settings
    * relating to a Table. It displays the columns of the table that it refers to by using<ul><li>The
    * result of calling sap.m.TablePersoProvider's 'getCaption' callback if it is implemented and delivers
    * a non-null value for a column</li><li>the column header control's 'text' property if no caption
    * property is available</li><li>the column header control's 'title' property if neither 'text' nor
    * 'caption' property are available</li><li>the column id is displayed as last fallback, if none of the
    * above is at hand. In that case, a warning is logged. </li></ul>Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId optional id for the new control; generated automatically if            no non-empty id is given
    * Note: this can be omitted, no matter            whether <code>mSettings</code> will be given or not!
    * @param mSettings optional map/JSON-object with initial settings for the            new component instance
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
}
