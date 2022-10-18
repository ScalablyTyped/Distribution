package typings.nextAuth.anon

import typings.nextAuth.nextAuthStrings.child
import typings.nextAuth.nextAuthStrings.grandchild
import typings.nextAuth.nextAuthStrings.grandparent
import typings.nextAuth.nextAuthStrings.parent
import typings.nextAuth.nextAuthStrings.sibling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameType extends StObject {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: parent | child | grandparent | grandchild | sibling
}
object NameType {
  
  inline def apply(`type`: parent | child | grandparent | grandchild | sibling): NameType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameType]
  }
  
  extension [Self <: NameType](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: parent | child | grandparent | grandchild | sibling): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
