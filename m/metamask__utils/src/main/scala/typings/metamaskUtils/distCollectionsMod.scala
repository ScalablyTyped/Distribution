package typings.metamaskUtils

import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionsMod {
  
  @JSImport("@metamask/utils/dist/collections", "FrozenMap")
  @js.native
  open class FrozenMap[Key, Value] ()
    extends StObject
       with ReadonlyMap[Key, Value] {
    def this(entries: js.Array[js.Tuple2[Key, Value]]) = this()
    
    /* private */ var `private`: Any = js.native
    
    @JSName("size")
    def size_MFrozenMap: Double = js.native
  }
  
  /**
    * A {@link ReadonlySet} that cannot be modified after instantiation.
    * The implementation uses an inner set hidden via a private field, and the
    * immutability guarantee relies on it being impossible to get a reference
    * to this set.
    */
  @JSImport("@metamask/utils/dist/collections", "FrozenSet")
  @js.native
  open class FrozenSet[Value] ()
    extends StObject
       with ReadonlySet[Value] {
    def this(values: js.Array[Value]) = this()
    
    /* private */ var `private`: Any = js.native
    
    @JSName("size")
    def size_MFrozenSet: Double = js.native
  }
}
