package typings.nodeJsonDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonDBConfigMod {
  
  @JSImport("node-json-db/dist/lib/JsonDBConfig", "Config")
  @js.native
  class Config protected ()
    extends StObject
       with JsonDBConfig {
    def this(filename: String) = this()
    def this(filename: String, saveOnPush: Boolean) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Boolean) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean, separator: String) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Unit, separator: String) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Boolean, separator: String) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Unit, separator: String) = this()
    
    /* CompleteClass */
    var filename: String = js.native
    
    /* CompleteClass */
    var humanReadable: Boolean = js.native
    
    /* CompleteClass */
    var saveOnPush: Boolean = js.native
    
    /* CompleteClass */
    var separator: String = js.native
  }
  
  trait JsonDBConfig extends StObject {
    
    var filename: String
    
    var humanReadable: Boolean
    
    var saveOnPush: Boolean
    
    var separator: String
  }
  object JsonDBConfig {
    
    @scala.inline
    def apply(filename: String, humanReadable: Boolean, saveOnPush: Boolean, separator: String): JsonDBConfig = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], humanReadable = humanReadable.asInstanceOf[js.Any], saveOnPush = saveOnPush.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonDBConfig]
    }
    
    @scala.inline
    implicit class JsonDBConfigMutableBuilder[Self <: JsonDBConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHumanReadable(value: Boolean): Self = StObject.set(x, "humanReadable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveOnPush(value: Boolean): Self = StObject.set(x, "saveOnPush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    }
  }
}
