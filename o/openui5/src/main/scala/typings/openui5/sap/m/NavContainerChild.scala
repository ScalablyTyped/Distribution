package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * sap.m.NavContainerChild is an artificial interface with the only purpose to bear the documentation
  * ofpseudo events triggered by sap.m.NavContainer on its child controls when navigation occurs and
  * child controls are displayed/hidden.Interested parties outside the child control can listen to one
  * or more of these events by registering a Delegate:<pre>page1.addEventDelegate({   onBeforeShow:
  * function(evt) {      // page1 is about to be shown; act accordingly - if required you can read event
  * information from the evt object   },   onAfterHide: function(evt) {      // ...   }});</pre>
  * @resource sap/m/NavContainer.js
  */
@js.native
trait NavContainerChild extends js.Object

