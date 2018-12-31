package typings
package openui5Lib.sapNs.uiNs.testNs.matchersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.matchers.Matcher")
@js.native
abstract class Matcher ()
  extends openui5Lib.sapNs.uiNs.baseNs.ManagedObject {
  /**
    * Checks if the matcher is matching - will get an instance of sap.ui.Control as parameter.Should be
    * overwritten by subclasses
    * @param oControl the control that is checked by the matcher
    * @returns true if the Control is matching the condition of the matcher
    */
  def isMatching(oControl: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Boolean = js.native
}

