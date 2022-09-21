package typings.memfs

import org.scalablytyped.runtime.Instantiable1
import typings.memfs.volumeMod.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeLocalstorageMod {
  
  @JSImport("memfs/lib/volume-localstorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("memfs/lib/volume-localstorage", "ObjectStore")
  @js.native
  open class ObjectStore protected () extends StObject {
    def this(obj: Any) = this()
    
    def getItem(key: String): Any = js.native
    
    var obj: js.Object = js.native
    
    def removeItem(key: String): Unit = js.native
    
    def setItem(key: String, json: Any): Unit = js.native
  }
  
  inline def createVolume(namespace: String): Instantiable1[/* args (repeated) */ Any, Volume] = ^.asInstanceOf[js.Dynamic].applyDynamic("createVolume")(namespace.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* args (repeated) */ Any, Volume]]
  inline def createVolume(namespace: String, LS: js.Object): Instantiable1[/* args (repeated) */ Any, Volume] = (^.asInstanceOf[js.Dynamic].applyDynamic("createVolume")(namespace.asInstanceOf[js.Any], LS.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args (repeated) */ Any, Volume]]
  inline def createVolume(namespace: String, LS: IStore): Instantiable1[/* args (repeated) */ Any, Volume] = (^.asInstanceOf[js.Dynamic].applyDynamic("createVolume")(namespace.asInstanceOf[js.Any], LS.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args (repeated) */ Any, Volume]]
  
  trait IStore extends StObject {
    
    def getItem(key: String): Any
    
    def removeItem(key: String): Any
    
    def setItem(key: String, json: Any): Any
  }
  object IStore {
    
    inline def apply(getItem: String => Any, removeItem: String => Any, setItem: (String, Any) => Any): IStore = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[IStore]
    }
    
    extension [Self <: IStore](x: Self) {
      
      inline def setGetItem(value: String => Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => Any): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, Any) => Any): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
