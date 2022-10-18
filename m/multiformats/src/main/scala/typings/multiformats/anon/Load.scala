package typings.multiformats.anon

import typings.multiformats.distTypesSrcTraversalMod.BlockView
import typings.multiformats.distTypesSrcTraversalMod.CID
import typings.multiformats.multiformatsInts.`1`
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Load extends StObject {
  
  var cid: CID[Double, Double, typings.multiformats.multiformatsInts.`0` | `1`]
  
  def load(cid: CID[Double, Double, typings.multiformats.multiformatsInts.`0` | `1`]): js.Promise[
    (BlockView[Any, Double, Double, typings.multiformats.multiformatsInts.`0` | `1`]) | Null
  ]
  
  var seen: js.UndefOr[Set[String]] = js.undefined
}
object Load {
  
  inline def apply(
    cid: CID[Double, Double, typings.multiformats.multiformatsInts.`0` | `1`],
    load: CID[Double, Double, typings.multiformats.multiformatsInts.`0` | `1`] => js.Promise[
      (BlockView[Any, Double, Double, typings.multiformats.multiformatsInts.`0` | `1`]) | Null
    ]
  ): Load = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], load = js.Any.fromFunction1(load))
    __obj.asInstanceOf[Load]
  }
  
  extension [Self <: Load](x: Self) {
    
    inline def setCid(value: CID[Double, Double, typings.multiformats.multiformatsInts.`0` | `1`]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setLoad(
      value: CID[Double, Double, typings.multiformats.multiformatsInts.`0` | `1`] => js.Promise[
          (BlockView[Any, Double, Double, typings.multiformats.multiformatsInts.`0` | `1`]) | Null
        ]
    ): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setSeen(value: Set[String]): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    
    inline def setSeenUndefined: Self = StObject.set(x, "seen", js.undefined)
  }
}
