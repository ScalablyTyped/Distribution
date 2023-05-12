package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvDynamicBitsetMod {
  
  @JSImport("mirada/dist/src/types/opencv/DynamicBitset", "DynamicBitset")
  @js.native
  /**
    *   default constructor
    */
  open class DynamicBitset () extends StObject {
    /**
      *   only constructor we use in our code
      *
      * @param sz the size of the bitset (in bits)
      */
    def this(sz: sizeT) = this()
    
    /**
      *   Sets all the bits to 0
      */
    def clear(): Unit = js.native
    
    /**
      *   true if the bitset is empty
      */
    def empty(): bool = js.native
    
    /**
      *   set all the bits to 0
      */
    def reset(): Unit = js.native
    def reset(index: sizeT): Unit = js.native
    
    def reset_block(index: sizeT): Unit = js.native
    
    /**
      *   resize the bitset so that it contains at least sz bits
      */
    def resize(sz: sizeT): Unit = js.native
    
    /**
      *   set a bit to true
      *
      * @param index the index of the bit to set to 1
      */
    def set(index: sizeT): Unit = js.native
    
    /**
      *   gives the number of contained bits
      */
    def size(): sizeT = js.native
    
    /**
      *   check if a bit is set
      *
      *   true if the bit is set
      *
      * @param index the index of the bit to check
      */
    def test(index: sizeT): bool = js.native
  }
}
