package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusNavigationEvent extends Event {
  val navigationReason: NavigationReason = js.native
  val originHeight: scala.Double = js.native
  val originLeft: scala.Double = js.native
  val originTop: scala.Double = js.native
  val originWidth: scala.Double = js.native
  def requestFocus(): scala.Unit = js.native
}

@JSGlobal("FocusNavigationEvent")
@js.native
object FocusNavigationEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, FocusNavigationEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ FocusNavigationEventInit, 
      FocusNavigationEvent
    ]

