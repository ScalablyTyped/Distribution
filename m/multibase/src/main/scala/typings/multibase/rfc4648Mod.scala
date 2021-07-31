package typings.multibase

import typings.multibase.typesMod.Codec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rfc4648Mod {
  
  @JSImport("multibase/dist/src/rfc4648", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def rfc4648(bitsPerChar: Double): CodecFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc4648")(bitsPerChar.asInstanceOf[js.Any]).asInstanceOf[CodecFactory]
  
  type CodecFactory = js.Function1[/* input */ String, Codec]
}
