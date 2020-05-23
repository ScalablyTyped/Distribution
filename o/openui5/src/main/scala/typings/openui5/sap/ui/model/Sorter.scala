package typings.openui5.sap.ui.model

import typings.openui5.sap.ui.base.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sorter extends Object {
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
  def defaultComparator(a: js.Any, b: js.Any): Double = js.native
  /**
    * Returns a group object, at least containing a key property for group detection.May contain
    * additional properties as provided by a custom group function.
    * @param oContext the binding context
    * @returns An object containing a key property and optional custom properties
    */
  def getGroup(oContext: Context): js.Any = js.native
}

