package typings.openui5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JquerySap extends js.Object {
  var log: Ui5Logger = js.native
  // Adds a whitelist entry for URL valiadtion 
  def addUrlWhitelist(protocol: js.Any, host: js.Any, port: js.Any, path: js.Any): Unit = js.native
  // Calculate delta of old list and new list This implements the algorithm described in "A Technique for Isolating Differences Between Files" (Commun. 
  def arrayDiff(aOld: js.Any, aNew: js.Any): Unit = js.native
  def arrayDiff(aOld: js.Any, aNew: js.Any, fnCompare: js.Any): Unit = js.native
  def arrayDiff(aOld: js.Any, aNew: js.Any, fnCompare: js.Any, bUniqueEntries: js.Any): Unit = js.native
  // A simple assertion mechanism that logs a message when a given condition is not met. 
  def assert(bResult: js.Any, sMessage: js.Any): Unit = js.native
  // Binds all events for listening with the given callback function. 
  def bindAnyEvent(fnCallback: js.Any): Unit = js.native
  // Shortcut for jQuery("#" + id) with additionally the id being escaped properly. 
  def byId(sId: js.Any, oContext: js.Any): Unit = js.native
  // Transforms a hyphen separated string to an camel case string. 
  def camelCase(sString: js.Any): Unit = js.native
  // Converts a character of the string to upper case. 
  def charToUpperCase(sString: js.Any, iPos: js.Any): Unit = js.native
  // Checks a given mouseover or mouseout event whether it is equivalent to a mouseenter or mousleave event regarding the given DOM reference. 
  def checkMouseEnterOrLeave(oEvent: js.Any, oDomRef: js.Any): Unit = js.native
  // Stops the delayed call. 
  def clearDelayedCall(sDelayedCallId: js.Any): Unit = js.native
  // Stops the interval call. 
  def clearIntervalCall(sIntervalCallId: js.Any): Unit = js.native
  // clears the whitelist for URL valiadtion 
  def clearUrlWhitelist(): Unit = js.native
  // Returns whether oDomRefChild is oDomRefContainer or is contained in oDomRefContainer. 
  def containsOrEquals(oDomRefContainer: js.Any, oDomRefChild: js.Any): Unit = js.native
  // Declares a module as existing. 
  def declare(sModuleName: js.Any): Unit = js.native
  def declare(sModuleName: js.Any, bCreateNamespace: js.Any): Unit = js.native
  // Calls a method after a given delay and returns an id for this timer 
  def delayedCall(iDelay: js.Any, oObject: js.Any, method: js.Any): Unit = js.native
  def delayedCall(iDelay: js.Any, oObject: js.Any, method: js.Any, aParameters: js.Any): Unit = js.native
  // For the given scroll position measured from the "beginning" of a container (the right edge in RTL mode) this method returns the scrollLeft value as understood by the current browser in RTL mode. 
  def denormalizeScrollBeginRTL(iNormalizedScrollBegin: js.Any, oDomRef: js.Any): Unit = js.native
  // For the given scrollLeft value this method returns the scrollLeft value as understood by the current browser in RTL mode. 
  def denormalizeScrollLeftRTL(iNormalizedScrollLeft: js.Any, oDomRef: js.Any): Unit = js.native
  // Disable touch to mouse handling 
  def disableTouchToMouseHandling(): Unit = js.native
  // Shortcut for document.getElementById(), including a bug fix for older IE versions. 
  def domById(sId: js.Any): Unit = js.native
  def domById(sId: js.Any, oWindow: js.Any): Unit = js.native
  // Encode the string for inclusion into CSS string literals or identifiers 
  def encodeCSS(sString: js.Any): Unit = js.native
  // Encode the string for inclusion into HTML content/attribute 
  def encodeHTML(sString: js.Any): Unit = js.native
  // Encode the string for inclusion into a JS string literal 
  def encodeJS(sString: js.Any): Unit = js.native
  // Encode the string for inclusion into an URL parameter 
  def encodeURL(sString: js.Any): Unit = js.native
  // Encode a map of parameters into a combined URL parameter string 
  def encodeURLParameters(mParams: js.Any): Unit = js.native
  // Encode the string for inclusion into XML content/attribute 
  def encodeXML(sString: js.Any): Unit = js.native
  // Checks whether a given sString ends with sEndString respecting the case of the strings. 
  def endsWith(sString: js.Any, sEndString: js.Any): Unit = js.native
  // Checks whether a given sString ends with sEndString ignoring the case of the strings. 
  def endsWithIgnoreCase(sString: js.Any, sEndString: js.Any): Unit = js.native
  // Compares the two given values for equality, especially takes care not to compare arrays and objects by reference: any, but compares their content. 
  def equal(a: js.Any, b: js.Any): Unit = js.native
  def equal(a: js.Any, b: js.Any, maxDepth: js.Any): Unit = js.native
  def equal(a: js.Any, b: js.Any, maxDepth: js.Any, contains: js.Any): Unit = js.native
  // This function escapes the reserved letters in Regular Expression 
  def escapeRegExp(sString: js.Any): Unit = js.native
  // Returns a new constructor function that creates objects with the given prototype. 
  def factory(oPrototype: js.Any): Unit = js.native
  // Calls focus() on the given DOM element, but catches and ignores any errors that occur when doing so. 
  def focus(oDomRef: js.Any): Unit = js.native
  // Creates a string from a pattern by replacing placeholders with concrete values. 
  def formatMessage(sPattern: js.Any): Unit = js.native
  def formatMessage(sPattern: js.Any, aValues: js.Any): Unit = js.native
  // Returns the names of all declared modules. 
  def getAllDeclaredModules(): Unit = js.native
  // Constructs an URL to load the module with the given name and file type (suffix). 
  def getModulePath(sModuleName: js.Any, sSuffix: js.Any): Unit = js.native
  // Returns a JavaScript object which is identified by a sequence of names. 
  def getObject(sName: js.Any): Unit = js.native
  def getObject(sName: js.Any, iNoCreates: js.Any): Unit = js.native
  def getObject(sName: js.Any, iNoCreates: js.Any, oContext: js.Any): Unit = js.native
  // Determines the URL for a resource given its unified resource name. 
  def getResourcePath(sResourceName: js.Any): Unit = js.native
  // Creates and returns a new instance of jQuery.sap.util.UriParameters. 
  def getUriParameters(sUri: js.Any): Unit = js.native
  // Gets the whitelist for URL valiadtion 
  def getUrlWhitelist(): Unit = js.native
  // Returns a new function that returns the given oValue (using its closure). 
  def getter(oValue: js.Any): Unit = js.native
  // Executes an 'eval' for its arguments in the global context (without closure variables). 
  def globalEval(): Unit = js.native
  // Transforms a camel case string into a hyphen separated string. 
  def hyphen(sString: js.Any): Unit = js.native
  // Includes the script (via <script>-tag) into the head for the specified sUrl and optional sId. 
  def includeScript(sUrl: js.Any): Unit = js.native
  def includeScript(sUrl: js.Any, sId: js.Any): Unit = js.native
  def includeScript(sUrl: js.Any, sId: js.Any, fnLoadCallback: js.Any): Unit = js.native
  def includeScript(sUrl: js.Any, sId: js.Any, fnLoadCallback: js.Any, fnErrorCallback: js.Any): Unit = js.native
  // Includes the specified stylesheet via a <link>-tag in the head of the current document. 
  def includeStyleSheet(sUrl: js.Any): Unit = js.native
  def includeStyleSheet(sUrl: js.Any, sId: js.Any): Unit = js.native
  def includeStyleSheet(sUrl: js.Any, sId: js.Any, fnLoadCallback: js.Any): Unit = js.native
  def includeStyleSheet(sUrl: js.Any, sId: js.Any, fnLoadCallback: js.Any, fnErrorCallback: js.Any): Unit = js.native
  // Does some basic modifications to the HTML page that make it more suitable for mobile apps. 
  def initMobile(): Unit = js.native
  def initMobile(options: js.Any): Unit = js.native
  // Calls a method after a given interval and returns an id for this interval. 
  def intervalCall(iInterval: js.Any, oObject: js.Any, method: js.Any): Unit = js.native
  def intervalCall(iInterval: js.Any, oObject: js.Any, method: js.Any, aParameters: js.Any): Unit = js.native
  // Check whether a given module has been loaded / declared already. 
  def isDeclared(sModuleName: js.Any): Unit = js.native
  def isDeclared(sModuleName: js.Any, bIncludePreloaded: js.Any): Unit = js.native
  // Returns a new object which has the given oPrototype as its prototype. 
  def newObject(oPrototype: js.Any): Unit = js.native
  // Returns the window reference for a DomRef 
  def ownerWindow(oDomRef: js.Any): Unit = js.native
  // Pads a string on the left side until is has the given length. 
  def padLeft(sString: js.Any, sPadChar: js.Any, iLength: js.Any): Unit = js.native
  // Pads a string on the right side until is has the given length. 
  def padRight(sString: js.Any, sPadChar: js.Any, iLength: js.Any): Unit = js.native
  // Parses the specified XML formatted string text using native parsing function of the browser and returns a valid XML document. 
  def parseXML(sXMLText: js.Any): Unit = js.native
  // Creates and returns a new instance of jQuery.sap.util.Properties. 
  def properties(): Unit = js.native
  def properties(mParams: js.Any): Unit = js.native
  // Registers an URL prefix for a module name prefix. 
  def registerModulePath(sModuleName: js.Any, vUrlPrefix: js.Any): Unit = js.native
  // Registers an URL prefix for a resource name prefix. 
  def registerResourcePath(sResourceNamePrefix: js.Any, vUrlPrefix: js.Any): Unit = js.native
  // Removes a whitelist entry for URL valiadtion 
  def removeUrlWhitelist(iIndex: js.Any): Unit = js.native
  // Ensures that the given module is loaded and executed before execution of the current script continues. 
  def require(vModuleName: js.Any): Unit = js.native
  // Creates and returns a new instance of jQuery.sap.util.ResourceBundle using the given URL and locale to determine what to load. 
  def resources(): Unit = js.native
  def resources(mParams: js.Any): Unit = js.native
  // Returns the size (width of the vertical / height of the horizontal) native browser scrollbars. 
  def scrollbarSize(): Unit = js.native
  def scrollbarSize(sClasses: js.Any): Unit = js.native
  def scrollbarSize(sClasses: js.Any, bForce: js.Any): Unit = js.native
  // Serializes the specified XML document into a string representation. 
  def serializeXML(oXMLDocument: js.Any): Unit = js.native
  // Sets the bookmark icon for desktop browsers and the icon to be displayed on the home screen of iOS devices after the user does "add to home screen". 
  def setIcons(oIcons: js.Any): Unit = js.native
  // Sets the "apple-mobile-web-app-capable" and "mobile-web-app-capable" meta information which defines whether the application is loaded in full screen mode (browser address bar and toolbar are hidden) after the user does "add to home screen" on mobile devices. 
  def setMobileWebAppCapable(bValue: js.Any): Unit = js.native
  // Sets an object property to a given value, where the property is identified by a sequence of names (path: any). 
  def setObject(sName: js.Any, vValue: js.Any): Unit = js.native
  def setObject(sName: js.Any, vValue: js.Any, oContext: js.Any): Unit = js.native
  // Convenience wrapper around jQuery.ajax() that avoids the need for callback functions when synchronous calls are made. 
  def sjax(oOrigSettings: js.Any): Unit = js.native
  // Checks whether a given sString starts with sStartString respecting the case of the strings. 
  def startsWith(sString: js.Any, sStartString: js.Any): Unit = js.native
  // Checks whether a given sString starts with sStartString ignoring the case of the strings. 
  def startsWithIgnoreCase(sString: js.Any, sStartString: js.Any): Unit = js.native
  // Convenience wrapper for jQuery.sap.sjax that enforeces the Http method GET and defaults the data type of the result to 'text'. 
  def syncGet(sUrl: js.Any, data: js.Any): Unit = js.native
  def syncGet(sUrl: js.Any, data: js.Any, sDataType: js.Any): Unit = js.native
  // Convenience wrapper for jQuery.sap.sjax that enforces the Http method GET and the data type 'json'. 
  def syncGetJSON(sUrl: js.Any, data: js.Any): Unit = js.native
  def syncGetJSON(sUrl: js.Any, data: js.Any, fallback: js.Any): Unit = js.native
  // Convenience wrapper for jQuery.sap.sjax that enforces the Http method GET and the data type 'text'. 
  def syncGetText(sUrl: js.Any, data: js.Any): Unit = js.native
  def syncGetText(sUrl: js.Any, data: js.Any, fallback: js.Any): Unit = js.native
  // Convenience wrapper for jQuery.sap.sjax that enforces the Http method POST and defaults the data type of the result to 'text'. 
  def syncPost(sUrl: js.Any, data: js.Any): Unit = js.native
  def syncPost(sUrl: js.Any, data: js.Any, sDataType: js.Any): Unit = js.native
  // Search ancestors of the given source DOM element for the specified CSS class name. 
  def syncStyleClass(sStyleClass: js.Any, vSource: js.Any, vDestination: js.Any): Unit = js.native
  // Creates and returns a pseudo-unique id. 
  def uid(): Unit = js.native
  // Unbinds all events for listening with the given callback function. 
  def unbindAnyEvent(fnCallback: js.Any): Unit = js.native
  // Sorts the given array in-place and removes any duplicates (identified by "==="). 
  def unique(a: js.Any): Unit = js.native
  // Validates an URL. 
  def validateUrl(sUrl: js.Any): Unit = js.native
}

