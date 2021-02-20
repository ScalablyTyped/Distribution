package typings.pkcs7Padding

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pkcs7-padding", "pad")
  @js.native
  def pad(data: String, size: Double): String = js.native
  @JSImport("pkcs7-padding", "pad")
  @js.native
  def pad(data: Buffer, size: Double): Buffer = js.native
  
  @JSImport("pkcs7-padding", "unpad")
  @js.native
  def unpad(data: String): String = js.native
  @JSImport("pkcs7-padding", "unpad")
  @js.native
  def unpad(data: Buffer): Buffer = js.native
}
