package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubQuery[T] extends StObject {
  
  def exists(): BinaryNode = js.native
  
  def from(statement: String): SubQuery[T] = js.native
  def from(table: TableNode): SubQuery[T] = js.native
  
  def group(nodes: Any*): SubQuery[T] = js.native
  
  def notExists(): BinaryNode = js.native
  def notExists(subQuery: SubQuery[Any]): BinaryNode = js.native
  
  def order(criteria: OrderByValueNode): SubQuery[T] = js.native
  
  def select(nodes: Any*): SubQuery[T] = js.native
  def select[Name](node: Column[Name, T]): SubQuery[T] = js.native
  
  def where(nodes: Any*): SubQuery[T] = js.native
}
