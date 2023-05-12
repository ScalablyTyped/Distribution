package typings.oracledb.mod

import typings.oracledb.anon.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object specifying the table that was affected by a subscription's notification.
  */
trait SubscriptionTable extends StObject {
  
  /** Name of the table which was modified in some way. */
  var name: String
  
  /**
    * One of the CQN_OPCODE_* constants.
    */
  var operation: Double
  
  /**
    * array of objects specifying the rows which were changed. This will only be defined if the qos
    * quality of service used when creating the subscription indicated the desire for ROWIDs and no
    * summary grouping took place.
    */
  var rows: js.UndefOr[js.Array[Operation]] = js.undefined
}
object SubscriptionTable {
  
  inline def apply(name: String, operation: Double): SubscriptionTable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionTable] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: Double): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[Operation]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Operation*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
