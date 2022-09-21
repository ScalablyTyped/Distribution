package typings.multiformats.anon

import typings.multiformats.blockMod.Block
import typings.multiformats.traversalMod.CID
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Load[T] extends StObject {
  
  var cid: CID
  
  def load(cid: CID): js.Promise[Block[T] | Null]
  
  var seen: js.UndefOr[Set[String]] = js.undefined
}
object Load {
  
  inline def apply[T](cid: CID, load: CID => js.Promise[Block[T] | Null]): Load[T] = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], load = js.Any.fromFunction1(load))
    __obj.asInstanceOf[Load[T]]
  }
  
  extension [Self <: Load[?], T](x: Self & Load[T]) {
    
    inline def setCid(value: CID): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: CID => js.Promise[Block[T] | Null]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setSeen(value: Set[String]): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    
    inline def setSeenUndefined: Self = StObject.set(x, "seen", js.undefined)
  }
}
