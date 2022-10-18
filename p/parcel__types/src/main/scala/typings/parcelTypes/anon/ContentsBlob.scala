package typings.parcelTypes.anon

import typings.parcelTypes.mod.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentsBlob extends StObject {
  
  var contents: Blob
}
object ContentsBlob {
  
  inline def apply(contents: Blob): ContentsBlob = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentsBlob]
  }
  
  extension [Self <: ContentsBlob](x: Self) {
    
    inline def setContents(value: Blob): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
  }
}
