package typings.oracleOraclejet

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojkeyset", JSImport.Namespace)
@js.native
object ojkeysetMod extends js.Object {
  
  @js.native
  class ExpandAllKeySet[K] () extends KeySet[K] {
    
    def deletedValues(): Set[K] = js.native
  }
  
  @js.native
  class ExpandedKeySet[K] () extends KeySet[K] {
    def this(keys: js.Array[K]) = this()
    def this(keys: Set[K]) = this()
    
    def values(): Set[K] = js.native
  }
  
  @js.native
  abstract class KeySet[K] () extends js.Object {
    
    def add(keys: js.Array[K]): KeySet[K] = js.native
    def add(keys: Set[K]): KeySet[K] = js.native
    
    def addAll(): KeySet[K] = js.native
    
    def clear(): KeySet[K] = js.native
    
    def delete(keys: js.Array[K]): KeySet[K] = js.native
    def delete(keys: Set[K]): KeySet[K] = js.native
    
    def has(key: K): Boolean = js.native
    
    def isAddAll(): Boolean = js.native
  }
}
