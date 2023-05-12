package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceCategory extends StObject {
  
  /**
    * @description The category of reference to an external resource this reference refers to.
    * @example PACKAGE-MANAGER
    */
  var referenceCategory: String
  
  /**
    * @description A locator for the particular external resource this reference refers to.
    * @example pkg:gem/rails@6.0.1
    */
  var referenceLocator: String
  
  /**
    * @description The category of reference to an external resource this reference refers to.
    * @example purl
    */
  var referenceType: String
}
object ReferenceCategory {
  
  inline def apply(referenceCategory: String, referenceLocator: String, referenceType: String): ReferenceCategory = {
    val __obj = js.Dynamic.literal(referenceCategory = referenceCategory.asInstanceOf[js.Any], referenceLocator = referenceLocator.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceCategory] (val x: Self) extends AnyVal {
    
    inline def setReferenceCategory(value: String): Self = StObject.set(x, "referenceCategory", value.asInstanceOf[js.Any])
    
    inline def setReferenceLocator(value: String): Self = StObject.set(x, "referenceLocator", value.asInstanceOf[js.Any])
    
    inline def setReferenceType(value: String): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
  }
}
