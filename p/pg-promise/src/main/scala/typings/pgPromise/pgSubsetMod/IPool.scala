package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface IPool, as per the following implementation:
// https://github.com/brianc/node-postgres/blob/master/packages/pg-pool/index.js#L61
// NOTE: We declare only what can be used from pg-promise
@js.native
trait IPool extends EventEmitter {
  
  def end(): js.Promise[Unit] = js.native
  def end(cb: js.Function1[/* err */ Error, js.Any]): js.Any = js.native
  
  // connection options
  val ended: Boolean = js.native
  
  val ending: Boolean = js.native
  
  val idleCount: Double = js.native
  
  val options: StringDictionary[js.Any] = js.native
  
  val totalCount: Double = js.native
  
  val waitingCount: Double = js.native
}
