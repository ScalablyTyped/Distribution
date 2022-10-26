package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typescript extends StObject {
  
  var typescript: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_tsserverlibrary */ Any
}
object Typescript {
  
  inline def apply(
    typescript: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_tsserverlibrary */ Any
  ): Typescript = {
    val __obj = js.Dynamic.literal(typescript = typescript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typescript]
  }
  
  extension [Self <: Typescript](x: Self) {
    
    inline def setTypescript(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_tsserverlibrary */ Any
    ): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
  }
}
