package typings.ngPackagr

import typings.ngPackagr.anon.And
import typings.ngPackagr.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("ng-packagr/lib/graph/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def and(criteria: (js.Function1[/* node */ Node, Boolean])*): js.Function1[/* node */ Node, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(criteria.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* node */ Node, Boolean]]
  
  inline def by(criteria: js.Function1[/* node */ Node, Boolean]): And = ^.asInstanceOf[js.Dynamic].applyDynamic("by")(criteria.asInstanceOf[js.Any]).asInstanceOf[And]
  
  inline def isDirty(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirty")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDone(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDone")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInProgress(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInProgress")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPending(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPending")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
