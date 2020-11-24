package typings.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFilterOperator extends js.Object {
  
  /**
    * FilterOperator between.When used on strings, the BT operator might not behave intuitively. For
    * example,when filtering a list of Names with BT "A", "B", all Names starting with "A" will beincluded
    * as well as the name "B" itself, but no other name starting with "B".
    */
  var BT: js.Any = js.native
  
  /**
    * FilterOperator contains
    */
  var Contains: js.Any = js.native
  
  /**
    * FilterOperator equals
    */
  var EQ: js.Any = js.native
  
  /**
    * FilterOperator ends with
    */
  var EndsWith: js.Any = js.native
  
  /**
    * FilterOperator greater or equals
    */
  var GE: js.Any = js.native
  
  /**
    * FilterOperator greater than
    */
  var GT: js.Any = js.native
  
  /**
    * FilterOperator less or equals
    */
  var LE: js.Any = js.native
  
  /**
    * FilterOperator less than
    */
  var LT: js.Any = js.native
  
  /**
    * FilterOperator not equals
    */
  var NE: js.Any = js.native
  
  /**
    * FilterOperator starts with
    */
  var StartsWith: js.Any = js.native
}
object TypeofFilterOperator {
  
  @scala.inline
  def apply(
    BT: js.Any,
    Contains: js.Any,
    EQ: js.Any,
    EndsWith: js.Any,
    GE: js.Any,
    GT: js.Any,
    LE: js.Any,
    LT: js.Any,
    NE: js.Any,
    StartsWith: js.Any
  ): TypeofFilterOperator = {
    val __obj = js.Dynamic.literal(BT = BT.asInstanceOf[js.Any], Contains = Contains.asInstanceOf[js.Any], EQ = EQ.asInstanceOf[js.Any], EndsWith = EndsWith.asInstanceOf[js.Any], GE = GE.asInstanceOf[js.Any], GT = GT.asInstanceOf[js.Any], LE = LE.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], NE = NE.asInstanceOf[js.Any], StartsWith = StartsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFilterOperator]
  }
  
  @scala.inline
  implicit class TypeofFilterOperatorOps[Self <: TypeofFilterOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBT(value: js.Any): Self = this.set("BT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: js.Any): Self = this.set("Contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEQ(value: js.Any): Self = this.set("EQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndsWith(value: js.Any): Self = this.set("EndsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGE(value: js.Any): Self = this.set("GE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGT(value: js.Any): Self = this.set("GT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLE(value: js.Any): Self = this.set("LE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLT(value: js.Any): Self = this.set("LT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNE(value: js.Any): Self = this.set("NE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsWith(value: js.Any): Self = this.set("StartsWith", value.asInstanceOf[js.Any])
  }
}
