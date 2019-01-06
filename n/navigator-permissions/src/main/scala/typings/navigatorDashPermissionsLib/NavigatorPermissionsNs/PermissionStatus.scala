package typings
package navigatorDashPermissionsLib.NavigatorPermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `PermissionStatus` interface of the Permissions API provides the state
  * of an object and an event handler for monitoring changes to said state.
  *
  * This is an experimental technology
  * @see {@link https://developer.mozilla.org/en-US/docs/Web/API/PermissionStatus}
  */
@js.native
trait PermissionStatus
  extends stdLib.EventTarget {
  /**
    * An event called whenever `PermissionStatus.status` changes.
    */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* event */ stdLib.Event, _]) | scala.Null = js.native
  /**
    * Returns the state of a requested permission.
    */
  val state: PermissionState = js.native
  /**
    * Returns the state of a requested permission.
    * Later versions of the specification replace this with
    * `PermissionStatus.state`.
    * @deprecated
    */
  val status: PermissionState = js.native
}

