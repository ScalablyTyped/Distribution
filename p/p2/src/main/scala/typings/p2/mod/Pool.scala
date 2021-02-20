package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Pool")
@js.native
class Pool () extends StObject {
  def this(options: PoolOptions) = this()
  
  def get(): js.Any = js.native
  
  var objects: js.Array[_] = js.native
  
  def release(`object`: js.Any): Pool = js.native
  
  def resize(size: Double): Pool = js.native
}
