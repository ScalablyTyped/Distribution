package typings.pgPromise.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Event context extension for tasks + transactions;
// See: http://vitaly-t.github.io/pg-promise/global.html#TaskContext
@js.native
trait ITaskContext extends js.Object {
  
  val connected: Boolean = js.native
  
  // these are set in the beginning of each task/transaction:
  val context: js.Any = js.native
  
  val dc: js.Any = js.native
  
  val duration: js.UndefOr[Double] = js.native
  
  // these are set at the end of each task/transaction:
  val finish: js.UndefOr[Date] = js.native
  
  val inTransaction: Boolean = js.native
  
  val isTX: Boolean = js.native
  
  val level: Double = js.native
  
  val parent: ITaskContext | Null = js.native
  
  val result: js.UndefOr[js.Any] = js.native
  
  // Version of PostgreSQL Server to which we are connected;
  // This property is not available with Native Bindings!
  val serverVersion: String = js.native
  
  val start: Date = js.native
  
  val success: js.UndefOr[Boolean] = js.native
  
  val tag: js.Any = js.native
  
  // this exists only inside transactions (isTX = true):
  val txLevel: js.UndefOr[Double] = js.native
  
  val useCount: Double = js.native
}
object ITaskContext {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], inTransaction = inTransaction.asInstanceOf[js.Any], isTX = isTX.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], useCount = useCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskContext]
  }
  
  @scala.inline
  implicit class ITaskContextOps[Self <: ITaskContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDc(value: js.Any): Self = this.set("dc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInTransaction(value: Boolean): Self = this.set("inTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTX(value: Boolean): Self = this.set("isTX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVersion(value: String): Self = this.set("serverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCount(value: Double): Self = this.set("useCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFinish(value: Date): Self = this.set("finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    
    @scala.inline
    def setParent(value: ITaskContext): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTxLevel(value: Double): Self = this.set("txLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTxLevel: Self = this.set("txLevel", js.undefined)
  }
}
