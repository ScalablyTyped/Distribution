package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInfoResponse
  extends StObject
     with ApiResponse
     with JetStreamAccountStats
object AccountInfoResponse {
  
  inline def apply(
    api: JetStreamApiStats,
    consumers: Double,
    limits: AccountLimits,
    memory: Double,
    storage: Double,
    streams: Double,
    `type`: String
  ): AccountInfoResponse = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], consumers = consumers.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfoResponse]
  }
}
