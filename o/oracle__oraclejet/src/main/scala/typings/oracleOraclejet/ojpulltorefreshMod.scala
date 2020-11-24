package typings.oracleOraclejet

import typings.oracleOraclejet.anon.PrimaryText
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojpulltorefresh", JSImport.Namespace)
@js.native
object ojpulltorefreshMod extends js.Object {
  
  def setupPullToRefresh(element: Element, refreshFunc: js.Function0[js.Promise[_]]): Unit = js.native
  def setupPullToRefresh(element: Element, refreshFunc: js.Function0[js.Promise[_]], options: PrimaryText): Unit = js.native
  
  def tearDownPullToRefresh(element: Element): Unit = js.native
}
