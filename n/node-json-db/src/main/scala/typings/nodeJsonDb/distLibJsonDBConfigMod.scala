package typings.nodeJsonDb

import typings.nodeJsonDb.distAdapterIadapterMod.IAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibJsonDBConfigMod {
  
  @JSImport("node-json-db/dist/lib/JsonDBConfig", "Config")
  @js.native
  open class Config protected ()
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
    def this(
      filename: String,
      saveOnPush: Boolean,
      humanReadable: Boolean,
      separator: String,
      syncOnSave: Boolean
    ) = this()
    def this(
      filename: String,
      saveOnPush: Boolean,
      humanReadable: Boolean,
      separator: Unit,
      syncOnSave: Boolean
    ) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Unit, separator: String, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Unit, separator: Unit, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Boolean, separator: String, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Boolean, separator: Unit, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Unit, separator: String, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Unit, separator: Unit, syncOnSave: Boolean) = this()
    
    /* CompleteClass */
    override val adapter: IAdapter[Any] = js.native
    
    val filename: String = js.native
    
    /* CompleteClass */
    override val saveOnPush: Boolean = js.native
    
    /* CompleteClass */
    override val separator: String = js.native
  }
  
  @JSImport("node-json-db/dist/lib/JsonDBConfig", "ConfigWithAdapter")
  @js.native
  open class ConfigWithAdapter protected ()
    extends StObject
       with JsonDBConfig {
    def this(adapter: IAdapter[Any]) = this()
    def this(adapter: IAdapter[Any], saveOnPush: Boolean) = this()
    def this(adapter: IAdapter[Any], saveOnPush: Boolean, separator: String) = this()
    def this(adapter: IAdapter[Any], saveOnPush: Unit, separator: String) = this()
    
    /* CompleteClass */
    override val adapter: IAdapter[Any] = js.native
    
    /* CompleteClass */
    override val saveOnPush: Boolean = js.native
    
    /* CompleteClass */
    override val separator: String = js.native
  }
  
  trait JsonDBConfig extends StObject {
    
    val adapter: IAdapter[Any]
    
    val saveOnPush: Boolean
    
    val separator: String
  }
  object JsonDBConfig {
    
    inline def apply(adapter: IAdapter[Any], saveOnPush: Boolean, separator: String): JsonDBConfig = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], saveOnPush = saveOnPush.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonDBConfig]
    }
    
    extension [Self <: JsonDBConfig](x: Self) {
      
      inline def setAdapter(value: IAdapter[Any]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setSaveOnPush(value: Boolean): Self = StObject.set(x, "saveOnPush", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    }
  }
}
