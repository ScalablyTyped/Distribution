package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that represents a description attribute.
  * https://developer.apple.com/documentation/applemusicapi/descriptionattribute/
  */
trait DescriptionAttribute extends StObject {
  
  var short: String
  
  var standard: String
}
object DescriptionAttribute {
  
  inline def apply(short: String, standard: String): DescriptionAttribute = {
    val __obj = js.Dynamic.literal(short = short.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionAttribute] (val x: Self) extends AnyVal {
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
