package typings.metro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dev extends StObject {
  
  val dev: Boolean
  
  val entryFile: String
  
  val minify: Boolean
  
  val platform: String
}
object Dev {
  
  inline def apply(dev: Boolean, entryFile: String, minify: Boolean, platform: String): Dev = {
    val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], entryFile = entryFile.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dev]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dev] (val x: Self) extends AnyVal {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
