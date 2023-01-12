package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIoSearchRecordMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/io/SearchRecord", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SearchRecord {
    
    /* CompleteClass */
    var isDirectory: Boolean = js.native
    
    /* CompleteClass */
    var modified: js.Date = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/io/SearchRecord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SearchRecord extends StObject {
    
    var isDirectory: Boolean
    
    var modified: js.Date
    
    var name: String
    
    var size: Double
  }
  object SearchRecord {
    
    inline def apply(isDirectory: Boolean, modified: js.Date, name: String, size: Double): SearchRecord = {
      val __obj = js.Dynamic.literal(isDirectory = isDirectory.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchRecord] (val x: Self) extends AnyVal {
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setModified(value: js.Date): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
