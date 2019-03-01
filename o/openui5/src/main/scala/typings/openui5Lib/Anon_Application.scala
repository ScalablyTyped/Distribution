package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Application extends js.Object {
  /**
    * Filters which are changed by the application
    */
  var Application: js.Any
  /**
    * Filters which are set by the different controls
    */
  var Control: js.Any
}

object Anon_Application {
  @scala.inline
  def apply(Application: js.Any, Control: js.Any): Anon_Application = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Application")(Application)
    __obj.updateDynamic("Control")(Control)
    __obj.asInstanceOf[Anon_Application]
  }
}

