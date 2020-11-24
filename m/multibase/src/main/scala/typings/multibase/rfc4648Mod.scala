package typings.multibase

import typings.multibase.typesMod.Codec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase/dist/src/rfc4648", JSImport.Namespace)
@js.native
object rfc4648Mod extends js.Object {
  
  def rfc4648(bitsPerChar: Double): CodecFactory = js.native
  
  type CodecFactory = js.Function1[/* input */ String, Codec]
}
