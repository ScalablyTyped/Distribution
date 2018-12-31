package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.TablePersoProvider")
@js.native
/**
  * This is an abstract TablePersoProvider, describing the interface for a realTablePersoProvider.
  */
abstract class TablePersoProvider ()
  extends openui5Lib.sapNs.uiNs.baseNs.ManagedObject {
  /**
    * Removes the personalization bundleThis must return a jQuery promise (see
    * http://api.jquery.com/promise/)
    */
  def delPersData(): scala.Unit = js.native
  /**
    * Callback function which can be used to determine the title of a given columnwithin the
    * TablePersoDialog. As a default, the column header controls areasked for their 'text' or 'title'
    * property. This works in most cases, for exampleif the header control is a sap.m.Label (has 'text'
    * property) or a sap.m.ObjectListItem(has 'title' property).If the header control used in a column has
    * neither 'text' nor 'title' property, or if you would like todisplay a modified column name for a
    * certain column, this callback function can be used.If the callback delivers null for a column (which
    * is the default implementation), the defaulttexts described above are displayed for that column in
    * the TablePersoDialog.In case neither the callback delivers null and neither 'text' nor ' title'
    * property are at hand,the TablePersoDialog will display the column id and a warning message is
    * logged.
    * @param oColumn column whose caption shall be determined
    */
  def getCaption(oColumn: Column): scala.Unit = js.native
  /**
    * Callback function which can be used to determine the group of a given columnwithin the
    * TablePersoDialog. As a default, the columns are not assigned to a group.This information is used to
    * group the columns within the TablePersoDialog if the TablePersoController's'group' flag is set,
    * otherwise, the groups are ignored.
    * @param oColumn column whose group shall be determined
    */
  def getGroup(oColumn: Column): scala.Unit = js.native
  /**
    * Retrieves the personalization bundle.This must return a jQuery promise (see
    * http://api.jquery.com/promise/)
    */
  def getPersData(): scala.Unit = js.native
  /**
    * Initializes the TablePersoProvider instance after creation.
    */
  def init(): scala.Unit = js.native
  /**
    * Resets user’s personalization for a given table so that ‘getPersData’ willdeliver its initial state.
    * If no table is specified, all personalizationsof the currently logged on user are reset.This must
    * return a jQuery promise (see http://api.jquery.com/promise/)
    */
  def resetPersData(): scala.Unit = js.native
  /**
    * Stores the personalization bundle, overwriting anyprevious bundle completelyThis must return a
    * jQuery promise (see http://api.jquery.com/promise/)
    * @param oBundle undefined
    */
  def setPersData(oBundle: js.Any): scala.Unit = js.native
}

