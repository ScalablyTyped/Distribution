package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojattributegrouphandlerMod {
  
  @JSImport("@oracle/oraclejet/ojattributegrouphandler", "AttributeGroupHandler")
  @js.native
  class AttributeGroupHandler () extends StObject {
    def this(matchRules: StringDictionary[js.Any]) = this()
    
    def addMatchRule(category: String, attributeValue: js.Any): Unit = js.native
    
    def getCategoryAssignments(): js.Array[StringDictionary[_]] = js.native
    
    def getValue(category: String): js.Any = js.native
    
    def getValueRamp(): js.Array[_] = js.native
  }
  
  @JSImport("@oracle/oraclejet/ojattributegrouphandler", "ColorAttributeGroupHandler")
  @js.native
  class ColorAttributeGroupHandler () extends AttributeGroupHandler {
    def this(matchRules: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("@oracle/oraclejet/ojattributegrouphandler", "ShapeAttributeGroupHandler")
  @js.native
  class ShapeAttributeGroupHandler () extends AttributeGroupHandler {
    def this(matchRules: StringDictionary[js.Any]) = this()
  }
}
