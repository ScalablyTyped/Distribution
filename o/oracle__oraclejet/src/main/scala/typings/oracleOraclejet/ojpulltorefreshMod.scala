package typings.oracleOraclejet

import typings.oracleOraclejet.anon.PrimaryText
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojpulltorefreshMod {
  
  @JSImport("@oracle/oraclejet/ojpulltorefresh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupPullToRefresh(element: Element, refreshFunc: js.Function0[js.Promise[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupPullToRefresh")(element.asInstanceOf[js.Any], refreshFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setupPullToRefresh(element: Element, refreshFunc: js.Function0[js.Promise[Any]], options: PrimaryText): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupPullToRefresh")(element.asInstanceOf[js.Any], refreshFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tearDownPullToRefresh(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tearDownPullToRefresh")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
