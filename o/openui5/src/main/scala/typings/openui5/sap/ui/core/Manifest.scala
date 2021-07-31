package typings.openui5.sap.ui.core

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manifest
  extends StObject
     with Object {
  
  /**
    * Returns the Component name which is defined in the manifest as<code>sap.ui5/componentName</code> or
    * <code>sap.app/id</code>
    * @returns the component name
    */
  def getComponentName(): String = js.native
  
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
  def getEntry(sKey: String): js.Any = js.native
  
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
  def load(mOptions: js.Any): Manifest | JQueryPromise[js.Any] = js.native
}
