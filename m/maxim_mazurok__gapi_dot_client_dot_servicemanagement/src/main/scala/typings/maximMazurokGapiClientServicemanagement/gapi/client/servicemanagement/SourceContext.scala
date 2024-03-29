package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceContext extends StObject {
  
  /** The path-qualified name of the .proto file that contained the associated protobuf element. For example: `"google/protobuf/source_context.proto"`. */
  var fileName: js.UndefOr[String] = js.undefined
}
object SourceContext {
  
  inline def apply(): SourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceContext] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
  }
}
