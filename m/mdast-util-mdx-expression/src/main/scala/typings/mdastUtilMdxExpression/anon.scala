package typings.mdastUtilMdxExpression

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Estree extends StObject {
    
    /**
      * Program node from estree.
      */
    // eslint-disable-next-line @typescript-eslint/ban-types
    var estree: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Program */ Any) | Null
      ] = js.undefined
  }
  object Estree {
    
    inline def apply(): Estree = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Estree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Estree] (val x: Self) extends AnyVal {
      
      inline def setEstree(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Program */ Any
      ): Self = StObject.set(x, "estree", value.asInstanceOf[js.Any])
      
      inline def setEstreeNull: Self = StObject.set(x, "estree", null)
      
      inline def setEstreeUndefined: Self = StObject.set(x, "estree", js.undefined)
    }
  }
}
