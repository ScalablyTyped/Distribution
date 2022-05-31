package typings.oracleOraclejet

import typings.oracleOraclejet.anon.AutoDismiss
import typings.oracleOraclejet.anon.Edge
import typings.oracleOraclejet.anon.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojoffcanvasMod {
  
  @JSImport("@oracle/oraclejet/ojoffcanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(offcanvas: Selector): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(offcanvas.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def open(offcanvas: AutoDismiss): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(offcanvas.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def setupResponsive(offcanvas: Edge): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupResponsive")(offcanvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tearDownResponsive(offcanvas: Selector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tearDownResponsive")(offcanvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toggle(offcanvas: AutoDismiss): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(offcanvas.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
