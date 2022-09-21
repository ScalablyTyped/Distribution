package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SerializationType extends StObject
@JSImport("peerjs", "SerializationType")
@js.native
object SerializationType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SerializationType & String] = js.native
  
  @js.native
  sealed trait Binary
    extends StObject
       with SerializationType
  /* "binary" */ val Binary: typings.peerjs.mod.SerializationType.Binary & String = js.native
  
  @js.native
  sealed trait BinaryUTF8
    extends StObject
       with SerializationType
  /* "binary-utf8" */ val BinaryUTF8: typings.peerjs.mod.SerializationType.BinaryUTF8 & String = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with SerializationType
  /* "json" */ val JSON: typings.peerjs.mod.SerializationType.JSON & String = js.native
}
