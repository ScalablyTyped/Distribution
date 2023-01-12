package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure to configure the properties of a B-Tree Index.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-index-specifications-reference.html#GUID-00C06941-6FFD-4CEB-81B6-9A7FBD577A2C
  */
trait BTreeIndex extends StObject {
  
  /** Each object targets a field in the indexed documents that has a scalar JSON value. */
  var fields: js.Array[BTreeIndexField]
  
  /**
    * Specifies whether or not to index NULL values for the selected columns (by appending the numeric value 1 to the list of columns to index).
    *
    * @default false
    */
  var indexNulls: js.UndefOr[Boolean] = js.undefined
  
  /** Name of the index. */
  var name: String
  
  /**
    * Specifies whether or not the index is unique.
    *
    * @default false
    */
  var unique: js.UndefOr[Boolean] = js.undefined
}
object BTreeIndex {
  
  inline def apply(fields: js.Array[BTreeIndexField], name: String): BTreeIndex = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTreeIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BTreeIndex] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[BTreeIndexField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: BTreeIndexField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setIndexNulls(value: Boolean): Self = StObject.set(x, "indexNulls", value.asInstanceOf[js.Any])
    
    inline def setIndexNullsUndefined: Self = StObject.set(x, "indexNulls", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
