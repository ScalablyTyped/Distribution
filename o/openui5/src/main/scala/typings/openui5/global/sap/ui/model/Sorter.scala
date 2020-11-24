package typings.openui5.global.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.Sorter")
@js.native
class Sorter protected ()
  extends typings.openui5.sap.ui.model.Sorter {
  /**
    * Constructor for Sorter
    * @param sPath the binding path used for sorting
    * @param bDescending whether the sort order should be descending
    * @param vGroup configure grouping of the content, can either be true to enable grouping       based
    * on the raw model property value, or a function which calculates the group value out of the      
    * context (e.g. oContext.getProperty("date").getYear() for year grouping). The control needs to      
    * implement the grouping behaviour for the aggregation which you want to group. In case a function    
    *   is provided it must either return a primitive type value as the group key or an object containing 
    *      a "key" property an may contain additional properties needed for group visualization.
    * @param fnComparator a custom comparator function, which is used for clientside sorting instead      
    * of the default comparator method.
    */
  def this(sPath: String) = this()
  def this(sPath: String, bDescending: Boolean) = this()
  def this(sPath: String, bDescending: js.UndefOr[scala.Nothing], vGroup: js.Any) = this()
  def this(sPath: String, bDescending: js.UndefOr[scala.Nothing], vGroup: Boolean) = this()
  def this(sPath: String, bDescending: Boolean, vGroup: js.Any) = this()
  def this(sPath: String, bDescending: Boolean, vGroup: Boolean) = this()
  def this(
    sPath: String,
    bDescending: js.UndefOr[scala.Nothing],
    vGroup: js.UndefOr[scala.Nothing],
    fnComparator: js.Any
  ) = this()
  def this(sPath: String, bDescending: js.UndefOr[scala.Nothing], vGroup: js.Any, fnComparator: js.Any) = this()
  def this(sPath: String, bDescending: js.UndefOr[scala.Nothing], vGroup: Boolean, fnComparator: js.Any) = this()
  def this(sPath: String, bDescending: Boolean, vGroup: js.UndefOr[scala.Nothing], fnComparator: js.Any) = this()
  def this(sPath: String, bDescending: Boolean, vGroup: js.Any, fnComparator: js.Any) = this()
  def this(sPath: String, bDescending: Boolean, vGroup: Boolean, fnComparator: js.Any) = this()
}
