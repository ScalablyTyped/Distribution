package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipartFormDataPartMod {
  
  inline def apply(reader: Any, readFunc: js.Function1[/* arg0 */ Double, String], headers: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(reader.asInstanceOf[js.Any], readFunc.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormDataPart", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MultipartFormDataPart {
    def this(reader: Any, readFunc: js.Function1[/* arg0 */ Double, String], headers: Any) = this()
  }
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormDataPart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type File = typings.nginstackEngine.fileMod.^
  
  @js.native
  trait MultipartFormDataPart extends StObject {
    
    /* private */ var contentDisposition_ : Any = js.native
    
    var fileName: String = js.native
    
    /* private */ var fileName_ : Any = js.native
    
    var headers: Any = js.native
    
    /* private */ var headers_ : Any = js.native
    
    /* private */ var initializeContentDisposition_ : Any = js.native
    
    /* private */ var initializeParamsNameAndFileName_ : Any = js.native
    
    var name: String = js.native
    
    /* private */ var name_ : Any = js.native
    
    /* private */ var options_ : Any = js.native
    
    def read(size: Double): String = js.native
    
    def readBytes(size: Double): js.typedarray.Uint8Array = js.native
    
    /* private */ var readFunc_ : Any = js.native
    
    /* private */ var reader_ : Any = js.native
    
    def saveToFile(file: File): Unit = js.native
    def saveToFile(file: File, opt_maxFileSize: Double): Unit = js.native
  }
}
