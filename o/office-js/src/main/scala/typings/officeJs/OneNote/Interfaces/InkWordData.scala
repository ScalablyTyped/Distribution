package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkWord.toJSON()". */
@js.native
trait InkWordData extends StObject {
  
  /**
    *
    * Gets the ID of the InkWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * The id of the recognized language in this ink word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[String] = js.native
  
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[js.Array[String]] = js.native
}
object InkWordData {
  
  @scala.inline
  def apply(): InkWordData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordData]
  }
  
  @scala.inline
  implicit class InkWordDataMutableBuilder[Self <: InkWordData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLanguageId(value: String): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIdUndefined: Self = StObject.set(x, "languageId", js.undefined)
    
    @scala.inline
    def setWordAlternates(value: js.Array[String]): Self = StObject.set(x, "wordAlternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordAlternatesUndefined: Self = StObject.set(x, "wordAlternates", js.undefined)
    
    @scala.inline
    def setWordAlternatesVarargs(value: String*): Self = StObject.set(x, "wordAlternates", js.Array(value :_*))
  }
}
