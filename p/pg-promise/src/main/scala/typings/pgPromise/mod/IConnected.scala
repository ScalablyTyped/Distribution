package typings.pgPromise.mod

import typings.pgPromise.typescriptPgSubsetMod.IClient
import typings.spex.mod.ISpexBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Database object in connected state;
// API: https://vitaly-t.github.io/pg-promise/Database.html#connect
@js.native
trait IConnected[Ext, C /* <: IClient */]
  extends StObject
     with IBaseProtocol[Ext]
     with ISpexBase {
  
  val client: C = js.native
  
  // Note that for normal connections (working with the pool), method `done` accepts `kill`
  // flag to terminate the connection within the pool, so it can be auto-recreated;
  // And in this case the method returns nothing / void.
  // But for direct connections (connect({direct: true})), `kill` flag is ignored, because
  // the connection is always closed physically, which may take time, and so in this case
  // the method returns a Promise, to indicate when the connection finished closing.
  def done(): Unit | js.Promise[Unit] = js.native
  def done(kill: Boolean): Unit | js.Promise[Unit] = js.native
}
