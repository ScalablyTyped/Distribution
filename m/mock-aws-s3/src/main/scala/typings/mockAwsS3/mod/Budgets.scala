package typings.mockAwsS3.mod

import typings.awsSdk.clientsBudgetsMod.Budget
import typings.awsSdk.clientsBudgetsMod.ClientConfiguration
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "Budgets")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class Budgets ()
  extends StObject
     with Array[Budget] {
  def this(options: ClientConfiguration) = this()
}
