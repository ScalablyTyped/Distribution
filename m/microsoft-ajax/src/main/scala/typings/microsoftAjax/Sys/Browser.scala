package typings.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the current Web browser.
  * The Sys.Browser object determines which browser is being used and provides some information about it. You can use this object to help customize your code to the unique requirements or capabilities of the browser.
  * @see {@link http://msdn.microsoft.com/en-us/library/cc679064(v=vs.100).aspx}
  */
trait Browser extends StObject {
  
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
  var documentMode: Double
  
  /*
    * Gets a value that indicates whether the browser supports debug statements.
    * @return
    *   True if the browser supports debug statements
    */
  var hasDebuggerStatement: Boolean
  
  /**
    * Gets the name of the browser.
    * @return
    *   The name of the browser
    */
  var name: String
  
  /*
    * Gets the version number of the browser.
    * @return
    *   The version of the browser
    */
  var version: Double
}
object Browser {
  
  @scala.inline
  def apply(agent: js.Any, documentMode: Double, hasDebuggerStatement: Boolean, name: String, version: Double): Browser = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], documentMode = documentMode.asInstanceOf[js.Any], hasDebuggerStatement = hasDebuggerStatement.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  @scala.inline
  implicit class BrowserMutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMode(value: Double): Self = StObject.set(x, "documentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDebuggerStatement(value: Boolean): Self = StObject.set(x, "hasDebuggerStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
