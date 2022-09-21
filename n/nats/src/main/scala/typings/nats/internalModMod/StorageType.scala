package typings.nats.internalModMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "StorageType")
@js.native
object StorageType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.StorageType & String] = js.native
  
  /* "file" */ val File: typings.nats.typesMod.StorageType.File & String = js.native
  
  /* "memory" */ val Memory: typings.nats.typesMod.StorageType.Memory & String = js.native
}
