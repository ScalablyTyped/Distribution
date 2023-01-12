package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
interface LocalFileSystem {
  requestFileSystem: Function;
  resolveLocalFileSystemURI: Function;
}*/
trait LocalFileSystem extends StObject {
  
  var PERSISTENT: Double
  
  var TEMPORARY: Double
}
object LocalFileSystem {
  
  inline def apply(PERSISTENT: Double, TEMPORARY: Double): LocalFileSystem = {
    val __obj = js.Dynamic.literal(PERSISTENT = PERSISTENT.asInstanceOf[js.Any], TEMPORARY = TEMPORARY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalFileSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalFileSystem] (val x: Self) extends AnyVal {
    
    inline def setPERSISTENT(value: Double): Self = StObject.set(x, "PERSISTENT", value.asInstanceOf[js.Any])
    
    inline def setTEMPORARY(value: Double): Self = StObject.set(x, "TEMPORARY", value.asInstanceOf[js.Any])
  }
}
