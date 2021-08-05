package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  var `for`: js.UndefOr[String] = js.undefined
  
  def install(): Unit
  
  var name: String
  
  var version: String
}
object Plugin {
  
  inline def apply(install: () => Unit, name: String, version: String): Plugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction0(install), name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setInstall(value: () => Unit): Self = StObject.set(x, "install", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
