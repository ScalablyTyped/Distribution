package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileStorageFileInfoMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/file-storage/FileInfo", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FileInfo {
    
    /* CompleteClass */
    var attributes: Any = js.native
    
    /* CompleteClass */
    var key: Double = js.native
    
    /* CompleteClass */
    var main: Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var url: String = js.native
  }
  @JSImport("@nginstack/engine/lib/file-storage/FileInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FileInfo extends StObject {
    
    var attributes: Any
    
    var key: Double
    
    var main: Boolean
    
    var name: String
    
    var size: Double
    
    var url: String
  }
  object FileInfo {
    
    inline def apply(attributes: Any, key: Double, main: Boolean, name: String, size: Double, url: String): FileInfo = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMain(value: Boolean): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
