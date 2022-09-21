package typings.nginstackEngine

import typings.nginstackEngine.anon.Boundary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipartFormDataReaderMod {
  
  inline def apply(content: String): Unit = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(content: String, options: Boundary): Unit = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(content: typings.nginstackEngine.fileMod.^): Unit = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(content: typings.nginstackEngine.fileMod.^, options: Boundary): Unit = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(content: typings.nginstackEngine.httpRequestMod.^): Unit = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(content: typings.nginstackEngine.httpRequestMod.^, options: Boundary): Unit = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormDataReader", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MultipartFormDataReader {
    def this(content: String) = this()
    def this(content: typings.nginstackEngine.fileMod.^) = this()
    def this(content: typings.nginstackEngine.httpRequestMod.^) = this()
    def this(content: String, options: Boundary) = this()
    def this(content: typings.nginstackEngine.fileMod.^, options: Boundary) = this()
    def this(content: typings.nginstackEngine.httpRequestMod.^, options: Boundary) = this()
  }
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormDataReader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait MultipartFormDataReader extends StObject {
    
    /* private */ var boundary_ : Any = js.native
    
    /* private */ var buffer_ : Any = js.native
    
    /* private */ var charset_ : Any = js.native
    
    /* private */ var contentLength_ : Any = js.native
    
    /* private */ var content_ : Any = js.native
    
    /* private */ var currentPart_ : Any = js.native
    
    /* private */ var dashBoundaryDash_ : Any = js.native
    
    /* private */ var dashBoundary_ : Any = js.native
    
    /* private */ var expectNewPart_ : Any = js.native
    
    /* private */ var initializeBoundaryParams_ : Any = js.native
    
    /* private */ var initializeContentLengthAndUpdateRemainBuffer_ : Any = js.native
    
    /* private */ var isBoundaryDelimiterLine_ : Any = js.native
    
    /* private */ var isFinalBoundary_ : Any = js.native
    
    /* private */ var jumpBufferToDashBoundary_ : Any = js.native
    
    /* private */ var loadBuffer_ : Any = js.native
    
    /* private */ var newLineDashBoundary_ : Any = js.native
    
    /* private */ var newLine_ : Any = js.native
    
    /* private */ var newPart_ : Any = js.native
    
    def nextPart(): typings.nginstackEngine.multipartFormDataPartMod.^ = js.native
    
    /* private */ var options_ : Any = js.native
    
    /* private */ var partsRead_ : Any = js.native
    
    /* private */ var populateHeader_ : Any = js.native
    
    def readForm(): typings.nginstackEngine.multipartFormDataMod.^ = js.native
    def readForm(opt_options: typings.nginstackEngine.multipartFormDataOptionsMod.^): typings.nginstackEngine.multipartFormDataMod.^ = js.native
    def readForm(opt_options: Record[Any, Any]): typings.nginstackEngine.multipartFormDataMod.^ = js.native
    
    /* private */ var readNewLineBuffer_ : Any = js.native
    
    /* private */ var read_ : Any = js.native
    
    /* private */ var remain_ : Any = js.native
    
    /* private */ var removeSpacesAndTabs_ : Any = js.native
    
    /* private */ var setCharsetIfSupported_ : Any = js.native
    
    /* private */ var setParamCharsetFromPart_ : Any = js.native
  }
}
