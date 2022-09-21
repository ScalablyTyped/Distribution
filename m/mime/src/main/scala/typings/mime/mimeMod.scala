package typings.mime

import typings.mime.mod.TypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeMod {
  
  @JSImport("mime/Mime", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Mime {
    def this(typeMap: TypeMap, mimes: TypeMap*) = this()
  }
  
  @js.native
  trait Mime extends StObject {
    
    def define(typeMap: TypeMap): Unit = js.native
    def define(typeMap: TypeMap, force: Boolean): Unit = js.native
    
    def getExtension(mime: String): String | Null = js.native
    
    def getType(path: String): String | Null = js.native
  }
}
