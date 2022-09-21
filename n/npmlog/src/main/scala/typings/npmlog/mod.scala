package typings.npmlog

import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("npmlog", JSImport.Namespace)
  @js.native
  val ^ : Logger = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.npmlog.npmlogStrings.silly
    - typings.npmlog.npmlogStrings.verbose
    - typings.npmlog.npmlogStrings.info
    - typings.npmlog.npmlogStrings.timing
    - typings.npmlog.npmlogStrings.http
    - typings.npmlog.npmlogStrings.notice
    - typings.npmlog.npmlogStrings.warn
    - typings.npmlog.npmlogStrings.error
    - typings.npmlog.npmlogStrings.silent
  */
  trait LogLevels extends StObject
  object LogLevels {
    
    inline def error: typings.npmlog.npmlogStrings.error = "error".asInstanceOf[typings.npmlog.npmlogStrings.error]
    
    inline def http: typings.npmlog.npmlogStrings.http = "http".asInstanceOf[typings.npmlog.npmlogStrings.http]
    
    inline def info: typings.npmlog.npmlogStrings.info = "info".asInstanceOf[typings.npmlog.npmlogStrings.info]
    
    inline def notice: typings.npmlog.npmlogStrings.notice = "notice".asInstanceOf[typings.npmlog.npmlogStrings.notice]
    
    inline def silent: typings.npmlog.npmlogStrings.silent = "silent".asInstanceOf[typings.npmlog.npmlogStrings.silent]
    
    inline def silly: typings.npmlog.npmlogStrings.silly = "silly".asInstanceOf[typings.npmlog.npmlogStrings.silly]
    
    inline def timing: typings.npmlog.npmlogStrings.timing = "timing".asInstanceOf[typings.npmlog.npmlogStrings.timing]
    
    inline def verbose: typings.npmlog.npmlogStrings.verbose = "verbose".asInstanceOf[typings.npmlog.npmlogStrings.verbose]
    
    inline def warn: typings.npmlog.npmlogStrings.warn = "warn".asInstanceOf[typings.npmlog.npmlogStrings.warn]
  }
  
  // TODO: newStream, newGroup, setGaugeTemplate and setGaugeTemplateSet need to be added
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait Logger extends EventEmitter {
    
    def apply(): Any = js.native
    
    def addLevel(level: String, n: Double): Unit = js.native
    def addLevel(level: String, n: Double, style: Unit, disp: String): Unit = js.native
    def addLevel(level: String, n: Double, style: StyleObject): Unit = js.native
    def addLevel(level: String, n: Double, style: StyleObject, disp: String): Unit = js.native
    
    def disableColor(): Unit = js.native
    
    def disableProgress(): Unit = js.native
    
    def disableUnicode(): Unit = js.native
    
    def enableColor(): Unit = js.native
    
    def enableProgress(): Unit = js.native
    
    def enableUnicode(): Unit = js.native
    
    def error(prefix: String, message: String, args: Any*): Unit = js.native
    
    var heading: String = js.native
    
    var headingStyle: StyleObject = js.native
    
    def http(prefix: String, message: String, args: Any*): Unit = js.native
    
    def info(prefix: String, message: String, args: Any*): Unit = js.native
    
    var level: String = js.native
    
    def log(level: String, prefix: String, message: String, args: Any*): Unit = js.native
    // Defaults to process.stderr
    def log(level: LogLevels, prefix: String, message: String, args: Any*): Unit = js.native
    
    var maxRecordSize: Double = js.native
    
    def notice(prefix: String, message: String, args: Any*): Unit = js.native
    
    def pause(): Unit = js.native
    
    var prefixStyle: StyleObject = js.native
    
    def progressEnabled(): Boolean = js.native
    
    var record: js.Array[MessageObject] = js.native
    
    def resume(): Unit = js.native
    
    def silent(prefix: String, message: String, args: Any*): Unit = js.native
    
    def silly(prefix: String, message: String, args: Any*): Unit = js.native
    
    var stream: Any = js.native
    
    def timing(prefix: String, message: String, args: Any*): Unit = js.native
    
    def verbose(prefix: String, message: String, args: Any*): Unit = js.native
    
    def warn(prefix: String, message: String, args: Any*): Unit = js.native
  }
  
  trait MessageObject extends StObject {
    
    var id: Double
    
    var level: String
    
    var message: String
    
    var messageRaw: String
    
    var prefix: String
  }
  object MessageObject {
    
    inline def apply(id: Double, level: String, message: String, messageRaw: String, prefix: String): MessageObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageRaw = messageRaw.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageObject]
    }
    
    extension [Self <: MessageObject](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageRaw(value: String): Self = StObject.set(x, "messageRaw", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleObject extends StObject {
    
    var bell: js.UndefOr[Boolean] = js.undefined
    
    var bg: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object StyleObject {
    
    inline def apply(): StyleObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleObject]
    }
    
    extension [Self <: StyleObject](x: Self) {
      
      inline def setBell(value: Boolean): Self = StObject.set(x, "bell", value.asInstanceOf[js.Any])
      
      inline def setBellUndefined: Self = StObject.set(x, "bell", js.undefined)
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  type _To = Logger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Logger = ^
}
