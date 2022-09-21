package typings.mnemonist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lruMapWithDeleteMod {
  
  @JSImport("mnemonist/lru-map-with-delete", JSImport.Default)
  @js.native
  open class default[K, V] () extends LRUMapWithDelete[K, V]
  
  @js.native
  trait LRUMapWithDelete[K, V]
    extends typings.mnemonist.lruMapMod.default[K, V] {
    
    def delete(key: K): Boolean = js.native
    
    def remove[T](key: K): V | T = js.native
    def remove[T](key: K, missing: T): V | T = js.native
  }
}
