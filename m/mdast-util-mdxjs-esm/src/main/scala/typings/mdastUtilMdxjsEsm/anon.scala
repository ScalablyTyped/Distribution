package typings.mdastUtilMdxjsEsm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Estree extends StObject {
    
    var estree: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Program */ Any
      ] = js.undefined
  }
  object Estree {
    
    inline def apply(): Estree = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Estree]
    }
    
    extension [Self <: Estree](x: Self) {
      
      inline def setEstree(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Program */ Any
      ): Self = StObject.set(x, "estree", value.asInstanceOf[js.Any])
      
      inline def setEstreeUndefined: Self = StObject.set(x, "estree", js.undefined)
    }
  }
}
