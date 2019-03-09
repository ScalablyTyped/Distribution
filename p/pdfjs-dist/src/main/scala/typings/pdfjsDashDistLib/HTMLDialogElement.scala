package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLDialogElement extends HTMLElement {
  var open: scala.Boolean = js.native
  var returnValue: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def close(returnValue: java.lang.String): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def showModal(): scala.Unit = js.native
}

@JSGlobal("HTMLDialogElement")
@js.native
object HTMLDialogElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLDialogElement]

