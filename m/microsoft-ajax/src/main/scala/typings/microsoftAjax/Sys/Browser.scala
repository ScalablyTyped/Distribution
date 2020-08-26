package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the current Web browser.
  * The Sys.Browser object determines which browser is being used and provides some information about it. You can use this object to help customize your code to the unique requirements or capabilities of the browser.
  * @see {@link http://msdn.microsoft.com/en-us/library/cc679064(v=vs.100).aspx}
  */
@js.native
trait Browser extends js.Object {
  //#region Fields
  /**
    * Gets an object that represents the user agent of the browser.
    */
  var agent: js.Any = js.native
  /**
    * Gets a value that indicates the document compatibility mode of the browser.
    * @return
    *
    */
  var documentMode: Double = js.native
  /*
    * Gets a value that indicates whether the browser supports debug statements.
    * @return
    *   True if the browser supports debug statements
    */
  var hasDebuggerStatement: Boolean = js.native
  /**
    * Gets the name of the browser.
    * @return
    *   The name of the browser
    */
  var name: String = js.native
  /*
    * Gets the version number of the browser.
    * @return
    *   The version of the browser
    */
  var version: Double = js.native
}

object Browser {
  @scala.inline
  def apply(agent: js.Any, documentMode: Double, hasDebuggerStatement: Boolean, name: String, version: Double): Browser = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], documentMode = documentMode.asInstanceOf[js.Any], hasDebuggerStatement = hasDebuggerStatement.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
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
    def setAgent(value: js.Any): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentMode(value: Double): Self = this.set("documentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasDebuggerStatement(value: Boolean): Self = this.set("hasDebuggerStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

