package typings.nextAuth.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyOptions extends StObject {
  
  var body: js.UndefOr[Record[String, Any]] = js.undefined
  
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth' | 'email'> */ Any
  
  var query: js.UndefOr[Record[String, Any]] = js.undefined
}
object BodyOptions {
  
  inline def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth' | 'email'> */ Any
  ): BodyOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyOptions]
  }
  
  extension [Self <: BodyOptions](x: Self) {
    
    inline def setBody(value: Record[String, Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions<'oauth' | 'email'> */ Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
