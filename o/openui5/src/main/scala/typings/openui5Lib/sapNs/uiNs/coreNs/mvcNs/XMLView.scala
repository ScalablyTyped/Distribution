package typings
package openui5Lib.sapNs.uiNs.coreNs.mvcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.mvc.XMLView")
@js.native
/**
  * Constructor for a new mvc/XMLView.Accepts an object literal <code>mSettings</code> that defines
  * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
  * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
  * object.This class does not have its own settings, but all settings applicable to the base type{@link
  * sap.ui.core.mvc.View#constructor sap.ui.core.mvc.View} can be used.
  * @param sId id for the new control, generated automatically if no id is given
  * @param mSettings initial settings for the new control
  */
class XMLView () extends View {
  def this(mSettings: js.Any) = this()
  /**
    * Constructor for a new mvc/XMLView.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.This class does not have its own settings, but all settings applicable to the base type{@link
    * sap.ui.core.mvc.View#constructor sap.ui.core.mvc.View} can be used.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Flag for feature detection of asynchronous loading/rendering
    * @since 1.30
    */
  var asyncSupport: js.Any = js.native
}

