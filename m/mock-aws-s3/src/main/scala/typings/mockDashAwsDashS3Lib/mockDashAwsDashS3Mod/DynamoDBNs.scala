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
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  class DocumentClient ()
    extends awsDashSdkLib.awsDashSdkMod.DynamoDBNs.DocumentClient {
    def this(options: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions with awsDashSdkLib.clientsDynamodbMod.ClientConfiguration) = this()
  }
  
  /* static members */
  @js.native
  object Converter extends js.Object {
    def input(data: js.Any): awsDashSdkLib.clientsDynamodbMod.AttributeValue = js.native
    def input(data: js.Any, options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions): awsDashSdkLib.clientsDynamodbMod.AttributeValue = js.native
    def marshall(data: org.scalablytyped.runtime.StringDictionary[js.Any]): awsDashSdkLib.clientsDynamodbMod.AttributeMap = js.native
    def marshall(
      data: org.scalablytyped.runtime.StringDictionary[js.Any],
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): awsDashSdkLib.clientsDynamodbMod.AttributeMap = js.native
    def output(data: awsDashSdkLib.clientsDynamodbMod.AttributeValue): js.Any = js.native
    def output(
      data: awsDashSdkLib.clientsDynamodbMod.AttributeValue,
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): js.Any = js.native
    def unmarshall(data: awsDashSdkLib.clientsDynamodbMod.AttributeMap): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def unmarshall(
      data: awsDashSdkLib.clientsDynamodbMod.AttributeMap,
      options: awsDashSdkLib.libDynamodbConverterMod.ConverterNs.ConverterOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
}

