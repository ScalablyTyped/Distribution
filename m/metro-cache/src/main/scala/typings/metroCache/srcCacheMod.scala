package typings.metroCache

import typings.metroCache.srcTypesMod.CacheStore
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCacheMod {
  
  @JSImport("metro-cache/src/Cache", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Cache[T] {
    def this(stores: js.Array[CacheStore[T]]) = this()
  }
  
  @js.native
  trait Cache[T] extends StObject {
    
    def get(key: Buffer): js.Promise[T | Null] = js.native
    
    def isDisabled: Boolean = js.native
    
    def set(key: Buffer, value: T): Unit = js.native
  }
}
