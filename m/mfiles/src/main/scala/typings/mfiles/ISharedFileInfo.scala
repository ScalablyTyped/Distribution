package typings.mfiles

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedFileInfo extends StObject {
  
  val ChangeTimeUtc: Date
  
  def Clone(): ISharedFileInfo
  
  val Extension: String
  
  val LogicalSize: Double
  
  val LogicalSize_32bit: Double
  
  val Title: String
}
object ISharedFileInfo {
  
  inline def apply(
    ChangeTimeUtc: Date,
    Clone: () => ISharedFileInfo,
    Extension: String,
    LogicalSize: Double,
    LogicalSize_32bit: Double,
    Title: String
  ): ISharedFileInfo = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Extension = Extension.asInstanceOf[js.Any], LogicalSize = LogicalSize.asInstanceOf[js.Any], LogicalSize_32bit = LogicalSize_32bit.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedFileInfo]
  }
  
  extension [Self <: ISharedFileInfo](x: Self) {
    
    inline def setChangeTimeUtc(value: Date): Self = StObject.set(x, "ChangeTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => ISharedFileInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setLogicalSize(value: Double): Self = StObject.set(x, "LogicalSize", value.asInstanceOf[js.Any])
    
    inline def setLogicalSize_32bit(value: Double): Self = StObject.set(x, "LogicalSize_32bit", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
