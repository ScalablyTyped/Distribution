package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.nodeRedRuntimeStrings.debug
import typings.nodeRedRuntime.nodeRedRuntimeStrings.error
import typings.nodeRedRuntime.nodeRedRuntimeStrings.fatal
import typings.nodeRedRuntime.nodeRedRuntimeStrings.info
import typings.nodeRedRuntime.nodeRedRuntimeStrings.off
import typings.nodeRedRuntime.nodeRedRuntimeStrings.trace
import typings.nodeRedRuntime.nodeRedRuntimeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audit extends js.Object {
  
  /**
    * Whether or not to include audit events in the log output
    */
  var audit: Boolean = js.native
  
  /**
    * Level of logging to be recorded. Options are:
    * fatal - only those errors which make the application unusable should be recorded
    * error - record errors which are deemed fatal for a particular request + fatal errors
    * warn - record problems which are non fatal + errors + fatal errors
    * info - record information about the general running of the application + warn + error + fatal errors
    * debug - record information which is more verbose than info + info + warn + error + fatal errors
    * trace - record very detailed logging + debug + info + warn + error + fatal errors
    * off - turn off all logging (doesn't affect metrics or audit)
    */
  var level: fatal | error | warn | info | debug | trace | off = js.native
  
  /**
    * Whether or not to include metric events in the log output
    */
  var metrics: Boolean = js.native
}
object Audit {
  
  @scala.inline
  def apply(audit: Boolean, level: fatal | error | warn | info | debug | trace | off, metrics: Boolean): Audit = {
    val __obj = js.Dynamic.literal(audit = audit.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audit]
  }
  
  @scala.inline
  implicit class AuditOps[Self <: Audit] (val x: Self) extends AnyVal {
    
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
    def setAudit(value: Boolean): Self = this.set("audit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: fatal | error | warn | info | debug | trace | off): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: Boolean): Self = this.set("metrics", value.asInstanceOf[js.Any])
  }
}
