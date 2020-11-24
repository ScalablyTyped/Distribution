package typings.oracleOraclejet

import typings.oracleOraclejet.anon.AutoDismiss
import typings.oracleOraclejet.anon.Edge
import typings.oracleOraclejet.anon.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojoffcanvas", JSImport.Namespace)
@js.native
object ojoffcanvasMod extends js.Object {
  
  def close(offcanvas: Selector): js.Promise[Boolean] = js.native
  
  def open(offcanvas: AutoDismiss): js.Promise[Boolean] = js.native
  
  def setupResponsive(offcanvas: Edge): Unit = js.native
  
  def tearDownResponsive(offcanvas: Selector): Unit = js.native
  
  def toggle(offcanvas: AutoDismiss): js.Promise[Boolean] = js.native
}
