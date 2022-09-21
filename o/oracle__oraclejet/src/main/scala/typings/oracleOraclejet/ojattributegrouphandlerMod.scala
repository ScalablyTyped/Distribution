package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojattributegrouphandlerMod {
  
  @JSImport("@oracle/oraclejet/ojattributegrouphandler", "AttributeGroupHandler")
  @js.native
  open class AttributeGroupHandler () extends StObject {
    def this(matchRules: StringDictionary[Any]) = this()
    
    def addMatchRule(category: String, attributeValue: Any): Unit = js.native
    
    def getCategoryAssignments(): js.Array[StringDictionary[Any]] = js.native
    
    def getValue(category: String): Any = js.native
    
    def getValueRamp(): js.Array[Any] = js.native
  }
  
  @JSImport("@oracle/oraclejet/ojattributegrouphandler", "ColorAttributeGroupHandler")
  @js.native
  open class ColorAttributeGroupHandler () extends AttributeGroupHandler {
    def this(matchRules: StringDictionary[Any]) = this()
  }
  
  @JSImport("@oracle/oraclejet/ojattributegrouphandler", "ShapeAttributeGroupHandler")
  @js.native
  open class ShapeAttributeGroupHandler () extends AttributeGroupHandler {
    def this(matchRules: StringDictionary[Any]) = this()
  }
}
