package typings.multiformats

import typings.multiformats.multiformatsNumbers.`512`
import typings.multiformats.multiformatsStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("multiformats/types/src/codecs/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/types/src/codecs/json", "code")
  @js.native
  val code: `512` = js.native
  
  inline def decode[T](data: ByteView[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def encode[T](node: T): ByteView[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[ByteView[T]]
  
  @JSImport("multiformats/types/src/codecs/json", "name")
  @js.native
  val name: json = js.native
  
  type ByteView[T] = typings.multiformats.codecsInterfaceMod.ByteView[T]
}
