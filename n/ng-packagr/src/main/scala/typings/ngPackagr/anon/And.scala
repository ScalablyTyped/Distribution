package typings.ngPackagr.anon

import typings.ngPackagr.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends StObject {
  
  def apply(node: Node): Boolean = js.native
  
  def and(criteria: js.Function1[/* node */ Node, Boolean]): js.Function1[/* node */ Node, Boolean] = js.native
}
