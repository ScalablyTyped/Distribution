package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestTargetsForShard extends StObject {
  
  /**
    * Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, "package
    * com.my.packages" "class com.my.package.MyClass". The number of shard_test_targets must be greater than 0.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
}
object TestTargetsForShard {
  
  @scala.inline
  def apply(): TestTargetsForShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestTargetsForShard]
  }
  
  @scala.inline
  implicit class TestTargetsForShardMutableBuilder[Self <: TestTargetsForShard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestTargets(value: js.Array[String]): Self = StObject.set(x, "testTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTargetsUndefined: Self = StObject.set(x, "testTargets", js.undefined)
    
    @scala.inline
    def setTestTargetsVarargs(value: String*): Self = StObject.set(x, "testTargets", js.Array(value :_*))
  }
}
