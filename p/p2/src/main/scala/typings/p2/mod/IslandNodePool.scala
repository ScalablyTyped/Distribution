package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "IslandNodePool")
@js.native
class IslandNodePool () extends Pool {
  def this(options: PoolOptions) = this()
  
  def create(): IslandNode = js.native
  
  def destroy(node: IslandNode): IslandNodePool = js.native
}
