package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warnings extends StObject {
  
  var errors: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmpHtmlValidator.ValidationError */ Any
  ]
  
  var warnings: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmpHtmlValidator.ValidationError */ Any
  ]
}
object Warnings {
  
  inline def apply(
    errors: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmpHtmlValidator.ValidationError */ Any
    ],
    warnings: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmpHtmlValidator.ValidationError */ Any
    ]
  ): Warnings = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warnings]
  }
  
  extension [Self <: Warnings](x: Self) {
    
    inline def setErrors(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmpHtmlValidator.ValidationError */ Any
        ]
    ): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmpHtmlValidator.ValidationError */ Any)*
    ): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setWarnings(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmpHtmlValidator.ValidationError */ Any
        ]
    ): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmpHtmlValidator.ValidationError */ Any)*
    ): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
