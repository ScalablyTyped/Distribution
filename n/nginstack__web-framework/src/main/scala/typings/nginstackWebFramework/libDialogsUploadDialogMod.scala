package typings.nginstackWebFramework

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDialogsUploadDialogMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_process: Process): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_process.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dialogs/UploadDialog", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with UploadDialog {
    def this(opt_process: Process) = this()
  }
  @JSImport("@nginstack/web-framework/lib/dialogs/UploadDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Process = typings.nginstackWebFramework.libProcessProcessMod.^
  
  @js.native
  trait UploadDialog extends StObject {
    
    /* private */ var act_close_ : Any = js.native
    
    /* private */ var act_finish_ : Any = js.native
    
    /* private */ var fileLoader_ : Any = js.native
    
    def open(): Any = js.native
    def open(opt_options: typings.nginstackWebFramework.libFileLoaderUploadOptionsMod.^): Any = js.native
    def open(opt_options: Record[Any, Any]): Any = js.native
    
    /* private */ var pairName_ : Any = js.native
    
    /* private */ var rejectFn_ : Any = js.native
    
    /* private */ var resolveFn_ : Any = js.native
    
    /* private */ var uploadId_ : Any = js.native
  }
  
  type UploadedFile = typings.nginstackWebFramework.libFileLoaderUploadedFileMod.^
}
