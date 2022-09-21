package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileInfoMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/process/FileInfo", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FileInfo {
    
    /* CompleteClass */
    var displayFileName: String = js.native
    
    /* CompleteClass */
    var expired: Boolean = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var requestTime: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/process/FileInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/process/FileInfo", "FILE")
  @js.native
  val FILE: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/process/FileInfo", "SCRIPT")
  @js.native
  val SCRIPT: Double = js.native
  
  trait FileInfo extends StObject {
    
    var displayFileName: String
    
    var expired: Boolean
    
    var path: String
    
    var requestTime: Any
  }
  object FileInfo {
    
    inline def apply(displayFileName: String, expired: Boolean, path: String, requestTime: Any): FileInfo = {
      val __obj = js.Dynamic.literal(displayFileName = displayFileName.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setDisplayFileName(value: String): Self = StObject.set(x, "displayFileName", value.asInstanceOf[js.Any])
      
      inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRequestTime(value: Any): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    }
  }
}
