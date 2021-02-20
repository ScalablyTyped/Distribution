package typings.nodeJose.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("node-jose", "util.asBuffer")
  @js.native
  def asBuffer(input: String): Buffer = js.native
  @JSImport("node-jose", "util.asBuffer")
  @js.native
  def asBuffer(input: String, encoding: String): Buffer = js.native
  @JSImport("node-jose", "util.asBuffer")
  @js.native
  def asBuffer(input: Buffer): Buffer = js.native
  @JSImport("node-jose", "util.asBuffer")
  @js.native
  def asBuffer(input: Buffer, encoding: String): Buffer = js.native
  
  object base64url {
    
    @JSImport("node-jose", "util.base64url.decode")
    @js.native
    def decode(base64url: String): Buffer = js.native
    
    @JSImport("node-jose", "util.base64url.encode")
    @js.native
    def encode(buffer: String): String = js.native
    @JSImport("node-jose", "util.base64url.encode")
    @js.native
    def encode(buffer: String, encoding: String): String = js.native
    @JSImport("node-jose", "util.base64url.encode")
    @js.native
    def encode(buffer: Buffer): String = js.native
    @JSImport("node-jose", "util.base64url.encode")
    @js.native
    def encode(buffer: Buffer, encoding: String): String = js.native
  }
  
  @JSImport("node-jose", "util.randomBytes")
  @js.native
  def randomBytes(len: Double): Buffer = js.native
  
  object utf8 {
    
    @JSImport("node-jose", "util.utf8.decode")
    @js.native
    def decode(input: String): String = js.native
    
    @JSImport("node-jose", "util.utf8.encode")
    @js.native
    def encode(input: String): String = js.native
  }
}
