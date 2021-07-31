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
  class ObjectStore protected () extends StObject {
    def this(obj: js.Any) = this()
    
    def getItem(key: String): js.Any = js.native
    
    var obj: js.Object = js.native
    
    def removeItem(key: String): Unit = js.native
    
    def setItem(key: String, json: js.Any): Unit = js.native
  }
  
  @scala.inline
  def createVolume(namespace: String): Instantiable1[/* args (repeated) */ js.Any, Volume] = ^.asInstanceOf[js.Dynamic].applyDynamic("createVolume")(namespace.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* args (repeated) */ js.Any, Volume]]
  @scala.inline
  def createVolume(namespace: String, LS: js.Object): Instantiable1[/* args (repeated) */ js.Any, Volume] = (^.asInstanceOf[js.Dynamic].applyDynamic("createVolume")(namespace.asInstanceOf[js.Any], LS.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args (repeated) */ js.Any, Volume]]
  @scala.inline
  def createVolume(namespace: String, LS: IStore): Instantiable1[/* args (repeated) */ js.Any, Volume] = (^.asInstanceOf[js.Dynamic].applyDynamic("createVolume")(namespace.asInstanceOf[js.Any], LS.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args (repeated) */ js.Any, Volume]]
  
  trait IStore extends StObject {
    
    def getItem(key: String): js.Any
    
    def removeItem(key: String): js.Any
    
    def setItem(key: String, json: js.Any): js.Any
  }
  object IStore {
    
    @scala.inline
    def apply(getItem: String => js.Any, removeItem: String => js.Any, setItem: (String, js.Any) => js.Any): IStore = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[IStore]
    }
    
    @scala.inline
    implicit class IStoreMutableBuilder[Self <: IStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: String => js.Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveItem(value: String => js.Any): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItem(value: (String, js.Any) => js.Any): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
