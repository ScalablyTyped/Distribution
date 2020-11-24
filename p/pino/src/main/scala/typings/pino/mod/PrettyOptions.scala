package typings.pino.mod

import typings.pino.pinoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrettyOptions extends js.Object {
  
  /**
    * If set to true, will add color information to the formatted output message. Default: `false`.
    */
  var colorize: js.UndefOr[Boolean] = js.native
  
  /**
    * Appends carriage return and line feed, instead of just a line feed, to the formatted log line.
    */
  var crlf: js.UndefOr[Boolean] = js.native
  
  /**
    * Define the log keys that are associated with error like objects. Default: ["err", "error"]
    */
  var errorLikeObjectKeys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *  When formatting an error object, display this list of properties.
    *  The list should be a comma separated list of properties. Default: ''
    */
  var errorProps: js.UndefOr[String] = js.native
  
  /**
    * Ignore one or several keys. Example: "time,hostname"
    */
  var ignore: js.UndefOr[String] = js.native
  
  /**
    * If set to true, it will print the name of the log level as the first field in the log line. Default: `false`.
    */
  var levelFirst: js.UndefOr[Boolean] = js.native
  
  /**
    * Format output of message, e.g. {level} - {pid} will output message: INFO - 1123 Default: `false`.
    */
  var messageFormat: js.UndefOr[`false` | String] = js.native
  
  /**
    * The key in the JSON object to use as the highlighted message. Default: "msg".
    */
  var messageKey: js.UndefOr[String] = js.native
  
  /**
    * Specify a search pattern according to {@link http://jmespath.org|jmespath}
    */
  var search: js.UndefOr[String] = js.native
  
  /**
    * Suppress warning on first synchronous flushing.
    */
  var suppressFlushSyncWarning: js.UndefOr[Boolean] = js.native
  
  /**
    * The key in the JSON object to use for timestamp display. Default: "time".
    */
  var timestampKey: js.UndefOr[String] = js.native
  
  /**
    * Translate the epoch time value into a human readable date and time string.
    * This flag also can set the format string to apply when translating the date to human readable format.
    * The default format is yyyy-mm-dd HH:MM:ss.l o in UTC.
    * For a list of available pattern letters see the {@link https://www.npmjs.com/package/dateformat|dateformat documentation}.
    */
  var translateTime: js.UndefOr[Boolean | String] = js.native
}
object PrettyOptions {
  
  @scala.inline
  def apply(): PrettyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrettyOptions]
  }
  
  @scala.inline
  implicit class PrettyOptionsOps[Self <: PrettyOptions] (val x: Self) extends AnyVal {
    
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
    def setColorize(value: Boolean): Self = this.set("colorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorize: Self = this.set("colorize", js.undefined)
    
    @scala.inline
    def setCrlf(value: Boolean): Self = this.set("crlf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrlf: Self = this.set("crlf", js.undefined)
    
    @scala.inline
    def setErrorLikeObjectKeysVarargs(value: String*): Self = this.set("errorLikeObjectKeys", js.Array(value :_*))
    
    @scala.inline
    def setErrorLikeObjectKeys(value: js.Array[String]): Self = this.set("errorLikeObjectKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorLikeObjectKeys: Self = this.set("errorLikeObjectKeys", js.undefined)
    
    @scala.inline
    def setErrorProps(value: String): Self = this.set("errorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorProps: Self = this.set("errorProps", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setLevelFirst(value: Boolean): Self = this.set("levelFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelFirst: Self = this.set("levelFirst", js.undefined)
    
    @scala.inline
    def setMessageFormat(value: `false` | String): Self = this.set("messageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageFormat: Self = this.set("messageFormat", js.undefined)
    
    @scala.inline
    def setMessageKey(value: String): Self = this.set("messageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageKey: Self = this.set("messageKey", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSuppressFlushSyncWarning(value: Boolean): Self = this.set("suppressFlushSyncWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressFlushSyncWarning: Self = this.set("suppressFlushSyncWarning", js.undefined)
    
    @scala.inline
    def setTimestampKey(value: String): Self = this.set("timestampKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampKey: Self = this.set("timestampKey", js.undefined)
    
    @scala.inline
    def setTranslateTime(value: Boolean | String): Self = this.set("translateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateTime: Self = this.set("translateTime", js.undefined)
  }
}
