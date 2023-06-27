package typings.openui5

import typings.openui5.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreComponentMetadataMod {
  
  @JSImport("sap/ui/core/ComponentMetadata", JSImport.Default)
  @js.native
  open class default protected () extends ComponentMetadata {
    /**
      * Creates a new metadata object for a Component subclass.
      */
    def this(
      /**
      * Fully qualified name of the class that is described by this metadata object
      */
    sClassName: String,
      /**
      * Static info to construct the metadata from
      */
    oClassInfo: `3`
    ) = this()
  }
  
  @js.native
  trait ComponentMetadata
    extends typings.openui5.sapUiBaseManagedObjectMetadataMod.default {
    
    /**
      * Returns the name of the Component (which is the namespace only with the module name)
      *
      * @returns Component name
      */
    def getComponentName(): String = js.native
    
    /**
      * @deprecated (since 1.27.1) - Please use {@link sap.ui.core.Component#getManifestEntry}("/sap.ui5/dependencies/components")
      *
      * Returns array of components specified in the metadata of the Component. If not specified or the array
      * is empty, the return value is null.  **Important:**
      *  If a Component is loaded using the manifest URL (or according the "manifest first" strategy), this function
      * ignores the entries of the manifest file! It returns only the entries which have been defined in the
      * Component metadata or in the proper Component manifest.
      *
      * @returns Required Components.
      */
    def getComponents(): js.Array[String] = js.native
    
    /**
      * @since 1.15.1
      * @deprecated (since 1.27.1) - Please use {@link sap.ui.core.Component#getManifestEntry}("/sap.ui5/config")
      *
      * Returns a copy of the configuration property to disallow modifications. If no key is specified it returns
      * the complete configuration property
      *
      * @returns the value of the configuration property
      */
    def getConfig(): js.Object = js.native
    def getConfig(/**
      * Key of the configuration property
      */
    sKey: String): js.Object = js.native
    def getConfig(
      /**
      * Key of the configuration property
      */
    sKey: String,
      /**
      * If set to `true`, only the local configuration is returned
      */
    bDoNotMerge: Boolean
    ): js.Object = js.native
    def getConfig(
      /**
      * Key of the configuration property
      */
    sKey: Unit,
      /**
      * If set to `true`, only the local configuration is returned
      */
    bDoNotMerge: Boolean
    ): js.Object = js.native
    
    /**
      * @deprecated (since 1.27.1) - Please use the sap.ui.core.ComponentMetadata#getManifestEntry
      *
      * Returns the custom Component configuration entry with the specified key (this must be a JSON object).
      * If no key is specified, the return value is null.
      *
      * Example: ` sap.ui.core.Component.extend("sample.Component", { metadata: { "my.custom.config" : { "property1"
      * : true, "property2" : "Something else" } } }); `
      *
      * The configuration above can be accessed via `sample.Component.getMetadata().getCustomEntry("my.custom.config")`.
      *
      * @returns custom Component configuration with the specified key.
      */
    def getCustomEntry(/**
      * Key of the custom configuration (must be prefixed with a namespace)
      */
    sKey: String): js.Object = js.native
    def getCustomEntry(
      /**
      * Key of the custom configuration (must be prefixed with a namespace)
      */
    sKey: String,
      /**
      * Indicates whether the custom configuration is merged with the parent custom configuration of the Component.
      */
    bMerged: Boolean
    ): js.Object = js.native
    
    /**
      * @deprecated (since 1.27.1) - Please use {@link sap.ui.core.Component#getManifestEntry}("/sap.ui5/dependencies")
      *
      * Returns the dependencies defined in the metadata of the Component. If not specified, the return value
      * is null.  **Important:**
      *  If a Component is loaded using the manifest URL (or according the "manifest first" strategy), this function
      * ignores the entries of the manifest file! It returns only the entries which have been defined in the
      * Component metadata or in the proper Component manifest.
      *
      * @returns Component dependencies.
      */
    def getDependencies(): js.Object = js.native
    
    /**
      * @deprecated (since 1.27.1) - For CSS, please use {@link sap.ui.core.Component#getManifestEntry}("/sap.ui5/resources/css").
      *
      * Returns the array of the included files that the Component requires such as CSS and JavaScript. If not
      * specified or the array is empty, the return value is null.  **Important:**
      *  If a Component is loaded using the manifest URL (or according the "manifest first" strategy), this function
      * ignores the entries of the manifest file! It returns only the entries which have been defined in the
      * Component metadata or in the proper Component manifest.
      *
      * @returns Included files.
      */
    def getIncludes(): js.Array[String] = js.native
    
    /**
      * @deprecated (since 1.27.1) - Please use {@link sap.ui.core.Component#getManifestEntry}("/sap.ui5/dependencies/libs")
      *
      * Returns array of libraries specified in metadata of the Component, that are automatically loaded when
      * an instance of the component is created. If not specified or the array is empty, the return value is
      * null.  **Important:**
      *  If a Component is loaded using the manifest URL (or according the "manifest first" strategy), this function
      * ignores the entries of the manifest file! It returns only the entries which have been defined in the
      * Component metadata or in the proper Component manifest.
      *
      * @returns Required libraries.
      */
    def getLibs(): js.Array[String] = js.native
    
    /**
      * @since 1.27.1
      * @deprecated (since 1.33.0) - Please use the sap.ui.core.Component#getManifest
      *
      * Returns the manifest defined in the metadata of the Component. If not specified, the return value is
      * null.
      *
      * @returns manifest.
      */
    def getManifest(): js.Object | Null = js.native
    
    /**
      * @since 1.27.1
      * @deprecated (since 1.33.0) - Please use the sap.ui.core.Component#getManifest
      *
      * Returns the configuration of a manifest section or the value for a specific path. If no section or key
      * is specified, the return value is null.
      *
      * Example: ` { "sap.ui5": { "dependencies": { "libs": { "sap.m": {} }, "components": { "my.component.a":
      * {} } } }); `
      *
      * The configuration above can be accessed in the following ways:
      * 	 - **By section/namespace**: `oComponent.getMetadata().getManifestEntry("sap.ui5")`
      * 	 - **By path**: `oComponent.getMetadata().getManifestEntry("/sap.ui5/dependencies/libs")`
      *
      * By section/namespace returns the configuration for the specified manifest section and by path allows
      * to specify a concrete path to a dedicated entry inside the manifest. The path syntax always starts with
      * a slash (/).
      *
      * @returns Value of the manifest section or the key (could be any kind of value)
      */
    def getManifestEntry(/**
      * Either the manifest section name (namespace) or a concrete path
      */
    sKey: String): Any | Null = js.native
    def getManifestEntry(
      /**
      * Either the manifest section name (namespace) or a concrete path
      */
    sKey: String,
      /**
      * Indicates whether the custom configuration is merged with the parent custom configuration of the Component.
      */
    bMerged: Boolean
    ): Any | Null = js.native
    
    /**
      * @since 1.33.0
      *
      * Returns the manifest object.
      *
      * @returns manifest.
      */
    def getManifestObject(): typings.openui5.sapUiCoreManifestMod.default = js.native
    
    /**
      * @since 1.27.1
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the version of the metadata which could be 1 or 2. 1 is for legacy metadata whereas 2 is for
      * the manifest.
      *
      * @returns metadata version (1: legacy metadata, 2: manifest)
      */
    def getMetadataVersion(): int = js.native
    
    /**
      * @since 1.29.0
      * @deprecated (since 1.33.0) - Please use the sap.ui.core.Component#getManifest
      *
      * Returns the raw manifest defined in the metadata of the Component. If not specified, the return value
      * is null.
      *
      * @returns manifest
      */
    def getRawManifest(): js.Object = js.native
    
    /**
      * @deprecated (since 1.27.1) - Please use {@link sap.ui.core.Component#getManifestEntry}("/sap.ui5/dependencies/minUI5Version")
      *
      * Returns the required version of SAPUI5 defined in the metadata of the Component. If returned value is
      * null, then no special UI5 version is required.  **Important:**
      *  If a Component is loaded using the manifest URL (or according the "manifest first" strategy), this function
      * ignores the entries of the manifest file! It returns only the entries which have been defined in the
      * Component metadata or in the proper Component manifest.
      *
      * @returns Required version of UI5 or if not specified then `null`.
      */
    def getUI5Version(): String | Null = js.native
    
    /**
      * @deprecated (since 1.34.2) - Please use {@link sap.ui.core.Component#getManifestEntry}("/sap.app/applicationVersion/version")
      *
      * Returns the version of the component. If not specified, the return value is null.  **Important:**
      *  If a Component is loaded using the manifest URL (or according the "manifest first" strategy), this function
      * ignores the entries of the manifest file! It returns only the entries which have been defined in the
      * Component metadata or in the proper Component manifest.
      *
      * @returns The version of the component.
      */
    def getVersion(): String = js.native
    
    /**
      * @since 1.33.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns whether the class of this metadata is a component base class or not.
      *
      * @returns true if it is sap.ui.core.Component or sap.ui.core.UIComponent
      */
    def isBaseClass(): Boolean = js.native
  }
}
