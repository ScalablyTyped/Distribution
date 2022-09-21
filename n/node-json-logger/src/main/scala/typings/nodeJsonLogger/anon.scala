package typings.nodeJsonLogger

import typings.nodeJsonLogger.mod.TLevel
import typings.nodeJsonLogger.nodeJsonLoggerStrings.debug
import typings.nodeJsonLogger.nodeJsonLoggerStrings.error
import typings.nodeJsonLogger.nodeJsonLoggerStrings.fatal
import typings.nodeJsonLogger.nodeJsonLoggerStrings.info
import typings.nodeJsonLogger.nodeJsonLoggerStrings.none
import typings.nodeJsonLogger.nodeJsonLoggerStrings.trace
import typings.nodeJsonLogger.nodeJsonLoggerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Level extends StObject {
    
    var level: info
    
    var message: String
    
    var timestamp: String
  }
  object Level {
    
    inline def apply(message: String, timestamp: String): Level = {
      val __obj = js.Dynamic.literal(level = "info", message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: info): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait LevelMessage extends StObject {
    
    var level: debug
    
    var message: String
    
    var timestamp: String
  }
  object LevelMessage {
    
    inline def apply(message: String, timestamp: String): LevelMessage = {
      val __obj = js.Dynamic.literal(level = "debug", message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LevelMessage]
    }
    
    extension [Self <: LevelMessage](x: Self) {
      
      inline def setLevel(value: debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait LevelMessageTimestamp extends StObject {
    
    var level: trace
    
    var message: String
    
    var timestamp: String
  }
  object LevelMessageTimestamp {
    
    inline def apply(message: String, timestamp: String): LevelMessageTimestamp = {
      val __obj = js.Dynamic.literal(level = "trace", message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LevelMessageTimestamp]
    }
    
    extension [Self <: LevelMessageTimestamp](x: Self) {
      
      inline def setLevel(value: trace): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var level: warn
    
    var message: String
    
    var timestamp: String
  }
  object Message {
    
    inline def apply(message: String, timestamp: String): Message = {
      val __obj = js.Dynamic.literal(level = "warn", message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setLevel(value: warn): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageTimestamp extends StObject {
    
    var level: error
    
    var message: String
    
    var timestamp: String
  }
  object MessageTimestamp {
    
    inline def apply(message: String, timestamp: String): MessageTimestamp = {
      val __obj = js.Dynamic.literal(level = "error", message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageTimestamp]
    }
    
    extension [Self <: MessageTimestamp](x: Self) {
      
      inline def setLevel(value: error): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  level :node-json-logger.node-json-logger.TLevel | 'none',   loggerName :string,   timestamp :boolean,   timezone :string}> */
  trait PartiallevelTLevelnonelog extends StObject {
    
    var level: js.UndefOr[TLevel | none] = js.undefined
    
    var loggerName: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Boolean] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
  }
  object PartiallevelTLevelnonelog {
    
    inline def apply(): PartiallevelTLevelnonelog = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartiallevelTLevelnonelog]
    }
    
    extension [Self <: PartiallevelTLevelnonelog](x: Self) {
      
      inline def setLevel(value: TLevel | none): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLoggerName(value: String): Self = StObject.set(x, "loggerName", value.asInstanceOf[js.Any])
      
      inline def setLoggerNameUndefined: Self = StObject.set(x, "loggerName", js.undefined)
      
      inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
  
  trait Timestamp extends StObject {
    
    var level: fatal
    
    var message: String
    
    var timestamp: String
  }
  object Timestamp {
    
    inline def apply(message: String, timestamp: String): Timestamp = {
      val __obj = js.Dynamic.literal(level = "fatal", message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp]
    }
    
    extension [Self <: Timestamp](x: Self) {
      
      inline def setLevel(value: fatal): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
