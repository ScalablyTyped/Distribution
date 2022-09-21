package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestFunction extends StObject {
  
  def apply(fn: AsyncFunc | NormalFunc): this.type = js.native
  def apply(title: String, fn: AsyncFunc | NormalFunc): this.type = js.native
  
  def only(fn: AsyncFunc | NormalFunc): this.type = js.native
  def only(title: String, fn: AsyncFunc | NormalFunc): this.type = js.native
  @JSName("only")
  var only_Original: ExclusiveTestFunction = js.native
  
  def retries(n: Double): Unit = js.native
  
  def skip(fn: AsyncFunc | NormalFunc): this.type = js.native
  def skip(title: String, fn: AsyncFunc | NormalFunc): this.type = js.native
  @JSName("skip")
  var skip_Original: PendingTestFunction = js.native
}
