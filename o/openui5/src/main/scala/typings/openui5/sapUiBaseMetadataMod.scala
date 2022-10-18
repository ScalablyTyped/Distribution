package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseMetadataMod {
  
  @JSImport("sap/ui/base/Metadata", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Metadata {
    /**
      * Creates a new metadata object from the given static infos.
      *
      * **Note:** Throughout this class documentation, the described subclass of Object is referenced as the
      * described class.
      */
    def this(
      /**
      * Fully qualified name of the described class
      */
    sClassName: String,
      /**
      * Info to construct the class and its metadata from
      */
    oClassInfo: js.Object
    ) = this()
  }
  
  @js.native
  trait Metadata extends StObject {
    
    /**
      * @deprecated (since 1.58) - this method should not be used for productive code. The accuracy of the returned
      * information highly depends on the concrete class and is not actively monitored. There might be more public
      * methods or some of the returned methods might not really be intended for public use. In general, pure
      * visibility information should not be exposed in runtime metadata but be part of the documentation. Subclasses
      * of `sap.ui.base.Object` might decide to provide runtime metadata describing their public API, but this
      * then should not be backed by this method. See {@link sap.ui.core.mvc.ControllerMetadata#getAllMethods}
      * for an example.
      *
      * Returns an array with the names of all public methods declared by the described class and all its ancestors
      * classes.
      *
      * @returns array with names of all public methods provided by the described class and its ancestors
      */
    def getAllPublicMethods(): js.Array[String] = js.native
    
    /**
      * Returns the fully qualified name of the described class
      *
      * @returns name of the described class
      */
    def getName(): String = js.native
    
    /**
      * Returns the metadata object of the base class of the described class or null if the class has no (documented)
      * base class.
      *
      * @returns metadata of the base class
      */
    def getParent(): Metadata = js.native
    
    /**
      * @deprecated (since 1.58) - this method should not be used for productive code. The accuracy of the returned
      * information highly depends on the concrete class and is not actively monitored. There might be more public
      * methods or some of the returned methods might not really be intended for public use. In general, pure
      * visibility information should not be exposed in runtime metadata but be part of the documentation. Subclasses
      * of `sap.ui.base.Object` might decide to provide runtime metadata describing their public API, but this
      * then should not be backed by this method. See {@link sap.ui.core.mvc.ControllerMetadata#getAllMethods}
      * for an example.
      *
      * Returns an array with the names of the public methods declared by the described class, methods of ancestors
      * are not listed.
      *
      * @returns array with names of public methods declared by the described class
      */
    def getPublicMethods(): js.Array[String] = js.native
    
    /**
      * @SINCE 1.56
      *
      * Checks whether the class described by this metadata object is of the named type.
      *
      * This check is solely based on the type names as declared in the class metadata. It compares the given
      * `vTypeName` with the name of this class, with the names of any base class of this class and with the
      * names of all interfaces implemented by any of the aforementioned classes.
      *
      * Instead of a single type name, an array of type names can be given and the method will check if this
      * class is of any of the listed types (logical or).
      *
      * Should the UI5 class system in future implement additional means of associating classes with type names
      * (e.g. by introducing mixins), then this method might detect matches for those names as well.
      *
      * @returns Whether this class is of the given type or of any of the given types
      */
    def isA(/**
      * Type or types to check for
      */
    vTypeName: String): Boolean = js.native
    def isA(/**
      * Type or types to check for
      */
    vTypeName: js.Array[String]): Boolean = js.native
    
    /**
      * Returns whether the described class is abstract
      *
      * @returns whether the class is abstract
      */
    def isAbstract(): Boolean = js.native
    
    /**
      * @SINCE 1.26.4
      *
      * Whether the described class is deprecated and should not be used any more
      *
      * @returns whether the class is considered deprecated
      */
    def isDeprecated(): Boolean = js.native
    
    /**
      * Returns whether the described class is final
      *
      * @returns whether the class is final
      */
    def isFinal(): Boolean = js.native
    
    /**
      * Checks whether the described class or one of its ancestor classes implements the given interface.
      *
      * @returns whether this class implements the interface
      */
    def isInstanceOf(/**
      * name of the interface to test for (in dot notation)
      */
    sInterface: String): Boolean = js.native
  }
}
