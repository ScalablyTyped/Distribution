package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: String
  
  var previews: js.Array[String]
}
object Format {
  
  @scala.inline
  def apply(format: String, previews: js.Array[String]): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviews(value: js.Array[String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewsVarargs(value: String*): Self = StObject.set(x, "previews", js.Array(value :_*))
  }
}
