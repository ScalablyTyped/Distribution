package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "DynamoDB")
@js.native
object DynamoDBNs extends js.Object {
  @js.native
  class Converter ()
    extends awsDashSdkLib.awsDashSdkMod.DynamoDBNs.Converter
  
  @js.native
  class DocumentClient ()
    extends awsDashSdkLib.awsDashSdkMod.DynamoDBNs.DocumentClient {
    /**
         * Creates a DynamoDB document client with a set of configuration options.
         */
    def this(options: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions with awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ClientConfiguration) = this()
  }
  
  @js.native
  class Types ()
    extends awsDashSdkLib.awsDashSdkMod.DynamoDBNs.Types {
    /**
       * Constructs a service object. This object has one method for each API operation.
       */
    def this(options: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
  @js.native
  object Converter extends js.Object {
    def input(data: js.Any): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
    def input(data: js.Any, options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
    def marshall(data: ScalablyTyped.runtime.StringDictionary[js.Any]): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
    def marshall(
      data: ScalablyTyped.runtime.StringDictionary[js.Any],
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
    def output(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue): js.Any = js.native
    def output(
      data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue,
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): js.Any = js.native
    def unmarshall(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    def unmarshall(
      data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap,
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  @JSName("DynamoDB")
  @js.native
  object DynamoDBNs extends js.Object {
    @js.native
    class Converter ()
      extends awsDashSdkLib.awsDashSdkMod.DynamoDBNs.DynamoDBNs.Converter
    
    @js.native
    class DocumentClient ()
      extends awsDashSdkLib.awsDashSdkMod.DynamoDBNs.DynamoDBNs.DocumentClient {
      /**
           * Creates a DynamoDB document client with a set of configuration options.
           */
      def this(options: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions with awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ClientConfiguration) = this()
    }
    
    val TypesNs: this.type = js.native
    @js.native
    object Converter extends js.Object {
      def input(data: js.Any): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
      def input(data: js.Any, options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue = js.native
      def marshall(data: ScalablyTyped.runtime.StringDictionary[js.Any]): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
      def marshall(
        data: ScalablyTyped.runtime.StringDictionary[js.Any],
        options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
      ): awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap = js.native
      def output(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue): js.Any = js.native
      def output(
        data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeValue,
        options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
      ): js.Any = js.native
      def unmarshall(data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
      def unmarshall(
        data: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap,
        options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
      ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    }
    
  }
  
}

