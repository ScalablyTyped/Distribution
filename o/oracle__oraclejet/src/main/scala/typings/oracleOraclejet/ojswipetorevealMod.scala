package typings.oracleOraclejet

import typings.oracleOraclejet.anon.Threshold
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojswipetorevealMod {
  
  @JSImport("@oracle/oraclejet/ojswipetoreveal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupSwipeActions(elem: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupSwipeActions")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setupSwipeActions(elem: Element, options: Threshold): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupSwipeActions")(elem.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tearDownSwipeActions(elem: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tearDownSwipeActions")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
