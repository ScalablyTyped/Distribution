package typings.meteor.anon

import typings.meteor.meteorStrings.nearest
import typings.meteor.meteorStrings.primary
import typings.meteor.meteorStrings.primaryPreferred
import typings.meteor.meteorStrings.secondary
import typings.meteor.meteorStrings.secondaryPreferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReadPreferenceMode extends StObject {
  
  val nearest: typings.meteor.meteorStrings.nearest
  
  val primary: typings.meteor.meteorStrings.primary
  
  val primaryPreferred: typings.meteor.meteorStrings.primaryPreferred
  
  val secondary: typings.meteor.meteorStrings.secondary
  
  val secondaryPreferred: typings.meteor.meteorStrings.secondaryPreferred
}
object TypeofReadPreferenceMode {
  
  inline def apply(): TypeofReadPreferenceMode = {
    val __obj = js.Dynamic.literal(nearest = "nearest", primary = "primary", primaryPreferred = "primaryPreferred", secondary = "secondary", secondaryPreferred = "secondaryPreferred")
    __obj.asInstanceOf[TypeofReadPreferenceMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofReadPreferenceMode] (val x: Self) extends AnyVal {
    
    inline def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: primary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPreferred(value: primaryPreferred): Self = StObject.set(x, "primaryPreferred", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: secondary): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPreferred(value: secondaryPreferred): Self = StObject.set(x, "secondaryPreferred", value.asInstanceOf[js.Any])
  }
}
