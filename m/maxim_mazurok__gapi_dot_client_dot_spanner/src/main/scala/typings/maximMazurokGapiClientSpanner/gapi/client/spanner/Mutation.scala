package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mutation extends StObject {
  
  /** Delete rows from a table. Succeeds whether or not the named rows were present. */
  var delete: js.UndefOr[Delete] = js.undefined
  
  /** Insert new rows in a table. If any of the rows already exist, the write or transaction fails with error `ALREADY_EXISTS`. */
  var insert: js.UndefOr[Write] = js.undefined
  
  /**
    * Like insert, except that if the row already exists, then its column values are overwritten with the ones provided. Any column values not explicitly written are preserved. When using
    * insert_or_update, just as when using insert, all `NOT NULL` columns in the table must be given a value. This holds true even when the row already exists and will therefore actually
    * be updated.
    */
  var insertOrUpdate: js.UndefOr[Write] = js.undefined
  
  /**
    * Like insert, except that if the row already exists, it is deleted, and the column values provided are inserted instead. Unlike insert_or_update, this means any values not explicitly
    * written become `NULL`. In an interleaved table, if you create the child table with the `ON DELETE CASCADE` annotation, then replacing a parent row also deletes the child rows.
    * Otherwise, you must delete the child rows before you replace the parent row.
    */
  var replace: js.UndefOr[Write] = js.undefined
  
  /** Update existing rows in a table. If any of the rows does not already exist, the transaction fails with error `NOT_FOUND`. */
  var update: js.UndefOr[Write] = js.undefined
}
object Mutation {
  
  inline def apply(): Mutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mutation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mutation] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Delete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setInsert(value: Write): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertOrUpdate(value: Write): Self = StObject.set(x, "insertOrUpdate", value.asInstanceOf[js.Any])
    
    inline def setInsertOrUpdateUndefined: Self = StObject.set(x, "insertOrUpdate", js.undefined)
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setReplace(value: Write): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setUpdate(value: Write): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
