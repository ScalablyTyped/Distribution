package typings.natUpnp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CB[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* res */ js.UndefOr[T], scala.Unit]
  
  type DeletePortMappingOpts = typings.natUpnp.mod.StandardOpts
  
  type RawResponse = typings.std.Partial[typings.std.Record[java.lang.String, typings.natUpnp.anon.Dictkey]]
}
