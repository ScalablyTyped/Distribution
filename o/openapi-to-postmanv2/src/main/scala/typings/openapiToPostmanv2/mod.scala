package typings.openapiToPostmanv2

import typings.openapiToPostmanv2.anon.Data
import typings.openapiToPostmanv2.anon.MissingEndpoints
import typings.openapiToPostmanv2.anon.Name
import typings.openapiToPostmanv2.anon.Output
import typings.openapiToPostmanv2.openapiToPostmanv2Booleans.`false`
import typings.openapiToPostmanv2.openapiToPostmanv2Booleans.`true`
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.CONVERSION
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.Fallback
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.Paths
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.Space
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.Tab
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.Tags
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.URL
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.VALIDATION
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.`enum`
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.array
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.boolean
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.document
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.file
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.integer
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.json
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.string
import typings.openapiToPostmanv2.openapiToPostmanv2Strings.use
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-to-postmanv2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("openapi-to-postmanv2", "SchemaPack")
  @js.native
  open class SchemaPack protected () extends StObject {
    def this(input: Input) = this()
    def this(input: Input, options: Options) = this()
    
    def convert(cb: Callback[ConvertResult]): Unit = js.native
    
    def getMetaData(cb: Callback[MetadataResult]): Unit = js.native
    
    def mergeAndValidate(cb: Callback[ValidateResult]): Unit = js.native
    
    def validate(): ValidateResult = js.native
    
    def validateTransaction(transaction: Any, cb: Callback[MissingEndpoints]): Unit = js.native
  }
  /* static members */
  object SchemaPack {
    
    @JSImport("openapi-to-postmanv2", "SchemaPack")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getOptions_document(mode: document, criteria: OptionsCriteria): OptionsDocument[boolean | `enum` | string | integer | array] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(mode.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[OptionsDocument[boolean | `enum` | string | integer | array]]
    
    inline def getOptions_use(mode: use, criteria: OptionsCriteria): OptionsUse = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(mode.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[OptionsUse]
  }
  
  inline def convert(input: Input, options: Unit, cb: Callback[ConvertResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def convert(input: Input, options: Options, cb: Callback[ConvertResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getMetaData(input: Input, cb: Callback[MetadataResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getOptions_document(mode: document, criteria: OptionsCriteria): OptionsDocument[boolean | `enum` | string | integer | array] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(mode.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[OptionsDocument[boolean | `enum` | string | integer | array]]
  
  inline def getOptions_use(mode: use, criteria: OptionsCriteria): OptionsUse = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(mode.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[OptionsUse]
  
  inline def mergeAndValidate(input: Input, cb: Callback[ValidateResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAndValidate")(input.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validate(input: Input): ValidateResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(input.asInstanceOf[js.Any]).asInstanceOf[ValidateResult]
  
  type Callback[Result] = js.Function2[/* err */ Any, /* result */ Result, Unit]
  
  type ConvertResult = Result[Data]
  
  trait Input extends StObject {
    
    var data: String
    
    var `type`: file | string | json
  }
  object Input {
    
    inline def apply(data: String, `type`: file | string | json): Input = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: file | string | json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MetadataResult = Result[Name]
  
  trait Options extends StObject {
    
    /**
      * Whether to allow matching path variables that are available as part of URL itself in the collection request
      *
      * default: false
      */
    var allowUrlPathVarMatching: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Importing will collapse all folders that have only one child element and lack persistent folder-level data.
      *
      * default: true
      */
    var collapseFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether to show detailed mismatch information for application/json content in the request/response body.
      *
      * default: false
      */
    var detailedBlobValidation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to set optional parameters as disabled
      *
      * default: false
      */
    var disableOptionalParameters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Select whether to generate the response parameters based on the
      * [schema](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject) or the
      * [example](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#exampleObject) in the schema.
      *
      * default: Example
      */
    var exampleParametersResolution: js.UndefOr[ParametersResolution] = js.undefined
    
    /**
      * Select whether to create folders according to the spec’s paths or tags.
      *
      * default: Paths
      */
    var folderStrategy: js.UndefOr[Paths | Tags] = js.undefined
    
    /**
      * Whether to ignore mismatches resulting from unresolved variables in the Postman request
      *
      * default: false
      */
    var ignoreUnresolvedVariables: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Select whether to include authentication parameters in the example request
      *
      * default: true
      */
    var includeAuthInfoInExample: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Select whether to include Webhooks in the generated collection
      *
      * default: false
      */
    var includeWebhooks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Option for setting indentation character
      *
      * default: Space
      */
    var indentCharacter: js.UndefOr[Tab | Space] = js.undefined
    
    /**
      * Whether to keep implicit headers from the OpenAPI specification, which are removed by default.
      *
      * default: false
      */
    var keepImplicitHeaders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optimizes conversion for large specification, disabling this option might affect the performance of conversion.
      *
      * default: true
      */
    var optimizeConversion: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines how the requests inside the generated collection will be named. If “Fallback” is selected, the request
      * will be named after one of the following schema values: `description`, `operationid`, `url`.
      *
      * default: Fallback
      */
    var requestNameSource: js.UndefOr[Fallback | URL] = js.undefined
    
    /**
      * Select whether to generate the request parameters based on the
      * [schema](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject) or the
      * [example](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#exampleObject) in the schema.
      *
      * default: Schema
      */
    var requestParametersResolution: js.UndefOr[ParametersResolution] = js.undefined
    
    /**
      * Whether or not schemas should be faked.
      *
      * default: true
      */
    var schemaFaker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether detailed error messages are required for request <> schema validation operations.
      *
      * default: false
      */
    var shortValidationErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * MISSING_IN_SCHEMA indicates that an extra parameter was included in the request. For most use cases, this need
      * not be considered an error.
      *
      * default: false
      */
    var showMissingInSchemaErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of nesting limit till which schema resolution will happen. Increasing this limit may result in more time
      * to convert collection depending on complexity of specification. (To make sure this option works correctly
      * "optimizeConversion" option needs to be disabled)
      *
      * default: 10
      */
    var stackLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether requests should be strictly matched with schema operations. Setting to true will not include any matches
      * where the URL path segments don't match exactly.
      *
      * default: false
      */
    var strictRequestMatching: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to provide fixes for patching corresponding mismatches.
      *
      * default: false
      */
    var suggestAvailableFixes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show mismatches for incorrect name and description of request
      *
      * default: false
      */
    var validateMetadata: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specific properties (parts of a request/response pair) to ignore during validation. Must be sent as an array of
      * strings. Valid inputs in the array: PATHVARIABLE, QUERYPARAM, HEADER, BODY, RESPONSE_HEADER, RESPONSE_BODY
      *
      * default: []
      */
    var validationPropertiesToIgnore: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowUrlPathVarMatching(value: Boolean): Self = StObject.set(x, "allowUrlPathVarMatching", value.asInstanceOf[js.Any])
      
      inline def setAllowUrlPathVarMatchingUndefined: Self = StObject.set(x, "allowUrlPathVarMatching", js.undefined)
      
      inline def setCollapseFolders(value: Boolean): Self = StObject.set(x, "collapseFolders", value.asInstanceOf[js.Any])
      
      inline def setCollapseFoldersUndefined: Self = StObject.set(x, "collapseFolders", js.undefined)
      
      inline def setDetailedBlobValidation(value: Boolean): Self = StObject.set(x, "detailedBlobValidation", value.asInstanceOf[js.Any])
      
      inline def setDetailedBlobValidationUndefined: Self = StObject.set(x, "detailedBlobValidation", js.undefined)
      
      inline def setDisableOptionalParameters(value: Boolean): Self = StObject.set(x, "disableOptionalParameters", value.asInstanceOf[js.Any])
      
      inline def setDisableOptionalParametersUndefined: Self = StObject.set(x, "disableOptionalParameters", js.undefined)
      
      inline def setExampleParametersResolution(value: ParametersResolution): Self = StObject.set(x, "exampleParametersResolution", value.asInstanceOf[js.Any])
      
      inline def setExampleParametersResolutionUndefined: Self = StObject.set(x, "exampleParametersResolution", js.undefined)
      
      inline def setFolderStrategy(value: Paths | Tags): Self = StObject.set(x, "folderStrategy", value.asInstanceOf[js.Any])
      
      inline def setFolderStrategyUndefined: Self = StObject.set(x, "folderStrategy", js.undefined)
      
      inline def setIgnoreUnresolvedVariables(value: Boolean): Self = StObject.set(x, "ignoreUnresolvedVariables", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnresolvedVariablesUndefined: Self = StObject.set(x, "ignoreUnresolvedVariables", js.undefined)
      
      inline def setIncludeAuthInfoInExample(value: Boolean): Self = StObject.set(x, "includeAuthInfoInExample", value.asInstanceOf[js.Any])
      
      inline def setIncludeAuthInfoInExampleUndefined: Self = StObject.set(x, "includeAuthInfoInExample", js.undefined)
      
      inline def setIncludeWebhooks(value: Boolean): Self = StObject.set(x, "includeWebhooks", value.asInstanceOf[js.Any])
      
      inline def setIncludeWebhooksUndefined: Self = StObject.set(x, "includeWebhooks", js.undefined)
      
      inline def setIndentCharacter(value: Tab | Space): Self = StObject.set(x, "indentCharacter", value.asInstanceOf[js.Any])
      
      inline def setIndentCharacterUndefined: Self = StObject.set(x, "indentCharacter", js.undefined)
      
      inline def setKeepImplicitHeaders(value: Boolean): Self = StObject.set(x, "keepImplicitHeaders", value.asInstanceOf[js.Any])
      
      inline def setKeepImplicitHeadersUndefined: Self = StObject.set(x, "keepImplicitHeaders", js.undefined)
      
      inline def setOptimizeConversion(value: Boolean): Self = StObject.set(x, "optimizeConversion", value.asInstanceOf[js.Any])
      
      inline def setOptimizeConversionUndefined: Self = StObject.set(x, "optimizeConversion", js.undefined)
      
      inline def setRequestNameSource(value: Fallback | URL): Self = StObject.set(x, "requestNameSource", value.asInstanceOf[js.Any])
      
      inline def setRequestNameSourceUndefined: Self = StObject.set(x, "requestNameSource", js.undefined)
      
      inline def setRequestParametersResolution(value: ParametersResolution): Self = StObject.set(x, "requestParametersResolution", value.asInstanceOf[js.Any])
      
      inline def setRequestParametersResolutionUndefined: Self = StObject.set(x, "requestParametersResolution", js.undefined)
      
      inline def setSchemaFaker(value: Boolean): Self = StObject.set(x, "schemaFaker", value.asInstanceOf[js.Any])
      
      inline def setSchemaFakerUndefined: Self = StObject.set(x, "schemaFaker", js.undefined)
      
      inline def setShortValidationErrors(value: Boolean): Self = StObject.set(x, "shortValidationErrors", value.asInstanceOf[js.Any])
      
      inline def setShortValidationErrorsUndefined: Self = StObject.set(x, "shortValidationErrors", js.undefined)
      
      inline def setShowMissingInSchemaErrors(value: Boolean): Self = StObject.set(x, "showMissingInSchemaErrors", value.asInstanceOf[js.Any])
      
      inline def setShowMissingInSchemaErrorsUndefined: Self = StObject.set(x, "showMissingInSchemaErrors", js.undefined)
      
      inline def setStackLimit(value: Double): Self = StObject.set(x, "stackLimit", value.asInstanceOf[js.Any])
      
      inline def setStackLimitUndefined: Self = StObject.set(x, "stackLimit", js.undefined)
      
      inline def setStrictRequestMatching(value: Boolean): Self = StObject.set(x, "strictRequestMatching", value.asInstanceOf[js.Any])
      
      inline def setStrictRequestMatchingUndefined: Self = StObject.set(x, "strictRequestMatching", js.undefined)
      
      inline def setSuggestAvailableFixes(value: Boolean): Self = StObject.set(x, "suggestAvailableFixes", value.asInstanceOf[js.Any])
      
      inline def setSuggestAvailableFixesUndefined: Self = StObject.set(x, "suggestAvailableFixes", js.undefined)
      
      inline def setValidateMetadata(value: Boolean): Self = StObject.set(x, "validateMetadata", value.asInstanceOf[js.Any])
      
      inline def setValidateMetadataUndefined: Self = StObject.set(x, "validateMetadata", js.undefined)
      
      inline def setValidationPropertiesToIgnore(value: js.Array[String]): Self = StObject.set(x, "validationPropertiesToIgnore", value.asInstanceOf[js.Any])
      
      inline def setValidationPropertiesToIgnoreUndefined: Self = StObject.set(x, "validationPropertiesToIgnore", js.undefined)
      
      inline def setValidationPropertiesToIgnoreVarargs(value: String*): Self = StObject.set(x, "validationPropertiesToIgnore", js.Array(value*))
    }
  }
  
  trait OptionsBase extends StObject {
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var usage: js.Array[CONVERSION | VALIDATION]
  }
  object OptionsBase {
    
    inline def apply(usage: js.Array[CONVERSION | VALIDATION]): OptionsBase = {
      val __obj = js.Dynamic.literal(usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsBase] (val x: Self) extends AnyVal {
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setUsage(value: js.Array[CONVERSION | VALIDATION]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageVarargs(value: (CONVERSION | VALIDATION)*): Self = StObject.set(x, "usage", js.Array(value*))
    }
  }
  
  trait OptionsCriteria
    extends StObject
       with OptionsBase {
    
    var version: js.UndefOr[OptionsVersion] = js.undefined
  }
  object OptionsCriteria {
    
    inline def apply(usage: js.Array[CONVERSION | VALIDATION]): OptionsCriteria = {
      val __obj = js.Dynamic.literal(usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsCriteria]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsCriteria] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: OptionsVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait OptionsDocument[T /* <: boolean | `enum` | string | integer | array */]
    extends StObject
       with OptionsBase {
    
    var default: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: openapi-to-postmanv2.openapi-to-postmanv2.OptionsTypes[T] */ js.Any
      ]
    
    var description: String
    
    var id: String
    
    var name: String
    
    var supportedIn: js.Array[OptionsVersion]
    
    var `type`: T
  }
  object OptionsDocument {
    
    inline def apply[T /* <: boolean | `enum` | string | integer | array */](
      default: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: openapi-to-postmanv2.openapi-to-postmanv2.OptionsTypes[T] */ js.Any
        ],
      description: String,
      id: String,
      name: String,
      supportedIn: js.Array[OptionsVersion],
      `type`: T,
      usage: js.Array[CONVERSION | VALIDATION]
    ): OptionsDocument[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedIn = supportedIn.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsDocument[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsDocument[?], T /* <: boolean | `enum` | string | integer | array */] (val x: Self & OptionsDocument[T]) extends AnyVal {
      
      inline def setDefault(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: openapi-to-postmanv2.openapi-to-postmanv2.OptionsTypes[T] */ js.Any
            ]
      ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: openapi-to-postmanv2.openapi-to-postmanv2.OptionsTypes[T] */ js.Any)*
      ): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSupportedIn(value: js.Array[OptionsVersion]): Self = StObject.set(x, "supportedIn", value.asInstanceOf[js.Any])
      
      inline def setSupportedInVarargs(value: OptionsVersion*): Self = StObject.set(x, "supportedIn", js.Array(value*))
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsTypes extends StObject {
    
    var array: js.Array[Any]
    
    var boolean: Boolean
    
    var `enum`: String
    
    var integer: Double
    
    var string: String
  }
  object OptionsTypes {
    
    inline def apply(array: js.Array[Any], boolean: Boolean, `enum`: String, integer: Double, string: String): OptionsTypes = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsTypes] (val x: Self) extends AnyVal {
      
      inline def setArray(value: js.Array[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayVarargs(value: Any*): Self = StObject.set(x, "array", js.Array(value*))
      
      inline def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setEnum(value: String): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setInteger(value: Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionsUse = Record[String, String | Double | Boolean | js.Array[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.openapiToPostmanv2.openapiToPostmanv2Strings.`3Dot0`
    - typings.openapiToPostmanv2.openapiToPostmanv2Strings.`3Dot1`
  */
  trait OptionsVersion extends StObject
  object OptionsVersion {
    
    inline def `3Dot0`: typings.openapiToPostmanv2.openapiToPostmanv2Strings.`3Dot0` = "3.0".asInstanceOf[typings.openapiToPostmanv2.openapiToPostmanv2Strings.`3Dot0`]
    
    inline def `3Dot1`: typings.openapiToPostmanv2.openapiToPostmanv2Strings.`3Dot1` = "3.1".asInstanceOf[typings.openapiToPostmanv2.openapiToPostmanv2Strings.`3Dot1`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openapiToPostmanv2.openapiToPostmanv2Strings.Example
    - typings.openapiToPostmanv2.openapiToPostmanv2Strings.Schema
  */
  trait ParametersResolution extends StObject
  object ParametersResolution {
    
    inline def Example: typings.openapiToPostmanv2.openapiToPostmanv2Strings.Example = "Example".asInstanceOf[typings.openapiToPostmanv2.openapiToPostmanv2Strings.Example]
    
    inline def Schema: typings.openapiToPostmanv2.openapiToPostmanv2Strings.Schema = "Schema".asInstanceOf[typings.openapiToPostmanv2.openapiToPostmanv2Strings.Schema]
  }
  
  type Result[T] = (SuccessfulValidationResult & Output[T]) | UnsuccessfulValidationResult
  
  trait SuccessfulValidationResult
    extends StObject
       with ValidateResult {
    
    var result: `true`
  }
  object SuccessfulValidationResult {
    
    inline def apply(): SuccessfulValidationResult = {
      val __obj = js.Dynamic.literal(result = true)
      __obj.asInstanceOf[SuccessfulValidationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuccessfulValidationResult] (val x: Self) extends AnyVal {
      
      inline def setResult(value: `true`): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsuccessfulValidationResult
    extends StObject
       with ValidateResult {
    
    var reason: String
    
    var result: `false`
  }
  object UnsuccessfulValidationResult {
    
    inline def apply(reason: String): UnsuccessfulValidationResult = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], result = false)
      __obj.asInstanceOf[UnsuccessfulValidationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnsuccessfulValidationResult] (val x: Self) extends AnyVal {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setResult(value: `false`): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openapiToPostmanv2.mod.SuccessfulValidationResult
    - typings.openapiToPostmanv2.mod.UnsuccessfulValidationResult
  */
  trait ValidateResult extends StObject
  object ValidateResult {
    
    inline def SuccessfulValidationResult(): typings.openapiToPostmanv2.mod.SuccessfulValidationResult = {
      val __obj = js.Dynamic.literal(result = true)
      __obj.asInstanceOf[typings.openapiToPostmanv2.mod.SuccessfulValidationResult]
    }
    
    inline def UnsuccessfulValidationResult(reason: String): typings.openapiToPostmanv2.mod.UnsuccessfulValidationResult = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], result = false)
      __obj.asInstanceOf[typings.openapiToPostmanv2.mod.UnsuccessfulValidationResult]
    }
  }
}
