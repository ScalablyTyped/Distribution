package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.Component")
@js.native
abstract class Component protected ()
  extends typings.openui5.sap.ui.core.Component {
  /**
    * Creates and initializes a new Component with the given <code>sId</code> andsettings.The set of
    * allowed entries in the <code>mSettings</code> object depends onthe concrete subclass and is
    * described there. See {@link sap.ui.core.Component}for a general description of this argument.Accepts
    * an object literal <code>mSettings</code> that defines initialproperty values, aggregated and
    * associated objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a
    * general description of the syntax of the settings object.This class does not have its own settings,
    * but all settings applicable to the base type{@link sap.ui.base.ManagedObject#constructor
    * sap.ui.base.ManagedObject} can be used.
    * @param sId Optional ID for the new control; generated automatically if           no non-empty ID is
    * given. Note: this can be omitted, no matter           whether <code>mSettings</code> are given or
    * not!
    * @param mSettings Optional map or JSON-object with initial settings for the           new Component
    * instance
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
}
