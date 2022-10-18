package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adapter extends StObject {
  
  var adapter: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'email'> * / any['adapter'] */ js.Any
  
  var email: String
}
object Adapter {
  
  inline def apply(
    adapter: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'email'> * / any['adapter'] */ js.Any,
    email: String
  ): Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adapter]
  }
  
  extension [Self <: Adapter](x: Self) {
    
    inline def setAdapter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'email'> * / any['adapter'] */ js.Any
    ): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
