package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  def create(
    info: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_tsserverlibrary.server.PluginCreateInfo */ Any
  ): Any
}
object Create {
  
  inline def apply(
    create: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_tsserverlibrary.server.PluginCreateInfo */ Any => Any
  ): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Create]
  }
  
  extension [Self <: Create](x: Self) {
    
    inline def setCreate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_tsserverlibrary.server.PluginCreateInfo */ Any => Any
    ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
