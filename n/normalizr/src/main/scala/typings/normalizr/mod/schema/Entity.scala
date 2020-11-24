package typings.normalizr.mod.schema

import typings.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity[T] extends Schema_[T] {
  
  def _processStrategy(value: js.Any, parent: js.Any, key: String): T = js.native
  @JSName("_processStrategy")
  var _processStrategy_Original: StrategyFunction[T] = js.native
  
  def define(definition: Schema_[_]): Unit = js.native
  
  def getId(value: js.Any, parent: js.Any, key: String): String = js.native
  @JSName("getId")
  var getId_Original: SchemaFunction = js.native
  
  var key: String = js.native
}
