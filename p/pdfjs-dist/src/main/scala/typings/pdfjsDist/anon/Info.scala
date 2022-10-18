package typings.pdfjsDist.anon

import typings.pdfjsDist.typesSrcDisplayMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var info: js.Object
  
  var metadata: Metadata
}
object Info {
  
  inline def apply(info: js.Object, metadata: Metadata): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  extension [Self <: Info](x: Self) {
    
    inline def setInfo(value: js.Object): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
