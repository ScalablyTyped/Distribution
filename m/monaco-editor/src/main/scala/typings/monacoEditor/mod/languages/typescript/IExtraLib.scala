package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtraLib extends StObject {
  
  var content: String
  
  var version: Double
}
object IExtraLib {
  
  @scala.inline
  def apply(content: String, version: Double): IExtraLib = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtraLib]
  }
  
  @scala.inline
  implicit class IExtraLibMutableBuilder[Self <: IExtraLib] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
