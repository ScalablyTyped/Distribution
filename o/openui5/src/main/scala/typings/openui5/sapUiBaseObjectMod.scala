package typings.openui5

import typings.openui5.anon.BaseType
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseObjectMod {
  
  @JSImport("sap/ui/base/Object", JSImport.Default)
  @js.native
  /**
    * Constructor for an `sap.ui.base.Object`.
    *
    * Subclasses of this class should always call the constructor of their base class.
    */
  open class default ()
    extends StObject
       with BaseObject
  /* static members */
  object default {
    
    @JSImport("sap/ui/base/Object", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @deprecated (since 1.3.1) - Use the static `extend` method of the desired base class (e.g. {@link sap.ui.base.Object.extend})
      *
      * Creates metadata for a given class and attaches it to the constructor and prototype of that class.
      *
      * After creation, metadata can be retrieved with getMetadata().
      *
      * The static info can at least contain the following entries:
      * 	 - baseType: {string} fully qualified name of a base class or empty
      * 	 - publicMethods: {string} an array of method names that will be visible in the interface proxy returned
      * 			by {@link #getInterface}
      *
      * @returns the created metadata object
      */
    inline def defineClass(
      /**
      * name of an (already declared) constructor function
      */
    sClassName: String,
      /**
      * static info used to create the metadata object
      */
    oStaticInfo: BaseType
    ): typings.openui5.sapUiBaseMetadataMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("defineClass")(sClassName.asInstanceOf[js.Any], oStaticInfo.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    inline def defineClass(
      /**
      * name of an (already declared) constructor function
      */
    sClassName: String,
      /**
      * static info used to create the metadata object
      */
    oStaticInfo: BaseType,
      /**
      * constructor function for the metadata object. If not given, it defaults to sap.ui.base.Metadata.
      */
    FNMetaImpl: js.Function
    ): typings.openui5.sapUiBaseMetadataMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("defineClass")(sClassName.asInstanceOf[js.Any], oStaticInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * @SINCE 1.3.1
      *
      * Creates a subclass of class sap.ui.base.Object with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain three kinds of information:
      * 	 - `metadata:` an (optional) object literal with metadata about the class. The information in the object
      * 			literal will be wrapped by an instance of {@link sap.ui.base.Metadata Metadata} and might contain the
      * 			following information
      * 	`interfaces:` {string[]} (optional) set of names of implemented interfaces (defaults to no interfaces)
      *
      * 	 - `publicMethods:` {string[]} (optional) list of methods that should be part of the public facade of
      * 			the class
      * 	 - `abstract:` {boolean} (optional) flag that marks the class as abstract (purely informational, defaults
      * 			to false)
      * 	 - `final:` {boolean} (optional) flag that marks the class as final (defaults to false)  Subclasses
      * 			of sap.ui.base.Object can enrich the set of supported metadata (e.g. see {@link sap.ui.core.Element.extend}).
      *
      *
      *
      * 	 - `constructor:` a function that serves as a constructor function for the new class. If no constructor
      * 			function is given, the framework creates a default implementation that delegates all its arguments to
      * 			the constructor function of the base class.
      *
      * any-other-name: any other property in the `oClassInfo` is copied into the prototype object
      * of the newly created class. Callers can thereby add methods or properties to all instances of the class.
      * But be aware that the given values are shared between all instances of the class. Usually, it doesn't
      * make sense to use primitive values here other than to declare public constants.
      *
      * If such a property has a function as its value, and if the property name does not start with an underscore
      * or with the prefix "on", the property name will be automatically added to the list of public methods
      * of the class (see property `publicMethods` in the `metadata` section). If a method's name matches that
      * pattern, but is not meant to be public, it shouldn't be included in the class info object, but be assigned
      * to the prototype instead.
      *
      *
      *
      * The prototype object of the newly created class uses the same prototype as instances of the base class
      * (prototype chaining).
      *
      * A metadata object is always created, even if there is no `metadata` entry in the `oClassInfo` object.
      * A getter for the metadata is always attached to the prototype and to the class (constructor function)
      * itself.
      *
      * Last but not least, with the third argument `FNMetaImpl` the constructor of a metadata class can be specified.
      * Instances of that class will be used to represent metadata for the newly created class and for any subclass
      * created from it. Typically, only frameworks will use this parameter to enrich the metadata for a new
      * class hierarchy they introduce (e.g. {@link sap.ui.core.Element.extend Element}).
      *
      * @returns the created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * name of the class to be created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * name of the class to be created
      */
    sClassName: String,
      /**
      * structured object with information about the class
      */
    oClassInfo: Unit,
      /**
      * constructor function for the metadata object. If not given, it defaults to sap.ui.base.Metadata.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * name of the class to be created
      */
    sClassName: String,
      /**
      * structured object with information about the class
      */
    oClassInfo: ClassInfo[T, BaseObject]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * name of the class to be created
      */
    sClassName: String,
      /**
      * structured object with information about the class
      */
    oClassInfo: ClassInfo[T, BaseObject],
      /**
      * constructor function for the metadata object. If not given, it defaults to sap.ui.base.Metadata.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * @SINCE 1.56
      *
      * Checks whether the given object is an instance of the named type. This function is a short-hand convenience
      * for {@link sap.ui.base.Object#isA}.
      *
      * Please see the API documentation of {@link sap.ui.base.Object#isA} for more details.
      *
      * @returns Whether the given object is an instance of the given type or of any of the given types
      */
    inline def isA(
      /**
      * Object which will be checked whether it is an instance of the given type
      */
    oObject: js.Object,
      /**
      * Type or types to check for
      */
    vTypeName: String
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isA")(oObject.asInstanceOf[js.Any], vTypeName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isA(
      /**
      * Object which will be checked whether it is an instance of the given type
      */
    oObject: js.Object,
      /**
      * Type or types to check for
      */
    vTypeName: js.Array[String]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isA")(oObject.asInstanceOf[js.Any], vTypeName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @js.native
  trait BaseObject extends StObject {
    
    /**
      * Destructor method for objects.
      */
    def destroy(): Unit = js.native
    
    /**
      * Returns the public facade of this object.
      *
      * By default, the public facade is implemented as an instance of {@link sap.ui.base.Interface}, exposing
      * the `publicMethods` as defined in the metadata of the class of this object.
      *
      * See the documentation of the {@link #.extend extend} method for an explanation of `publicMethods`.
      *
      * The facade is created on the first call of `getInterface` and reused for all later calls.
      *
      * @returns A facade for this object, with at least the public methods of the class of this.
      */
    def getInterface(): BaseObject = js.native
    
    /**
      * Returns the metadata for the class that this object belongs to.
      *
      * This method is only defined when metadata has been declared by using {@link sap.ui.base.Object.defineClass}
      * or {@link sap.ui.base.Object.extend}.
      *
      * @returns metadata for the class of the object
      */
    def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = js.native
    
    /**
      * @SINCE 1.56
      *
      * Checks whether this object is an instance of the named type.
      *
      * This check is solely based on the type names as declared in the class metadata. It compares the given
      * `vTypeName` with the name of the class of this object, with the names of any base class of that class
      * and with the names of all interfaces implemented by any of the aforementioned classes.
      *
      * Instead of a single type name, an array of type names can be given and the method will check if this
      * object is an instance of any of the listed types (logical or).
      *
      * Should the UI5 class system in future implement additional means of associating classes with type names
      * (e.g. by introducing mixins), then this method might detect matches for those names as well.
      *
      * @returns Whether this object is an instance of the given type or of any of the given types
      */
    def isA(/**
      * Type or types to check for
      */
    vTypeName: String): Boolean = js.native
    def isA(/**
      * Type or types to check for
      */
    vTypeName: js.Array[String]): Boolean = js.native
  }
}
