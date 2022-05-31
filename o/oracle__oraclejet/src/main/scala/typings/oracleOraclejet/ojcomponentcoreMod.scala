package typings.oracleOraclejet

import typings.oracleOraclejet.anon.InitialRender
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcomponentcoreMod {
  
  @JSImport("@oracle/oraclejet/ojcomponentcore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subtreeAttached(node: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("subtreeAttached")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def subtreeDetached(node: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("subtreeDetached")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def subtreeHidden(node: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("subtreeHidden")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def subtreeShown(node: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("subtreeShown")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def subtreeShown(node: Element, options: InitialRender): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subtreeShown")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
