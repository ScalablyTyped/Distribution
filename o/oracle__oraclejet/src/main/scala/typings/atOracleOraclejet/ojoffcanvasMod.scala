package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojoffcanvas", JSImport.Namespace)
@js.native
object ojoffcanvasMod extends js.Object {
  def close(offcanvas: Anon_Selector): js.Promise[Boolean] = js.native
  def open(offcanvas: Anon_AutoDismiss): js.Promise[Boolean] = js.native
  def setupResponsive(offcanvas: Anon_BottomEdge): Unit = js.native
  def tearDownResponsive(offcanvas: Anon_Selector): Unit = js.native
  def toggle(offcanvas: Anon_AutoDismiss): js.Promise[Boolean] = js.native
}

