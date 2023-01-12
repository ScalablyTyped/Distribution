package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Contents
import typings.musickitJs.anon.Kind
import typings.musickitJs.musickitJsStrings.`personal-recommendation`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents recommended resources for a user calculated using their selected preferences.
  * https://developer.apple.com/documentation/applemusicapi/personalrecommendation
  */
trait PersonalRecommendation
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_PersonalRecommendation: js.UndefOr[Kind] = js.undefined
  
  @JSName("relationships")
  var relationships_PersonalRecommendation: js.UndefOr[Contents] = js.undefined
  
  @JSName("type")
  var type_PersonalRecommendation: `personal-recommendation`
}
object PersonalRecommendation {
  
  inline def apply(href: String, id: String): PersonalRecommendation = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("personal-recommendation")
    __obj.asInstanceOf[PersonalRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersonalRecommendation] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Kind): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: Contents): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setType(value: `personal-recommendation`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
