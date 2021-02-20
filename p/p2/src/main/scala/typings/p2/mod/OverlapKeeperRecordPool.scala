package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "OverlapKeeperRecordPool")
@js.native
class OverlapKeeperRecordPool () extends Pool {
  def this(options: PoolOptions) = this()
  
  def create(): OverlapKeeperRecord = js.native
  
  def destroy(record: OverlapKeeperRecord): OverlapKeeperRecordPool = js.native
}
