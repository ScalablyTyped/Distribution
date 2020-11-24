package typings.openui5.sap.ui.test.matchers

import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matcher extends ManagedObject {
  
  /**
    * Checks if the matcher is matching - will get an instance of sap.ui.Control as parameter.Should be
    * overwritten by subclasses
    * @param oControl the control that is checked by the matcher
    * @returns true if the Control is matching the condition of the matcher
    */
  def isMatching(oControl: Control): Boolean = js.native
}
