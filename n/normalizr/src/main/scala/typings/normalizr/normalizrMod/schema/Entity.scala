package typings.normalizr.normalizrMod.schema

import typings.normalizr.normalizrMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity[T] extends Schema[T] {
  @JSName("_processStrategy")
  var _processStrategy_Original: StrategyFunction[T] = js.native
  @JSName("getId")
  var getId_Original: SchemaFunction = js.native
  var key: String = js.native
  def _processStrategy(value: js.Any, parent: js.Any, key: String): T = js.native
  def define(definition: Schema[_]): Unit = js.native
  def getId(value: js.Any, parent: js.Any, key: String): String = js.native
}

