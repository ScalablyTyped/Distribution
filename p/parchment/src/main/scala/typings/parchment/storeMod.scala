package typings.parchment

import org.scalablytyped.runtime.StringDictionary
import typings.parchment.blotMod.Formattable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMod {
  
  @JSImport("parchment/dist/typings/attributor/store", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AttributorStore {
    def this(domNode: HTMLElement) = this()
    
    /* CompleteClass */
    override def attribute(attribute: typings.parchment.attributorMod.default, value: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var attributes: Any = js.native
    
    /* CompleteClass */
    override def build(): Unit = js.native
    
    /* CompleteClass */
    override def copy(target: Formattable): Unit = js.native
    
    /* private */ /* CompleteClass */
    var domNode: Any = js.native
    
    /* CompleteClass */
    override def move(target: Formattable): Unit = js.native
    
    /* CompleteClass */
    override def values(): StringDictionary[Any] = js.native
  }
  
  trait AttributorStore extends StObject {
    
    def attribute(attribute: typings.parchment.attributorMod.default, value: Any): Unit
    
    /* private */ var attributes: Any
    
    def build(): Unit
    
    def copy(target: Formattable): Unit
    
    /* private */ var domNode: Any
    
    def move(target: Formattable): Unit
    
    def values(): StringDictionary[Any]
  }
  object AttributorStore {
    
    inline def apply(
      attribute: (typings.parchment.attributorMod.default, Any) => Unit,
      attributes: Any,
      build: () => Unit,
      copy: Formattable => Unit,
      domNode: Any,
      move: Formattable => Unit,
      values: () => StringDictionary[Any]
    ): AttributorStore = {
      val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), attributes = attributes.asInstanceOf[js.Any], build = js.Any.fromFunction0(build), copy = js.Any.fromFunction1(copy), domNode = domNode.asInstanceOf[js.Any], move = js.Any.fromFunction1(move), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[AttributorStore]
    }
    
    extension [Self <: AttributorStore](x: Self) {
      
      inline def setAttribute(value: (typings.parchment.attributorMod.default, Any) => Unit): Self = StObject.set(x, "attribute", js.Any.fromFunction2(value))
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setBuild(value: () => Unit): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      inline def setCopy(value: Formattable => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setDomNode(value: Any): Self = StObject.set(x, "domNode", value.asInstanceOf[js.Any])
      
      inline def setMove(value: Formattable => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      inline def setValues(value: () => StringDictionary[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
