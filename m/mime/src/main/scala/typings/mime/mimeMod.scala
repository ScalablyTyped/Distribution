package typings.mime

import typings.mime.mod.TypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeMod {
  
  @JSImport("mime/Mime", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Mime {
    def this(mimes: TypeMap) = this()
  }
  
  @js.native
  trait Mime extends StObject {
    
    def define(mimes: TypeMap): Unit = js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    
    def getExtension(mime: String): String | Null = js.native
    
    def getType(path: String): String | Null = js.native
  }
}
