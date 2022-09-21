package typings.pkcs7Padding

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pkcs7-padding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pad(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pad(data: String, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad(data: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def pad(data: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def unpad(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unpad")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unpad(data: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unpad")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
