package typings.node.fsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "appendFile")
@js.native
object appendFile extends js.Object {
  
  def apply(file: Double, data: String, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: Uint8Array, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: Uint8Array, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: String, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: Uint8Array, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: Uint8Array, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
}
