package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISourceObjectFile extends StObject {
  
  def Clone(): ISourceObjectFile
  
  var Extension: String
  
  var SourceFilePath: String
  
  var Title: String
}
object ISourceObjectFile {
  
  @scala.inline
  def apply(Clone: () => ISourceObjectFile, Extension: String, SourceFilePath: String, Title: String): ISourceObjectFile = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Extension = Extension.asInstanceOf[js.Any], SourceFilePath = SourceFilePath.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceObjectFile]
  }
  
  @scala.inline
  implicit class ISourceObjectFileMutableBuilder[Self <: ISourceObjectFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ISourceObjectFile): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFilePath(value: String): Self = StObject.set(x, "SourceFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
