package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMigrated extends StObject {
  
  var __typename: String
  
  var isMigrated: Boolean
  
  var labelName: String
  
  var labelhash: String
  
  var name: String
  
  var parent: Name
}
object IsMigrated {
  
  inline def apply(
    __typename: String,
    isMigrated: Boolean,
    labelName: String,
    labelhash: String,
    name: String,
    parent: Name
  ): IsMigrated = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], isMigrated = isMigrated.asInstanceOf[js.Any], labelName = labelName.asInstanceOf[js.Any], labelhash = labelhash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMigrated]
  }
  
  extension [Self <: IsMigrated](x: Self) {
    
    inline def setIsMigrated(value: Boolean): Self = StObject.set(x, "isMigrated", value.asInstanceOf[js.Any])
    
    inline def setLabelName(value: String): Self = StObject.set(x, "labelName", value.asInstanceOf[js.Any])
    
    inline def setLabelhash(value: String): Self = StObject.set(x, "labelhash", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Name): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
  }
}
