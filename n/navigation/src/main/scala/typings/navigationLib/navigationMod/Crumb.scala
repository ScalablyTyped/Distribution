package typings
package navigationLib.navigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("navigation", "Crumb")
@js.native
class Crumb protected () extends js.Object {
  /**
       * Initializes a new instance of the Crumb class
       * @param data The Context Data held at the time of navigating away
       * from this State
       * @param state The configuration information associated with this
       * navigation
       * @param link The link navigation to return to the State and pass the
       * associated Data
       * @param crumblessLink The link navigation without crumb trail to
       * return to the State and pass the associated Data
       * @param last A value indicating whether the Crumb is the last in the
       * crumb trail
       */
  def this(data: js.Any, state: State, link: java.lang.String, crumblessLink: java.lang.String, last: scala.Boolean) = this()
  /**
       * Gets the link navigation without crumb trail to return to the State
       * and pass the associated Data
       */
  var crumblessUrl: java.lang.String = js.native
  /**
       * Gets the Context Data held at the time of navigating away from this
       * State
       */
  var data: js.Any = js.native
  /**
       * Gets a value indicating whether the Crumb is the last in the crumb
       * trail
       */
  var last: scala.Boolean = js.native
  /**
       * Gets the configuration information associated with this navigation
       */
  var state: State = js.native
  /**
       * Gets the State Title
       */
  var title: java.lang.String = js.native
  /**
       * Gets the link navigation to return to the State and pass the
       * associated Data
       */
  var url: java.lang.String = js.native
}

