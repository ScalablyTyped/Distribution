package typings.parcelCache

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Cache extends StObject {
    
    def ensure(): js.Promise[Unit] = js.native
    
    def get[T](key: String): js.Promise[js.UndefOr[T | Null]] = js.native
    
    def getBlob(key: String): js.Promise[Buffer] = js.native
    
    def getBuffer(key: String): js.Promise[js.UndefOr[Buffer | Null]] = js.native
    
    def getLargeBlob(key: String): js.Promise[Buffer] = js.native
    
    def getStream(key: String): Readable = js.native
    
    def has(key: String): js.Promise[Boolean] = js.native
    
    def hasLargeBlob(key: String): js.Promise[Boolean] = js.native
    
    def set(key: String, value: Any): js.Promise[Unit] = js.native
    
    def setBlob(key: String, contents: String): js.Promise[Unit] = js.native
    def setBlob(key: String, contents: Buffer): js.Promise[Unit] = js.native
    
    def setLargeBlob(key: String, contents: String): js.Promise[Unit] = js.native
    def setLargeBlob(key: String, contents: Buffer): js.Promise[Unit] = js.native
    
    def setStream(key: String, stream: Readable): js.Promise[Unit] = js.native
  }
}
