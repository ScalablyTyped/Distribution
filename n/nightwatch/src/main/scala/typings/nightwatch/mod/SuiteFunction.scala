package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuiteFunction extends StObject {
  
  def apply(title: String): this.type = js.native
  def apply(title: String, fn: js.ThisFunction0[/* this */ DescribeInstance, Unit]): this.type = js.native
  
  def only(title: String): this.type = js.native
  def only(title: String, fn: js.ThisFunction0[/* this */ DescribeInstance, Unit]): this.type = js.native
  @JSName("only")
  var only_Original: ExclusiveSuiteFunction = js.native
  
  def skip(title: String): this.type | Unit = js.native
  def skip(title: String, fn: js.ThisFunction0[/* this */ DescribeInstance, Unit]): this.type | Unit = js.native
  @JSName("skip")
  var skip_Original: PendingSuiteFunction = js.native
}
