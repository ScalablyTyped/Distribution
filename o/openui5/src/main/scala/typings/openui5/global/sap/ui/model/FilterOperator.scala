package typings.openui5.global.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterOperator {
  
  @JSGlobal("sap.ui.model.FilterOperator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * FilterOperator between.When used on strings, the BT operator might not behave intuitively. For
    * example,when filtering a list of Names with BT "A", "B", all Names starting with "A" will beincluded
    * as well as the name "B" itself, but no other name starting with "B".
    */
  @JSGlobal("sap.ui.model.FilterOperator.BT")
  @js.native
  def BT: js.Any = js.native
  @scala.inline
  def BT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BT")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator contains
    */
  @JSGlobal("sap.ui.model.FilterOperator.Contains")
  @js.native
  def Contains: js.Any = js.native
  @scala.inline
  def Contains_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Contains")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator equals
    */
  @JSGlobal("sap.ui.model.FilterOperator.EQ")
  @js.native
  def EQ: js.Any = js.native
  @scala.inline
  def EQ_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQ")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator ends with
    */
  @JSGlobal("sap.ui.model.FilterOperator.EndsWith")
  @js.native
  def EndsWith: js.Any = js.native
  @scala.inline
  def EndsWith_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EndsWith")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator greater or equals
    */
  @JSGlobal("sap.ui.model.FilterOperator.GE")
  @js.native
  def GE: js.Any = js.native
  @scala.inline
  def GE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GE")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator greater than
    */
  @JSGlobal("sap.ui.model.FilterOperator.GT")
  @js.native
  def GT: js.Any = js.native
  @scala.inline
  def GT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GT")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator less or equals
    */
  @JSGlobal("sap.ui.model.FilterOperator.LE")
  @js.native
  def LE: js.Any = js.native
  @scala.inline
  def LE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LE")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator less than
    */
  @JSGlobal("sap.ui.model.FilterOperator.LT")
  @js.native
  def LT: js.Any = js.native
  @scala.inline
  def LT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LT")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator not equals
    */
  @JSGlobal("sap.ui.model.FilterOperator.NE")
  @js.native
  def NE: js.Any = js.native
  @scala.inline
  def NE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NE")(x.asInstanceOf[js.Any])
  
  /**
    * FilterOperator starts with
    */
  @JSGlobal("sap.ui.model.FilterOperator.StartsWith")
  @js.native
  def StartsWith: js.Any = js.native
  @scala.inline
  def StartsWith_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StartsWith")(x.asInstanceOf[js.Any])
}
