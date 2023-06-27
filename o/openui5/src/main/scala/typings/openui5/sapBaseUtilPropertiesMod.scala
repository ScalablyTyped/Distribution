package typings.openui5

import typings.openui5.anon.ReturnNullIfMissing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilPropertiesMod {
  
  @JSImport("sap/base/util/Properties", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Properties
  /* static members */
  object default {
    
    @JSImport("sap/base/util/Properties", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new instance of {@link module:sap/base/util/Properties}.
      *
      * If option 'url' is passed, immediately a load request for the given target is triggered. A property file
      * that is loaded can contain comments with a leading ! or #. The loaded property list does not contain
      * any comments.
      *
      * @returns A new property collection (synchronous case) or `null` if the file could not be loaded and `returnNullIfMissing`
      * was set; in case of asynchronous loading, always a Promise is returned, which resolves with the property
      * collection or with `null` if the file could not be loaded and `returnNullIfMissing` was set to true
      */
    inline def create(): Properties | Null | (js.Promise[Properties | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Properties | Null | (js.Promise[Properties | Null])]
    inline def create(/**
      * Parameters used to initialize the property list
      */
    mParams: ReturnNullIfMissing): Properties | Null | (js.Promise[Properties | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mParams.asInstanceOf[js.Any]).asInstanceOf[Properties | Null | (js.Promise[Properties | Null])]
  }
  
  @js.native
  trait Properties extends StObject {
    
    /**
      * Returns an array of all keys in the property collection.
      *
      * @returns All keys in the property collection
      */
    def getKeys(): js.Array[String] = js.native
    
    /**
      * Returns the value for the given key or `null` if the collection has no value for the key.
      *
      * Optionally, a default value can be given which will be returned if the collection does not contain a
      * value for the key; only non-empty default values are supported.
      *
      * @returns Value for the given key or the default value or `null` if no default value or a falsy default
      * value was given
      */
    def getProperty(/**
      * Key to return the value for
      */
    sKey: String): String | Null = js.native
    def getProperty(
      /**
      * Key to return the value for
      */
    sKey: String,
      /**
      * Optional, a default value that will be returned if the requested key is not in the collection
      */
    sDefaultValue: String
    ): String | Null = js.native
    
    /**
      * Stores or changes the value for the given key in the collection.
      *
      * If the given value is not a string, the collection won't be modified. The key is always cast to a string.
      */
    def setProperty(
      /**
      * Key of the property
      */
    sKey: String,
      /**
      * String value for the key
      */
    sValue: String
    ): Unit = js.native
  }
}
