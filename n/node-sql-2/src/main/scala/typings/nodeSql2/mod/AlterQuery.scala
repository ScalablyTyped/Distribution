package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlterQuery[T]
  extends StObject
     with Executable {
  
  def addColumn(column: Column[js.Any, js.Any]): AlterQuery[T] = js.native
  def addColumn(name: String, options: String): AlterQuery[T] = js.native
  
  def dropColumn(column: String): AlterQuery[T] = js.native
  def dropColumn(column: Column[js.Any, js.Any]): AlterQuery[T] = js.native
  
  def rename(newName: String): AlterQuery[T] = js.native
  
  def renameColumn(column: Column[js.Any, js.Any], newColumn: Column[js.Any, js.Any]): AlterQuery[T] = js.native
  def renameColumn(column: Column[js.Any, js.Any], newName: String): AlterQuery[T] = js.native
  def renameColumn(name: String, newName: String): AlterQuery[T] = js.native
}
