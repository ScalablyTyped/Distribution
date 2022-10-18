package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomNamedNodeMapMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/NamedNodeMap", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NamedNodeMap {
    
    /* CompleteClass */
    override def getNamedItem(qualifiedName: String): Attr = js.native
    
    /* CompleteClass */
    override def item(index: Double): Attr = js.native
    
    /* CompleteClass */
    override val length: Double = js.native
    
    /* CompleteClass */
    override def removeNamedItem(qualifiedName: String): Attr = js.native
    
    /* CompleteClass */
    override def setNamedItem(attr: Attr): Attr = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/NamedNodeMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Attr = typings.nginstackEngine.libDomAttrMod.^
  
  trait NamedNodeMap extends StObject {
    
    def getNamedItem(qualifiedName: String): Attr
    
    def item(index: Double): Attr
    
    val length: Double
    
    def removeNamedItem(qualifiedName: String): Attr
    
    def setNamedItem(attr: Attr): Attr
  }
  object NamedNodeMap {
    
    inline def apply(
      getNamedItem: String => Attr,
      item: Double => Attr,
      length: Double,
      removeNamedItem: String => Attr,
      setNamedItem: Attr => Attr
    ): NamedNodeMap = {
      val __obj = js.Dynamic.literal(getNamedItem = js.Any.fromFunction1(getNamedItem), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], removeNamedItem = js.Any.fromFunction1(removeNamedItem), setNamedItem = js.Any.fromFunction1(setNamedItem))
      __obj.asInstanceOf[NamedNodeMap]
    }
    
    extension [Self <: NamedNodeMap](x: Self) {
      
      inline def setGetNamedItem(value: String => Attr): Self = StObject.set(x, "getNamedItem", js.Any.fromFunction1(value))
      
      inline def setItem(value: Double => Attr): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRemoveNamedItem(value: String => Attr): Self = StObject.set(x, "removeNamedItem", js.Any.fromFunction1(value))
      
      inline def setSetNamedItem(value: Attr => Attr): Self = StObject.set(x, "setNamedItem", js.Any.fromFunction1(value))
    }
  }
}
