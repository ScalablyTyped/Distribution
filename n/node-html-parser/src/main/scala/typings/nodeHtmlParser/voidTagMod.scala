package typings.nodeHtmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object voidTagMod {
  
  @JSImport("node-html-parser/dist/void-tag", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VoidTag {
    def this(addClosingSlash: Boolean) = this()
    def this(addClosingSlash: Boolean, tags: js.Array[String]) = this()
    def this(addClosingSlash: Unit, tags: js.Array[String]) = this()
    
    /* CompleteClass */
    var addClosingSlash: Boolean = js.native
    
    /* CompleteClass */
    override def formatNode(tag: String, attrs: String, innerHTML: String): String = js.native
    
    /* CompleteClass */
    override def isVoidElement(tag: String): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var voidTags: Any = js.native
  }
  
  trait VoidTag extends StObject {
    
    var addClosingSlash: Boolean
    
    def formatNode(tag: String, attrs: String, innerHTML: String): String
    
    def isVoidElement(tag: String): Boolean
    
    /* private */ var voidTags: Any
  }
  object VoidTag {
    
    inline def apply(
      addClosingSlash: Boolean,
      formatNode: (String, String, String) => String,
      isVoidElement: String => Boolean,
      voidTags: Any
    ): VoidTag = {
      val __obj = js.Dynamic.literal(addClosingSlash = addClosingSlash.asInstanceOf[js.Any], formatNode = js.Any.fromFunction3(formatNode), isVoidElement = js.Any.fromFunction1(isVoidElement), voidTags = voidTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoidTag]
    }
    
    extension [Self <: VoidTag](x: Self) {
      
      inline def setAddClosingSlash(value: Boolean): Self = StObject.set(x, "addClosingSlash", value.asInstanceOf[js.Any])
      
      inline def setFormatNode(value: (String, String, String) => String): Self = StObject.set(x, "formatNode", js.Any.fromFunction3(value))
      
      inline def setIsVoidElement(value: String => Boolean): Self = StObject.set(x, "isVoidElement", js.Any.fromFunction1(value))
      
      inline def setVoidTags(value: Any): Self = StObject.set(x, "voidTags", value.asInstanceOf[js.Any])
    }
  }
}
