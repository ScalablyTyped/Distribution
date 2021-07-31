package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  /** The category name. */
  var category: js.UndefOr[String] = js.undefined
  
  /** Experience points earned in this category. */
  var experiencePoints: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#category`. */
  var kind: js.UndefOr[String] = js.undefined
}
object Category {
  
  @scala.inline
  def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setExperiencePoints(value: String): Self = StObject.set(x, "experiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperiencePointsUndefined: Self = StObject.set(x, "experiencePoints", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
