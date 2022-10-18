package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDetectorsEnvDetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/detectors/EnvDetector", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
  
  /**
    * EnvDetector can be used to detect the presence of and create a Resource
    * from the OTEL_RESOURCE_ATTRIBUTES environment variable.
    */
  @js.native
  trait EnvDetector_
    extends StObject
       with Detector {
    
    /* private */ val _COMMA_SEPARATOR: Any = js.native
    
    /* private */ val _ERROR_MESSAGE_INVALID_CHARS: Any = js.native
    
    /* private */ val _ERROR_MESSAGE_INVALID_VALUE: Any = js.native
    
    /* private */ val _LABEL_KEY_VALUE_SPLITTER: Any = js.native
    
    /* private */ val _MAX_LENGTH: Any = js.native
    
    /* private */ var _isPrintableString: Any = js.native
    
    /**
      * Determines whether the given String is a valid printable ASCII string with
      * a length not exceed _MAX_LENGTH characters.
      *
      * @param str The String to be validated.
      * @returns Whether the String is valid.
      */
    /* private */ var _isValid: Any = js.native
    
    /**
      * Determines whether the given String is a valid printable ASCII string with
      * a length greater than 0 and not exceed _MAX_LENGTH characters.
      *
      * @param str The String to be validated.
      * @returns Whether the String is valid and not empty.
      */
    /* private */ var _isValidAndNotEmpty: Any = js.native
    
    /**
      * Creates an attribute map from the OTEL_RESOURCE_ATTRIBUTES environment
      * variable.
      *
      * OTEL_RESOURCE_ATTRIBUTES: A comma-separated list of attributes describing
      * the source in more detail, e.g. “key1=val1,key2=val2”. Domain names and
      * paths are accepted as attribute keys. Values may be quoted or unquoted in
      * general. If a value contains whitespaces, =, or " characters, it must
      * always be quoted.
      *
      * @param rawEnvAttributes The resource attributes as a comma-seperated list
      * of key/value pairs.
      * @returns The sanitized resource attributes.
      */
    /* private */ var _parseResourceAttributes: Any = js.native
  }
}
