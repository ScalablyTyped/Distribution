package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Manifest")
@js.native
class Manifest protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
    * Creates and initializes a manifest wrapper which provides API access tothe content of the manifest.
    * @param oManifest the manifest object
    * @param mOptions (optional) the configuration options
    */
  def this(oManifest: js.Any) = this()
  def this(oManifest: js.Any, mOptions: js.Any) = this()
  /**
    * Returns the Component name which is defined in the manifest as<code>sap.ui5/componentName</code> or
    * <code>sap.app/id</code>
    * @returns the component name
    */
  def getComponentName(): java.lang.String = js.native
  /**
    * Returns the configuration of a manifest section or the value for aspecific path. If no key is
    * specified, the return value is null.Example:<code>  {    "sap.ui5": {      "dependencies": {       
    * "libs": {          "sap.m": {}        },        "components": {          "my.component.a": {}       
    * }      }  });</code>The configuration above can be accessed in the following ways:<ul><li><b>By
    * section/namespace</b>: <code>oManifest.getEntry("sap.ui5")</code></li><li><b>By path</b>:
    * <code>oManifest.getEntry("/sap.ui5/dependencies/libs")</code></li></ul>By section/namespace returns
    * the configuration for the specified manifestsection and by path allows to specify a concrete path to
    * a dedicated entryinside the manifest. The path syntax always starts with a slash (/).
    * @param sKey Either the manifest section name (namespace) or a concrete path
    * @returns Value of the key (could be any kind of value)
    */
  def getEntry(sKey: java.lang.String): js.Any = js.native
  /**
    * Returns the manifest defined in the metadata of the component.If not specified, the return value is
    * null.
    * @returns manifest.
    */
  def getJson(): js.Any = js.native
  /**
    * Returns the raw manifest defined in the metadata of the component.If not specified, the return value
    * is null.
    * @returns manifest
    */
  def getRawJson(): js.Any = js.native
  /**
    * Function to load the manifest by URL
    * @param mOptions the configuration options
    * @returns Manifest object or for asynchronous calls an ECMA Script 6 Promise object will be returned.
    */
  def load(mOptions: js.Any): Manifest | jqueryLib.JQueryPromise[_] = js.native
}

