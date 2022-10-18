package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseLargeObjectMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/LargeObject", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LargeObject {
    
    /* CompleteClass */
    var content: String = js.native
    
    /* CompleteClass */
    var extraAttributes: Any = js.native
    
    /* CompleteClass */
    var key: Double = js.native
    
    /* CompleteClass */
    var mimeType: Double | Null = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("@nginstack/engine/lib/database/LargeObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LargeObject extends StObject {
    
    var content: String
    
    var extraAttributes: Any
    
    var key: Double
    
    var mimeType: Double | Null
    
    var name: String
  }
  object LargeObject {
    
    inline def apply(content: String, extraAttributes: Any, key: Double, name: String): LargeObject = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extraAttributes = extraAttributes.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], mimeType = null)
      __obj.asInstanceOf[LargeObject]
    }
    
    extension [Self <: LargeObject](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setExtraAttributes(value: Any): Self = StObject.set(x, "extraAttributes", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: Double): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
