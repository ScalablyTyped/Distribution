package typings.nats.typesMod

import typings.nats.anon.PartialKvOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Views extends StObject {
  
  def kv(name: String): js.Promise[KV] = js.native
  def kv(name: String, opts: PartialKvOptions): js.Promise[KV] = js.native
}
