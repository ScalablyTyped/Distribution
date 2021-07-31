package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinTableNode
  extends StObject
     with TableNode {
  
  def on(filter: String): TableNode = js.native
  def on(filter: BinaryNode): TableNode = js.native
}
