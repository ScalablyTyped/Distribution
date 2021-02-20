package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanguage extends StObject {
  
  val ID: Double = js.native
  
  var LanguageCode: String = js.native
  
  var Name: String = js.native
}
object ILanguage {
  
  @scala.inline
  def apply(ID: Double, LanguageCode: String, Name: String): ILanguage = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguage]
  }
  
  @scala.inline
  implicit class ILanguageMutableBuilder[Self <: ILanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
