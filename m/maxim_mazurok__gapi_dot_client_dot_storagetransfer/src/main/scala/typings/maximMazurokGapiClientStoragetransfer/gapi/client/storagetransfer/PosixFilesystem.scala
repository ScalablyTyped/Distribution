package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosixFilesystem extends StObject {
  
  /** Root directory path to the filesystem. */
  var rootDirectory: js.UndefOr[String] = js.undefined
}
object PosixFilesystem {
  
  inline def apply(): PosixFilesystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosixFilesystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PosixFilesystem] (val x: Self) extends AnyVal {
    
    inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
    
    inline def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
  }
}
