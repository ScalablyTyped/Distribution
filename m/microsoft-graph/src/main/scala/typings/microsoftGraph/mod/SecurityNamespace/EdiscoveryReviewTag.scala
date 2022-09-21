package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoveryReviewTag
  extends StObject
     with Tag {
  
  /**
    * Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.
    * This value controls whether the UX presents the tags as checkboxes or a radio button group.
    */
  var childSelectability: js.UndefOr[NullableOption[ChildSelectability]] = js.undefined
  
  // Returns the tags that are a child of a tag.
  var childTags: js.UndefOr[NullableOption[js.Array[EdiscoveryReviewTag]]] = js.undefined
  
  // Returns the parent tag of the specified tag.
  var parent: js.UndefOr[NullableOption[EdiscoveryReviewTag]] = js.undefined
}
object EdiscoveryReviewTag {
  
  inline def apply(): EdiscoveryReviewTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoveryReviewTag]
  }
  
  extension [Self <: EdiscoveryReviewTag](x: Self) {
    
    inline def setChildSelectability(value: NullableOption[ChildSelectability]): Self = StObject.set(x, "childSelectability", value.asInstanceOf[js.Any])
    
    inline def setChildSelectabilityNull: Self = StObject.set(x, "childSelectability", null)
    
    inline def setChildSelectabilityUndefined: Self = StObject.set(x, "childSelectability", js.undefined)
    
    inline def setChildTags(value: NullableOption[js.Array[EdiscoveryReviewTag]]): Self = StObject.set(x, "childTags", value.asInstanceOf[js.Any])
    
    inline def setChildTagsNull: Self = StObject.set(x, "childTags", null)
    
    inline def setChildTagsUndefined: Self = StObject.set(x, "childTags", js.undefined)
    
    inline def setChildTagsVarargs(value: EdiscoveryReviewTag*): Self = StObject.set(x, "childTags", js.Array(value*))
    
    inline def setParent(value: NullableOption[EdiscoveryReviewTag]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
