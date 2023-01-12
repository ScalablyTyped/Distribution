package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterFilterMod {
  
  /* note: abstract class */ @JSImport("ol/format/filter/Filter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Filter {
    def this(tagName: String) = this()
    
    /**
      * The XML tag name for a filter.
      */
    /* CompleteClass */
    override def getTagName(): String = js.native
  }
  
  trait Filter extends StObject {
    
    /**
      * The XML tag name for a filter.
      */
    def getTagName(): String
  }
  object Filter {
    
    inline def apply(getTagName: () => String): Filter = {
      val __obj = js.Dynamic.literal(getTagName = js.Any.fromFunction0(getTagName))
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      inline def setGetTagName(value: () => String): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
    }
  }
}
