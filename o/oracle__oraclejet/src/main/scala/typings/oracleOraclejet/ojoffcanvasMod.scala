package typings.oracleOraclejet

import typings.oracleOraclejet.anon.AutoDismiss
import typings.oracleOraclejet.anon.Edge
import typings.oracleOraclejet.anon.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojoffcanvasMod {
  
  @JSImport("@oracle/oraclejet/ojoffcanvas", "close")
  @js.native
  def close(offcanvas: Selector): js.Promise[Boolean] = js.native
  
  @JSImport("@oracle/oraclejet/ojoffcanvas", "open")
  @js.native
  def open(offcanvas: AutoDismiss): js.Promise[Boolean] = js.native
  
  @JSImport("@oracle/oraclejet/ojoffcanvas", "setupResponsive")
  @js.native
  def setupResponsive(offcanvas: Edge): Unit = js.native
  
  @JSImport("@oracle/oraclejet/ojoffcanvas", "tearDownResponsive")
  @js.native
  def tearDownResponsive(offcanvas: Selector): Unit = js.native
  
  @JSImport("@oracle/oraclejet/ojoffcanvas", "toggle")
  @js.native
  def toggle(offcanvas: AutoDismiss): js.Promise[Boolean] = js.native
}
