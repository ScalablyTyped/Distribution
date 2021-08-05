package typings.pgPromise.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Event context extension for tasks + transactions;
// See: http://vitaly-t.github.io/pg-promise/global.html#TaskContext
trait ITaskContext extends StObject {
  
  val connected: Boolean
  
  // these are set in the beginning of each task/transaction:
  val context: js.Any
  
  val dc: js.Any
  
  val duration: js.UndefOr[Double] = js.undefined
  
  // these are set at the end of each task/transaction:
  val finish: js.UndefOr[Date] = js.undefined
  
  val inTransaction: Boolean
  
  val isTX: Boolean
  
  val level: Double
  
  val parent: ITaskContext | Null
  
  val result: js.UndefOr[js.Any] = js.undefined
  
  // Version of PostgreSQL Server to which we are connected;
  // This property is not available with Native Bindings!
  val serverVersion: String
  
  val start: Date
  
  val success: js.UndefOr[Boolean] = js.undefined
  
  val tag: js.Any
  
  // this exists only inside transactions (isTX = true):
  val txLevel: js.UndefOr[Double] = js.undefined
  
  val useCount: Double
}
object ITaskContext {
  
  inline def apply(
    connected: Boolean,
    context: js.Any,
    dc: js.Any,
    inTransaction: Boolean,
    isTX: Boolean,
    level: Double,
    serverVersion: String,
    start: Date,
    tag: js.Any,
    useCount: Double
  ): ITaskContext = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], inTransaction = inTransaction.asInstanceOf[js.Any], isTX = isTX.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], useCount = useCount.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[ITaskContext]
  }
  
  extension [Self <: ITaskContext](x: Self) {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDc(value: js.Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFinish(value: Date): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
    
    inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    inline def setInTransaction(value: Boolean): Self = StObject.set(x, "inTransaction", value.asInstanceOf[js.Any])
    
    inline def setIsTX(value: Boolean): Self = StObject.set(x, "isTX", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ITaskContext): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setServerVersion(value: String): Self = StObject.set(x, "serverVersion", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTxLevel(value: Double): Self = StObject.set(x, "txLevel", value.asInstanceOf[js.Any])
    
    inline def setTxLevelUndefined: Self = StObject.set(x, "txLevel", js.undefined)
    
    inline def setUseCount(value: Double): Self = StObject.set(x, "useCount", value.asInstanceOf[js.Any])
  }
}
