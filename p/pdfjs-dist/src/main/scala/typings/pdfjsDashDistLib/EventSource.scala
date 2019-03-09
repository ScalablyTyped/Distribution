package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSource extends EventTarget {
  val CLOSED: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
  val readyState: scala.Double = js.native
  val url: java.lang.String = js.native
  val withCredentials: scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def onerror(evt: MessageEvent): js.Any = js.native
  def onmessage(evt: MessageEvent): js.Any = js.native
  def onopen(evt: MessageEvent): js.Any = js.native
}

@JSGlobal("EventSource")
@js.native
object EventSource
  extends org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, EventSource]
     with org.scalablytyped.runtime.Instantiable2[/* url */ java.lang.String, /* eventSourceInitDict */ EventSourceInit, EventSource]

