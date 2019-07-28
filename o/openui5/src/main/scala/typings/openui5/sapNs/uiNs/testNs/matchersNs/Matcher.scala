package typings.openui5.sapNs.uiNs.testNs.matchersNs

import typings.openui5.sapNs.uiNs.baseNs.ManagedObject
import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.matchers.Matcher")
@js.native
abstract class Matcher () extends ManagedObject {
  /**
    * Checks if the matcher is matching - will get an instance of sap.ui.Control as parameter.Should be
    * overwritten by subclasses
    * @param oControl the control that is checked by the matcher
    * @returns true if the Control is matching the condition of the matcher
    */
  def isMatching(oControl: Control): Boolean = js.native
}

