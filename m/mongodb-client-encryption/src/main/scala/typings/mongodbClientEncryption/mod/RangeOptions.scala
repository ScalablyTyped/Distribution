package typings.mongodbClientEncryption.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RangeOptions specifies index options for a Queryable Encryption field supporting "rangePreview" queries.
  * min, max, sparsity, and range must match the values set in the encryptedFields of the destination collection.
  * For double and decimal128, min/max/precision must all be set, or all be unset.
  */
trait RangeOptions extends StObject {
  
  var max: js.UndefOr[Any] = js.undefined
  
  var min: js.UndefOr[Any] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var sparsity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any
}
object RangeOptions {
  
  inline def apply(
    sparsity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any
  ): RangeOptions = {
    val __obj = js.Dynamic.literal(sparsity = sparsity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeOptions] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setSparsity(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any
    ): Self = StObject.set(x, "sparsity", value.asInstanceOf[js.Any])
  }
}
