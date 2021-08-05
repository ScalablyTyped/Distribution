package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to configure fields when creating a B-Tree Index.
  */
trait BTreeIndexField extends StObject {
  
  /** Name of the data type of the targeted-field value, for indexing purposes. */
  var datatype: js.UndefOr[String] = js.undefined
  
  /** Specifies the maximum length of the value to index. */
  var maxlength: js.UndefOr[Double] = js.undefined
  
  /** Index sorting order, for datatype varchar2 (or one of its synonyms) or number. */
  var order: js.UndefOr[String | Double] = js.undefined
  
  /** Path to the targeted field, whose value is expected to be a scalar. */
  var path: String
}
object BTreeIndexField {
  
  inline def apply(path: String): BTreeIndexField = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTreeIndexField]
  }
  
  extension [Self <: BTreeIndexField](x: Self) {
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setOrder(value: String | Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
