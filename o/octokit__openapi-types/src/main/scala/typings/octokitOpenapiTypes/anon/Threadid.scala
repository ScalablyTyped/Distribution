package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threadid extends StObject {
  
  var thread_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['thread-id'] */ js.Any
}
object Threadid {
  
  inline def apply(
    thread_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['thread-id'] */ js.Any
  ): Threadid = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threadid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Threadid] (val x: Self) extends AnyVal {
    
    inline def setThread_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['thread-id'] */ js.Any
    ): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
