package typings.pinyinEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pinyin-engine", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with PinyinEngine {
    def this(dataList: js.Array[String | js.Object]) = this()
    def this(dataList: js.Array[String | js.Object], keyList: js.Array[String]) = this()
    def this(dataList: Unit, keyList: js.Array[String]) = this()
    
    /* CompleteClass */
    override def query(`val`: String): js.Array[String] = js.native
  }
  
  trait PinyinEngine extends StObject {
    
    def query(`val`: String): js.Array[String]
  }
  object PinyinEngine {
    
    inline def apply(query: String => js.Array[String]): PinyinEngine = {
      val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
      __obj.asInstanceOf[PinyinEngine]
    }
    
    extension [Self <: PinyinEngine](x: Self) {
      
      inline def setQuery(value: String => js.Array[String]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    }
  }
}
