package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// compatibility with older typings
@js.native
trait Timer extends RefCounted {
  
  def hasRef(): Boolean = js.native
  
  def refresh(): this.type = js.native
  
  @JSName(js.Symbol.toPrimitive)
  var toPrimitive: js.Function0[Double] = js.native
}
