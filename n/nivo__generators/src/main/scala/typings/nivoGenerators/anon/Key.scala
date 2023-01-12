package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var random: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var shuffle: js.UndefOr[js.Array[String]] = js.undefined
}
object Key {
  
  inline def apply(key: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRandom(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    inline def setShuffle(value: js.Array[String]): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    
    inline def setShuffleVarargs(value: String*): Self = StObject.set(x, "shuffle", js.Array(value*))
  }
}
