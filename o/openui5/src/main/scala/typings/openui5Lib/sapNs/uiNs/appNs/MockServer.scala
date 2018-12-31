package typings
package openui5Lib.sapNs.uiNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.app.MockServer")
@js.native
abstract class MockServer protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.ManagedObject {
  /**
    * Creates a mocked server. This helps to mock all or some backend calls, e.g. for OData/JSON Models or
    * simple XHR calls, withoutchanging the application code. This class can also be used for qunit tests.
    * @param sId id for the new server object; generated automatically if no non-empty id is given    
    * Note: this can be omitted, no matter whether <code>mSettings</code> will be given or not!
    * @param mSettings optional map/JSON-object with initial property values, aggregated objects etc. for
    * the new object
    * @param oScope scope object for resolving string based type and formatter references in bindings
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  def this(sId: java.lang.String, mSettings: js.Any, oScope: js.Any) = this()
}

