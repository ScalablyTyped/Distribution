package typings.nightwatch.mod

import typings.nightwatch.nightwatchStrings.DEBUG
import typings.nightwatch.nightwatchStrings.INFO
import typings.nightwatch.nightwatchStrings.SEVERE
import typings.nightwatch.nightwatchStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchLogEntry extends js.Object {
  
  /**
    * Severity level
    */
  var level: SEVERE | WARNING | INFO | DEBUG = js.native
  
  /**
    * The log entry message.
    */
  var message: String = js.native
  
  var source: js.UndefOr[String] = js.native
  
  /**
    * The time stamp of log entry in seconds.
    */
  var timestamp: Double = js.native
}
object NightwatchLogEntry {
  
  @scala.inline
  def apply(level: SEVERE | WARNING | INFO | DEBUG, message: String, timestamp: Double): NightwatchLogEntry = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLogEntry]
  }
  
  @scala.inline
  implicit class NightwatchLogEntryOps[Self <: NightwatchLogEntry] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: SEVERE | WARNING | INFO | DEBUG): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
