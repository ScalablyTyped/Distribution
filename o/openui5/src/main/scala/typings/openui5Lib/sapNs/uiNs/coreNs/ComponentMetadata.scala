package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.ComponentMetadata")
@js.native
class ComponentMetadata protected () extends js.Object {
  /**
    * Creates a new metadata object for a Component subclass.
    * @param sClassName Fully qualified name of the class that is described by this metadata object
    * @param oStaticInfo Static info to construct the metadata from
    */
  def this(sClassName: java.lang.String, oStaticInfo: js.Any) = this()
  /**
    * Returns the name of the Component (which is the namespace only with the module name)
    * @returns Component name
    */
  def getComponentName(): java.lang.String = js.native
  /**
    * Returns array of components specified in the metadata of the Component.If not specified or the array
    * is empty, the return value is null.<p><b>Important:</b></br>If a Component is loaded using the
    * manifest URL (or according the"manifest first" strategy), this function ignores the entries of
    * themanifest file! It returns only the entries which have been defined inthe Component metadata or in
    * the proper Component manifest.
    * @returns Required Components.
    */
  def getComponents(): js.Array[java.lang.String] = js.native
  /**
    * Returns a copy of the configuration property to disallow modifications.If no key is specified it
    * returns the complete configuration property
    * @since 1.15.1
    * @param sKey Key of the configuration property
    * @param bDoNotMerge If set to <code>true</code>, only the local configuration is returned
    * @returns the value of the configuration property
    */
  def getConfig(sKey: java.lang.String): js.Any = js.native
  def getConfig(sKey: java.lang.String, bDoNotMerge: scala.Boolean): js.Any = js.native
  /**
    * Returns the custom Component configuration entry with the specified key (this must be a JSON
    * object).If no key is specified, the return value is null.Example:<code> 
    * sap.ui.core.Component.extend("sample.Component", {      metadata: {          "my.custom.config" : { 
    *             "property1" : true,              "property2" : "Something else"          }      } 
    * });</code>The configuration above can be accessed via
    * <code>sample.Component.getMetadata().getCustomEntry("my.custom.config")</code>.
    * @param sKey Key of the custom configuration (must be prefixed with a namespace)
    * @param bMerged Indicates whether the custom configuration is merged with the parent custom
    * configuration of the Component.
    * @returns custom Component configuration with the specified key.
    */
  def getCustomEntry(sKey: java.lang.String, bMerged: scala.Boolean): js.Any = js.native
  /**
    * Returns the dependencies defined in the metadata of the Component. If not specified, the return
    * value is null.<p><b>Important:</b></br>If a Component is loaded using the manifest URL (or according
    * the"manifest first" strategy), this function ignores the entries of themanifest file! It returns
    * only the entries which have been defined inthe Component metadata or in the proper Component
    * manifest.
    * @returns Component dependencies.
    */
  def getDependencies(): js.Any = js.native
  /**
    * Returns the array of the included files that the Component requires suchas CSS and JavaScript. If
    * not specified or the array is empty, the returnvalue is null.<p><b>Important:</b></br>If a Component
    * is loaded using the manifest URL (or according the"manifest first" strategy), this function ignores
    * the entries of themanifest file! It returns only the entries which have been defined inthe Component
    * metadata or in the proper Component manifest.
    * @returns Included files.
    */
  def getIncludes(): js.Array[java.lang.String] = js.native
  /**
    * Returns array of libraries specified in metadata of the Component, thatare automatically loaded when
    * an instance of the component is created.If not specified or the array is empty, the return value is
    * null.<p><b>Important:</b></br>If a Component is loaded using the manifest URL (or according
    * the"manifest first" strategy), this function ignores the entries of themanifest file! It returns
    * only the entries which have been defined inthe Component metadata or in the proper Component
    * manifest.
    * @returns Required libraries.
    */
  def getLibs(): js.Array[java.lang.String] = js.native
  /**
    * Returns the manifest defined in the metadata of the Component.If not specified, the return value is
    * null.
    * @since 1.27.1
    * @returns manifest.
    */
  def getManifest(): js.Any = js.native
  /**
    * Returns the configuration of a manifest section or the value for aspecific path. If no section or
    * key is specified, the return value is null.Example:<code>  {    "sap.ui5": {      "dependencies": { 
    *       "libs": {          "sap.m": {}        },        "components": {          "my.component.a": {} 
    *       }      }  });</code>The configuration above can be accessed in the following
    * ways:<ul><li><b>By section/namespace</b>:
    * <code>oComponent.getMetadata().getManifestEntry("sap.ui5")</code></li><li><b>By path</b>:
    * <code>oComponent.getMetadata().getManifestEntry("/sap.ui5/dependencies/libs")</code></li></ul>By
    * section/namespace returns the configuration for the specified manifestsection and by path allows to
    * specify a concrete path to a dedicated entryinside the manifest. The path syntax always starts with
    * a slash (/).
    * @since 1.27.1
    * @param sKey Either the manifest section name (namespace) or a concrete path
    * @param bMerged Indicates whether the custom configuration is merged with the parent custom
    * configuration of the Component.
    * @returns Value of the manifest section or the key (could be any kind of value)
    */
  def getManifestEntry(sKey: java.lang.String): js.Any = js.native
  def getManifestEntry(sKey: java.lang.String, bMerged: scala.Boolean): js.Any = js.native
  /**
    * Returns the manifest object.
    * @since 1.33.0
    * @returns manifest.
    */
  def getManifestObject(): Manifest = js.native
  /**
    * Returns the version of the metadata which could be 1 or 2. 1 is for legacymetadata whereas 2 is for
    * the manifest.
    * @since 1.27.1
    * @returns metadata version (1: legacy metadata, 2: manifest)
    */
  def getMetadataVersion(): scala.Double = js.native
  /**
    * Returns the raw manifest defined in the metadata of the Component.If not specified, the return value
    * is null.
    * @since 1.29.0
    * @returns manifest
    */
  def getRawManifest(): js.Any = js.native
  /**
    * Returns the required version of SAPUI5 defined in the metadata of theComponent. If returned value is
    * null, then no special UI5 version isrequired.<p><b>Important:</b></br>If a Component is loaded using
    * the manifest URL (or according the"manifest first" strategy), this function ignores the entries of
    * themanifest file! It returns only the entries which have been defined inthe Component metadata or in
    * the proper Component manifest.
    * @returns Required version of UI5 or if not specified then null.
    */
  def getUI5Version(): java.lang.String = js.native
  /**
    * Returns the version of the component. If not specified, the return valueis
    * null.<p><b>Important:</b></br>If a Component is loaded using the manifest URL (or according
    * the"manifest first" strategy), this function ignores the entries of themanifest file! It returns
    * only the entries which have been defined inthe Component metadata or in the proper Component
    * manifest.
    * @returns The version of the component.
    */
  def getVersion(): java.lang.String = js.native
  /**
    * Returns whether the class of this metadata is a component base classor not.
    * @since 1.33.0
    * @returns true if it is sap.ui.core.Component or sap.ui.core.UIComponent
    */
  def isBaseClass(): scala.Boolean = js.native
}

