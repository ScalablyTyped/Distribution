package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the current Web browser.
  * The Sys.Browser object determines which browser is being used and provides some information about it. You can use this object to help customize your code to the unique requirements or capabilities of the browser.
  * @see {@link http://msdn.microsoft.com/en-us/library/cc679064(v=vs.100).aspx}
  */
trait Browser extends js.Object {
  //#region Fields
  /**
    * Gets an object that represents the user agent of the browser.
    */
  var agent: js.Any
  /**
    * Gets a value that indicates the document compatibility mode of the browser.
    * @return
    *
    */
  var documentMode: scala.Double
  /*
    * Gets a value that indicates whether the browser supports debug statements.
    * @return
    *   True if the browser supports debug statements
    */
  var hasDebuggerStatement: scala.Boolean
  /**
    * Gets the name of the browser.
    * @return
    *   The name of the browser
    */
  var name: java.lang.String
  /*
    * Gets the version number of the browser.
    * @return
    *   The version of the browser
    */
  var version: scala.Double
}

object Browser {
  @scala.inline
  def apply(
    agent: js.Any,
    documentMode: scala.Double,
    hasDebuggerStatement: scala.Boolean,
    name: java.lang.String,
    version: scala.Double
  ): Browser = {
    val __obj = js.Dynamic.literal(agent = agent, documentMode = documentMode, hasDebuggerStatement = hasDebuggerStatement, name = name, version = version)
  
    __obj.asInstanceOf[Browser]
  }
}

