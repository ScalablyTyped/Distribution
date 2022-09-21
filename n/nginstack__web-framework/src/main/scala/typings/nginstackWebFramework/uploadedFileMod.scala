package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadedFileMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/file-loader/UploadedFile", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with UploadedFile {
    def this(args: Any*) = this()
  }
  @JSImport("@nginstack/web-framework/lib/file-loader/UploadedFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait UploadedFile extends StObject {
    
    def move(filePath: String): Boolean = js.native
    
    def uploadToLobStorage(classKey: Double): Double = js.native
    def uploadToLobStorage(classKey: Double, options: Key): Double = js.native
    def uploadToLobStorage(classKey: typings.nginstackEngine.dbkeyMod.^): Double = js.native
    def uploadToLobStorage(classKey: typings.nginstackEngine.dbkeyMod.^, options: Key): Double = js.native
    
    def uploadToVfs(directory: String): Double = js.native
    def uploadToVfs(directory: String, options: Key): Double = js.native
    def uploadToVfs(directory: Double): Double = js.native
    def uploadToVfs(directory: Double, options: Key): Double = js.native
  }
}
