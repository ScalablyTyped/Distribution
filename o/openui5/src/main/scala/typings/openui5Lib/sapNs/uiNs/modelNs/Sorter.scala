package typings
package openui5Lib.sapNs.uiNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.Sorter")
@js.native
class Sorter protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
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
  def this(sPath: java.lang.String) = this()
  def this(sPath: java.lang.String, bDescending: scala.Boolean) = this()
  def this(sPath: java.lang.String, bDescending: scala.Boolean, vGroup: js.Any) = this()
  def this(sPath: java.lang.String, bDescending: scala.Boolean, vGroup: scala.Boolean) = this()
  def this(sPath: java.lang.String, bDescending: scala.Boolean, vGroup: js.Any, fnComparator: js.Any) = this()
  def this(sPath: java.lang.String, bDescending: scala.Boolean, vGroup: scala.Boolean, fnComparator: js.Any) = this()
  /**
    * Compares two valuesThis is the default comparator function used for clientside sorting, if no custom
    * comparator is given in theconstructor. It does compare just by using equal/less than/greater than
    * with automatic type casting, exceptfor null values, which are always last, and string values where
    * localeCompare is used.The comparator method returns -1, 0 or 1, depending on the order of the two
    * items and issuitable to be used as a comparator method for Array.sort.
    * @param a the first value to compare
    * @param b the second value to compare
    * @returns -1, 0 or 1 depending on the compare result
    */
  def defaultComparator(a: js.Any, b: js.Any): scala.Double = js.native
  /**
    * Returns a group object, at least containing a key property for group detection.May contain
    * additional properties as provided by a custom group function.
    * @param oContext the binding context
    * @returns An object containing a key property and optional custom properties
    */
  def getGroup(oContext: Context): js.Any = js.native
}

