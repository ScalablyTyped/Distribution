package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlankTriple[Q /* <: typings.rdfjsTypes.dataModelMod.BaseQuad */] extends StObject {
  
  var `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  
  var predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
}
object BlankTriple {
  
  inline def apply[Q /* <: typings.rdfjsTypes.dataModelMod.BaseQuad */](
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
  ): BlankTriple[Q] = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankTriple[Q]]
  }
  
  extension [Self <: BlankTriple[?], Q /* <: typings.rdfjsTypes.dataModelMod.BaseQuad */](x: Self & BlankTriple[Q]) {
    
    inline def setObject(value: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPredicate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
    ): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
  }
}
