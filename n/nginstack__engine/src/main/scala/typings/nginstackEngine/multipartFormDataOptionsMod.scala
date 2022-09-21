package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipartFormDataOptionsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormDataOptions", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MultipartFormDataOptions {
    def this(options: Any) = this()
    
    /* CompleteClass */
    var maxEntries: Double = js.native
    
    /* CompleteClass */
    var maxFileSize: Double = js.native
    
    /* CompleteClass */
    var maxTotalSize: Double = js.native
    
    /* CompleteClass */
    var maxValueSize: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormDataOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MultipartFormDataOptions extends StObject {
    
    var maxEntries: Double
    
    var maxFileSize: Double
    
    var maxTotalSize: Double
    
    var maxValueSize: Double
  }
  object MultipartFormDataOptions {
    
    inline def apply(maxEntries: Double, maxFileSize: Double, maxTotalSize: Double, maxValueSize: Double): MultipartFormDataOptions = {
      val __obj = js.Dynamic.literal(maxEntries = maxEntries.asInstanceOf[js.Any], maxFileSize = maxFileSize.asInstanceOf[js.Any], maxTotalSize = maxTotalSize.asInstanceOf[js.Any], maxValueSize = maxValueSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartFormDataOptions]
    }
    
    extension [Self <: MultipartFormDataOptions](x: Self) {
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxTotalSize(value: Double): Self = StObject.set(x, "maxTotalSize", value.asInstanceOf[js.Any])
      
      inline def setMaxValueSize(value: Double): Self = StObject.set(x, "maxValueSize", value.asInstanceOf[js.Any])
    }
  }
}
