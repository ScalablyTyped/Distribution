package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilterList extends StObject {
  
  /**
    * Tags to be filtered. Tags must be DICOM Data Elements, File Meta Elements, or Directory Structuring Elements, as defined at:
    * http://dicom.nema.org/medical/dicom/current/output/html/part06.html#table_6-1,. They may be provided by "Keyword" or "Tag". For example "PatientID", "00100010".
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object TagFilterList {
  
  @scala.inline
  def apply(): TagFilterList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilterList]
  }
  
  @scala.inline
  implicit class TagFilterListMutableBuilder[Self <: TagFilterList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
