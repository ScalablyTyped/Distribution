package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nats.typesMod.PurgeBySeq
  - typings.nats.typesMod.PurgeTrimOpts
  - typings.nats.typesMod.PurgeBySubject
*/
trait PurgeOpts extends StObject
object PurgeOpts {
  
  inline def PurgeBySeq(seq: Double): typings.nats.typesMod.PurgeBySeq = {
    val __obj = js.Dynamic.literal(seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nats.typesMod.PurgeBySeq]
  }
  
  inline def PurgeBySubject(filter: String): typings.nats.typesMod.PurgeBySubject = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nats.typesMod.PurgeBySubject]
  }
  
  inline def PurgeTrimOpts(keep: Double): typings.nats.typesMod.PurgeTrimOpts = {
    val __obj = js.Dynamic.literal(keep = keep.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nats.typesMod.PurgeTrimOpts]
  }
}
