package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreHyphenationHyphenationMod {
  
  @JSImport("sap/ui/core/hyphenation/Hyphenation", JSImport.Default)
  @js.native
  open class default () extends Hyphenation
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/hyphenation/Hyphenation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.hyphenation.Hyphenation with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Hyphenation]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Hyphenation],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns the singleton instance of the Hyphenation API.
      * See:
      * 	sap.ui.core.hyphenation.Hyphenation
      *
      * @returns The singleton instance of the Hyphenation API
      */
    inline def getInstance(): Hyphenation = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Hyphenation]
    
    /**
      * Returns a metadata object for class sap.ui.core.hyphenation.Hyphenation.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait Hyphenation
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:error error} event of this `sap.ui.core.hyphenation.Hyphenation`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.hyphenation.Hyphenation` itself.
      *
      * Fired if an error with initialization or hyphenation occurs.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HyphenationErrorEvent, Unit]
    ): this.type = js.native
    def attachError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HyphenationErrorEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.hyphenation.Hyphenation`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:error error} event of this `sap.ui.core.hyphenation.Hyphenation`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.hyphenation.Hyphenation` itself.
      *
      * Fired if an error with initialization or hyphenation occurs.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HyphenationErrorEvent, Unit]
    ): this.type = js.native
    def attachError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HyphenationErrorEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.hyphenation.Hyphenation`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Checks if native hyphenation works in the current browser for the given language. This check is performed
      * against the value of the "lang" HTML attribute of the page.
      *
      * @returns True if native hyphenation works for the given language. False if native hyphenation will not
      * work. Null if the language is not known to the Hyphenation API
      */
    def canUseNativeHyphenation(): Boolean | Null = js.native
    def canUseNativeHyphenation(
      /**
      * For what language to check. The global application language is the default one
      */
    sLang: String
    ): Boolean | Null = js.native
    
    /**
      * Checks if third-party hyphenation works for the given language.
      *
      * @returns True if third-party hyphenation works for the given language. False if third-party hyphenation
      * doesn't work. Null if the language is not known to the `Hyphenation` API.
      */
    def canUseThirdPartyHyphenation(): Boolean | Null = js.native
    def canUseThirdPartyHyphenation(
      /**
      * For what language to check. The global application language is the default one.
      */
    sLang: String
    ): Boolean | Null = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:error error} event of this `sap.ui.core.hyphenation.Hyphenation`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HyphenationErrorEvent, Unit]
    ): this.type = js.native
    def detachError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HyphenationErrorEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:error error} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireError(): this.type = js.native
    def fireError(/**
      * Parameters to pass along with the event
      */
    mParameters: Hyphenation$ErrorEventParameters): this.type = js.native
    
    /**
      * What languages were initialized with {@link sap.ui.core.hyphenation.Hyphenation#initialize Hyphenation#initialize}
      *
      * @returns List of languages which were initialized
      */
    def getInitializedLanguages(): js.Array[Any] = js.native
    
    /**
      * Hyphenates the given text with the third-party library.
      *
      * Adds the soft hyphen symbol at the places where words can break.
      *
      * @returns The text with the hyphens symbol added
      */
    def hyphenate(/**
      * The text to hyphenate
      */
    sText: String): String = js.native
    def hyphenate(
      /**
      * The text to hyphenate
      */
    sText: String,
      /**
      * The language of the text. The global application language is the default one
      */
    sLang: String
    ): String = js.native
    
    /**
      * Initializes the third-party library for the given language.
      *
      * Loads required third-party resources and language-specific resources.
      *
      * @returns A promise which resolves when all language resources are loaded. Rejects if the language is
      * not supported
      */
    def initialize(): js.Promise[Any] = js.native
    def initialize(
      /**
      * The language for which the third-party library should be initialized. The global application language
      * is the default one
      */
    sLang: String
    ): js.Promise[Any] = js.native
    
    /**
      * Checks if the given language was initialized with {@link sap.ui.core.hyphenation.Hyphenation#initialize Hyphenation#initialize}
      *
      * @returns True if the language was initialized
      */
    def isLanguageInitialized(): Boolean = js.native
    def isLanguageInitialized(/**
      * The language to check for
      */
    sLang: String): Boolean = js.native
    
    /**
      * Checks if `Hyphenation` API knows about the given language.
      *
      * If it is a known language, the API can be used to check browser-native and third-party support.
      *
      * @returns True if the language is known to the `Hyphenation` API
      */
    def isLanguageSupported(): Boolean = js.native
    def isLanguageSupported(
      /**
      * For what language to check. The global application language is the default one.
      */
    sLang: String
    ): Boolean = js.native
  }
  
  trait Hyphenation$ErrorEventParameters extends StObject {
    
    /**
      * The message of the error.
      */
    var sErrorMessage: js.UndefOr[String] = js.undefined
  }
  object Hyphenation$ErrorEventParameters {
    
    inline def apply(): Hyphenation$ErrorEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hyphenation$ErrorEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hyphenation$ErrorEventParameters] (val x: Self) extends AnyVal {
      
      inline def setSErrorMessage(value: String): Self = StObject.set(x, "sErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setSErrorMessageUndefined: Self = StObject.set(x, "sErrorMessage", js.undefined)
    }
  }
  
  type HyphenationErrorEvent = typings.openui5.sapUiBaseEventMod.default[Hyphenation$ErrorEventParameters]
  
  type HyphenationErrorEventParameters = Hyphenation$ErrorEventParameters
  
  trait HyphenationSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Fired if an error with initialization or hyphenation occurs.
      */
    var error: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Hyphenation$ErrorEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object HyphenationSettings {
    
    inline def apply(): HyphenationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HyphenationSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HyphenationSettings] (val x: Self) extends AnyVal {
      
      inline def setError(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Hyphenation$ErrorEventParameters] => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
