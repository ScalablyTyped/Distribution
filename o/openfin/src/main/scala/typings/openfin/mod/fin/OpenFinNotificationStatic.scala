package typings.openfin.mod.fin

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinNotificationStatic
  extends /**
  * ctor
  */
Instantiable1[/* options */ NotificationOptions, OpenFinNotification]
     with Instantiable2[
      /* options */ NotificationOptions, 
      /* callback */ js.Function0[Unit], 
      OpenFinNotification
    ]
     with Instantiable3[
      /* options */ NotificationOptions, 
      /* callback */ js.Function0[Unit], 
      /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit], 
      OpenFinNotification
    ] {
  /**
    * Gets an instance of the current notification. For use within a notification window to close the window or send a message back to its parent application.
    */
  def getCurrent(): OpenFinNotification = js.native
}

