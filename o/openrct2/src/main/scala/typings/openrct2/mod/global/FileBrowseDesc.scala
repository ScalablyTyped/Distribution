package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.game
import typings.openrct2.openrct2Strings.heightmap
import typings.openrct2.openrct2Strings.load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for the file browse window.
  */
trait FileBrowseDesc extends StObject {
  
  /**
    * The function to call when the user has selected a file.
    */
  def callback(path: String): Unit
  
  /**
    * The pre-selected file to load by default if the user clicks OK.
    */
  var defaultPath: js.UndefOr[String] = js.undefined
  
  /**
    * The type of file to browse for.
    */
  var fileType: game | heightmap
  
  /**
    * Whether to browse a file for loading or saving. Saving will prompt the user
    * before overwriting a file.
    */
  var `type`: load
}
object FileBrowseDesc {
  
  inline def apply(callback: String => Unit, fileType: game | heightmap): FileBrowseDesc = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), fileType = fileType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("load")
    __obj.asInstanceOf[FileBrowseDesc]
  }
  
  extension [Self <: FileBrowseDesc](x: Self) {
    
    inline def setCallback(value: String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setDefaultPath(value: String): Self = StObject.set(x, "defaultPath", value.asInstanceOf[js.Any])
    
    inline def setDefaultPathUndefined: Self = StObject.set(x, "defaultPath", js.undefined)
    
    inline def setFileType(value: game | heightmap): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setType(value: load): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
