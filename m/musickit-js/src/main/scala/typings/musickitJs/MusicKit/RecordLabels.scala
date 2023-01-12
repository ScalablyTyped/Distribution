package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Description
import typings.musickitJs.anon.Latestreleases
import typings.musickitJs.musickitJsStrings.`record-labels`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a record label.
  * https://developer.apple.com/documentation/applemusicapi/recordlabels/
  */
trait RecordLabels
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_RecordLabels: js.UndefOr[Description] = js.undefined
  
  @JSName("id")
  var id_RecordLabels: MusicItemID
  
  @JSName("type")
  var type_RecordLabels: `record-labels`
  
  @JSName("views")
  var views_RecordLabels: Latestreleases
}
object RecordLabels {
  
  inline def apply(href: String, id: MusicItemID, views: Latestreleases): RecordLabels = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("record-labels")
    __obj.asInstanceOf[RecordLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordLabels] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Description): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setId(value: MusicItemID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: `record-labels`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Latestreleases): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
