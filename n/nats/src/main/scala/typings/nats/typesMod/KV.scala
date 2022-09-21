package typings.nats.typesMod

import typings.nats.anon.PartialKvPutOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KV
  extends StObject
     with RoKV {
  
  def create(k: String, data: js.typedarray.Uint8Array): js.Promise[Double] = js.native
  
  def delete(k: String): js.Promise[Unit] = js.native
  
  def destroy(): js.Promise[Boolean] = js.native
  
  def purge(k: String): js.Promise[Unit] = js.native
  
  def put(k: String, data: js.typedarray.Uint8Array): js.Promise[Double] = js.native
  def put(k: String, data: js.typedarray.Uint8Array, opts: PartialKvPutOptions): js.Promise[Double] = js.native
  
  def update(k: String, data: js.typedarray.Uint8Array, version: Double): js.Promise[Double] = js.native
}
