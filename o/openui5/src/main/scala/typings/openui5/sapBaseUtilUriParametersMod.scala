package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilUriParametersMod {
  
  @JSImport("sap/base/util/UriParameters", JSImport.Default)
  @js.native
  /**
    * See:
    * 	https://url.spec.whatwg.org/#interface-urlsearchparams
    */
  open class default ()
    extends StObject
       with UriParameters {
    def this(/**
      * URL with parameters
      */
    sURL: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/base/util/UriParameters", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the given query string and returns an interface to access the individual parameters.
      *
      * Callers using `UriParameters.fromQuery(input)` can be migrated to `new URLSearchParams(input)` once that
      * API is available (or polyfilled) in all supported browsers.
      *
      * @returns Object providing read access to the query parameters
      */
    inline def fromQuery(): UriParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuery")().asInstanceOf[UriParameters]
    inline def fromQuery(/**
      * Query string to parse, a leading question mark (?) will be ignored
      */
    sQuery: String): UriParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuery")(sQuery.asInstanceOf[js.Any]).asInstanceOf[UriParameters]
    
    /**
      * Parses the query portion of the given URL and returns an object to access the individual parameters.
      *
      * Callers using `UriParameters.fromURL(input)` can be migrated to `new URL(input).searchParams` once that
      * API is available (or polyfilled) in all supported browsers.
      *
      * @returns Object providing read access to the query parameters
      */
    inline def fromURL(/**
      * to parse the query portion of.
      */
    sURL: String): UriParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(sURL.asInstanceOf[js.Any]).asInstanceOf[UriParameters]
  }
  
  @js.native
  trait UriParameters extends StObject {
    
    /**
      * Returns the first value of the named query parameter.
      *
      * The value of the first occurrence of the parameter with name `sName` in the query string is returned.
      * If that first occurrence does not contain a value (it does not contain an equal sign), then an empty
      * string is returned.
      *
      * If (and only if) the parameter does not occur in the query string, `null` is returned.
      *
      * @returns First value of the query parameter with the given name or `null`
      */
    def get(/**
      * Name of the query parameter to get the value for
      */
    sName: String): String | Null = js.native
    def get(
      /**
      * Name of the query parameter to get the value for
      */
    sName: String,
      /**
      * Whether all values for the parameter should be returned; the use of this parameter is deprecated and
      * highly discouraged; use the {@link #getAll} method instead
      */
    bAll: Boolean
    ): String | Null = js.native
    
    /**
      * Returns all values of the query parameter with the given name.
      *
      * An array of string values of all occurrences of the parameter with the given name is returned. This array
      * is empty if (and only if) the parameter does not occur in the query string.
      *
      * @returns Array with all values of the query parameter with the given name
      */
    def getAll(/**
      * Name of the query parameter
      */
    sName: String): js.Array[String] = js.native
    
    /**
      * Checks whether a parameter occurs at least once in the query string.
      *
      * @returns Whether the parameter has been defined
      */
    def has(/**
      * Name of the query parameter to check
      */
    sName: String): Boolean = js.native
    
    /**
      * Returns an iterator for all contained parameter names.
      *
      * @returns Iterator for all parameter names.
      */
    def keys(): js.Iterator[String] = js.native
  }
}
