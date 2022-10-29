package typings.pixiUtils

import typings.pixiUtils.anon.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathMod {
  
  @JSImport("@pixi/utils/lib/path", "path")
  @js.native
  val path: Path_ = js.native
  
  @js.native
  trait Path_ extends StObject {
    
    def basename(path: String): String = js.native
    def basename(path: String, ext: String): String = js.native
    
    var delimiter: String = js.native
    
    def dirname(path: String): String = js.native
    
    def extname(path: String): String = js.native
    
    def getProtocol(path: String): String = js.native
    
    def hasProtocol(path: String): Boolean = js.native
    
    def isAbsolute(path: String): Boolean = js.native
    
    def isDataUrl(path: String): Boolean = js.native
    
    def isUrl(path: String): Boolean = js.native
    
    def join(paths: String*): String = js.native
    
    def normalize(path: String): String = js.native
    
    def parse(path: String): Base = js.native
    
    def rootname(path: String): String = js.native
    
    var sep: String = js.native
    
    def toAbsolute(url: String): String = js.native
    def toAbsolute(url: String, baseUrl: String): String = js.native
    def toAbsolute(url: String, baseUrl: String, rootUrl: String): String = js.native
    def toAbsolute(url: String, baseUrl: Unit, rootUrl: String): String = js.native
    
    def toPosix(path: String): String = js.native
  }
}
