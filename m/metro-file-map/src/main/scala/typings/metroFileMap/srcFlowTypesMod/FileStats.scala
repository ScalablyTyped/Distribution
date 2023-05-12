package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.metroFileMapStrings.f
import typings.metroFileMap.metroFileMapStrings.l
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  fileType :'f' | 'l',   modifiedTime :number}> */
trait FileStats extends StObject {
  
  val fileType: f | l
  
  val modifiedTime: Double
}
object FileStats {
  
  inline def apply(fileType: f | l, modifiedTime: Double): FileStats = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], modifiedTime = modifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileStats] (val x: Self) extends AnyVal {
    
    inline def setFileType(value: f | l): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setModifiedTime(value: Double): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
  }
}
