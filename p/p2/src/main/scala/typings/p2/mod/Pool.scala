package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Pool")
@js.native
open class Pool () extends StObject {
  def this(options: PoolOptions) = this()
  
  def get(): Any = js.native
  
  var objects: js.Array[Any] = js.native
  
  def release(`object`: Any): Pool = js.native
  
  def resize(size: Double): Pool = js.native
}
