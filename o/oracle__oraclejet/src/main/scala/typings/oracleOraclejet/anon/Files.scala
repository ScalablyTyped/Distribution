package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var files: FileList
}
object Files {
  
  inline def apply(files: FileList): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  extension [Self <: Files](x: Self) {
    
    inline def setFiles(value: FileList): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
  }
}
