package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexQuery extends StObject {
  
  def create(): IndexCreationQuery = js.native
  def create(indexName: String): IndexCreationQuery = js.native
  
  def drop(columns: (Column[Any, Any])*): Executable = js.native
  def drop(indexName: String): Executable = js.native
}
