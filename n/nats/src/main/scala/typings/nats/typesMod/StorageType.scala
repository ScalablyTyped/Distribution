package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageType extends StObject
@JSImport("nats/lib/nats-base-client/types", "StorageType")
@js.native
object StorageType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StorageType & String] = js.native
  
  @js.native
  sealed trait File
    extends StObject
       with StorageType
  /* "file" */ val File: typings.nats.typesMod.StorageType.File & String = js.native
  
  @js.native
  sealed trait Memory
    extends StObject
       with StorageType
  /* "memory" */ val Memory: typings.nats.typesMod.StorageType.Memory & String = js.native
}
