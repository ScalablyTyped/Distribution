package typings.node.fsMod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "writeFile")
@js.native
object writeFile extends js.Object {
  
  def apply(path: Double, data: String, callback: NoParamCallback): Unit = js.native
  def apply(path: Double, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(path: Double, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
  def apply(path: Double, data: ArrayBufferView, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, data: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, data: ArrayBufferView, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
}
