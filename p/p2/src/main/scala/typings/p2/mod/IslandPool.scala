package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "IslandPool")
@js.native
class IslandPool () extends Pool {
  def this(options: PoolOptions) = this()
  
  def create(): Island = js.native
  
  def destroy(island: Island): IslandPool = js.native
}
