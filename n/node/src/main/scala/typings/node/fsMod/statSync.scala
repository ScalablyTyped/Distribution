package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "statSync")
@js.native
object statSync extends js.Object {
  
  def apply(path: PathLike): Stats = js.native
  def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
  def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
}
