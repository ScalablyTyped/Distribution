package typings.nodeFibers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fibers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(fn: js.Function): Fiber = js.native
  
  var current: Fiber = js.native
  
  def `yield`(): js.Any = js.native
  def `yield`(value: js.Any): js.Any = js.native
}
