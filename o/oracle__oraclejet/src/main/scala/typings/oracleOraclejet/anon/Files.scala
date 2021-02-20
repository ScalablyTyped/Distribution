package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Files
  extends /* key */ StringDictionary[js.Any] {
  
  var files: FileList = js.native
}
object Files {
  
  @scala.inline
  def apply(files: FileList): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  @scala.inline
  implicit class FilesMutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: FileList): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
  }
}
