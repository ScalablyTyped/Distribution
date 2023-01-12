package typings.moveFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("move-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def moveFile(sourcePath: String, destinationPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFile")(sourcePath.asInstanceOf[js.Any], destinationPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def moveFile(sourcePath: String, destinationPath: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFile")(sourcePath.asInstanceOf[js.Any], destinationPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def moveFileSync(sourcePath: String, destinationPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFileSync")(sourcePath.asInstanceOf[js.Any], destinationPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def moveFileSync(sourcePath: String, destinationPath: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFileSync")(sourcePath.asInstanceOf[js.Any], destinationPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    	[Permissions](https://en.wikipedia.org/wiki/File-system_permissions#Numeric_notation) for created directories.
    	It has no effect on Windows.
    	@default 0o777
    	*/
    val directoryMode: js.UndefOr[Double] = js.undefined
    
    /**
    	Overwrite existing destination file.
    	@default true
    	*/
    val overwrite: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDirectoryMode(value: Double): Self = StObject.set(x, "directoryMode", value.asInstanceOf[js.Any])
      
      inline def setDirectoryModeUndefined: Self = StObject.set(x, "directoryMode", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
}
