package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojoffcanvas", JSImport.Namespace)
@js.native
object ojoffcanvasMod extends js.Object {
  def close(offcanvas: AnonSelector): js.Promise[Boolean] = js.native
  def open(offcanvas: AnonAutoDismiss): js.Promise[Boolean] = js.native
  def setupResponsive(offcanvas: AnonBottomEdge): Unit = js.native
  def tearDownResponsive(offcanvas: AnonSelector): Unit = js.native
  def toggle(offcanvas: AnonAutoDismiss): js.Promise[Boolean] = js.native
}

