package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.base.ManagedObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  @JSGlobal("sap.ui.app.Application")
  @js.native
  abstract class Application protected ()
    extends typings.openui5.sap.ui.app.Application {
    /**
      * Abstract application class. Extend this class to create a central application class.Only one
      * instance is allowed.Accepts an object literal <code>mSettings</code> that defines initialproperty
      * values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId optional id for the application; generated automatically if           no non-empty id is
      * given Note: this can be omitted, no matter           whether <code>mSettings</code> will be given or
      * not!
      * @param mSettings optional map/JSON-object with initial settings for the           new application
      * instance
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.app.MockServer")
  @js.native
  abstract class MockServer protected () extends ManagedObject {
    /**
      * Creates a mocked server. This helps to mock all or some backend calls, e.g. for OData/JSON Models or
      * simple XHR calls, withoutchanging the application code. This class can also be used for qunit tests.
      * @param sId id for the new server object; generated automatically if no non-empty id is given    
      * Note: this can be omitted, no matter whether <code>mSettings</code> will be given or not!
      * @param mSettings optional map/JSON-object with initial property values, aggregated objects etc. for
      * the new object
      * @param oScope scope object for resolving string based type and formatter references in bindings
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    def this(sId: String, mSettings: js.UndefOr[scala.Nothing], oScope: js.Any) = this()
    def this(sId: String, mSettings: js.Any, oScope: js.Any) = this()
  }
}
