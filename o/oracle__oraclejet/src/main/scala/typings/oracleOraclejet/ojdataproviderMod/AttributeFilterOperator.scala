package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeFilterOperator[D] extends StObject {
  
  var attribute: String = js.native
  
  var op: AttributeOperator = js.native
  
  var value: js.Any = js.native
}
object AttributeFilterOperator {
  
  @scala.inline
  def apply[D](attribute: String, op: AttributeOperator, value: js.Any): AttributeFilterOperator[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeFilterOperator[D]]
  }
  
  @scala.inline
  implicit class AttributeFilterOperatorMutableBuilder[Self <: AttributeFilterOperator[_], D] (val x: Self with AttributeFilterOperator[D]) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: AttributeOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.oracleOraclejetStrings.$co
    - typings.oracleOraclejet.oracleOraclejetStrings.$eq
    - typings.oracleOraclejet.oracleOraclejetStrings.$ew
    - typings.oracleOraclejet.oracleOraclejetStrings.$pr
    - typings.oracleOraclejet.oracleOraclejetStrings.$gt
    - typings.oracleOraclejet.oracleOraclejetStrings.$ge
    - typings.oracleOraclejet.oracleOraclejetStrings.$lt
    - typings.oracleOraclejet.oracleOraclejetStrings.$le
    - typings.oracleOraclejet.oracleOraclejetStrings.$ne
    - typings.oracleOraclejet.oracleOraclejetStrings.$regex
    - typings.oracleOraclejet.oracleOraclejetStrings.$sw
  */
  trait AttributeOperator extends StObject
  object AttributeOperator {
    
    @scala.inline
    def $co: typings.oracleOraclejet.oracleOraclejetStrings.$co = "$co".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$co]
    
    @scala.inline
    def $eq: typings.oracleOraclejet.oracleOraclejetStrings.$eq = "$eq".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$eq]
    
    @scala.inline
    def $ew: typings.oracleOraclejet.oracleOraclejetStrings.$ew = "$ew".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$ew]
    
    @scala.inline
    def $ge: typings.oracleOraclejet.oracleOraclejetStrings.$ge = "$ge".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$ge]
    
    @scala.inline
    def $gt: typings.oracleOraclejet.oracleOraclejetStrings.$gt = "$gt".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$gt]
    
    @scala.inline
    def $le: typings.oracleOraclejet.oracleOraclejetStrings.$le = "$le".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$le]
    
    @scala.inline
    def $lt: typings.oracleOraclejet.oracleOraclejetStrings.$lt = "$lt".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$lt]
    
    @scala.inline
    def $ne: typings.oracleOraclejet.oracleOraclejetStrings.$ne = "$ne".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$ne]
    
    @scala.inline
    def $pr: typings.oracleOraclejet.oracleOraclejetStrings.$pr = "$pr".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$pr]
    
    @scala.inline
    def $regex: typings.oracleOraclejet.oracleOraclejetStrings.$regex = "$regex".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$regex]
    
    @scala.inline
    def $sw: typings.oracleOraclejet.oracleOraclejetStrings.$sw = "$sw".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.$sw]
  }
}
